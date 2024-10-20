/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

final class kkw
extends URLStreamHandler {
    final String a;
    final klg b;

    public kkw(klg klg2, String string) {
        this.a = string;
        this.b = klg2;
    }

    @Override
    protected final int getDefaultPort() {
        if (this.a.equals("http")) {
            return 80;
        }
        if (this.a.equals("https")) {
            return 443;
        }
        throw new AssertionError();
    }

    @Override
    protected final URLConnection openConnection(URL uRL) {
        return this.b.c(uRL);
    }

    @Override
    protected final URLConnection openConnection(URL uRL, Proxy proxy) {
        return this.b.d(uRL, proxy);
    }
}

