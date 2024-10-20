/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.widget.CompoundButton;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;

public final class atr
implements CompoundButton.OnCheckedChangeListener {
    final Object a;
    private final int b;

    public atr(TwoStatePreference twoStatePreference, int n2) {
        this.b = n2;
        this.a = twoStatePreference;
    }

    public /* synthetic */ atr(bla bla2, int n2) {
        this.b = n2;
        this.a = bla2;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    n2 = blh.q;
                    ((bla)this.a).a(bl2);
                    return;
                }
                if (!((Preference)this.a).callChangeListener(bl2)) {
                    compoundButton.setChecked(bl2 ^ true);
                    return;
                }
                ((TwoStatePreference)this.a).setChecked(bl2);
                return;
            }
            if (!((Preference)this.a).callChangeListener(bl2)) {
                compoundButton.setChecked(bl2 ^ true);
                return;
            }
            ((TwoStatePreference)this.a).setChecked(bl2);
            return;
        }
        if (!((Preference)this.a).callChangeListener(bl2)) {
            compoundButton.setChecked(bl2 ^ true);
            return;
        }
        ((TwoStatePreference)this.a).setChecked(bl2);
    }
}

