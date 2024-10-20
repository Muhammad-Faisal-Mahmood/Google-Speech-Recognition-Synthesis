/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

public abstract class ata
extends be
implements ati,
atg,
ath,
asa {
    public atj a;
    private boolean ag;
    private boolean ah;
    private int ai = 2131624104;
    private final Handler aj;
    private final Runnable ak;
    public RecyclerView b;
    public Runnable c;
    private final asv d = new asv(this);

    public ata() {
        this.aj = new asu(this, Looper.getMainLooper());
        this.ak = new akt(this, 8, null);
    }

    @Override
    public void B(Preference object) {
        block7: {
            Object object2;
            block11: {
                block9: {
                    block10: {
                        block8: {
                            object2 = this;
                            boolean bl2 = false;
                            while (!bl2 && object2 != null) {
                                if (object2 instanceof asw) {
                                    bl2 = ((asw)object2).a();
                                }
                                object2 = ((be)object2).D;
                            }
                            boolean bl3 = bl2;
                            if (!bl2) {
                                bl3 = bl2;
                                if (this.getContext() instanceof asw) {
                                    bl3 = ((asw)this.getContext()).a();
                                }
                            }
                            if (bl3 || this.getActivity() instanceof asw && ((asw)((Object)this.getActivity())).a() || this.getParentFragmentManager().e("androidx.preference.PreferenceFragment.DIALOG") != null) break block7;
                            if (!(object instanceof EditTextPreference)) break block8;
                            object2 = ((Preference)object).getKey();
                            object = new ase();
                            Bundle bundle = new Bundle(1);
                            bundle.putString("key", (String)object2);
                            ((be)object).setArguments(bundle);
                            break block9;
                        }
                        if (!(object instanceof ListPreference)) break block10;
                        String string = ((Preference)object).getKey();
                        object = new asi();
                        object2 = new Bundle(1);
                        object2.putString("key", string);
                        ((be)object).setArguments((Bundle)object2);
                        break block9;
                    }
                    if (!(object instanceof MultiSelectListPreference)) break block11;
                    String string = ((Preference)object).getKey();
                    object = new asl();
                    object2 = new Bundle(1);
                    object2.putString("key", string);
                    ((be)object).setArguments((Bundle)object2);
                }
                ((be)object).setTargetFragment(this, 0);
                ((at)object).e(this.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
                return;
            }
            object2 = new StringBuilder("Cannot display dialog for an unknown Preference type: ");
            ((StringBuilder)object2).append(object.getClass().getSimpleName());
            ((StringBuilder)object2).append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
    }

    public final void C() {
        if (this.a != null) {
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    public void D(PreferenceScreen preferenceScreen) {
        if (preferenceScreen != null) {
            atj atj2 = this.a;
            PreferenceScreen preferenceScreen2 = atj2.b;
            if (preferenceScreen != preferenceScreen2) {
                if (preferenceScreen2 != null) {
                    ((Preference)preferenceScreen2).onDetached();
                }
                atj2.b = preferenceScreen;
                this.ag = true;
                if (this.ah && !this.aj.hasMessages(1)) {
                    this.aj.obtainMessage(1).sendToTarget();
                }
            }
        }
    }

    public final void E(int n2, String string) {
        PreferenceScreen preferenceScreen;
        this.C();
        Preference preference = preferenceScreen = this.a.e(this.requireContext(), n2, null);
        if (string != null && !((preference = preferenceScreen.b(string)) instanceof PreferenceScreen)) {
            throw new IllegalArgumentException(a.aj(string, "Preference object with key ", " is not a PreferenceScreen"));
        }
        this.D((PreferenceScreen)preference);
    }

    @Override
    public boolean F(Preference object) {
        if (((Preference)object).getFragment() != null) {
            Object object2 = this;
            boolean bl2 = false;
            while (!bl2 && object2 != null) {
                if (object2 instanceof asx) {
                    bl2 = ((asx)object2).a();
                }
                object2 = ((be)object2).D;
            }
            boolean bl3 = bl2;
            if (!bl2) {
                bl3 = bl2;
                if (this.getContext() instanceof asx) {
                    bl3 = ((asx)this.getContext()).a();
                }
            }
            if (!(bl3 || this.getActivity() instanceof asx && ((asx)((Object)this.getActivity())).a())) {
                Log.w((String)"PreferenceFragment", (String)"onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                by by2 = this.getParentFragmentManager();
                object2 = ((Preference)object).getExtras();
                bl bl4 = by2.g();
                this.requireActivity().getClassLoader();
                object = bl4.b(((Preference)object).getFragment());
                ((be)object).setArguments((Bundle)object2);
                ((be)object).setTargetFragment(this, 0);
                object2 = new y(by2);
                ((ce)object2).r(((View)this.requireView().getParent()).getId(), (be)object);
                ((ce)object2).n();
                ((ce)object2).h();
            }
            return true;
        }
        return false;
    }

    public abstract void G(String var1);

    @Override
    public final void H() {
        boolean bl2 = false;
        be be2 = this;
        while (!bl2 && be2 != null) {
            if (be2 instanceof asy) {
                bl2 = ((asy)((Object)be2)).a();
            }
            be2 = be2.D;
        }
        boolean bl3 = bl2;
        if (!bl2) {
            bl3 = bl2;
            if (this.getContext() instanceof asy) {
                bl3 = ((asy)this.getContext()).a();
            }
        }
        if (!bl3 && this.getActivity() instanceof asy) {
            ((asy)((Object)this.getActivity())).a();
        }
    }

    @Override
    public final Preference aW(CharSequence charSequence) {
        atj atj2 = this.a;
        if (atj2 == null) {
            return null;
        }
        return atj2.d(charSequence);
    }

    public RecyclerView c(LayoutInflater object, ViewGroup viewGroup, Bundle object2) {
        if (this.requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (object2 = (RecyclerView)viewGroup.findViewById(2131427823)) != null) {
            return object2;
        }
        object = (RecyclerView)object.inflate(2131624106, viewGroup, false);
        this.requireContext();
        ((RecyclerView)object).ac(new LinearLayoutManager());
        ((RecyclerView)object).aa(new atl((RecyclerView)object));
        return object;
    }

    public final PreferenceScreen e() {
        atj atj2 = this.a;
        if (atj2 == null) {
            return null;
        }
        return atj2.b;
    }

    final void f() {
        PreferenceScreen preferenceScreen = this.e();
        if (preferenceScreen != null) {
            this.b.ab(new ate(preferenceScreen));
            ((Preference)preferenceScreen).onAttached();
        }
    }

    @Override
    public void onCreate(Bundle object) {
        int n2;
        super.onCreate((Bundle)object);
        object = new TypedValue();
        this.requireContext().getTheme().resolveAttribute(2130969732, (TypedValue)object, true);
        int n3 = n2 = object.resourceId;
        if (n2 == 0) {
            n3 = 2132083208;
        }
        this.requireContext().getTheme().applyStyle(n3, false);
        object = new atj(this.requireContext());
        this.a = object;
        object.e = this;
        object = this.l;
        object = object != null ? object.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null;
        this.G((String)object);
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        TypedArray typedArray = this.requireContext().obtainStyledAttributes(null, atn.h, 2130969726, 0);
        this.ai = typedArray.getResourceId(0, this.ai);
        Drawable drawable = typedArray.getDrawable(1);
        int n2 = typedArray.getDimensionPixelSize(2, -1);
        boolean bl2 = typedArray.getBoolean(3, true);
        typedArray.recycle();
        typedArray = layoutInflater.cloneInContext(this.requireContext());
        layoutInflater = typedArray.inflate(this.ai, viewGroup, false);
        viewGroup = layoutInflater.findViewById(16908351);
        if (viewGroup instanceof ViewGroup) {
            if ((object = this.c((LayoutInflater)typedArray, viewGroup, (Bundle)object)) != null) {
                this.b = object;
                ((RecyclerView)object).t(this.d);
                object = this.d;
                ((asv)object).b = drawable != null ? drawable.getIntrinsicHeight() : 0;
                ((asv)object).a = drawable;
                ((asv)object).d.b.M();
                if (n2 != -1) {
                    object = this.d;
                    ((asv)object).b = n2;
                    ((asv)object).d.b.M();
                }
                this.d.c = bl2;
                if (this.b.getParent() == null) {
                    viewGroup.addView((View)this.b);
                }
                this.aj.post(this.ak);
                return layoutInflater;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override
    public void onDestroyView() {
        this.aj.removeCallbacks(this.ak);
        this.aj.removeMessages(1);
        if (this.ag) {
            this.b.ab(null);
            PreferenceScreen preferenceScreen = this.e();
            if (preferenceScreen != null) {
                ((Preference)preferenceScreen).onDetached();
            }
        }
        this.b = null;
        super.onDestroyView();
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.e();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        atj atj2 = this.a;
        atj2.c = this;
        atj2.d = this;
    }

    @Override
    public void onStop() {
        super.onStop();
        atj atj2 = this.a;
        atj2.c = null;
        atj2.d = null;
    }

    @Override
    public void onViewCreated(View object, Bundle object2) {
        if (object2 != null && (object = object2.getBundle("android:preferences")) != null && (object2 = this.e()) != null) {
            ((Preference)object2).restoreHierarchyState((Bundle)object);
        }
        if (this.ag) {
            this.f();
            object = this.c;
            if (object != null) {
                object.run();
                this.c = null;
            }
        }
        this.ah = true;
    }
}

