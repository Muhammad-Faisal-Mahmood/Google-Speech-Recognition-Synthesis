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
import com.android.car.ui.FocusArea;
import com.android.car.ui.baselayout.Insets;
import com.android.car.ui.preference.CarUiMultiSelectListPreference;
import com.android.car.ui.recyclerview.CarUiRecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class bkq
extends be
implements bju {
    public Set a;
    public boolean b;
    private CarUiMultiSelectListPreference c;

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
        if (this.c.callChangeListener(this.a)) {
            this.c.setValues(this.a);
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
        if (!this.b) {
            this.c();
        }
    }

    @Override
    public final void onViewCreated(View object, Bundle object2) {
        object = (CarUiRecyclerView)bnv.i((View)object, 2131427717);
        this.b = this.getResources().getBoolean(2131034125);
        object2 = this.l;
        if (object2 != null) {
            object2 = object2.getString("key");
            CharSequence[] charSequenceArray = (CharSequence[])this.getTargetFragment();
            if (object2 != null) {
                if (charSequenceArray != null) {
                    if ((object2 = charSequenceArray.aW((CharSequence)object2)) instanceof CarUiMultiSelectListPreference) {
                        this.c = (CarUiMultiSelectListPreference)object2;
                        object.setClipToPadding(false);
                        this.a = new HashSet(this.c.getValues());
                        charSequenceArray = this.c.getEntries();
                        CharSequence[] charSequenceArray2 = this.c.getEntryValues();
                        if (charSequenceArray != null && charSequenceArray2 != null) {
                            int n2 = charSequenceArray2.length;
                            if (charSequenceArray.length == n2) {
                                ArrayList<bla> arrayList = new ArrayList<bla>();
                                boolean[] blArray = this.c.getSelectedItems();
                                for (int i2 = 0; i2 < charSequenceArray.length; ++i2) {
                                    object2 = charSequenceArray[i2].toString();
                                    String string = charSequenceArray2[i2].toString();
                                    bla bla2 = new bla(bkx.c);
                                    bla2.b((CharSequence)object2);
                                    bla2.a(blArray[i2]);
                                    bla2.h = new bkp(this, string);
                                    arrayList.add(bla2);
                                }
                                object.setAdapter(new bli(arrayList));
                                return;
                            }
                            throw new IllegalStateException("MultiSelectListPreference entries array length does not match entryValues array length.");
                        }
                        throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
                    }
                    throw new IllegalStateException("Cannot use MultiSelectListPreferenceFragment with a preference that is not of type CarUiMultiSelectListPreference");
                }
                throw new IllegalStateException("Target fragment must be registered before displaying MultiSelectListPreference screen.");
            }
            throw new IllegalStateException("MultiSelectListPreference key not found in Fragment arguments");
        }
        throw new IllegalStateException("Preference arguments cannot be null");
    }
}

