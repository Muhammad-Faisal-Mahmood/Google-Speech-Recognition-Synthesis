/*
 * Decompiled with CFR 0.152.
 */
public final class dnb
implements dlv {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public dnb() {
        throw null;
    }

    public dnb(byte[] byArray) {
        this.f = 1;
        this.a = 0x200000;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0;
    }

    @Override
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dnb) {
            object = (dnb)object;
            int n2 = this.f;
            int n3 = ((dnb)object).f;
            if (n2 != 0) {
                if (n3 == 1 && this.a == ((dnb)object).a && this.b == ((dnb)object).b && this.c == ((dnb)object).c && this.d == ((dnb)object).d) {
                    double d2 = this.e;
                    double d3 = ((dnb)object).e;
                    if (Double.doubleToLongBits(d2) == Double.doubleToLongBits(d3)) {
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        a.E(this.f);
        long l2 = Double.doubleToLongBits(this.e);
        long l3 = Double.doubleToLongBits(this.e);
        int n2 = this.a;
        int n3 = this.b;
        int n4 = this.c;
        int n5 = this.d;
        return (int)(l2 >>> 32 ^ l3) ^ ((((n2 ^ 0xD4F15B46) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CpuProfilingConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.f));
        stringBuilder.append(", maxBufferSizeBytes=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sampleDurationMs=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sampleDurationSkewMs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sampleFrequencyMicro=");
        stringBuilder.append(this.d);
        stringBuilder.append(", samplesPerEpoch=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

