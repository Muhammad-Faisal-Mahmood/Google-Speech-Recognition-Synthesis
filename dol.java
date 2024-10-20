/*
 * Decompiled with CFR 0.152.
 */
public final class dol
implements dlv {
    private final int a;

    public dol() {
        throw null;
    }

    public dol(byte[] byArray) {
        this.a = 2;
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
        if (object instanceof dol) {
            object = (dol)object;
            int n2 = this.a;
            int n3 = ((dol)object).a;
            if (n2 != 0) {
                return n2 == n3;
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a;
        a.E(n2);
        return n2 ^ 0xD5009D89;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CuiConfigurations{metricExtensionProvider=null, enablement=");
        stringBuilder.append(dlw.a(this.a));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

