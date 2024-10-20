/*
 * Decompiled with CFR 0.152.
 */
public final class gsr
extends gsp {
    private final char a;

    public gsr(char c2) {
        this.a = c2;
    }

    @Override
    public final boolean b(char c2) {
        return c2 == this.a;
    }

    public final String toString() {
        String string = gsy.d(this.a);
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.is('");
        stringBuilder.append(string);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}

