/*
 * Decompiled with CFR 0.152.
 */
final class hbi
extends hdy {
    static final hdy a = new hbi(new Object[0]);
    private final Object[] b;

    public hbi(Object[] objectArray) {
        super(0, 0);
        this.b = objectArray;
    }

    @Override
    protected final Object a(int n2) {
        return this.b[n2];
    }
}

