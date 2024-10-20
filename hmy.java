/*
 * Decompiled with CFR 0.152.
 */
class hmy
extends Throwable {
    public hmy() {
        super("Failure occurred while trying to finish a future.");
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Throwable fillInStackTrace() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return this;
    }
}

