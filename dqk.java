/*
 * Decompiled with CFR 0.152.
 */
public final class dqk
implements dlv {
    public final int a;
    public final gto b;
    private final int c;

    public dqk() {
        throw null;
    }

    public dqk(int n2, int n3, gto gto2) {
        this.c = n2;
        this.a = n3;
        this.b = gto2;
    }

    public static final dqj c() {
        dqj dqj2 = new dqj(null);
        dqj2.a = 50;
        dqj2.c = (byte)3;
        dqj2.b = gsl.a;
        dqj2.d = 1;
        return dqj2;
    }

    @Override
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dqk) {
            object = (dqk)object;
            int n2 = this.c;
            int n3 = ((dqk)object).c;
            if (n2 != 0) {
                return n2 == n3 && this.a == ((dqk)object).a && this.b.equals(((dqk)object).b);
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.c;
        a.E(n2);
        return (((n2 ^ 0xF4243) * 1000003 ^ this.a) * -721379959 ^ 0x4D5) * 1000003 ^ 0x79A31AAC;
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("NetworkConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.c));
        stringBuilder.append(", batchSize=");
        stringBuilder.append(this.a);
        stringBuilder.append(", urlSanitizer=null, enableUrlAutoSanitization=false, metricExtensionProvider=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

