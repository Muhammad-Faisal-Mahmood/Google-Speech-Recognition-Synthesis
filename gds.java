/*
 * Decompiled with CFR 0.152.
 */
public final class gds {
    final hob a;
    public final Object b;

    public gds(hob hob2, Object object) {
        this.a = hob2;
        this.b = object;
    }

    public final String toString() {
        String string = this.a.toString();
        StringBuilder stringBuilder = new StringBuilder("LocalDataSource[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

