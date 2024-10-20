/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public final class fxm {
    public static final fxd a = new fxk(0.5f);
    public final fxd b;
    public final fxd c;
    public final fxd d;
    public final fxd e;
    public final fxf f;
    public final fxf g;
    public final fxf h;
    public final fxf i;
    public final fxf j;
    public final fxf k;
    public final fxf l;
    public final fxf m;

    public fxm() {
        this.j = new fxl();
        this.k = new fxl();
        this.l = new fxl();
        this.m = new fxl();
        this.b = new fxa(0.0f);
        this.c = new fxa(0.0f);
        this.d = new fxa(0.0f);
        this.e = new fxa(0.0f);
        this.f = new fxf();
        this.g = new fxf();
        this.h = new fxf();
        this.i = new fxf();
    }

    public fxm(gch gch2) {
        this.j = (fxf)gch2.e;
        this.k = (fxf)gch2.g;
        this.l = (fxf)gch2.c;
        this.m = (fxf)gch2.j;
        this.b = gch2.d;
        this.c = gch2.k;
        this.d = gch2.f;
        this.e = gch2.b;
        this.f = (fxf)gch2.a;
        this.g = (fxf)gch2.i;
        this.h = (fxf)gch2.l;
        this.i = (fxf)gch2.h;
    }

    public static fxd a(TypedArray typedArray, int n2, fxd fxd2) {
        TypedValue typedValue = typedArray.peekValue(n2);
        if (typedValue != null) {
            if (typedValue.type == 5) {
                return new fxa(TypedValue.complexToDimensionPixelSize((int)typedValue.data, (DisplayMetrics)typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValue.type == 6) {
                return new fxk(typedValue.getFraction(1.0f, 1.0f));
            }
        }
        return fxd2;
    }

    public static gch e(Context context, int n2, int n3, fxd fxd2) {
        Object object = new ContextThemeWrapper(context, n2);
        context = object;
        if (n3 != 0) {
            context = new ContextThemeWrapper((Context)object, n3);
        }
        context = context.obtainStyledAttributes(fxj.b);
        try {
            int n4 = context.getInt(0, 0);
            n2 = context.getInt(3, n4);
            int n5 = context.getInt(4, n4);
            n3 = context.getInt(2, n4);
            n4 = context.getInt(1, n4);
            Object object2 = fxm.a((TypedArray)context, 5, fxd2);
            fxd fxd3 = fxm.a((TypedArray)context, 8, (fxd)object2);
            fxd2 = fxm.a((TypedArray)context, 9, (fxd)object2);
            object = fxm.a((TypedArray)context, 7, (fxd)object2);
            fxd fxd4 = fxm.a((TypedArray)context, 6, (fxd)object2);
            object2 = new gch(null);
            ((gch)object2).j(fxf.e(n2));
            ((gch)object2).d = fxd3;
            ((gch)object2).k(fxf.e(n5));
            ((gch)object2).k = fxd2;
            ((gch)object2).i(fxf.e(n3));
            ((gch)object2).f = object;
            ((gch)object2).h(fxf.e(n4));
            ((gch)object2).b = fxd4;
            return object2;
        }
        finally {
            context.recycle();
        }
    }

    public static gch f(Context context, AttributeSet attributeSet, int n2, int n3) {
        return fxm.g(context, attributeSet, n2, n3, new fxa(0.0f));
    }

    public static gch g(Context context, AttributeSet attributeSet, int n2, int n3, fxd fxd2) {
        attributeSet = context.obtainStyledAttributes(attributeSet, fxj.a, n2, n3);
        n3 = attributeSet.getResourceId(0, 0);
        n2 = attributeSet.getResourceId(1, 0);
        attributeSet.recycle();
        return fxm.e(context, n3, n2, fxd2);
    }

    public final fxm b(float f2) {
        gch gch2 = new gch(this);
        gch2.g(f2);
        return new fxm(gch2);
    }

    public final boolean c() {
        return this.k instanceof fxl && this.j instanceof fxl && this.l instanceof fxl && this.m instanceof fxl;
    }

    public final boolean d(RectF rectF) {
        boolean bl2 = this.i.getClass().equals(fxf.class) && this.g.getClass().equals(fxf.class) && this.f.getClass().equals(fxf.class) && this.h.getClass().equals(fxf.class);
        float f2 = this.b.a(rectF);
        boolean bl3 = this.c.a(rectF) == f2 && this.e.a(rectF) == f2 && this.d.a(rectF) == f2;
        return bl2 && bl3 && this.c();
    }

    public final String toString() {
        Object object = this.e;
        Object object2 = this.d;
        Object object3 = this.c;
        String string = String.valueOf(this.b);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append((String)object3);
        stringBuilder.append(", ");
        stringBuilder.append((String)object2);
        stringBuilder.append(", ");
        stringBuilder.append((String)object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

