/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.LayerDrawable
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;

final class fur {
    public final fup a;
    public fxm b;
    public zk c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public boolean o = false;
    public boolean p;
    public boolean q = true;
    public LayerDrawable r;
    public int s;
    public izk t;

    public fur(fup fup2, fxm fxm2) {
        this.a = fup2;
        this.b = fxm2;
    }

    private final fxi e(boolean bl2) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            return (fxi)((LayerDrawable)((InsetDrawable)this.r.getDrawable(0)).getDrawable()).getDrawable(bl2 ^ 1);
        }
        return null;
    }

    final fxi a() {
        return this.e(false);
    }

    final void b() {
        this.o = true;
        this.a.d(this.k);
        this.a.e(this.j);
    }

    final void c(fxm fxm2) {
        this.b = fxm2;
        this.t = null;
        this.d();
    }

    public final void d() {
        Object object;
        Object object2 = this.a();
        if (object2 != null) {
            object = this.t;
            if (object != null) {
                ((fxi)object2).q((izk)object);
            } else {
                ((fxi)object2).c(this.b);
            }
            object = this.c;
            if (object != null) {
                ((fxi)object2).j((zk)object);
            }
        }
        if ((object2 = this.e(true)) != null) {
            object = this.t;
            if (object != null) {
                ((fxi)object2).q((izk)object);
            } else {
                ((fxi)object2).c(this.b);
            }
            object = this.c;
            if (object != null) {
                ((fxi)object2).j((zk)object);
            }
        }
        LayerDrawable layerDrawable = this.r;
        object2 = object = null;
        if (layerDrawable != null) {
            object2 = object;
            if (layerDrawable.getNumberOfLayers() > 1) {
                object2 = this.r.getNumberOfLayers() > 2 ? (fxx)this.r.getDrawable(2) : (fxx)this.r.getDrawable(1);
            }
        }
        if (object2 != null) {
            object2.c(this.b);
            if (object2 instanceof fxi) {
                object2 = (fxi)object2;
                object = this.t;
                if (object != null) {
                    ((fxi)object2).q((izk)object);
                }
                if ((object = this.c) != null) {
                    ((fxi)object2).j((zk)object);
                }
            }
        }
    }
}

