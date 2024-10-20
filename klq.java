/*
 * Decompiled with CFR 0.152.
 */
public class klq
implements kmi {
    public final kmi b;

    public klq(kmi kmi2) {
        jse.e(kmi2, "delegate");
        this.b = kmi2;
    }

    @Override
    public final kmm a() {
        return this.b.a();
    }

    @Override
    public void bK(klm klm2, long l2) {
        throw null;
    }

    @Override
    public void close() {
        this.b.close();
    }

    @Override
    public void flush() {
        this.b.flush();
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

