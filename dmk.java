/*
 * Decompiled with CFR 0.152.
 */
final class dmk {
    public final kdm a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final kdc f;
    public final String g;
    public final kdo h;
    public final Integer i;

    public dmk(kdm kdm2, Long l2, Long l3, Long l4, Long l5, kdc kdc2, String string, kdo kdo2, Integer n2) {
        this.a = kdm2;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = l5;
        this.f = kdc2;
        this.g = string;
        this.h = kdo2;
        this.i = n2;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}

