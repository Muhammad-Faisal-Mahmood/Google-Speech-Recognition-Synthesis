/*
 * Decompiled with CFR 0.152.
 */
public final class com
implements Runnable {
    public final Runnable a;
    public final hqa b;

    public /* synthetic */ com(Runnable runnable, hqa hqa2) {
        this.a = runnable;
        this.b = hqa2;
    }

    @Override
    public final void run() {
        int n2 = cos.b;
        Runnable runnable = this.a;
        try {
            runnable.run();
            return;
        }
        catch (Throwable throwable) {
            this.b.n(throwable);
            return;
        }
    }
}

