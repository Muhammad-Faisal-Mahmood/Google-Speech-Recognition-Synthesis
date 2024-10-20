/*
 * Decompiled with CFR 0.152.
 */
public final class dys {
    public final gzx a;
    public final int b;

    public dys() {
        throw null;
    }

    public dys(gzx gzx2, int n2) {
        this.a = gzx2;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dys) {
            object = (dys)object;
            if (fvd.z(this.a, ((dys)object).a)) {
                int n2 = this.b;
                int n3 = ((dys)object).b;
                if (n2 != 0) {
                    if (n2 == n3) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b;
        a.L(n3);
        return (n2 ^ 0xF4243) * 1000003 ^ n3;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        int n2 = this.b;
        String string2 = n2 != 0 ? Integer.toString(a.x(n2)) : "null";
        return a.aq(string2, string, "FlowRecordsData{records=", ", status=", "}");
    }
}

