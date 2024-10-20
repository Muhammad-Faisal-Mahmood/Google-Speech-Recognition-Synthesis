/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.Condition;

public final class kma
implements kmk {
    final kmb a;
    private final kmm b;

    public kma(kmb kmb2) {
        this.a = kmb2;
        this.b = new kmm();
    }

    @Override
    public final kmm a() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long b(klm object, long l2) {
        kmb kmb2 = this.a;
        Object object2 = kmb2.d;
        object2.lock();
        try {
            Object object3;
            if (kmb2.b) {
                object = new IllegalStateException("closed");
                throw object;
            }
            while (true) {
                object3 = kmb2.c;
                if (((klm)object3).b != 0L) break;
                boolean bl2 = kmb2.a;
                if (bl2) {
                    object2.unlock();
                    return -1L;
                }
                this.b.i((Condition)kmb2.e);
            }
            l2 = ((klm)object3).b((klm)object, 8192L);
            kmb2.e.signalAll();
            object2.unlock();
            return l2;
        }
        catch (Throwable throwable) {
            object2.unlock();
            throw throwable;
        }
    }

    @Override
    public final void close() {
        kmb kmb2 = this.a;
        Object object = kmb2.d;
        object.lock();
        try {
            kmb2.b = true;
            kmb2.e.signalAll();
            return;
        }
        finally {
            object.unlock();
        }
    }
}

