/*
 * Decompiled with CFR 0.152.
 */
abstract class gxy
implements hcs {
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof hcs) {
            object = (hcs)object;
            return this.a().equals(object.a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a().hashCode();
    }

    public final String toString() {
        return this.a().toString();
    }
}

