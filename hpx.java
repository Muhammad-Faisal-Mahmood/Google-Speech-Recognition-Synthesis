/*
 * Decompiled with CFR 0.152.
 */
final class hpx
implements Runnable {
    final Runnable a;

    public hpx(Runnable runnable) {
        this.a = runnable;
    }

    @Override
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}

