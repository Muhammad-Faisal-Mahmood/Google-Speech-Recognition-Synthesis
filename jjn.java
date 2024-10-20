/*
 * Decompiled with CFR 0.152.
 */
public final class jjn
implements jgp {
    private final int a;
    private final Object b;

    public jjn(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final Object a() {
        if (this.a != 0) {
            return this.b;
        }
        return jjm.a((jjl)this.b);
    }

    @Override
    public final void b(Object object) {
        if (this.a != 0) {
            return;
        }
        jjm.d((jjl)this.b, object);
    }
}

