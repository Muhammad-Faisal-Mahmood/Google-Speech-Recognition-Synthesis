/*
 * Decompiled with CFR 0.152.
 */
final class hsp {
    private final String a;
    private final hrl b;
    private final String c;

    public hsp() {
        throw null;
    }

    public hsp(String string, hrl hrl2, String string2) {
        if (string != null) {
            this.a = string;
            this.b = hrl2;
            this.c = string2;
            return;
        }
        throw new NullPointerException("Null endpoint");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hsp) {
            hrl hrl2;
            object = (hsp)object;
            if (this.a.equals(((hsp)object).a) && ((hrl2 = this.b) == null ? ((hsp)object).b == null : hrl2.equals(((hsp)object).b)) && this.c.equals(((hsp)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        hrl hrl2 = this.b;
        int n3 = hrl2 == null ? 0 : hrl2.hashCode();
        return ((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ this.c.hashCode();
    }

    public final String toString() {
        String string = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("InterceptorId{endpoint=");
        stringBuilder.append(this.a);
        stringBuilder.append(", authContext=");
        stringBuilder.append(string);
        stringBuilder.append(", methodName=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

