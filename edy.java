/*
 * Decompiled with CFR 0.152.
 */
public final class edy
implements edx {
    public final edx a;
    public final int b;

    public /* synthetic */ edy(edx edx2, int n2) {
        this.a = edx2;
        this.b = n2;
    }

    @Override
    public final /* synthetic */ int a(byte[] byArray, int n2, int n3, int n4) {
        return dpg.m(this, byArray, n2, n3, n4);
    }

    @Override
    public final int c(byte[] byArray, int n2, int n3, int n4, int n5) {
        jse.e(byArray, "dest");
        int n6 = this.b;
        return this.a.c(byArray, n2 + n6, n3, n4, n5);
    }
}

