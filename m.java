/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;

public class m {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public Object J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public int a = -1;
    public float aa;
    m ab;
    m ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    final l i;
    final l j;
    final l k;
    final l l;
    final l m;
    final l n;
    final l o;
    final l p;
    protected final ArrayList q;
    public m r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public m() {
        ArrayList<l> arrayList;
        l l2;
        l l3;
        l l4;
        l l5;
        l l6;
        l l7;
        l l8;
        this.i = l8 = new l(this, 2);
        this.j = l7 = new l(this, 3);
        this.k = l6 = new l(this, 4);
        this.l = l5 = new l(this, 5);
        this.m = l4 = new l(this, 6);
        this.n = l3 = new l(this, 8);
        this.o = l2 = new l(this, 9);
        this.p = new l(this, 7);
        this.q = arrayList = new ArrayList<l>();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(l8);
        arrayList.add(l7);
        arrayList.add(l6);
        arrayList.add(l5);
        arrayList.add(l3);
        arrayList.add(l2);
        arrayList.add(l4);
    }

    private final void A(j j2, boolean bl2, boolean bl3, l object, l object2, int n2, int n3, int n4, int n5, float f2, boolean bl4, boolean bl5, int n6, int n7, int n8) {
        k k2 = j2.e(object);
        k k3 = j2.e(object2);
        k k4 = j2.e(((l)object).b);
        k k5 = j2.e(((l)object2).b);
        int n9 = ((l)object).a();
        int n10 = ((l)object2).a();
        int n11 = this.K;
        boolean bl6 = n11 != 8;
        if (n11 == 8) {
            n4 = 0;
        }
        bl6 = bl6 ^ true | bl3;
        if (k4 == null && k5 == null) {
            object = j2.a();
            ((h)object).g(k2, n2);
            j2.g((h)object);
            if (!bl4) {
                if (bl2) {
                    j2.g(j.c(j2, k3, k2, n5, true));
                    return;
                }
                if (bl6) {
                    j2.g(j.c(j2, k3, k2, n4, false));
                    return;
                }
                object = j2.a();
                ((h)object).g(k3, n3);
                j2.g((h)object);
                return;
            }
        } else if (k4 != null && k5 == null) {
            object = j2.a();
            ((h)object).h(k2, k4, n9);
            j2.g((h)object);
            if (bl2) {
                j2.g(j.c(j2, k3, k2, n5, true));
                return;
            }
            if (!bl4) {
                if (bl6) {
                    object = j2.a();
                    ((h)object).h(k3, k2, n4);
                    j2.g((h)object);
                    return;
                }
                object = j2.a();
                ((h)object).g(k3, n3);
                j2.g((h)object);
                return;
            }
        } else if (k4 == null) {
            n3 = -n10;
            object = j2.a();
            ((h)object).h(k3, k5, n3);
            j2.g((h)object);
            if (bl2) {
                j2.g(j.c(j2, k3, k2, n5, true));
                return;
            }
            if (!bl4) {
                if (bl6) {
                    object = j2.a();
                    ((h)object).h(k3, k2, n4);
                    j2.g((h)object);
                    return;
                }
                object = j2.a();
                ((h)object).g(k2, n2);
                j2.g((h)object);
                return;
            }
        } else if (bl6) {
            Object object3;
            if (bl2) {
                j2.g(j.c(j2, k3, k2, n5, true));
            } else {
                object3 = j2.a();
                ((h)object3).h(k3, k2, n4);
                j2.g((h)object3);
            }
            n2 = ((l)object).h;
            if (n2 != ((l)object2).h) {
                n3 = -n10;
                if (n2 == 2) {
                    object = j2.a();
                    ((h)object).h(k2, k4, n9);
                    j2.g((h)object);
                    object2 = j2.f();
                    object = j2.a();
                    ((h)object).j(k3, k5, (k)object2, n3);
                    j2.g((h)object);
                    return;
                }
                object = j2.f();
                object2 = j2.a();
                ((h)object2).i(k2, k4, (k)object, n9);
                j2.g((h)object2);
                object = j2.a();
                ((h)object).h(k3, k5, n3);
                j2.g((h)object);
                return;
            }
            if (k4 == k5) {
                j2.g(j.b(j2, k2, k4, 0, 0.5f, k5, k3, 0, true));
                return;
            }
            if (!bl5) {
                n2 = -n10;
                n3 = ((l)object).i;
                object3 = j2.f();
                object = j2.a();
                ((h)object).i(k2, k4, (k)object3, n9);
                if (n3 != 2) {
                    j2.k((h)object, (int)(-((h)object).d.a((k)object3)));
                }
                j2.g((h)object);
                n3 = ((l)object2).i;
                object2 = j2.f();
                object = j2.a();
                ((h)object).j(k3, k5, (k)object2, n2);
                if (n3 != 2) {
                    j2.k((h)object, (int)(-((h)object).d.a((k)object2)));
                }
                j2.g((h)object);
                j2.g(j.b(j2, k2, k4, n9, f2, k5, k3, n10, false));
                return;
            }
        } else {
            if (bl4) {
                n2 = -n10;
                j2.i(k2, k4, n9, 3);
                j2.j(k3, k5, n2, 3);
                j2.g(j.b(j2, k2, k4, n9, f2, k5, k3, n10, true));
                return;
            }
            if (!bl5) {
                n5 = -n10;
                if (n6 == 1) {
                    n2 = n7;
                    if (n7 <= n4) {
                        n2 = n4;
                    }
                    n3 = n2;
                    if (n8 > 0) {
                        if (n8 < n2) {
                            n3 = n8;
                        } else {
                            j2.j(k3, k2, n8, 3);
                            n3 = n2;
                        }
                    }
                    j2.n(k3, k2, n3, 3);
                    j2.i(k2, k4, n9, 2);
                    j2.j(k3, k5, n5, 2);
                    j2.m(k2, k4, n9, f2, k5, k3, n10);
                    return;
                }
                if (n7 == 0 && n8 == 0) {
                    object = j2.a();
                    ((h)object).h(k2, k4, n9);
                    j2.g((h)object);
                    object = j2.a();
                    ((h)object).h(k3, k5, n5);
                    j2.g((h)object);
                    return;
                }
                if (n8 > 0) {
                    j2.j(k3, k2, n8, 3);
                }
                j2.i(k2, k4, n9, 2);
                j2.j(k3, k5, n5, 2);
                j2.m(k2, k4, n9, f2, k5, k3, n10);
            }
        }
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int n2;
        int n3 = n2 = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                n2 = Math.max(this.g, n2);
            } else {
                n2 = this.g;
                if (n2 > 0) {
                    this.t = n2;
                } else {
                    n2 = 0;
                }
            }
            int n4 = this.h;
            n3 = n2;
            if (n4 > 0) {
                n3 = n2;
                if (n4 < n2) {
                    return n4;
                }
            }
        }
        return n3;
    }

    public final int f() {
        int n2;
        int n3 = n2 = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                n2 = Math.max(this.e, n2);
            } else {
                n2 = this.e;
                if (n2 > 0) {
                    this.s = n2;
                } else {
                    n2 = 0;
                }
            }
            int n4 = this.f;
            n3 = n2;
            if (n4 > 0) {
                n3 = n2;
                if (n4 < n2) {
                    return n4;
                }
            }
        }
        return n3;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public final void j(int n2) {
        this.t = n2;
        int n3 = this.E;
        if (n2 < n3) {
            this.t = n3;
        }
    }

    public final void k(int n2, int n3) {
        this.w = n2;
        this.s = n2 = n3 - n2;
        n3 = this.D;
        if (n2 < n3) {
            this.s = n3;
        }
    }

    public final void l(int n2) {
        if (n2 < 0) {
            this.E = 0;
            return;
        }
        this.E = n2;
    }

    public final void m(int n2) {
        if (n2 < 0) {
            this.D = 0;
            return;
        }
        this.D = n2;
    }

    public void n(int n2, int n3) {
        this.A = n2;
        this.B = n3;
    }

    public final void o(int n2, int n3) {
        this.x = n2;
        this.t = n3 -= n2;
        n2 = this.E;
        if (n3 < n2) {
            this.t = n2;
        }
    }

    public final void p(int n2) {
        this.s = n2;
        int n3 = this.D;
        if (n2 < n3) {
            this.s = n3;
        }
    }

    public void q() {
        int n2 = this.w;
        int n3 = this.x;
        int n4 = this.s;
        int n5 = this.t;
        this.af = n2;
        this.ag = n3;
        this.y = n4 + n2 - n2;
        this.z = n5 + n3 - n3;
    }

    public final boolean r() {
        return this.C > 0;
    }

    public final boolean s() {
        return this.r == null;
    }

    public l t(int n2) {
        switch (n2 - 1) {
            default: {
                return this.p;
            }
            case 8: {
                return this.o;
            }
            case 7: {
                return this.n;
            }
            case 5: {
                return this.m;
            }
            case 4: {
                return this.l;
            }
            case 3: {
                return this.k;
            }
            case 2: {
                return this.j;
            }
            case 1: 
        }
        return this.i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.w);
        stringBuilder.append(", ");
        stringBuilder.append(this.x);
        stringBuilder.append(") - (");
        stringBuilder.append(this.s);
        stringBuilder.append(" x ");
        stringBuilder.append(this.t);
        stringBuilder.append(") wrap: (");
        stringBuilder.append(this.F);
        stringBuilder.append(" x ");
        stringBuilder.append(this.G);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void u(int n2, m m2, int n3, int n4, int n5) {
        this.t(n2).d(m2.t(n3), n4, n5, 2, 0, true);
    }

    public final void v(int n2) {
        this.ad = n2;
        if (n2 == 2) {
            this.p(this.F);
        }
    }

    public final void w(int n2) {
        this.ae = n2;
        if (n2 == 2) {
            this.j(this.G);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void x(j var1_1) {
        block58: {
            block62: {
                block59: {
                    block63: {
                        block60: {
                            block61: {
                                block57: {
                                    block55: {
                                        block56: {
                                            block51: {
                                                block53: {
                                                    block52: {
                                                        block54: {
                                                            block48: {
                                                                block50: {
                                                                    block49: {
                                                                        block46: {
                                                                            block47: {
                                                                                block45: {
                                                                                    block44: {
                                                                                        var24_2 = var1_1.e(this.i);
                                                                                        var25_3 = var1_1.e(this.k);
                                                                                        var19_4 = var1_1.e(this.j);
                                                                                        var20_5 = var1_1.e(this.l);
                                                                                        var23_6 = var1_1.e(this.m);
                                                                                        var21_7 = this.r;
                                                                                        if (var21_7 == null) break block44;
                                                                                        var22_8 = this.i;
                                                                                        var26_9 = var22_8.b;
                                                                                        if (var26_9 != null && var26_9.b == var22_8) ** GOTO lbl-1000
                                                                                        var26_9 = this.k;
                                                                                        var22_8 = var26_9.b;
                                                                                        if (var22_8 != null && var22_8.b == var26_9) lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            ((n)var21_7).A(this, 0);
                                                                                            var13_10 = true;
                                                                                        } else {
                                                                                            var13_10 = false;
                                                                                        }
                                                                                        var21_7 = this.j;
                                                                                        var22_8 = var21_7.b;
                                                                                        if (var22_8 != null && var22_8.b == var21_7) ** GOTO lbl-1000
                                                                                        var21_7 = this.l;
                                                                                        var22_8 = var21_7.b;
                                                                                        if (var22_8 != null && var22_8.b == var21_7) lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            ((n)this.r).A(this, 1);
                                                                                            var14_11 = true;
                                                                                        } else {
                                                                                            var14_11 = false;
                                                                                        }
                                                                                        var21_7 = this.r;
                                                                                        if (var21_7.ad == 2 && !var13_10) {
                                                                                            var22_8 = this.i;
                                                                                            var26_9 = var22_8.b;
                                                                                            if (var26_9 != null && (var26_9 = var26_9.a) == var21_7) {
                                                                                                if (var26_9 == var21_7) {
                                                                                                    var22_8.i = 2;
                                                                                                }
                                                                                            } else {
                                                                                                var21_7 = var1_1.e(var21_7.i);
                                                                                                var22_8 = var1_1.a();
                                                                                                var22_8.i(var24_2, (k)var21_7, var1_1.f(), 0);
                                                                                                var1_1.g((h)var22_8);
                                                                                            }
                                                                                            var21_7 = this.k;
                                                                                            var26_9 = var21_7.b;
                                                                                            if (var26_9 != null && (var26_9 = var26_9.a) == (var22_8 = this.r)) {
                                                                                                if (var26_9 == var22_8) {
                                                                                                    var21_7.i = 2;
                                                                                                }
                                                                                            } else {
                                                                                                var22_8 = var1_1.e(this.r.k);
                                                                                                var21_7 = var1_1.a();
                                                                                                var21_7.i((k)var22_8, var25_3, var1_1.f(), 0);
                                                                                                var1_1.g((h)var21_7);
                                                                                            }
                                                                                        }
                                                                                        var21_7 = this.r;
                                                                                        if (var21_7.ae == 2 && !var14_11) {
                                                                                            var22_8 = this.j;
                                                                                            var26_9 = var22_8.b;
                                                                                            if (var26_9 != null && (var26_9 = var26_9.a) == var21_7) {
                                                                                                if (var26_9 == var21_7) {
                                                                                                    var22_8.i = 2;
                                                                                                }
                                                                                            } else {
                                                                                                var22_8 = var1_1.e(var21_7.j);
                                                                                                var21_7 = var1_1.a();
                                                                                                var21_7.i(var19_4, (k)var22_8, var1_1.f(), 0);
                                                                                                var1_1.g((h)var21_7);
                                                                                            }
                                                                                            var22_8 = this.l;
                                                                                            var26_9 = var22_8.b;
                                                                                            if (var26_9 != null && (var26_9 = var26_9.a) == (var21_7 = this.r)) {
                                                                                                if (var26_9 == var21_7) {
                                                                                                    var22_8.i = 2;
                                                                                                }
                                                                                            } else {
                                                                                                var21_7 = var1_1.e(this.r.l);
                                                                                                var22_8 = var1_1.a();
                                                                                                var22_8.i((k)var21_7, var20_5, var1_1.f(), 0);
                                                                                                var1_1.g((h)var22_8);
                                                                                            }
                                                                                        }
                                                                                        var17_12 = var13_10;
                                                                                        var16_13 = var14_11;
                                                                                        break block45;
                                                                                    }
                                                                                    var17_12 = false;
                                                                                    var16_13 = false;
                                                                                }
                                                                                var7_14 = this.s;
                                                                                var9_15 = this.D;
                                                                                var5_16 = var7_14 < var9_15 ? var9_15 : var7_14;
                                                                                var8_17 = this.t;
                                                                                var4_19 = var6_18 = this.E;
                                                                                if (var8_17 >= var6_18) {
                                                                                    var4_19 = var8_17;
                                                                                }
                                                                                var14_11 = (var10_20 = this.ad) != 3;
                                                                                var11_21 = this.ae;
                                                                                var15_22 = var11_21 != 3;
                                                                                var13_10 = var14_11;
                                                                                if (var14_11) break block46;
                                                                                var22_8 = this.i;
                                                                                var13_10 = var14_11;
                                                                                if (var22_8 == null) break block46;
                                                                                var21_7 = this.k;
                                                                                var13_10 = var14_11;
                                                                                if (var21_7 == null) break block46;
                                                                                if (var22_8.b == null) break block47;
                                                                                var13_10 = var14_11;
                                                                                if (var21_7.b != null) break block46;
                                                                            }
                                                                            var13_10 = true;
                                                                        }
                                                                        var14_11 = var15_22;
                                                                        if (var15_22) break block48;
                                                                        var21_7 = this.j;
                                                                        var14_11 = var15_22;
                                                                        if (var21_7 == null) break block48;
                                                                        var22_8 = this.l;
                                                                        var14_11 = var15_22;
                                                                        if (var22_8 == null) break block48;
                                                                        var21_7 = var21_7.b;
                                                                        if (var21_7 == null) break block49;
                                                                        var14_11 = var15_22;
                                                                        if (var22_8.b != null) break block48;
                                                                    }
                                                                    if (this.C == 0) break block50;
                                                                    var22_8 = this.m;
                                                                    var14_11 = var15_22;
                                                                    if (var22_8 == null) break block48;
                                                                    if (var21_7 == null) break block50;
                                                                    var14_11 = var15_22;
                                                                    if (var22_8.b != null) break block48;
                                                                }
                                                                var14_11 = true;
                                                            }
                                                            var6_18 = this.v;
                                                            var2_23 = this.u;
                                                            if (!(var2_23 > 0.0f) || (var12_24 = this.K) == 8) break block51;
                                                            if (var10_20 != 3) break block52;
                                                            if (var11_21 != 3) break block53;
                                                            if (!var13_10 || var14_11) break block54;
                                                            var6_18 = 0;
                                                            ** GOTO lbl145
                                                        }
                                                        if (var13_10 || !var14_11) ** GOTO lbl145
                                                        if (var6_18 == -1) {
                                                            var2_23 = 1.0f / var2_23;
                                                            var11_21 = 1;
                                                            var6_18 = 1;
                                                            var8_17 = var10_20;
                                                            var7_14 = var5_16;
                                                            var5_16 = var11_21;
                                                        } else {
                                                            var6_18 = 1;
lbl145:
                                                            // 3 sources

                                                            var11_21 = 1;
                                                            var8_17 = var10_20;
                                                            var7_14 = var5_16;
                                                            var5_16 = var6_18;
                                                            var6_18 = var11_21;
                                                        }
                                                        break block55;
                                                    }
                                                    if (var10_20 == 3) break block53;
                                                    if (var11_21 != 3) break block51;
                                                    var3_25 = var2_23;
                                                    if (var6_18 == -1) {
                                                        var3_25 = 1.0f / var2_23;
                                                    }
                                                    var4_19 = (int)((float)var7_14 * var3_25);
                                                    var7_14 = 1;
                                                    var14_11 = true;
                                                    var2_23 = var3_25;
                                                    break block56;
                                                }
                                                var7_14 = (int)((float)var8_17 * var2_23);
                                                var13_10 = true;
                                                var8_17 = 3;
                                                var5_16 = 0;
                                                var6_18 = 0;
                                                break block55;
                                            }
                                            var7_14 = var6_18;
                                        }
                                        var8_17 = var5_16;
                                        var6_18 = 0;
                                        var5_16 = var7_14;
                                        var7_14 = var8_17;
                                        var8_17 = var10_20;
                                    }
                                    var15_22 = var6_18 != 0 && (var5_16 == 0 || var5_16 == -1);
                                    var18_26 = var8_17 == 2 && this instanceof n != false;
                                    if (this.a == 2) break block57;
                                    if (!var15_22) ** GOTO lbl-1000
                                    var21_7 = this.i;
                                    if (var21_7.b != null && this.k.b != null) {
                                        var26_9 = var1_1.e(var21_7);
                                        var22_8 = var1_1.e(this.k);
                                        var21_7 = var1_1.e(this.i.b);
                                        var27_27 = var1_1.e(this.k.b);
                                        var1_1.i((k)var26_9, (k)var21_7, this.i.a(), 3);
                                        var1_1.j((k)var22_8, var27_27, -this.k.a(), 3);
                                        if (!var17_12) {
                                            var1_1.m((k)var26_9, (k)var21_7, this.i.a(), this.H, var27_27, (k)var22_8, this.k.a());
                                        }
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var21_7 = this.i;
                                        var22_8 = this.k;
                                        var8_17 = this.w;
                                        this.A(var1_1, var18_26, var13_10, (l)var21_7, (l)var22_8, var8_17, var8_17 + var7_14, var7_14, var9_15, this.H, var15_22, var17_12, this.c, this.e, this.f);
                                    }
                                }
                                var21_7 = var20_5;
                                var15_22 = false;
                                var17_12 = false;
                                if (this.b == 2) break block58;
                                var13_10 = this.ae == 2 && this instanceof n != false;
                                var7_14 = var6_18 != 0 && (var5_16 == 1 || var5_16 == -1) ? 1 : 0;
                                var8_17 = this.C;
                                if (var8_17 <= 0) break block59;
                                var22_8 = this.l;
                                var1_1.n((k)var23_6, var19_4, var8_17, 5);
                                var23_6 = this.m;
                                if (var23_6.b != null) {
                                    var8_17 = this.C;
                                    var22_8 = var23_6;
                                } else {
                                    var8_17 = var4_19;
                                }
                                if (var7_14 == 0) break block60;
                                var23_6 = this.j;
                                if (var23_6.b == null || this.l.b == null) break block61;
                                var22_8 = var1_1.e(var23_6);
                                var26_9 = var1_1.e(this.l);
                                var21_7 = var1_1.e(this.j.b);
                                var23_6 = var1_1.e(this.l.b);
                                var1_1.i((k)var22_8, (k)var21_7, this.j.a(), 3);
                                var1_1.j((k)var26_9, (k)var23_6, -this.l.a(), 3);
                                if (!var16_13) {
                                    var1_1.m((k)var22_8, (k)var21_7, this.j.a(), this.I, (k)var23_6, (k)var26_9, this.l.a());
                                }
                                var21_7 = var19_4;
                                break block62;
                            }
                            var15_22 = true;
                            break block63;
                        }
                        var15_22 = var17_12;
                    }
                    var23_6 = this.j;
                    var7_14 = this.x;
                    this.A(var1_1, var13_10, var14_11, (l)var23_6, (l)var22_8, var7_14, var7_14 + var8_17, var8_17, this.E, this.I, var15_22, var16_13, this.d, this.g, this.h);
                    var1_1.n((k)var21_7, var19_4, var4_19, 5);
                    ** GOTO lbl250
                }
                if (var7_14 == 0) ** GOTO lbl254
                var22_8 = this.j;
                if (var22_8.b != null && this.l.b != null) {
                    var27_27 = var1_1.e(var22_8);
                    var22_8 = var1_1.e(this.l);
                    var23_6 = var1_1.e(this.j.b);
                    var26_9 = var1_1.e(this.l.b);
                    var1_1.i(var27_27, (k)var23_6, this.j.a(), 3);
                    var1_1.j((k)var22_8, (k)var26_9, -this.l.a(), 3);
                    if (!var16_13) {
                        var1_1.m(var27_27, (k)var23_6, this.j.a(), this.I, (k)var26_9, (k)var22_8, this.l.a());
                    }
lbl250:
                    // 4 sources

                    var21_7 = var20_5;
                    var21_7 = var19_4;
                } else {
                    var15_22 = true;
lbl254:
                    // 2 sources

                    var22_8 = this.j;
                    var23_6 = this.l;
                    var10_20 = this.x;
                    var7_14 = this.E;
                    var3_25 = this.I;
                    var8_17 = this.d;
                    var9_15 = this.g;
                    var11_21 = this.h;
                    var21_7 = var19_4;
                    this.A(var1_1, var13_10, var14_11, (l)var22_8, (l)var23_6, var10_20, var10_20 + var4_19, var4_19, var7_14, var3_25, var15_22, var16_13, var8_17, var9_15, var11_21);
                }
            }
            if (var6_18 != 0) {
                var21_7 = var1_1.a();
                if (var5_16 == 0) {
                    var21_7.e(var25_3, var24_2, var20_5, var19_4, var2_23);
                    var1_1.g((h)var21_7);
                    return;
                }
                if (var5_16 == 1) {
                    var21_7.e(var20_5, var19_4, var25_3, var24_2, var2_23);
                    var1_1.g((h)var21_7);
                    return;
                }
                var4_19 = this.e;
                if (var4_19 > 0) {
                    var1_1.i(var25_3, var24_2, var4_19, 3);
                }
                if ((var4_19 = this.g) > 0) {
                    var1_1.i(var20_5, var19_4, var4_19, 3);
                }
                var21_7.e(var25_3, var24_2, var20_5, var19_4, var2_23);
                var19_4 = var1_1.d();
                var20_5 = var1_1.d();
                var19_4.c = 4;
                var20_5.c = 4;
                var21_7.c(var19_4, var20_5);
                var1_1.g((h)var21_7);
                return;
            }
        }
    }

    public void y() {
        int n2 = j.p(this.i);
        int n3 = j.p(this.j);
        int n4 = j.p(this.k) - n2;
        int n5 = j.p(this.l) - n3;
        this.w = n2;
        this.x = n3;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        n3 = n4;
        if (this.ad == 1 && n4 >= (n3 = this.s)) {
            n3 = n4;
        }
        n4 = n5;
        if (this.ae == 1 && n5 >= (n4 = this.t)) {
            n4 = n5;
        }
        this.s = n3;
        this.t = n4;
        n5 = this.E;
        if (n4 < n5) {
            this.t = n5;
        }
        if (n3 < (n4 = this.D)) {
            this.s = n4;
        }
    }

    public void z(AmbientDelegate ambientDelegate) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }
}

