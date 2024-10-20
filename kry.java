/*
 * Decompiled with CFR 0.152.
 */
public class kry
extends kpc {
    protected final int a;
    protected final int b;

    public kry(String string, int n2, int n3) {
        super(string);
        this.a = n2;
        this.b = n3;
    }

    @Override
    public final int a() {
        return this.a;
    }

    public boolean b() {
        int n2 = this.a;
        return n2 == 3 || n2 == 4 || n2 == 5 || n2 == 6 || n2 == 8;
    }

    @Override
    public final String getMessage() {
        StringBuilder stringBuilder = new StringBuilder(super.getMessage());
        stringBuilder.append(", ErrorCode=");
        stringBuilder.append(this.a);
        if (this.b != 0) {
            stringBuilder.append(", InternalErrorCode=");
            stringBuilder.append(this.b);
        }
        stringBuilder.append(", Retryable=");
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }
}

