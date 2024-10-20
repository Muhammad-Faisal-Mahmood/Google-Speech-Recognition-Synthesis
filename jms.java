/*
 * Decompiled with CFR 0.152.
 */
public final class jms
extends jmr {
    private final jnf a;
    private final jmp b;

    public jms(jnf jnf2, jmp jmp2) {
        this.a = jnf2;
        this.b = jmp2;
    }

    @Override
    public final void W(iwx iwx2) {
    }

    @Override
    public final void X(Object object) {
        this.a.c(object);
        this.b.d();
    }

    @Override
    public final void Y() {
    }

    @Override
    public final void a(iyh iyh2, iwx iwx2) {
        if (iyh2.g()) {
            this.a.a();
            return;
        }
        this.a.b(new iyj(iyh2, iwx2));
    }

    @Override
    public final void aI() {
        this.b.d();
    }
}

