/*
 * Decompiled with CFR 0.152.
 */
final class fdq {
    public int a;
    private int b;
    private byte c;

    public final fdr a() {
        int n2;
        if (this.c == 1 && (n2 = this.a) != 0) {
            return new fdr(n2, this.b);
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a == 0) {
            stringBuilder.append(" errorType");
        }
        if (this.c == 0) {
            stringBuilder.append(" errorCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(((Object)stringBuilder).toString()));
    }

    public final void b(int n2) {
        this.b = n2;
        this.c = 1;
    }
}

