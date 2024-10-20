/*
 * Decompiled with CFR 0.152.
 */
public final class dce
implements dau {
    public final String a;
    public final int b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ dce(ddn ddn2, den den2, String string, int n2, int n3) {
        this.e = n3;
        this.c = ddn2;
        this.d = den2;
        this.a = string;
        this.b = n2;
    }

    public /* synthetic */ dce(String string, int n2, String string2, dbo dbo2, int n3) {
        this.e = n3;
        this.d = string;
        this.b = n2;
        this.a = string2;
        this.c = dbo2;
    }

    @Override
    public final void a(Object object) {
        if (this.e != 0) {
            object = (bzq)object;
            int n2 = this.b;
            ded ded2 = ded.c((String)this.d, n2);
            Object object2 = this.c;
            ((bzq)object).n(ded2, this.a, (Throwable)object2);
            return;
        }
        int n3 = this.b;
        boolean bl2 = true;
        if (n3 != 1) {
            bl2 = false;
        }
        bzq bzq2 = (bzq)object;
        object = ((den)this.d).e();
        String string = this.a;
        bzq2.o((ddn)this.c, (ded)object, string, bl2);
    }
}

