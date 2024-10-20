/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;

public final class ivp {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final hjd b = iwx.c;

    public static iws a(String string, ivo ivo2) {
        boolean bl2;
        boolean bl3 = string.isEmpty();
        boolean bl4 = bl2 = false;
        if (!bl3) {
            bl4 = bl2;
            if (string.charAt(0) == ':') {
                bl4 = true;
            }
        }
        return new iwv(string, bl4, ivo2);
    }
}

