/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public final class khf {
    public final khh a;
    public final String b;
    public boolean c;
    public khd d;
    public final List e;
    public boolean f;

    public khf(khh khh2, String string) {
        this.a = khh2;
        this.b = string;
        this.e = new ArrayList();
    }

    public static /* synthetic */ void e(khf khf2, khd khd2) {
        khf2.f(khd2);
    }

    public final void a() {
        Object object = khb.a;
        object = this.a;
        synchronized (object) {
            if (this.c()) {
                this.a.c(this);
            }
            return;
        }
    }

    public final void b() {
        Object object = khb.a;
        object = this.a;
        synchronized (object) {
            this.c = true;
            if (this.c()) {
                this.a.c(this);
            }
            return;
        }
    }

    public final boolean c() {
        if (this.d != null) {
            this.f = true;
        }
        boolean bl2 = false;
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            khd khd2 = (khd)this.e.get(i2);
            khd2 = (khd)this.e.get(i2);
            if (khh.b.isLoggable(Level.FINE)) {
                jvf.p(khd2, this, "canceled");
            }
            this.e.remove(i2);
            bl2 = true;
        }
        return bl2;
    }

    public final boolean d(khd khd2, long l2, boolean bl2) {
        block10: {
            int n2;
            block8: {
                Object object;
                block9: {
                    jse.e(khd2, "task");
                    object = khd2.b;
                    if (object == this) break block9;
                    if (object != null) break block10;
                    khd2.b = this;
                }
                long l3 = System.nanoTime();
                long l4 = l3 + l2;
                n2 = this.e.indexOf(khd2);
                if (n2 != -1) {
                    if (khd2.c <= l4) {
                        if (khh.b.isLoggable(Level.FINE)) {
                            jvf.p(khd2, this, "already scheduled");
                        }
                        return false;
                    }
                    this.e.remove(n2);
                }
                khd2.c = l4;
                if (khh.b.isLoggable(Level.FINE)) {
                    object = bl2 ? "run again after ".concat(String.valueOf(jvf.o(l4))) : "scheduled after ".concat(String.valueOf(jvf.o(l4 -= l3)));
                    jvf.p(khd2, this, (String)object);
                }
                object = this.e.iterator();
                n2 = 0;
                while (object.hasNext()) {
                    if (((khd)object.next()).c - l3 <= l2) {
                        ++n2;
                        continue;
                    }
                    break block8;
                }
                n2 = -1;
            }
            int n3 = n2;
            if (n2 == -1) {
                n3 = this.e.size();
            }
            this.e.add(n3, khd2);
            return n3 == 0;
        }
        throw new IllegalStateException("task is in multiple queues");
    }

    public final void f(khd khd2) {
        jse.e(khd2, "task");
        khh khh2 = this.a;
        synchronized (khh2) {
            if (this.c) {
                if (khh.b.isLoggable(Level.FINE)) {
                    jvf.p(khd2, this, "schedule canceled (queue is shutdown)");
                }
                return;
            }
            if (this.d(khd2, 0L, false)) {
                this.a.c(this);
            }
            return;
        }
    }

    public final String toString() {
        return this.b;
    }
}

