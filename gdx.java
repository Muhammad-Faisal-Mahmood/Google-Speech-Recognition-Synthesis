/*
 * Decompiled with CFR 0.152.
 */
final class gdx {
    public final long a;

    public gdx() {
        throw null;
    }

    public gdx(long l2) {
        this.a = l2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof gdx) {
            object = (gdx)object;
            if (this.a == ((gdx)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long l2 = this.a;
        return (int)(l2 ^ l2 >>> 32) ^ 0xF4243;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LoadTaskIdentifier{index=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

