/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;

public final class qr {
    public final qh a;
    public boolean b = true;
    public boolean c = true;
    public final qh d;
    public final ArrayList e = new ArrayList();
    final ArrayList f;
    public rg g;
    private final qo h;

    public qr(qh qh2) {
        new ArrayList();
        this.g = null;
        this.h = new qo();
        this.f = new ArrayList();
        this.a = qh2;
        this.d = qh2;
    }

    private final void e(ra qq22, int n2, ArrayList arrayList) {
        for (Object object : qq22.h.j) {
            if (object instanceof qs) {
                this.g((qs)object, n2, qq22.i, arrayList, null);
                continue;
            }
            if (!(object instanceof ra)) continue;
            this.g(((ra)object).h, n2, qq22.i, arrayList, null);
        }
        for (Object object : qq22.i.j) {
            if (object instanceof qs) {
                this.g((qs)object, n2, qq22.h, arrayList, null);
                continue;
            }
            if (!(object instanceof ra)) continue;
            this.g(((ra)object).i, n2, qq22.h, arrayList, null);
        }
        if (n2 == 1) {
            for (qq qq22 : ((qy)qq22).a.j) {
                if (!(qq22 instanceof qs)) continue;
                this.g((qs)qq22, 1, null, arrayList, null);
            }
        }
    }

    private final void f(qg qg2, int n2, int n3, int n4, int n5) {
        qo qo2 = this.h;
        qo2.i = n2;
        qo2.j = n4;
        qo2.a = n3;
        qo2.b = n5;
        this.g.a(qg2, qo2);
        qg2.C(this.h.c);
        qg2.x(this.h.d);
        qo2 = this.h;
        qg2.F = qo2.f;
        qg2.u(qo2.e);
    }

