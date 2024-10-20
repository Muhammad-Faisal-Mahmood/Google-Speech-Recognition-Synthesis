/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

public final class ivf
extends ixt {
    private static final long serialVersionUID = 0L;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public ivf(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String string, String string2) {
        a.s(socketAddress, "proxyAddress");
        a.s(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            fxf.E(((InetSocketAddress)socketAddress).isUnresolved() ^ true, "The proxy address %s is not resolved", socketAddress);
        }
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = string;
        this.d = string2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof ivf)) {
            return false;
        }
        object = (ivf)object;
        return a.k(this.a, ((ivf)object).a) && a.k(this.b, ((ivf)object).b) && a.k(this.c, ((ivf)object).c) && a.k(this.d, ((ivf)object).d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("proxyAddr", this.a);
        gtn2.b("targetAddr", this.b);
        gtn2.b("username", this.c);
        boolean bl2 = this.d != null;
        gtn2.g("hasPassword", bl2);
        return gtn2.toString();
    }
}

