/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

public final class j {
    private static int h = 1000;
    int a = 0;
    public final i b = new i();
    public h[] c = null;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    public final AmbientDelegate g;
    private int i = 32;
    private int j = 32;
    private int k = 32;
    private k[] l = new k[h];
    private int m = 0;
    private h[] n = new h[32];

    public j() {
        this.c = new h[32];
        this.r();
        this.g = new AmbientDelegate(null, null);
    }

    public static h b(j object, k k2, k k3, int n2, float f2, k k4, k k5, int n3, boolean bl2) {
        h h2 = ((j)object).a();
        h2.d(k2, k3, n2, f2, k4, k5, n3);
        if (bl2) {
            k2 = ((j)object).d();
            object = ((j)object).d();
            k2.c = 4;
            ((k)object).c = 4;
            h2.c(k2, (k)object);
        }
        return h2;
    }

    public static h c(j j2, k k2, k k3, int n2, boolean bl2) {
        h h2 = j2.a();
        h2.h(k2, k3, n2);
        if (bl2) {
            j2.k(h2, 1);
        }
        return h2;
    }

    public static final int p(Object object) {
        object = ((l)object).f;
        if (object != null) {
            return (int)(((k)object).d + 0.5f);
        }
        return 0;
    }

    private final void q() {
        int n2 = this.i;
        n2 += n2;
        this.i = n2;
        this.c = Arrays.copyOf(this.c, n2);
        k[] kArray = this.g.a;
        n2 = this.i;
        this.g.a = kArray = (k[])Arrays.copyOf((Object[])kArray, n2);
        n2 = this.i;
        this.d = new boolean[n2];
        this.j = n2;
        this.k = n2;
        this.b.a.clear();
    }

    private final void r() {
        Object object;
        for (int i2 = 0; i2 < ((h[])(object = this.c)).length; ++i2) {
            if ((object = object[i2]) != null) {
                ((khv)this.g.c).n(object);
            }
            this.c[i2] = null;
        }
    }

    private final k s(int n2) {
        k k2 = (k)((khv)this.g.b).m();
        if (k2 == null) {
            k2 = new k(n2);
        } else {
            k2.b();
            k2.h = n2;
        }
        int n3 = this.m;
        n2 = h;
        if (n3 >= n2) {
            n2 += n2;
            h = n2;
            this.l = Arrays.copyOf(this.l, n2);
        }
        k[] kArray = this.l;
        n2 = this.m;
        this.m = n2 + 1;
        kArray[n2] = k2;
        return k2;
    }

    public final h a() {
        h h2 = (h)((khv)this.g.c).m();
        if (h2 == null) {
            h2 = new h(this.g);
        } else {
            h2.a = null;
            g g2 = h2.d;
            g2.e = -1;
            g2.f = -1;
            g2.g = false;
            g2.a = 0;
            h2.b = 0.0f;
            h2.e = false;
        }
        return h2;
    }

    public final k d() {
        int n2;
        if (this.e + 1 >= this.j) {
            this.q();
        }
        k k2 = this.s(4);
        this.a = n2 = this.a + 1;
        ++this.e;
        k2.a = n2;
        ((k[])this.g.a)[n2] = k2;
        return k2;
    }

    public final k e(Object object) {
        block8: {
            int n2;
            block7: {
                if (object == null) {
                    return null;
                }
                if (this.e + 1 >= this.j) {
                    this.q();
                }
                l l2 = (l)object;
                k k2 = l2.f;
                object = k2;
                if (k2 == null) {
                    l2.e();
                    object = l2.f;
                }
                if ((n2 = ((k)object).a) == -1) break block7;
                if (n2 <= this.a && ((k[])this.g.a)[n2] != null) break block8;
                if (n2 != -1) {
                    ((k)object).b();
                }
            }
            this.a = n2 = this.a + 1;
            ++this.e;
            ((k)object).a = n2;
            ((k)object).h = 1;
            ((k[])this.g.a)[n2] = object;
        }
        return object;
    }

    public final k f() {
        int n2;
        if (this.e + 1 >= this.j) {
            this.q();
        }
        k k2 = this.s(3);
        this.a = n2 = this.a + 1;
        ++this.e;
        k2.a = n2;
        ((k[])this.g.a)[n2] = k2;
        return k2;
    }

