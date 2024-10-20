/*
 * Decompiled with CFR 0.152.
 */
public final class imc
implements imb,
iku {
    private static final imc b = new imc(null);
    public final Object a;

    private imc(Object object) {
        this.a = object;
    }

    public static imb a(Object object) {
        a.r(object, "instance cannot be null");
        return new imc(object);
    }

    public static imb c(Object object) {
        object = object == null ? b : new imc(object);
        return object;
    }

    @Override
    public final Object b() {
        return this.a;
    }
}

