/*
 * Decompiled with CFR 0.152.
 */
public final class jva
extends jpw {
    public static final gqs b = new gqs();
    public final String a;

    public jva() {
        super(b);
        this.a = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jva)) {
            return false;
        }
        object = (jva)object;
        return jse.i(this.a, ((jva)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CoroutineName(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

