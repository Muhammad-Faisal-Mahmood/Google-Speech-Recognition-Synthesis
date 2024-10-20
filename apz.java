/*
 * Decompiled with CFR 0.152.
 */
public final class apz {
    public final aqc a;
    public final aqc b;

    public apz(aqc aqc2, aqc aqc3) {
        this.a = aqc2;
        this.b = aqc3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (apz)object;
            if (this.a.equals(((apz)object).a) && this.b.equals(((apz)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public final String toString() {
        Object object = this.a;
        Object object2 = this.b;
        String string = object.toString();
        object = ((aqc)object).equals(object2) ? "" : ", ".concat(((Object)this.b).toString());
        object2 = new StringBuilder("[");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("]");
        return ((StringBuilder)object2).toString();
    }
}

