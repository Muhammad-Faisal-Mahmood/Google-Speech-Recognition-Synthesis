/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import java.util.List;

public final class fbc
implements hny {
    public final int a;
    public final Object b;
    private final int c;

    public /* synthetic */ fbc(Object object, int n2, int n3) {
        this.c = n3;
        this.b = object;
        this.a = n2;
    }

    @Override
    public final hpn a(Object object) {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    object = (Throwable)object;
                    n2 = this.a;
                    return ((gbq)this.b).d(n2);
                }
                object = (Void)object;
                Object object2 = gam.a.l();
                n2 = this.a;
                n2 = n2 == -1 ? 1 : ++n2;
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object = this.b;
                gam gam2 = (gam)((hwp)object2).b;
                gam2.b = 1 | gam2.b;
                gam2.c = n2;
                object2 = hhk.K((gam)((hwp)object2).o());
                return ((bzq)object).H((hpn)object2);
            }
            czd czd2 = (czd)this.b;
            cwk cwk2 = czd2.a;
            object = (List)object;
            n2 = this.a;
            return fxf.ak(cwk2.e(), new cyz(czd2, (List)object, n2), czd2.e);
        }
        object = Collection$_EL.stream((gzx)object).filter(new fbd(this.a, 0)).map(new bof(this.b, 15));
        n2 = gzx.d;
        return hhk.K((gzx)object.collect(gye.a));
    }
}

