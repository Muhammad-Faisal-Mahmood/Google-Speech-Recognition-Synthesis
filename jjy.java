/*
 * Decompiled with CFR 0.152.
 */
final class jjy
extends jka {
    final jkb a;

    public jjy(jkb jkb2) {
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
        kmi kmi2 = new klm();
        int n2 = jnr.a;
        Object object = this.a.a;
        synchronized (object) {
            kmi kmi3 = this.a.b;
            kmi2.bK((klm)kmi3, kmi3.g());
            kmi3 = this.a;
            ((jkb)kmi3).d = false;
            n2 = ((jkb)kmi3).i;
        }
        this.a.f.bK((klm)kmi2, kmi2.b);
        object = this.a.a;
        synchronized (object) {
            kmi2 = this.a;
            ((jkb)kmi2).i -= n2;
            return;
        }
    }
}

