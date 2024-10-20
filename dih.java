/*
 * Decompiled with CFR 0.152.
 */
public final class dih
implements dgw {
    private final cxv a;

    public dih(cxv cxv2) {
        this.a = cxv2;
    }

    @Override
    public final void a(ddn object, String string, ded ded2, long l2) {
        object = new dgt((ddn)object, string, ded2, l2, 3);
        this.a.a((dau)object);
    }

    @Override
    public final void b(ddn object, String string, ded ded2, Throwable throwable) {
        object = new dbd((ddn)object, string, ded2, throwable, 4);
        this.a.a((dau)object);
    }

    @Override
    public final void c(ddn object, String string, ded ded2, long l2, long l3) {
        object = new dif((ddn)object, string, ded2, l2, l3);
        this.a.a((dau)object);
    }

    @Override
    public final void d(ddn object, String string, ded ded2, long l2, dds dds2) {
        object = new die((ddn)object, string, ded2, l2, dds2, 0);
        this.a.a((dau)object);
    }

    @Override
    public final void e(ddn object, String string, ded ded2, long l2) {
        object = new dgt((ddn)object, string, ded2, l2, 2);
        this.a.a((dau)object);
    }

    @Override
    public final void f(ddn object, boolean bl2) {
        object = new dig((ddn)object, bl2);
        this.a.a((dau)object);
    }

    @Override
    public final void g() {
        throw null;
    }
}

