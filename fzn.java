/*
 * Decompiled with CFR 0.152.
 */
public final class fzn
implements gte {
    public final fzp a;
    public final long b;

    public /* synthetic */ fzn(fzp fzp2, long l2) {
        this.a = fzp2;
        this.b = l2;
    }

    @Override
    public final Object apply(Object object) {
        object = (fzq)object;
        int n2 = ((fzq)object).b;
        long l2 = this.b;
        if ((n2 & 1) != 0 || (n2 & 2) == 0 || ((fzq)object).d <= l2) {
            hwp hwp2 = (hwp)((hwv)object).C(5);
            hwp2.x((hwv)object);
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = this.a;
            hwv hwv2 = hwp2.b;
            fzq fzq2 = (fzq)hwv2;
            fzq2.b |= 1;
            fzq2.c = l2;
            if (!hwv2.B()) {
                hwp2.u();
            }
            n2 = ((fzp)object).b;
            hwv2 = hwp2.b;
            object = (fzq)hwv2;
            ((fzq)object).b |= 4;
            ((fzq)object).e = n2;
            if (!hwv2.B()) {
                hwp2.u();
            }
            object = (fzq)hwp2.b;
            ((fzq)object).b &= 0xFFFFFFFD;
            ((fzq)object).d = 0L;
            object = (fzq)hwp2.o();
        }
        return object;
    }
}

