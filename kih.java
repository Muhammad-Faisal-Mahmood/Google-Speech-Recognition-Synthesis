/*
 * Decompiled with CFR 0.152.
 */
public final class kih {
    private final klo a;
    private long b;

    public kih(klo klo2) {
        jse.e(klo2, "source");
        this.a = klo2;
        this.b = 262144L;
    }

    public final String a() {
        String string = this.a.n(this.b);
        int n2 = string.length();
        this.b -= (long)n2;
        return string;
    }

    public final kgk b() {
        String string;
        bzo bzo2 = new bzo(null, null, null);
        while ((string = this.a()).length() != 0) {
            String string2;
            int n2 = jse.L(string, ':', 1, 4);
            if (n2 != -1) {
                string2 = string.substring(0, n2);
                jse.d(string2, "substring(...)");
                string = string.substring(n2 + 1);
                jse.d(string, "substring(...)");
                bzo2.ax(string2, string);
                continue;
            }
            if (string.charAt(0) == ':') {
                string2 = string.substring(1);
                jse.d(string2, "substring(...)");
                bzo2.ax("", string2);
                continue;
            }
            bzo2.ax("", string);
        }
        return bzo2.aw();
    }
}

