/*
 * Decompiled with CFR 0.152.
 */
public final class dpe
implements dlv {
    private final int a;
    private final int b;

    public dpe() {
        throw null;
    }

    public dpe(byte[] byArray) {
        this.b = 2;
        this.a = 10;
    }

    @Override
    public final int a() {
        return this.a;
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dpe) {
            object = (dpe)object;
            int n2 = this.b;
            int n3 = ((dpe)object).b;
            if (n2 != 0) {
                return n2 == n3 && this.a == ((dpe)object).a;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.b;
        a.E(n2);
        return ((n2 ^ 0xF4243) * 1000003 ^ this.a) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("JankConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.b));
        stringBuilder.append(", rateLimitPerSecond=");
        stringBuilder.append(this.a);
        stringBuilder.append(", perfettoMustBeExplicitlyTriggered=false}");
        return stringBuilder.toString();
    }
}

