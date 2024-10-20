/*
 * Decompiled with CFR 0.152.
 */
public final class dqs
implements dlv {
    public final gto a;
    public final gto b;
    private final int c;

    public dqs() {
        throw null;
    }

    public dqs(gto gto2, gto gto3) {
        this.c = 1;
        this.a = gto2;
        this.b = gto3;
    }

    @Override
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final boolean b() {
        return this.c == 1;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dqs) {
            object = (dqs)object;
            int n2 = this.c;
            int n3 = ((dqs)object).c;
            if (n2 != 0) {
                return n3 == 1 && this.a.equals(((dqs)object).a) && this.b.equals(((dqs)object).b);
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        a.E(this.c);
        return 395873938;
    }

    public final String toString() {
        Object object = this.b;
        String string = String.valueOf(this.a);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("StartupConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.c));
        stringBuilder.append(", metricExtensionProvider=");
        stringBuilder.append(string);
        stringBuilder.append(", customTimestampProvider=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

