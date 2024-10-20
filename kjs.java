/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

public final class kjs {
    public final int a;
    public final kjl b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final kjq g;
    public final kjp h;
    public final kjr i;
    public final kjr j;
    public IOException k;
    private final ArrayDeque l;
    private boolean m;
    private kiq n;

    public kjs(int n2, kjl kjl2, boolean bl2, boolean bl3, kgk kgk2) {
        ArrayDeque<kgk> arrayDeque;
        this.a = n2;
        this.b = kjl2;
        this.f = kjl2.r.c();
        this.l = arrayDeque = new ArrayDeque<kgk>();
        this.g = new kjq(this, kjl2.q.c(), bl3);
        this.h = new kjp(this, bl2);
        this.i = new kjr(this);
        this.j = new kjr(this);
        if (kgk2 != null) {
            if (!this.l()) {
                arrayDeque.add(kgk2);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (this.l()) {
            return;
        }
        throw new IllegalStateException("remotely-initiated streams should have headers");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean n(kiq kiq2, IOException iOException) {
        Object object = khb.a;
        synchronized (this) {
            boolean bl2;
            void var2_2;
            object = (Object)this.n;
            if (object != null) {
                return false;
            }
            this.n = kiq2;
            this.k = var2_2;
            this.notifyAll();
            if (this.g.b && (bl2 = this.h.a)) {
                return false;
            }
        }
        this.b.b(this.a);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final kgk a() {
        synchronized (this) {
            block8: {
                this.i.e();
                while (this.l.isEmpty() && this.n == null) {
                    this.k();
                }
                if (this.l.isEmpty()) break block8;
                Object object = this.l.removeFirst();
                jse.d(object, "removeFirst(...)");
                return (kgk)object;
            }
            IOException iOException = this.k;
            if (iOException != null) {
                throw iOException;
            }
            kiq kiq2 = this.n;
            jse.b((Object)kiq2);
            iOException = new kjy(kiq2);
            throw iOException;
            finally {
                this.i.b();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final kiq b() {
        synchronized (this) {
            return this.n;
        }
    }

    public final kmi c() {
        synchronized (this) {
            if (!this.m && !this.l()) {
                IllegalStateException illegalStateException = new IllegalStateException("reply before requesting the sink");
                throw illegalStateException;
            }
            return this.h;
        }
    }

    public final void d(long l2) {
        this.f += l2;
        if (l2 > 0L) {
            this.notifyAll();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void e() {
        boolean bl2;
        boolean bl3;
        block6: {
            block7: {
                boolean bl4;
                Object object = khb.a;
                // MONITORENTER : this
                object = this.g;
                bl3 = object.b;
                bl2 = bl4 = false;
                if (bl3) break block6;
                bl2 = bl4;
                if (!object.e) break block6;
                object = this.h;
                if (object.a) break block7;
                bl2 = bl4;
                if (!object.b) break block6;
            }
            bl2 = true;
        }
        bl3 = this.m();
        // MONITOREXIT : this
        if (bl2) {
            this.g(kiq.i, null);
            return;
        }
        if (bl3) return;
        this.b.b(this.a);
    }

    public final void f() {
        Object object = this.h;
        if (!((kjp)object).b) {
            if (!((kjp)object).a) {
                kiq kiq2 = this.n;
                if (kiq2 != null) {
                    object = this.k;
                    if (object != null) {
                        throw object;
                    }
                    throw new kjy(kiq2);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void g(kiq kiq2, IOException iOException) {
        jse.e((Object)kiq2, "rstStatusCode");
        if (!this.n(kiq2, iOException)) {
            return;
        }
        this.b.j(this.a, kiq2);
    }

    public final void h(kiq kiq2) {
        jse.e((Object)kiq2, "errorCode");
        if (!this.n(kiq2, null)) {
            return;
        }
        this.b.k(this.a, kiq2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(kgk kgk2, boolean bl2) {
        boolean bl3;
        block6: {
            block5: {
                boolean bl4;
                block4: {
                    jse.e(kgk2, "headers");
                    byte[] byArray = khb.a;
                    // MONITORENTER : this
                    bl4 = bl3;
                    if (!this.m) break block4;
                    if (bl3) break block5;
                    bl4 = false;
                }
                this.m = true;
                this.l.add(kgk2);
                if (!bl4) break block6;
            }
            this.g.b = true;
        }
        bl3 = this.m();
        this.notifyAll();
        // MONITOREXIT : this
        if (bl3) return;
        this.b.b(this.a);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(kiq kiq2) {
        synchronized (this) {
            jse.e((Object)kiq2, "errorCode");
            if (this.n == null) {
                this.n = kiq2;
                this.notifyAll();
                return;
            }
            return;
        }
    }

    public final void k() {
        try {
            this.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean l() {
        return (this.a & 1) == 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean m() {
        synchronized (this) {
            Object object = this.n;
            if (object != null) {
                return false;
            }
            object = this.g;
            if (((kjq)object).b || ((kjq)object).e) {
                boolean bl2;
                object = this.h;
                if ((((kjp)object).a || ((kjp)object).b) && (bl2 = this.m)) {
                    return false;
                }
            }
            return true;
        }
    }
}

