/*
 * Decompiled with CFR 0.152.
 */
public final class jqn
implements jqb {
    public static final jqn a = new jqn();

    private jqn() {
    }

    @Override
    public final void bD(Object object) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override
    public final jqf d() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

