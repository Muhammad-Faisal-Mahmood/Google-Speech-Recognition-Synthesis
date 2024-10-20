/*
 * Decompiled with CFR 0.152.
 */
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public final class kgj {
    public final kgz a;
    public final kfy b;
    public final List c;
    private final jny d;

    public kgj(kgz kgz2, kfy kfy2, List list, jqz jqz2) {
        jse.e((Object)kgz2, "tlsVersion");
        jse.e(list, "localCertificates");
        this.a = kgz2;
        this.b = kfy2;
        this.c = list;
        this.d = new jog(new kgi(jqz2));
    }

    private static final String b(Certificate object) {
        if (object instanceof X509Certificate) {
            object = ((Object)((X509Certificate)object).getSubjectDN()).toString();
        } else {
            object = ((Certificate)object).getType();
            jse.d(object, "getType(...)");
        }
        return object;
    }

    public final List a() {
        return (List)this.d.a();
    }

    public final boolean equals(Object object) {
        if (object instanceof kgj) {
            object = (kgj)object;
            if (((kgj)object).a == this.a && jse.i(((kgj)object).b, this.b) && jse.i(((kgj)object).a(), this.a()) && jse.i(((kgj)object).c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() + 527) * 31 + this.b.hashCode()) * 31 + ((Object)this.a()).hashCode()) * 31 + ((Object)this.c).hashCode();
    }

    public final String toString() {
        Object object = this.a();
        Object object2 = new ArrayList<String>(jns.B((Iterable)object));
        object = object.iterator();
        while (object.hasNext()) {
            object2.add(kgj.b((Certificate)object.next()));
        }
        String string = object2.toString();
        object = this.a;
        object2 = this.b;
        Object object3 = this.c;
        ArrayList<String> arrayList = new ArrayList<String>(jns.B((Iterable)object3));
        object3 = object3.iterator();
        while (object3.hasNext()) {
            arrayList.add(kgj.b((Certificate)object3.next()));
        }
        object3 = new StringBuilder("Handshake{tlsVersion=");
        ((StringBuilder)object3).append(object);
        ((StringBuilder)object3).append(" cipherSuite=");
        ((StringBuilder)object3).append(object2);
        ((StringBuilder)object3).append(" peerCertificates=");
        ((StringBuilder)object3).append(string);
        ((StringBuilder)object3).append(" localCertificates=");
        ((StringBuilder)object3).append(arrayList);
        ((StringBuilder)object3).append("}");
        return ((StringBuilder)object3).toString();
    }
}

