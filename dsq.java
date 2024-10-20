/*
 * Decompiled with CFR 0.152.
 */
final class dsq
extends dst {
    private final boolean b;

    public dsq(ket ket2, boolean bl2) {
        super(ket2);
        this.b = bl2;
    }

    private final ket f() {
        ket ket2 = this.b ? this.a : this.e();
        return ket2;
    }

    @Override
    public final long a(String object) {
        object = this.f();
        if (((hwv)object).equals(ket.a)) {
            return 1000L;
        }
        return ((ket)object).c;
    }

    @Override
    public final ket b(Long l2) {
        return this.a;
    }

    @Override
    public final ket c(Long l2) {
        return this.f();
    }

    @Override
    public final boolean d() {
        return this.b;
    }
}

