/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Message
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsetsAnimation
 *  android.view.animation.Interpolator
 */
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import java.util.List;

public final class ilo {
    public Object a;

    public ilo() {
    }

    public ilo(int n2, Interpolator interpolator, long l2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new xa(new WindowInsetsAnimation(n2, interpolator, l2));
            return;
        }
        this.a = new wy(n2, interpolator, l2);
    }

    public ilo(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new xa(windowInsetsAnimation);
        }
    }

    public ilo(Object object) {
        this.a = object;
    }

    public ilo(short[] sArray) {
        this.a = null;
    }

    public static void g(View view, wt object) {
        if (Build.VERSION.SDK_INT >= 30) {
            sk$$ExternalSyntheticApiModelOutline1.m(view, new wz((wt)object));
            return;
        }
        Object object2 = wy.a;
        object2 = view.getTag(2131427920);
        object = new wx(view, (wt)object);
        view.setTag(2131427928, object);
        if (object2 == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)object);
        }
    }

    public final void a() {
        this.a = null;
    }

    public final boolean b() {
        return this.a == null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        this.a = null;
        List list = agd.a;
        synchronized (list) {
            if (agd.a.size() < 50) {
                agd.a.add(this);
            }
            return;
        }
    }

    public final void d() {
        Object object = this.a;
        abr.i(object);
        ((Message)object).sendToTarget();
        this.c();
    }

    public final float e() {
        return ((xb)this.a).g();
    }

    public final int f() {
        return ((xb)this.a).h();
    }

    public final void h(float f2) {
        ((xb)this.a).j(f2);
    }
}

