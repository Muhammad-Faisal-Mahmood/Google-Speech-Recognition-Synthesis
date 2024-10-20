/*
 * Decompiled with CFR 0.152.
 */
public final class dnx
implements dlv {
    public final String a;
    private final int b;

    public dnx() {
        throw null;
    }

    public dnx(byte[] byArray) {
        this.b = 1;
        this.a = "";
    }

    @Override
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override
    public final boolean b() {
        return this.b == 1;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dnx) {
            object = (dnx)object;
            int n2 = this.b;
            int n3 = ((dnx)object).b;
            if (n2 != 0) {
                return n3 == 1 && this.a.equals(((dnx)object).a);
            }
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        a.E(this.b);
        return this.a.hashCode() ^ 0xD4F15B46;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ApplicationExitConfigurations{enablement=");
        stringBuilder.append(dlw.a(this.b));
        stringBuilder.append(", reportingProcessShortName=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

