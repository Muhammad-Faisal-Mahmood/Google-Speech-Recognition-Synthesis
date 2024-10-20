/*
 * Decompiled with CFR 0.152.
 */
public final class dov
implements Runnable {
    public final dow a;
    public final gto b;

    public /* synthetic */ dov(dow dow2, gto gto2) {
        this.a = dow2;
        this.b = gto2;
    }

    @Override
    public final void run() {
        this.a.i(this.b);
    }
}

