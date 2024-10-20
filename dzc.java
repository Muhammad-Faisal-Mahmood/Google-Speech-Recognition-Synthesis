/*
 * Decompiled with CFR 0.152.
 */
public final class dzc {
    public final kcw a;
    public final hav b;
    public final dyg c;
    public final boolean d;
    public final gzx e;

    public dzc() {
        throw null;
    }

    public dzc(kcw kcw2, hav hav2, dyg dyg2, boolean bl2, gzx gzx2) {
        this.a = kcw2;
        this.b = hav2;
        this.c = dyg2;
        this.d = bl2;
        this.e = gzx2;
    }

    public static dzb a() {
        dzb dzb2 = new dzb();
        int n2 = gzx.d;
        dzb2.d(hct.a);
        dzb2.e(false);
        dzb2.f(hdc.a);
        return dzb2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dzc) {
            object = (dzc)object;
            if (this.a.equals(((dzc)object).a) && this.b.equals(((dzc)object).b) && this.c.equals(((dzc)object).c) && this.d == ((dzc)object).d && fvd.z(this.e, ((dzc)object).e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        kcw kcw2 = this.a;
        if (kcw2.B()) {
            n3 = kcw2.i();
        } else {
            n3 = n2 = kcw2.memoizedHashCode;
            if (n2 == 0) {
                kcw2.memoizedHashCode = n3 = kcw2.i();
            }
        }
        int n4 = this.b.hashCode();
        int n5 = this.c.hashCode();
        n2 = true != this.d ? 1237 : 1231;
        return ((((n3 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n2) * 1000003 ^ this.e.hashCode();
    }

    public final String toString() {
        Object object = this.e;
        Object object2 = this.c;
        Object object3 = this.b;
        String string = String.valueOf(this.a);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("AppFlowLoggingData{appFlow=");
        stringBuilder.append(string);
        stringBuilder.append(", testCodes=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", appFlowType=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", sampledOut=");
        stringBuilder.append(this.d);
        stringBuilder.append(", globalMetadata=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

