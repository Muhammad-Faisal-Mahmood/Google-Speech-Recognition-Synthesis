/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class hru
implements hsy {
    public static final hfn a = hfn.o("xRPC");
    static final iws b;
    static final byte[] c;
    public static final itv d;
    private static final iws l;
    public final hrv e;
    public iwx f;
    public iwx g;
    public htp h;
    public hqu i;
    public long j = -1L;
    public List k;
    private final Executor m;
    private hpo n;

    static {
        l = idi.G(hqq.e);
        b = idi.G(hqr.b);
        c = hqr.a.g();
        d = new itv("ClientInterceptorCacheDirective", hqu.a);
    }

    public hru(kpy kpy2) {
        int n2 = gzx.d;
        this.k = hct.a;
        this.e = kpy2.a;
        this.m = kpy2.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final htl a() {
        try {
            Object object = (gto)hhk.S(this.n);
            if (object == null) {
                ((hfk)((hfk)a.g()).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "continueRequestMessageProcessing", 190, "CachingClientInterceptor.java")).r("RpcCache returned null instead of Optional#absent()");
                return htl.a;
            }
            if (((gto)object).g()) {
                object = (hhk)((gto)object).c();
                throw null;
            }
            if (!this.i.equals(hqu.d) && !this.i.equals(hqu.e)) {
                return htl.a;
            }
            object = iye.j;
            Object object2 = iyh.a;
            object = ((iye)((Object)object)).a().e("Required value come from cache, but no cached value was found");
            object2 = new iwx();
            ((iwx)object2).g(b, c);
            return htl.b((iyh)object, (iwx)object2);
        }
        catch (ExecutionException executionException) {
            ((hfk)((hfk)((hfk)a.g()).i(executionException.getCause())).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "continueRequestMessageProcessing", 212, "CachingClientInterceptor.java")).r("Failed to read from cache");
            if (executionException.getCause() instanceof ClassCastException) {
                return htl.b(iyh.j, new iwx());
            }
            return htl.a;
        }
    }

    @Override
    public final /* synthetic */ htl b(gpm gpm2) {
        return htl.a;
    }

    @Override
    public final htl c(gpm gpm2) {
        Object object = gpm2.b;
        Object object2 = ixa.a;
        fxf.B(((ixb)object).a.equals(object2), "Caching interceptor only supports unary RPCs");
        object2 = gpm2.a;
        object = htp.b;
        object = (htp)((itw)object2).g((itv)object);
        a.s(object, "Using CachingClientInterceptor without MutableMetricsContext");
        this.h = object;
        object2 = gpm2.a;
        object = d;
        object = (hqu)((itw)object2).g((itv)object);
        a.s(object, "Using CachingClientInterceptor without CacheDirective");
        this.i = object;
        this.f = object = new iwx();
        ((iwx)object).f((iwx)gpm2.c);
        return htl.b;
    }

    @Override
    public final htl d(bzq object) {
        hyf hyf2 = (hyf)((bzq)object).a;
        this.n = object = new hpo((Callable)new gkz(this, object, 3));
        this.m.execute((Runnable)object);
        return htl.c(this.n);
    }

    @Override
    public final /* synthetic */ void e(bzq bzq2) {
    }

    @Override
    public final void f(dlm dlm2) {
        if (this.j != -1L) {
            this.m.execute(new hsk(this, dlm2, 1));
        }
    }

    @Override
    public final void g(dlm object) {
        block9: {
            this.g = new iwx();
            object = ((dlm)object).a;
            this.g.f((iwx)object);
            Iterator iterator = this.g;
            object = l;
            if (((iwx)((Object)iterator)).h((iws)object)) {
                block8: {
                    iterator = this.g;
                    for (int i2 = 0; i2 < ((iwx)((Object)iterator)).e; ++i2) {
                        if (!Arrays.equals(((iws)object).b, ((iwx)((Object)iterator)).j(i2))) continue;
                        object = new iwr((iwx)((Object)iterator), (iws)object, i2);
                        break block8;
                    }
                    object = null;
                }
                if (object != null) {
                    if (((AbstractCollection)(object = gzx.n((Iterable)object))).size() == 1) {
                        long l2;
                        object = (hqq)((hwp)hqq.a.l().c((byte[])object.get(0), hwj.a())).o();
                        if ((((hqq)object).b & 1) == 0 || (l2 = ((hqq)object).c) <= 0L) break block9;
                        try {
                            this.j = TimeUnit.SECONDS.toMillis(l2);
                            iterator = ((hqq)object).d;
                            object = new gzs();
                            iterator = iterator.iterator();
                            while (iterator.hasNext()) {
                                ((gzs)object).h(((String)iterator.next()).toLowerCase(Locale.ROOT));
                            }
                            this.k = ((gzs)object).g();
                            return;
                        }
                        catch (hxn hxn2) {
                            ((hfk)((hfk)((hfk)a.g()).i(hxn2)).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseHeaderProcessing", 301, "CachingClientInterceptor.java")).r("Could not parse server ttl");
                            return;
                        }
                    }
                    ((hfk)((hfk)a.g()).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseHeaderProcessing", 304, "CachingClientInterceptor.java")).s("Expected a single value for extension, got: %d", ((AbstractCollection)object).size());
                }
            }
        }
    }
}

