/*
 * Decompiled with CFR 0.152.
 */
public final class gqd
implements hoc {
    public final gpc a;
    public final hoc b;

    public /* synthetic */ gqd(gpc gpc2, hoc hoc2) {
        this.a = gpc2;
        this.b = hoc2;
    }

    @Override
    public final hog a(bzq object, Object object2) {
        jse.e(object, "closer");
        goz goz2 = gno.a();
        gpc gpc2 = gno.f(goz2, this.a);
        hoc hoc2 = this.b;
        try {
            object = hoc2.a((bzq)object, object2);
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

