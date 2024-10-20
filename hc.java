/*
 * Decompiled with CFR 0.152.
 */
public final class hc {
    public int a;
    public int b;
    public Object c;
    public int d;

    public hc(int n2, int n3, int n4, Object object) {
        this.a = n2;
        this.b = n3;
        this.d = n4;
        this.c = object;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hc)) {
            return false;
        }
        hc hc2 = (hc)object;
        int n2 = this.a;
        if (n2 != hc2.a) {
            return false;
        }
        if (n2 == 8 && Math.abs(this.d - this.b) == 1 && this.d == hc2.b && this.b == hc2.d) {
            return true;
        }
        if (this.d != hc2.d) {
            return false;
        }
        if (this.b != hc2.b) {
            return false;
        }
        object = this.c;
        return !(object != null ? !object.equals(hc2.c) : hc2.c != null);
    }

    public final int hashCode() {
        return (this.a * 31 + this.b) * 31 + this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("[");
        int n2 = this.a;
        String string = n2 != 1 ? (n2 != 2 ? (n2 != 4 ? (n2 != 8 ? "??" : "mv") : "up") : "rm") : "add";
        stringBuilder.append(string);
        stringBuilder.append(",s:");
        stringBuilder.append(this.b);
        stringBuilder.append("c:");
        stringBuilder.append(this.d);
        stringBuilder.append(",p:");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

