/*
 * Decompiled with CFR 0.152.
 */
public final class gqj
implements hpb {
    final gpc a;
    final hpb b;

    public gqj(gpc gpc2, hpb hpb2) {
        this.a = gpc2;
        this.b = hpb2;
    }

    @Override
    public final void a(Throwable throwable) {
        jse.e(throwable, "t");
        goz goz2 = gno.a();
        gpc gpc2 = gno.f(goz2, this.a);
        hpb hpb2 = this.b;
        try {
            hpb2.a(throwable);
        }
        catch (Throwable throwable2) {
            try {
                gne.c(throwable2);
                throw throwable2;
            }
            catch (Throwable throwable3) {
                gno.f(goz2, gpc2);
                throw throwable3;
            }
        }
        gno.f(goz2, gpc2);
    }

    @Override
    public final void b(Object object) {
        goz goz2 = gno.a();
        gpc gpc2 = gno.f(goz2, this.a);
        hpb hpb2 = this.b;
        try {
            hpb2.b(object);
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
    }
}

