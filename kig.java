/*
 * Decompiled with CFR 0.152.
 */
public final class kig {
    public final kgq a;
    public final int b;
    public final String c;

    public kig(kgq kgq2, int n2, String string) {
        jse.e((Object)kgq2, "protocol");
        jse.e(string, "message");
        this.a = kgq2;
        this.b = n2;
        this.c = string;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a == kgq.a) {
            stringBuilder.append("HTTP/1.0");
        } else {
            stringBuilder.append("HTTP/1.1");
        }
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
        stringBuilder.append(' ');
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

