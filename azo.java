/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

final class azo
extends Drawable.ConstantState {
    int a;
    azn b;
    ColorStateList c = null;
    PorterDuff.Mode d = azq.a;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public azo() {
        this.b = new azn();
    }

    public azo(azo azo2) {
        if (azo2 != null) {
            this.a = azo2.a;
            this.b = new azn(azo2.b);
            Paint paint = azo2.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            if ((paint = azo2.b.b) != null) {
                this.b.b = new Paint(paint);
            }
            this.c = azo2.c;
            this.d = azo2.d;
            this.e = azo2.e;
        }
    }

    public final void a(int n2, int n3) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        azn azn2 = this.b;
        azn2.a(azn2.d, azn.a, canvas, n2, n3);
    }

    public final boolean b() {
        azn azn2 = this.b;
        if (azn2.k == null) {
            azn2.k = ((aay)azn2.d).g();
        }
        return azn2.k;
    }

    public int getChangingConfigurations() {
        return this.a;
    }

    public final Drawable newDrawable() {
        return new azq(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new azq(this);
    }
}

