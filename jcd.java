/*
 * Decompiled with CFR 0.152.
 */
final class jcd
extends jcw {
    final iwx a;
    final jch b;

    public jcd(jch jch2, iwx iwx2) {
        this.a = iwx2;
        this.b = jch2;
        super(jch2.b.e);
    }

    @Override
    public final void a() {
        int n2 = jnr.a;
        jch jch2 = this.b;
        if (jch2.a != null) {
            return;
        }
        try {
            jch2.c.W(this.a);
            return;
        }
        catch (Throwable throwable) {
            this.b.b(iyh.c.d(throwable).e("Failed to read headers"));
            return;
        }
    }
}

