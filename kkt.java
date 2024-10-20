/*
 * Decompiled with CFR 0.152.
 */
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class kkt
implements HostnameVerifier {
    public static final kkt a = new kkt();

    private kkt() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final List a(X509Certificate serializable, int n2) {
        try {
            Object object = ((X509Certificate)serializable).getSubjectAlternativeNames();
            if (object == null) {
                return jpa.a;
            }
            serializable = new ArrayList();
            object = object.iterator();
            while (true) {
                if (!object.hasNext()) {
                    return serializable;
                }
                List list = (List)object.next();
                if (list == null || list.size() < 2 || !jse.i(list.get(0), n2) || (list = list.get(1)) == null) continue;
                serializable.add((String)((Object)list));
            }
        }
        catch (CertificateParsingException certificateParsingException) {
            return jpa.a;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b(String object, X509Certificate object2) {
        jse.e(object, "host");
        jse.e(object2, "certificate");
        boolean bl2 = khb.s((String)object);
        boolean bl3 = false;
        if (bl2) {
            object = jvf.r((String)object);
            if ((object2 = kkt.a((X509Certificate)object2, 7)).isEmpty()) {
                return bl3;
            }
            object2 = object2.iterator();
            do {
                bl2 = bl3;
                if (!object2.hasNext()) return bl2;
            } while (!jse.i(object, jvf.r((String)object2.next())));
            return true;
        }
        String string = kkt.d((String)object);
        object = kkt.a((X509Certificate)object2, 2);
        if (object.isEmpty()) {
            return bl3;
        }
        Iterator iterator = object.iterator();
        while (true) {
            bl2 = bl3;
            if (!iterator.hasNext()) return bl2;
            String string2 = (String)iterator.next();
            if (string == null || string.length() == 0 || jse.X(string, ".") || jse.G(string, "..") || string2 == null || string2.length() == 0 || jse.X(string2, ".") || jse.G(string2, "..")) continue;
            object = !jse.G(string, ".") ? string.concat(".") : string;
            object2 = string2;
            if (!jse.G(string2, ".")) {
                object2 = string2.concat(".");
            }
            if (!jse.F((CharSequence)(object2 = kkt.d((String)object2)), "*")) {
                if (!jse.i(object, object2)) continue;
                return true;
            }
            if (!jse.X((String)object2, "*.") || jse.L((CharSequence)object2, '*', 1, 4) != -1 || ((String)object).length() < ((String)object2).length() || jse.i("*.", object2)) continue;
            object2 = ((String)object2).substring(1);
            jse.d(object2, "substring(...)");
            if (!jse.G((String)object, (String)object2)) continue;
            int n2 = ((String)object).length() - ((String)object2).length();
            if (n2 <= 0) return true;
            if (jse.N((CharSequence)object, '.', n2 - 1, 4) == -1) return true;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static final boolean c(String var0) {
        var5_1 = var0.length();
        var4_2 = var0.length();
        jse.e(var0, "<this>");
        if (var4_2 >= 0) {
            if (var4_2 <= var0.length()) {
                var7_3 = 0L;
                var1_4 = 0;
                block0: while (var1_4 < var4_2) {
                    var3_7 = var1_4 + 1;
                    var6_8 = var0.charAt(var1_4);
                    if (var6_8 < '\u0080') {
                        while (true) {
                            ++var7_3;
lbl14:
                            // 2 sources

                            while (true) {
                                var1_4 = var3_7;
                                continue block0;
                                break;
                            }
                            break;
                        }
                    }
                    if (var6_8 < '\u0800') {
                        var9_9 = 2L;
lbl19:
                        // 2 sources

                        while (true) {
                            var7_3 += var9_9;
                            ** continue;
                            break;
                        }
                    }
                    if (var6_8 >= '\ud800' && var6_8 <= '\udfff') {
                        var2_6 = var3_7 < var4_2 ? var0.charAt(var3_7) : '\u0000';
                        if (var6_8 > '\udbff' || var2_6 < '\udc00' || var2_6 > '\udfff') ** continue;
                        var7_3 += 4L;
                        var1_4 += 2;
                        continue;
                    }
                    var9_9 = 3L;
                    ** continue;
                }
                return var5_1 == (int)var7_3;
            }
            var1_5 = var0.length();
            var0 = new StringBuilder("endIndex > string.length: ");
            var0.append(var4_2);
            var0.append(" > ");
            var0.append(var1_5);
            throw new IllegalArgumentException(var0.toString());
        }
        throw new IllegalArgumentException(a.ah(var4_2, "endIndex < beginIndex: ", " < 0"));
    }

    private static final String d(String string) {
        Object object = string;
        if (kkt.c(string)) {
            object = Locale.US;
            jse.d(object, "US");
            object = string.toLowerCase((Locale)object);
            jse.d(object, "toLowerCase(...)");
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean verify(String string, SSLSession object) {
        jse.e(string, "host");
        jse.e(object, "session");
        boolean bl2 = kkt.c(string);
        boolean bl3 = false;
        if (!bl2) {
            return bl3;
        }
        try {
            object = object.getPeerCertificates()[0];
            jse.c(object, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            bl2 = kkt.b(string, (X509Certificate)object);
            return bl2;
        }
        catch (SSLException sSLException) {
            return bl3;
        }
    }
}

