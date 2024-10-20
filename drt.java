/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class drt
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;

    public drt(jnu jnu2, jnu jnu3, jnu jnu4) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
    }

    public final gto a() {
        gto gto2 = (gto)((imc)this.a).a;
        Object object = (gto)((imc)this.b).a;
        if (!gto2.g() && !((gto)object).g()) {
            object = gsl.a;
        } else {
            object = this.c;
            Objects.requireNonNull(object);
            object = gto.i(new dan(object, 4));
        }
        return object;
    }
}

