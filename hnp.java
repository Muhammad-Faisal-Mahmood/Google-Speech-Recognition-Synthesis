/*
 * Decompiled with CFR 0.152.
 */
public final class hnp
implements Runnable {
    public final hns a;
    public final int b;
    public final hpn c;

    public /* synthetic */ hnp(hns hns2, int n2, hpn hpn2) {
        this.a = hns2;
        this.b = n2;
        this.c = hpn2;
    }

    @Override
    public final void run() {
        this.a.r(this.b, this.c);
    }
}

