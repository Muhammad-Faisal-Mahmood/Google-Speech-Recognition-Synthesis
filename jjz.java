/*
 * Decompiled with CFR 0.152.
 */
final class jjz
extends jka {
    final jkb a;

    public jjz(jkb jkb2) {
        this.a = jkb2;
        super(jkb2);
        int n2 = jnr.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        klm klm2 = new klm();
        int n2 = jnr.a;
        Object object = this.a.a;
        synchronized (object) {
            klm klm3 = this.a.b;
            klm2.bK(klm3, klm3.b);
            this.a.e = false;
        }
        this.a.f.bK(klm2, klm2.b);
        this.a.f.flush();
    }
}

