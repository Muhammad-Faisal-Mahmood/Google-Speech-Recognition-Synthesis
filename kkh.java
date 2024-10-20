/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.X509TrustManagerExtensions
 */
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

public final class kkh
extends kks {
    private final X509TrustManager a;
    private final X509TrustManagerExtensions b;

    public kkh(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        jse.e(x509TrustManager, "trustManager");
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    @Override
    public final List a(List object, String object2) {
        jse.e(object, "chain");
        object = object.toArray(new X509Certificate[0]);
        try {
            object = this.b.checkServerTrusted(object, "RSA", (String)object2);
            jse.d(object, "checkServerTrusted(...)");
            return object;
        }
        catch (CertificateException certificateException) {
            object2 = new SSLPeerUnverifiedException(certificateException.getMessage());
            ((Throwable)object2).initCause(certificateException);
            throw object2;
        }
    }

    public final boolean equals(Object object) {
        return object instanceof kkh && ((kkh)object).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }
}

