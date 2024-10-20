/*
 * Decompiled with CFR 0.152.
 */
public final class drm
implements dlv {
    public final float a;
    public final gto b;
    private final int c;
    private final int d;

    public drm() {
        throw null;
    }

    public drm(int n2, int n3, float f2, gto gto2) {
        this.d = n2;
        this.c = n3;
        this.a = f2;
        this.b = gto2;
    }

    public static final drl c() {
        drl drl2 = new drl(null);
        drl2.a = 10;
        drl2.b = 1.0f;
        drl2.d = (byte)3;
        drl2.c = gsl.a;
        drl2.e = 1;
        return drl2;
    }

    @Override
    public final int a() {
        return this.c;
    }

    @Override
    public final boolean b() {
        return this.d == 3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof drm) {
            object = (drm)object;
            int n2 = this.d;
            int n3 = ((drm)object).d;
            if (n2 != 0) {
                if (n2 == n3 && this.c == ((drm)object).c) {
                    float f2 = this.a;
                    float f3 = ((drm)object).a;
                    if (Float.floatToIntBits(f2) == Float.floatToIntBits(f3) && this.b.equals(((drm)object).b)) {
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
        int n2 = this.d;
        a.E(n2);
        float f2 = this.a;
        return (((n2 ^ 0xF4243) * 1000003 ^ this.c) * 1000003 ^ Float.floatToIntBits(f2)) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("TimerConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.d));
        stringBuilder.append(", rateLimitPerSecond=");
        stringBuilder.append(this.c);
        stringBuilder.append(", samplingProbability=");
        stringBuilder.append(this.a);
        stringBuilder.append(", perEventConfigurationFlags=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

