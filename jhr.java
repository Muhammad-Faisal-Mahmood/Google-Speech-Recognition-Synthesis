/*
 * Decompiled with CFR 0.152.
 */
final class jhr
implements jhu {
    final int a;
    private final int b;

    public jhr(int n2, int n3) {
        this.b = n3;
        this.a = n2;
    }

    @Override
    public final void a(jib jib2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                jib2.a.g(this.a);
                return;
            }
            jib2.a.k(this.a);
            return;
        }
        jib2.a.l(this.a);
    }
}

