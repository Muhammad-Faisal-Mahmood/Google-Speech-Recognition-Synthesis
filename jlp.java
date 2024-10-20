/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public class jlp {
    public static final Logger a = Logger.getLogger(jlp.class.getName());
    public static final jlp b;
    private static final String[] d;
    public final Provider c;

    static {
        d = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        b = jlp.f();
    }

    public jlp(Provider provider) {
        this.c = provider;
    }

    public static byte[] e(List list) {
        klm klm2 = new klm();
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            jlq jlq2 = (jlq)((Object)list.get(i2));
            if (jlq2 == jlq.a) continue;
            klm2.F(jlq2.e.length());
            klm2.P(jlq2.e);
        }
        return klm2.z();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static jlp f() {
        bmu bmu2;
        Object object;
        Object object2;
        Provider provider;
        Object object3 = Security.getProviders();
        int n2 = ((Provider[])object3).length;
        int n3 = 0;
        block12: while (true) {
            int n4;
            if (n3 < n2) {
                provider = object3[n3];
                object2 = d;
                n4 = ((String[])object2).length;
            } else {
                a.logp(Level.WARNING, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Unable to find Conscrypt");
                provider = null;
                break;
            }
            for (n4 = 0; n4 < 5; ++n4) {
                object = object2[n4];
                if (!((String)object).equals(provider.getClass().getName())) continue;
                a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", object);
                break block12;
            }
            ++n3;
        }
        if (provider != null) {
            bmu2 = new bmu(null, (Object)"setUseSessionTickets", new Class[]{Boolean.TYPE});
            object = new bmu(null, (Object)"setHostname", new Class[]{String.class});
            object2 = new bmu(byte[].class, (Object)"getAlpnSelectedProtocol", new Class[0]);
            object3 = new bmu(null, (Object)"setAlpnProtocols", new Class[]{byte[].class});
            Class<?> clazz = Class.forName("android.net.TrafficStats");
            clazz.getMethod("tagSocket", Socket.class);
            clazz.getMethod("untagSocket", Socket.class);
        } else {
            try {
                provider = SSLContext.getDefault().getProvider();
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                throw new RuntimeException(noSuchAlgorithmException);
            }
            try {
                object2 = SSLContext.getInstance("TLS", provider);
                ((SSLContext)object2).init(null, null, null);
                object2 = ((SSLContext)object2).createSSLEngine();
                SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(object2, null);
                return new jlm(provider, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException exception) {
                try {
                    object3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    object = Class.forName(a.aw("org.eclipse.jetty.alpn.ALPN", "$Provider"));
                    Class<?> clazz = Class.forName(a.aw("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"));
                    Class<?> clazz2 = Class.forName(a.aw("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"));
                    return new jln(((Class)object3).getMethod("put", new Class[]{SSLSocket.class, object}), ((Class)object3).getMethod("get", SSLSocket.class), ((Class)object3).getMethod("remove", SSLSocket.class), clazz, clazz2, provider);
                }
                catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                    return new jlp(provider);
                }
            }
            catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {}
        }
        if (!(provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard"))) {
            try {
                jlp.class.getClassLoader().loadClass("android.net.Network");
            }
            catch (ClassNotFoundException classNotFoundException) {
                a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", classNotFoundException);
                try {
                    jlp.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    n3 = 2;
                    return new jll(bmu2, (bmu)object, (bmu)object2, (bmu)object3, provider, n3);
                }
                catch (ClassNotFoundException classNotFoundException2) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", classNotFoundException2);
                    n3 = 3;
                    return new jll(bmu2, (bmu)object, (bmu)object2, (bmu)object3, provider, n3);
                }
            }
        }
        n3 = 1;
        return new jll(bmu2, (bmu)object, (bmu)object2, (bmu)object3, provider, n3);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void b(SSLSocket sSLSocket, String string, List list) {
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }
}

