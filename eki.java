/*
 * Decompiled with CFR 0.152.
 */
public final class eki {
    public final int a;
    public final eka b;

    public eki() {
        throw null;
    }

    public eki(eka eka2, int n2) {
        this.b = eka2;
        this.a = n2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof eki) {
            object = (eki)object;
            if (this.b.equals(((eki)object).b) && this.a == ((eki)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ 0xF4243) * 1000003 ^ this.a;
    }

    public final String toString() {
        String string = this.b.toString();
        StringBuilder stringBuilder = new StringBuilder("AudioRequestClientData{audioRequestClient=");
        stringBuilder.append(string);
        stringBuilder.append(", clientToken=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

