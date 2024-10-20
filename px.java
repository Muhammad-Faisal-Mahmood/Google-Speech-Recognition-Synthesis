/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

public final class px {
    public static boolean a = false;
    public static long b;
    public boolean c = false;
    int d = 0;
    pw[] e;
    public boolean f = false;
    public boolean g = false;
    int h = 1;
    int i = 0;
    public final AmbientDelegate j;
    private int k = 1000;
    private int l = 32;
    private int m = 32;
    private boolean[] n = new boolean[32];
    private int o = 32;
    private qb[] p = new qb[1000];
    private int q = 0;
    private final pw r;
    private pw s;

    public px() {
        AmbientDelegate ambientDelegate;
        this.e = new pw[32];
        this.t();
        this.j = ambientDelegate = new AmbientDelegate(null);
        this.r = new qa(ambientDelegate);
        this.s = new pw(ambientDelegate);
    }

    public static final int o(Object object) {
        object = ((qf)object).h;
        if (object != null) {
            return (int)(((qb)object).f + 0.5f);
        }
        return 0;
    }

    private final void q(pw object) {
        int n2;
        Object object2;
        if (object.d) {
            object.a.d(this, object.b);
        } else {
            object2 = this.e;
            n2 = this.i;
            object2[n2] = object;
            object2 = object.a;
            ((qb)object2).d = n2;
            this.i = n2 + 1;
            ((qb)object2).e(this, (pw)object);
        }
        if (this.c) {
            n2 = 0;
            while (n2 < this.i) {
                if (this.e[n2] == null) {
                    System.out.println("WTF");
                }
                object = this.e[n2];
                int n3 = n2;
                if (object != null) {
                    n3 = n2;
                    if (object.d) {
                        int n4;
                        object.a.d(this, object.b);
                        ((kjx)this.j.c).k(object);
                        this.e[n2] = null;
                        int n5 = n3 = n2 + 1;
                        while (n3 < (n4 = this.i)) {
                            object = this.e;
                            n5 = n3 - 1;
                            object[n5] = object2 = object[n3];
                            object = ((pw)object2).a;
                            if (object.d == n3) {
                                object.d = n5;
                            }
                            n5 = n3++;
                        }
                        if (n5 < n4) {
                            this.e[n5] = null;
                        }
                        this.i = n4 - 1;
                        n3 = n2 - 1;
                    }
                }
                n2 = n3 + 1;
            }
            this.c = false;
        }
    }

    private final void r() {
        for (int i2 = 0; i2 < this.i; ++i2) {
            pw pw2 = this.e[i2];
            pw2.a.f = pw2.b;
        }
    }

    private final void s() {
        int n2 = this.l;
        n2 += n2;
        this.l = n2;
        this.e = Arrays.copyOf(this.e, n2);
        qb[] qbArray = this.j.a;
        n2 = this.l;
        this.j.a = qbArray = (qb[])Arrays.copyOf((Object[])qbArray, n2);
        n2 = this.l;
        this.n = new boolean[n2];
        this.m = n2;
        this.o = n2;
    }

    private final void t() {
        for (int i2 = 0; i2 < this.i; ++i2) {
            pw pw2 = this.e[i2];
            if (pw2 != null) {
                ((kjx)this.j.c).k(pw2);
            }
            this.e[i2] = null;
        }
    }

