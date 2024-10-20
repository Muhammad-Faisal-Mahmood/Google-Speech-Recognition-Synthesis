/*
 * Decompiled with CFR 0.152.
 */
public final class kbt {
    public final String a;

    public kbt(String string) {
        this.a = string;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(this.a);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}