    public final void g(h h2) {
        block45: {
            int n2;
            int n3;
            int n4;
            Object object;
            Object object2;
            block38: {
                block37: {
                    Object object3;
                    Object object4;
                    float f2;
                    Object object5;
                    if (this.f + 1 >= this.k || this.e + 1 >= this.j) {
                        this.q();
                    }
                    boolean bl2 = h2.e;
                    int n5 = 0;
                    if (bl2) break block38;
                    if (this.f > 0) {
                        object2 = h2.d;
                        object = this.c;
                        n4 = ((g)object2).e;
                        while (true) {
                            for (n3 = 0; n4 != -1 && n3 < ((g)object2).a; ++n3) {
                                object5 = ((g)object2).h.a;
                                n2 = ((g)object2).b[n4];
                                object5 = ((k[])object5)[n2];
                                if (((k)object5).b != -1) {
                                    f2 = ((g)object2).d[n4];
                                    ((g)object2).c((k)object5);
                                    object4 = object[((k)object5).b];
                                    if (!((h)object4).e) {
                                        object3 = ((h)object4).d;
                                        n3 = object3.e;
                                        for (n4 = 0; n3 != -1 && n4 < object3.a; ++n4) {
                                            object5 = ((g)object2).h.a;
                                            n2 = object3.b[n3];
                                            ((g)object2).e(((k[])object5)[n2], object3.d[n3] * f2);
                                            n3 = object3.c[n3];
                                        }
                                    }
                                    h2.b += ((h)object4).b * f2;
                                    ((h)object4).a.a(h2);
                                    n4 = ((g)object2).e;
                                    continue;
                                }
                                n4 = ((g)object2).c[n4];
                            }
                            break;
                        }
                        if (h2.d.a == 0) {
                            h2.e = true;
                        }
                    }
                    if ((f2 = h2.b) < 0.0f) {
                        h2.b = -f2;
                        object2 = h2.d;
                        n3 = ((g)object2).e;
                        for (n4 = 0; n3 != -1 && n4 < ((g)object2).a; ++n4) {
                            object = ((g)object2).d;
                            object[n3] = -object[n3];
                            n3 = ((g)object2).c[n3];
                        }
                    }
                    g g2 = h2.d;
                    n3 = g2.e;
                    object2 = null;
                    object = null;
                    for (n4 = 0; n3 != -1 && n4 < g2.a; ++n4) {
                        block42: {
                            block44: {
                                block43: {
                                    block40: {
                                        block41: {
                                            Object object6;
                                            block39: {
                                                object5 = g2.d;
                                                object6 = object5[n3];
                                                if (!(object6 < 0.0f)) break block39;
                                                f2 = (float)object6;
                                                if (!(object6 > -0.001f)) break block40;
                                                object5[n3] = 0.0f;
                                                break block41;
                                            }
                                            f2 = (float)object6;
                                            if (!(object6 < 0.001f)) break block40;
                                            object5[n3] = 0.0f;
                                        }
                                        f2 = 0.0f;
                                    }
                                    object4 = object2;
                                    object3 = object;
                                    if (f2 == 0.0f) break block42;
                                    object5 = g2.h.a;
                                    n2 = g2.b[n3];
                                    object5 = ((k[])object5)[n2];
                                    if (((k)object5).h != 1) break block43;
                                    if (f2 < 0.0f) {
                                        object2 = object5;
                                        break block37;
                                    }
                                    object4 = object2;
                                    object3 = object;
                                    if (object == null) {
                                        object4 = object2;
                                        object3 = object5;
                                    }
                                    break block42;
                                }
                                object4 = object2;
                                object3 = object;
                                if (!(f2 < 0.0f)) break block42;
                                if (object2 == null) break block44;
                                object4 = object2;
                                object3 = object;
                                if (((k)object5).c >= ((k)object2).c) break block42;
                            }
                            object3 = object;
                            object4 = object5;
                        }
                        n3 = g2.c[n3];
                        object2 = object4;
                        object = object3;
                    }
                    if (object != null) {
                        object2 = object;
                    }
                }
                if (object2 != null) {
                    h2.a((k)object2);
                }
                if (h2.d.a == 0) {
                    h2.e = true;
                }
                if ((object = h2.a) == null || object.h != 1 && h2.b < 0.0f) break block45;
            }
            if ((object = this.c[this.f]) != null) {
                ((khv)this.g.c).n(object);
            }
            if (!h2.e) {
                h2.b();
            }
            object = this.c;
            n4 = this.f;
            object[n4] = h2;
            object = h2.a;
            object.b = n4;
            this.f = n4 + 1;
            n2 = object.g;
            if (n2 > 0) {
                while ((n4 = ((h[])(object = this.n)).length) < n2) {
                    this.n = new h[n4 + n4];
                }
                n4 = 0;
                while (true) {
                    if (n4 >= n2) break;
                    object[n4] = h2.a.f[n4];
                    ++n4;
                }
                for (n3 = n5; n3 < n2; ++n3) {
                    object2 = object[n3];
                    if (object2 == h2) continue;
                    ((h)object2).d.g((h)object2, h2);
                    ((h)object2).b();
                }
            }
        }
    }

    public final void h(k k2, int n2) {
        int n3 = k2.b;
        if (n3 != -1) {
            h h2 = this.c[n3];
            if (h2.e) {
                h2.b = n2;
                return;
            }
            h2 = this.a();
            h2.g(k2, n2);
            this.g(h2);
            return;
        }
        float f2 = n2;
        h h3 = this.a();
        h3.a = k2;
        k2.d = f2;
        h3.b = f2;
        h3.e = true;
        this.g(h3);
    }

    public final void i(k k2, k k3, int n2, int n3) {
        h h2 = this.a();
        k k4 = this.f();
        k4.c = n3;
        h2.i(k2, k3, k4, n2);
        this.g(h2);
    }

