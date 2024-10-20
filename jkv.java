/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

class jkv {
    public static final Logger a;
    public static final jkv b;
    private static final jlp d;
    protected final jlp c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        block4: {
            a = Logger.getLogger(jkv.class.getName());
            d = jlp.b;
            object = jkv.class.getClassLoader();
            try {
                ((ClassLoader)object).loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
            }
            catch (ClassNotFoundException classNotFoundException) {
                Level level = Level.FINE;
                a.logp(level, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", classNotFoundException);
                try {
                    ((ClassLoader)object).loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
                }
                catch (ClassNotFoundException classNotFoundException2) {
                    object = Level.FINE;
                    a.logp((Level)object, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", classNotFoundException2);
                    object = new jkv(d);
                    break block4;
                }
            }
            object = new jku(d);
        }
        b = object;
    }

    public jkv(jlp jlp2) {
        a.s(jlp2, "platform");
        this.c = jlp2;
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket, String object, List object2) {
        block4: {
            if (object2 != null) {
                this.c(sSLSocket, (String)object, (List)object2);
            }
            try {
                sSLSocket.startHandshake();
                object = this.a(sSLSocket);
                if (object == null) break block4;
                this.c.d(sSLSocket);
                return object;
            }
            catch (Throwable throwable) {
                this.c.d(sSLSocket);
                throw throwable;
            }
        }
        String string = String.valueOf(object2);
        object2 = new StringBuilder("TLS ALPN negotiation failed with protocols: ");
        ((StringBuilder)object2).append(string);
        object = new RuntimeException(((StringBuilder)object2).toString());
        throw object;
    }

    protected void c(SSLSocket sSLSocket, String string, List list) {
        this.c.b(sSLSocket, string, list);
    }
}

