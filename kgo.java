/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class kgo {
    public kge a = new kge();
    public final List b;
    public final List c;
    public boolean d = true;
    public final kfu e;
    public boolean f;
    public final kgd g;
    public final kgg h;
    public Proxy i;
    public ProxySelector j;
    public final kfu k;
    public final SocketFactory l;
    public SSLSocketFactory m;
    public X509TrustManager n;
    public final List o;
    public final List p;
    public HostnameVerifier q;
    public final kfx r;
    public kks s;
    public int t;
    public int u;
    public int v;
    public AmbientMode$AmbientController w;
    public bzo x;
    public final bzo y = new bzo(null, null, null, null);

    public kgo() {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.w = new AmbientMode$AmbientController(kgh.b, null);
        Object object = kfu.a;
        this.e = object;
        this.f = true;
        this.g = kgd.a;
        this.h = kgg.a;
        this.k = object;
        object = SocketFactory.getDefault();
        jse.d(object, "getDefault(...)");
        this.l = object;
        this.o = kgp.b;
        this.p = kgp.a;
        this.q = kkt.a;
        this.r = kfx.a;
        this.t = 10000;
        this.u = 10000;
        this.v = 10000;
    }

    public kgo(kgp kgp2) {
        this();
        this.a = kgp2.c;
        this.y = kgp2.A;
        jns.A(this.b, kgp2.d);
        jns.A(this.c, kgp2.e);
        this.w = kgp2.y;
        this.d = kgp2.f;
        this.e = kgp2.g;
        this.f = kgp2.h;
        this.g = kgp2.i;
        this.h = kgp2.j;
        this.i = kgp2.k;
        this.j = kgp2.l;
        this.k = kgp2.m;
        this.l = kgp2.n;
        this.m = kgp2.o;
        this.n = kgp2.p;
        this.o = kgp2.q;
        this.p = kgp2.r;
        this.q = kgp2.s;
        this.r = kgp2.t;
        this.s = kgp2.u;
        this.t = kgp2.v;
        this.u = kgp2.w;
        this.v = kgp2.x;
        this.x = kgp2.z;
    }

    public final void a(long l2, TimeUnit timeUnit) {
        jse.e((Object)timeUnit, "unit");
        this.t = khb.A(l2, timeUnit);
    }

    public final void b(long l2, TimeUnit timeUnit) {
        jse.e((Object)timeUnit, "unit");
        this.u = khb.A(l2, timeUnit);
    }
}

