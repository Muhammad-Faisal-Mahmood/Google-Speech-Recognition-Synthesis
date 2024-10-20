/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import com.android.car.ui.FocusArea;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import java.util.ArrayList;

public final class bko
extends be
implements bju {
    public bla a;
    public int b = -1;
    public boolean c;
    private ListPreference d;

    @Override
    public final void a(Insets insets) {
        Object object = this.requireView();
        bnv.i((View)object, 2131427717).setPadding(0, insets.getTop(), 0, insets.getBottom());
        object.setPadding(insets.getLeft(), 0, insets.getRight(), 0);
        object = (FocusArea)object.findViewById(2131427475);
        if (object != null) {
            ((FocusArea)((Object)object)).c(0, insets.getTop(), 0, insets.getBottom());
            ((FocusArea)((Object)object)).b(0, insets.getTop(), 0, insets.getBottom());
        }
    }

    public final void c() {
        Object object;
        if (this.b >= 0 && (object = this.d) != null && this.d.callChangeListener(object = ((ListPreference)object).getEntryValues()[this.b].toString())) {
            this.d.setValue((String)object);
        }
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131623979, viewGroup, false);
    }

    @Override
    public final void onStart() {
        Insets insets;
        super.onStart();
        if (this.getTargetFragment() instanceof bku && (insets = ((bku)this.getTargetFragment()).I()) != null) {
            this.a(insets);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        if (!this.c) {
            this.c();
        }
    }

    @Override
    public final void onViewCreated(View object, Bundle object2) {
        object = (CarUiRecyclerView)bnv.i((View)object, 2131427717);
        this.c = this.getResources().getBoolean(2131034125);
        object.setClipToPadding(false);
        object2 = this.requireArguments().getString("key");
        Object object3 = (CharSequence[])this.getTargetFragment();
        if (object2 != null) {
            if (object3 != null) {
                if ((object2 = object3.aW((CharSequence)object2)) instanceof ListPreference) {
                    object2 = (ListPreference)object2;
                    this.d = object2;
                    object2 = ((ListPreference)object2).getEntries();
                    object3 = this.d.getEntryValues();
                    if (object2 != null && object3 != null) {
                        int n2 = ((CharSequence[])object3).length;
                        if (((Object)object2).length == n2) {
                            object3 = this.d;
                            this.b = ((ListPreference)object3).findIndexOfValue(((ListPreference)object3).getValue());
                            ArrayList<bla> arrayList = new ArrayList<bla>();
                            bli bli2 = new bli(arrayList);
                            for (int i2 = 0; i2 < ((Object)object2).length; ++i2) {
                                object3 = object2[i2].toString();
                                bla bla2 = new bla(bkx.d);
                                bla2.b((CharSequence)object3);
                                if (i2 == this.b) {
                                    bla2.a(true);
                                    this.a = bla2;
                                }
                                bla2.h = new bkn(this, bli2, arrayList);
                                arrayList.add(bla2);
                            }
                            object.setAdapter(bli2);
                            object.scrollToPosition(this.b);
                            object.post(new aks(this, object, 12));
                            return;
                        }
                        throw new IllegalStateException("ListPreference entries array length does not match entryValues array length.");
                    }
                    throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
                }
                throw new IllegalStateException("Cannot use ListPreferenceFragment with a preference that is not of type ListPreference");
            }
            throw new IllegalStateException("Target fragment must be registered before displaying ListPreference screen.");
        }
        throw new IllegalStateException("ListPreference key not found in Fragment arguments");
    }
}

