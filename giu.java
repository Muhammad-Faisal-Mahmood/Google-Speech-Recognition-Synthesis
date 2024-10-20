/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Typeface
 *  android.os.Handler
 */
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

public final class giu {
    public boolean a;
    public final Object b;
    public final Object c;

    public giu() {
        throw null;
    }

    public giu(Activity activity, Set set) {
        this.a = false;
        this.b = (bh)activity;
        this.c = set;
    }

    public giu(Handler handler, akl akl2) {
        this.b = handler;
        this.c = akl2;
    }

    public giu(cnj cnj2, hpq hpq2) {
        this.a = false;
        this.c = cnj2;
        this.b = hpq2;
    }

    public giu(fwt fwt2, Typeface typeface) {
        this.b = typeface;
        this.c = fwt2;
    }

    public giu(Executor executor) {
        jse.e(executor, "executor");
        this.b = new Object();
        this.c = new ArrayList();
    }

    public giu(byte[] byArray) {
        this.c = new Object();
        this.b = new ArrayList();
    }

    public final void a() {
        if (!this.a) {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                abd abd2 = (abd)iterator.next();
                ((db)this.b).getLifecycle().b(abd2);
            }
            this.a = true;
        }
    }

    public final void b() {
        this.a = true;
    }

    public final void c(Typeface typeface) {
        if (!this.a) {
            this.c.a(typeface);
        }
    }

    public final void d() {
        this.c((Typeface)this.b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn e(ifd object) {
        synchronized (this) {
            if (((ifd)object).b == 4) {
                hpn hpn2 = this.c.c((iei)((ifd)object).c);
                object = new buf(2);
                return fxf.ak(hpn2, (hny)object, (Executor)this.b);
            }
            object = ifi.a.l();
            hyg hyg2 = ifg.a.l();
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            hwv hwv2 = (ifg)((hwp)hyg2).b;
            hwv2.b |= 1;
            hwv2.c = "Request type not supported.";
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hwv2 = (ifi)((hwp)object).b;
            hyg2 = (ifg)((hwp)hyg2).o();
            hyg2.getClass();
            ((ifi)hwv2).c = hyg2;
            ((ifi)hwv2).b = 1;
            return hhk.K((ifi)((hwp)object).o());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn f(iez object) {
        synchronized (this) {
            Object object2;
            Object object3 = object2 = ((iez)object).e;
            if (object2 == null) {
                object3 = iey.a;
            }
            object3 = object2 = ((iey)object3).u;
            if (object2 == null) {
                object3 = iel.a;
            }
            int n2 = idi.a(((iel)object3).c);
            boolean bl2 = false;
            if (n2 != 0 && n2 != 1) {
                bl2 = true;
            }
            this.a = bl2;
            if (!bl2) {
                return hpj.a;
            }
            object2 = this.c;
            object = object3 = ((iez)object).e;
            if (object3 == null) {
                object = iey.a;
            }
            object = object3 = idq.b(((iey)object).j);
            if (object3 != null) return object2.d((idq)object);
            object = idq.a;
            return object2.d((idq)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn g() {
        synchronized (this) {
            if (!this.a) return hpj.a;
            return this.c.e();
        }
    }

    public final hpn h(hpn hpn2, gui gui2) {
        return kl.o(new bbc(this, hpn2, gui2, 3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(Runnable runnable) {
        Object object = this.c;
        synchronized (object) {
            this.b.remove(runnable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        gzx gzx2;
        Object object = this.c;
        synchronized (object) {
            this.a = true;
            gzx2 = gzx.o((Collection)this.b);
            this.b.clear();
        }
        int n2 = gzx2.size();
        int n3 = 0;
        while (n3 < n2) {
            ((Runnable)gzx2.get(n3)).run();
            ++n3;
        }
        return;
    }
}

