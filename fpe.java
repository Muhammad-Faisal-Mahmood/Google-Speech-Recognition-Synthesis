/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

public final class fpe
extends SSLServerSocketFactory {
    public static fpc a;
    private static final String b;

    static {
        b = "fpf";
    }

    private static final SSLServerSocketFactory a() {
        try {
            SSLServerSocketFactory sSLServerSocketFactory = SSLContext.getInstance("Default").getServerSocketFactory();
            return sSLServerSocketFactory;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new AssertionError((Object)noSuchAlgorithmException);
        }
    }

    private static final SSLServerSocketFactory b() {
        Object object = hti.c;
        int n2 = ((hti)object).a;
        a.a((hti)object);
        object = fpe.a();
        if (object instanceof fpe) {
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

    @Override
    public final ServerSocket createServerSocket(int n2) {
        return fpe.b().createServerSocket(n2);
    }

    @Override
    public final ServerSocket createServerSocket(int n2, int n3) {
        return fpe.b().createServerSocket(n2, n3);
    }

    @Override
    public final ServerSocket createServerSocket(int n2, int n3, InetAddress inetAddress) {
        return fpe.b().createServerSocket(n2, n3, inetAddress);
    }

    @Override
    public final String[] getDefaultCipherSuites() {
        try {
            String[] stringArray = fpe.b().getDefaultCipherSuites();
            return stringArray;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Override
    public final String[] getSupportedCipherSuites() {
        try {
            String[] stringArray = fpe.b().getSupportedCipherSuites();
            return stringArray;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }
}

