/*
 * Decompiled with CFR 0.152.
 */
final class jwn
extends jwl {
    private final jwp a;
    private final jwo f;
    private final juq g;
    private final Object h;

    public jwn(jwp jwp2, jwo jwo2, juq juq2, Object object) {
        this.a = jwp2;
        this.f = jwo2;
        this.g = juq2;
        this.h = object;
    }

    @Override
    public final void a(Throwable object) {
        jwo jwo2;
        jwp jwp2;
        block3: {
            block2: {
                boolean bl2 = jve.a;
                jwp2 = this.a;
                jwo2 = this.f;
                juq juq2 = this.g;
                juq juq3 = jwp2.F(juq2);
                object = this.h;
                if (juq3 != null && jwp2.P(jwo2, juq3, object)) break block2;
                jwo2.a.j(2);
                juq2 = jwp2.F(juq2);
                if (juq2 == null || !jwp2.P(jwo2, juq2, object)) break block3;
            }
            return;
        }
        jwp2.bG(jwp2.z(jwo2, object));
    }

    @Override
    public final boolean b() {
        return false;
    }
}

