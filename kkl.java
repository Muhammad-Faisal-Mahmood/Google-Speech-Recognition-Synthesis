/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class kkl
implements kkm {
    private kkm a;
    private final AmbientMode$AmbientController b;

    public kkl(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.b = ambientMode$AmbientController;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final kkm g(SSLSocket object) {
        synchronized (this) {
            Object object2;
            if (this.a != null) return this.a;
            if (!this.b.B((SSLSocket)object)) return this.a;
            jse.e(object, "sslSocket");
            object = object2 = object.getClass();
            while (object != null && !jse.i(((Class)object).getSimpleName(), "OpenSSLSocketImpl")) {
                if ((object = ((Class)object).getSuperclass()) != null) continue;
                Objects.toString(object2);
                object = new AssertionError((Object)"No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(object2)));
                throw object;
            }
            jse.b(object);
            this.a = object2 = new kkk((Class)object);
            return this.a;
        }
    }

    @Override
    public final String a(SSLSocket sSLSocket) {
        jse.e(sSLSocket, "sslSocket");
        kkm kkm2 = this.g(sSLSocket);
        if (kkm2 != null) {
            return kkm2.a(sSLSocket);
        }
        return null;
    }

    @Override
    public final /* synthetic */ X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    @Override
    public final void c(SSLSocket sSLSocket, String string, List list) {
        jse.e(sSLSocket, "sslSocket");
        jse.e(list, "protocols");
        kkm kkm2 = this.g(sSLSocket);
        if (kkm2 != null) {
            kkm2.c(sSLSocket, string, list);
        }
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e(SSLSocket sSLSocket) {
        jse.e(sSLSocket, "sslSocket");
        return this.b.B(sSLSocket);
    }

    @Override
    public final /* synthetic */ boolean f(SSLSocketFactory sSLSocketFactory) {
        return false;
    }
}

