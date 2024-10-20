/*
 * Decompiled with CFR 0.152.
 */
public final class goh
implements gpf {
    public final goi a;
    public final gpf b;
    public final gpf c;
    public final gpc d;

    public /* synthetic */ goh(goi goi2, gpf gpf2, gpf gpf3, gpc gpc2) {
        this.a = goi2;
        this.b = gpf2;
        this.c = gpf3;
        this.d = gpc2;
    }

    @Override
    public final void close() {
        this.b.close();
        Object object = this.a.b;
        if (object != null) {
            object.close();
        }
        if ((object = this.c) != null) {
            object.close();
        }
        gno.w(this.d);
    }
}

