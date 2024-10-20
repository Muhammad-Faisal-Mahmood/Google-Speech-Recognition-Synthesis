/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

public final class hyv {
    public static final hzd a;

    static {
        hyo hyo2 = hyo.a;
        a = new hzd();
    }

    public static void A(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hww;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hww)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n3 = 0;
                    for (n2 = 0; n2 < ((hww)list).c; ++n2) {
                        ((hww)list).e(n2);
                        n3 += 4;
                    }
                    ((hwd)dlm2.a).C(n3);
                    for (n2 = n6; n2 < ((hww)list).c; ++n2) {
                        Object object = dlm2.a;
                        n3 = ((hww)list).e(n2);
                        ((hwd)object).p(n3);
                    }
                } else {
                    for (n3 = n4; n3 < ((hww)list).c; ++n3) {
                        Object object = dlm2.a;
                        n5 = ((hww)list).e(n3);
                        ((hwd)object).o(n2, n5);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n2 = 0;
                for (n3 = 0; n3 < list.size(); ++n3) {
                    ((Integer)list.get(n3)).intValue();
                    n2 += 4;
                }
                ((hwd)dlm2.a).C(n2);
                for (n2 = n5; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    n3 = (Integer)list.get(n2);
                    ((hwd)object).p(n3);
                }
            } else {
                for (n3 = 0; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    n5 = (Integer)list.get(n3);
                    ((hwd)object).o(n2, n5);
                }
            }
        }
    }

    public static void B(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hxw;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hxw)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n2 = 0;
                    for (n3 = 0; n3 < ((hxw)list).c; ++n3) {
                        ((hxw)list).f(n3);
                        n2 += 8;
                    }
                    ((hwd)dlm2.a).C(n2);
                    for (n2 = n6; n2 < ((hxw)list).c; ++n2) {
                        Object object = dlm2.a;
                        long l2 = ((hxw)list).f(n2);
                        ((hwd)object).r(l2);
                    }
                } else {
                    for (n3 = n4; n3 < ((hxw)list).c; ++n3) {
                        Object object = dlm2.a;
                        long l3 = ((hxw)list).f(n3);
                        ((hwd)object).q(n2, l3);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n3 = 0;
                for (n2 = 0; n2 < list.size(); ++n2) {
                    ((Long)list.get(n2)).longValue();
                    n3 += 8;
                }
                ((hwd)dlm2.a).C(n3);
                for (n2 = n5; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    long l4 = (Long)list.get(n2);
                    ((hwd)object).r(l4);
                }
            } else {
                for (n3 = 0; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    long l5 = (Long)list.get(n3);
                    ((hwd)object).q(n2, l5);
                }
            }
        }
    }

    public static void C(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hww;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hww)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n3 = 0;
                    for (n2 = 0; n2 < ((hww)list).c; ++n2) {
                        n3 += hwd.U(((hww)list).e(n2));
                    }
                    ((hwd)dlm2.a).C(n3);
                    for (n2 = n6; n2 < ((hww)list).c; ++n2) {
                        Object object = dlm2.a;
                        n3 = ((hww)list).e(n2);
                        ((hwd)object).ap(n3);
                    }
                } else {
                    for (n3 = 0; n3 < ((hww)list).c; ++n3) {
                        Object object = dlm2.a;
                        n6 = ((hww)list).e(n3);
                        ((hwd)object).ao(n2, n6);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n2 = 0;
                for (n3 = 0; n3 < list.size(); ++n3) {
                    n2 += hwd.U((Integer)list.get(n3));
                }
                ((hwd)dlm2.a).C(n2);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    n3 = (Integer)list.get(n2);
                    ((hwd)object).ap(n3);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    n6 = (Integer)list.get(n3);
                    ((hwd)object).ao(n2, n6);
                }
            }
        }
    }

    public static void D(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hxw;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hxw)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n2 = 0;
                    for (n3 = 0; n3 < ((hxw)list).c; ++n3) {
                        n2 += hwd.W(((hxw)list).f(n3));
                    }
                    ((hwd)dlm2.a).C(n2);
                    for (n2 = n6; n2 < ((hxw)list).c; ++n2) {
                        Object object = dlm2.a;
                        long l2 = ((hxw)list).f(n2);
                        ((hwd)object).ar(l2);
                    }
                } else {
                    for (n3 = 0; n3 < ((hxw)list).c; ++n3) {
                        Object object = dlm2.a;
                        long l3 = ((hxw)list).f(n3);
                        ((hwd)object).aq(n2, l3);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n3 = 0;
                for (n2 = 0; n2 < list.size(); ++n2) {
                    n3 += hwd.W((Long)list.get(n2));
                }
                ((hwd)dlm2.a).C(n3);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    long l4 = (Long)list.get(n2);
                    ((hwd)object).ar(l4);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    long l5 = (Long)list.get(n3);
                    ((hwd)object).aq(n2, l5);
                }
            }
        }
    }

    public static void E(int n2, List list, dlm dlm2) {
        block5: {
            int n3;
            if (list == null || list.isEmpty()) break block5;
            boolean bl2 = list instanceof hxu;
            int n4 = 0;
            if (bl2) {
                hxu hxu2 = (hxu)list;
                for (n3 = n4; n3 < list.size(); ++n3) {
                    Object object;
                    Object object2 = hxu2.c();
                    if (object2 instanceof String) {
                        object = dlm2.a;
                        object2 = (String)object2;
                        ((hwd)object).y(n2, (String)object2);
                        continue;
                    }
                    object = dlm2.a;
                    object2 = (hvu)object2;
                    ((hwd)object).m(n2, (hvu)object2);
                }
            } else {
                for (n3 = 0; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    String string = (String)list.get(n3);
                    ((hwd)object).y(n2, string);
                }
            }
        }
    }

    public static void F(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hww;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hww)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n2 = 0;
                    for (n3 = 0; n3 < ((hww)list).c; ++n3) {
                        n2 += hwd.ab(((hww)list).e(n3));
                    }
                    ((hwd)dlm2.a).C(n2);
                    for (n2 = n6; n2 < ((hww)list).c; ++n2) {
                        Object object = dlm2.a;
                        n3 = ((hww)list).e(n2);
                        ((hwd)object).C(n3);
                    }
                } else {
                    for (n3 = n4; n3 < ((hww)list).c; ++n3) {
                        Object object = dlm2.a;
                        n6 = ((hww)list).e(n3);
                        ((hwd)object).B(n2, n6);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n3 = 0;
                for (n2 = 0; n2 < list.size(); ++n2) {
                    n3 += hwd.ab((Integer)list.get(n2));
                }
                ((hwd)dlm2.a).C(n3);
                for (n2 = n5; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    n3 = (Integer)list.get(n2);
                    ((hwd)object).C(n3);
                }
            } else {
                for (n3 = 0; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    n6 = (Integer)list.get(n3);
                    ((hwd)object).B(n2, n6);
                }
            }
        }
    }

    public static void G(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hxw;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hxw)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n3 = 0;
                    for (n2 = 0; n2 < ((hxw)list).c; ++n2) {
                        n3 += hwd.ad(((hxw)list).f(n2));
                    }
                    ((hwd)dlm2.a).C(n3);
                    for (n2 = n6; n2 < ((hxw)list).c; ++n2) {
                        Object object = dlm2.a;
                        long l2 = ((hxw)list).f(n2);
                        ((hwd)object).E(l2);
                    }
                } else {
                    for (n3 = 0; n3 < ((hxw)list).c; ++n3) {
                        Object object = dlm2.a;
                        long l3 = ((hxw)list).f(n3);
                        ((hwd)object).D(n2, l3);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n2 = 0;
                for (n3 = 0; n3 < list.size(); ++n3) {
                    n2 += hwd.ad((Long)list.get(n3));
                }
                ((hwd)dlm2.a).C(n2);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    long l4 = (Long)list.get(n2);
                    ((hwd)object).E(l4);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    long l5 = (Long)list.get(n3);
                    ((hwd)object).D(n2, l5);
                }
            }
        }
    }

    static int a(List list) {
        return list.size() * 4;
    }

    static int b(List list) {
        return list.size() * 8;
    }

    static int c(int n2, Object object, hyu hyu2) {
        if (object instanceof hxt) {
            return hwd.N(n2, (hxt)object);
        }
        object = (hyf)object;
        return hwd.Z(n2) + hwd.R((hyf)object, hyu2);
    }

    static int d(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof hww) {
            list = (hww)list;
            int n5 = 0;
            while (true) {
                n3 = n5;
                if (n4 < n2) {
                    n5 += hwd.U(((hww)list).e(n4));
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            n4 = n3;
            while (true) {
                n3 = n6;
                if (n4 >= n2) break;
                n6 += hwd.U((Integer)list.get(n4));
                ++n4;
            }
        }
        return n3;
    }

    static int e(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof hxw) {
            list = (hxw)list;
            int n5 = 0;
            while (true) {
                n3 = n5;
                if (n4 < n2) {
                    n5 += hwd.W(((hxw)list).f(n4));
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            n4 = n3;
            while (true) {
                n3 = n6;
                if (n4 >= n2) break;
                n6 += hwd.W((Long)list.get(n4));
                ++n4;
            }
        }
        return n3;
    }

    static int f(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof hww) {
            list = (hww)list;
            int n5 = 0;
            while (true) {
                n3 = n5;
                if (n4 < n2) {
                    n5 += hwd.ab(((hww)list).e(n4));
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            n4 = n3;
            while (true) {
                n3 = n6;
                if (n4 >= n2) break;
                n6 += hwd.ab((Integer)list.get(n4));
                ++n4;
            }
        }
        return n3;
    }

    static Object g(Object object, int n2, List object2, hwy object3, Object object4, hzd hzd2) {
        if (object3 == null) {
            return object4;
        }
        if (object2 instanceof RandomAccess) {
            int n3 = object2.size();
            int n4 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                object3 = (Integer)object2.get(i2);
                int n5 = (Integer)object3;
                if (iav.b(n5) != null) {
                    if (i2 != n4) {
                        object2.set(n4, object3);
                    }
                    ++n4;
                    continue;
                }
                object4 = hyv.i(object, n2, n5, object4, hzd2);
            }
            object3 = object4;
            if (n4 != n3) {
                object2.subList(n4, n3).clear();
                return object4;
            }
        } else {
            object2 = object2.iterator();
            while (true) {
                object3 = object4;
                if (!object2.hasNext()) break;
                int n6 = (Integer)object2.next();
                if (iav.b(n6) != null) continue;
                object4 = hyv.i(object, n2, n6, object4, hzd2);
                object2.remove();
            }
        }
        return object3;
    }

    static Object h(Object object, int n2, List object2, hwz hwz2, Object object3, hzd hzd2) {
        Object object4;
        if (hwz2 == null) {
            return object3;
        }
        if (object2 instanceof RandomAccess) {
            int n3 = object2.size();
            int n4 = 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                object4 = (Integer)object2.get(i2);
                int n5 = (Integer)object4;
                if (hwz2.a(n5)) {
                    if (i2 != n4) {
                        object2.set(n4, object4);
                    }
                    ++n4;
                    continue;
                }
                object3 = hyv.i(object, n2, n5, object3, hzd2);
            }
            object4 = object3;
            if (n4 != n3) {
                object2.subList(n4, n3).clear();
                return object3;
            }
        } else {
            object2 = object2.iterator();
            while (true) {
                object4 = object3;
                if (!object2.hasNext()) break;
                int n6 = (Integer)object2.next();
                if (hwz2.a(n6)) continue;
                object3 = hyv.i(object, n2, n6, object3, hzd2);
                object2.remove();
            }
        }
        return object4;
    }

    static Object i(Object object, int n2, int n3, Object object2, hzd hzd2) {
        Object object3 = object2;
        if (object2 == null) {
            object3 = hzd2.b(object);
        }
        hzd2.d(object3, n2, n3);
        return object3;
    }

    static int j(int n2, List list) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        return n3 * hwd.au(n2);
    }

    static int k(int n2, List list) {
        int n3 = list.size();
        if (n3 == 0) {
            return 0;
        }
        return n3 * hwd.av(n2);
    }

    public static /* synthetic */ int l(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof hww) {
            list = (hww)list;
            int n5 = 0;
            n3 = n4;
            while (true) {
                n4 = n5;
                if (n3 < n2) {
                    n5 += hwd.L(((hww)list).e(n3));
                    ++n3;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            while (true) {
                n4 = n6;
                if (n3 >= n2) break;
                n6 += hwd.L((Integer)list.get(n3));
                ++n3;
            }
        }
        return n4;
    }

    public static /* synthetic */ int m(List list) {
        int n2 = list.size();
        int n3 = 0;
        int n4 = 0;
        if (n2 == 0) {
            return 0;
        }
        if (list instanceof hxw) {
            list = (hxw)list;
            int n5 = 0;
            n3 = n4;
            while (true) {
                n4 = n5;
                if (n3 < n2) {
                    n5 += hwd.ad(((hxw)list).f(n3));
                    ++n3;
                    continue;
                }
                break;
            }
        } else {
            int n6 = 0;
            while (true) {
                n4 = n6;
                if (n3 >= n2) break;
                n6 += hwd.ad((Long)list.get(n3));
                ++n3;
            }
        }
        return n4;
    }

    static void n(Object object, Object iterator) {
        if (!((hwl)((Object)(iterator = idi.s(iterator)))).i()) {
            object = idi.t(object);
            int n2 = ((hwl)((Object)iterator)).b.b;
            for (int i2 = 0; i2 < n2; ++i2) {
                ((hwl)object).g(((hwl)((Object)iterator)).b.d(i2));
            }
            iterator = ((hwl)((Object)iterator)).b.a().iterator();
            while (iterator.hasNext()) {
                ((hwl)object).g((Map.Entry)iterator.next());
            }
        }
    }

    static void o(Object object, Object object2) {
        hze hze2 = hzd.f(object);
        hze hze3 = hzd.f(object2);
        if (hze.a.equals(hze3)) {
            object2 = hze2;
        } else if (hze.a.equals(hze2)) {
            int n2 = hze2.b + hze3.b;
            object2 = Arrays.copyOf(hze2.c, n2);
            System.arraycopy(hze3.c, 0, object2, hze2.b, hze3.b);
            Object[] objectArray = Arrays.copyOf(hze2.d, n2);
            System.arraycopy(hze3.d, 0, objectArray, hze2.b, hze3.b);
            object2 = new hze(n2, (int[])object2, objectArray, true);
        } else if (hze3.equals(hze.a)) {
            object2 = hze2;
        } else {
            hze2.b();
            int n3 = hze2.b + hze3.b;
            hze2.c(n3);
            System.arraycopy(hze3.c, 0, hze2.c, hze2.b, hze3.b);
            System.arraycopy(hze3.d, 0, hze2.d, hze2.b, hze3.b);
            hze2.b = n3;
            object2 = hze2;
        }
        hzd.g(object, (hze)object2);
    }

    public static void p(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hvm;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hvm)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n2 = 0;
                    for (n3 = 0; n3 < ((hvm)list).b; ++n3) {
                        ((hvm)list).f(n3);
                        ++n2;
                    }
                    ((hwd)dlm2.a).C(n2);
                    for (n2 = n6; n2 < ((hvm)list).b; ++n2) {
                        Object object = dlm2.a;
                        byte by2 = ((hvm)list).f(n2);
                        ((hwd)object).j(by2);
                    }
                } else {
                    for (n3 = 0; n3 < ((hvm)list).b; ++n3) {
                        Object object = dlm2.a;
                        bl2 = ((hvm)list).f(n3);
                        ((hwd)object).l(n2, bl2);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n3 = 0;
                for (n2 = 0; n2 < list.size(); ++n2) {
                    ((Boolean)list.get(n2)).booleanValue();
                    ++n3;
                }
                ((hwd)dlm2.a).C(n3);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    byte by3 = ((Boolean)list.get(n2)).booleanValue();
                    ((hwd)object).j(by3);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    bl2 = (Boolean)list.get(n3);
                    ((hwd)object).l(n2, bl2);
                }
            }
        }
    }

    public static void q(int n2, List list, dlm dlm2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                Object object = dlm2.a;
                hvu hvu2 = (hvu)list.get(i2);
                ((hwd)object).m(n2, hvu2);
            }
        }
    }

    public static void r(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hwf;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hwf)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n2 = 0;
                    for (n3 = 0; n3 < ((hwf)list).c; ++n3) {
                        ((hwf)list).e(n3);
                        n2 += 8;
                    }
                    ((hwd)dlm2.a).C(n2);
                    for (n2 = n6; n2 < ((hwf)list).c; ++n2) {
                        Object object = dlm2.a;
                        double d2 = ((hwf)list).e(n2);
                        ((hwd)object).ak(d2);
                    }
                } else {
                    for (n3 = 0; n3 < ((hwf)list).c; ++n3) {
                        Object object = dlm2.a;
                        double d3 = ((hwf)list).e(n3);
                        ((hwd)object).aj(n2, d3);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n2 = 0;
                for (n3 = 0; n3 < list.size(); ++n3) {
                    ((Double)list.get(n3)).doubleValue();
                    n2 += 8;
                }
                ((hwd)dlm2.a).C(n2);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    double d4 = (Double)list.get(n2);
                    ((hwd)object).ak(d4);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    double d5 = (Double)list.get(n3);
                    ((hwd)object).aj(n2, d5);
                }
            }
        }
    }

    public static void s(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hww;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hww)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n3 = 0;
                    for (n2 = 0; n2 < ((hww)list).c; ++n2) {
                        n3 += hwd.L(((hww)list).e(n2));
                    }
                    ((hwd)dlm2.a).C(n3);
                    for (n2 = n6; n2 < ((hww)list).c; ++n2) {
                        Object object = dlm2.a;
                        n3 = ((hww)list).e(n2);
                        ((hwd)object).t(n3);
                    }
                } else {
                    for (n3 = 0; n3 < ((hww)list).c; ++n3) {
                        Object object = dlm2.a;
                        n6 = ((hww)list).e(n3);
                        ((hwd)object).s(n2, n6);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n2 = 0;
                for (n3 = 0; n3 < list.size(); ++n3) {
                    n2 += hwd.L((Integer)list.get(n3));
                }
                ((hwd)dlm2.a).C(n2);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    n3 = (Integer)list.get(n2);
                    ((hwd)object).t(n3);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    n6 = (Integer)list.get(n3);
                    ((hwd)object).s(n2, n6);
                }
            }
        }
    }

    public static void t(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hww;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hww)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n2 = 0;
                    for (n3 = 0; n3 < ((hww)list).c; ++n3) {
                        ((hww)list).e(n3);
                        n2 += 4;
                    }
                    ((hwd)dlm2.a).C(n2);
                    for (n2 = n6; n2 < ((hww)list).c; ++n2) {
                        Object object = dlm2.a;
                        n3 = ((hww)list).e(n2);
                        ((hwd)object).p(n3);
                    }
                } else {
                    for (n3 = n4; n3 < ((hww)list).c; ++n3) {
                        Object object = dlm2.a;
                        n5 = ((hww)list).e(n3);
                        ((hwd)object).o(n2, n5);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n2 = 0;
                for (n3 = 0; n3 < list.size(); ++n3) {
                    ((Integer)list.get(n3)).intValue();
                    n2 += 4;
                }
                ((hwd)dlm2.a).C(n2);
                for (n2 = n5; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    n3 = (Integer)list.get(n2);
                    ((hwd)object).p(n3);
                }
            } else {
                for (n3 = 0; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    n5 = (Integer)list.get(n3);
                    ((hwd)object).o(n2, n5);
                }
            }
        }
    }

    public static void u(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hxw;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hxw)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n3 = 0;
                    for (n2 = 0; n2 < ((hxw)list).c; ++n2) {
                        ((hxw)list).f(n2);
                        n3 += 8;
                    }
                    ((hwd)dlm2.a).C(n3);
                    for (n2 = n6; n2 < ((hxw)list).c; ++n2) {
                        Object object = dlm2.a;
                        long l2 = ((hxw)list).f(n2);
                        ((hwd)object).r(l2);
                    }
                } else {
                    for (n3 = 0; n3 < ((hxw)list).c; ++n3) {
                        Object object = dlm2.a;
                        long l3 = ((hxw)list).f(n3);
                        ((hwd)object).q(n2, l3);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n3 = 0;
                for (n2 = 0; n2 < list.size(); ++n2) {
                    ((Long)list.get(n2)).longValue();
                    n3 += 8;
                }
                ((hwd)dlm2.a).C(n3);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    long l4 = (Long)list.get(n2);
                    ((hwd)object).r(l4);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    long l5 = (Long)list.get(n3);
                    ((hwd)object).q(n2, l5);
                }
            }
        }
    }

    public static void v(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hwn;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hwn)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n3 = 0;
                    for (n2 = 0; n2 < ((hwn)list).d; ++n2) {
                        ((hwn)list).e(n2);
                        n3 += 4;
                    }
                    ((hwd)dlm2.a).C(n3);
                    for (n2 = n6; n2 < ((hwn)list).d; ++n2) {
                        Object object = dlm2.a;
                        float f2 = ((hwn)list).e(n2);
                        ((hwd)object).am(f2);
                    }
                } else {
                    for (n3 = 0; n3 < ((hwn)list).d; ++n3) {
                        Object object = dlm2.a;
                        float f3 = ((hwn)list).e(n3);
                        ((hwd)object).al(n2, f3);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n2 = 0;
                for (n3 = 0; n3 < list.size(); ++n3) {
                    ((Float)list.get(n3)).floatValue();
                    n2 += 4;
                }
                ((hwd)dlm2.a).C(n2);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    float f4 = ((Float)list.get(n2)).floatValue();
                    ((hwd)object).am(f4);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    float f5 = ((Float)list.get(n3)).floatValue();
                    ((hwd)object).al(n2, f5);
                }
            }
        }
    }

    public static void w(int n2, List list, dlm dlm2, hyu hyu2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                dlm2.A(n2, list.get(i2), hyu2);
            }
        }
    }

    public static void x(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hww;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hww)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n3 = 0;
                    for (n2 = 0; n2 < ((hww)list).c; ++n2) {
                        n3 += hwd.L(((hww)list).e(n2));
                    }
                    ((hwd)dlm2.a).C(n3);
                    for (n2 = n6; n2 < ((hww)list).c; ++n2) {
                        Object object = dlm2.a;
                        n3 = ((hww)list).e(n2);
                        ((hwd)object).t(n3);
                    }
                } else {
                    for (n3 = 0; n3 < ((hww)list).c; ++n3) {
                        Object object = dlm2.a;
                        n4 = ((hww)list).e(n3);
                        ((hwd)object).s(n2, n4);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n3 = 0;
                for (n2 = 0; n2 < list.size(); ++n2) {
                    n3 += hwd.L((Integer)list.get(n2));
                }
                ((hwd)dlm2.a).C(n3);
                for (n2 = n4; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    n3 = (Integer)list.get(n2);
                    ((hwd)object).t(n3);
                }
            } else {
                for (n3 = n5; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    n4 = (Integer)list.get(n3);
                    ((hwd)object).s(n2, n4);
                }
            }
        }
    }

    public static void y(int n2, List list, dlm dlm2, boolean bl2) {
        block12: {
            int n3;
            if (list == null || list.isEmpty()) break block12;
            boolean bl3 = list instanceof hxw;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            if (bl3) {
                list = (hxw)list;
                if (bl2) {
                    ((hwd)dlm2.a).A(n2, 2);
                    n3 = 0;
                    for (n2 = 0; n2 < ((hxw)list).c; ++n2) {
                        n3 += hwd.ad(((hxw)list).f(n2));
                    }
                    ((hwd)dlm2.a).C(n3);
                    for (n2 = n6; n2 < ((hxw)list).c; ++n2) {
                        Object object = dlm2.a;
                        long l2 = ((hxw)list).f(n2);
                        ((hwd)object).E(l2);
                    }
                } else {
                    for (n3 = n4; n3 < ((hxw)list).c; ++n3) {
                        Object object = dlm2.a;
                        long l3 = ((hxw)list).f(n3);
                        ((hwd)object).D(n2, l3);
                    }
                }
            } else if (bl2) {
                ((hwd)dlm2.a).A(n2, 2);
                n2 = 0;
                for (n3 = 0; n3 < list.size(); ++n3) {
                    n2 += hwd.ad((Long)list.get(n3));
                }
                ((hwd)dlm2.a).C(n2);
                for (n2 = n5; n2 < list.size(); ++n2) {
                    Object object = dlm2.a;
                    long l4 = (Long)list.get(n2);
                    ((hwd)object).E(l4);
                }
            } else {
                for (n3 = 0; n3 < list.size(); ++n3) {
                    Object object = dlm2.a;
                    long l5 = (Long)list.get(n3);
                    ((hwd)object).D(n2, l5);
                }
            }
        }
    }

    public static void z(int n2, List list, dlm dlm2, hyu hyu2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                dlm2.D(n2, list.get(i2), hyu2);
            }
        }
    }
}

