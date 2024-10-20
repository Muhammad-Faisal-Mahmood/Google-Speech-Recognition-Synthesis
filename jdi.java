/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class jdi
implements jcj {
    private iyh a;
    private jdh b;
    public volatile boolean c;
    public jcl d;
    public jcj e;
    public List f = new ArrayList();
    private long g;
    private long h;
    private List i = new ArrayList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void p(Runnable runnable) {
        boolean bl2 = this.d != null;
        fxf.B(bl2, "May only be called after start");
        synchronized (this) {
            if (!this.c) {
                this.f.add(runnable);
                return;
            }
        }
        runnable.run();
    }

    @Override
    public final its a() {
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(jeh jeh2) {
        synchronized (this) {
            if (this.d == null) {
                return;
            }
            if (this.e != null) {
                jeh2.b("buffered_nanos", this.h - this.g);
                this.e.b(jeh2);
            } else {
                jeh2.b("buffered_nanos", System.nanoTime() - this.g);
                jeh2.a("waiting_for_connection");
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void c(iyh iyh2) {
        jcl jcl2 = this.d;
        boolean bl2 = true;
        boolean bl3 = jcl2 != null;
        fxf.B(bl3, "May only be called after start");
        a.s(iyh2, "reason");
        // MONITORENTER : this
        if (this.e == null) {
            this.t(jgo.a);
            this.a = iyh2;
            bl2 = false;
        }
        // MONITOREXIT : this
        if (bl2) {
            this.p(new jdg(this, iyh2, 4));
            return;
        }
        this.r();
        this.q();
        this.d.a(iyh2, jck.a, new iwx());
    }

    @Override
    public final void d() {
        boolean bl2 = this.d != null;
        fxf.B(bl2, "May only be called after start");
        if (this.c) {
            this.e.d();
            return;
        }
        this.p(new iuk(this, 16));
    }

    @Override
    public final void e() {
        boolean bl2 = this.d != null;
        fxf.B(bl2, "May only be called after start");
        this.p(new iuk(this, 17));
    }

    @Override
    public final void f() {
        boolean bl2 = this.d == null;
        fxf.B(bl2, "May only be called before start");
        this.i.add(new iuk(this, 14));
    }

    @Override
    public final void g(int n2) {
        boolean bl2 = this.d != null;
        fxf.B(bl2, "May only be called after start");
        if (this.c) {
            this.e.g(n2);
            return;
        }
        this.p(new cdw(this, n2, 10));
    }

    @Override
    public final void h(iuf iuf2) {
        boolean bl2 = this.d == null;
        fxf.B(bl2, "May only be called before start");
        this.i.add(new jdg(this, iuf2, 1));
    }

    @Override
    public final void i(iut iut2) {
        boolean bl2 = this.d == null;
        fxf.B(bl2, "May only be called before start");
        this.i.add(new jdg(this, iut2, 2));
    }

    @Override
    public final void j(iuw iuw2) {
        boolean bl2 = this.d == null;
        fxf.B(bl2, "May only be called before start");
        a.s(iuw2, "decompressorRegistry");
        this.i.add(new jdg(this, iuw2, 0));
    }

    @Override
    public final void k(int n2) {
        boolean bl2 = this.d == null;
        fxf.B(bl2, "May only be called before start");
        this.i.add(new cdw(this, n2, 11));
    }

    @Override
    public final void l(int n2) {
        boolean bl2 = this.d == null;
        fxf.B(bl2, "May only be called before start");
        this.i.add(new cdw(this, n2, 12));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void m(jcl jcl2) {
        boolean bl2 = this.d == null;
        fxf.B(bl2, "already started");
        // MONITORENTER : this
        iyh iyh2 = this.a;
        bl2 = this.c;
        jcl jcl3 = jcl2;
        if (!bl2) {
            jcl3 = new jdh(jcl2);
            this.b = jcl3;
        }
        this.d = jcl3;
        this.g = System.nanoTime();
        // MONITOREXIT : this
        if (iyh2 != null) {
            jcl3.a(iyh2, jck.a, new iwx());
            return;
        }
        if (!bl2) return;
        this.s(jcl3);
    }

    @Override
    public final void n(InputStream inputStream) {
        boolean bl2 = this.d != null;
        fxf.B(bl2, "May only be called after start");
        if (this.c) {
            this.e.n(inputStream);
            return;
        }
        this.p(new jdg(this, inputStream, 3, null));
    }

    @Override
    public final boolean o() {
        if (this.c) {
            return this.e.o();
        }
        return false;
    }

    protected void q() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r() {
        List list;
        jdh jdh2;
        Object object = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f.isEmpty()) {
                    this.f = null;
                    this.c = true;
                    jdh2 = this.b;
                    // MONITOREXIT @DISABLED, blocks:[5, 7, 13] lbl8 : MonitorExitStatement: MONITOREXIT : this
                    if (jdh2 == null) {
                        return;
                    }
                    break;
                }
                list = this.f;
                this.f = object;
            }
            object = list.iterator();
            while (object.hasNext()) {
                ((Runnable)object.next()).run();
            }
            list.clear();
            object = list;
        }
        object = new ArrayList();
        while (true) {
            synchronized (jdh2) {
                if (jdh2.c.isEmpty()) {
                    jdh2.c = null;
                    jdh2.b = true;
                    return;
                }
                list = jdh2.c;
                jdh2.c = object;
            }
            object = list.iterator();
            while (object.hasNext()) {
                ((Runnable)object.next()).run();
            }
            list.clear();
            object = list;
        }
    }

    public final void s(jcl jcl2) {
        Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        this.i = null;
        this.e.m(jcl2);
    }

    public final void t(jcj jcj2) {
        jcj jcj3 = this.e;
        boolean bl2 = jcj3 == null;
        fxf.E(bl2, "realStream already set to %s", jcj3);
        this.e = jcj2;
        this.h = System.nanoTime();
    }
}

