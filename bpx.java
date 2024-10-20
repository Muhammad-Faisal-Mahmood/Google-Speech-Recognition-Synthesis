/*
 * Decompiled with CFR 0.152.
 */
public final class bpx {
    public final Object a;
    public final giu b;

    public bpx() {
        throw null;
    }

    public bpx(Object object, giu giu2) {
        if (object != null) {
            this.a = object;
            this.b = giu2;
            return;
        }
        throw new NullPointerException("Null getService");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bpx) {
            object = (bpx)object;
            if (this.a.equals(((bpx)object).a) && this.b.equals(((bpx)object).b)) {
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
        StringBuilder stringBuilder = new StringBuilder("InferenceServiceContext{getService=");
        stringBuilder.append(string);
        stringBuilder.append(", disconnectSignal=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

