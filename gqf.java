/*
 * Decompiled with CFR 0.152.
 */
public final class gqf
implements Runnable {
    final gpf a;
    final Runnable b;

    public gqf(gpf gpf2, Runnable runnable) {
        this.a = gpf2;
        this.b = runnable;
    }

    @Override
    public final void run() {
        gpf gpf2 = this.a;
        jse.c(gpf2, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        goz goz2 = gno.a();
        gpf2 = gno.f(goz2, (gpc)gpf2);
        Runnable runnable = this.b;
        try {
            runnable.run();
        }
        catch (Throwable throwable) {
            try {
                gne.c(throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                gno.f(goz2, (gpc)gpf2);
                throw throwable2;
            }
        }
        gno.f(goz2, (gpc)gpf2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("propagating=[");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

