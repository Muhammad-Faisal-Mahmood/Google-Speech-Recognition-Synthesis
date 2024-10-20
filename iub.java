/*
 * Decompiled with CFR 0.152.
 */
public final class iub
extends itx {
    private final itx a;
    private final iua b;

    public iub(itx itx2, iua iua2) {
        this.a = itx2;
        a.s(iua2, "interceptor");
        this.b = iua2;
    }

    @Override
    public final itz a(ixb ixb2, itw itw2) {
        itx itx2 = this.a;
        return this.b.a(ixb2, itw2, itx2);
    }

    @Override
    public final String b() {
        return this.a.b();
    }
}

