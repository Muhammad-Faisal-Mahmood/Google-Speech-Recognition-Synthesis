/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.Map$_EL;
import j$.util.Spliterator;
import j$.util.stream.K0;
import j$.util.stream.L0;
import java.util.EnumMap;

final class M0
extends Enum {
    public static final /* enum */ M0 DISTINCT;
    public static final /* enum */ M0 ORDERED;
    public static final /* enum */ M0 SHORT_CIRCUIT;
    public static final /* enum */ M0 SIZED;
    public static final /* enum */ M0 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    private static final M0[] u;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        int n2;
        Object object = L0.SPLITERATOR;
        Object object2 = M0.t((L0)((Object)object));
        L0 l0 = L0.STREAM;
        object2.a(l0);
        L0 l02 = L0.OP;
        object2.a.put((Object)l02, (Object)3);
        object2 = new M0("DISTINCT", 0, 0, object2);
        DISTINCT = object2;
        Object object3 = M0.t((L0)((Object)object));
        object3.a(l0);
        object3.a.put((Object)l02, (Object)3);
        object3 = new M0("SORTED", 1, 1, object3);
        SORTED = object3;
        Object object4 = M0.t((L0)((Object)object));
        object4.a(l0);
        Object object5 = object4.a;
        ((EnumMap)object5).put((Object)l02, (Object)3);
        L0 l03 = L0.TERMINAL_OP;
        ((EnumMap)object5).put((Object)l03, (Object)2);
        L0 l04 = L0.UPSTREAM_TERMINAL_OP;
        ((EnumMap)object5).put((Object)l04, (Object)2);
        object4 = new M0("ORDERED", 2, 2, object4);
        ORDERED = object4;
        object5 = M0.t((L0)((Object)object));
        ((K0)object5).a(l0);
        ((K0)object5).a.put((Object)l02, (Object)2);
        object5 = new M0("SIZED", 3, 3, (K0)object5);
        SIZED = object5;
        Object object6 = M0.t(l02);
        object6.a(l03);
        object6 = new M0("SHORT_CIRCUIT", 4, 12, object6);
        SHORT_CIRCUIT = object6;
        u = new M0[]{object2, object3, object4, object5, object6};
        f = M0.m((L0)((Object)object));
        g = M0.m(l0);
        h = M0.m(l02);
        M0.m(l03);
        M0.m(l04);
        object = M0.values();
        int n3 = ((M0[])object).length;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            n4 |= object[n2].e;
        }
        i = n4;
        j = n2 = g;
        k = n4 = n2 << 1;
        l = n2 | n4;
        object = DISTINCT;
        m = object.c;
        n = object.d;
        object = SORTED;
        n4 = object.c;
        o = object.d;
        object = ORDERED;
        p = object.c;
        q = object.d;
        object = SIZED;
        r = object.c;
        s = object.d;
        t = M0.SHORT_CIRCUIT.c;
    }

    /*
     * WARNING - void declaration
     */
    private M0() {
        void var3_2;
        EnumMap enumMap;
        void var2_-1;
        void var1_-1;
        L0[] l0Array = L0.values();
        int n3 = l0Array.length;
        int n4 = 0;
        while (true) {
            void var4_1;
            enumMap = var4_1.a;
            if (n4 >= n3) break;
            Map$_EL.putIfAbsent(enumMap, (Object)l0Array[n4], 0);
            ++n4;
        }
        this.a = enumMap;
        this.b = n4 = var3_2 * 2;
        this.c = 1 << n4;
        this.d = 2 << n4;
        this.e = 3 << n4;
    }

    static int B(int n2) {
        return n2 & (~n2 >> 1 & j);
    }

    static int g(int n2, int n3) {
        int n4 = n2 == 0 ? i : ~((j & n2) << 1 | n2 | (k & n2) >> 1);
        return n2 | n3 & n4;
    }

    private static int m(L0 l0) {
        M0[] m0Array = M0.values();
        int n2 = m0Array.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            M0 m0 = m0Array[i2];
            n3 |= (Integer)m0.a.get((Object)l0) << m0.b;
        }
        return n3;
    }

    static int p(Spliterator spliterator) {
        int n2 = spliterator.a();
        int n3 = f;
        if ((n2 & 4) != 0 && spliterator.m() != null) {
            return n2 & n3 & 0xFFFFFFFB;
        }
        return n2 & n3;
    }

    private static K0 t(L0 l0) {
        K0 k0 = new K0(new EnumMap(L0.class));
        k0.a(l0);
        return k0;
    }

    public static M0 valueOf(String string) {
        return Enum.valueOf(M0.class, string);
    }

    public static M0[] values() {
        return (M0[])u.clone();
    }

    final boolean s(int n2) {
        boolean bl2 = (n2 & this.e) == this.c;
        return bl2;
    }
}

