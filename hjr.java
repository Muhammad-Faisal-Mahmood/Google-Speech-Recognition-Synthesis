/*
 * Decompiled with CFR 0.152.
 */
final class hjr {
    Object a;
    int b;

    public hjr(Object object, int n2) {
        this.a = object;
        this.b = n2;
    }

    public final String toString() {
        int n2 = this.b;
        String string = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("countOrWorkerId[");
        stringBuilder.append(n2);
        stringBuilder.append("][");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

