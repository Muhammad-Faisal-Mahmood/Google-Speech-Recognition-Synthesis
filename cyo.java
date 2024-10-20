/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class cyo
implements cyj {
    public final csw a;
    public final Executor b;
    private final cwk c;

    public cyo(csw csw2, cwk cwk2, Executor executor) {
        this.a = csw2;
        this.c = cwk2;
        this.b = executor;
    }

    public static hpn e(dus dus2, String string, int[] nArray, String string2) {
        return dus2.f(nArray, string, string2);
    }

    public static final Set g(Map map, cyn cyn2) {
        if (!map.containsKey(cyn2)) {
            map.put(cyn2, new HashSet());
        }
        return (Set)map.get(cyn2);
    }

    public static boolean h(cth cth2, String string) {
        return string.equals(cth2.d) && (cth2.b & 0x20000) != 0;
    }

    public static final cyn i(cth cth2) {
        return new cyn(cth2.s);
    }

    private final gzx j() {
        gzs gzs2 = new gzs();
        if (this.a.b().g()) {
            gzs2.h((String)this.a.b().c());
        }
        if (this.a.c().g()) {
            gzs2.h((String)this.a.c().c());
        }
        gzs2.h("ICING");
        return gzs2.g();
    }

    @Override
    public final hpn a(Collection collection) {
        cws cws2 = new cws(this, 20);
        fxf.K(collection);
        return crh.w(new hbc(collection, cws2)).u(new cuh(17), this.b);
    }

    @Override
    public final hpn b(String string) {
        gzx gzx2 = this.j();
        dus dus2 = this.a.a();
        ArrayList<hpn> arrayList = new ArrayList<hpn>();
        int n2 = ((hct)gzx2).c;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = (String)gzx2.get(i2);
            arrayList.add(cyo.e(dus2, string, new int[0], string2));
        }
        return crh.w(arrayList).u(new cuh(18), this.b);
    }

    @Override
    public final hpn c(String string) {
        if (!cqq.h()) {
            return hpj.a;
        }
        return crh.x(fxf.ak(fxf.aj(this.d(string), new cxc(4), this.b), new cyc(this, 3), this.b), fxf.ak(fxf.aj(fxf.aj(this.c.e(), new cym(string, 0), this.b), new cxc(3), this.b), new cyc(this, 3), this.b)).u(new cuh(15), this.b);
    }

    public final hpn d(String string) {
        return fxf.aj(this.c.c(), new cym(string, 1), this.b);
    }

    public final hpn f(Map object) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : object.entrySet()) {
            cyn cyn2 = (cyn)entry.getKey();
            int[] object2 = hhk.ah((Set)entry.getValue());
            arrayList.addAll(fvd.y(this.j(), new cvp(this, object2, cyn2, 2)));
        }
        return crh.y(arrayList).u(new cuh(16), (Executor)hom.a);
    }
}

