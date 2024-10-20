/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.preference.ListPreference;

public class asi
extends ast {
    public int ag;
    private CharSequence[] ah;
    private CharSequence[] ai;

    private final ListPreference H() {
        return (ListPreference)this.G();
    }

    @Override
    public final void C(boolean bl2) {
        int n2;
        if (bl2 && (n2 = this.ag) >= 0) {
            String string = this.ai[n2].toString();
            ListPreference listPreference = this.H();
            if (listPreference.callChangeListener(string)) {
                listPreference.setValue(string);
            }
        }
    }

    @Override
    protected final void aT(dm dm2) {
        CharSequence[] charSequenceArray = this.ah;
        int n2 = this.ag;
        fco fco2 = new fco(this, 1);
        di di2 = dm2.a;
        di2.o = charSequenceArray;
        di2.q = fco2;
        di2.v = n2;
        di2.u = true;
        dm2.f(null, null);
    }

    @Override
    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        if (object == null) {
            object = this.H();
            if (((ListPreference)object).getEntries() != null && ((ListPreference)object).getEntryValues() != null) {
                this.ag = ((ListPreference)object).findIndexOfValue(((ListPreference)object).getValue());
                this.ah = ((ListPreference)object).getEntries();
                this.ai = ((ListPreference)object).getEntryValues();
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ag = object.getInt("ListPreferenceDialogFragment.index", 0);
        this.ah = object.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.ai = object.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ag);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ah);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.ai);
    }
}

