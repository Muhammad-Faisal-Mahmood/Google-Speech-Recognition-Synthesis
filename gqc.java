/*
 * Decompiled with CFR 0.152.
 */
public final class gqc
implements hoe {
    public final gpc a;
    public final hoe b;

    public /* synthetic */ gqc(gpc gpc2, hoe hoe2) {
        this.a = gpc2;
        this.b = hoe2;
    }

    @Override
    public final Object a(bzq object, Object object2) {
        jse.e(object, "closer");
        goz goz2 = gno.a();
        gpc gpc2 = gno.f(goz2, this.a);
        hoe hoe2 = this.b;
        try {
            object = hoe2.a((bzq)object, object2);
        }
        catch (Throwable throwable) {
            try {
                gne.c(throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                gno.f(goz2, gpc2);
                throw throwable2;
            }
        }
        gno.f(goz2, gpc2);
        return object;
    }
}