    private final void u(pw pw2) {
        int n2;
        for (n2 = 0; n2 < this.h; ++n2) {
            this.n[n2] = false;
        }
        n2 = 0;
        int n3 = 0;
        while (n2 == 0) {
            Object object;
            n2 = 1;
            int n4 = n3 + 1;
            if (n4 >= (n3 = this.h) + n3) break;
            qb qb2 = pw2.a;
            if (qb2 != null) {
                this.n[qb2.c] = true;
            }
            if ((qb2 = pw2.k(this.n)) != null) {
                object = this.n;
                n3 = qb2.c;
                if (object[n3]) break;
                object[n3] = true;
            }
            n3 = n4;
            if (qb2 == null) continue;
            float f2 = Float.MAX_VALUE;
            n3 = -1;
            for (n2 = 0; n2 < this.i; ++n2) {
                int n5;
                float f3;
                object = this.e[n2];
                if (object.a.n == 1) {
                    f3 = f2;
                    n5 = n3;
                } else {
                    f3 = f2;
                    n5 = n3;
                    if (!object.d) {
                        pv pv2 = object.e;
                        int n6 = pv2.e;
                        f3 = f2;
                        n5 = n3;
                        if (n6 != -1) {
                            int n7 = 0;
                            while (true) {
                                f3 = f2;
                                n5 = n3;
                                if (n6 == -1) break;
                                f3 = f2;
                                n5 = n3;
                                if (n7 >= pv2.a) break;
                                if (pv2.b[n6] == qb2.c) {
                                    float f4 = object.e.a(qb2);
                                    f3 = f2;
                                    n5 = n3;
                                    if (!(f4 < 0.0f)) break;
                                    f4 = -object.b / f4;
                                    f3 = f2;
                                    n5 = n3;
                                    if (!(f4 < f2)) break;
                                    n5 = n2;
                                    f3 = f4;
                                    break;
                                }
                                n6 = pv2.c[n6];
                                ++n7;
                            }
                        }
                    }
                }
                f2 = f3;
                n3 = n5;
            }
            if (n3 >= 0) {
                object = this.e[n3];
                object.a.d = -1;
                object.b(qb2);
                qb2 = object.a;
                qb2.d = n3;
                qb2.e(this, (pw)object);
            }
            n2 = 0;
            n3 = n4;
        }
    }

    private final qb v(int n2) {
        qb qb2 = (qb)((kjx)this.j.b).j();
        if (qb2 == null) {
            qb2 = new qb(n2);
            qb2.n = n2;
        } else {
            qb2.c();
            qb2.n = n2;
        }
        int n3 = this.q;
        n2 = this.k;
        if (n3 >= n2) {
            n2 += n2;
            this.k = n2;
            this.p = Arrays.copyOf(this.p, n2);
        }
        qb[] qbArray = this.p;
        n2 = this.q;
        this.q = n2 + 1;
        qbArray[n2] = qb2;
        return qb2;
    }

    public final pw a() {
        pw pw2 = (pw)((kjx)this.j.c).j();
        if (pw2 == null) {
            pw2 = new pw(this.j);
            ++b;
        } else {
            pw2.a = null;
            pw2.e.f();
            pw2.b = 0.0f;
            pw2.d = false;
        }
        ++qb.a;
        return pw2;
    }

    public final qb b(Object object) {
        block8: {
            int n2;
            block7: {
                if (object == null) {
                    return null;
                }
                if (this.h + 1 >= this.m) {
                    this.s();
                }
                qf qf2 = (qf)object;
                qb qb2 = qf2.h;
                object = qb2;
                if (qb2 == null) {
                    qf2.i();
                    object = qf2.h;
                }
                if ((n2 = ((qb)object).c) == -1) break block7;
                if (n2 <= this.d && ((qb[])this.j.a)[n2] != null) break block8;
                if (n2 != -1) {
                    ((qb)object).c();
                }
            }
            this.d = n2 = this.d + 1;
            ++this.h;
            ((qb)object).c = n2;
            ((qb)object).n = 1;
            ((qb[])this.j.a)[n2] = object;
        }
        return object;
    }

    public final qb c() {
        int n2;
        if (this.h + 1 >= this.m) {
            this.s();
        }
        qb qb2 = this.v(3);
        this.d = n2 = this.d + 1;
        ++this.h;
        qb2.c = n2;
        ((qb[])this.j.a)[n2] = qb2;
        return qb2;
    }

