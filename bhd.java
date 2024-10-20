/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.work.OverwritingInputMerger;

public final class bhd {
    public static final String a = bbi.b("WorkSpec");
    public final String b;
    public bbv c;
    public String d;
    public String e;
    public bas f;
    public bas g;
    public long h;
    public long i;
    public long j;
    public baq k;
    public int l;
    public bak m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public bbr s;
    public int t;
    public final int u;
    public long v;
    public int w;
    public final int x;
    public String y;

    public bhd(String string, bbv bbv2, String string2, String string3, bas bas2, bas bas3, long l2, long l3, long l4, baq baq2, int n2, bak bak2, long l5, long l6, long l7, long l8, boolean bl2, bbr bbr2, int n3, int n4, long l9, int n5, int n6, String string4) {
        jse.e(string, "id");
        jse.e((Object)bbv2, "state");
        jse.e(string2, "workerClassName");
        jse.e(string3, "inputMergerClassName");
        jse.e(bas2, "input");
        jse.e(bas3, "output");
        jse.e(baq2, "constraints");
        jse.e((Object)bak2, "backoffPolicy");
        jse.e((Object)bbr2, "outOfQuotaPolicy");
        this.b = string;
        this.c = bbv2;
        this.d = string2;
        this.e = string3;
        this.f = bas2;
        this.g = bas3;
        this.h = l2;
        this.i = l3;
        this.j = l4;
        this.k = baq2;
        this.l = n2;
        this.m = bak2;
        this.n = l5;
        this.o = l6;
        this.p = l7;
        this.q = l8;
        this.r = bl2;
        this.s = bbr2;
        this.t = n3;
        this.u = n4;
        this.v = l9;
        this.w = n5;
        this.x = n6;
        this.y = string4;
    }

    public /* synthetic */ bhd(String string, bbv bbv2, String string2, String string3, bas bas2, bas bas3, long l2, long l3, long l4, baq baq2, int n2, bak bak2, long l5, long l6, long l7, long l8, boolean bl2, bbr bbr2, int n3, long l9, int n4, int n5, String string4, int n6) {
        if ((n6 & 2) != 0) {
            bbv2 = bbv.a;
        }
        if ((n6 & 8) != 0) {
            string3 = OverwritingInputMerger.class.getName();
            jse.d(string3, "OverwritingInputMerger::class.java.name");
        }
        if ((n6 & 0x10) != 0) {
            bas2 = bas.a;
        }
        if ((n6 & 0x20) != 0) {
            bas3 = bas.a;
        }
        if ((n6 & 0x40) != 0) {
            l2 = 0L;
        }
        if ((n6 & 0x80) != 0) {
            l3 = 0L;
        }
        if ((n6 & 0x100) != 0) {
            l4 = 0L;
        }
        if ((n6 & 0x200) != 0) {
            baq2 = baq.a;
        }
        if ((n6 & 0x400) != 0) {
            n2 = 0;
        }
        if ((n6 & 0x800) != 0) {
            bak2 = bak.a;
        }
        if ((n6 & 0x1000) != 0) {
            l5 = 30000L;
        }
        if ((n6 & 0x2000) != 0) {
            l6 = -1L;
        }
        if ((n6 & 0x4000) != 0) {
            l7 = 0L;
        }
        if ((0x8000 & n6) != 0) {
            l8 = -1L;
        }
        boolean bl3 = (0x10000 & n6) == 0;
        if ((0x20000 & n6) != 0) {
            bbr2 = bbr.a;
        }
        if ((0x40000 & n6) != 0) {
            n3 = 0;
        }
        if ((0x100000 & n6) != 0) {
            l9 = Long.MAX_VALUE;
        }
        if ((0x200000 & n6) != 0) {
            n4 = 0;
        }
        if ((0x400000 & n6) != 0) {
            n5 = -256;
        }
        if ((n6 & 0x800000) != 0) {
            string4 = null;
        }
        this(string, bbv2, string2, string3, bas2, bas3, l2, l3, l4, baq2, n2, bak2, l5, l6, l7, l8, bl3 & bl2, bbr2, n3, 0, l9, n4, n5, string4);
    }

