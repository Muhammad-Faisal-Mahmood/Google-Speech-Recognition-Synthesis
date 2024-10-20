/*
 * Decompiled with CFR 0.152.
 */
public final class bpl {
    public final boz a;
    public final giu b;

    public bpl() {
        throw null;
    }

    public bpl(boz boz2, giu giu2) {
        if (boz2 != null) {
            this.a = boz2;
            if (giu2 != null) {
                this.b = giu2;
                return;
            }
            throw new NullPointerException("Null disconnectSignal");
        }
        throw new NullPointerException("Null service");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bpl) {
            object = (bpl)object;
            if (this.a.equals(((bpl)object).a) && this.b.equals(((bpl)object).b)) {
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
        StringBuilder stringBuilder = new StringBuilder("ServiceContext{service=");
        stringBuilder.append(string);
        stringBuilder.append(", disconnectSignal=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

