/*
 * Decompiled with CFR 0.152.
 */
public final class fsg
extends Exception {
    public fsg(Throwable throwable) {
        super("An unknown error occurred during upgrade. The upgrade may fail repeatedly when retried.", throwable);
    }
}

