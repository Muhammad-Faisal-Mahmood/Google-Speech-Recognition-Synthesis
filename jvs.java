/*
 * Decompiled with CFR 0.152.
 */
final class jvs
implements jwe {
    public final boolean a;

    public jvs(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public final jwu bt() {
        return null;
    }

    @Override
    public final boolean bv() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Empty{");
        String string = true != this.a ? "New" : "Active";
        stringBuilder.append(string);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

