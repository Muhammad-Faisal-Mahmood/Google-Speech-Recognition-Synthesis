/*
 * Decompiled with CFR 0.152.
 */
final class kij
implements kmi {
    final kio a;
    private final kls b;
    private boolean c;

    public kij(kio kio2) {
        this.a = kio2;
        this.b = new kls(kio2.d.a());
    }

    @Override
    public final kmm a() {
        return this.b;
    }

    @Override
    public final void bK(klm klm2, long l2) {
        if (!this.c) {
            kmc kmc2 = (kmc)this.a.d;
            if (!kmc2.c) {
                kmc2.b.O(l2);
                kmc2.c();
                this.a.d.Q("\r\n");
                this.a.d.bK(klm2, l2);
                this.a.d.Q("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalStateException("closed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        synchronized (this) {
            boolean bl2 = this.c;
            if (bl2) {
                return;
            }
            this.c = true;
            this.a.d.Q("0\r\n\r\n");
            kio.l(this.b);
            this.a.e = 3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void flush() {
        synchronized (this) {
            boolean bl2 = this.c;
            if (bl2) {
                return;
            }
            this.a.d.flush();
            return;
        }
    }
}

