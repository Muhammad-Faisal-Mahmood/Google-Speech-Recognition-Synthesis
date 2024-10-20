/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class khr
extends kiy {
    public final kgy a;
    public Socket b;
    public Socket c;
    public kgj d;
    public kgq e;
    public kjl f;
    public klo g;
    public kln h;
    public boolean i;
    public int j;
    public int k;
    public final List l;
    public long m;
    private boolean o;
    private int p;
    private int q;

    public khr(kgy kgy2) {
        jse.e(kgy2, "route");
        this.a = kgy2;
        this.k = 1;
        this.l = new ArrayList();
        this.m = Long.MAX_VALUE;
    }

    public final Socket a() {
        Socket socket = this.c;
        jse.b(socket);
        return socket;
    }

    public final void b() {
        Socket socket = this.b;
        if (socket != null) {
            khb.r(socket);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        synchronized (this) {
            ++this.p;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            this.o = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        synchronized (this) {
            this.i = true;
            return;
        }
    }

    @Override
    public final void f(kjs kjs2) {
        kjs2.g(kiq.h, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(khp cloneable, IOException iOException) {
        synchronized (this) {
            if (iOException instanceof kjy) {
                iOException = (kjy)iOException;
                if (((kjy)iOException).a == kiq.h) {
                    int n2;
                    this.q = n2 = this.q + 1;
                    if (n2 > 1) {
                        this.i = true;
                        ++this.j;
                        return;
                    }
                } else if (((kjy)iOException).a != kiq.i || !cloneable.l) {
                    this.i = true;
                    ++this.j;
                    return;
                }
            } else if (!this.i() || iOException instanceof kip) {
                this.i = true;
                if (this.p == 0) {
                    cloneable = cloneable.a;
                    kgy kgy2 = this.a;
                    jse.e(kgy2, "failedRoute");
                    if (kgy2.b.type() != Proxy.Type.DIRECT) {
                        Object object = kgy2.a;
                        ProxySelector proxySelector = ((kfs)object).h;
                        object = ((kfs)object).i;
                        Proxy proxy = kgy2.b;
                        proxySelector.connectFailed(((kgm)object).f(), proxy.address(), iOException);
                    }
                    ((kgp)cloneable).z.as(kgy2);
                    ++this.j;
                    return;
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h(kfs object, List object2) {
        byte[] byArray = khb.a;
        if (this.l.size() >= this.k) return false;
        if (this.i) {
            return false;
        }
        if (!this.a.a.a((kfs)object)) return false;
        kgm kgm2 = ((kfs)object).i;
        kgm kgm3 = this.a.a.i;
        if (jse.i(kgm2.c, kgm3.c)) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        if (object2 == null) return false;
        if (object2.isEmpty()) {
            return false;
        }
        Iterator iterator = object2.iterator();
        do {
            if (!iterator.hasNext()) return false;
            object2 = (kgy)iterator.next();
        } while (((kgy)object2).b.type() != Proxy.Type.DIRECT || this.a.b.type() != Proxy.Type.DIRECT || !jse.i(this.a.c, ((kgy)object2).c));
        if (((kfs)object).d != kkt.a) return false;
        object2 = ((kfs)object).i;
        kgm kgm4 = this.a.a.i;
        if (((kgm)object2).d != kgm4.d) {
            return false;
        }
        if (!jse.i(((kgm)object2).c, kgm4.c)) {
            if (this.o) return false;
            kgj kgj2 = this.d;
            if (kgj2 == null) return false;
            List list = kgj2.a();
            if (list.isEmpty()) return false;
            object2 = ((kgm)object2).c;
            Object e2 = list.get(0);
            jse.c(e2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (!kkt.b((String)object2, (X509Certificate)e2)) return false;
        }
        try {
            object = ((kfs)object).e;
            jse.b(object);
            object2 = this.d;
            jse.b(object2);
            jse.e(((kgj)object2).a(), "peerCertificates");
            ((kfx)object).b();
            return true;
        }
        catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
            return false;
        }
    }

    public final boolean i() {
        return this.f != null;
    }

    public final void j(int n2, int n3) {
        int n4;
        Object object = this.a;
        Object object2 = ((kgy)object).b;
        Object object3 = ((Proxy)object2).type();
        if (object3 == null || (n4 = khq.a[object3.ordinal()]) != 1 && n4 != 2) {
            object3 = new Socket((Proxy)object2);
        } else {
            object3 = ((kgy)object).a.b.createSocket();
            jse.b(object3);
        }
        this.b = object3;
        jse.e(this.a.c, "inetSocketAddress");
        jse.e(object2, "proxy");
        ((Socket)object3).setSoTimeout(n3);
        try {
            kkf.b.g((Socket)object3, this.a.c, n2);
        }
        catch (ConnectException connectException) {
            object2 = this.a.c;
            Objects.toString(object2);
            object2 = new ConnectException("Failed to connect to ".concat(String.valueOf(object2)));
            ((Throwable)object2).initCause(connectException);
            throw object2;
        }
        try {
            object2 = klw.d((Socket)object3);
            this.g = object = new kme((kmk)object2);
            this.h = kmp.t(klw.b((Socket)object3));
            return;
        }
        catch (NullPointerException nullPointerException) {
            if (!jse.i(nullPointerException.getMessage(), "throw with null exception")) {
                return;
            }
            throw new IOException(nullPointerException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void k(kjx kjx2) {
        synchronized (this) {
            jse.e(kjx2, "settings");
            this.k = kjx2.d();
            return;
        }
    }

    public final void l() {
        this.i = true;
    }

    public final void m() {
        Object object = this.c;
        jse.b(object);
        klo klo2 = this.g;
        jse.b(klo2);
        Object object2 = this.h;
        jse.b(object2);
        ((Socket)object).setSoTimeout(0);
        Object object3 = new kiw(khh.a);
        kgm kgm2 = this.a.a.i;
        jse.e(object, "socket");
        jse.e(klo2, "source");
        jse.e(object2, "sink");
        jse.e(object, "<set-?>");
        ((kiw)object3).b = object;
        object = khb.e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" ");
        stringBuilder.append(kgm2.c);
        ((kiw)object3).c = stringBuilder.toString();
        jse.e(klo2, "<set-?>");
        ((kiw)object3).d = klo2;
        jse.e(object2, "<set-?>");
        ((kiw)object3).e = object2;
        ((kiw)object3).f = this;
        this.f = object3 = new kjl((kiw)object3);
        this.k = kjl.a.d();
        object2 = khh.a;
        jse.e(object2, "taskRunner");
        ((kjl)object3).u.b();
        ((kjl)object3).u.i(((kjl)object3).q);
        int n2 = ((kjl)object3).q.c();
        if (n2 != 65535) {
            ((kjl)object3).u.j(0, n2 - 65535);
        }
        ((khh)object2).a().f(new khe(((kjl)object3).d, ((kjl)object3).v));
    }

    public final String toString() {
        Object object = this.a;
        Object object2 = ((kgy)object).a.i;
        Object object3 = this.d;
        object3 = object3 != null ? ((kgj)object3).b : "none";
        InetSocketAddress inetSocketAddress = ((kgy)object).c;
        object = ((kgy)object).b;
        int n2 = ((kgm)object2).d;
        String string = ((kgm)object2).c;
        kgq kgq2 = this.e;
        object2 = new StringBuilder("Connection{");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(":");
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append(", proxy=");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" hostAddress=");
        ((StringBuilder)object2).append(inetSocketAddress);
        ((StringBuilder)object2).append(" cipherSuite=");
        ((StringBuilder)object2).append(object3);
        ((StringBuilder)object2).append(" protocol=");
        ((StringBuilder)object2).append((Object)kgq2);
        ((StringBuilder)object2).append("}");
        return ((StringBuilder)object2).toString();
    }
}

