/*
 * Decompiled with CFR 0.152.
 */
public final class bcw
extends jqs
implements jrq {
    int a;
    public Object b;
    public long c;

    public bcw(jqb jqb2) {
        super(4, jqb2);
    }

    @Override
    public final Object a(Object object) {
        jqh jqh2 = jqh.a;
        int n2 = this.a;
        jns.ak(object);
        if (n2 == 0) {
            object = this.b;
            long l2 = this.c;
            bbi.a().d(bcy.a, "Cannot check for unfinished work", (Throwable)object);
            l2 = Math.min(l2 * 30000L, bcy.b);
            this.a = 1;
            if (jvf.d(l2, this) == jqh2) {
                return jqh2;
            }
        }
        return true;
    }
}

