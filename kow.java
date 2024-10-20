/*
 * Decompiled with CFR 0.152.
 */
final class kow
implements Runnable {
    final long a;
    final int b;
    final boolean c;
    final koy d;

    public kow(koy koy2, long l2, int n2, boolean bl2) {
        this.d = koy2;
        this.a = l2;
        this.b = n2;
        this.c = bl2;
    }

    @Override
    public final void run() {
        this.d.b.l.z(this.a, this.b);
        if (this.c) {
            koy koy2 = this.d;
            int n2 = this.b;
            koy2.b.l.y(n2);
            koy2 = this.d;
            long l2 = this.a;
            koy2.b.l.A(new long[]{l2});
        }
    }
}

