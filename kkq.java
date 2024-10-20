/*
 * Decompiled with CFR 0.152.
 */
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class kkq
extends kks {
    private final kku a;

    public kkq(kku kku2) {
        this.a = kku2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        boolean bl2 = jse.i(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN());
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        }
        catch (GeneralSecurityException generalSecurityException) {
            return bl3;
        }
    }

    @Override
    public final List a(List arrayList, String object) {
        jse.e(arrayList, "chain");
        object = new ArrayDeque(arrayList);
        arrayList = new ArrayList<Object>();
        Object object2 = object.removeFirst();
        jse.d(object2, "removeFirst(...)");
        arrayList.add(object2);
        boolean bl2 = false;
        block0: for (int i2 = 0; i2 < 9; ++i2) {
            block10: {
                block9: {
                    Object object3;
                    block8: {
                        object2 = arrayList.get(arrayList.size() - 1);
                        jse.c(object2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        object2 = (X509Certificate)object2;
                        object3 = this.a.a((X509Certificate)object2);
                        if (object3 == null) break block8;
                        if (arrayList.size() > 1 || !jse.i(object2, object3)) {
                            arrayList.add(object3);
                        }
                        if (!kkq.b((X509Certificate)object3, (X509Certificate)object3)) {
                            bl2 = true;
                            continue;
                        }
                        break block9;
                    }
                    object3 = object.iterator();
                    jse.d(object3, "iterator(...)");
                    while (object3.hasNext()) {
                        Object object4 = object3.next();
                        jse.c(object4, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        if (!kkq.b(object2, object4 = (X509Certificate)object4)) continue;
                        object3.remove();
                        arrayList.add(object4);
                        continue block0;
                    }
                    if (!bl2) break block10;
                }
                return arrayList;
            }
            Objects.toString(object2);
            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(object2)));
        }
        ((Object)arrayList).toString();
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(((Object)arrayList).toString()));
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (object != this) {
            if (object instanceof kkq && jse.i(((kkq)object).a, this.a)) {
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

