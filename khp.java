/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class khp
implements Cloneable {
    public final kgp a;
    public final kgs b;
    public final kht c;
    public final kgh d;
    public final kho e;
    public final AtomicBoolean f;
    public khl g;
    public khr h;
    public boolean i;
    public boolean j;
    public boolean k;
    public volatile boolean l;
    public volatile khr m;
    public kmb n;
    public volatile kmb o;
    private Object p;

    public khp(kgp object, kgs object2) {
        this.a = object;
        this.b = object2;
        this.c = (kht)((kgp)object).A.a;
        object = ((kgp)object).y.a;
        object2 = khb.a;
        this.d = (kgh)object;
        object = new kho(this);
        ((kmm)object).n(0L, TimeUnit.MILLISECONDS);
        this.e = object;
        this.f = new AtomicBoolean();
        this.k = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final IOException j(IOException iOException) {
        Object object;
        Object object2 = khb.a;
        object2 = this.h;
        if (object2 != null) {
            // MONITORENTER : object2
            object = this.c();
            // MONITOREXIT : object2
            if (this.h == null) {
                if (object != null) {
                    khb.r((Socket)object);
                }
            } else if (object != null) throw new IllegalStateException("Check failed.");
        }
        if (!this.e.f()) {
            object2 = iOException;
        } else {
            object = new InterruptedIOException("timeout");
            object2 = object;
            if (iOException != null) {
                ((Throwable)object).initCause(iOException);
                object2 = object;
            }
        }
        if (iOException == null) return object2;
        jse.b(object2);
        jse.e(object2, "ioe");
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IOException a(IOException iOException) {
        boolean bl2;
        synchronized (this) {
            boolean bl3;
            boolean bl4 = this.k;
            bl2 = bl3 = false;
            if (bl4) {
                this.k = false;
                bl2 = bl3;
                if (!this.i) {
                    bl4 = this.j;
                    bl2 = bl3;
                    if (!bl4) {
                        bl2 = true;
                    }
                }
            }
        }
        IOException iOException2 = iOException;
        if (!bl2) return iOException2;
        return this.j(iOException);
    }

    public final String b() {
        return this.b.a.e();
    }

    public final Socket c() {
        int n2;
        Object object;
        Object object2;
        block7: {
            object2 = this.h;
            jse.b(object2);
            object = khb.a;
            object = ((khr)object2).l;
            Iterator iterator = object.iterator();
            n2 = 0;
            while (iterator.hasNext()) {
                if (!jse.i(((Reference)iterator.next()).get(), this)) {
                    ++n2;
                    continue;
                }
                break block7;
            }
            n2 = -1;
        }
        if (n2 != -1) {
            object.remove(n2);
            this.h = null;
            if (object.isEmpty()) {
                ((khr)object2).m = System.nanoTime();
                object = this.c;
                jse.e(object2, "connection");
                if (!((khr)object2).i) {
                    object2 = ((kht)object).b;
                    object = (khd)((kht)object).c;
                    khf.e((khf)object2, (khd)object);
                } else {
                    ((khr)object2).l();
                    ((ConcurrentLinkedQueue)((kht)object).d).remove(object2);
                    if (((ConcurrentLinkedQueue)((kht)object).d).isEmpty()) {
                        ((khf)((kht)object).b).a();
                    }
                    return ((khr)object2).a();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.");
    }

    /*
     * WARNING - void declaration
     */
    public final kgv d() {
        void var3_7;
        boolean bl2;
        Object object;
        block7: {
            ArrayList<kgn> arrayList = new ArrayList<kgn>();
            jns.A(arrayList, this.a.d);
            arrayList.add(new kif(this.a));
            arrayList.add(new khx(this.a.i));
            arrayList.add(new khc());
            arrayList.add(khi.a);
            jns.A(arrayList, this.a.e);
            arrayList.add(new khy());
            object = this.b;
            kgp kgp2 = this.a;
            object = new kid(this, arrayList, 0, null, (kgs)object, kgp2.v, kgp2.w, kgp2.x);
            object = ((kid)object).a(this.b);
            boolean bl3 = this.l;
            if (bl3) break block7;
            this.a(null);
            return object;
        }
        try {
            khb.q((Closeable)object);
            object = new IOException("Canceled");
            throw object;
        }
        catch (Throwable throwable) {
            bl2 = false;
        }
        catch (IOException iOException) {
            try {
                IOException iOException2 = this.a(iOException);
                jse.c(iOException2, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOException2;
            }
            catch (Throwable throwable) {
                bl2 = true;
            }
        }
        if (!bl2) {
            this.a(null);
        }
        throw var3_7;
    }

    public final void e(khr khr2) {
        jse.e(khr2, "connection");
        byte[] byArray = khb.a;
        if (this.h == null) {
            this.h = khr2;
            khr2.l.add(new khn(this, this.p));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void f() {
        this.p = kkf.b.i();
    }

    public final void g() {
        if (!this.l) {
            this.l = true;
            Object object = this.o;
            if (object != null) {
                ((kmb)object).g.f();
            }
            if ((object = this.m) != null) {
                ((khr)object).b();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h(boolean bl2) {
        kmb kmb2;
        // MONITORENTER : this
        boolean bl3 = this.k;
        if (!bl3) {
            IllegalStateException illegalStateException = new IllegalStateException("released");
            throw illegalStateException;
        }
        // MONITOREXIT : this
        if (bl2 && (kmb2 = this.o) != null) {
            kmb2.g.f();
            ((khp)kmb2.c).i(kmb2, true, true, null);
        }
        this.n = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final IOException i(kmb object, boolean bl2, boolean bl3, IOException iOException) {
        boolean bl4;
        if (!jse.i(object, this.o)) {
            return iOException;
        }
        // MONITORENTER : this
        boolean bl5 = true;
        boolean bl6 = false;
        if (bl2) {
            bl4 = bl3;
            if (this.i) break block12;
        }
        if (bl3 && this.j) {
            block12: {
                bl4 = true;
            }
            if (bl2) {
                this.i = false;
            }
            if (bl4) {
                this.j = false;
            }
            bl6 = !(bl2 = this.i) && !this.j;
            if (bl2 || this.j || (bl2 = this.k)) {
                bl5 = false;
            }
        } else {
            bl5 = false;
        }
        // MONITOREXIT : this
        if (bl6) {
            this.o = null;
            object = this.h;
            if (object != null) {
                ((khr)object).c();
            }
        }
        if (!bl5) return iOException;
        return this.j(iOException);
    }
}

