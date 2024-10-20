/*
 * Decompiled with CFR 0.152.
 */
public final class kqw {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public kqw(String stringArray) {
        stringArray = stringArray.split("\\.");
        this.a = Integer.parseInt(stringArray[0]);
        this.b = Integer.parseInt(stringArray[1]);
        this.c = Integer.parseInt(stringArray[2]);
        this.d = Integer.parseInt(stringArray[3]);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(".");
        stringBuilder.append(this.b);
        stringBuilder.append(".");
        stringBuilder.append(this.c);
        stringBuilder.append(".");
        stringBuilder.append(this.d);
        return stringBuilder.toString();
    }
}

