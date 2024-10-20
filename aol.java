/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 */
import android.content.res.Resources;
import j$.util.Objects;

final class aol
extends aov
implements Comparable {
    private final int e;
    private final boolean f;
    private final String g;
    private final aop h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final int n;
    private final int o;
    private final boolean p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;

    public aol(int n2, aex object, int n3, aop aop2, int n4, boolean bl2, gtq object2) {
        int n5;
        int n6;
        int n7;
        block8: {
            block7: {
                n7 = 0;
                super(0, (aex)object, n3);
                this.h = aop2;
                n3 = true != aop2.o ? 16 : 24;
                this.g = aox.c(this.d.d);
                this.i = vy.l(n4, false);
                n2 = 0;
                while (true) {
                    object = aop2.e;
                    n6 = ((hct)object).c;
                    n5 = Integer.MAX_VALUE;
                    if (n2 >= n6) break;
                    n6 = aox.a(this.d, (String)object.get(n2), false);
                    if (n6 <= 0) {
                        ++n2;
                        continue;
                    }
                    break block7;
                    break;
                }
                n6 = 0;
                n2 = Integer.MAX_VALUE;
            }
            this.k = n2;
            this.j = n6;
            n2 = this.d.f;
            this.l = aox.b(0, 0);
            object = this.d;
            n2 = ((adu)object).f;
            this.m = true;
            n2 = ((adu)object).e;
            this.p = false;
            this.q = ((adu)object).D;
            this.r = ((adu)object).E;
            this.s = ((adu)object).j;
            n2 = ((adu)object).j;
            n2 = ((adu)object).D;
            this.f = object2.a(object);
            object = agf.w(ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(Resources.getSystem().getConfiguration())), ",");
            for (n2 = 0; n2 < ((String[])object).length; ++n2) {
                object[n2] = agf.t(object[n2]);
            }
            for (n2 = 0; n2 < ((String[])object).length; ++n2) {
                n6 = aox.a(this.d, object[n2], false);
                if (n6 <= 0) {
                    continue;
                }
                break block8;
            }
            n6 = 0;
            n2 = Integer.MAX_VALUE;
        }
        this.n = n2;
        this.o = n6;
        n2 = 0;
        while (true) {
            object2 = aop2.f;
            n6 = n5;
            if (n2 >= ((hct)object2).c) break;
            object = this.d.o;
            if (object != null && ((String)object).equals(object2.get(n2))) {
                n6 = n2;
                break;
            }
            ++n2;
        }
        this.t = n6;
        boolean bl3 = vy.i(n4) == 128;
        this.u = bl3;
        bl3 = vy.k(n4) == 64;
        this.v = bl3;
        object = this.h;
        n2 = !vy.l(n4, ((aop)object).q) ? n7 : (!(bl3 = this.f) && !((aop)object).n ? n7 : (vy.l(n4, false) && bl3 && this.d.j != -1 && (((aop)object).r || !bl2) && (n4 & n3) != 0 ? 2 : 1));
        this.e = n2;
    }

    public final int a(aol aol2) {
        gyv gyv2;
        hcp hcp2 = this.f && this.i ? aox.a : new hdf(aox.a);
        boolean bl2 = this.i;
        gyv gyv3 = gyv2 = gyv.b.e(bl2, aol2.i).d(this.k, aol2.k, hde.a).b(this.j, aol2.j).b(this.l, aol2.l).e(this.p, aol2.p).e(this.m, aol2.m).d(this.n, aol2.n, hde.a).b(this.o, aol2.o).e(this.f, aol2.f).d(this.t, aol2.t, hde.a).e(this.u, aol2.u).e(this.v, aol2.v).d(this.q, aol2.q, hcp2).d(this.r, aol2.r, hcp2);
        if (Objects.equals(this.g, aol2.g)) {
            gyv3 = gyv2.d(this.s, aol2.s, hcp2);
        }
        return gyv3.a();
    }

    @Override
    public final int b() {
        return this.e;
    }
}

