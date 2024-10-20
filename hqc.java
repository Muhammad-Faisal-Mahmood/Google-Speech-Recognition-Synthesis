/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public final class hqc
implements Runnable {
    hqe a;

    public hqc(hqe hqe2) {
        this.a = hqe2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Throwable throwable2;
        Object object;
        Object object2;
        hpn hpn2;
        hqe hqe2;
        block10: {
            CharSequence charSequence;
            Comparable<Delayed> comparable;
            block9: {
                hqe2 = this.a;
                if (hqe2 == null) {
                    return;
                }
                hpn2 = hqe2.a;
                if (hpn2 == null) return;
                this.a = null;
                if (hpn2.isDone()) {
                    hqe2.o(hpn2);
                    return;
                }
                comparable = hqe2.b;
                hqe2.b = null;
                object2 = "Timed out";
                charSequence = object2;
                if (comparable == null) break block9;
                object = object2;
                try {
                    long l2 = Math.abs(comparable.getDelay(TimeUnit.MILLISECONDS));
                    charSequence = object2;
                    if (l2 <= 10L) break block9;
                    object = object2;
                    object = object2;
                    charSequence = new StringBuilder("Timed out (timeout delayed by ");
                    object = object2;
                    ((StringBuilder)charSequence).append(l2);
                    object = object2;
                    ((StringBuilder)charSequence).append(" ms after scheduled time)");
                    object = object2;
                    charSequence = ((StringBuilder)charSequence).toString();
                }
                catch (Throwable throwable2) {
                    break block10;
                }
            }
            object = charSequence;
            object2 = hpn2.toString();
            object = charSequence;
            object = charSequence;
            comparable = new Comparable<Delayed>();
            object = charSequence;
            ((StringBuilder)comparable).append((String)charSequence);
            object = charSequence;
            ((StringBuilder)comparable).append(": ");
            object = charSequence;
            ((StringBuilder)comparable).append((String)object2);
            object = charSequence;
            charSequence = ((StringBuilder)comparable).toString();
            object = new hqd((String)charSequence);
            hqe2.n((Throwable)object);
            return;
        }
        try {
            object2 = new hqd((String)object);
            hqe2.n((Throwable)object2);
            throw throwable2;
        }
        finally {
            hpn2.cancel(true);
        }
    }
}

