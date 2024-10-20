/*
 * Decompiled with CFR 0.152.
 */
public final class hia
extends RuntimeException {
    public hia(String string) {
        super(string);
    }

    public static hia a(String string, String string2, int n2) {
        return new hia(hia.d(string, string2, n2, n2 + 1));
    }

    public static hia b(String string, String string2, int n2, int n3) {
        return new hia(hia.d(string, string2, n2, n3));
    }

    public static hia c(String string, String string2, int n2) {
        return new hia(hia.d(string, string2, n2, -1));
    }

    private static String d(String charSequence, String string, int n2, int n3) {
        int n4 = n3;
        if (n3 < 0) {
            n4 = string.length();
        }
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(": ");
        if (n2 > 8) {
            ((StringBuilder)charSequence).append("...");
            ((StringBuilder)charSequence).append(string, n2 - 5, n2);
        } else {
            ((StringBuilder)charSequence).append(string, 0, n2);
        }
        ((StringBuilder)charSequence).append('[');
        ((StringBuilder)charSequence).append(string.substring(n2, n4));
        ((StringBuilder)charSequence).append(']');
        if (string.length() - n4 > 8) {
            ((StringBuilder)charSequence).append(string, n4, n4 + 5);
            ((StringBuilder)charSequence).append("...");
        } else {
            ((StringBuilder)charSequence).append(string, n4, string.length());
        }
        return ((StringBuilder)charSequence).toString();
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

