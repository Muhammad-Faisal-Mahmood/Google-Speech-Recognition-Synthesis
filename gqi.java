/*
 * Decompiled with CFR 0.152.
 */
public final class gqi
implements gte {
    final gpc a;
    final gte b;

    public gqi(gpc gpc2, gte gte2) {
        this.a = gpc2;
        this.b = gte2;
    }

    @Override
    public final Object apply(Object object) {
        goz goz2 = gno.a();
        gpc gpc2 = gno.f(goz2, this.a);
        gte gte2 = this.b;
        try {
            object = gte2.apply(object);
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

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("propagating=[");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

