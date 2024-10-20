/*
 * Decompiled with CFR 0.152.
 */
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class kkn
extends kkk {
    private final Class b;
    private final Class c;

    public kkn(Class clazz, Class clazz2, Class clazz3) {
        jse.e(clazz, "sslSocketClass");
        jse.e(clazz2, "sslSocketFactoryClass");
        jse.e(clazz3, "paramClass");
        super(clazz);
        this.b = clazz2;
        this.c = clazz3;
    }

    @Override
    public final X509TrustManager b(SSLSocketFactory object) {
        object = khb.j(object, this.c, "sslParameters");
        jse.b(object);
        X509TrustManager x509TrustManager = (X509TrustManager)khb.j(object, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager == null) {
            return (X509TrustManager)khb.j(object, X509TrustManager.class, "trustManager");
        }
        return x509TrustManager;
    }

    @Override
    public final boolean f(SSLSocketFactory sSLSocketFactory) {
        return this.b.isInstance(sSLSocketFactory);
    }
}

