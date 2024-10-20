/*
 * Decompiled with CFR 0.152.
 */
final class kru
implements Runnable {
    public Thread a;
    public kor b;
    private final Runnable c;

    public kru(Runnable runnable, Thread thread) {
        this.c = runnable;
        this.a = thread;
    }

    @Override
    public final void run() {
        if (Thread.currentThread() == this.a) {
            this.b = new kor();
            return;
        }
        this.c.run();
    }
}

