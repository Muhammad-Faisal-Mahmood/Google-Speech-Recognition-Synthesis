/*
 * Decompiled with CFR 0.152.
 */
public final class dgz
implements dau {
    public final ddn a;
    public final den b;
    public final ddn c;
    public final Throwable d;
    public final kpo e;
    private final int f;

    public /* synthetic */ dgz(kpo kpo2, ddn ddn2, den den2, ddn ddn3, Throwable throwable, int n2) {
        this.f = n2;
        this.e = kpo2;
        this.a = ddn2;
        this.b = den2;
        this.c = ddn3;
        this.d = throwable;
    }

    @Override
    public final void a(Object object) {
        if (this.f != 0) {
            Object object2 = this.e;
            object = (bzq)object;
            Object object3 = this.b;
            Object object4 = this.c;
            object3 = object3.e();
            object4 = ((dfu)((kpo)object2).c).i((ddn)object4);
            object2 = this.d;
            ((bzq)object).t(this.a, (ded)object3, (String)object4, (Throwable)object2);
            return;
        }
        Object object5 = this.e;
        object = (bzq)object;
        Object object6 = this.b;
        Object object7 = this.c;
        object6 = object6.e();
        object7 = ((dfu)((kpo)object5).c).i((ddn)object7);
        object5 = this.d;
        ((bzq)object).s(this.a, (ded)object6, (String)object7, (Throwable)object5);
    }
}

