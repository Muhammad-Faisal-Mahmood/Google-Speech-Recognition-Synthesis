/*
 * Decompiled with CFR 0.152.
 */
public final class hnq
implements Runnable {
    public final hns a;
    public final gzm b;

    public /* synthetic */ hnq(hns hns2, gzm gzm2) {
        this.a = hns2;
        this.b = gzm2;
    }

    @Override
    public final void run() {
        this.a.f(this.b);
    }
}

