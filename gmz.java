/*
 * Decompiled with CFR 0.152.
 */
final class gmz
extends IllegalStateException {
    public gmz(String string) {
        super(gmz.a(null, string));
    }

    public gmz(String string, String string2, Throwable throwable) {
        super(gmz.a(string, string2), throwable);
    }

    private static String a(String string, String string2) {
        string = string == null ? "" : ": ".concat(string);
        return a.aq(string, string2, "Starting new trace ", " when already associated with a trace", ". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
    }
}

