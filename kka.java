/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class kka
implements kku {
    private final X509TrustManager a;
    private final Method b;

    public kka(X509TrustManager x509TrustManager, Method method) {
        jse.e(x509TrustManager, "trustManager");
        jse.e(method, "findByIssuerAndSignatureMethod");
        this.a = x509TrustManager;
        this.b = method;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final X509Certificate a(X509Certificate object) {
        jse.e(object, "cert");
        try {
            object = this.b.invoke((Object)this.a, object);
            jse.c(object, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor)object).getTrustedCert();
        }
        catch (InvocationTargetException invocationTargetException) {
            return null;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError("unable to get issues and signature", illegalAccessException);
        }
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof kka)) {
            return false;
        }
        object = (kka)object;
        if (!jse.i(this.a, ((kka)object).a)) {
            return false;
        }
        return jse.i(this.b, ((kka)object).b);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CustomTrustRootIndex(trustManager=");
        stringBuilder.append(this.a);
        stringBuilder.append(", findByIssuerAndSignatureMethod=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

