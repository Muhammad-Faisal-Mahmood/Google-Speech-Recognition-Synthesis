/*
 * Decompiled with CFR 0.152.
 */
import java.util.ListIterator;

final class dyv {
    public final ListIterator a;
    public final gto b;
    public final int c;

    public dyv() {
        throw null;
    }

    public dyv(ListIterator listIterator, int n2, gto gto2) {
        if (listIterator != null) {
            this.a = listIterator;
            this.c = n2;
            this.b = gto2;
            return;
        }
        throw new NullPointerException("Null iterator");
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dyv) {
            object = (dyv)object;
            if (this.a.equals(((dyv)object).a) && this.c == ((dyv)object).c && this.b.equals(((dyv)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.c;
        a.E(n3);
        return ((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ this.b.hashCode();
    }

    public final String toString() {
        int n2 = this.c;
        String string = this.a.toString();
        String string2 = n2 != 1 ? "INVALID_START" : "VALID";
        String string3 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder("StoreInsertionStatus{iterator=");
        stringBuilder.append(string);
        stringBuilder.append(", status=");
        stringBuilder.append(string2);
        stringBuilder.append(", endEvent=");
        stringBuilder.append(string3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

