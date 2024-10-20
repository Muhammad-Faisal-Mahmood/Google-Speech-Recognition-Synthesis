/*
 * Decompiled with CFR 0.152.
 */
public final class dry
implements dlv {
    public final float a;
    private final int b;

    public dry() {
        throw null;
    }

    public dry(int n2, float f2) {
        this.b = n2;
        this.a = f2;
    }

    public static final drx c() {
        drx drx2 = new drx();
        drx2.a = 0.5f;
        drx2.b = 1;
        drx2.c = 1;
        return drx2;
    }

    @Override
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dry) {
            object = (dry)object;
            int n2 = this.b;
            int n3 = ((dry)object).b;
            if (n2 != 0) {
                if (n2 == n3) {
                    float f2 = this.a;
                    float f3 = ((dry)object).a;
                    if (Float.floatToIntBits(f2) == Float.floatToIntBits(f3)) {
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
        int n2 = this.b;
        a.E(n2);
        return (n2 ^ 0xF4243) * 1000003 ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TraceConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.b));
        stringBuilder.append(", samplingProbability=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

