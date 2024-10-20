/*
 * Decompiled with CFR 0.152.
 */
public final class dei {
    public final String a;

    public dei() {
        throw null;
    }

    public dei(String string) {
        this.a = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2;
        if (object == this) {
            return true;
        }
        boolean bl3 = object instanceof dei;
        boolean bl4 = bl2 = false;
        if (!bl3) return bl4;
        Object object2 = (dei)object;
        object = this.a;
        object2 = ((dei)object2).a;
        if (object != null) return ((String)object).equals(object2);
        if (object2 == null) return true;
        return bl2;
    }

    public final int hashCode() {
        String string = this.a;
        int n2 = string == null ? 0 : string.hashCode();
        return n2 ^ 0xF4243;
    }

    public final String toString() {
        String string;
        String string2 = string = this.a;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }
}

