/*
 * Decompiled with CFR 0.152.
 */
public final class jqj
extends jqo {
    final jro a;
    final Object b;
    private int c;

    public jqj(jqb jqb2, jqf jqf2, jro jro2, Object object) {
        this.a = jro2;
        this.b = object;
        super(jqb2, jqf2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final Object a(Object object) {
        int n2 = this.c;
        if (n2 == 0) {
            this.c = 1;
            jns.ak(object);
            object = this.a;
            jsl.c(object, 2);
            return object.b(this.b, this);
        }
        if (n2 != 1) throw new IllegalStateException("This coroutine had already completed");
        this.c = 2;
        jns.ak(object);
        return object;
    }
}

