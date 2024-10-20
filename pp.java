/*
 * Decompiled with CFR 0.152.
 */
final class pp
extends Throwable {
    public pp(String string) {
        super(string);
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

