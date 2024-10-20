/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class kgp
implements Cloneable {
    public static final List a = khb.n((Object[])new kgq[]{kgq.d, kgq.b});
    public static final List b = khb.n(kga.a, kga.b);
    public final bzo A;
    public final kge c;
    public final List d;
    public final List e;
    public final boolean f;
    public final kfu g;
    public final boolean h;
    public final kgd i;
    public final kgg j;
    public final Proxy k;
    public final ProxySelector l;
    public final kfu m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final HostnameVerifier s;
    public final kfx t;
    public final kks u;
    public final int v;
    public final int w;
    public final int x;
    public final AmbientMode$AmbientController y;
    public final bzo z;

    public kgp() {
        this(new kgo());
    }

    public kgp(kgo object) {
        block21: {
            block22: {
                block23: {
                    block24: {
                        block25: {
                            block26: {
                                block20: {
                                    block19: {
                                        List list;
                                        Object object2;
                                        Object object3;
                                        this.c = ((kgo)object).a;
                                        this.A = ((kgo)object).y;
                                        this.d = khb.o(((kgo)object).b);
                                        this.e = khb.o(((kgo)object).c);
                                        this.y = ((kgo)object).w;
                                        this.f = ((kgo)object).d;
                                        this.g = ((kgo)object).e;
                                        this.h = ((kgo)object).f;
                                        this.i = ((kgo)object).g;
                                        this.j = ((kgo)object).h;
                                        this.k = ((kgo)object).i;
                                        if (((kgo)object).i != null) {
                                            object3 = kko.a;
                                        } else {
                                            object2 = ((kgo)object).j;
                                            object3 = object2;
                                            if (object2 == null) {
                                                object2 = ProxySelector.getDefault();
                                                object3 = object2;
                                                if (object2 == null) {
                                                    object3 = kko.a;
                                                }
                                            }
                                        }
                                        this.l = object3;
                                        this.m = ((kgo)object).k;
                                        this.n = ((kgo)object).l;
                                        this.q = list = ((kgo)object).o;
                                        this.r = ((kgo)object).p;
                                        this.s = ((kgo)object).q;
                                        this.v = ((kgo)object).t;
                                        this.w = ((kgo)object).u;
                                        this.x = ((kgo)object).v;
                                        object2 = ((kgo)object).x;
                                        object3 = object2;
                                        if (object2 == null) {
                                            object3 = new bzo(null, null);
                                        }
                                        this.z = object3;
                                        if (!(list instanceof Collection) || !list.isEmpty()) {
                                            object3 = list.iterator();
                                            while (object3.hasNext()) {
                                                if (!((kga)object3.next()).c) continue;
                                                object3 = ((kgo)object).m;
                                                if (object3 != null) {
                                                    this.o = object3;
                                                    object3 = ((kgo)object).s;
                                                    jse.b(object3);
                                                    this.u = object3;
                                                    object2 = ((kgo)object).n;
                                                    jse.b(object2);
                                                    this.p = object2;
                                                    object = ((kgo)object).r;
                                                    jse.b(object3);
                                                    this.t = ((kfx)object).a((kks)object3);
                                                    break block19;
                                                }
                                                object3 = kkf.b;
                                                object3 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                                                ((TrustManagerFactory)object3).init((KeyStore)null);
                                                object2 = ((TrustManagerFactory)object3).getTrustManagers();
                                                jse.b(object2);
                                                if (((TrustManager[])object2).length == 1 && (object3 = object2[0]) instanceof X509TrustManager) {
                                                    jse.c(object3, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                                                    this.p = object2 = (X509TrustManager)object3;
                                                    object3 = kkf.b;
                                                    jse.b(object2);
                                                    this.o = ((kkf)object3).k((X509TrustManager)object2);
                                                    jse.b(object2);
                                                    jse.e(object2, "trustManager");
                                                    this.u = object3 = kkf.b.c((X509TrustManager)object2);
                                                    object = ((kgo)object).r;
                                                    jse.b(object3);
                                                    this.t = ((kfx)object).a((kks)object3);
                                                    break block19;
                                                }
                                                object = Arrays.toString(object2);
                                                jse.d(object, "toString(...)");
                                                throw new IllegalStateException("Unexpected default trust managers: ".concat(String.valueOf(object)));
                                            }
                                        }
                                        this.o = null;
                                        this.u = null;
                                        this.p = null;
                                        this.t = kfx.a;
                                    }
                                    object = this.d;
                                    jse.c(object, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                    if (object.contains(null)) break block21;
                                    object = this.e;
                                    jse.c(object, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                    if (object.contains(null)) break block22;
                                    object = this.q;
                                    if (!(object instanceof Collection) || !object.isEmpty()) {
                                        object = object.iterator();
                                        while (object.hasNext()) {
                                            if (!((kga)object.next()).c) continue;
                                            if (this.o != null) {
                                                if (this.u != null) {
                                                    if (this.p == null) {
                                                        throw new IllegalStateException("x509TrustManager == null");
                                                    }
                                                    break block20;
                                                }
                                                throw new IllegalStateException("certificateChainCleaner == null");
                                            }
                                            throw new IllegalStateException("sslSocketFactory == null");
                                        }
                                    }
                                    if (this.o != null) break block23;
                                    if (this.u != null) break block24;
                                    if (this.p != null) break block25;
                                    if (!jse.i(this.t, kfx.a)) break block26;
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.");
                        }
                        throw new IllegalStateException("Check failed.");
                    }
                    throw new IllegalStateException("Check failed.");
                }
                throw new IllegalStateException("Check failed.");
            }
            object = this.e;
            Objects.toString(object);
            throw new IllegalStateException("Null network interceptor: ".concat(String.valueOf(object)));
        }
        object = this.d;
        Objects.toString(object);
        throw new IllegalStateException("Null interceptor: ".concat(String.valueOf(object)));
    }

    public final SSLSocketFactory a() {
        SSLSocketFactory sSLSocketFactory = this.o;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final Object clone() {
        return super.clone();
    }
}

