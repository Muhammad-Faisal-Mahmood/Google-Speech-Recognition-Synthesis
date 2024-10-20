/*
 * Decompiled with CFR 0.152.
 */
public final class bzu
implements bzx {
    private final bzx b;
    private final bzx c;

    public bzu(bzx bzx2, bzx bzx3) {
        this.b = bzx2;
        this.c = bzx3;
    }

    @Override
    public final int a(int n2) {
        bzx bzx2 = this.c;
        return this.b.a(bzx2.a(n2));
    }
}

