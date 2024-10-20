/*
 * Decompiled with CFR 0.152.
 */
public final class htx {
    public final iws a;
    public final iup b;
    public final iup c;
    public final iup d;

    public htx(iws iws2, iup iup2, iup iup3, iup iup4) {
        this.a = iws2;
        this.b = iup2;
        this.c = iup3;
        this.d = iup4;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof htx)) {
            return false;
        }
        object = (htx)object;
        if (!jse.i(this.a, ((htx)object).a)) {
            return false;
        }
        if (!jse.i(this.b, ((htx)object).b)) {
            return false;
        }
        if (!jse.i(this.c, ((htx)object).c)) {
            return false;
        }
        return jse.i(this.d, ((htx)object).d);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParcelableOverMetadataKeys(metadataKey=");
        stringBuilder.append(this.a);
        stringBuilder.append(", requestKey=");
        stringBuilder.append(this.b);
        stringBuilder.append(", responseHeaderKey=");
        stringBuilder.append(this.c);
        stringBuilder.append(", responseTrailerKey=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