    public final void j(k k2, k k3, int n2, int n3) {
        h h2 = this.a();
        k k4 = this.f();
        k4.c = n3;
        h2.j(k2, k3, k4, n2);
        this.g(h2);
    }

    public final void k(h h2, int n2) {
        k k2 = this.d();
        float f2 = n2;
        h2.d.f(k2, f2);
    }

    public final void l() {
        Object object;
        k[] kArray;
        int n2 = 0;
        while (true) {
            kArray = this.g;
            object = (k[])kArray.a;
            if (n2 >= ((k[])object).length) break;
            if ((object = object[n2]) != null) {
                ((k)object).b();
            }
            ++n2;
        }
        Object object2 = kArray.b;
        kArray = this.l;
        int n3 = this.m;
        int n4 = kArray.length;
        n2 = n3;
        if (n3 > n4) {
            n2 = n4;
        }
        for (n4 = 0; n4 < n2; ++n4) {
            object = kArray[n4];
            khv khv2 = (khv)object2;
            n3 = khv2.a;
            if (n3 >= 256) continue;
            ((Object[])khv2.b)[n3] = object;
            khv2.a = n3 + 1;
        }
        this.m = 0;
        Arrays.fill((Object[])this.g.a, null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (n2 = 0; n2 < this.f; ++n2) {
            this.c[n2].c = false;
        }
        this.r();
        this.f = 0;
    }

    public final void m(k k2, k k3, int n2, float f2, k k4, k k5, int n3) {
        h h2 = this.a();
        h2.d(k2, k3, n2, f2, k4, k5, n3);
        k3 = this.d();
        k2 = this.d();
        k3.c = 4;
        k2.c = 4;
        h2.c(k3, k2);
        this.g(h2);
    }

    public final void n(k k2, k k3, int n2, int n3) {
        h h2 = this.a();
        h2.h(k2, k3, n2);
        k3 = this.d();
        k2 = this.d();
        k3.c = n3;
        k2.c = n3;
        h2.c(k3, k2);
        this.g(h2);
    }

    public final void o(i object) {
        int n2;
        block0: for (n2 = 0; n2 < this.f; ++n2) {
            Object object2 = this.c[n2];
            if (((h)object2).a.h == 1 || !(((h)object2).b < 0.0f)) continue;
            while (true) {
                float f2 = Float.MAX_VALUE;
                int n3 = -1;
                n2 = -1;
                int n4 = 0;
                for (int i2 = 0; i2 < this.f; ++i2) {
                    int n5;
                    float f3;
                    int n6;
                    int n7;
                    block10: {
                        h h2;
                        block9: {
                            h2 = this.c[i2];
                            if (h2.a.h != 1) break block9;
                            n7 = n3;
                            n6 = n2;
                            f3 = f2;
                            n5 = n4;
                            break block10;
                        }
                        n7 = n3;
                        n6 = n2;
                        f3 = f2;
                        n5 = n4;
                        if (!(h2.b < 0.0f)) break block10;
                        int n8 = 1;
                        while (true) {
                            int n9;
                            block12: {
                                float f4;
                                block11: {
                                    n7 = n3;
                                    n6 = n2;
                                    f3 = f2;
                                    n5 = n4;
                                    if (n8 >= this.e) break;
                                    object2 = ((k[])this.g.a)[n8];
                                    f4 = h2.d.a((k)object2);
                                    if (!(f4 <= 0.0f)) break block11;
                                    n7 = n3;
                                    n5 = n2;
                                    f3 = f2;
                                    n9 = n4;
                                    break block12;
                                }
                                n6 = 0;
                                while (true) {
                                    block14: {
                                        block13: {
                                            n7 = n3;
                                            n5 = n2;
                                            f3 = f2;
                                            n9 = n4;
                                            if (n6 >= 6) break;
                                            f3 = ((k)object2).e[n6] / f4;
                                            if (f3 < f2 && n6 == n4) break block13;
                                            n7 = n4;
                                            if (n6 <= n4) break block14;
                                        }
                                        f2 = f3;
                                        n3 = i2;
                                        n2 = n8;
                                        n7 = n6;
                                    }
                                    ++n6;
                                    n4 = n7;
                                }
                            }
                            ++n8;
                            n3 = n7;
                            n2 = n5;
                            f2 = f3;
                            n4 = n9;
                        }
                    }
                    n3 = n7;
                    n2 = n6;
                    f2 = f3;
                    n4 = n5;
                }
                if (n3 == -1) break block0;
                object2 = this.c[n3];
                ((h)object2).a.b = -1;
                ((h)object2).a(((k[])this.g.a)[n2]);
                ((h)object2).a.b = n3;
                for (n2 = 0; n2 < this.f; ++n2) {
                    this.c[n2].k((h)object2);
                }
                ((i)object).a(this);
            }
        }
        for (n2 = 0; n2 < this.f; ++n2) {
            object = this.c[n2];
            if (((h)object).a.h != 1 && ((h)object).b < 0.0f) break;
        }
    }
}

