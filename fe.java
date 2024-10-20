/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.view.View
 *  android.view.animation.Interpolator
 */
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class fe {
    public final ArrayList a;
    wq b;
    public boolean c;
    private long d = -1L;
    private Interpolator e;
    private final wr f = new fd(this);

    public fe() {
        this.a = new ArrayList();
    }

    public final void a() {
        if (!this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((bzb)arrayList.get(i2)).U();
        }
        this.c = false;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            View view;
            Interpolator interpolator;
            bzb bzb2 = (bzb)arrayList.get(i2);
            long l2 = this.d;
            if (l2 >= 0L) {
                bzb2.W(l2);
            }
            if ((interpolator = this.e) != null && (view = (View)((WeakReference)bzb2.a).get()) != null) {
                view.animate().setInterpolator((TimeInterpolator)interpolator);
            }
            if (this.b != null) {
                bzb2.X(this.f);
            }
            if ((interpolator = (View)((WeakReference)bzb2.a).get()) == null) continue;
            interpolator.animate().start();
        }
        this.c = true;
    }

    public final void c() {
        if (!this.c) {
            this.d = 250L;
        }
    }

    public final void d(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
    }

    public final void e(wq wq2) {
        if (!this.c) {
            this.b = wq2;
        }
    }

    public final void f(bzb bzb2) {
        if (!this.c) {
            this.a.add(bzb2);
        }
    }
}

