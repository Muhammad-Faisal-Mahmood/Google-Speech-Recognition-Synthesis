/*
 * Decompiled with CFR 0.152.
 */
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class fpa
extends SSLContextSpi {
    private KeyManager[] a;
    private TrustManager[] b;
    private SecureRandom c;

    @Override
    public final SSLEngine engineCreateSSLEngine() {
        return null;
    }

    @Override
    public final SSLEngine engineCreateSSLEngine(String string, int n2) {
        return null;
    }

    @Override
    public final SSLServerSocketFactory engineGetServerSocketFactory() {
        return null;
    }

    @Override
    public final SSLSocketFactory engineGetSocketFactory() {
        return new fpf(this.a, this.b, this.c);
    }

    @Override
    public final void engineInit(KeyManager[] keyManagerArray, TrustManager[] trustManagerArray, SecureRandom secureRandom) {
        this.a = keyManagerArray;
        this.b = trustManagerArray;
        this.c = secureRandom;
    }
}

