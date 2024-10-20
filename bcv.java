/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class bcv
implements Runnable {
    private final int a;
    private final Object b;
    private final Object c;

    public bcv(gty gty2, dym dym2, int n2) {
        this.a = n2;
        this.c = gty2;
        this.b = dym2;
    }

    public bcv(iul iul2, Throwable throwable, int n2) {
        this.a = n2;
        this.b = iul2;
        this.c = throwable;
    }

    public bcv(Object object, Object object2, int n2) {
        this.a = n2;
        this.c = object;
        this.b = object2;
    }

    public bcv(Object object, Runnable runnable, int n2) {
        this.a = n2;
        this.b = object;
        this.c = runnable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.a) {
            default: {
                if (!this.b.isCancelled()) break;
                jsl.s((jul)this.c);
                return;
            }
            case 6: {
                Object object = this.b;
                Object object2 = this.c;
                jon jon2 = jon.a;
                object2 = (juy)object2;
                ((jul)object).v((juy)object2, jon2);
                return;
            }
            case 5: {
                Object object = this.b;
                Throwable throwable = (Throwable)this.c;
                ((iul)object).j(throwable);
                return;
            }
            case 4: {
                this.c.a(this.b);
                return;
            }
            case 3: {
                Object object = ((bir)this.c).d;
                synchronized (object) {
                    if ((bcv)((bir)this.c).b.remove(this.b) != null) {
                        biq biq2 = (biq)((bir)this.c).c.remove(this.b);
                        if (biq2 == null) return;
                        biq2.b((bgs)this.b);
                    } else {
                        bbi.a();
                        String.format("Timer with %s is already marked as complete.", this.b);
                    }
                    return;
                }
            }
            case 2: {
                try {
                    this.c.run();
                    return;
                }
                finally {
                    Object object = ((big)this.b).b;
                    synchronized (object) {
                        ((big)this.b).a();
                    }
                }
            }
            case 1: {
                if (this.b.isCancelled()) {
                    jsl.s((jul)this.c);
                    return;
                }
                try {
                    Object object = this.c;
                    Object object3 = a.h((Future)this.b);
                    ((jul)object).bD(object3);
                    return;
                }
                catch (ExecutionException executionException) {
                    this.c.bD(jns.aj(kt.g(executionException)));
                    return;
                }
            }
            case 0: {
                if (this.b.isCancelled()) {
                    jsl.s((jul)this.c);
                    return;
                }
                try {
                    Object object = this.c;
                    Object object4 = bdy.b((Future)this.b);
                    ((jul)object).bD(object4);
                    return;
                }
                catch (ExecutionException executionException) {
                    this.c.bD(jns.aj(bdy.c(executionException)));
                    return;
                }
            }
        }
        try {
            this.c.bD(a.h((Future)this.b));
            return;
        }
        catch (ExecutionException executionException) {
            this.c.bD(jns.aj(jsd.m(executionException)));
            return;
        }
    }
}

