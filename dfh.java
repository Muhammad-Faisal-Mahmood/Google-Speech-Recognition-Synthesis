/*
 * Decompiled with CFR 0.152.
 */
public final class dfh {
    public final ddn a;
    public final String b;

    public dfh() {
        throw null;
    }

    public dfh(ddn ddn2, String string) {
        if (ddn2 != null) {
            this.a = ddn2;
            this.b = string;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof dfh)) break block4;
                    object2 = (dfh)object;
                    if (!this.a.equals(((dfh)object2).a)) break block4;
                    object = this.b;
                    object2 = ((dfh)object2).b;
                    if (object != null) break block5;
                    if (object2 != null) break block4;
                    break block6;
                }
                if (!((String)object).equals(object2)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        String string = this.b;
        int n3 = string == null ? 0 : string.hashCode();
        return (n2 ^ 0xF4243) * 1000003 ^ n3;
    }

    public final String toString() {
        gtn gtn2 = new gtn("");
        gtn2.d();
        gtn2.b("name", this.a);
        gtn2.b("scheme", this.b);
        return gtn2.toString();
    }
}

