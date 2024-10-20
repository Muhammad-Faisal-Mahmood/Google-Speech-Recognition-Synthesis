/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 *  android.net.http.X509TrustManagerExtensions
 *  android.util.Log
 */
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.chromium.net.AndroidCertVerifyResult;

public final class kpx {
    public static X509TrustManagerExtensions a;
    public static KeyStore b;
    public static Set c;
    public static final Object d;
    private static CertificateFactory e;
    private static kpw f;
    private static X509TrustManagerExtensions g;
    private static KeyStore h;
    private static File i;
    private static boolean j;
    private static final char[] k;

    static {
        d = new Object();
        k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static X509Certificate a(byte[] byArray) {
        kpx.i();
        return (X509Certificate)e.generateCertificate(new ByteArrayInputStream(byArray));
    }

    /*
     * Exception decompiling
     */
    public static AndroidCertVerifyResult b(byte[][] var0, String var1_8, String var2_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 21[TRYBLOCK] [34 : 767->770)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c() {
        Object object;
        if (e == null) {
            e = CertificateFactory.getInstance("X.509");
        }
        if (a == null) {
            a = kpx.g(null);
        }
        if (!j) {
            block10: {
                block9: {
                    try {
                        object = KeyStore.getInstance("AndroidCAStore");
                        h = object;
                        ((KeyStore)object).load(null);
                        break block9;
                    }
                    catch (KeyStoreException keyStoreException) {
                        break block10;
                    }
                    catch (IOException iOException) {}
                }
                String string = System.getenv("ANDROID_ROOT");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("/etc/security/cacerts");
                i = object = new File(stringBuilder.toString());
            }
            j = true;
        }
        if (c == null) {
            c = new HashSet();
        }
        if (f == null) {
            f = new kpw();
            object = new IntentFilter();
            object.addAction("android.security.action.KEYCHAIN_CHANGED");
            object.addAction("android.security.action.KEY_ACCESS_CHANGED");
            object.addAction("android.security.action.TRUST_STORE_CHANGED");
            jjj.ae(jjj.c, f, (IntentFilter)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d() {
        if (b == null) {
            KeyStore keyStore;
            b = keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                keyStore.load(null);
            }
            catch (IOException iOException) {}
        }
        if (g == null) {
            g = kpx.g(b);
        }
    }

    public static void e() {
        kpx.d();
        g = kpx.g(b);
    }

    /*
     * Exception decompiling
     */
    public static byte[][] f() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [22 : 224->233)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static X509TrustManagerExtensions g(KeyStore trustManagerArray) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore)trustManagerArray);
        try {
            trustManagerArray = trustManagerFactory.getTrustManagers();
        }
        catch (RuntimeException runtimeException) {
            Log.e((String)"cr_X509Util", (String)"TrustManagerFactory.getTrustManagers() unexpectedly threw: %s", (Throwable)runtimeException);
            throw new KeyStoreException(runtimeException);
        }
        int n2 = trustManagerArray.length;
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                Log.e((String)"cr_X509Util", (String)"Could not find suitable trust manager");
                return null;
            }
            TrustManager trustManager = trustManagerArray[n3];
            if (trustManager instanceof X509TrustManager) {
                try {
                    return new X509TrustManagerExtensions((X509TrustManager)trustManager);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    String string = trustManager.getClass().getName();
                    StringBuilder stringBuilder = new StringBuilder("Error creating trust manager (");
                    stringBuilder.append(string);
                    stringBuilder.append("): ");
                    stringBuilder.append(illegalArgumentException);
                    Log.e((String)"cr_X509Util", (String)stringBuilder.toString());
                }
            }
            ++n3;
        }
    }

    private static List h(X509TrustManagerExtensions object, X509Certificate[] x509CertificateArray, String string, String string2) {
        try {
            object = object.checkServerTrusted(x509CertificateArray, string, string2);
            return object;
        }
        catch (RuntimeException runtimeException) {
            Log.e((String)"cr_X509Util", (String)"checkServerTrusted() unexpectedly threw: %s", (Throwable)runtimeException);
            throw new CertificateException(runtimeException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void i() {
        Object object = d;
        synchronized (object) {
            kpx.c();
            return;
        }
    }
}

