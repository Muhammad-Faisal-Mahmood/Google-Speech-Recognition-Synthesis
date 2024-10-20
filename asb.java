/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 */
import android.view.View;
import android.widget.AdapterView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

public final class asb
implements AdapterView.OnItemSelectedListener {
    final Object a;
    private final int b;

    public asb(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onItemSelected(AdapterView object, View view, int n2, long l2) {
        if (this.b != 0) {
            if (n2 != -1 && (object = ((jw)this.a).e) != null) {
                ((jc)((Object)object)).a = false;
            }
            return;
        }
        if (n2 >= 0 && !((String)(object = ((ListPreference)this.a).getEntryValues()[n2].toString())).equals(((ListPreference)this.a).getValue()) && ((Preference)this.a).callChangeListener(object)) {
            ((ListPreference)this.a).setValue((String)object);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

