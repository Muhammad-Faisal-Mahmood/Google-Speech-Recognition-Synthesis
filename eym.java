/*
 * Decompiled with CFR 0.152.
 */
public final class eym {
    public Boolean a;
    public boolean b = false;
    private final gzs c = new gzs();
    private final gzs d = new gzs();

    public final eyn a() {
        a.s(this.a, "Must call internal() or external() when building a SourcePolicy.");
        return new eyn(this.a, this.b, this.c.g(), this.d.g());
    }

    public final void b(eyr eyr2) {
        a.s(this.a, "Must call internal() or external() before appending rules.");
        this.c.h(eyr2);
    }

    public final void c() {
        boolean bl2 = this.a == null;
        fxf.B(bl2, "A SourcePolicy can only set internal() or external() once.");
        this.a = false;
    }
}

