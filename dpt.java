/*
 * Decompiled with CFR 0.152.
 */
public final class dpt
implements dlv {
    public final gto a;
    public final boolean b;
    private final int c;
    private final int d;

    public dpt() {
        throw null;
    }

    public dpt(int n2, int n3, gto gto2, boolean bl2) {
        this.d = n2;
        this.c = n3;
        this.a = gto2;
        this.b = bl2;
    }

    public static dps c() {
        dps dps2 = new dps(null);
        dps2.a = 3;
        dps2.e = gsl.a;
        dps2.b = true;
        dps2.d = 1;
        dps2.c = (byte)127;
        return dps2;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final boolean b() {
        return this.d != 2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dpt) {
            object = (dpt)object;
            int n2 = this.d;
            int n3 = ((dpt)object).d;
            if (n2 != 0) {
                return n2 == n3 && this.c == ((dpt)object).c && this.a.equals(((dpt)object).a) && this.b == ((dpt)object).b;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.d;
        a.E(n2);
        int n3 = true != this.b ? 1237 : 1231;
        return ((((((((n2 ^ 0xF4243) * 1000003 ^ this.c) * 1000003 ^ 0x4D5) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5) * 1000003 ^ n3) * 1000003 ^ 0x4D5) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("MemoryConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.d));
        stringBuilder.append(", rateLimitPerSecond=");
        stringBuilder.append(this.c);
        stringBuilder.append(", recordMetricPerProcess=false, metricExtensionProvider=");
        stringBuilder.append(string);
        stringBuilder.append(", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=");
        stringBuilder.append(this.b);
        stringBuilder.append(", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}");
        return stringBuilder.toString();
    }
}

