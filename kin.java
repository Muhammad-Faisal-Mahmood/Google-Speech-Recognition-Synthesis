/*
 * Decompiled with CFR 0.152.
 */
final class kin
extends kii {
    private boolean c;

    public kin(kio kio2) {
        super(kio2);
    }

    @Override
    public final long b(klm klm2, long l2) {
        if (!this.a) {
            if (this.c) {
                return -1L;
            }
            l2 = super.b(klm2, 8192L);
            if (l2 == -1L) {
                this.c = true;
                this.c();
                return -1L;
            }
            return l2;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            this.c();
        }
        this.d();
    }
}

