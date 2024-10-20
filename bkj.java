/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 */
import android.app.Dialog;
import android.content.DialogInterface;

public final class bkj
implements DialogInterface.OnShowListener {
    public final Dialog a;

    public /* synthetic */ bkj(Dialog dialog) {
        this.a = dialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.a.getWindow().setSoftInputMode(5);
    }
}

