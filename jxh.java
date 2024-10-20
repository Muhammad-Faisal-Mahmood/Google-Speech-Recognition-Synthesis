/*
 * Decompiled with CFR 0.152.
 */
public final class jxh
extends kbq {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    public jxh(jqf jqf2, jqb object) {
        jqf jqf3 = jqf2.get(jxi.a) == null ? jqf2.plus(jxi.a) : jqf2;
        super(jqf3, (jqb)object);
        this.b = new ThreadLocal();
        if (!(object.d().get(jqc.b) instanceof juy)) {
            object = kbv.b(jqf2, null);
            kbv.c(jqf2, object);
            this.R(jqf2, object);
        }
    }

    public final void R(jqf object, Object object2) {
        this.threadLocalIsSet = true;
        object = new joc(object, object2);
        this.b.set(object);
    }

    public final boolean S() {
        boolean bl2 = this.threadLocalIsSet && this.b.get() == null;
        this.b.remove();
        return !bl2;
    }

    @Override
    protected final void bB(Object object) {
        Object object2;
        Object object3;
        block6: {
            if (this.threadLocalIsSet) {
                object3 = (joc)this.b.get();
                if (object3 != null) {
                    kbv.c((jqf)((joc)object3).a, ((joc)object3).b);
                }
                this.b.remove();
            }
            Object object4 = jsl.m(object, this.e);
            jqb jqb2 = this.e;
            object3 = jqb2.d();
            object = null;
            object2 = kbv.b((jqf)object3, null);
            if (object2 != kbv.a) {
                object = jux.c(jqb2, (jqf)object3, object2);
            }
            try {
                this.e.bD(object4);
                if (object == null || ((jxh)object).S()) break block6;
                return;
            }
            catch (Throwable throwable) {
                if (object == null || ((jxh)object).S()) {
                    kbv.c((jqf)object3, object2);
                }
                throw throwable;
            }
        }
        kbv.c((jqf)object3, object2);
    }
}

