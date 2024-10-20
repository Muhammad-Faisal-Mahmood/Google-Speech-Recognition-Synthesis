/*
 * Decompiled with CFR 0.152.
 */
final class jhp
implements jhu {
    final Object a;
    private final int b;

    public jhp(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final void a(jib jib2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                jib2.a.j((iuw)this.a);
                return;
            }
            jib2.a.h((iuf)this.a);
            return;
        }
        jib2.a.i((iut)this.a);
    }
}

