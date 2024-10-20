/*
 * Decompiled with CFR 0.152.
 */
public final class dap
implements gte {
    public final String a;
    public final long b;
    public final int c;
    public final cxv d;

    public /* synthetic */ dap(cxv cxv2, String string, long l2, int n2) {
        this.d = cxv2;
        this.a = string;
        this.b = l2;
        this.c = n2;
    }

    @Override
    public final Object apply(Object object) {
        daj daj2 = (daj)object;
        object = daj2.b;
        String string = this.a;
        long l2 = object.containsKey(string) ? (Long)object.get(string) : -1L;
        int n2 = this.c;
        long l3 = this.b;
        object = this.d;
        boolean bl2 = l3 != l2;
        ((cxv)object).e(string, l3, n2, bl2);
        object = daj2;
        if (bl2) {
            object = (hwp)daj2.C(5);
            ((hwp)object).x(daj2);
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            ((daj)((hwp)object).b).b().remove(string);
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            ((daj)((hwp)object).b).b().put(string, l3);
            object = (daj)((hwp)object).o();
        }
        return object;
    }
}

