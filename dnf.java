/*
 * Decompiled with CFR 0.152.
 */
public final class dnf
implements dlv {
    public final float a;
    public final int b;
    public final gto c;
    private final int d;

    public dnf() {
        throw null;
    }

    public dnf(int n2, float f2, int n3, gto gto2) {
        this.d = n2;
        this.a = f2;
        this.b = n3;
        this.c = gto2;
    }

    public static final drl c() {
        drl drl2 = new drl(null);
        drl2.b = 100.0f;
        drl2.a = 1;
        drl2.e = 100;
        drl2.d = (byte)3;
        return drl2;
    }

    @Override
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final boolean b() {
        int n2 = this.d;
        return n2 == 3 || n2 == 1;
        {
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dnf) {
            object = (dnf)object;
            int n2 = this.d;
            int n3 = ((dnf)object).d;
            if (n2 != 0) {
                if (n2 == n3) {
                    float f2 = this.a;
                    float f3 = ((dnf)object).a;
                    if (Float.floatToIntBits(f2) == Float.floatToIntBits(f3) && this.b == ((dnf)object).b && this.c.equals(((dnf)object).c)) {
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
        return (((n2 ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.a)) * 1000003 ^ this.b) * -721379959 ^ 0x79A31AAC;
    }

    public final String toString() {
        String string = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder("CrashConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.d));
        stringBuilder.append(", startupSamplePercentage=");
        stringBuilder.append(this.a);
        stringBuilder.append(", debugLogsSize=");
        stringBuilder.append(this.b);
        stringBuilder.append(", metricExtensionProvider=null, crashLoopListener=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

