/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 */
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.Map;

public final class aop
extends afb {
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final SparseArray s;
    public final SparseBooleanArray t;

    static {
        new aop(new aoo());
        agf.z(1000);
        agf.z(1001);
        agf.z(1002);
        agf.z(1003);
        agf.z(1004);
        agf.z(1005);
        agf.z(1006);
        agf.z(1007);
        agf.z(1008);
        agf.z(1009);
        agf.z(1010);
        agf.z(1011);
        agf.z(1012);
        agf.z(1013);
        agf.z(1014);
        agf.z(1015);
        agf.z(1016);
        agf.z(1017);
        agf.z(1018);
    }

    public aop(aoo aoo2) {
        super(aoo2);
        this.l = aoo2.l;
        this.m = aoo2.m;
        this.n = aoo2.n;
        this.o = aoo2.o;
        this.p = aoo2.p;
        this.q = aoo2.q;
        this.r = aoo2.r;
        this.s = aoo2.s;
        this.t = aoo2.t;
    }

    public final boolean a(int n2) {
        return this.t.get(n2);
    }

    @Override
    public final boolean equals(Object object) {
        block8: {
            aop aop2;
            if (this == object) {
                return true;
            }
            if (object != null && this.getClass() == object.getClass() && super.equals(aop2 = (aop)object) && this.l == aop2.l && this.m == aop2.m && this.n == aop2.n && this.o == aop2.o && this.p == aop2.p && this.q == aop2.q && this.r == aop2.r) {
                object = this.t;
                Object object2 = aop2.t;
                int n2 = object.size();
                if (object2.size() == n2) {
                    int n3;
                    for (n3 = 0; n3 < n2; ++n3) {
                        if (object2.indexOfKey(object.keyAt(n3)) >= 0) {
                            continue;
                        }
                        break block8;
                    }
                    object = this.s;
                    aop2 = aop2.s;
                    n2 = object.size();
                    if (aop2.size() == n2) {
                        for (n3 = 0; n3 < n2; ++n3) {
                            int n4 = aop2.indexOfKey(object.keyAt(n3));
                            if (n4 < 0) break block8;
                            Map map = (Map)object.valueAt(n3);
                            object2 = (Map)aop2.valueAt(n4);
                            n4 = map.size();
                            if (object2.size() != n4) break block8;
                            for (Map.Entry entry : map.entrySet()) {
                                aob aob2 = (aob)entry.getKey();
                                if (object2.containsKey(aob2) && Objects.equals(entry.getValue(), object2.get(aob2))) continue;
                                break block8;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((((((super.hashCode() + 31) * 31 + this.l) * 961 + this.m) * 961 + this.n) * 28629151 + this.o) * 31 + this.p) * 31 + this.q) * 961 + this.r) * 31;
    }
}

