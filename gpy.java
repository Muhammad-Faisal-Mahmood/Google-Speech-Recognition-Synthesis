/*
 * Decompiled with CFR 0.152.
 */
public final class gpy
implements gof {
    public final gpc a;
    public final gpc b;
    private final int c;

    public /* synthetic */ gpy(gpc gpc2, gpc gpc3, int n2) {
        this.c = n2;
        this.a = gpc2;
        this.b = gpc3;
    }

    @Override
    public final void close() {
        if (this.c != 0) {
            this.a.close();
            gno.w(this.b);
            return;
        }
        this.a.close();
        gno.w(this.b);
    }
}

