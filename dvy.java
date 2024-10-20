/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources$Theme
 *  android.os.Handler
 *  android.os.Looper
 *  android.widget.ListView
 */
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.ListView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public final class dvy {
    private static boolean d;
    public final int a;
    public final Object b;
    public final Object c;

    public dvy() {
        this(new CopyOnWriteArrayList(), null);
    }

    public dvy(int n2, gte gte2) {
        fxf.r(true, "maxValues must be greater than zero. Were it equal to zero, the queue would unconditionally (and unhelpfully) preempt all added values.");
        this.a = n2;
        this.b = gte2;
        this.c = new ArrayDeque(n2);
    }

    public dvy(int n2, List object, List object2) {
        Object object3;
        this.a = n2;
        Object object4 = object.iterator();
        int n3 = 0;
        n2 = 0;
        while (object4.hasNext()) {
            n2 += ((hvu)object4.next()).d();
        }
        object4 = new byte[n2];
        object = object.iterator();
        n2 = n3;
        while (object.hasNext()) {
            object3 = (hvu)object.next();
            ((hvu)object3).z((byte[])object4, n2, ((hvu)object3).d());
            n2 += ((hvu)object3).d();
        }
        this.b = object4;
        object4 = new gzs();
        object3 = object2.iterator();
        double d2 = -1.0;
        block2: while (true) {
            n2 = -1;
            while (object3.hasNext()) {
                iih iih2 = (iih)object3.next();
                n3 = iih2.b;
                if ((n3 & 2) == 0 || (n3 & 1) == 0) continue;
                object = object2 = iih2.c;
                if (object2 == null) {
                    object = iig.a;
                }
                if ((((iig)object).b & 0x10) == 0) continue;
                int n4 = iih2.d;
                n3 = a.B(n4);
                if (n3 != 0 && n3 == 2) {
                    object = object2 = iih2.c;
                    if (object2 == null) {
                        object = iig.a;
                    }
                    n2 = ((iig)object).e;
                    d2 = iih2.e;
                    continue;
                }
                n3 = a.B(n4);
                if (n3 == 0 || n3 != 3) continue;
                if (n2 < 0) {
                    ((heg)((heg)bru.a.g()).j("com/google/android/apps/speech/tts/googletts/common/ConvertHelper", "processTimepoints", 76, "ConvertHelper.java")).r("Got timepoint for token end with no start.");
                    continue;
                }
                object = object2 = iih2.c;
                if (object2 == null) {
                    object = iig.a;
                }
                ((gzs)object4).h(new brw(((iig)object).c, ((iig)object).d, n2, ((iig)object).e, d2));
                continue block2;
            }
            break;
        }
        this.c = ((gzs)object4).g();
    }

    public dvy(adu adu2, String string) {
        this.c = adu2;
        this.a = 0;
        this.b = string;
    }

    public dvy(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.c = colorStateList;
        this.b = configuration;
        int n2 = theme == null ? 0 : theme.hashCode();
        this.a = n2;
    }

    public dvy(cdi cdi2, int n2, ccs ccs2) {
        this.c = cdi2;
        this.a = n2;
        this.b = ccs2;
    }

    public dvy(gui gui2) {
        bpr bpr2 = new bpr(16);
        this.b = gui2;
        this.a = Math.max(5, 10);
        this.c = bpr2;
    }

    public dvy(CopyOnWriteArrayList copyOnWriteArrayList, anc anc2) {
        this.b = copyOnWriteArrayList;
        this.a = 0;
        this.c = anc2;
    }

    public dvy(jz jz2, fs fs2, int n2) {
        this.b = jz2;
        this.c = fs2;
        this.a = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (dvy.class) {
            if (!d) {
                dqv dqv2 = new dqv(this, 9);
                long l2 = this.a;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                hpr hpr2 = (hpr)this.b.a();
                gja gja2 = new gja(dqv2, hpr2, l2, timeUnit, 1);
                dww.c(hpr2.b(gja2, l2, timeUnit));
                d = true;
            }
            return;
        }
    }

    public final void b(afo afo2) {
        for (Object object : (CopyOnWriteArrayList)this.b) {
            Object object2 = ((awg)object).a;
            object = ((awg)object).b;
            object2 = new aks(afo2, object2, 2);
            int n2 = agf.a;
            if (!(object = (Handler)object).getLooper().getThread().isAlive()) continue;
            if (object.getLooper() == Looper.myLooper()) {
                object2.run();
                continue;
            }
            object.post((Runnable)object2);
        }
    }

    public final dvy c(anc anc2) {
        return new dvy((CopyOnWriteArrayList)this.b, anc2);
    }

    public final ListView d() {
        return ((jw)this.b).e;
    }

    public final dvy e(anc anc2) {
        return new dvy((CopyOnWriteArrayList)this.b, anc2);
    }

    public final void f() {
        Object object;
        while ((object = this.c.poll()) != null) {
            object = (Void)this.b.apply(object);
        }
    }

    public final boolean g() {
        return this.c.isEmpty();
    }

    public final boolean h(Object object) {
        boolean bl2;
        ArrayDeque arrayDeque = new ArrayDeque(this.c.size());
        while (this.c.peek() != null && this.c.peek() != object) {
            arrayDeque.add(this.c.poll());
        }
        if (this.c.peek() != object) {
            while ((object = arrayDeque.pollLast()) != null) {
                this.c.addFirst(object);
            }
            bl2 = false;
        } else {
            this.c.poll();
            while ((object = arrayDeque.poll()) != null) {
                object = (Void)this.b.apply(object);
            }
            bl2 = true;
        }
        return bl2;
    }

    public final void i(Object object) {
        ArrayDeque arrayDeque = new ArrayDeque(this.c.size());
        while (true) {
            Object object2;
            if ((object2 = this.c.poll()) == null) {
                while ((object2 = arrayDeque.poll()) != null) {
                    this.c.add(object2);
                }
                this.c.add(object);
                return;
            }
            if (arrayDeque.size() < this.a - 1) {
                arrayDeque.add(object2);
                continue;
            }
            object2 = (Void)this.b.apply(object2);
        }
    }

    public final void j(hti hti2) {
        this.b(new anf(this, hti2));
    }

    public final void k(amv amv2, hti hti2) {
        this.b(new ang(this, amv2, hti2, 2));
    }

    public final void l(amv amv2, hti hti2) {
        this.b(new ang(this, amv2, hti2, 0));
    }

    public final void m(amv amv2, hti hti2, IOException iOException, boolean bl2) {
        this.b(new anh(this, amv2, hti2, iOException, bl2));
    }

    public final void n(amv amv2, hti hti2) {
        this.b(new ang(this, amv2, hti2, 1));
    }
}

