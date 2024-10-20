/*
 * Decompiled with CFR 0.152.
 */
public abstract class jvw
implements Runnable,
Comparable,
jvq,
kbx {
    public volatile Object _heap;
    private int a;
    public long b;

    public jvw(long l2) {
        this.b = l2;
        this.a = -1;
    }

    @Override
    public final int b() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void bu() {
        synchronized (this) {
            Object object = this._heap;
            kbt kbt2 = jvz.a;
            if (object == kbt2) {
                return;
            }
            if ((object = object instanceof jvx ? (jvx)object : null) != null) {
                synchronized (object) {
                    if (this.c() != null) {
                        int n2 = this.b();
                        boolean bl2 = jve.a;
                        ((kbw)object).d(n2);
                    }
                }
            }
            this._heap = jvz.a;
            return;
        }
    }

    @Override
    public final kbw c() {
        Object object = this._heap;
        if (object instanceof kbw) {
            return (kbw)object;
        }
        return null;
    }

    @Override
    public final void d(kbw kbw2) {
        if (this._heap != jvz.a) {
            this._heap = kbw2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override
    public final void e(int n2) {
        this.a = n2;
    }

    public String toString() {
        long l2 = this.b;
        StringBuilder stringBuilder = new StringBuilder("Delayed[nanos=");
        stringBuilder.append(l2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

