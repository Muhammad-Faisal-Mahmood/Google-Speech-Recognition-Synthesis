/*
 * Decompiled with CFR 0.152.
 */
public final class kcd
extends kce {
    public static final kcd a = new kcd();

    private kcd() {
        super(kch.c, kch.d, kch.e, kch.a);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public final String toString() {
        return "Dispatchers.Default";
    }
}

