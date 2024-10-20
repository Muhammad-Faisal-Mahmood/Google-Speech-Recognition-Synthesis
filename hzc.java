/*
 * Decompiled with CFR 0.152.
 */
public final class hzc
extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public hzc() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final hxn a() {
        return new hxn(this.getMessage());
    }
}

