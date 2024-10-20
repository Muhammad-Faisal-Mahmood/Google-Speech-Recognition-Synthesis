/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class dyj
extends doc
implements dyk {
    public final dxx a;
    public final Map b;
    public final Set c;
    public gto d;
    public gto e;
    public gto f;
    public gto g;
    public gto h;
    public gto i;
    public gto j;
    public final hwp k;

    public dyj() {
        throw null;
    }

    public dyj(dxx dxx2) {
        super((short[])null);
        this.b = new HashMap();
        this.k = bor.a.l();
        this.c = new HashSet();
        gsl gsl2 = gsl.a;
        this.d = gsl2;
        this.e = gsl2;
        this.f = gsl2;
        this.g = gsl2;
        this.h = gsl2;
        this.i = gsl2;
        this.j = gsl2;
        this.a = dxx2;
    }

    @Override
    public final dye i() {
        return this.a.a;
    }

    @Override
    public final dyj j() {
        return this;
    }

    @Override
    public final Boolean n() {
        return false;
    }

    public final String o() {
        return this.a.b;
    }

    @Override
    public final String p() {
        return this.a.g;
    }

    public final void q(int n2, String string) {
        this.d = gto.i(n2);
        this.e = gto.i(string);
    }

    public final void r(String hashSet, String string) {
        if (!this.b.containsKey(hashSet)) {
            HashSet<String> hashSet2 = new HashSet<String>();
            this.b.put(hashSet, hashSet2);
            hashSet = hashSet2;
        } else {
            hashSet = (Set)this.b.get(hashSet);
        }
        hashSet.add(string);
    }

    public final void s(int n2) {
        this.d = gto.i(n2 - 1);
        this.e = gsl.a;
    }

    public final void u(gpm object, Object object2) {
        hwp hwp2 = this.k;
        hyg hyg2 = ((bor)hwp2.b).e;
        hwt hwt2 = hyg2;
        if (hyg2 == null) {
            hwt2 = bos.a;
        }
        hyg2 = (hwp)((hwv)((Object)hwt2)).C(5);
        ((hwp)hyg2).x((hwv)((Object)hwt2));
        hwt2 = (hwr)hyg2;
        ((hwr)hwt2).aH((gpm)object, object2);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = (bor)hwp2.b;
        object2 = (bos)((hwp)((Object)hwt2)).o();
        object2.getClass();
        ((bor)object).e = object2;
        ((bor)object).b |= 4;
    }
}

