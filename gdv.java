/*
 * Decompiled with CFR 0.152.
 */
public final class gdv
extends RuntimeException {
    public gdv() {
        super("Infinite fetch cycle detected. This occurs when a fetch does not produce a cache hit on the next load from local storage.");
    }
}

