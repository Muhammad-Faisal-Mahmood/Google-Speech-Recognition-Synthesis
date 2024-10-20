/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.drawable.BitmapDrawable
 *  android.os.Bundle
 */
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import androidx.preference.DialogPreference;

public abstract class bkr
extends bkk
implements DialogInterface.OnClickListener {
    private DialogPreference an;

    public final DialogPreference F() {
        if (this.an == null) {
            String string = this.l.getString("key");
            this.an = (DialogPreference)((asa)((Object)this.getTargetFragment())).aW(string);
        }
        return this.an;
    }

    @Override
    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        Object object2 = this.getTargetFragment();
        if (object2 instanceof asa) {
            object2 = (asa)object2;
            String string = this.l.getString("key");
            if (object == null) {
                object = (DialogPreference)object2.aW(string);
                this.an = object;
                this.ag = ((DialogPreference)object).getDialogTitle();
                this.ah = this.an.getPositiveButtonText();
                this.ai = this.an.getNegativeButtonText();
                this.aj = this.an.getDialogMessage();
                this.ak = this.an.getDialogLayoutResource();
                string = this.an.getDialogIcon();
                if (string != null && !(string instanceof BitmapDrawable)) {
                    object = Bitmap.createBitmap((int)string.getIntrinsicWidth(), (int)string.getIntrinsicHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
                    object2 = new Canvas((Bitmap)object);
                    string.setBounds(0, 0, object2.getWidth(), object2.getHeight());
                    string.draw((Canvas)object2);
                    this.al = new BitmapDrawable(this.getResources(), (Bitmap)object);
                    return;
                }
                this.al = (BitmapDrawable)string;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }
}

