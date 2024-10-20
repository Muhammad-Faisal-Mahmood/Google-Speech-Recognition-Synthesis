/*
 * Decompiled with CFR 0.152.
 */
final class dbh {
    public final String a;
    public final String b;

    public dbh() {
        throw null;
    }

    public dbh(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof dbh)) break block4;
                    object2 = (dbh)object;
                    object = this.a;
                    if (!(object == null ? ((dbh)object2).a == null : ((String)object).equals(((dbh)object2).a))) break block4;
                    object = this.b;
                    object2 = ((dbh)object2).b;
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
        String string = this.a;
        int n2 = 0;
        int n3 = string == null ? 0 : string.hashCode();
        string = this.b;
        if (string != null) {
            n2 = string.hashCode();
        }
        return (n3 ^ 0xF4243) * 1000003 ^ n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseValues{baseDownloadUrl=");
        stringBuilder.append(this.a);
        stringBuilder.append(", downloadPackingScheme=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

