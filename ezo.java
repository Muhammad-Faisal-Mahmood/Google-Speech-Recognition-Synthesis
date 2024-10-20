/*
 * Decompiled with CFR 0.152.
 */
public final class ezo {
    public final gzx a;
    public final gzx b;
    public final gzx c;

    public ezo() {
        throw null;
    }

    public ezo(gzx gzx2, gzx gzx3, gzx gzx4) {
        if (gzx2 != null) {
            this.a = gzx2;
            if (gzx3 != null) {
                this.b = gzx3;
                if (gzx4 != null) {
                    this.c = gzx4;
                    return;
                }
                throw new NullPointerException("Null installed");
            }
            throw new NullPointerException("Null pending");
        }
        throw new NullPointerException("Null downloadable");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ezo) {
            object = (ezo)object;
            if (fvd.z(this.a, ((ezo)object).a) && fvd.z(this.b, ((ezo)object).b) && fvd.z(this.c, ((ezo)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public final String toString() {
        Object object = this.c;
        Object object2 = this.b;
        String string = ((Object)this.a).toString();
        object2 = object2.toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("AllLanguagePacks{downloadable=");
        stringBuilder.append(string);
        stringBuilder.append(", pending=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", installed=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

