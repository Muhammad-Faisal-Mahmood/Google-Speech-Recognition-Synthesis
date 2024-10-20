/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  android.util.Pair
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.preference.DialogPreference;
import androidx.preference.DropDownPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import com.android.car.ui.FocusArea;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.core.BaseLayoutController;
import com.android.car.ui.preference.CarUiDropDownPreference;
import com.android.car.ui.preference.CarUiEditTextPreference;
import com.android.car.ui.preference.CarUiListPreference;
import com.android.car.ui.preference.CarUiMultiSelectListPreference;
import com.android.car.ui.preference.CarUiPreference;
import com.android.car.ui.preference.CarUiSeekBarDialogPreference;
import com.android.car.ui.preference.CarUiSwitchPreference;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class bku
extends ata
implements bju {
    private static final List ai = Arrays.asList(new Pair(DropDownPreference.class, CarUiDropDownPreference.class), new Pair(ListPreference.class, CarUiListPreference.class), new Pair(MultiSelectListPreference.class, CarUiMultiSelectListPreference.class), new Pair(EditTextPreference.class, CarUiEditTextPreference.class), new Pair(SwitchPreference.class, CarUiSwitchPreference.class), new Pair(Preference.class, CarUiPreference.class));
    public ViewParent ag;
    public int ah;
    private String aj;
    public CarUiRecyclerView d;

    private static Preference K(Preference object) {
        Object object2 = object.getClass();
        Object object3 = ai.iterator();
        while (object3.hasNext()) {
            Object object4 = (Pair)object3.next();
            Object object5 = (Class)((Pair)object4).first;
            object4 = (Class)((Pair)object4).second;
            if (!((Class)object5).isAssignableFrom((Class<?>)object2)) continue;
            if (object2 == object5) {
                try {
                    object5 = (Preference)((Class)object4).getDeclaredConstructor(Context.class).newInstance(((Preference)object).getContext());
                    ((Preference)object5).setTitle(((Preference)object).getTitle());
                    ((Preference)object5).setOnPreferenceClickListener(((Preference)object).getOnPreferenceClickListener());
                    ((Preference)object5).setOnPreferenceChangeListener(((Preference)object).getOnPreferenceChangeListener());
                    ((Preference)object5).setIcon(((Preference)object).getIcon());
                    ((Preference)object5).setFragment(((Preference)object).getFragment());
                    ((Preference)object5).setIntent(((Preference)object).getIntent());
                    ((Preference)object5).setKey(((Preference)object).getKey());
                    ((Preference)object5).setOrder(((Preference)object).getOrder());
                    ((Preference)object5).setSelectable(((Preference)object).isSelectable());
                    ((Preference)object5).setPersistent(((Preference)object).isPersistent());
                    ((Preference)object5).setIconSpaceReserved(((Preference)object).isIconSpaceReserved());
                    ((Preference)object5).setWidgetLayoutResource(((Preference)object).getWidgetLayoutResource());
                    ((Preference)object5).setPreferenceDataStore(((Preference)object).getPreferenceDataStore());
                    ((Preference)object5).setVisible(((Preference)object).isVisible());
                    ((Preference)object5).setLayoutResource(((Preference)object).getLayoutResource());
                    ((Preference)object5).setCopyingEnabled(((Preference)object).isCopyingEnabled());
                    bku.M((Preference)object5, bku.O((Preference)object));
                    bku.L((Preference)object5, bku.N((Preference)object));
                    if (!(object5 instanceof bkw)) {
                        ((Preference)object5).setShouldDisableView(((Preference)object).getShouldDisableView());
                    }
                    if (((Preference)object).getSummaryProvider() != null) {
                        ((Preference)object5).setSummaryProvider(((Preference)object).getSummaryProvider());
                    } else {
                        ((Preference)object5).setSummary(((Preference)object).getSummary());
                    }
                    if (((Preference)object).peekExtras() != null) {
                        ((Preference)object5).getExtras().putAll(((Preference)object).peekExtras());
                    }
                    if (object instanceof DialogPreference) {
                        object2 = (DialogPreference)object;
                        object3 = (DialogPreference)object5;
                        ((DialogPreference)object3).setDialogTitle(((DialogPreference)object2).getDialogTitle());
                        ((DialogPreference)object3).setDialogIcon(((DialogPreference)object2).getDialogIcon());
                        ((DialogPreference)object3).setDialogMessage(((DialogPreference)object2).getDialogMessage());
                        ((DialogPreference)object3).setDialogLayoutResource(((DialogPreference)object2).getDialogLayoutResource());
                        ((DialogPreference)object3).setNegativeButtonText(((DialogPreference)object2).getNegativeButtonText());
                        ((DialogPreference)object3).setPositiveButtonText(((DialogPreference)object2).getPositiveButtonText());
                    }
                    if (object instanceof ListPreference) {
                        object2 = (ListPreference)object;
                        object3 = (ListPreference)object5;
                        ((ListPreference)object3).setEntries(((ListPreference)object2).getEntries());
                        ((ListPreference)object3).setEntryValues(((ListPreference)object2).getEntryValues());
                        ((ListPreference)object3).setValue(((ListPreference)object2).getValue());
                    } else if (object instanceof EditTextPreference) {
                        object3 = (EditTextPreference)object;
                        ((EditTextPreference)object5).setText(((EditTextPreference)object3).getText());
                    } else if (object instanceof MultiSelectListPreference) {
                        object2 = (MultiSelectListPreference)object;
                        object3 = (MultiSelectListPreference)object5;
                        ((MultiSelectListPreference)object3).setEntries(((MultiSelectListPreference)object2).getEntries());
                        ((MultiSelectListPreference)object3).setEntryValues(((MultiSelectListPreference)object2).getEntryValues());
                        ((MultiSelectListPreference)object3).setValues(((MultiSelectListPreference)object2).getValues());
                    } else if (object instanceof TwoStatePreference) {
                        object2 = (TwoStatePreference)object;
                        object3 = (TwoStatePreference)object5;
                        ((TwoStatePreference)object3).setSummaryOn(((TwoStatePreference)object2).getSummaryOn());
                        ((TwoStatePreference)object3).setSummaryOff(((TwoStatePreference)object2).getSummaryOff());
                        if (object instanceof SwitchPreference) {
                            object3 = (SwitchPreference)object;
                            object2 = (SwitchPreference)object5;
                            ((SwitchPreference)object2).setSwitchTextOn(((SwitchPreference)object3).getSwitchTextOn());
                            ((SwitchPreference)object2).setSwitchTextOff(((SwitchPreference)object3).getSwitchTextOff());
                        }
                    }
                    return object5;
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    Throwable throwable;
                    object = String.valueOf(String.valueOf(object));
                    if (reflectiveOperationException.getCause() != null) {
                        throwable = reflectiveOperationException.getCause();
                    }
                    throw new RuntimeException("Failed to copy Preference ".concat((String)object), throwable);
                }
            }
            if (object2 == object4 || object5 == Preference.class) break;
            object5 = ((Class)object5).getSimpleName();
            object2 = ((Class)object4).getSimpleName();
            object3 = new StringBuilder("Subclass of ");
            ((StringBuilder)object3).append((String)object5);
            ((StringBuilder)object3).append(" was used, preventing us from substituting it with ");
            ((StringBuilder)object3).append((String)object2);
            Log.w((String)"CarUiPreferenceFragment", (String)((StringBuilder)object3).toString());
            break;
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void L(Preference preference, boolean bl2) {
        try {
            Field field = Preference.class.getDeclaredField("mAllowDividerAbove");
            field.setAccessible(true);
            field.set(preference, bl2);
            return;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void M(Preference preference, boolean bl2) {
        try {
            Field field = Preference.class.getDeclaredField("mAllowDividerBelow");
            field.setAccessible(true);
            field.set(preference, bl2);
            return;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return;
        }
    }

    private static boolean N(Preference preference) {
        try {
            Field field = Preference.class.getDeclaredField("mAllowDividerAbove");
            field.setAccessible(true);
            boolean bl2 = (Boolean)field.get(preference);
            return bl2;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return false;
        }
    }

    private static boolean O(Preference preference) {
        try {
            Field field = Preference.class.getDeclaredField("mAllowDividerBelow");
            field.setAccessible(true);
            boolean bl2 = (Boolean)field.get(preference);
            return bl2;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return false;
        }
    }

    @Override
    public final void B(Preference object) {
        block12: {
            block13: {
                block14: {
                    block7: {
                        String string;
                        Object object2;
                        Object object3;
                        block9: {
                            block11: {
                                block10: {
                                    block8: {
                                        if (this.getActivity() instanceof asw && ((asw)((Object)this.getActivity())).a() || this.getParentFragmentManager().e("com.android.car.ui.PreferenceFragment.DIALOG") != null) break block7;
                                        if (!(object instanceof EditTextPreference)) break block8;
                                        object3 = ((Preference)object).getKey();
                                        object2 = new bkm();
                                        string = new Bundle(1);
                                        string.putString("key", (String)object3);
                                        ((be)object2).setArguments((Bundle)string);
                                        break block9;
                                    }
                                    if (!(object instanceof ListPreference)) break block10;
                                    string = ((Preference)object).getKey();
                                    object2 = new bko();
                                    object3 = new Bundle(1);
                                    object3.putString("key", string);
                                    ((be)object2).setArguments((Bundle)object3);
                                    break block9;
                                }
                                if (!(object instanceof MultiSelectListPreference)) break block11;
                                object3 = ((Preference)object).getKey();
                                object2 = new bkq();
                                string = new Bundle(1);
                                string.putString("key", (String)object3);
                                ((be)object2).setArguments((Bundle)string);
                                break block9;
                            }
                            if (!(object instanceof CarUiSeekBarDialogPreference)) break block12;
                            object3 = ((Preference)object).getKey();
                            object2 = new bkv();
                            string = new Bundle(1);
                            string.putString("key", (String)object3);
                            ((be)object2).setArguments((Bundle)string);
                        }
                        ((be)object2).setTargetFragment(this, 0);
                        if (object2 instanceof at) {
                            ((at)object2).e(this.A, "com.android.car.ui.PreferenceFragment.DIALOG");
                            return;
                        }
                        if (this.getActivity() == null) break block13;
                        if (this.P == null) break block14;
                        string = this.getContext();
                        object3 = new y(this.getParentFragmentManager());
                        int n2 = bnv.d((Context)string, 16843493);
                        int n3 = bnv.d((Context)string, 16843494);
                        int n4 = bnv.d((Context)string, 16843495);
                        int n5 = bnv.d((Context)string, 16843496);
                        ((ce)object3).e = n2;
                        ((ce)object3).f = n3;
                        ((ce)object3).g = n4;
                        ((ce)object3).h = n5;
                        ((ce)object3).r(((ViewGroup)this.P.getParent()).getId(), (be)object2);
                        ((ce)object3).n();
                        ((ce)object3).h();
                        object2 = this.J();
                        if (object2 != null) {
                            object2.setTitle(((Preference)object).getTitle());
                            object2.setSubtitle("");
                            if (object2.isStateSet()) {
                                object2.setState(bnp.b);
                            } else {
                                object2.setNavButtonMode(bmp.a);
                            }
                            object2.setLogo(null);
                            object2.setMenuItems(null);
                            object2.setTabs(Collections.emptyList());
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Preference fragment must have a layout.");
            }
            throw new IllegalStateException("Preference fragment is not attached to an Activity.");
        }
        object = object.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder("Cannot display dialog for an unknown Preference type: ");
        stringBuilder.append((String)object);
        stringBuilder.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public final void D(PreferenceScreen object2) {
        HashMap hashMap = new HashMap();
        ArrayList<Preference> arrayList = new ArrayList<Preference>();
        ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
        arrayDeque.addFirst(object2);
        while (!arrayDeque.isEmpty()) {
            int n2;
            Preference preference = (Preference)arrayDeque.removeFirst();
            if (!(preference instanceof PreferenceGroup)) continue;
            PreferenceGroup preferenceGroup = (PreferenceGroup)preference;
            arrayList.clear();
            int n3 = 0;
            for (n2 = 0; n2 < preferenceGroup.a(); ++n2) {
                arrayList.add(preferenceGroup.c(n2));
            }
            preferenceGroup.d();
            int n4 = arrayList.size();
            for (n2 = n3; n2 < n4; ++n2) {
                Preference preference2 = (Preference)arrayList.get(n2);
                preference = bku.K(preference2);
                hashMap.put(preference, preference2.getDependency());
                preferenceGroup.g(preference);
                arrayDeque.addFirst(preference);
            }
        }
        super.D((PreferenceScreen)object2);
        for (Map.Entry entry : hashMap.entrySet()) {
            ((Preference)entry.getKey()).setDependency((String)entry.getValue());
        }
    }

    @Override
    public final boolean F(Preference preference) {
        this.aj = preference.getKey();
        if (this.ag != null) {
            View view = this.P.findFocus();
            while (view != null) {
                ViewParent viewParent = view.getParent();
                if (viewParent == this.ag) {
                    this.ah = this.d.getChildLayoutPosition(view);
                    break;
                }
                if (viewParent == null || !(viewParent instanceof View)) break;
                view = (View)viewParent;
            }
        }
        return super.F(preference);
    }

    protected final Insets I() {
        BaseLayoutController baseLayoutController = BaseLayoutController.getBaseLayoutController(this.getActivity());
        if (baseLayoutController != null) {
            return baseLayoutController.getInsets();
        }
        return null;
    }

    protected final bnq J() {
        return AmbientMode$AmbientCallback.f(this.getActivity());
    }

    @Override
    public final void a(Insets insets) {
        View view = this.requireView();
        FocusArea focusArea = (FocusArea)bnv.i(view, 2131427475);
        focusArea.c(0, insets.getTop(), 0, insets.getBottom());
        focusArea.b(0, insets.getTop(), 0, insets.getBottom());
        this.d.setPadding(0, insets.getTop(), 0, insets.getBottom());
        view.setPadding(insets.getLeft(), 0, insets.getRight(), 0);
    }

    @Override
    public final RecyclerView c(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        Object object2 = (CarUiRecyclerView)bnv.i((View)viewGroup, 2131427823);
        this.d = object2;
        object2 = object2 instanceof bkt ? ((bkt)object2).getRecyclerView() : null;
        Object object3 = object2;
        if (object2 == null) {
            object3 = super.c((LayoutInflater)object, viewGroup, bundle);
        }
        if ((object = this.d) != null) {
            object.addOnChildAttachStateChangeListener(new bks(this));
        }
        return object3;
    }

    @Override
    public void onResume() {
        super.onResume();
        Object object = this.aj;
        if (object != null) {
            object = new aks((Object)this, object, 4, null);
            if (this.b == null) {
                this.c = object;
                return;
            }
            object.run();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Insets insets = this.I();
        if (insets != null) {
            this.a(insets);
        }
    }

    @Override
    public final void onViewCreated(View object, Bundle object2) {
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.J();
        if (object != null) {
            object.setNavButtonMode(bnk.a);
            object2 = this.e();
            if (object2 != null) {
                object.setTitle(((Preference)object2).getTitle());
                return;
            }
            object.setTitle("");
        }
    }
}

