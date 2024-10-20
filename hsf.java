/*
 * Decompiled with CFR 0.152.
 */
public final class hsf {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final String g;
    public final int h;

    public hsf() {
        throw null;
    }

    public hsf(String string, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n2, String string2, int n3) {
        this.a = string;
        this.b = bl2;
        this.c = bl3;
        this.d = bl4;
        this.e = bl5;
        this.f = n2;
        this.g = string2;
        this.h = n3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hsf) {
            object = (hsf)object;
            String string = this.a;
            if ((string == null ? ((hsf)object).a == null : string.equals(((hsf)object).a)) && this.b == ((hsf)object).b && this.c == ((hsf)object).c && this.d == ((hsf)object).d && this.e == ((hsf)object).e && this.f == ((hsf)object).f && ((string = this.g) == null ? ((hsf)object).g == null : string.equals(((hsf)object).g)) && this.h == ((hsf)object).h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.a;
        int n2 = 0;
        int n3 = string == null ? 0 : string.hashCode();
        boolean bl2 = this.b;
        int n4 = 1231;
        int n5 = true != bl2 ? 1237 : 1231;
        int n6 = true != this.c ? 1237 : 1231;
        int n7 = true != this.d ? 1237 : 1231;
        if (!this.e) {
            n4 = 1237;
        }
        int n8 = this.f;
        string = this.g;
        if (string != null) {
            n2 = string.hashCode();
        }
        return ((((((((n3 ^ 0xD5009D89) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ 0x4D5) * 1000003 ^ n4) * 1000003 ^ n8) * 583896283 ^ n2) * -721379959 ^ this.h;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CronetConfig{context=null, storagePath=");
        stringBuilder.append(this.a);
        stringBuilder.append(", enableQuic=");
        stringBuilder.append(this.b);
        stringBuilder.append(", enableBrotli=");
        stringBuilder.append(this.c);
        stringBuilder.append(", enableCertificateCache=");
        stringBuilder.append(this.d);
        stringBuilder.append(", enableHttpCache=false, enableNetworkQualityEstimator=");
        stringBuilder.append(this.e);
        stringBuilder.append(", diskCacheSizeBytes=");
        stringBuilder.append(this.f);
        stringBuilder.append(", inMemoryFallbackCacheSizeBytes=0, libraryLoader=null, experimentalOptions=");
        stringBuilder.append(this.g);
        stringBuilder.append(", cronetEngineBuilderFactory=null, threadPriority=");
        stringBuilder.append(this.h);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

