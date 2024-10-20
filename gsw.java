/*
 * Decompiled with CFR 0.152.
 */
public final class gsw
extends gsy {
    final gsy a;
    final gsy b;

    public gsw(gsy gsy2, gsy gsy3) {
        this.a = gsy2;
        this.b = gsy3;
    }

    @Override
    public final boolean b(char c2) {
        return this.a.b(c2) || this.b.b(c2);
        {
        }
    }

    public final String toString() {
        Object object = this.b;
        String string = this.a.toString();
        object = object.toString();
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.or(");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

