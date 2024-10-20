/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.car.drivingstate.CarUxRestrictions
 *  android.widget.EditText
 */
import android.car.drivingstate.CarUxRestrictions;
import android.widget.EditText;

final class bmz
implements bny {
    final bna a;

    public bmz(bna bna2) {
        this.a = bna2;
    }

    @Override
    public final void a(CarUxRestrictions object) {
        if ((object.getActiveRestrictions() & 8) != 0) {
            object = this.a;
            object.m = true;
            EditText editText = object.k;
            if (editText != null) {
                editText.setHint((CharSequence)editText.getContext().getString(2132017226));
                object.k.setEnabled(false);
                return;
            }
        } else {
            bna bna2 = this.a;
            bna2.m = false;
            object = bna2.k;
            if (object != null) {
                object.setHint(bna2.l);
                bna2.k.setEnabled(true);
            }
        }
    }
}

