/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
import android.content.DialogInterface;

public final class bjf
implements DialogInterface.OnDismissListener {
    public final bjg a;

    public /* synthetic */ bjf(bjg bjg2) {
        this.a = bjg2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface = this.a.d;
        if (dialogInterface != null) {
            dialogInterface.setOnApplyWindowInsetsListener(null);
        }
    }
}

