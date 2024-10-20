/*
 * Decompiled with CFR 0.152.
 */
public final class dyb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public dyb() {
        throw null;
    }

    public dyb(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.a = bl2;
        this.b = bl3;
        this.c = bl4;
        this.d = bl5;
    }

    public static dya a() {
        dya dya2 = new dya();
        dya2.e(false);
        dya2.d(false);
        dya2.b(false);
        dya2.c(false);
        dya2.a = (byte)(dya2.a | 0x24);
        return dya2;
    }

    public static dyb b() {
        return dyb.a().a();
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dyb) {
            object = (dyb)object;
            if (this.a == ((dyb)object).a && this.b == ((dyb)object).b && this.c == ((dyb)object).c && this.d == ((dyb)object).d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean bl2 = this.a;
        int n2 = 1231;
        int n3 = true != bl2 ? 1237 : 1231;
        int n4 = true != this.b ? 1237 : 1231;
        int n5 = true != this.c ? 1237 : 1231;
        if (!this.d) {
            n2 = 1237;
        }
        return (((((n3 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ 0x4D5) * 1000003 ^ n5) * 1000003 ^ n2) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExperimentConfiguration{tiktokIntegrationEnabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", throwExceptionForEventsLoggedInFuture=");
        stringBuilder.append(this.b);
        stringBuilder.append(", throwExceptionForEventsLoggedInFutureInCollector=false, enableIndividualFlowEventsSending=");
        stringBuilder.append(this.c);
        stringBuilder.append(", loggerIdMatchingEnabled=");
        stringBuilder.append(this.d);
        stringBuilder.append(", throwExceptionForLoggerIdMismatch=false}");
        return stringBuilder.toString();
    }
}

