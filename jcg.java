/*
 * Decompiled with CFR 0.152.
 */
final class jcg
extends jcw {
    final jch a;

    public jcg(jch jch2) {
        this.a = jch2;
        super(jch2.b.e);
    }

    @Override
    public final void a() {
        int n2 = jnr.a;
        jch jch2 = this.a;
        if (jch2.a != null) {
            return;
        }
        try {
            jch2.c.Y();
            return;
        }
        catch (Throwable throwable) {
            this.a.b(iyh.c.d(throwable).e("Failed to call onReady."));
            return;
        }
    }
}

