/*
 * Decompiled with CFR 0.152.
 */
final class gzt
extends hdy {
    private final gzx a;

    public gzt(gzx gzx2, int n2) {
        super(gzx2.size(), n2);
        this.a = gzx2;
    }

    @Override
    protected final Object a(int n2) {
        return this.a.get(n2);
    }
}