    public final void d(qb qb2, qb qb3, int n2, float f2, qb qb4, qb qb5, int n3, int n4) {
        pw pw2 = this.a();
        if (qb3 == qb4) {
            pw2.e.g(qb2, 1.0f);
            pw2.e.g(qb5, 1.0f);
            pw2.e.g(qb3, -2.0f);
        } else if (f2 == 0.5f) {
            pw2.e.g(qb2, 1.0f);
            pw2.e.g(qb3, -1.0f);
            pw2.e.g(qb4, -1.0f);
            pw2.e.g(qb5, 1.0f);
            if (n2 > 0 || n3 > 0) {
                pw2.b = -n2 + n3;
            }
        } else if (f2 <= 0.0f) {
            pw2.e.g(qb2, -1.0f);
            pw2.e.g(qb3, 1.0f);
            pw2.b = n2;
        } else if (f2 >= 1.0f) {
            pw2.e.g(qb5, -1.0f);
            pw2.e.g(qb4, 1.0f);
            pw2.b = -n3;
        } else {
            pv pv2 = pw2.e;
            float f3 = 1.0f - f2;
            pv2.g(qb2, f3);
            pw2.e.g(qb3, -f3);
            pw2.e.g(qb4, -f2);
            pw2.e.g(qb5, f2);
            if (n2 > 0 || n3 > 0) {
                n2 = -n2;
                float f4 = n3;
                pw2.b = (float)n2 * f3 + f4 * f2;
            }
        }
        if (n4 != 8) {
            pw2.f(this, n4);
        }
        this.e(pw2);
    }

