/*
 * Decompiled with CFR 0.152.
 */
public final class bzw
implements bzx {
    private final int b;
    private final int c;

    public bzw(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    @Override
    public final int a(int n2) {
        return Math.min(n2, this.c) + this.b;
    }
}

