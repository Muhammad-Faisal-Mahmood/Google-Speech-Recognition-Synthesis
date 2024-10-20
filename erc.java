/*
 * Decompiled with CFR 0.152.
 */
public final class erc
implements ere {
    private final String a;

    public erc() {
        this((char[])null);
    }

    public erc(byte[] byArray) {
        this.a = "";
    }

    public /* synthetic */ erc(char[] cArray) {
        this((byte[])null);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof erc)) {
            return false;
        }
        object = (erc)object;
        return jse.i(this.a, ((erc)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Occupied(appOwner=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

