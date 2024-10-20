/*
 * Decompiled with CFR 0.152.
 */
final class iyz
implements jjd {
    public final jjd a;
    public boolean b = false;
    public int c = 0;
    private final Runnable d;

    public iyz(jjd jjd2, Runnable runnable) {
        this.a = jjd2;
        this.d = runnable;
    }

    public final Runnable a() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }
}

