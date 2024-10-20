/*
 * Decompiled with CFR 0.152.
 */
public final class kaz
extends jvm
implements jqp,
jqb {
    public final juy a;
    public final jqb b;
    public Object c;
    public final Object d;
    public final juc f;

    public kaz(juy juy2, jqb jqb2) {
        super(-1);
        this.a = juy2;
        this.b = jqb2;
        this.c = kba.a;
        this.d = kbv.a(this.d());
        this.f = new juc(null, jud.a);
    }

    public final void a(jqf jqf2, Object object) {
        this.c = object;
        this.e = 1;
        this.a.f(jqf2, this);
    }

    /*
     * Loose catch block
     */
    @Override
    public final void bD(Object object) {
        Object object2 = jsl.n(object);
        if (this.a.b(this.d())) {
            this.c = object2;
            this.e = 0;
            this.a.a(this.d(), this);
            return;
        }
        boolean bl2 = jve.a;
        Object object3 = jxc.a;
        object3 = jxc.a();
        if (((jvt)object3).o()) {
            this.c = object2;
            this.e = 0;
            ((jvt)object3).m(this);
            return;
        }
        ((jvt)object3).n(true);
        object2 = this.d();
        Object object4 = kbv.b((jqf)object2, this.d);
        this.b.bD(object);
        kbv.c((jqf)object2, object4);
        while (bl2 = ((jvt)object3).q()) {
        }
        ((jvt)object3).l(true);
        return;
        {
            catch (Throwable throwable) {
                try {
                    this.E(throwable);
                    return;
                }
                finally {
                    ((jvt)object3).l(true);
                }
            }
        }
        catch (Throwable throwable) {
            kbv.c((jqf)object2, object4);
            throw throwable;
        }
    }

    @Override
    public final jqp bx() {
        return this.b;
    }

    @Override
    public final void by() {
    }

    @Override
    public final jqf d() {
        return this.b.d();
    }

    @Override
    public final Object g() {
        Object object = this.c;
        boolean bl2 = jve.a;
        this.c = kba.a;
        return object;
    }

    @Override
    public final jqb l() {
        return this;
    }

    public final String toString() {
        String string = jvf.c(this.b);
        StringBuilder stringBuilder = new StringBuilder("DispatchedContinuation[");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

