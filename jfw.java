/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

final class jfw
extends ixj {
    final SocketAddress a;
    final String b;
    final Collection c;

    public jfw(SocketAddress socketAddress, String string) {
        this.a = socketAddress;
        this.b = string;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override
    public final ixi a(URI uRI, ixc ixc2) {
        return new jfv(this);
    }

    @Override
    public final String b() {
        return "directaddress";
    }

    @Override
    public final Collection c() {
        return this.c;
    }

    @Override
    protected final void d() {
    }

    @Override
    protected final void e() {
    }
}

