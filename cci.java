/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.os.Bundle
 */
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class cci
extends at {
    public Dialog ag;
    public DialogInterface.OnCancelListener ah;
    private Dialog ai;

    @Override
    public final Dialog a(Bundle bundle) {
        Dialog dialog = this.ag;
        bundle = dialog;
        if (dialog == null) {
            this.b = false;
            if (this.ai == null) {
                bundle = this.getContext();
                kl.at(bundle);
                this.ai = new AlertDialog.Builder((Context)bundle).create();
            }
            bundle = this.ai;
        }
        return bundle;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ah;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

