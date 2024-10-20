/*
 * Decompiled with CFR 0.152.
 */
public class klr
implements kmk {
    public final kmk b;

    public klr(kmk kmk2) {
        jse.e(kmk2, "delegate");
        this.b = kmk2;
    }

    @Override
    public final kmm a() {
        return this.b.a();
    }

    @Override
    public long b(klm klm2, long l2) {
        throw null;
    }

    @Override
    public void close() {
        this.b.close();
    }

    public final String toString() {
        String string = this.getClass().getSimpleName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

