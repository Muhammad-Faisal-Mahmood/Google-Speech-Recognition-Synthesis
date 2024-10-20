/*
 * Decompiled with CFR 0.152.
 */
public final class gck {
    public final String a;
    public final int b;

    public gck() {
        throw null;
    }

    public gck(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gck) {
            object = (gck)object;
            if (this.a.equals(((gck)object).a) && this.b == ((gck)object).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b;
        a.E(n3);
        return (n2 ^ 0xF4243) * 1000003 ^ n3;
    }

    public final String toString() {
        int n2 = this.b;
        String string = n2 != 1 ? (n2 != 2 ? "UPDATE" : "KEEP") : "REPLACE";
        String string2 = this.a;
        StringBuilder stringBuilder = new StringBuilder("UniqueWorkSpec{uniquenessKey=");
        stringBuilder.append(string2);
        stringBuilder.append(", existingWorkPolicy=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

