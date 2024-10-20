/*
 * Decompiled with CFR 0.152.
 */
final class kkx
extends klc {
    final klm a;
    long b;

    public kkx(long l2) {
        klm klm2;
        this.a = klm2 = new klm();
        this.b = -1L;
        this.e(klm2, l2);
    }

    @Override
    public final long a() {
        return this.b;
    }

    @Override
    public final void b(kln kln2) {
        klm klm2 = this.a;
        long l2 = klm2.b;
        klm2.M(((kmc)kln2).b, l2);
    }

    @Override
    public final kgs d(kgs object) {
        if (((kgs)object).a("Content-Length") != null) {
            return object;
        }
        this.e.close();
        this.b = this.a.b;
        object = new kgr((kgs)object);
        ((kgr)object).d("Transfer-Encoding");
        ((kgr)object).b("Content-Length", Long.toString(this.a.b));
        return ((kgr)object).a();
    }
}

