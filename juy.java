/*
 * Decompiled with CFR 0.152.
 */
public abstract class juy
extends jpw
implements jqc {
    public static final jpx c = new jpx(jqc.b, ero.r);

    public juy() {
        super(jqc.b);
    }

    public abstract void a(jqf var1, Runnable var2);

    public boolean b(jqf jqf2) {
        return true;
    }

    @Override
    public final jqb bs(jqb jqb2) {
        return new kaz(this, jqb2);
    }

    @Override
    public final void d(jqb object) {
        object = (kaz)object;
        juc juc2 = ((kaz)object).f;
        while (juc2.a == kba.b) {
        }
        object = ((kaz)object).f.a;
        object = object instanceof jul ? (jul)object : null;
        if (object != null) {
            ((jul)object).o();
        }
    }

    public void f(jqf jqf2, Runnable runnable) {
        this.a(jqf2, runnable);
    }

    @Override
    public final jqd get(jqe object) {
        jse.e(object, "key");
        if (object instanceof jpx) {
            if (((jpx)(object = (jpx)object)).b(this.getKey()) && (object = ((jpx)object).a(this)) instanceof jqd) {
                return object;
            }
        } else if (jqc.b == object) {
            return this;
        }
        return null;
    }

    @Override
    public final jqf minusKey(jqe jqe2) {
        jse.e(jqe2, "key");
        if (jqe2 instanceof jpx ? ((jpx)(jqe2 = (jpx)jqe2)).b(this.getKey()) && ((jpx)jqe2).a(this) != null : jqc.b == jqe2) {
            return jqg.a;
        }
        return this;
    }

    public String toString() {
        String string = jvf.a(this);
        String string2 = jvf.b(this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("@");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

