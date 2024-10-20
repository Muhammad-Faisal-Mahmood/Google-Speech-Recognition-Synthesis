/*
 * Decompiled with CFR 0.152.
 */
public final class frv {
    public final hyf a;
    public final hwj b;

    public frv() {
        throw null;
    }

    public frv(hyf hyf2, hwj hwj2) {
        if (hyf2 != null) {
            this.a = hyf2;
            if (hwj2 != null) {
                this.b = hwj2;
                return;
            }
            throw new NullPointerException("Null extensionRegistryLite");
        }
        throw new NullPointerException("Null defaultValue");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof frv) {
            object = (frv)object;
            if (this.a.equals(((frv)object).a) && this.b.equals(((frv)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        Object object = this.b;
        String string = this.a.toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("ProtoSerializer{defaultValue=");
        stringBuilder.append(string);
        stringBuilder.append(", extensionRegistryLite=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

