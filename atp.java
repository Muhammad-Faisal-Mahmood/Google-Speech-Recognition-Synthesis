/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.preference.SeekBarPreference;

public final class atp
implements View.OnKeyListener {
    final SeekBarPreference a;

    public atp(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    public final boolean onKey(View object, int n2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            object = this.a;
            if ((object.e || n2 != 21 && n2 != 22) && n2 != 23 && n2 != 66) {
                object = object.d;
                if (object == null) {
                    Log.e((String)"SeekBarPreference", (String)"SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return object.onKeyDown(n2, keyEvent);
            }
        }
        return false;
    }
}

