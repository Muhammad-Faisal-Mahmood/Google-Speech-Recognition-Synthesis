/*
 * Decompiled with CFR 0.152.
 */
public final class gsq
extends gsp {
    private final char a;
    private final char b;

    public gsq(char c2, char c3) {
        boolean bl2 = c3 >= c2;
        fxf.q(bl2);
        this.a = c2;
        this.b = c3;
    }

    @Override
    public final boolean b(char c2) {
        return this.a <= c2 && c2 <= this.b;
    }

    public final String toString() {
        String string = gsy.d(this.a);
        String string2 = gsy.d(this.b);
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.inRange('");
        stringBuilder.append(string);
        stringBuilder.append("', '");
        stringBuilder.append(string2);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}

