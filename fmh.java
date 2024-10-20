/*
 * Decompiled with CFR 0.152.
 */
public final class fmh
implements gte {
    public final boolean a;

    public /* synthetic */ fmh(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public final Object apply(Object object) {
        fmg fmg2 = (fmg)object;
        object = (hwp)fmg2.C(5);
        ((hwp)object).x(fmg2);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        boolean bl2 = this.a;
        fmg fmg3 = (fmg)((hwp)object).b;
        fmg2 = fmg.a;
        fmg3.b |= 1;
        fmg3.c = bl2;
        return (fmg)((hwp)object).o();
    }
}

