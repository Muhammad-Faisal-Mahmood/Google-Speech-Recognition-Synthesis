/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

final class fpg
implements TrustManager,
X509TrustManager {
    private static final String a = "fpg";

    private static final void a() {
        Log.e((String)a, (String)"App is using openSSL stack, but is not using ProviderInstaller. Please Fix.");
        throw new RuntimeException("Unsafe use of platform SSL stack.");
    }

    @Override
    public final void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
        fpg.a();
    }

    @Override
    public final void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
        fpg.a();
    }

    @Override
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}

