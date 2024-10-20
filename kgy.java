/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class kgy {
    public final kfs a;
    public final Proxy b;
    public final InetSocketAddress c;

    public kgy(kfs kfs2, Proxy proxy, InetSocketAddress inetSocketAddress) {
        jse.e(proxy, "proxy");
        jse.e(inetSocketAddress, "socketAddress");
        this.a = kfs2;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.c != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object object) {
        if (object instanceof kgy) {
            object = (kgy)object;
            if (jse.i(((kgy)object).a, this.a) && jse.i(((kgy)object).b, this.b) && jse.i(((kgy)object).c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Route{");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

