/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.util.List;

public final class ajr {
    public static final anc a = new anc(new Object());
    public final aew b;
    public final anc c;
    public final long d;
    public final long e;
    public final int f;
    public final ail g;
    public final boolean h;
    public final aob i;
    public final List j;
    public final anc k;
    public final boolean l;
    public final int m;
    public final int n;
    public final aeo o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    public final diz u;

    public ajr(aew aew2, anc anc2, long l2, long l3, int n2, ail ail2, boolean bl2, aob aob2, diz diz2, List list, anc anc3, boolean bl3, int n3, int n4, aeo aeo2, long l4, long l5, long l6, long l7) {
        this.b = aew2;
        this.c = anc2;
        this.d = l2;
        this.e = l3;
        this.f = n2;
        this.g = ail2;
        this.h = bl2;
        this.i = aob2;
        this.u = diz2;
        this.j = list;
        this.k = anc3;
        this.l = bl3;
        this.m = n3;
        this.n = n4;
        this.o = aeo2;
        this.q = l4;
        this.r = l5;
        this.s = l6;
        this.t = l7;
        this.p = false;
    }

    public static ajr h(diz diz2) {
        aew aew2 = aew.a;
        anc anc2 = a;
        aob aob2 = aob.a;
        int n2 = gzx.d;
        return new ajr(aew2, anc2, -9223372036854775807L, 0L, 1, null, false, aob2, diz2, hct.a, anc2, false, 1, 0, aeo.a, 0L, 0L, 0L, 0L);
    }

    public final ajr a(anc anc2) {
        boolean bl2 = this.l;
        int n2 = this.m;
        int n3 = this.n;
        aeo aeo2 = this.o;
        long l2 = this.q;
        long l3 = this.r;
        long l4 = this.s;
        long l5 = this.t;
        return new ajr(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, anc2, bl2, n2, n3, aeo2, l2, l3, l4, l5);
    }

    public final ajr b(boolean bl2, int n2, int n3) {
        aeo aeo2 = this.o;
        long l2 = this.q;
        long l3 = this.r;
        long l4 = this.s;
        long l5 = this.t;
        return new ajr(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, bl2, n2, n3, aeo2, l2, l3, l4, l5);
    }

    public final ajr c(ail ail2) {
        boolean bl2 = this.h;
        aob aob2 = this.i;
        diz diz2 = this.u;
        List list = this.j;
        anc anc2 = this.k;
        boolean bl3 = this.l;
        int n2 = this.m;
        int n3 = this.n;
        aeo aeo2 = this.o;
        long l2 = this.q;
        long l3 = this.r;
        long l4 = this.s;
        long l5 = this.t;
        return new ajr(this.b, this.c, this.d, this.e, this.f, ail2, bl2, aob2, diz2, list, anc2, bl3, n2, n3, aeo2, l2, l3, l4, l5);
    }

    public final ajr d(int n2) {
        ail ail2 = this.g;
        boolean bl2 = this.h;
        aob aob2 = this.i;
        diz diz2 = this.u;
        List list = this.j;
        anc anc2 = this.k;
        boolean bl3 = this.l;
        int n3 = this.m;
        int n4 = this.n;
        aeo aeo2 = this.o;
        long l2 = this.q;
        long l3 = this.r;
        long l4 = this.s;
        long l5 = this.t;
        return new ajr(this.b, this.c, this.d, this.e, n2, ail2, bl2, aob2, diz2, list, anc2, bl3, n3, n4, aeo2, l2, l3, l4, l5);
    }

    public final ajr e(aew aew2) {
        return new ajr(aew2, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t);
    }

    public final boolean f() {
        return this.f == 3 && this.l && this.n == 0;
    }

    public final ajr g(anc anc2, long l2, long l3, long l4, long l5, aob aob2, diz diz2, List list) {
        anc anc3 = this.k;
        boolean bl2 = this.l;
        int n2 = this.m;
        int n3 = this.n;
        aeo aeo2 = this.o;
        long l6 = this.q;
        long l7 = SystemClock.elapsedRealtime();
        int n4 = this.f;
        ail ail2 = this.g;
        boolean bl3 = this.h;
        return new ajr(this.b, anc2, l3, l4, n4, ail2, bl3, aob2, diz2, list, anc3, bl2, n2, n3, aeo2, l6, l5, l2, l7);
    }
}

