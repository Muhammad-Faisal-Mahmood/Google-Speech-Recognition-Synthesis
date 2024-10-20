/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.stream.Collectors;
import java.io.Serializable;
import java.util.Collection;
import java.util.Locale;

public final class ezj {
    public final Locale a;
    public final int b;
    public final hav c;
    public final hac d;
    public final long e;
    public final gto f;
    public final gto g;
    public final int h;

    public ezj() {
        throw null;
    }

    public ezj(Locale locale, int n2, int n3, hav hav2, hac hac2, long l2, gto gto2, gto gto3) {
        if (locale != null) {
            this.a = locale;
            this.b = n2;
            this.h = n3;
            if (hav2 != null) {
                this.c = hav2;
                if (hac2 != null) {
                    this.d = hac2;
                    this.e = l2;
                    if (gto2 != null) {
                        this.f = gto2;
                        if (gto3 != null) {
                            this.g = gto3;
                            return;
                        }
                        throw new NullPointerException("Null readOnlyParams");
                    }
                    throw new NullPointerException("Null zipfileParams");
                }
                throw new NullPointerException("Null featuresForDomains");
            }
            throw new NullPointerException("Null applicationDomains");
        }
        throw new NullPointerException("Null locale");
    }

    public static final String a(Collection collection) {
        return Collection$_EL.stream(collection).map(new bpf(17)).collect(Collectors.joining(", "));
    }

    public static ezj e(String object, int n2, hav hav2, hac hac2, long l2) {
        object = Locale.forLanguageTag((String)object);
        gsl gsl2 = gsl.a;
        return new ezj((Locale)object, n2, 2, hav2, hac2, l2, gsl2, gsl2);
    }

    public final String b() {
        return String.format(Locale.US, "%s_v%d", this.a.toLanguageTag(), this.b);
    }

    public final boolean c() {
        return this.h == 2;
    }

    public final boolean d(ezj ezj2) {
        return this.a.equals(ezj2.a) && this.b == ezj2.b;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ezj) {
            object = (ezj)object;
            if (this.a.equals(((ezj)object).a) && this.b == ((ezj)object).b && this.h == ((ezj)object).h && this.c.equals(((ezj)object).c) && this.d.equals(((ezj)object).d) && this.e == ((ezj)object).e && this.f.equals(((ezj)object).f) && this.g.equals(((ezj)object).g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.h;
        a.E(n3);
        Serializable serializable = this.c;
        int n4 = this.b;
        int n5 = ((hav)serializable).hashCode();
        int n6 = this.d.hashCode();
        long l2 = this.e;
        serializable = this.f;
        return (((((((n2 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n3) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ (int)(l2 ^ l2 >>> 32)) * 1000003 ^ ((gto)serializable).hashCode()) * 1000003 ^ this.g.hashCode();
    }

    public final String toString() {
        int n2 = this.h;
        String string = ((Object)this.a).toString();
        String string2 = n2 != 1 ? (n2 != 2 ? "SYSTEM_PARTITION" : "ZIPFILE_DOWNLOAD") : "UNKNOWN";
        n2 = this.b;
        Object object = this.c;
        Object object2 = this.d;
        long l2 = this.e;
        Object object3 = this.f;
        Object object4 = this.g;
        object = object.toString();
        object2 = object2.toString();
        object3 = String.valueOf(object3);
        object4 = String.valueOf(object4);
        StringBuilder stringBuilder = new StringBuilder("LanguagePackDescriptor{locale=");
        stringBuilder.append(string);
        stringBuilder.append(", version=");
        stringBuilder.append(n2);
        stringBuilder.append(", installType=");
        stringBuilder.append(string2);
        stringBuilder.append(", applicationDomains=");
        stringBuilder.append((String)object);
        stringBuilder.append(", featuresForDomains=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", sizeBytes=");
        stringBuilder.append(l2);
        stringBuilder.append(", zipfileParams=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", readOnlyParams=");
        stringBuilder.append((String)object4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

