/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

public final class cqp {
    public final Thread a;
    public int b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final AtomicLong f;
    private final boolean g;

    public /* synthetic */ cqp(Thread thread, int n2, boolean bl2, int n3, boolean bl3, int n4) {
        jse.e(thread, "thread");
        this.a = thread;
        if ((n4 & 2) != 0) {
            n2 = -1;
        }
        this.b = n2;
        n2 = 0;
        boolean bl4 = (n4 & 0x10) != 0;
        this.c = bl4;
        if ((n4 & 0x20) == 0) {
            n2 = 1;
        }
        this.g = n2 & bl3;
        this.d = bl4 ^ true;
        if ((n4 & 8) != 0) {
            n3 = -21;
        }
        this.f = new AtomicLong(crh.b(bl2, false, false, n3, -21, -21, 0L));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void e(long l2) {
        if (!cqo.g(l2)) return;
        boolean bl2 = false;
        while (true) {
            boolean bl3;
            try {
                LockSupport.park(this);
                bl3 = cqo.f(this.f.get());
                if (!bl3) {
                    if (!bl2) return;
                    this.a.interrupt();
                    return;
                }
            }
            catch (Throwable throwable) {
                if (!bl2) {
                    throw throwable;
                }
                this.a.interrupt();
                throw throwable;
            }
            {
                bl3 = Thread.interrupted();
                bl2 |= bl3;
                continue;
            }
            break;
        }
    }

    public final void a(int n2) {
        int n3;
        long l2;
        int n4;
        block6: {
            n4 = n2;
            do {
                l2 = this.f.get();
                n3 = cqo.d(l2);
                if (!cqo.g(l2)) break block6;
                if (cqo.h(l2)) {
                    n2 = n4;
                    if (n3 != n4) {
                        Process.setThreadPriority((int)this.b, (int)n3);
                        n2 = n3;
                    }
                } else {
                    n3 = cqd.a(n3);
                    n2 = n4;
                    if (n3 != cqd.a(n4)) {
                        this.a.setPriority(n3);
                        n2 = n4;
                    }
                }
                n4 = n2;
            } while (!this.f.compareAndSet(l2, cqo.i(l2, false, false, false, 0, 0, 0L, 121)));
            if (cqo.f(l2)) {
                LockSupport.unpark(this.a);
            }
            return;
        }
        boolean bl2 = cqo.h(l2);
        boolean bl3 = cqo.g(l2);
        n2 = cqo.c(l2);
        n4 = cqo.b(l2);
        n3 = cqo.a(l2);
        CharSequence charSequence = new StringBuilder("State{started=");
        charSequence.append(bl2);
        charSequence.append(", setting=");
        charSequence.append(bl3);
        charSequence.append(", pool=");
        charSequence.append(n2);
        charSequence.append(", local=");
        charSequence.append(n4);
        charSequence.append(", inherited=");
        charSequence.append(n3);
        charSequence.append("}");
        charSequence = charSequence.toString();
        String string = Long.toBinaryString(l2);
        StringBuilder stringBuilder = new StringBuilder("Unexpected not set, saw ");
        stringBuilder.append((String)charSequence);
        stringBuilder.append(" ");
        stringBuilder.append(string);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void b() {
        long l2;
        block4: {
            while (true) {
                l2 = this.f.get();
                long l3 = cqo.e(l2);
                l3 = cqo.i(l2, false, false, cqo.g(l2) & (this.g ^ true), 0, -21, l3 + 1L, 27);
                if (cqo.g(l2)) {
                    if (!this.f.compareAndSet(l2, l3)) continue;
                    break block4;
                }
                if (cqo.d(l2) == cqo.d(l3)) {
                    if (!this.f.compareAndSet(l2, l3)) continue;
                    break block4;
                }
                if (this.f.compareAndSet(l2, cqo.i(l3, false, true, false, 0, 0, 0L, 125))) break;
            }
            this.a(cqo.d(l2));
        }
        if (!this.g) {
            this.e(l2);
        }
    }

    public final void c() {
        long l2;
        AtomicLong atomicLong;
        while (!(atomicLong = this.f).compareAndSet(l2 = atomicLong.get(), cqo.i(l2, false, false, cqo.g(l2), 0, 0, 0L, 122))) {
        }
        this.e(l2);
    }

    public final void d() {
        long l2;
        while (cqo.f(l2 = this.f.get()) && !this.f.compareAndSet(l2, cqo.i(l2, false, false, false, 0, 0, 0L, 123))) {
        }
    }

    public final String toString() {
        String string = this.a.getName();
        int n2 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }
}

