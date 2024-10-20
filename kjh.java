/*
 * Decompiled with CFR 0.152.
 */
public final class kjh
extends khd {
    final kjl d;
    final int e;

    public kjh(String string, kjl kjl2, int n2) {
        this.d = kjl2;
        this.e = n2;
        super(string);
    }

    @Override
    public final long a() {
        kjl kjl2 = this.d;
        synchronized (kjl2) {
            this.d.w.remove(this.e);
            return -1L;
        }
    }
}

