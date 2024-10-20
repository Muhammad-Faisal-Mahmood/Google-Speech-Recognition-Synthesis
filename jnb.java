/*
 * Decompiled with CFR 0.152.
 */
public final class jnb
implements ixy {
    private final jmz a;

    public jnb(jmz jmz2) {
        this.a = jmz2;
    }

    @Override
    public final kmp a(ixx ixx2, iwx object) {
        object = new jmy(ixx2, true);
        Object object2 = (fdd)this.a;
        if (((fdd)object2).a == 3) {
            object2 = ((fhp)((fdd)object2).b).a((jnf)object);
            ((jmy)object).d();
            if (((jmy)object).c) {
                ixx2.d(1);
            }
            return new jna((jnf)object2, (jmy)object, ixx2);
        }
        throw new AssertionError();
    }
}

