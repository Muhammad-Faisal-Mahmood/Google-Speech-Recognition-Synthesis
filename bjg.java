/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnDismissListener
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 */
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

public final class bjg {
    public final AlertDialog.Builder a;
    public AlertDialog b;
    public final Context c;
    public ViewGroup d;
    public final View.OnApplyWindowInsetsListener e = new bke(1);
    public final DialogInterface.OnDismissListener f = new bjf(this);

    public bjg(Context context) {
        this.a = new AlertDialog.Builder(context, 0);
        InputMethodManager inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
        this.c = context;
    }
}

