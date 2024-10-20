/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class fpf
extends SSLSocketFactory {
    public static fpc a;
    private static final String b = "fpf";
    private final KeyManager[] c;
    private final TrustManager[] d;
    private final SecureRandom e;

    public fpf(KeyManager[] keyManagerArray, TrustManager[] trustManagerArray, SecureRandom secureRandom) {
        this.c = keyManagerArray;
        this.d = trustManagerArray;
        this.e = secureRandom;
    }

    private final SSLSocketFactory a() {
        Object object = hti.c;
        int n2 = ((hti)object).a;
        a.a((hti)object);
        object = this.b();
        if (object instanceof fpf) {
            Provider[] providerArray = Security.getProviders();
            int n3 = providerArray.length;
            object = "[";
            for (n2 = 0; n2 < n3; ++n2) {
                Provider provider = providerArray[n2];
                String string = ((String)object).concat(String.valueOf(provider.toString()));
                object = provider.stringPropertyNames().contains("SSLContext.Default") ? "(true), " : "(false), ";
                object = string.concat((String)object);
            }
            object = ((String)object).concat("]");
            Log.e((String)b, (String)object);
            throw new RuntimeException("Unable to find a default SSL provider.");
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final SSLSocketFactory b() {
        void var1_6;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArray = this.d;
            if (trustManagerArray != null && trustManagerArray.length > 0 && trustManagerArray[0] instanceof fpg) {
                sSLContext.init(null, null, null);
                return sSLContext.getSocketFactory();
            } else {
                sSLContext.init(this.c, trustManagerArray, this.e);
            }
            return sSLContext.getSocketFactory();
        }
        catch (KeyManagementException keyManagementException) {
            throw new AssertionError(var1_6);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
        throw new AssertionError(var1_6);
    }

    @Override
    public final Socket createSocket() {
        return this.a().createSocket();
    }

    @Override
    public final Socket createSocket(String string, int n2) {
        return this.a().createSocket(string, n2);
    }

    @Override
    public final Socket createSocket(String string, int n2, InetAddress inetAddress, int n3) {
        return this.a().createSocket(string, n2, inetAddress, n3);
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int n2) {
        return this.a().createSocket(inetAddress, n2);
    }

    @Override
    public final Socket createSocket(InetAddress inetAddress, int n2, InetAddress inetAddress2, int n3) {
        return this.a().createSocket(inetAddress, n2, inetAddress2, n3);
    }

    @Override
    public final Socket createSocket(Socket socket, String string, int n2, boolean bl2) {
        return this.a().createSocket(socket, string, n2, bl2);
    }

    @Override
    public final String[] getDefaultCipherSuites() {
        try {
            String[] stringArray = this.a().getDefaultCipherSuites();
            return stringArray;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        try {
            String[] stringArray = this.a().getSupportedCipherSuites();
            return stringArray;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

