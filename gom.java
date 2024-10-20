/*
 * Decompiled with CFR 0.152.
 */
public final class gom {
    private static final gom a = new gom(3, null, true);
    private static final gom b = new gom(2, null, true);
    private final Object c;
    private boolean d;
    private final int e;

    public gom(int n2, Object object, boolean bl2) {
        this.e = n2;
        this.c = object;
        this.d = bl2;
    }

    public static gom d(int n2) {
        if (n2 - 1 != 1) {
            return a;
        }
        return b;
    }

    public final Object a() {
        if (this.d && this.e == 1) {
            return this.c;
        }
        throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
    }

    public final boolean b() {
        this.d = true;
        return this.e == 1;
    }

    public final int c() {
        this.d = true;
        return this.e;
    }
}

