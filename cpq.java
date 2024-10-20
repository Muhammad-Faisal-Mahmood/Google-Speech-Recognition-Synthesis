/*
 * Decompiled with CFR 0.152.
 */
public final class cpq
implements Runnable {
    public final Runnable a;
    public final cpr b;

    public cpq(cpr cpr2, Runnable runnable) {
        this.b = cpr2;
        this.a = runnable;
    }

    @Override
    public final void run() {
        Object object = new ckr((Object)this, (Object)Thread.currentThread(), 14, null);
        cpr cpr2 = this.b;
        cpr2.c.f();
        object = cpr2.e.b((Runnable)object, 1L, this.b.c.g());
        try {
            this.a.run();
            return;
        }
        finally {
            object.cancel(false);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

