/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.List;

public final class cxi
implements hny {
    public final ctt a;
    public final cti b;
    public final List c;
    public final int d;
    public final int e;
    public final egg f;

    public /* synthetic */ cxi(egg egg2, ctt ctt2, cti cti2, List list, int n2, int n3) {
        this.f = egg2;
        this.a = ctt2;
        this.b = cti2;
        this.c = list;
        this.d = n2;
        this.e = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a(Object object) {
        int n2;
        egg egg2 = this.f;
        Object object2 = (ctv)object;
        if (object2 != null) {
            Object object3;
            object = object3 = ctp.b(((ctv)object2).d);
            if (object3 == null) {
                object = ctp.a;
            }
            if (object == ctp.e) {
                Object object4;
                Object object5 = this.a;
                object = egg2.k;
                n2 = a.t(((ctt)object5).f);
                if (n2 == 0) {
                    n2 = 1;
                }
                if (crh.f((Context)object, n2, (String)(object3 = ((ctv)object2).c), (String)(object5 = ((ctt)object5).e), (cuv)(object4 = egg2.d), (gto)(object2 = (gto)egg2.l), false) != null) {
                    return hhk.K(this.b);
                }
            }
        }
        int n3 = this.e;
        n2 = this.d;
        return egg2.r(this.c, n2 + 1, n3);
    }
}

