/*
 * Decompiled with CFR 0.152.
 */
final class jeo
extends jds {
    final jcj a;
    final jep b;

    public jeo(jep jep2, jcj jcj2) {
        this.a = jcj2;
        this.b = jep2;
    }

    @Override
    public final void m(jcl jcl2) {
        this.b.a.b();
        jcl2 = new jen(this, jcl2);
        this.a.m(jcl2);
    }

    @Override
    protected final jcj p() {
        return this.a;
    }
}

