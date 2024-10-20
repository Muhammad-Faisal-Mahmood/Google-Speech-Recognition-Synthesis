/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.TextView
 */
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public abstract class bkk
extends at
implements DialogInterface.OnClickListener {
    protected CharSequence ag;
    protected CharSequence ah;
    protected CharSequence ai;
    protected CharSequence aj;
    protected int ak;
    protected BitmapDrawable al;
    public int am;

    protected void B(View view) {
        if ((view = bnv.h(view, 16908299)) != null) {
            int n2;
            CharSequence charSequence = this.aj;
            if (!TextUtils.isEmpty((CharSequence)charSequence)) {
                int n3;
                boolean bl2 = view instanceof TextView;
                n2 = n3 = 0;
                if (bl2) {
                    ((TextView)view).setText(charSequence);
                    n2 = n3;
                }
            } else {
                n2 = 8;
            }
            if (view.getVisibility() != n2) {
                view.setVisibility(n2);
            }
        }
    }

    protected abstract void C(boolean var1);

    protected boolean D() {
        return false;
    }

    protected void E() {
    }

    @Override
    public final Dialog a(Bundle bundle) {
        bh bh2 = this.getActivity();
        this.am = -2;
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)bh2).setTitle(this.ag).setIcon((Drawable)this.al).setPositiveButton(this.ah, (DialogInterface.OnClickListener)this).setNegativeButton(this.ai, (DialogInterface.OnClickListener)this);
        int n2 = this.ak;
        bundle = null;
        if (n2 != 0) {
            bundle = LayoutInflater.from((Context)bh2).inflate(n2, null);
        }
        if (bundle != null) {
            this.B((View)bundle);
            builder.setView((View)bundle);
        } else {
            builder.setMessage(this.aj);
        }
        this.E();
        bundle = builder.create();
        if (this.D()) {
            bundle.setOnShowListener((DialogInterface.OnShowListener)new bkj((Dialog)bundle));
        }
        return bundle;
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        this.am = n2;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.ag = bundle.getCharSequence("CarUiDialogFragment.title");
            this.ah = bundle.getCharSequence("CarUiDialogFragment.positiveText");
            this.ai = bundle.getCharSequence("CarUiDialogFragment.negativeText");
            this.aj = bundle.getCharSequence("CarUiDialogFragment.message");
            this.ak = bundle.getInt("CarUiDialogFragment.layout", 0);
            if ((bundle = (Bitmap)bundle.getParcelable("CarUiDialogFragment.icon")) != null) {
                this.al = new BitmapDrawable(this.getResources(), (Bitmap)bundle);
            }
        }
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        boolean bl2 = this.am == -1;
        this.C(bl2);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("CarUiDialogFragment.title", this.ag);
        bundle.putCharSequence("CarUiDialogFragment.positiveText", this.ah);
        bundle.putCharSequence("CarUiDialogFragment.negativeText", this.ai);
        bundle.putCharSequence("CarUiDialogFragment.message", this.aj);
        bundle.putInt("CarUiDialogFragment.layout", this.ak);
        BitmapDrawable bitmapDrawable = this.al;
        if (bitmapDrawable != null) {
            bundle.putParcelable("CarUiDialogFragment.icon", (Parcelable)bitmapDrawable.getBitmap());
        }
    }
}

