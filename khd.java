/*
 * Decompiled with CFR 0.152.
 */
public abstract class khd {
    public final String a;
    public khf b;
    public long c;

    public khd(String string) {
        jse.e(string, "name");
        this.a = string;
        this.c = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}

