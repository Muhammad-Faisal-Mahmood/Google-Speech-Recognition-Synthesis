/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

public final class kko
extends ProxySelector {
    public static final kko a = new kko();

    private kko() {
    }

    @Override
    public final void connectFailed(URI uRI, SocketAddress socketAddress, IOException iOException) {
    }

    public final List select(URI uRI) {
        if (uRI != null) {
            return jns.d(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}

