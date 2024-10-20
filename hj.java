/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public final class hj {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static hj b;
    private lj c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static PorterDuffColorFilter b(int n2, PorterDuff.Mode mode) {
        synchronized (hj.class) {
            return lj.b(n2, mode);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static hj d() {
        synchronized (hj.class) {
            if (b != null) return b;
            hj.f();
            return b;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f() {
        synchronized (hj.class) {
            if (b == null) {
                Object object = new hj();
                b = object;
                ((hj)object).c = lj.e();
                lj lj2 = hj.b.c;
                object = new axx();
                lj2.h((axx)object);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final ColorStateList a(Context context, int n2) {
        synchronized (this) {
            return this.c.a(context, n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable c(Context context, int n2) {
        synchronized (this) {
            return this.c.c(context, n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(Context context) {
        synchronized (this) {
            this.c.f(context);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable g(Context context, int n2) {
        synchronized (this) {
            return this.c.d(context, n2, true);
        }
    }
}

