/*
 * Decompiled with CFR 0.152.
 */
public final class jxl
implements jvq {
    public final jxm a;
    public final Runnable b;

    public /* synthetic */ jxl(jxm jxm2, Runnable runnable) {
        this.a = jxm2;
        this.b = runnable;
    }

    @Override
    public final void bu() {
        this.a.a.removeCallbacks(this.b);
    }
}

