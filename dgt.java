/*
 * Decompiled with CFR 0.152.
 */
public final class dgt
implements dau {
    public final ddn a;
    public final String b;
    public final long c;
    public final Object d;
    private final int e;

    public /* synthetic */ dgt(ddn ddn2, String string, Object object, long l2, int n2) {
        this.e = n2;
        this.a = ddn2;
        this.b = string;
        this.d = object;
        this.c = l2;
    }

    @Override
    public final void a(Object object) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    dgw dgw2 = (dgw)object;
                    long l2 = this.c;
                    Object object2 = this.d;
                    object = this.b;
                    dgw2.a(this.a, (String)object, (ded)object2, l2);
                    return;
                }
                dgw dgw3 = (dgw)object;
                long l3 = this.c;
                object = this.d;
                String string = this.b;
                dgw3.e(this.a, string, (ded)object, l3);
                return;
            }
            dgw dgw4 = (dgw)object;
            long l4 = this.c;
            object = this.d;
            String string = this.b;
            dgw4.a(this.a, string, (ded)object, l4);
            return;
        }
        object = (dgw)object;
        ded ded2 = ((den)this.d).e();
        long l5 = this.c;
        String string = this.b;
        object.e(this.a, string, ded2, l5);
    }
}

