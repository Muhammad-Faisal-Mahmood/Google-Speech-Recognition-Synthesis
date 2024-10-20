/*
 * Decompiled with CFR 0.152.
 */
public final class cuu {
    public final String a;
    private final gto b;
    private final gto c;

    public cuu() {
        throw null;
    }

    public cuu(String string, gto gto2, gto gto3) {
        this.a = string;
        this.b = gto2;
        this.c = gto3;
    }

    public static cut a() {
        cut cut2 = new cut(null);
        cut2.a = 1;
        return cut2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cuu) {
            object = (cuu)object;
            if (this.a.equals(((cuu)object).a) && this.b.equals(((cuu)object).b) && this.c.equals(((cuu)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x79A31AAC) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        Object object = this.c;
        String string = String.valueOf(this.b);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("RemoveFileGroupRequest{groupName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", accountOptional=");
        stringBuilder.append(string);
        stringBuilder.append(", variantIdOptional=");
        stringBuilder.append((String)object);
        stringBuilder.append(", pendingOnly=false}");
        return stringBuilder.toString();
    }
}

