/*
 * Decompiled with CFR 0.152.
 */
final class cul
implements hpb {
    final boolean a;
    final String b;
    final cuq c;

    public cul(cuq cuq2, boolean bl2, String string) {
        this.a = bl2;
        this.b = string;
        this.c = cuq2;
    }

    @Override
    public final void a(Throwable throwable) {
        if (this.a) {
            ((daa)this.c.e.c()).i(this.b);
        }
    }
}