    public static /* synthetic */ bhd e(bhd object, String string, bbv bbv2, String string2, bas bas2, int n2, long l2, int n3, int n4, long l3, int n5, int n6) {
        if ((n6 & 1) != 0) {
            string = ((bhd)object).b;
        }
        if ((n6 & 2) != 0) {
            bbv2 = ((bhd)object).c;
        }
        if ((n6 & 4) != 0) {
            string2 = ((bhd)object).d;
        }
        String string3 = (n6 & 8) != 0 ? ((bhd)object).e : null;
        if ((n6 & 0x10) != 0) {
            bas2 = ((bhd)object).f;
        }
        bas bas3 = (n6 & 0x20) != 0 ? ((bhd)object).g : null;
        long l4 = (n6 & 0x40) != 0 ? ((bhd)object).h : 0L;
        long l5 = (n6 & 0x80) != 0 ? ((bhd)object).i : 0L;
        long l6 = (n6 & 0x100) != 0 ? ((bhd)object).j : 0L;
        baq baq2 = (n6 & 0x200) != 0 ? ((bhd)object).k : null;
        if ((n6 & 0x400) != 0) {
            n2 = ((bhd)object).l;
        }
        bak bak2 = (n6 & 0x800) != 0 ? ((bhd)object).m : null;
        long l7 = (n6 & 0x1000) != 0 ? ((bhd)object).n : 0L;
        if ((n6 & 0x2000) != 0) {
            l2 = ((bhd)object).o;
        }
        long l8 = (n6 & 0x4000) != 0 ? ((bhd)object).p : 0L;
        long l9 = (0x8000 & n6) != 0 ? ((bhd)object).q : 0L;
        boolean bl2 = (0x10000 & n6) != 0 ? ((bhd)object).r : false;
        bbr bbr2 = (0x20000 & n6) != 0 ? ((bhd)object).s : null;
        if ((0x40000 & n6) != 0) {
            n3 = ((bhd)object).t;
        }
        if ((0x80000 & n6) != 0) {
            n4 = ((bhd)object).u;
        }
        if ((0x100000 & n6) != 0) {
            l3 = ((bhd)object).v;
        }
        if ((n6 & 0x200000) != 0) {
            n5 = ((bhd)object).w;
        }
        n6 = ((bhd)object).x;
        object = ((bhd)object).y;
        jse.e(string, "id");
        jse.e((Object)bbv2, "state");
        jse.e(string2, "workerClassName");
        jse.e(string3, "inputMergerClassName");
        jse.e(bas2, "input");
        jse.e(bas3, "output");
        jse.e(baq2, "constraints");
        jse.e((Object)bak2, "backoffPolicy");
        jse.e((Object)bbr2, "outOfQuotaPolicy");
        return new bhd(string, bbv2, string2, string3, bas2, bas3, l4, l5, l6, baq2, n2, bak2, l7, l2, l8, l9, bl2, bbr2, n3, n4, l3, n5, n6, (String)object);
    }

    public final long a() {
        return AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.c(this.c(), this.l, this.m, this.n, this.o, this.t, this.d(), this.h, this.j, this.i, this.v);
    }

    public final boolean b() {
        return !jse.i(baq.a, this.k);
    }

    public final boolean c() {
        return this.c == bbv.a && this.l > 0;
    }

    public final boolean d() {
        return this.i != 0L;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bhd)) {
            return false;
        }
        object = (bhd)object;
        if (!jse.i(this.b, ((bhd)object).b)) {
            return false;
        }
        if (this.c != ((bhd)object).c) {
            return false;
        }
        if (!jse.i(this.d, ((bhd)object).d)) {
            return false;
        }
        if (!jse.i(this.e, ((bhd)object).e)) {
            return false;
        }
        if (!jse.i(this.f, ((bhd)object).f)) {
            return false;
        }
        if (!jse.i(this.g, ((bhd)object).g)) {
            return false;
        }
        if (this.h != ((bhd)object).h) {
            return false;
        }
        if (this.i != ((bhd)object).i) {
            return false;
        }
        if (this.j != ((bhd)object).j) {
            return false;
        }
        if (!jse.i(this.k, ((bhd)object).k)) {
            return false;
        }
        if (this.l != ((bhd)object).l) {
            return false;
        }
        if (this.m != ((bhd)object).m) {
            return false;
        }
        if (this.n != ((bhd)object).n) {
            return false;
        }
        if (this.o != ((bhd)object).o) {
            return false;
        }
        if (this.p != ((bhd)object).p) {
            return false;
        }
        if (this.q != ((bhd)object).q) {
            return false;
        }
        if (this.r != ((bhd)object).r) {
            return false;
        }
        if (this.s != ((bhd)object).s) {
            return false;
        }
        if (this.t != ((bhd)object).t) {
            return false;
        }
        if (this.u != ((bhd)object).u) {
            return false;
        }
        if (this.v != ((bhd)object).v) {
            return false;
        }
        if (this.w != ((bhd)object).w) {
            return false;
        }
        if (this.x != ((bhd)object).x) {
            return false;
        }
        return jse.i(this.y, ((bhd)object).y);
    }

    public final int hashCode() {
        int n2 = this.b.hashCode();
        int n3 = this.c.hashCode();
        int n4 = this.d.hashCode();
        int n5 = this.e.hashCode();
        int n6 = this.f.hashCode();
        int n7 = this.g.hashCode();
        int n8 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.d(this.h);
        int n9 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.d(this.i);
        int n10 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.d(this.j);
        int n11 = this.k.hashCode();
        int n12 = this.l;
        int n13 = this.m.hashCode();
        int n14 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.d(this.n);
        int n15 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.d(this.o);
        int n16 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.d(this.p);
        int n17 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.d(this.q);
        int n18 = a.f(this.r);
        int n19 = this.s.hashCode();
        int n20 = this.t;
        int n21 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.d(this.v);
        int n22 = this.u;
        int n23 = this.w;
        String string = this.y;
        int n24 = string == null ? 0 : string.hashCode();
        return ((((((((((((((((((((((n2 * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n7) * 31 + n8) * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n20) * 31 + n22) * 31 + n21) * 31 + n23) * 31 + this.x) * 31 + n24;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{WorkSpec: ");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

