/*
 * Decompiled with CFR 0.152.
 */
final class hdb
extends hap {
    static final hdb a = new hdb(new hcn());
    final transient hcn b;
    private final transient int c;
    private transient hav d;

    public hdb(hcn hcn2) {
        this.b = hcn2;
        long l2 = 0L;
        for (int i2 = 0; i2 < hcn2.c; ++i2) {
            l2 += (long)hcn2.c(i2);
        }
        this.c = hhk.ag(l2);
    }

    @Override
    public final int a(Object object) {
        return this.b.b(object);
    }

    @Override
    public final boolean l() {
        throw null;
    }

    @Override
    public final hav n() {
        hav hav2;
        hav hav3 = hav2 = this.d;
        if (hav2 == null) {
            this.d = hav3 = new hcz(this);
        }
        return hav3;
    }

    @Override
    public final hci p(int n2) {
        return this.b.p(n2);
    }

    @Override
    public final int size() {
        return this.c;
    }

    @Override
    public Object writeReplace() {
        return new hda(this);
    }
}

