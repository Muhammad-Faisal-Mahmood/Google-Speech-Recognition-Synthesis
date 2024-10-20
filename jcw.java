/*
 * Decompiled with CFR 0.152.
 */
abstract class jcw
implements Runnable {
    private final ius a;

    protected jcw(ius ius2) {
        this.a = ius2;
    }

    public abstract void a();

    @Override
    public final void run() {
        ius ius2 = this.a.a();
        try {
            this.a();
            return;
        }
        finally {
            this.a.f(ius2);
        }
    }
}

