/*
 * Decompiled with CFR 0.152.
 */
public final class gog
implements gpf {
    public final gpf a;
    public final gpf b;
    public final gpc c;

    public /* synthetic */ gog(gpf gpf2, gpf gpf3, gpc gpc2) {
        this.a = gpf2;
        this.b = gpf3;
        this.c = gpc2;
    }

    @Override
    public final void close() {
        this.a.close();
        gpf gpf2 = this.b;
        if (gpf2 != null) {
            gpf2.close();
        }
        gno.w(this.c);
    }
}

