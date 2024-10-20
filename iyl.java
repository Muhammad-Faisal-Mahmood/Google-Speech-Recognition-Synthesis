/*
 * Decompiled with CFR 0.152.
 */
public final class iyl
implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public iyl(Runnable runnable) {
        this.a = runnable;
    }

    @Override
    public final void run() {
        if (!this.b) {
            this.c = true;
            this.a.run();
        }
    }
}

