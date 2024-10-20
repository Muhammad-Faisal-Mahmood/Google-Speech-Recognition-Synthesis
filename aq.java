/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
import android.app.Dialog;
import android.content.DialogInterface;

final class aq
implements DialogInterface.OnDismissListener {
    final at a;

    public aq(at at2) {
        this.a = at2;
    }

    public final void onDismiss(DialogInterface object) {
        object = this.a;
        Dialog dialog = ((at)object).c;
        if (dialog != null) {
            ((at)object).onDismiss((DialogInterface)dialog);
        }
    }
}

