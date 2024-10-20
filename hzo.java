/*
 * Decompiled with CFR 0.152.
 */
public final class hzo {
    static final int a = hzo.c(1, 3);
    static final int b = hzo.c(1, 4);
    static final int c = hzo.c(2, 0);
    static final int d = hzo.c(3, 2);

    public static int a(int n2) {
        return n2 >>> 3;
    }

    public static int b(int n2) {
        return n2 & 7;
    }

    static int c(int n2, int n3) {
        return n2 << 3 | n3;
    }
}

