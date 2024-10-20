/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Build$VERSION
 */
import android.app.Application;
import android.os.Build;

public final class dqy {
    public static final dqy a = new dqy();
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile dmz g;
    public volatile dmz h;
    public volatile dmz i;
    public volatile dmz j;
    public volatile dmz k;
    public volatile dmz l;
    public volatile dmz m;
    public volatile dmz n;
    public volatile dmz o;
    public volatile dmz p;
    public volatile dmz q;
    public volatile djt r;
    public final dqt s;
    public final dqt t;
    private volatile boolean[] u = new boolean[5];

    public dqy() {
        this.s = new dqt();
        this.t = new dqt();
    }

    public final void a(int n2) {
        if (n2 < 5) {
            boolean[] blArray = this.u;
            boolean bl2 = this.s.b != null;
            blArray[n2] = bl2;
            if (this.u[n2]) {
                ++n2;
                while (n2 < 5) {
                    this.u[n2] = true;
                    ++n2;
                }
            }
        } else {
            return;
        }
        fpk.e(new cdw((Object)this, n2, 2, null));
    }

    final boolean b(boolean bl2, long l2, drc drc2) {
        if (bl2) {
            return this.u[(int)l2 - 1];
        }
        int n2 = drc2.ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        return this.b;
                    }
                    return this.f;
                }
                return this.e;
            }
            return this.d;
        }
        return this.c;
    }

    public final void c(Application application) {
        if (fpk.g() && this.h == null) {
            this.h = dmz.a();
            fpk.e(new cmw(this, 13));
            fpk.d(new cmw(this, 14), 10L);
            fpk.d(new cmw(this, 15), 100L);
            fpk.d(new cmw(this, 16), 250L);
            fpk.d(new cmw(this, 17), 500L);
            if (Build.VERSION.SDK_INT >= 34) {
                fpk.e(new cmw(this, 18));
            }
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new dqx(this, application));
        }
    }
}