    private final void g(qs object, int n2, qs qs2, ArrayList arrayList, awf object22) {
        qq qq22 = ((qs)object).d;
        if (qq22.l == null) {
            object = this.a;
            if (qq22 != ((qh)object).h && qq22 != ((qh)object).i) {
                object = object22;
                if (object22 == null) {
                    object = new awf((ra)qq22);
                    arrayList.add(object);
                }
                qq22.l = object;
                ((ArrayList)((awf)object).a).add(qq22);
                for (Object object22 : qq22.h.j) {
                    if (!(object22 instanceof qs)) continue;
                    this.g((qs)object22, n2, qs2, arrayList, (awf)object);
                }
                for (Object object3 : qq22.i.j) {
                    if (!(object3 instanceof qs)) continue;
                    this.g((qs)object3, n2, qs2, arrayList, (awf)object);
                }
                if (n2 == 1 && qq22 instanceof qy) {
                    for (Object object22 : ((qy)qq22).a.j) {
                        if (!(object22 instanceof qs)) continue;
                        this.g((qs)object22, 1, qs2, arrayList, (awf)object);
                    }
                }
                object22 = qq22.h.k.iterator();
                while (object22.hasNext()) {
                    this.g((qs)object22.next(), n2, qs2, arrayList, (awf)object);
                }
                object22 = qq22.i.k.iterator();
                while (object22.hasNext()) {
                    this.g((qs)object22.next(), n2, qs2, arrayList, (awf)object);
                }
                if (n2 == 1 && qq22 instanceof qy) {
                    for (qq qq22 : ((qy)qq22).a.k) {
                        this.g((qs)qq22, 1, qs2, arrayList, (awf)object);
                    }
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int a(qh qh2, int n2) {
        int n3 = this.f.size();
        int n4 = 0;
        long l2 = 0L;
        while (n4 < n3) {
            long l3;
            awf awf2 = (awf)this.f.get(n4);
            Object object = awf2.b;
            if (object instanceof qp ? ((qp)object).f != n2 : (n2 == 0 ? !(object instanceof qx) : !(object instanceof qy))) {
                l3 = 0L;
            } else {
                long l4;
                Object object2 = n2 == 0 ? qh2.h.h : qh2.i.h;
                qs qs2 = n2 == 0 ? qh2.h.i : qh2.i.i;
                boolean bl2 = ((ra)object).h.k.contains(object2);
                boolean bl3 = ((ra)awf2.b).i.k.contains(qs2);
                long l5 = ((ra)awf2.b).a();
                if (bl2 && bl3) {
                    l3 = awf2.j(((ra)awf2.b).h, 0L);
                    long l6 = awf2.i(((ra)awf2.b).i, 0L);
                    l4 = l3 - l5;
                    object2 = (ra)awf2.b;
                    int n5 = ((ra)object2).i.e;
                    long l7 = n5;
                    l3 = l4;
                    if (l4 >= (long)(-n5)) {
                        l3 = l4 + l7;
                    }
                    l4 = -l6;
                    long l8 = ((ra)object2).h.e;
                    l4 = l6 = l4 - l5 - l8;
                    if (l6 >= l8) {
                        l4 = l6 - l8;
                    }
                    object2 = ((ra)object2).d;
                    float f2 = n2 == 0 ? ((qg)object2).ae : ((qg)object2).af;
                    float f3 = 1.0f - f2;
                    l3 = f2 > 0.0f ? (long)((float)l4 / f2 + (float)l3 / f3) : 0L;
                    float f4 = l3;
                    l3 = l8 + ((long)(f2 * f4 + 0.5f) + l5 + (long)(f4 * f3 + 0.5f)) - l7;
                } else if (bl2) {
                    object2 = ((ra)awf2.b).h;
                    l3 = Math.max(awf2.j((qs)object2, ((qs)object2).e), (long)((ra)awf2.b).h.e + l5);
                } else if (bl3) {
                    object2 = ((ra)awf2.b).i;
                    l4 = awf2.i((qs)object2, ((qs)object2).e);
                    l3 = -((ra)awf2.b).i.e;
                    l3 = Math.max(-l4, l3 + l5);
                } else {
                    object2 = (ra)awf2.b;
                    l3 = (long)((ra)object2).h.e + ((ra)object2).a() - (long)((ra)awf2.b).i.e;
                }
            }
            l2 = Math.max(l2, l3);
            ++n4;
        }
        return (int)l2;
    }

    public final void b() {
        Object object;
        int n2;
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.h.d();
        this.d.i.d();
        arrayList.add(this.d.h);
        arrayList.add(this.d.i);
        ArrayList arrayList2 = this.d.aI;
        int n3 = arrayList2.size();
        AbstractCollection abstractCollection = null;
        for (n2 = 0; n2 < n3; ++n2) {
            qg qg2 = (qg)arrayList2.get(n2);
            if (qg2 instanceof qj) {
                arrayList.add(new qv(qg2));
                object = abstractCollection;
            } else {
                if (qg2.H()) {
                    if (qg2.f == null) {
                        qg2.f = new qp(qg2, 0);
                    }
                    object = abstractCollection;
                    if (abstractCollection == null) {
                        object = new HashSet<qp>();
                    }
                    ((HashSet)object).add(qg2.f);
                    abstractCollection = object;
                } else {
                    arrayList.add(qg2.h);
                }
                if (qg2.I()) {
                    if (qg2.g == null) {
                        qg2.g = new qp(qg2, 1);
                    }
                    object = abstractCollection;
                    if (abstractCollection == null) {
                        object = new HashSet<qp>();
                    }
                    ((HashSet)object).add(qg2.g);
                    abstractCollection = object;
                } else {
                    arrayList.add(qg2.i);
                }
                object = abstractCollection;
                if (qg2 instanceof qk) {
                    arrayList.add(new qw(qg2));
                    object = abstractCollection;
                }
            }
            abstractCollection = object;
        }
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            ((ra)arrayList.get(n2)).d();
        }
        n3 = arrayList.size();
        for (n2 = 0; n2 < n3; ++n2) {
            abstractCollection = (ra)arrayList.get(n2);
            if (((ra)((Object)abstractCollection)).d == this.d) continue;
            ((ra)((Object)abstractCollection)).b();
        }
        this.f.clear();
        awf.c = 0;
        object = this.a;
        abstractCollection = this.f;
        this.e(((qh)object).h, 0, (ArrayList)abstractCollection);
        object = this.a;
        abstractCollection = this.f;
        this.e(((qh)object).i, 1, (ArrayList)abstractCollection);
        this.b = false;
    }

    public final void c() {
        ArrayList arrayList = this.a.aI;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            qg qg2 = (qg)arrayList.get(i2);
            if (qg2.e) continue;
            Object object = qg2.aq;
            int n3 = object[0];
            int n4 = object[1];
            int n5 = qg2.s;
            int n6 = qg2.t;
            if (n3 != 2) {
                if (n3 == 3) {
                    n5 = n5 == 1 ? 1 : 0;
                    n3 = 3;
                } else {
                    n5 = 0;
                }
            } else {
                n5 = 1;
            }
            if (n4 != 2) {
                if (n4 == 3) {
                    n4 = n6 == 1 ? 1 : 0;
                    n6 = 3;
                } else {
                    n6 = n4;
                    n4 = 0;
                }
            } else {
                int n7 = 1;
                n6 = n4;
                n4 = n7;
            }
            object = qg2.h.e;
            boolean bl2 = ((qt)object).i;
            qt qt2 = qg2.i.e;
            boolean bl3 = qt2.i;
            if (bl2 && bl3) {
                this.f(qg2, 1, ((qt)object).f, 1, qt2.f);
                qg2.e = true;
            } else if (bl2 && n4 != 0) {
                this.f(qg2, 1, ((qt)object).f, 2, qt2.f);
                if (n6 == 3) {
                    qg2.i.e.m = qg2.h();
                } else {
                    ((qs)qg2.i.e).c(qg2.h());
                    qg2.e = true;
                }
            } else if (bl3 && n5 != 0) {
                this.f(qg2, 2, ((qt)object).f, 1, qt2.f);
                if (n3 == 3) {
                    qg2.h.e.m = qg2.j();
                } else {
                    ((qs)qg2.h.e).c(qg2.j());
                    qg2.e = true;
                }
            }
            if (!qg2.e || (object = (Object)qg2.i.b) == null) continue;
            ((qs)object).c(qg2.ab);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(qh qh2) {
        ArrayList arrayList = qh2.aI;
        int n2 = arrayList.size();
        int n3 = 0;
        int n4 = 0;
        while (true) {
            block29: {
                int n5;
                int n6;
                int n7;
                int n8;
                qg qg2;
                block35: {
                    block34: {
                        block44: {
                            block45: {
                                int n9;
                                int n10;
                                float f2;
                                float f3;
                                block40: {
                                    block43: {
                                        block42: {
                                            block41: {
                                                block36: {
                                                    block39: {
                                                        block38: {
                                                            block37: {
                                                                block33: {
                                                                    int n11;
                                                                    block32: {
                                                                        block30: {
                                                                            block31: {
                                                                                block28: {
                                                                                    if (n4 >= n2) {
                                                                                        return;
                                                                                    }
                                                                                    qg2 = (qg)arrayList.get(n4);
                                                                                    int[] nArray = qg2.aq;
                                                                                    n8 = nArray[n3];
                                                                                    n7 = nArray[1];
                                                                                    if (qg2.ah != 8) break block28;
                                                                                    qg2.e = true;
                                                                                    break block29;
                                                                                }
                                                                                f3 = qg2.x;
                                                                                n11 = 2;
                                                                                n6 = n8;
                                                                                if (f3 < 1.0f) {
                                                                                    n6 = n8;
                                                                                    if (n8 == 3) {
                                                                                        qg2.s = 2;
                                                                                        n6 = 3;
                                                                                    }
                                                                                }
                                                                                f2 = qg2.A;
                                                                                n8 = n7;
                                                                                if (f2 < 1.0f) {
                                                                                    n8 = n7;
                                                                                    if (n7 == 3) {
                                                                                        qg2.t = 2;
                                                                                        n8 = 3;
                                                                                    }
                                                                                }
                                                                                if (qg2.X > 0.0f) {
                                                                                    if (n6 == 3 && (n8 == 2 || n8 == 1)) {
                                                                                        qg2.s = 3;
                                                                                    } else if (n8 == 3 && (n6 == 2 || n6 == 1)) {
                                                                                        qg2.t = 3;
                                                                                    } else if (n6 == 3 && n8 == 3) {
                                                                                        if (qg2.s == 0) {
                                                                                            qg2.s = 3;
                                                                                        }
                                                                                        if (qg2.t == 0) {
                                                                                            qg2.t = 3;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                n7 = n6;
                                                                                if (n6 != 3) break block30;
                                                                                n7 = n6;
                                                                                if (qg2.s != 1) break block30;
                                                                                if (qg2.J.e == null) break block31;
                                                                                n7 = n6;
                                                                                if (qg2.L.e != null) break block30;
                                                                            }
                                                                            n7 = 2;
                                                                        }
                                                                        if (n8 == 3 && qg2.t == 1 && (qg2.K.e == null || qg2.M.e == null)) {
                                                                            n8 = 2;
                                                                        }
                                                                        qx qx2 = qg2.h;
                                                                        qx2.j = n7;
                                                                        qx2.c = n10 = qg2.s;
                                                                        qy qy2 = qg2.i;
                                                                        qy2.j = n8;
                                                                        qy2.c = n9 = qg2.t;
                                                                        n6 = n7;
                                                                        if (n7 == 4) break block32;
                                                                        n6 = n7;
                                                                        if (n7 == 1) break block32;
                                                                        n5 = n7;
                                                                        if (n7 != 2) break block33;
                                                                        n6 = 2;
                                                                    }
                                                                    if (n8 == 4 || n8 == 1) break block34;
                                                                    n5 = n6;
                                                                    if (n8 != 2) break block33;
                                                                    n7 = n11;
                                                                    break block35;
                                                                }
                                                                if (n5 != 3 || n8 != 2 && n8 != 1) break block36;
                                                                if (n10 != 3) break block37;
                                                                if (n8 == 2) {
                                                                    this.f(qg2, 2, 0, 2, 0);
                                                                }
                                                                n6 = qg2.h();
                                                                this.f(qg2, 1, (int)((float)n6 * qg2.X + 0.5f), 1, n6);
                                                                ((qs)qg2.h.e).c(qg2.j());
                                                                ((qs)qg2.i.e).c(qg2.h());
                                                                qg2.e = true;
                                                                break block29;
                                                            }
                                                            if (n10 != 1) break block38;
                                                            this.f(qg2, 2, 0, n8, 0);
                                                            qg2.h.e.m = qg2.j();
                                                            break block29;
                                                        }
                                                        if (n10 != 2) break block39;
                                                        n6 = qh2.aq[n3];
                                                        if (n6 != 1 && n6 != 4) break block36;
                                                        f2 = qh2.j();
                                                        n6 = qg2.h();
                                                        this.f(qg2, 1, (int)(f3 * f2 + 0.5f), n8, n6);
                                                        ((qs)qg2.h.e).c(qg2.j());
                                                        ((qs)qg2.i.e).c(qg2.h());
                                                        qg2.e = true;
                                                        break block29;
                                                    }
                                                    qf[] qfArray = qg2.R;
                                                    if (qfArray[n3].e != null && qfArray[1].e != null) break block36;
                                                    this.f(qg2, 2, 0, n8, 0);
                                                    ((qs)qg2.h.e).c(qg2.j());
                                                    ((qs)qg2.i.e).c(qg2.h());
                                                    qg2.e = true;
                                                    break block29;
                                                }
                                                if (n8 != 3 || n5 != 2 && n5 != 1) break block40;
                                                if (n9 != 3) break block41;
                                                if (n5 == 2) {
                                                    this.f(qg2, 2, 0, 2, 0);
                                                }
                                                n6 = qg2.j();
                                                f3 = f2 = qg2.X;
                                                if (qg2.Y == -1) {
                                                    f3 = 1.0f / f2;
                                                }
                                                this.f(qg2, 1, n6, 1, (int)((float)n6 * f3 + 0.5f));
                                                ((qs)qg2.h.e).c(qg2.j());
                                                ((qs)qg2.i.e).c(qg2.h());
                                                qg2.e = true;
                                                break block29;
                                            }
                                            if (n9 != 1) break block42;
                                            this.f(qg2, n5, 0, 2, 0);
                                            qg2.i.e.m = qg2.h();
                                            break block29;
                                        }
                                        if (n9 != 2) break block43;
                                        n6 = qh2.aq[1];
                                        if (n6 != 1 && n6 != 4) break block40;
                                        this.f(qg2, n5, qg2.j(), 1, (int)(f2 * (float)qh2.h() + 0.5f));
                                        ((qs)qg2.h.e).c(qg2.j());
                                        ((qs)qg2.i.e).c(qg2.h());
                                        qg2.e = true;
                                        break block29;
                                    }
                                    qf[] qfArray = qg2.R;
                                    if (qfArray[2].e != null && qfArray[3].e != null) break block40;
                                    this.f(qg2, 2, 0, 3, 0);
                                    ((qs)qg2.h.e).c(qg2.j());
                                    ((qs)qg2.i.e).c(qg2.h());
                                    qg2.e = true;
                                    break block44;
                                }
                                if (n5 != 3 || n8 != 3) break block44;
                                if (n10 == 1 || n9 == 1) break block45;
                                if (n9 != 2 || n10 != 2) break block44;
                                int[] nArray = qh2.aq;
                                n3 = n6 = 0;
                                if (nArray[0] == 1) {
                                    n3 = n6;
                                    if (nArray[1] == 1) {
                                        float f4 = qh2.j();
                                        n3 = (int)(f2 * (float)qh2.h() + 0.5f);
                                        this.f(qg2, 1, (int)(f3 * f4 + 0.5f), 1, n3);
                                        ((qs)qg2.h.e).c(qg2.j());
                                        ((qs)qg2.i.e).c(qg2.h());
                                        qg2.e = true;
                                        n3 = n6;
                                    }
                                }
                                break block29;
                            }
                            n3 = 0;
                            this.f(qg2, 2, 0, 2, 0);
                            qg2.h.e.m = qg2.j();
                            qg2.i.e.m = qg2.h();
                            break block29;
                        }
                        n3 = 0;
                        break block29;
                    }
                    n7 = n8;
                }
                n8 = qg2.j();
                if (n6 == 4) {
                    n8 = qh2.j() - qg2.J.f - qg2.L.f;
                    n6 = 1;
                }
                n5 = qg2.h();
                if (n7 == 4) {
                    n5 = qh2.h() - qg2.K.f - qg2.M.f;
                    n7 = 1;
                }
                this.f(qg2, n6, n8, n7, n5);
                ((qs)qg2.h.e).c(qg2.j());
                ((qs)qg2.i.e).c(qg2.h());
                qg2.e = true;
            }
            ++n4;
        }
    }
}

