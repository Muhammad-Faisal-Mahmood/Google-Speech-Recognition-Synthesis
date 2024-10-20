/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.G;
import j$.time.chrono.H;
import j$.time.chrono.L;
import j$.time.chrono.a_0;
import j$.time.chrono.b_0;
import j$.time.chrono.k_0;
import j$.time.chrono.o;
import j$.time.chrono.u;
import j$.time.g;
import j$.time.temporal.a;
import j$.time.temporal.m;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

public final class I
extends a_0
implements Serializable {
    public static final I d = new I();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap<String, String[]> hashMap = new HashMap<String, String[]>();
        HashMap<String, String[]> hashMap2 = new HashMap<String, String[]>();
        HashMap<String, String[]> hashMap3 = new HashMap<String, String[]>();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"\u0e1e.\u0e28.", "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e01\u0e32\u0e25\u0e17\u0e35\u0e48"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a", "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e01\u0e32\u0e25\u0e17\u0e35\u0e48"});
    }

    private I() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final boolean D(long l2) {
        return u.d.D(l2 - 543L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final o G(int n2) {
        if (n2 == 0) return L.BEFORE_BE;
        if (n2 == 1) {
            return L.BE;
        }
        StringBuilder stringBuilder = new StringBuilder("Invalid era: ");
        stringBuilder.append(n2);
        throw new RuntimeException(stringBuilder.toString());
    }

    @Override
    public final b_0 k(int n2) {
        return new k_0(g.T(n2 - 543, 1, 1));
    }

    @Override
    public final String l() {
        return "ThaiBuddhist";
    }

    @Override
    public final t q(a object) {
        int n2 = H.a[((Enum)object).ordinal()];
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return ((a)object).m();
                }
                object = a.YEAR.m();
                return t.j(((t)object).e() + 543L, ((t)object).d() + 543L);
            }
            object = a.YEAR.m();
            return t.k(1L, -(((t)object).e() + 543L) + 1L, ((t)object).d() + 543L);
        }
        object = a.PROLEPTIC_MONTH.m();
        return t.j(((t)object).e() + 6516L, ((t)object).d() + 6516L);
    }

    @Override
    public final b_0 r(m m2) {
        m2 = m2 instanceof k_0 ? (k_0)m2 : new k_0(g.K(m2));
        return m2;
    }

    Object writeReplace() {
        return new G(1, this);
    }

    @Override
    public final String z() {
        return "buddhist";
    }
}

