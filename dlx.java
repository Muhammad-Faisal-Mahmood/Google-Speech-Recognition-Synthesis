/*
 * Decompiled with CFR 0.152.
 */
public final class dlx
implements dlv {
    private final int a;
    private final dly b;

    public dlx() {
        throw null;
    }

    public dlx(int n2, dly dly2) {
        this.a = n2;
        this.b = dly2;
    }

    public static final dre c() {
        dre dre2 = new dre(null);
        dre2.c = new dly(null);
        dre2.b = 1;
        dre2.a = 1;
        return dre2;
    }

    @Override
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final boolean b() {
        return this.a == 3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dlx) {
            object = (dlx)object;
            int n2 = this.a;
            int n3 = ((dlx)object).a;
            if (n2 != 0) {
                return n2 == n3 && this.b.equals(((dlx)object).b);
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a;
        a.E(n2);
        return ((n2 ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("BatteryConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.a));
        stringBuilder.append(", chargeCounterEnabled=false, metricExtensionProvider=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

