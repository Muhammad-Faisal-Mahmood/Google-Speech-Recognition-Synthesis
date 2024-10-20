/*
 * Decompiled with CFR 0.152.
 */
final class kim
implements kmi {
    final kio a;
    private final kls b;
    private boolean c;

    public kim(kio kio2) {
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
            khb.B(klm2.b, l2);
            this.a.d.bK(klm2, l2);
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        kio.l(this.b);
        this.a.e = 3;
    }

    @Override
    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }
}

