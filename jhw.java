/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;
import java.util.concurrent.Future;

public final class jhw {
    public final Object a;
    public boolean b;
    Object c;

    public jhw() {
        this.a = new Object();
    }

    public jhw(Object object) {
        this.a = object;
    }

    public final Future a() {
        this.b = true;
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final void b(Future future) {
        Object object = this.a;
        // MONITORENTER : object
        boolean bl2 = this.b;
        if (!bl2) {
            this.c = future;
        }
        // MONITOREXIT : object
        if (!bl2) return;
        future.cancel(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(cla cla2) {
        Object object = this.a;
        synchronized (object) {
            if (this.c == null) {
                ArrayDeque arrayDeque;
                this.c = arrayDeque = new ArrayDeque();
            }
            this.c.add(cla2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(ckz ckz2) {
        Object object = this.a;
        synchronized (object) {
            if (this.c != null && !this.b) {
                this.b = true;
            } else {
                return;
            }
        }
        while (true) {
            cla cla2;
            object = this.a;
            synchronized (object) {
                cla2 = (cla)this.c.poll();
                if (cla2 == null) {
                    this.b = false;
                    return;
                }
            }
            cla2.b(ckz2);
        }
    }
}

