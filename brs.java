/*
 * Decompiled with CFR 0.152.
 */
public final class brs
implements ahl {
    private int a;

    @Override
    public final void a(agt agt2, boolean bl2, int n2) {
        this.a = n2 = this.a + n2;
        if (n2 <= 2000000) {
            return;
        }
        throw new IllegalStateException("Downloaded file exceeded size limit");
    }

    @Override
    public final void b(agt agt2, boolean bl2) {
    }

    @Override
    public final void c() {
        this.a = 0;
    }

    @Override
    public final void d(agt agt2, boolean bl2) {
    }
}

