/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

public final class qu {
    public static final qo a = new qo();
    public static int b = 0;
    public static int c = 0;

    /*
     * Enabled aggressive block sorting
     */
    public static void a(int n2, qg qg2, rg rg2, boolean bl2) {
        int n3;
        qf qf2;
        boolean bl3;
        int n4;
        Object object;
        if (qg2.n) {
            return;
        }
        ++b;
        if (!(qg2 instanceof qh) && qg2.J() && qu.c(qg2)) {
            qh.X(qg2, rg2, new qo());
        }
        Object object2 = qg2.K(2);
        Object object3 = qg2.K(4);
        int n5 = ((qf)object2).a();
        int n6 = ((qf)object3).a();
        Object object4 = ((qf)object2).a;
        if (object4 != null && ((qf)object2).c) {
            object = ((HashSet)object4).iterator();
            while (object.hasNext()) {
                qf qf3;
                n4 = n2 + 1;
                object4 = (qf)object.next();
                object2 = ((qf)object4).d;
                bl3 = qu.c((qg)object2);
                if (((qg)object2).J() && bl3) {
                    qh.X((qg)object2, rg2, new qo());
                }
                n3 = object4 == (qf2 = ((qg)object2).J) && (qf3 = ((qg)object2).L.e) != null && qf3.c || object4 == ((qg)object2).L && (qf2 = qf2.e) != null && qf2.c ? 1 : 0;
                if (((qg)object2).M() == 3 && !bl3) {
                    if (((qg)object2).M() != 3 || ((qg)object2).w < 0 || ((qg)object2).v < 0 || ((qg)object2).ah != 8 && (((qg)object2).s != 0 || ((qg)object2).X != 0.0f) || ((qg)object2).H() || n3 == 0 || ((qg)object2).H()) continue;
                    qu.f(n4, qg2, rg2, (qg)object2, bl2);
                    continue;
                }
                if (((qg)object2).J()) continue;
                qf2 = ((qg)object2).J;
                if (object4 == qf2 && ((qg)object2).L.e == null) {
                    n3 = qf2.b() + n5;
                    ((qg)object2).v(n3, ((qg)object2).j() + n3);
                    qu.a(n4, (qg)object2, rg2, bl2);
                    continue;
                }
                qf3 = ((qg)object2).L;
                if (object4 == qf3 && qf2.e == null) {
                    n3 = n5 - qf3.b();
                    ((qg)object2).v(n3 - ((qg)object2).j(), n3);
                    qu.a(n4, (qg)object2, rg2, bl2);
                    continue;
                }
                if (n3 == 0 || ((qg)object2).H()) continue;
                qu.e(n4, rg2, (qg)object2, bl2);
            }
        }
        if (qg2 instanceof qj) return;
        object4 = ((qf)object3).a;
        if (object4 != null && ((qf)object3).c) {
            object4 = ((HashSet)object4).iterator();
            while (object4.hasNext()) {
                n4 = n2 + 1;
                object2 = (qf)object4.next();
                object3 = ((qf)object2).d;
                bl3 = qu.c((qg)object3);
                if (((qg)object3).J() && bl3) {
                    qh.X((qg)object3, rg2, new qo());
                }
                n3 = object2 == (qf2 = ((qg)object3).J) && (object = ((qg)object3).L.e) != null && ((qf)object).c || object2 == ((qg)object3).L && (object = qf2.e) != null && ((qf)object).c ? 1 : 0;
                if (((qg)object3).M() == 3 && !bl3) {
                    if (((qg)object3).M() != 3 || ((qg)object3).w < 0 || ((qg)object3).v < 0 || ((qg)object3).ah != 8 && (((qg)object3).s != 0 || ((qg)object3).X != 0.0f) || ((qg)object3).H() || n3 == 0 || ((qg)object3).H()) continue;
                    qu.f(n4, qg2, rg2, (qg)object3, bl2);
                    continue;
                }
                if (((qg)object3).J()) continue;
                qf2 = ((qg)object3).J;
                if (object2 == qf2 && ((qg)object3).L.e == null) {
                    n3 = qf2.b() + n6;
                    ((qg)object3).v(n3, ((qg)object3).j() + n3);
                    qu.a(n4, (qg)object3, rg2, bl2);
                    continue;
                }
                object = ((qg)object3).L;
                if (object2 == object && qf2.e == null) {
                    n3 = n6 - ((qf)object).b();
                    ((qg)object3).v(n3 - ((qg)object3).j(), n3);
                    qu.a(n4, (qg)object3, rg2, bl2);
                    continue;
                }
                if (n3 == 0 || ((qg)object3).H()) continue;
                qu.e(n4, rg2, (qg)object3, bl2);
            }
        }
        qg2.n = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(int n2, qg qg2, rg rg2) {
        int n3;
        qf qf2;
        boolean bl2;
        int n4;
        Object object;
        if (qg2.o) {
            return;
        }
        ++c;
        if (!(qg2 instanceof qh) && qg2.J() && qu.c(qg2)) {
            qh.X(qg2, rg2, new qo());
        }
        Object object2 = qg2.K(3);
        qf qf32 = qg2.K(5);
        int n5 = ((qf)object2).a();
        int n6 = qf32.a();
        Object object3 = ((qf)object2).a;
        if (object3 != null && ((qf)object2).c) {
            object = ((HashSet)object3).iterator();
            while (object.hasNext()) {
                qf qf4;
                n4 = n2 + 1;
                object3 = (qf)object.next();
                object2 = ((qf)object3).d;
                bl2 = qu.c((qg)object2);
                if (((qg)object2).J() && bl2) {
                    qh.X((qg)object2, rg2, new qo());
                }
                n3 = object3 == (qf2 = ((qg)object2).K) && (qf4 = ((qg)object2).M.e) != null && qf4.c || object3 == ((qg)object2).M && (qf2 = qf2.e) != null && qf2.c ? 1 : 0;
                if (((qg)object2).N() == 3 && !bl2) {
                    if (((qg)object2).N() != 3 || ((qg)object2).z < 0 || ((qg)object2).y < 0 || ((qg)object2).ah != 8 && (((qg)object2).t != 0 || ((qg)object2).X != 0.0f) || ((qg)object2).I() || n3 == 0 || ((qg)object2).I()) continue;
                    qu.h(n4, qg2, rg2, (qg)object2);
                    continue;
                }
                if (((qg)object2).J()) continue;
                qf4 = ((qg)object2).K;
                if (object3 == qf4 && ((qg)object2).M.e == null) {
                    n3 = qf4.b() + n5;
                    ((qg)object2).w(n3, ((qg)object2).h() + n3);
                    qu.b(n4, (qg)object2, rg2);
                    continue;
                }
                qf2 = ((qg)object2).M;
                if (object3 == qf2 && qf4.e == null) {
                    n3 = n5 - qf2.b();
                    ((qg)object2).w(n3 - ((qg)object2).h(), n3);
                    qu.b(n4, (qg)object2, rg2);
                    continue;
                }
                if (n3 == 0 || ((qg)object2).I()) continue;
                qu.g(n4, rg2, (qg)object2);
            }
        }
        if (qg2 instanceof qj) return;
        object2 = qf32.a;
        if (object2 != null && qf32.c) {
            object3 = ((HashSet)object2).iterator();
            while (object3.hasNext()) {
                n5 = n2 + 1;
                qf32 = (qf)object3.next();
                object2 = qf32.d;
                bl2 = qu.c((qg)object2);
                if (((qg)object2).J() && bl2) {
                    qh.X((qg)object2, rg2, new qo());
                }
                n3 = qf32 == (object = ((qg)object2).K) && (qf2 = ((qg)object2).M.e) != null && qf2.c || qf32 == ((qg)object2).M && (object = ((qf)object).e) != null && ((qf)object).c ? 1 : 0;
                if (((qg)object2).N() == 3 && !bl2) {
                    if (((qg)object2).N() != 3 || ((qg)object2).z < 0 || ((qg)object2).y < 0 || ((qg)object2).ah != 8 && (((qg)object2).t != 0 || ((qg)object2).X != 0.0f) || ((qg)object2).I() || n3 == 0 || ((qg)object2).I()) continue;
                    qu.h(n5, qg2, rg2, (qg)object2);
                    continue;
                }
                if (((qg)object2).J()) continue;
                qf2 = ((qg)object2).K;
                if (qf32 == qf2 && ((qg)object2).M.e == null) {
                    n3 = qf2.b() + n6;
                    ((qg)object2).w(n3, ((qg)object2).h() + n3);
                    qu.b(n5, (qg)object2, rg2);
                    continue;
                }
                object = ((qg)object2).M;
                if (qf32 == object && qf2.e == null) {
                    n3 = n6 - ((qf)object).b();
                    ((qg)object2).w(n3 - ((qg)object2).h(), n3);
                    qu.b(n5, (qg)object2, rg2);
                    continue;
                }
                if (n3 == 0 || ((qg)object2).I()) continue;
                qu.g(n5, rg2, (qg)object2);
            }
        }
        qf32 = qg2.K(6);
        if (qf32.a != null && qf32.c) {
            n3 = qf32.a();
            for (qf qf32 : qf32.a) {
                object2 = qf32.d;
                bl2 = qu.c((qg)object2);
                if (((qg)object2).J() && bl2) {
                    qh.X((qg)object2, rg2, new qo());
                }
                if (((qg)object2).N() == 3 && !bl2 || ((qg)object2).J() || qf32 != ((qg)object2).N) continue;
                n5 = qf32.b() + n3;
                if (((qg)object2).F) {
                    n4 = n5 - ((qg)object2).ab;
                    n6 = ((qg)object2).W;
                    ((qg)object2).aa = n4;
                    ((qg)object2).K.e(n4);
                    ((qg)object2).M.e(n6 + n4);
                    ((qg)object2).N.e(n5);
                    ((qg)object2).m = true;
                }
                qu.b(n2 + 1, (qg)object2, rg2);
            }
        }
        qg2.o = true;
    }

    /*
     * Unable to fully structure code
     */
    public static boolean c(qg var0) {
        block13: {
            block12: {
                var1_1 = var0.M();
                var2_2 = var0.N();
                var5_4 = var6_3 = var0.U;
                if (var6_3 == null) {
                    var5_4 = null;
                }
                if (var5_4 != null) {
                    var5_4.M();
                }
                if (var5_4 != null) {
                    var5_4.N();
                }
                if (var1_1 == 1 || var0.e() || var1_1 == 2) ** GOTO lbl22
                if (var1_1 != 3) break block12;
                if (var0.s == 0 && var0.X == 0.0f && var0.F(0)) ** GOTO lbl22
                ** GOTO lbl-1000
            }
            if (var1_1 != 3) {
                while (true) {
                    var1_1 = 0;
                    break;
                }
            } else lbl-1000:
            // 2 sources

            {
                if (var0.s != 1 || !var0.G(0, var0.j())) ** continue;
lbl22:
                // 3 sources

                var1_1 = 1;
            }
            if (var2_2 == 1 || var0.f() || var2_2 == 2) ** GOTO lbl33
            if (var2_2 != 3) break block13;
            if (var0.t == 0 && var0.X == 0.0f && var0.F(1)) ** GOTO lbl33
            ** GOTO lbl-1000
        }
        if (var2_2 != 3) {
            while (true) {
                var2_2 = 0;
                break;
            }
        } else lbl-1000:
        // 2 sources

        {
            if (var0.t != 1 || !var0.G(1, var0.h())) ** continue;
lbl33:
            // 3 sources

            var2_2 = 1;
        }
        var3_5 = var1_1;
        var4_6 = var2_2;
        if (var0.X > 0.0f) {
            if (var1_1 == 0 && var2_2 == 0) {
                var3_5 = 0;
                var4_6 = 0;
            } else {
                return true;
            }
        }
        return var3_5 != 0 && var4_6 != 0;
    }

    public static void d(qd qd2, rg rg2, int n2, boolean bl2) {
        if (qd2.c()) {
            if (n2 == 0) {
                qu.a(1, qd2, rg2, bl2);
                return;
            }
            qu.b(1, qd2, rg2);
        }
    }

    private static void e(int n2, rg rg2, qg qg2, boolean bl2) {
        float f2 = qg2.ae;
        int n3 = qg2.J.e.a();
        int n4 = qg2.L.e.a();
        int n5 = qg2.J.b() + n3;
        int n6 = n4 - qg2.L.b();
        if (n3 == n4) {
            n6 = n4;
        }
        if (n3 == n4) {
            n5 = n3;
        }
        if (n3 == n4) {
            f2 = 0.5f;
        }
        n3 = qg2.j();
        n4 = n6 - n5 - n3;
        if (n5 > n6) {
            n4 = n5 - n6 - n3;
        }
        f2 = n4 > 0 ? f2 * (float)n4 + 0.5f : (f2 *= (float)n4);
        int n7 = (int)f2 + n5;
        n4 = n7 + n3;
        if (n5 > n6) {
            n4 = n7 - n3;
        }
        qg2.v(n7, n4);
        qu.a(n2 + 1, qg2, rg2, bl2);
    }

    private static void f(int n2, qg qg2, rg rg2, qg qg3, boolean bl2) {
        float f2 = qg3.ae;
        int n3 = qg3.J.e.a() + qg3.J.b();
        int n4 = qg3.L.e.a() - qg3.L.b();
        if (n4 >= n3) {
            int n5 = qg3.j();
            int n6 = qg3.ah;
            int n7 = n4 - n3;
            n4 = n5;
            if (n6 != 8) {
                n6 = qg3.s;
                if (n6 == 2) {
                    n4 = qg2 instanceof qh ? qg2.j() : qg2.U.j();
                    n4 = (int)(qg3.ae * 0.5f * (float)n4);
                } else {
                    n4 = n5;
                    if (n6 == 0) {
                        n4 = n7;
                    }
                }
                n5 = Math.max(qg3.v, n4);
                n6 = qg3.w;
                n4 = n5;
                if (n6 > 0) {
                    n4 = Math.min(n6, n5);
                }
            }
            n5 = n3 + (int)(f2 * (float)(n7 - n4) + 0.5f);
            qg3.v(n5, n4 + n5);
            qu.a(n2 + 1, qg3, rg2, bl2);
        }
    }

    private static void g(int n2, rg rg2, qg qg2) {
        float f2 = qg2.af;
        int n3 = qg2.K.e.a();
        int n4 = qg2.M.e.a();
        int n5 = qg2.K.b() + n3;
        int n6 = n4 - qg2.M.b();
        if (n3 == n4) {
            n6 = n4;
        }
        if (n3 == n4) {
            n5 = n3;
        }
        if (n3 == n4) {
            f2 = 0.5f;
        }
        int n7 = qg2.h();
        n3 = n6 - n5 - n7;
        if (n5 > n6) {
            n3 = n5 - n6 - n7;
        }
        f2 = n3 > 0 ? f2 * (float)n3 + 0.5f : (f2 *= (float)n3);
        int n8 = (int)f2;
        n3 = n5 + n8;
        n4 = n3 + n7;
        if (n5 > n6) {
            n3 = n5 - n8;
            n4 = n3 - n7;
        }
        qg2.w(n3, n4);
        qu.b(n2 + 1, qg2, rg2);
    }

    private static void h(int n2, qg qg2, rg rg2, qg qg3) {
        float f2 = qg3.af;
        int n3 = qg3.K.e.a() + qg3.K.b();
        int n4 = qg3.M.e.a() - qg3.M.b();
        if (n4 >= n3) {
            int n5 = qg3.h();
            int n6 = qg3.ah;
            int n7 = n4 - n3;
            n4 = n5;
            if (n6 != 8) {
                n6 = qg3.t;
                if (n6 == 2) {
                    n4 = qg2 instanceof qh ? qg2.h() : qg2.U.h();
                    n4 = (int)(f2 * 0.5f * (float)n4);
                } else {
                    n4 = n5;
                    if (n6 == 0) {
                        n4 = n7;
                    }
                }
                n5 = Math.max(qg3.y, n4);
                n6 = qg3.z;
                n4 = n5;
                if (n6 > 0) {
                    n4 = Math.min(n6, n5);
                }
            }
            n5 = n3 + (int)(f2 * (float)(n7 - n4) + 0.5f);
            qg3.w(n5, n4 + n5);
            qu.b(n2 + 1, qg3, rg2);
        }
    }
}

