/*
 * Decompiled with CFR 0.152.
 */
public final class bqe {
    public final gzx a;

    public bqe() {
        throw null;
    }

    public bqe(gzx gzx2) {
        if (gzx2 != null) {
            this.a = gzx2;
            return;
        }
        throw new NullPointerException("Null results");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bqe) {
            object = (bqe)object;
            return fvd.z(this.a, ((bqe)object).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }

    public final String toString() {
        String string = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("RosieRobotResult{results=");
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

