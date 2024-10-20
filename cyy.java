/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class cyy
implements hnx {
    public final int a;
    public final Object b;
    private final int c;

    public /* synthetic */ cyy(Object object, int n2, int n3) {
        this.c = n3;
        this.b = object;
        this.a = n2;
    }

    @Override
    public final hpn a() {
        int n2 = this.c;
        if (n2 != 0) {
            if (n2 != 1) {
                n2 = this.a;
                return ((gbq)this.b).d(n2);
            }
            czh czh2 = (czh)this.b;
            Object object = czh2.b;
            n2 = this.a;
            return fxf.ak(object.c(), new cyq(czh2, n2), (Executor)czh2.d);
        }
        Object object = this.b;
        czd czd2 = (czd)object;
        return dah.e(czd2.a.c()).g(new fbc(object, this.a, 1), czd2.e);
    }
}

