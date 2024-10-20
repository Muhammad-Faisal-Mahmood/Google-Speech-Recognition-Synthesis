/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class kfy {
    public static final Comparator a;
    public static final Map b;
    public static final kfy c;
    public static final kfy d;
    public static final kfy e;
    public static final kfy f;
    public static final kfy g;
    public static final kfy h;
    public static final kfy i;
    public static final kfy j;
    public static final kfy k;
    public static final kfy l;
    public static final kfy m;
    public static final kfy n;
    public static final kfy o;
    public static final kfy p;
    public static final kfy q;
    public static final kfy r;
    public static final jsl t;
    public final String s;

    static {
        t = new jsl();
        a = new py(4);
        b = new LinkedHashMap();
        jsl.u("SSL_RSA_WITH_NULL_MD5");
        jsl.u("SSL_RSA_WITH_NULL_SHA");
        jsl.u("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        jsl.u("SSL_RSA_WITH_RC4_128_MD5");
        jsl.u("SSL_RSA_WITH_RC4_128_SHA");
        jsl.u("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        jsl.u("SSL_RSA_WITH_DES_CBC_SHA");
        c = jsl.u("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        jsl.u("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        jsl.u("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        jsl.u("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        jsl.u("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        jsl.u("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        jsl.u("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        jsl.u("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        jsl.u("SSL_DH_anon_WITH_RC4_128_MD5");
        jsl.u("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        jsl.u("SSL_DH_anon_WITH_DES_CBC_SHA");
        jsl.u("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        jsl.u("TLS_KRB5_WITH_DES_CBC_SHA");
        jsl.u("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        jsl.u("TLS_KRB5_WITH_RC4_128_SHA");
        jsl.u("TLS_KRB5_WITH_DES_CBC_MD5");
        jsl.u("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        jsl.u("TLS_KRB5_WITH_RC4_128_MD5");
        jsl.u("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        jsl.u("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        jsl.u("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        jsl.u("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        d = jsl.u("TLS_RSA_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        e = jsl.u("TLS_RSA_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_RSA_WITH_NULL_SHA256");
        jsl.u("TLS_RSA_WITH_AES_128_CBC_SHA256");
        jsl.u("TLS_RSA_WITH_AES_256_CBC_SHA256");
        jsl.u("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        jsl.u("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        jsl.u("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        jsl.u("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        jsl.u("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        jsl.u("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        jsl.u("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        jsl.u("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        jsl.u("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        jsl.u("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        jsl.u("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        jsl.u("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        jsl.u("TLS_PSK_WITH_RC4_128_SHA");
        jsl.u("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        jsl.u("TLS_PSK_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_PSK_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_RSA_WITH_SEED_CBC_SHA");
        f = jsl.u("TLS_RSA_WITH_AES_128_GCM_SHA256");
        g = jsl.u("TLS_RSA_WITH_AES_256_GCM_SHA384");
        jsl.u("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        jsl.u("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        jsl.u("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        jsl.u("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        jsl.u("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        jsl.u("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        jsl.u("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        jsl.u("TLS_FALLBACK_SCSV");
        jsl.u("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        jsl.u("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        jsl.u("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        jsl.u("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        jsl.u("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        jsl.u("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        jsl.u("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_ECDH_RSA_WITH_NULL_SHA");
        jsl.u("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        jsl.u("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        jsl.u("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_ECDHE_RSA_WITH_NULL_SHA");
        jsl.u("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        jsl.u("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        h = jsl.u("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        i = jsl.u("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_ECDH_anon_WITH_NULL_SHA");
        jsl.u("TLS_ECDH_anon_WITH_RC4_128_SHA");
        jsl.u("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        jsl.u("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        jsl.u("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        jsl.u("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        jsl.u("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        jsl.u("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        jsl.u("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        jsl.u("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        jsl.u("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        jsl.u("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        j = jsl.u("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        k = jsl.u("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        jsl.u("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        jsl.u("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        l = jsl.u("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        m = jsl.u("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        jsl.u("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        jsl.u("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        jsl.u("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        jsl.u("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        n = jsl.u("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        o = jsl.u("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        jsl.u("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        jsl.u("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        p = jsl.u("TLS_AES_128_GCM_SHA256");
        q = jsl.u("TLS_AES_256_GCM_SHA384");
        r = jsl.u("TLS_CHACHA20_POLY1305_SHA256");
        jsl.u("TLS_AES_128_CCM_SHA256");
        jsl.u("TLS_AES_128_CCM_8_SHA256");
    }

    public kfy(String string) {
        this.s = string;
    }

    public final String toString() {
        return this.s;
    }
}

