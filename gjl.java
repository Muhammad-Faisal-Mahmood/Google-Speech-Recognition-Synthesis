/*
 * Decompiled with CFR 0.152.
 */
public final class gjl {
    public final String a;
    public final Integer b;
    public final hrh c;

    public gjl() {
        throw null;
    }

    public gjl(String string, Integer n2, hrh hrh2) {
        this.a = string;
        this.b = n2;
        this.c = hrh2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gjl) {
            object = (gjl)object;
            Object object2 = this.a;
            if ((object2 == null ? ((gjl)object).a == null : ((String)object2).equals(((gjl)object).a)) && ((object2 = this.b) == null ? ((gjl)object).b == null : ((Integer)object2).equals(((gjl)object).b)) && this.c.equals(((gjl)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object == null ? 0 : ((String)object).hashCode();
        object = this.b;
        if (object != null) {
            n2 = ((Integer)object).hashCode();
        }
        return ((n3 ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ this.c.hashCode();
    }

    public final String toString() {
        String string = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder("GrpcClientConfig{host=");
        stringBuilder.append(this.a);
        stringBuilder.append(", port=");
        stringBuilder.append(this.b);
        stringBuilder.append(", rpcServiceConfig=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

