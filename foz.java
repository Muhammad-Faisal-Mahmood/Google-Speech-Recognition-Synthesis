/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.lang.reflect.Field;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class foz {
    public static final String a = "foz";
    public static final Object b = new Object();
    public static fpd c;
    private static final String e;
    private static final String f;
    public fpc d;

    static {
        e = fpf.class.getName();
        f = fpe.class.getName();
    }

    private foz() {
    }

    public foz(fpc fpc2) {
        this.d = fpc2;
    }

    /*
     * WARNING - void declaration
     */
    public static final void a() {
        void var0_3;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            fpg fpg2 = new fpg();
            sSLContext.init(null, new TrustManager[]{fpg2}, null);
            SSLContext.setDefault(sSLContext);
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
            return;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (KeyManagementException keyManagementException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_3);
    }

    /*
     * WARNING - void declaration
     */
    public static final void b() {
        block5: {
            if (Build.VERSION.SDK_INT < 28) {
                void var0_4;
                try {
                    SSLContext sSLContext = SSLContext.getInstance("Default");
                    Field field = SSLSocketFactory.class.getDeclaredField("defaultSocketFactory");
                    field.setAccessible(true);
                    field.set(null, sSLContext.getSocketFactory());
                    field = SSLServerSocketFactory.class.getDeclaredField("defaultServerSocketFactory");
                    field.setAccessible(true);
                    field.set(null, sSLContext.getServerSocketFactory());
                    break block5;
                }
                catch (NoSuchFieldException noSuchFieldException) {
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
                throw new RuntimeException((Throwable)var0_4);
            }
        }
        Security.setProperty("ssl.SocketFactory.provider", e);
        Security.setProperty("ssl.ServerSocketFactory.provider", f);
    }
}

