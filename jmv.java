/*
 * Decompiled with CFR 0.152.
 */
final class jmv
extends jmr {
    private final jmq a;
    private Object b;
    private boolean c = false;

    public jmv(jmq jmq2) {
        this.a = jmq2;
    }

    @Override
    public final void W(iwx iwx2) {
    }

    @Override
    public final void X(Object object) {
        if (!this.c) {
            this.b = object;
            this.c = true;
            return;
        }
        throw new iyj(iyh.j.e("More than one value received for unary call"));
    }

    @Override
    public final void a(iyh iyh2, iwx iwx2) {
        if (iyh2.g()) {
            if (!this.c) {
                this.a.n(new iyj(iyh.j.e("No value received for unary call"), iwx2));
            }
            this.a.m(this.b);
            return;
        }
        this.a.n(new iyj(iyh2, iwx2));
    }

    @Override
    public final void aI() {
        this.a.a.e(2);
    }
}

