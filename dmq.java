/*
 * Decompiled with CFR 0.152.
 */
public final class dmq {
    public final String a;
    public final boolean b;
    public final kfl c;
    public final kdo d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final dkx h;
    public final int i;

    public dmq() {
        throw null;
    }

    public dmq(String string, boolean bl2, kfl kfl2, kdo kdo2, String string2, Long l2, boolean bl3, dkx dkx2, int n2) {
        this.a = string;
        this.b = bl2;
        this.c = kfl2;
        this.d = kdo2;
        this.e = string2;
        this.f = l2;
        this.g = bl3;
        this.h = dkx2;
        this.i = n2;
    }

    public static fhc a() {
        fhc fhc2 = new fhc();
        fhc2.g(false);
        fhc2.h(false);
        fhc2.f(0);
        return fhc2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dmq) {
            object = (dmq)object;
            Object object2 = this.a;
            if ((object2 == null ? ((dmq)object).a == null : ((String)object2).equals(((dmq)object).a)) && this.b == ((dmq)object).b && this.c.equals(((dmq)object).c) && ((object2 = this.d) == null ? ((dmq)object).d == null : ((hwv)object2).equals(((dmq)object).d)) && ((object2 = this.e) == null ? ((dmq)object).e == null : ((String)object2).equals(((dmq)object).e)) && ((object2 = this.f) == null ? ((dmq)object).f == null : ((Long)object2).equals(((dmq)object).f)) && this.g == ((dmq)object).g && ((object2 = this.h) == null ? ((dmq)object).h == null : object2.equals(((dmq)object).h)) && this.i == ((dmq)object).i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        int n4;
        Object object = this.a;
        int n5 = 0;
        int n6 = object == null ? 0 : ((String)object).hashCode();
        boolean bl2 = this.b;
        int n7 = 1237;
        int n8 = true != bl2 ? 1237 : 1231;
        object = this.c;
        if (((hwv)object).B()) {
            n4 = ((hwv)object).i();
        } else {
            n3 = n4 = ((hwv)object).memoizedHashCode;
            if (n4 == 0) {
                ((hwv)object).memoizedHashCode = n3 = ((hwv)object).i();
            }
            n4 = n3;
        }
        object = this.d;
        if (object == null) {
            n3 = 0;
        } else if (((hwv)object).B()) {
            n3 = ((hwv)object).i();
        } else {
            n3 = n2 = ((hwv)object).memoizedHashCode;
            if (n2 == 0) {
                ((hwv)object).memoizedHashCode = n3 = ((hwv)object).i();
            }
        }
        object = this.e;
        n2 = object == null ? 0 : ((String)object).hashCode();
        object = this.f;
        int n9 = object == null ? 0 : ((Long)object).hashCode();
        if (this.g) {
            n7 = 1231;
        }
        object = this.h;
        if (object != null) {
            n5 = object.hashCode();
        }
        return ((((((((n6 ^ 0xF4243) * 1000003 ^ n8) * 1000003 ^ n4) * 1000003 ^ n3) * 1000003 ^ n2) * 1000003 ^ n9) * 1000003 ^ n7) * 1000003 ^ n5) * 1000003 ^ this.i;
    }

    public final String toString() {
        Object object = this.h;
        Object object2 = this.d;
        String string = String.valueOf(this.c);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("Metric{customEventName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isEventNameConstant=");
        stringBuilder.append(this.b);
        stringBuilder.append(", metric=");
        stringBuilder.append(string);
        stringBuilder.append(", metricExtension=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", accountableComponentName=");
        stringBuilder.append(this.e);
        stringBuilder.append(", sampleRatePermille=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isUnsampled=");
        stringBuilder.append(this.g);
        stringBuilder.append(", debugLogsTime=");
        stringBuilder.append((String)object);
        stringBuilder.append(", debugLogsSize=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

