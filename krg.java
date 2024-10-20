/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
import android.content.Context;
import android.util.Log;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.impl.ImplVersion;

public final class krg
extends kqm {
    private static final String e = "krg";
    public final int a;
    public final kqx b;
    public final AtomicInteger c = new AtomicInteger();
    public final Context d;
    private final String f;
    private final ExecutorService g;

    public krg(kqo object) {
        int n2;
        Object object2 = ((kqo)object).c;
        this.d = object2;
        this.a = n2 = this.hashCode();
        int n3 = ((kqo)object).o(9);
        this.f = ((kqo)object).g;
        this.g = new ThreadPoolExecutor(10, 10, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new krf(n3));
        object2 = kqy.a((Context)object2, 4);
        this.b = object2;
        long l2 = n2;
        try {
            kqs kqs2 = ((kqo)object).q();
            String string = "CronetHttpURLConnection/".concat(ImplVersion.getCronetVersionWithLastChange()).split("/")[1].split("@")[0];
            object = new kqw(string);
            ((kqx)object2).e(l2, kqs2, (kqw)object, 4);
        }
        catch (RuntimeException runtimeException) {
            Log.e((String)e, (String)"Error while trying to log JavaCronetEngine creation: ", (Throwable)runtimeException);
        }
        Log.w((String)e, (String)"using the fallback Cronet Engine implementation. Performance will suffer and many HTTP client features, including caching, will not work.");
    }

    @Override
    public final URLConnection a(URL uRL) {
        return uRL.openConnection();
    }

    @Override
    public final void c(kpm kpm2) {
    }

    @Override
    public final void d(kpd kpd2) {
    }

    @Override
    public final void e(kpe kpe2) {
    }

    @Override
    public final /* synthetic */ jjj f(String string, kps kps2, Executor executor) {
        return new ksc(string, kps2, executor, this);
    }

    @Override
    public final koh g(String string, kny kny2, Executor executor, String string2, List list, boolean bl2, Collection collection, boolean bl3, int n2, boolean bl4, int n3) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    @Override
    public final kom h(String string, kps kps2, Executor executor, int n2, boolean bl2, boolean bl3, boolean bl4, int n3, boolean bl5, int n4, String string2, ArrayList arrayList, kpq kpq2, Executor executor2) {
        return new krs(this, kps2, this.g, executor, string, this.f, bl3, bl4, n3, bl5, n4, string2, arrayList, kpq2, executor2);
    }

    public final void i() {
        this.c.decrementAndGet();
    }
}

