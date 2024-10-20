/*
 * Decompiled with CFR 0.152.
 */
public final class iyk
implements Runnable {
    final Object a;
    final Object b;
    final Object c;
    private final int d;

    public iyk(iym iym2, iyl iyl2, Runnable runnable, int n2) {
        this.d = n2;
        this.a = iyl2;
        this.b = runnable;
        this.c = iym2;
    }

    public iyk(jsj jsj2, gpc gpc2, Runnable runnable, int n2) {
        this.d = n2;
        this.b = jsj2;
        this.a = gpc2;
        this.c = runnable;
    }

    @Override
    public final void run() {
        if (this.d != 0) {
            if ((grc)((jsj)this.b).a == null) {
                Object object = this.a;
                Object object2 = this.c;
                goz goz2 = gno.a();
                object = gno.f(goz2, (gpc)object);
                try {
                    object2.run();
                }
                catch (Throwable throwable) {
                    try {
                        gne.c(throwable);
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        gno.f(goz2, (gpc)object);
                        throw throwable2;
                    }
                }
                gno.f(goz2, (gpc)object);
                return;
            }
            throw null;
        }
        Object object = this.c;
        Object object3 = this.a;
        ((iym)object).execute((Runnable)object3);
    }

    public final String toString() {
        if (this.d != 0) {
            StringBuilder stringBuilder = new StringBuilder("propagating=[");
            stringBuilder.append(this.c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}

