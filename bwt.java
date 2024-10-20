/*
 * Decompiled with CFR 0.152.
 */
public final class bwt {
    private final drn a = djv.a().b();
    private final long b = System.nanoTime();
    private long c = -1L;

    public final long a() {
        long l2 = this.c;
        if (l2 != -1L) {
            return l2 - this.b;
        }
        return -1L;
    }

    public final void b(djt djt2) {
        djv.a().e(this.a, djt2);
        this.c = System.nanoTime();
    }
}

