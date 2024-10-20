/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.concurrent.locks.Condition;

public final class klz
implements kmi {
    final kmb a;
    private final kmm b;

    public klz(kmb kmb2) {
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
    public final void bK(klm object, long l2) {
        kmb kmb2;
        block10: {
            kmb2 = this.a;
            Object object2 = kmb2.d;
            object2.lock();
            if (kmb2.a) {
                object = new IllegalStateException("closed");
                throw object;
            }
            break block10;
            finally {
                object2.unlock();
            }
        }
        while (l2 > 0L) {
            if (kmb2.b) {
                object = new IOException("source is closed");
                throw object;
            }
            long l3 = 8192L - ((klm)kmb2.c).b;
            if (l3 == 0L) {
                this.b.i((Condition)kmb2.e);
                continue;
            }
            l3 = Math.min(l3, l2);
            ((klm)kmb2.c).bK((klm)object, l3);
            l2 -= l3;
            kmb2.e.signalAll();
        }
        return;
    }

    @Override
    public final void close() {
        Object object = this.a;
        Object object2 = ((kmb)object).d;
        object2.lock();
        try {
            if (!((kmb)object).a) {
                if (((kmb)object).b && ((klm)((kmb)object).c).b > 0L) {
                    object = new IOException("source is closed");
                    throw object;
                }
                ((kmb)object).a = true;
                ((kmb)object).e.signalAll();
                return;
            }
            return;
        }
        finally {
            object2.unlock();
        }
    }

    @Override
    public final void flush() {
        Object object = this.a;
        Object object2 = ((kmb)object).d;
        object2.lock();
        try {
            if (!((kmb)object).a) {
                if (((kmb)object).b) {
                    if (((klm)((kmb)object).c).b <= 0L) {
                    } else {
                        object = new IOException("source is closed");
                        throw object;
                    }
                }
                return;
            }
            object = new IllegalStateException("closed");
            throw object;
        }
        finally {
            object2.unlock();
        }
    }
}

