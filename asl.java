/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class asl
extends ast {
    final Set ag = new HashSet();
    boolean ah;
    CharSequence[] ai;
    CharSequence[] aj;

    private final MultiSelectListPreference H() {
        return (MultiSelectListPreference)this.G();
    }

    @Override
    public final void C(boolean bl2) {
        MultiSelectListPreference multiSelectListPreference;
        if (bl2 && this.ah && (multiSelectListPreference = this.H()).callChangeListener(this.ag)) {
            multiSelectListPreference.setValues(this.ag);
        }
        this.ah = false;
    }

    @Override
    protected final void aT(dm object) {
        int n2 = this.aj.length;
        boolean[] blArray = new boolean[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            blArray[i2] = this.ag.contains(this.aj[i2].toString());
        }
        CharSequence[] charSequenceArray = this.ai;
        ask ask2 = new ask(this);
        object = ((dm)object).a;
        ((di)object).o = charSequenceArray;
        ((di)object).w = ask2;
        ((di)object).s = blArray;
        ((di)object).t = true;
    }

    @Override
    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        if (object == null) {
            object = this.H();
            if (((MultiSelectListPreference)object).getEntries() != null && ((MultiSelectListPreference)object).getEntryValues() != null) {
                this.ag.clear();
                this.ag.addAll(((MultiSelectListPreference)object).getValues());
                this.ah = false;
                this.ai = ((MultiSelectListPreference)object).getEntries();
                this.aj = ((MultiSelectListPreference)object).getEntryValues();
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.ag.clear();
        this.ag.addAll(object.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.ah = object.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.ai = object.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.aj = object.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.ag));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ah);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.ai);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.aj);
    }
}

