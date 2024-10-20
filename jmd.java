/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

public final class jmd {
    public static final Logger a = Logger.getLogger(jma.class.getName());
    public static final klp b = kmp.v("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static int a(int n2, byte by2, short s2) {
        int n3 = n2;
        if ((by2 & 8) != 0) {
            n3 = n2 - 1;
        }
        if (s2 <= n3) {
            return n3 - s2;
        }
        throw jmd.c("PROTOCOL_ERROR padding %s > remaining length %s", s2, n3);
    }

    public static int b(klo klo2) {
        byte by2 = klo2.d();
        byte by3 = klo2.d();
        return klo2.d() & 0xFF | ((by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    public static IOException c(String string, Object ... objectArray) {
        throw new IOException(String.format(Locale.US, string, objectArray));
    }

    public static IllegalArgumentException d(String string, Object ... objectArray) {
        throw new IllegalArgumentException(String.format(Locale.US, string, objectArray));
    }
}

