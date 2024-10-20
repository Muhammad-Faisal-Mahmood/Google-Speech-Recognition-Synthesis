/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class kkf {
    private static final Logger a;
    public static volatile kkf b;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        void var2_25;
        block16: {
            Class<?> clazz;
            block15: {
                boolean bl2 = kmp.D();
                Object var4_1 = null;
                clazz = null;
                if (bl2) break block15;
                Object object = kke.a ? new kke() : null;
                kke kke2 = object;
                if (object == null) {
                    block14: {
                        block13: {
                            String string = System.getProperty("java.specification.version", "unknown");
                            try {
                                jse.b(string);
                                int n2 = Integer.parseInt(string);
                                if (n2 < 9) break block13;
                                object = var4_1;
                                break block14;
                            }
                            catch (NumberFormatException numberFormatException) {}
                        }
                        try {
                            object = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> clazz2 = Class.forName(a.aw("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                            clazz = Class.forName(a.aw("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                            Class<?> clazz3 = Class.forName(a.aw("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                            Method method = ((Class)object).getMethod("put", SSLSocket.class, clazz2);
                            Method method2 = ((Class)object).getMethod("get", SSLSocket.class);
                            Method method3 = ((Class)object).getMethod("remove", SSLSocket.class);
                            jse.b(method);
                            jse.b(method2);
                            jse.b(method3);
                            jse.b(clazz);
                            jse.b(clazz3);
                            object = new kkd(method, method2, method3, clazz, clazz3);
                        }
                        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                            object = var4_1;
                        }
                    }
                    Object object2 = object;
                    if (object == null) {
                        kkf kkf2 = new kkf();
                    }
                }
                break block16;
            }
            CopyOnWriteArraySet copyOnWriteArraySet = kki.a;
            for (Map.Entry entry : kki.b.entrySet()) {
                void var2_12;
                String string = (String)entry.getKey();
                String string2 = (String)entry.getValue();
                Logger logger = Logger.getLogger(string);
                if (!kki.a.add(logger)) continue;
                logger.setUseParentHandlers(false);
                if (Log.isLoggable((String)string2, (int)3)) {
                    Level level = Level.FINE;
                } else if (Log.isLoggable((String)string2, (int)4)) {
                    Level level = Level.INFO;
                } else {
                    Level level = Level.WARNING;
                }
                logger.setLevel((Level)var2_12);
                logger.addHandler(kkj.a);
            }
            kjz kjz2 = kjz.a ? new kjz() : null;
            Iterator iterator = kjz2;
            if (kjz2 == null) {
                void var2_16;
                Class<?> clazz4 = clazz;
                if (kkb.a) {
                    kkb kkb2 = new kkb();
                }
                jse.b(var2_16);
            }
        }
        b = var2_25;
        a = Logger.getLogger(kgp.class.getName());
    }

    public static /* synthetic */ void m(kkf kkf2, String string, int n2, int n3) {
        if ((n3 & 2) != 0) {
            n2 = 4;
        }
        kkf2.l(string, n2, null);
    }

    public String a(SSLSocket sSLSocket) {
        jse.e(sSLSocket, "sslSocket");
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public X509TrustManager b(SSLSocketFactory object) {
        Object var2_4;
        block4: {
            var2_4 = null;
            Class<?> clazz = Class.forName("sun.security.ssl.SSLContextImpl");
            jse.b(clazz);
            object = khb.j(object, clazz, "context");
            if (object != null) break block4;
            return null;
        }
        try {
            return (X509TrustManager)khb.j(object, X509TrustManager.class, "trustManager");
        }
        catch (RuntimeException runtimeException) {
            if (!jse.i(runtimeException.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) throw runtimeException;
            return var2_4;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return var2_4;
        }
    }

    public kks c(X509TrustManager x509TrustManager) {
        jse.e(x509TrustManager, "trustManager");
        return new kkq(this.f(x509TrustManager));
    }

    public void d(SSLSocket sSLSocket, String string, List list) {
        jse.e(sSLSocket, "sslSocket");
        jse.e(list, "protocols");
    }

    public boolean e(String string) {
        return true;
    }

    public kku f(X509TrustManager x509CertificateArray) {
        jse.e(x509CertificateArray, "trustManager");
        x509CertificateArray = x509CertificateArray.getAcceptedIssuers();
        return new kkr(Arrays.copyOf(x509CertificateArray, x509CertificateArray.length));
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int n2) {
        jse.e(socket, "socket");
        jse.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, n2);
    }

    public void h(String string, Object object) {
        String string2 = string;
        if (object == null) {
            string2 = string.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        this.l(string2, 5, (Throwable)object);
    }

    public Object i() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void j(SSLSocket sSLSocket) {
        jse.e(sSLSocket, "sslSocket");
    }

    public final SSLSocketFactory k(X509TrustManager object) {
        jse.e(object, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            jse.d(sSLContext, "getInstance(...)");
            sSLContext.init(null, new TrustManager[]{object}, null);
            object = sSLContext.getSocketFactory();
            jse.d(object, "getSocketFactory(...)");
            return object;
        }
        catch (GeneralSecurityException generalSecurityException) {
            ((Object)generalSecurityException).toString();
            throw new AssertionError("No System TLS: ".concat(((Object)generalSecurityException).toString()), generalSecurityException);
        }
    }

    public final void l(String string, int n2, Throwable throwable) {
        Level level = n2 == 5 ? Level.WARNING : Level.INFO;
        a.log(level, string, throwable);
    }

    public final String toString() {
        String string = this.getClass().getSimpleName();
        jse.d(string, "getSimpleName(...)");
        return string;
    }
}

