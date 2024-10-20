/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class kfs {
    public final kgg a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final kfx e;
    public final kfu f;
    public final Proxy g;
    public final ProxySelector h;
    public final kgm i;
    public final List j;
    public final List k;

    public kfs(String string, int n2, kgg object, SocketFactory object2, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, kfx kfx2, kfu kfu2, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        block7: {
            block6: {
                block5: {
                    jse.e(object2, "socketFactory");
                    jse.e(list, "protocols");
                    jse.e(list2, "connectionSpecs");
                    jse.e(proxySelector, "proxySelector");
                    this.a = object;
                    this.b = object2;
                    this.c = sSLSocketFactory;
                    this.d = hostnameVerifier;
                    this.e = kfx2;
                    this.f = kfu2;
                    this.g = proxy;
                    this.h = proxySelector;
                    object2 = new kgl();
                    object = sSLSocketFactory != null ? "https" : "http";
                    if (!jse.H((String)object, "http")) break block5;
                    ((kgl)object2).a = "http";
                    break block6;
                }
                if (!jse.H((String)object, "https")) break block7;
                ((kgl)object2).a = "https";
            }
            object = kgm.a;
            object = jvf.r(jvf.u(string, 0, 0, false, 7));
            if (object != null) {
                ((kgl)object2).d = object;
                if (n2 > 0) {
                    ((kgl)object2).e = n2;
                    this.i = ((kgl)object2).a();
                    this.j = khb.o(list);
                    this.k = khb.o(list2);
                    return;
                }
                throw new IllegalArgumentException(a.af(n2, "unexpected port: "));
            }
            throw new IllegalArgumentException("unexpected host: ".concat(string));
        }
        throw new IllegalArgumentException("unexpected scheme: ".concat((String)object));
    }

    public final boolean a(kfs kfs2) {
        jse.e(kfs2, "that");
        if (jse.i(this.a, kfs2.a) && jse.i(this.f, kfs2.f) && jse.i(this.j, kfs2.j) && jse.i(this.k, kfs2.k) && jse.i(this.h, kfs2.h) && jse.i(this.g, kfs2.g) && jse.i(this.c, kfs2.c) && jse.i(this.d, kfs2.d) && jse.i(this.e, kfs2.e)) {
            kgm kgm2 = this.i;
            int n2 = kfs2.i.d;
            if (kgm2.d == n2) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object object) {
        if (object instanceof kfs) {
            kgm kgm2 = this.i;
            object = (kfs)object;
            if (jse.i(kgm2, ((kfs)object).i) && this.a((kfs)object)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.i.hashCode() + 527) * 31 + this.a.hashCode()) * 31 + this.f.hashCode()) * 31 + ((Object)this.j).hashCode()) * 31 + ((Object)this.k).hashCode()) * 31 + this.h.hashCode()) * 31 + j$.util.Objects.hashCode(this.g)) * 31 + j$.util.Objects.hashCode(this.c)) * 31 + j$.util.Objects.hashCode(this.d)) * 31 + j$.util.Objects.hashCode(this.e);
    }

    public final String toString() {
        Object object;
        Object object2 = this.g;
        if (object2 != null) {
            Objects.toString(object2);
            object2 = object2.toString();
            object = "proxy=";
        } else {
            object2 = this.h;
            Objects.toString(object2);
            object2 = String.valueOf(object2);
            object = "proxySelector=";
        }
        String string = ((String)object).concat((String)object2);
        object = this.i;
        object2 = new StringBuilder("Address{");
        ((StringBuilder)object2).append(((kgm)object).c);
        ((StringBuilder)object2).append(":");
        ((StringBuilder)object2).append(((kgm)object).d);
        ((StringBuilder)object2).append(", ");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append("}");
        return ((StringBuilder)object2).toString();
    }
}

