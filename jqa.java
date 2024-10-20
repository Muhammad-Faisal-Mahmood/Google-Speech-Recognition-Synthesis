/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class jqa
implements Serializable,
jqf {
    private final jqf a;
    private final jqd b;

    public jqa(jqf jqf2, jqd jqd2) {
        jse.e(jqf2, "left");
        jse.e(jqd2, "element");
        this.a = jqf2;
        this.b = jqd2;
    }

    private final int a() {
        int n2 = 2;
        jqf jqf2 = this;
        while (true) {
            if (!((jqf2 = jqf2.a) instanceof jqa)) {
                jqf2 = null;
            }
            if (jqf2 == null) {
                return n2;
            }
            ++n2;
        }
    }

    private final boolean b(jqd jqd2) {
        return jse.i(this.get(jqd2.getKey()), jqd2);
    }

    private final Object writeReplace() {
        int n2 = this.a();
        jqf[] jqfArray = new jqf[n2];
        jsi jsi2 = new jsi();
        this.fold(jon.a, new jpz(jqfArray, jsi2));
        if (jsi2.a == n2) {
            return new jpy(jqfArray);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block4: {
            boolean bl3;
            bl2 = bl3 = true;
            if (this != object) {
                jqa jqa2;
                if (object instanceof jqa && (jqa2 = (jqa)object).a() == this.a()) {
                    object = this;
                    while (jqa2.b(((jqa)object).b)) {
                        object = ((jqa)object).a;
                        if (object instanceof jqa) {
                            object = (jqa)object;
                            continue;
                        }
                        jse.c(object, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        if (!jqa2.b((jqd)object)) break;
                        bl2 = bl3;
                        break block4;
                    }
                    return false;
                }
                bl2 = false;
            }
        }
        return bl2;
    }

    @Override
    public final Object fold(Object object, jro jro2) {
        return jro2.b(this.a.fold(object, jro2), this.b);
    }

    @Override
    public final jqd get(jqe jqe2) {
        jse.e(jqe2, "key");
        jqf jqf2 = this;
        do {
            jqd jqd2;
            if ((jqd2 = ((jqa)jqf2).b.get(jqe2)) == null) continue;
            return jqd2;
        } while ((jqf2 = ((jqa)jqf2).a) instanceof jqa);
        return jqf2.get(jqe2);
    }

    public final int hashCode() {
        jqd jqd2 = this.b;
        return this.a.hashCode() + jqd2.hashCode();
    }

    @Override
    public final jqf minusKey(jqe object) {
        jse.e(object, "key");
        if (this.b.get((jqe)object) != null) {
            return this.a;
        }
        object = (object = this.a.minusKey((jqe)object)) != this.a ? (object == jqg.a ? this.b : new jqa((jqf)object, this.b)) : this;
        return object;
    }

    @Override
    public final jqf plus(jqf jqf2) {
        return jjj.s(this, jqf2);
    }

    public final String toString() {
        Object object = this.fold("", ghk.c);
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

