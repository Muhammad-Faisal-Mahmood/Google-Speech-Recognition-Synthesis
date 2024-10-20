/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.os.Bundle
 */
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class cbl
extends DialogFragment {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    private Dialog c;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        bundle = dialog;
        if (dialog == null) {
            this.setShowsDialog(false);
            if (this.c == null) {
                bundle = this.getActivity();
                kl.at(bundle);
                this.c = new AlertDialog.Builder((Context)bundle).create();
            }
            bundle = this.c;
        }
        return bundle;
    }
}

