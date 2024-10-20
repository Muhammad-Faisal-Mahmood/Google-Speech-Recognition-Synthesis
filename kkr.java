/*
 * Decompiled with CFR 0.152.
 */
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class kkr
implements kku {
    private final Map a;

    public kkr(X509Certificate ... x509CertificateArray) {
        jse.e(x509CertificateArray, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArray) {
            Object v2;
            X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
            Object object = v2 = linkedHashMap.get(x500Principal);
            if (v2 == null) {
                object = new LinkedHashSet();
                linkedHashMap.put(x500Principal, object);
            }
            ((Set)object).add(x509Certificate);
        }
        this.a = linkedHashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final X509Certificate a(X509Certificate x509Certificate) {
        jse.e(x509Certificate, "cert");
        Set<Object> set = (Set)this.a.get(x509Certificate.getIssuerX500Principal());
        Object var3_4 = null;
        if (set == null) {
            return null;
        }
        Iterator iterator = set.iterator();
        while (true) {
            set = var3_4;
            if (!iterator.hasNext()) return (X509Certificate)((Object)set);
            set = iterator.next();
            X509Certificate x509Certificate2 = (X509Certificate)((Object)set);
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
            }
            catch (Exception exception) {
                continue;
            }
            return (X509Certificate)((Object)set);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (object == this) return bl3;
        if (!(object instanceof kkr)) return false;
        if (!jse.i(((kkr)object).a, this.a)) return false;
        return bl2;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }
}

