/*
 * Decompiled with CFR 0.152.
 */
final class hpu
extends hnf
implements Runnable {
    private final Runnable a;

    public hpu(Runnable runnable) {
        fxf.K(runnable);
        this.a = runnable;
    }

    @Override
    protected final String a() {
        String string = this.a.toString();
        StringBuilder stringBuilder = new StringBuilder("task=[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public final void run() {
        try {
            this.a.run();
            return;
        }
        catch (Throwable throwable) {
            this.n(throwable);
            throw throwable;
        }
    }
}

