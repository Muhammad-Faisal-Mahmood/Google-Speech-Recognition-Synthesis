/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class kkg
implements kkm {
    @Override
    public final String a(SSLSocket object) {
        jse.e(object, "sslSocket");
        object = dp$$ExternalSyntheticApiModelOutline0.m((SSLSocket)object);
        if (object != null && !jse.i(object, "")) {
            return object;
        }
        return null;
    }

    @Override
    public final /* synthetic */ X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    @Override
    public final void c(SSLSocket sSLSocket, String object, List list) {
        jse.e(sSLSocket, "sslSocket");
        jse.e(list, "protocols");
        try {
            dp$$ExternalSyntheticApiModelOutline0.m(sSLSocket, true);
            object = sSLSocket.getSSLParameters();
            kkf kkf2 = kkf.b;
            dp$$ExternalSyntheticApiModelOutline0.m((SSLParameters)object, kmp.C(list).toArray(new String[0]));
            sSLSocket.setSSLParameters((SSLParameters)object);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException("Android internal error", illegalArgumentException);
        }
    }

    @Override
    public final boolean d() {
        return kmp.B();
    }

    @Override
    public final boolean e(SSLSocket sSLSocket) {
        jse.e(sSLSocket, "sslSocket");
        return dp$$ExternalSyntheticApiModelOutline0.m(sSLSocket);
    }

    @Override
    public final /* synthetic */ boolean f(SSLSocketFactory sSLSocketFactory) {
        return false;
    }
}