    /*
     * Unable to fully structure code
     */
    public final void e(pw var1_1) {
        block37: {
            block38: {
                if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
                    this.s();
                }
                if (var1_1.d) break block37;
                if (this.e.length != 0) {
                    var7_2 = 0;
                    while (var7_2 == 0) {
                        var9_4 = var1_1.e.a;
                        for (var8_3 = 0; var8_3 < var9_4; ++var8_3) {
                            var14_6 = var1_1.e.d(var8_3);
                            if (var14_6.d == -1 && !var14_6.g) {
                                var10_5 = var14_6.m;
                                continue;
                            }
                            var1_1.c.add(var14_6);
                        }
                        var9_4 = var1_1.c.size();
                        if (var9_4 > 0) {
                            for (var8_3 = 0; var8_3 < var9_4; ++var8_3) {
                                var14_6 = (qb)var1_1.c.get(var8_3);
                                if (var14_6.g) {
                                    var1_1.c(this, (qb)var14_6, true);
                                    continue;
                                }
                                var10_5 = var14_6.m;
                                var1_1.d(this, this.e[var14_6.d], true);
                            }
                            var1_1.c.clear();
                            continue;
                        }
                        var7_2 = 1;
                    }
                    if (var1_1.a != null && var1_1.e.a == 0) {
                        var1_1.d = true;
                        this.c = true;
                    }
                }
                if (var1_1.e()) break block38;
                var2_7 = var1_1.b;
                if (var2_7 < 0.0f) {
                    var1_1.b = -var2_7;
                    var15_8 = var1_1.e;
                    var8_3 = var15_8.e;
                    for (var7_2 = 0; var8_3 != -1 && var7_2 < var15_8.a; ++var7_2) {
                        var14_6 = var15_8.d;
                        var14_6[var8_3] = -var14_6[var8_3];
                        var8_3 = var15_8.c[var8_3];
                    }
                }
                var8_3 = var1_1.e.a;
                var4_9 = 0.0f;
                var2_7 = 0.0f;
                var16_10 = null;
                var15_8 = null;
                var12_11 = false;
                var11_12 = false;
                for (var7_2 = 0; var7_2 < var8_3; ++var7_2) {
                    block36: {
                        block41: {
                            block42: {
                                block39: {
                                    block40: {
                                        var6_15 = var1_1.e.b(var7_2);
                                        var18_18 = var1_1.e.d(var7_2);
                                        if (var18_18.n != 1) break block39;
                                        if (var16_10 == null) {
                                            var10_5 = pw.l(var18_18);
lbl57:
                                            // 3 sources

                                            while (true) {
                                                var14_6 = var18_18;
                                                var3_13 = var6_15;
                                                var17_17 = var15_8;
                                                var13_16 = var10_5;
                                                var5_14 = var2_7;
                                                var10_5 = var11_12;
                                                break block36;
                                                break;
                                            }
                                        }
                                        if (!(var4_9 > var6_15)) break block40;
                                        var10_5 = pw.l(var18_18);
                                        ** GOTO lbl57
                                    }
                                    var14_6 = var16_10;
                                    var17_17 = var15_8;
                                    var3_13 = var4_9;
                                    var13_16 = var12_11;
                                    var5_14 = var2_7;
                                    var10_5 = var11_12;
                                    if (!var12_11) {
                                        var14_6 = var16_10;
                                        var17_17 = var15_8;
                                        var3_13 = var4_9;
                                        var13_16 = var12_11;
                                        var5_14 = var2_7;
                                        var10_5 = var11_12;
                                        if (pw.l(var18_18)) {
                                            var10_5 = true;
                                            ** continue;
                                        }
                                    }
                                    break block36;
                                }
                                var14_6 = var16_10;
                                var17_17 = var15_8;
                                var3_13 = var4_9;
                                var13_16 = var12_11;
                                var5_14 = var2_7;
                                var10_5 = var11_12;
                                if (var16_10 != null) break block36;
                                if (!(var6_15 < 0.0f)) break block41;
                                if (var15_8 == null) {
                                    var10_5 = pw.l(var18_18);
lbl97:
                                    // 3 sources

                                    while (true) {
                                        var17_17 = var18_18;
                                        var14_6 = null;
                                        var5_14 = var6_15;
                                        var3_13 = var4_9;
                                        var13_16 = var12_11;
                                        break block36;
                                        break;
                                    }
                                }
                                if (!(var2_7 > var6_15)) break block42;
                                var10_5 = pw.l(var18_18);
                                ** GOTO lbl97
                            }
                            if (!var11_12 && pw.l(var18_18)) {
                                var10_5 = true;
                                ** continue;
                            }
                        }
                        var14_6 = null;
                        var10_5 = var11_12;
                        var5_14 = var2_7;
                        var13_16 = var12_11;
                        var3_13 = var4_9;
                        var17_17 = var15_8;
                    }
                    var16_10 = var14_6;
                    var15_8 = var17_17;
                    var4_9 = var3_13;
                    var12_11 = var13_16;
                    var2_7 = var5_14;
                    var11_12 = var10_5;
                }
                var14_6 = var16_10;
                if (var16_10 == null) {
                    var14_6 = var15_8;
                }
                if (var14_6 == null) {
                    var7_2 = 1;
                } else {
                    var1_1.b((qb)var14_6);
                    var7_2 = 0;
                }
                if (var1_1.e.a == 0) {
                    var1_1.d = true;
                }
                if (var7_2 == 0) ** GOTO lbl-1000
                if (this.h + 1 >= this.m) {
                    this.s();
                }
                var15_8 = this.v(3);
                this.d = var7_2 = this.d + 1;
                ++this.h;
                var15_8.c = var7_2;
                ((qb[])this.j.a)[var7_2] = var15_8;
                var1_1.a = var15_8;
                var7_2 = this.i;
                this.q(var1_1);
                if (this.i == var7_2 + 1) {
                    var14_6 = this.s;
                    var14_6.a = null;
                    var14_6.e.f();
                    var7_2 = 0;
                    while (true) {
                        var16_10 = var1_1.e;
                        if (var7_2 >= var16_10.a) break;
                        var16_10 = var16_10.d(var7_2);
                        var2_7 = var1_1.e.b(var7_2);
                        var14_6.e.e((qb)var16_10, var2_7, true);
                        ++var7_2;
                    }
                    this.u(this.s);
                    if (var15_8.d == -1) {
                        if (var1_1.a == var15_8 && (var14_6 = var1_1.a(null, (qb)var15_8)) != null) {
                            var1_1.b((qb)var14_6);
                        }
                        if (!var1_1.d) {
                            var1_1.a.e(this, var1_1);
                        }
                        ((kjx)this.j.c).k(var1_1);
                        --this.i;
                    }
                    var7_2 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var7_2 = 0;
                }
                var14_6 = var1_1.a;
                if (!(var14_6 == null || var14_6.n != 1 && var1_1.b < 0.0f || var7_2 != 0)) break block37;
            }
            return;
        }
        this.q(var1_1);
    }

    public final void f(qb qb2, int n2) {
        int n3 = qb2.d;
        if (n3 == -1) {
            qb2.d(this, n2);
            for (n2 = 0; n2 < this.d + 1; ++n2) {
                qb2 = ((qb[])this.j.a)[n2];
            }
            return;
        }
        if (n3 != -1) {
            pw pw2 = this.e[n3];
            if (pw2.d) {
                pw2.b = n2;
                return;
            }
            if (pw2.e.a == 0) {
                float f2 = n2;
                pw2.d = true;
                pw2.b = f2;
                return;
            }
            pw2 = this.a();
            if (n2 < 0) {
                pw2.b = -n2;
                pw2.e.g(qb2, 1.0f);
            } else {
                pw2.b = n2;
                pw2.e.g(qb2, -1.0f);
            }
            this.e(pw2);
            return;
        }
        float f3 = n2;
        pw pw3 = this.a();
        pw3.a = qb2;
        qb2.f = f3;
        pw3.b = f3;
        pw3.d = true;
        this.e(pw3);
    }

    public final void g(qb qb2, qb qb3, int n2, int n3) {
        pw pw2 = this.a();
        qb qb4 = this.c();
        qb4.e = 0;
        pw2.h(qb2, qb3, qb4, n2);
        if (n3 != 8) {
            this.i(pw2, (int)(-pw2.e.a(qb4)), n3);
        }
        this.e(pw2);
    }

    public final void h(qb qb2, qb qb3, int n2, int n3) {
        pw pw2 = this.a();
        qb qb4 = this.c();
        qb4.e = 0;
        pw2.i(qb2, qb3, qb4, n2);
        if (n3 != 8) {
            this.i(pw2, (int)(-pw2.e.a(qb4)), n3);
        }
        this.e(pw2);
    }

    final void i(pw pw2, int n2, int n3) {
        qb qb2 = this.p(n3);
        float f2 = n2;
        pw2.e.g(qb2, f2);
    }

    public final void j() {
        pw pw2 = this.r;
        if (pw2.e()) {
            this.r();
            return;
        }
        if (this.g) {
            for (int i2 = 0; i2 < this.i; ++i2) {
                if (this.e[i2].d) continue;
                this.l(this.r);
                return;
            }
            this.r();
            return;
        }
        this.l(pw2);
    }

    public final void k() {
        Object object;
        Object object2;
        int n2 = 0;
        while (true) {
            object2 = this.j;
            object = (qb[])((AmbientDelegate)object2).a;
            if (n2 >= ((qb[])object).length) break;
            if ((object = object[n2]) != null) {
                ((qb)object).c();
            }
            ++n2;
        }
        object = ((AmbientDelegate)object2).b;
        qb[] qbArray = this.p;
        int n3 = this.q;
        int n4 = qbArray.length;
        n2 = n3;
        if (n3 > n4) {
            n2 = n4;
        }
        for (n4 = 0; n4 < n2; ++n4) {
            qb qb2 = qbArray[n4];
            object2 = (kjx)object;
            n3 = ((kjx)object2).a;
            if (n3 >= 256) continue;
            ((Object[])((kjx)object2).b)[n3] = qb2;
            ((kjx)object2).a = n3 + 1;
        }
        this.q = 0;
        Arrays.fill((Object[])this.j.a, null);
        this.d = 0;
        object = (qa)this.r;
        ((qa)object).f = 0;
        ((qa)object).b = 0.0f;
        this.h = 1;
        for (n2 = 0; n2 < this.i; ++n2) {
            object = this.e[n2];
        }
        this.t();
        this.i = 0;
        this.s = new pw(this.j);
    }

    final void l(pw pw2) {
        for (int i2 = 0; i2 < this.i; ++i2) {
            Object object = this.e[i2];
            if (((pw)object).a.n == 1 || !(((pw)object).b < 0.0f)) continue;
            i2 = 0;
            int n2 = 0;
            while (i2 == 0) {
                pw pw3;
                int n3 = n2 + 1;
                float f2 = Float.MAX_VALUE;
                int n4 = -1;
                i2 = -1;
                n2 = 0;
                for (int i3 = 0; i3 < this.i; ++i3) {
                    int n5;
                    int n6;
                    int n7;
                    float f3;
                    block11: {
                        block10: {
                            pw3 = this.e[i3];
                            if (pw3.a.n != 1) break block10;
                            f3 = f2;
                            n7 = n4;
                            n6 = i2;
                            n5 = n2;
                            break block11;
                        }
                        f3 = f2;
                        n7 = n4;
                        n6 = i2;
                        n5 = n2;
                        if (pw3.d) break block11;
                        f3 = f2;
                        n7 = n4;
                        n6 = i2;
                        n5 = n2;
                        if (!(pw3.b < 0.0f)) break block11;
                        int n8 = pw3.e.a;
                        int n9 = 0;
                        while (true) {
                            int n10;
                            block13: {
                                float f4;
                                block12: {
                                    f3 = f2;
                                    n7 = n4;
                                    n6 = i2;
                                    n5 = n2;
                                    if (n9 >= n8) break;
                                    object = pw3.e.d(n9);
                                    f4 = pw3.e.a((qb)object);
                                    if (!(f4 <= 0.0f)) break block12;
                                    f3 = f2;
                                    n10 = n4;
                                    n6 = i2;
                                    n7 = n2;
                                    break block13;
                                }
                                n7 = 0;
                                n5 = i2;
                                i2 = n7;
                                while (true) {
                                    block15: {
                                        block14: {
                                            f3 = f2;
                                            n10 = n4;
                                            n6 = n5;
                                            n7 = n2;
                                            if (i2 >= 9) break;
                                            f3 = ((qb)object).h[i2] / f4;
                                            if (f3 < f2 && i2 == n2) break block14;
                                            n7 = n2;
                                            if (i2 <= n2) break block15;
                                        }
                                        n5 = ((qb)object).c;
                                        n7 = i2;
                                        f2 = f3;
                                        n4 = i3;
                                    }
                                    ++i2;
                                    n2 = n7;
                                }
                            }
                            ++n9;
                            f2 = f3;
                            n4 = n10;
                            i2 = n6;
                            n2 = n7;
                        }
                    }
                    f2 = f3;
                    n4 = n7;
                    i2 = n6;
                    n2 = n5;
                }
                if (n4 != -1) {
                    pw3 = this.e[n4];
                    pw3.a.d = -1;
                    pw3.b(((qb[])this.j.a)[i2]);
                    object = pw3.a;
                    ((qb)object).d = n4;
                    ((qb)object).e(this, pw3);
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                n2 = n3 > this.h / 2 ? 0 : 1;
                i2 = n2 ^ 1 | i2;
                n2 = n3;
            }
            break;
        }
        this.u(pw2);
        this.r();
    }

    /*
     * Unable to fully structure code
     */
    public final void m(qb var1_1, qb var2_2, int var3_3, int var4_4) {
        var5_5 = var4_4;
        if (var4_4 == 8) {
            if (var2_2.g && var1_1.d == -1) {
                var1_1.d(this, var2_2.f + (float)var3_3);
                return;
            }
            var5_5 = 8;
        }
        var7_6 = this.a();
        if (var3_3 == 0) ** GOTO lbl-1000
        if (var3_3 < 0) {
            var4_4 = -var3_3;
            var3_3 = 1;
        } else {
            var6_7 = 0;
            var4_4 = var3_3;
            var3_3 = var6_7;
        }
        var7_6.b = var4_4;
        if (var3_3 != 0) {
            var7_6.e.g(var1_1, 1.0f);
            var7_6.e.g(var2_2, -1.0f);
        } else lbl-1000:
        // 2 sources

        {
            var7_6.e.g(var1_1, -1.0f);
            var7_6.e.g(var2_2, 1.0f);
        }
        if (var5_5 != 8) {
            var7_6.f(this, var5_5);
        }
        this.e(var7_6);
    }

    public final void n(qb qb2, qb qb3, qb qb4, qb qb5, float f2) {
        pw pw2 = this.a();
        pw2.g(qb2, qb3, qb4, qb5, f2);
        this.e(pw2);
    }

    public final qb p(int n2) {
        int n3;
        if (this.h + 1 >= this.m) {
            this.s();
        }
        qb qb2 = this.v(4);
        this.d = n3 = this.d + 1;
        ++this.h;
        qb2.c = n3;
        qb2.e = n2;
        ((qb[])this.j.a)[n3] = qb2;
        qa qa2 = (qa)this.r;
        pz pz2 = qa2.g;
        pz2.a = qb2;
        Arrays.fill(pz2.a.i, 0.0f);
        qb2.i[qb2.e] = 1.0f;
        qa2.m(qb2);
        return qb2;
    }
}

