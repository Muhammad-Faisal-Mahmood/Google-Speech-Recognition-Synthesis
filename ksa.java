/*
 * Decompiled with CFR 0.152.
 */
public final class ksa
extends kpi {
    private final int a;
    private final int b;
    private final kry c;

    public ksa(String string, int n2, int n3, int n4, int n5) {
        super(string);
        this.c = new kry(string, n2, n3);
        this.a = n4;
        this.b = n5;
    }

    @Override
    public final int a() {
        return this.c.a;
    }

    @Override
    public final int b() {
        return this.a;
    }

    @Override
    public final String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(this.c.getMessage());
        stringBuilder.append(", QuicDetailedErrorCode=");
        stringBuilder.append(this.a);
        stringBuilder.append(", Source=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

