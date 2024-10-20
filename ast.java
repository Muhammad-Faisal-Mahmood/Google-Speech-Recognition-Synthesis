/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.preference.DialogPreference;

public abstract class ast
extends at
implements DialogInterface.OnClickListener {
    private DialogPreference ag;
    private CharSequence ah;
    private CharSequence ai;
    private CharSequence aj;
    public int ak;
    private CharSequence al;
    private int am;
    private BitmapDrawable an;

    protected void B(View view) {
        if ((view = view.findViewById(16908299)) != null) {
            int n2;
            CharSequence charSequence = this.al;
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

    public abstract void C(boolean var1);

    protected void D() {
    }

    protected boolean F() {
        return false;
    }

    public final DialogPreference G() {
        if (this.ag == null) {
            String string = this.requireArguments().getString("key");
            this.ag = (DialogPreference)((asa)((Object)this.getTargetFragment())).aW(string);
        }
        return this.ag;
    }

    @Override
    public Dialog a(Bundle object) {
        LayoutInflater layoutInflater;
        this.ak = -2;
        dm dm2 = new dm(this.requireContext());
        dm2.g(this.ah);
        dm2.c((Drawable)this.an);
        dm2.f(this.ai, this);
        dm2.e(this.aj, this);
        this.requireContext();
        int n2 = this.am;
        object = null;
        if (n2 != 0) {
            layoutInflater = this.W;
            object = layoutInflater;
            if (layoutInflater == null) {
                object = this.l(null);
            }
            object = object.inflate(n2, null);
        }
        if (object != null) {
            this.B((View)object);
            dm2.a.r = object;
        } else {
            dm2.d(this.al);
        }
        this.aT(dm2);
        object = dm2.b();
        if (this.F()) {
            layoutInflater = object.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                sk$$ExternalSyntheticApiModelOutline1.m(sk$$ExternalSyntheticApiModelOutline1.m(layoutInflater.getDecorView()), sk$$ExternalSyntheticApiModelOutline1.m());
            } else {
                this.D();
            }
        }
        return object;
    }

    protected void aT(dm dm2) {
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        this.ak = n2;
    }

    @Override
    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        Object object2 = this.getTargetFragment();
        if (object2 instanceof asa) {
            object2 = (asa)object2;
            String string = this.requireArguments().getString("key");
            if (object == null) {
                object = (DialogPreference)object2.aW(string);
                this.ag = object;
                this.ah = ((DialogPreference)object).getDialogTitle();
                this.ai = this.ag.getPositiveButtonText();
                this.aj = this.ag.getNegativeButtonText();
                this.al = this.ag.getDialogMessage();
                this.am = this.ag.getDialogLayoutResource();
                string = this.ag.getDialogIcon();
                if (string != null && !(string instanceof BitmapDrawable)) {
                    object = Bitmap.createBitmap((int)string.getIntrinsicWidth(), (int)string.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                    object2 = new Canvas((Bitmap)object);
                    string.setBounds(0, 0, object2.getWidth(), object2.getHeight());
                    string.draw((Canvas)object2);
                    this.an = new BitmapDrawable(this.getResources(), (Bitmap)object);
                    return;
                }
                this.an = (BitmapDrawable)string;
                return;
            }
            this.ah = object.getCharSequence("PreferenceDialogFragment.title");
            this.ai = object.getCharSequence("PreferenceDialogFragment.positiveText");
            this.aj = object.getCharSequence("PreferenceDialogFragment.negativeText");
            this.al = object.getCharSequence("PreferenceDialogFragment.message");
            this.am = object.getInt("PreferenceDialogFragment.layout", 0);
            if ((object = (Bitmap)object.getParcelable("PreferenceDialogFragment.icon")) != null) {
                this.an = new BitmapDrawable(this.getResources(), (Bitmap)object);
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        boolean bl2 = this.ak == -1;
        this.C(bl2);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ah);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.ai);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.aj);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.al);
        bundle.putInt("PreferenceDialogFragment.layout", this.am);
        BitmapDrawable bitmapDrawable = this.an;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", (Parcelable)bitmapDrawable.getBitmap());
        }
    }
}

