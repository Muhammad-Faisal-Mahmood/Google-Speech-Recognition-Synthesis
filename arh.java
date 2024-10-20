/*
 * Decompiled with CFR 0.152.
 */
import java.math.BigInteger;

final class arh
implements aqb {
    final ari a;

    public arh(ari ari2) {
        this.a = ari2;
    }

    @Override
    public final long a() {
        ari ari2 = this.a;
        return ari2.c.e(ari2.d);
    }

    @Override
    public final apz c(long l2) {
        ari ari2 = this.a;
        Object object = BigInteger.valueOf(ari2.c.f(l2));
        ari ari3 = this.a;
        long l3 = ((BigInteger)object).multiply(BigInteger.valueOf(ari3.b - ari3.a)).divide(BigInteger.valueOf(this.a.d)).longValue();
        long l4 = ari2.a;
        object = this.a;
        long l5 = ((ari)object).b;
        object = new aqc(l2, agf.h(l4 + l3 - 30000L, ((ari)object).a, l5 - 1L));
        return new apz((aqc)object, (aqc)object);
    }

    @Override
    public final boolean d() {
        return true;
    }
}

