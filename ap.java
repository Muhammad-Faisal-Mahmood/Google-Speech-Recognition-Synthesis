/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
import android.app.Dialog;
import android.content.DialogInterface;

final class ap
implements DialogInterface.OnCancelListener {
    final at a;

    public ap(at at2) {
        this.a = at2;
    }

    public final void onCancel(DialogInterface object) {
        object = this.a;
        Dialog dialog = ((at)object).c;
        if (dialog != null) {
            ((at)object).onCancel((DialogInterface)dialog);
        }
    }
}

