/*
 * Decompiled with CFR 0.152.
 */
public final class drf
implements dlv {
    public final gto a;
    private final int b;

    public drf() {
        throw null;
    }

    public drf(int n2, gto gto2) {
        this.b = n2;
        this.a = gto2;
    }

    public static final dre c() {
        dre dre2 = new dre(null);
        dre2.a = 1;
        dre2.c = gsl.a;
        dre2.b = 1;
        return dre2;
    }

    @Override
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final boolean b() {
        int n2 = this.b;
        return n2 == 3 || n2 == 1;
        {
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof drf) {
            object = (drf)object;
            int n2 = this.b;
            int n3 = ((drf)object).b;
            if (n2 != 0) {
                return n2 == n3 && this.a.equals(((drf)object).a);
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.b;
        a.E(n2);
        return ((n2 ^ 0xF4243) * 1000003 ^ 0x4D5) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("StorageConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.b));
        stringBuilder.append(", manualCapture=false, dirStatsConfigurations=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

