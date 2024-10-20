/*
 * Decompiled with CFR 0.152.
 */
public final class css
extends Exception {
    public final csr a;
    public final int b;
    public final int c;

    public css(kqr kqr2) {
        Object object = kqr2.c;
        Throwable throwable = (Throwable)kqr2.d;
        super((String)object, throwable);
        this.a = (csr)((Object)kqr2.b);
        this.c = kqr2.a;
        this.b = 0;
    }

    public static kqr a() {
        kqr kqr2 = new kqr(null);
        kqr2.a = 2;
        return kqr2;
    }
}

