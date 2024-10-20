/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

public final class ato
implements SeekBar.OnSeekBarChangeListener {
    final SeekBarPreference a;

    public ato(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    public final void onProgressChanged(SeekBar object, int n2, boolean bl2) {
        if (bl2) {
            SeekBarPreference seekBarPreference = this.a;
            if (seekBarPreference.f || !seekBarPreference.c) {
                seekBarPreference.a((SeekBar)object);
                return;
            }
        }
        object = this.a;
        ((SeekBarPreference)object).b(n2 + ((SeekBarPreference)object).b);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.c = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.a;
        seekBarPreference.c = false;
        int n2 = seekBar.getProgress();
        int n3 = seekBarPreference.b;
        seekBarPreference = this.a;
        if (n2 + n3 != seekBarPreference.a) {
            seekBarPreference.a(seekBar);
        }
    }
}

