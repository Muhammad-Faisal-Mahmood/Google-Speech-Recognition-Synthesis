/*
 * Decompiled with CFR 0.152.
 */
public final class feb
extends fef {
    private final int b;
    private final String c;

    public feb(int n2, String string) {
        fdq fdq2 = fdr.a();
        fdq2.a = 7;
        fdq2.b(n2);
        super(fdq2.a());
        this.b = n2;
        this.c = string;
    }

    @Override
    public final String getMessage() {
        StringBuilder stringBuilder = new StringBuilder("Error code from S3 gRPC = ");
        stringBuilder.append(this.b);
        stringBuilder.append(", error message: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

