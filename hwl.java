/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class hwl {
    public static final hwl a = new hwl(null);
    final hyz b;
    public boolean c;
    private boolean d;

    private hwl() {
        this.b = new hyz();
    }

    private hwl(byte[] object) {
        object = new hyz();
        this.b = object;
        this.f();
        this.f();
    }

    public static int a(hzm hzm2, int n2, Object object) {
        int n3;
        n2 = n3 = hwd.Z(n2);
        if (hzm2 == hzm.j) {
            hxl.d((hyf)object);
            n2 = n3 + n3;
        }
        return n2 + hwl.b(hzm2, object);
    }

    static int b(hzm object, Object object2) {
        Enum enum_ = hzm.a;
        enum_ = hzn.a;
        switch (((Enum)object).ordinal()) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 17: {
                return hwd.W((Long)object2);
            }
            case 16: {
                return hwd.U((Integer)object2);
            }
            case 15: {
                ((Long)object2).longValue();
                boolean bl2 = hwd.e;
                return 8;
            }
            case 14: {
                ((Integer)object2).intValue();
                boolean bl3 = hwd.e;
                return 4;
            }
            case 13: {
                if (object2 instanceof hwx) {
                    return hwd.L(((hwx)object2).a());
                }
                return hwd.L((Integer)object2);
            }
            case 12: {
                return hwd.ab((Integer)object2);
            }
            case 11: {
                if (object2 instanceof hvu) {
                    return hwd.H((hvu)object2);
                }
                object = (byte[])object2;
                boolean bl4 = hwd.e;
                return hwd.P(((Object)object).length);
            }
            case 10: {
                if (object2 instanceof hxs) {
                    return hwd.O((hxs)object2);
                }
                return hwd.Q((hyf)object2);
            }
            case 9: {
                object = (hyf)object2;
                boolean bl5 = hwd.e;
                return object.k();
            }
            case 8: {
                if (object2 instanceof hvu) {
                    return hwd.H((hvu)object2);
                }
                return hwd.Y((String)object2);
            }
            case 7: {
                ((Boolean)object2).booleanValue();
                boolean bl6 = hwd.e;
                return 1;
            }
            case 6: {
                ((Integer)object2).intValue();
                boolean bl7 = hwd.e;
                return 4;
            }
            case 5: {
                ((Long)object2).longValue();
                boolean bl8 = hwd.e;
                return 8;
            }
            case 4: {
                return hwd.L((Integer)object2);
            }
            case 3: {
                return hwd.ad((Long)object2);
            }
            case 2: {
                return hwd.ad((Long)object2);
            }
            case 1: {
                ((Float)object2).floatValue();
                boolean bl9 = hwd.e;
                return 4;
            }
            case 0: 
        }
        ((Double)object2).doubleValue();
        boolean bl10 = hwd.e;
        return 8;
    }

    public static void h(hwd hwd2, hzm object, int n2, Object object2) {
        if (object != hzm.j) {
            hwd2.A(n2, object.t);
            hzn hzn2 = hzn.a;
            switch (object.ordinal()) {
                default: {
                    return;
                }
                case 17: {
                    hwd2.ar((Long)object2);
                    return;
                }
                case 16: {
                    hwd2.ap((Integer)object2);
                    return;
                }
                case 15: {
                    hwd2.r((Long)object2);
                    return;
                }
                case 14: {
                    hwd2.p((Integer)object2);
                    return;
                }
                case 13: {
                    if (object2 instanceof hwx) {
                        hwd2.t(((hwx)object2).a());
                        return;
                    }
                    hwd2.t((Integer)object2);
                    return;
                }
                case 12: {
                    hwd2.C((Integer)object2);
                    return;
                }
                case 11: {
                    if (object2 instanceof hvu) {
                        hwd2.n((hvu)object2);
                        return;
                    }
                    object = (byte[])object2;
                    hwd2.F((byte[])object, ((hzm)object).length);
                    return;
                }
                case 10: {
                    hwd2.v((hyf)object2);
                    return;
                }
                case 9: {
                    hwd2.an((hyf)object2);
                    return;
                }
                case 8: {
                    if (object2 instanceof hvu) {
                        hwd2.n((hvu)object2);
                        return;
                    }
                    hwd2.z((String)object2);
                    return;
                }
                case 7: {
                    hwd2.j((byte)(((Boolean)object2).booleanValue() ? 1 : 0));
                    return;
                }
                case 6: {
                    hwd2.p((Integer)object2);
                    return;
                }
                case 5: {
                    hwd2.r((Long)object2);
                    return;
                }
                case 4: {
                    hwd2.t((Integer)object2);
                    return;
                }
                case 3: {
                    hwd2.E((Long)object2);
                    return;
                }
                case 2: {
                    hwd2.E((Long)object2);
                    return;
                }
                case 1: {
                    hwd2.am(((Float)object2).floatValue());
                    return;
                }
                case 0: 
            }
            hwd2.ak((Double)object2);
            return;
        }
        object = (hyf)object2;
        hxl.d((hyf)object);
        hwd2.A(n2, 3);
        hwd2.an((hyf)object);
        hwd2.A(n2, 4);
    }

    public static int k(hwu hwu2, Object object) {
        hzm hzm2 = hwu2.c;
        int n2 = hwu2.b;
        if (hwu2.d) {
            int n3;
            int n4;
            object = (List)object;
            int n5 = object.size();
            boolean bl2 = hwu2.e;
            if (bl2) {
                if (!object.isEmpty()) {
                    n4 = 0;
                    for (n3 = 0; n3 < n5; ++n3) {
                        n4 += hwl.b(hzm2, object.get(n3));
                    }
                    return hwd.Z(n2) + n4 + hwd.ab(n4);
                }
                return 0;
            }
            n3 = 0;
            for (n4 = 0; n4 < n5; ++n4) {
                n3 += hwl.a(hzm2, n2, object.get(n4));
            }
            return n3;
        }
        return hwl.a(hzm2, n2, object);
    }

    private static Object p(Object object) {
        if (object instanceof hyk) {
            return ((hyk)object).c();
        }
        if (object instanceof byte[]) {
            byte[] byArray = (byte[])object;
            int n2 = byArray.length;
            object = new byte[n2];
            System.arraycopy(byArray, 0, object, 0, n2);
            return object;
        }
        return object;
    }

    private static boolean q(Map.Entry object) {
        hwu hwu2 = (hwu)object.getKey();
        if (hwu2.a() == hzn.i) {
            if (hwu2.d) {
                object = (List)object.getValue();
                int n2 = object.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (hwl.r(object.get(i2))) continue;
                    return false;
                }
            } else {
                return hwl.r(object.getValue());
            }
        }
        return true;
    }

    private static boolean r(Object object) {
        if (object instanceof hyg) {
            return ((hyg)object).v();
        }
        if (object instanceof hxs) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final void s(hwu hwu2, Object object) {
        block13: {
            block14: {
                boolean bl2;
                hxl.c(object);
                Enum enum_ = hzm.a;
                enum_ = hzn.a;
                switch (hwu2.c.s.ordinal()) {
                    default: {
                        break block13;
                    }
                    case 8: {
                        if (!(object instanceof hyf) && !(object instanceof hxs)) break block13;
                        break block14;
                    }
                    case 7: {
                        if (!(object instanceof Integer) && !(object instanceof hwx)) break block13;
                        break block14;
                    }
                    case 6: {
                        if (!(object instanceof hvu) && !(object instanceof byte[])) break block13;
                        break block14;
                    }
                    case 5: {
                        bl2 = object instanceof String;
                        break;
                    }
                    case 4: {
                        bl2 = object instanceof Boolean;
                        break;
                    }
                    case 3: {
                        bl2 = object instanceof Double;
                        break;
                    }
                    case 2: {
                        bl2 = object instanceof Float;
                        break;
                    }
                    case 1: {
                        bl2 = object instanceof Long;
                        break;
                    }
                    case 0: {
                        bl2 = object instanceof Integer;
                    }
                }
                if (!bl2) break block13;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{hwu2.b, hwu2.c.s, object.getClass().getName()}));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int c(Map.Entry object) {
        int n2;
        int n3;
        hwu hwu2 = (hwu)object.getKey();
        Object v2 = object.getValue();
        if (hwu2.a() != hzn.i || hwu2.d || hwu2.e) return hwl.k(hwu2, v2);
        if (v2 instanceof hxs) {
            n3 = ((hwu)object.getKey()).b;
            object = (hxs)v2;
            n2 = hwd.Z(1);
            n2 = n2 + n2 + hwd.aa(2, n3);
            n3 = hwd.N(3, (hxt)object);
            return n2 + n3;
        }
        n3 = ((hwu)object.getKey()).b;
        object = (hyf)v2;
        n2 = hwd.Z(1);
        n2 = n2 + n2 + hwd.aa(2, n3);
        n3 = hwd.Z(3) + hwd.Q((hyf)object);
        return n2 + n3;
    }

    public final hwl d() {
        hwl hwl2 = new hwl();
        int n2 = this.b.b;
        for (int i2 = 0; i2 < n2; ++i2) {
            Map.Entry entry = (hyw)this.b.d(i2);
            hwl2.n((hwu)((hyw)entry).a, ((hyw)entry).b);
        }
        for (Map.Entry entry : this.b.a()) {
            hwl2.n((hwu)entry.getKey(), entry.getValue());
        }
        hwl2.d = this.d;
        return hwl2;
    }

    public final Iterator e() {
        if (this.i()) {
            return Collections.emptyIterator();
        }
        if (this.d) {
            return new hxr(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hwl)) {
            return false;
        }
        object = (hwl)object;
        return this.b.equals(((hwl)object).b);
    }

    public final void f() {
        Object object;
        int n2;
        if (this.c) {
            return;
        }
        int n3 = this.b.b;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            object = ((hyw)this.b.d((int)n2)).b;
            if (!(object instanceof hwv)) continue;
            ((hwv)object).x();
        }
        Object object2 = this.b.a().iterator();
        while (object2.hasNext()) {
            object = ((Map.Entry)object2.next()).getValue();
            if (!(object instanceof hwv)) continue;
            ((hwv)object).x();
        }
        object2 = this.b;
        if (!((hyz)object2).d) {
            for (n2 = n4; n2 < ((hyz)object2).b; ++n2) {
                object = ((hyz)object2).d(n2);
                Map.Entry entry = (hyw)object;
                if (!((hwu)((hyw)entry).a).d) continue;
                object.setValue(DesugarCollections.unmodifiableList((List)((hyw)entry).b));
            }
            for (Map.Entry entry : ((hyz)object2).a()) {
                if (!((hwu)entry.getKey()).d) continue;
                entry.setValue(DesugarCollections.unmodifiableList((List)entry.getValue()));
            }
        }
        if (!((hyz)object2).d) {
            object = ((hyz)object2).c.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(((hyz)object2).c);
            ((hyz)object2).c = object;
            object = ((hyz)object2).e.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(((hyz)object2).e);
            ((hyz)object2).e = object;
            ((hyz)object2).d = true;
        }
        this.c = true;
    }

    public final void g(Map.Entry object) {
        hwu hwu2 = (hwu)object.getKey();
        object = object.getValue();
        boolean bl2 = object instanceof hxs;
        if (hwu2.d) {
            if (!bl2) {
                Object object2 = this.l(hwu2);
                List list = (List)object;
                int n2 = list.size();
                object = object2;
                if (object2 == null) {
                    object = new ArrayList(n2);
                }
                object2 = (List)object;
                for (int i2 = 0; i2 < n2; ++i2) {
                    object2.add(hwl.p(list.get(i2)));
                }
                this.b.b(hwu2, object);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (hwu2.a() == hzn.i) {
            Object object3 = this.l(hwu2);
            if (object3 == null) {
                this.b.b(hwu2, hwl.p(object));
                if (bl2) {
                    this.d = true;
                }
                return;
            }
            if (!bl2) {
                if (!(object3 instanceof hyk)) {
                    object3 = ((hyf)object3).bh();
                    object = (hwv)((hyf)object);
                    ((hwp)object3).x((hwv)object);
                    object = object3.r();
                    this.b.b(hwu2, object);
                    return;
                }
                object3 = (hyk)object3;
                object = (hyk)object;
                throw new UnsupportedOperationException();
            }
            object = (hxs)object;
            throw null;
        }
        if (!bl2) {
            this.b.b(hwu2, hwl.p(object));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    final boolean i() {
        return this.b.isEmpty();
    }

    public final boolean j() {
        int n2 = this.b.b;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (hwl.q(this.b.d(i2))) continue;
            return false;
        }
        Iterator iterator = this.b.a().iterator();
        while (iterator.hasNext()) {
            if (hwl.q((Map.Entry)iterator.next())) continue;
            return false;
        }
        return true;
    }

    public final Object l(hwu object) {
        if (!((object = this.b.get(object)) instanceof hxs)) {
            return object;
        }
        object = (hxs)object;
        throw null;
    }

    public final void m(hwu arrayList, Object object) {
        if (((hwu)((Object)arrayList)).d) {
            hwl.s((hwu)((Object)arrayList), object);
            ArrayList<Object> arrayList2 = this.l((hwu)((Object)arrayList));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<Object>();
                this.b.b((Comparable)((Object)arrayList), arrayList2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
            }
            arrayList.add(object);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void n(hwu hwu2, Object arrayList) {
        if (hwu2.d) {
            if (!(arrayList instanceof List)) throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            List list = arrayList;
            int n2 = list.size();
            arrayList = new ArrayList(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                Object e2 = list.get(i2);
                hwl.s(hwu2, e2);
                arrayList.add(e2);
            }
        } else {
            hwl.s(hwu2, arrayList);
        }
        if (arrayList instanceof hxs) {
            this.d = true;
        }
        this.b.b(hwu2, arrayList);
    }

    public final boolean o(hwu hwu2) {
        if (!hwu2.d) {
            return this.b.get(hwu2) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }
}

