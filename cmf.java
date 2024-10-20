/*
 * Decompiled with CFR 0.152.
 */
public final class cmf
extends Exception {
    public cmf() {
    }

    public cmf(String string) {
        super(string);
    }

    public cmf(Throwable throwable) {
        super("ContentProvider query failed", throwable);
    }
}

