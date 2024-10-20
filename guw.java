/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class guw {
    static final gui a = new gum(new fvd());
    static final gup b;
    boolean c = true;
    int d = -1;
    long e = -1L;
    long f = -1L;
    gww g;
    gvw h;
    gvw i;
    long j = -1L;
    long k = -1L;
    gtd l;
    gtd m;
    gwu n;
    gup o;
    final gui p = a;

    static {
        new gux();
        b = new gus();
    }

    public final gur a() {
        gww gww2 = this.g;
        boolean bl2 = false;
        boolean bl3 = false;
        if (gww2 == null) {
            bl2 = bl3;
            if (this.f == -1L) {
                bl2 = true;
            }
            fxf.B(bl2, "maximumWeight requires weigher");
        } else if (this.c) {
            if (this.f != -1L) {
                bl2 = true;
            }
            fxf.B(bl2, "weigher requires maximumWeight");
        } else if (this.f == -1L) {
            gut.a.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
        fxf.B(true, "refreshAfterWrite requires a LoadingCache");
        return new gvr(this);
    }

    final gvw b() {
        return (gvw)((Object)fxf.S((Object)this.h, (Object)gvw.a));
    }

    final gvw c() {
        return (gvw)((Object)fxf.S((Object)this.i, (Object)gvw.a));
    }

    public final void d(int n2) {
        int n3 = this.d;
        boolean bl2 = true;
        boolean bl3 = n3 == -1;
        fxf.C(bl3, "concurrency level was already set to %s", n3);
        bl3 = n2 > 0 ? bl2 : false;
        fxf.q(bl3);
        this.d = n2;
    }

    public final void e(long l2, TimeUnit timeUnit) {
        long l3 = this.j;
        boolean bl2 = true;
        boolean bl3 = l3 == -1L;
        fxf.D(bl3, "expireAfterWrite was already set to %s ns", l3);
        bl3 = l2 >= 0L ? bl2 : false;
        fxf.I(bl3, l2, (Object)timeUnit);
        this.j = timeUnit.toNanos(l2);
    }

    public final void f(long l2) {
        long l3 = this.e;
        boolean bl2 = false;
        boolean bl3 = l3 == -1L;
        fxf.D(bl3, "maximum size was already set to %s", l3);
        l3 = this.f;
        bl3 = l3 == -1L;
        fxf.D(bl3, "maximum weight was already set to %s", l3);
        bl3 = bl2;
        if (this.g == null) {
            bl3 = true;
        }
        fxf.B(bl3, "maximum size can not be combined with weigher");
        fxf.r(true, "maximum size must not be negative");
        this.e = l2;
    }

    public final void g(long l2) {
        long l3 = this.f;
        boolean bl2 = false;
        boolean bl3 = l3 == -1L;
        fxf.D(bl3, "maximum weight was already set to %s", l3);
        l3 = this.e;
        bl3 = bl2;
        if (l3 == -1L) {
            bl3 = true;
        }
        fxf.D(bl3, "maximum size was already set to %s", l3);
        fxf.r(true, "maximum weight must not be negative");
        this.f = l2;
    }

    public final void h(gwu gwu2) {
        boolean bl2 = this.n == null;
        fxf.A(bl2);
        fxf.K(gwu2);
        this.n = gwu2;
    }

    public final void i(gww gww2) {
        gww gww3 = this.g;
        boolean bl2 = true;
        boolean bl3 = gww3 == null;
        fxf.A(bl3);
        if (this.c) {
            long l2 = this.e;
            bl3 = l2 == -1L ? bl2 : false;
            fxf.D(bl3, "weigher can not be combined with maximum size (%s provided)", l2);
        }
        fxf.K(gww2);
        this.g = gww2;
    }

    public final String toString() {
        Object object;
        long l2;
        gtn gtn2 = fxf.R(this);
        int n2 = this.d;
        if (n2 != -1) {
            gtn2.e("concurrencyLevel", n2);
        }
        if ((l2 = this.e) != -1L) {
            gtn2.f("maximumSize", l2);
        }
        if ((l2 = this.f) != -1L) {
            gtn2.f("maximumWeight", l2);
        }
        if ((l2 = this.j) != -1L) {
            object = new StringBuilder();
            ((StringBuilder)object).append(l2);
            ((StringBuilder)object).append("ns");
            gtn2.b("expireAfterWrite", ((StringBuilder)object).toString());
        }
        if ((l2 = this.k) != -1L) {
            object = new StringBuilder();
            ((StringBuilder)object).append(l2);
            ((StringBuilder)object).append("ns");
            gtn2.b("expireAfterAccess", ((StringBuilder)object).toString());
        }
        if ((object = this.h) != null) {
            gtn2.b("keyStrength", fxf.T(((Enum)object).toString()));
        }
        if ((object = this.i) != null) {
            gtn2.b("valueStrength", fxf.T(((Enum)object).toString()));
        }
        if (this.l != null) {
            gtn2.a("keyEquivalence");
        }
        if (this.m != null) {
            gtn2.a("valueEquivalence");
        }
        if (this.n != null) {
            gtn2.a("removalListener");
        }
        return gtn2.toString();
    }
}

