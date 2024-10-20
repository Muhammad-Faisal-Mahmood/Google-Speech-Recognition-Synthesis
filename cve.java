/*
 * Decompiled with CFR 0.152.
 */
final class cve
implements Runnable {
    final cvf a;
    private final Runnable b;

    public cve(cvf cvf2, Runnable runnable) {
        this.a = cvf2;
        this.b = runnable;
    }

    @Override
    public final void run() {
        try {
            this.b.run();
            return;
        }
        finally {
            this.a.a();
        }
    }
}

