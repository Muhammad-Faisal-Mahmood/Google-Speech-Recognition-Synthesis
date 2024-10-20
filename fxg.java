/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.ColorFilter
 *  android.graphics.Paint$Style
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class fxg
extends Drawable.ConstantState {
    public fxm a;
    public fve b;
    ColorFilter c;
    public ColorStateList d = null;
    ColorStateList e = null;
    ColorStateList f = null;
    ColorStateList g = null;
    PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    Rect i = null;
    float j = 1.0f;
    public float k = 1.0f;
    float l;
    int m = 255;
    public float n = 0.0f;
    float o = 0.0f;
    float p = 0.0f;
    int q = 0;
    int r = 0;
    int s = 0;
    int t = 0;
    boolean u = false;
    Paint.Style v = Paint.Style.FILL_AND_STROKE;
    izk w;

    public fxg(fxg fxg2) {
        this.a = fxg2.a;
        this.w = fxg2.w;
        this.b = fxg2.b;
        this.l = fxg2.l;
        this.c = fxg2.c;
        this.d = fxg2.d;
        this.e = fxg2.e;
        this.h = fxg2.h;
        this.g = fxg2.g;
        this.m = fxg2.m;
        this.j = fxg2.j;
        this.s = fxg2.s;
        int n2 = fxg2.q;
        this.q = 0;
        boolean bl2 = fxg2.u;
        this.u = false;
        this.k = fxg2.k;
        this.n = fxg2.n;
        this.o = fxg2.o;
        float f2 = fxg2.p;
        this.p = 0.0f;
        this.r = fxg2.r;
        n2 = fxg2.t;
        this.t = 0;
        ColorStateList colorStateList = fxg2.f;
        this.f = null;
        this.v = fxg2.v;
        fxg2 = fxg2.i;
        if (fxg2 != null) {
            this.i = new Rect((Rect)fxg2);
        }
    }

    public fxg(fxm fxm2) {
        this.a = fxm2;
        this.b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        fxi fxi2 = new fxi(this);
        fxi2.e = true;
        fxi2.f = true;
        return fxi2;
    }
}

