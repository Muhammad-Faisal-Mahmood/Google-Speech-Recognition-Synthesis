/*
 * Decompiled with CFR 0.152.
 */
package j$.io;

import j$.util.Objects;
import java.io.InputStream;
import java.io.OutputStream;

public final class DesugarInputStream {
    public static long transferTo(InputStream inputStream, OutputStream outputStream) {
        int n2;
        Objects.requireNonNull(outputStream, "out");
        byte[] byArray = new byte[8192];
        long l2 = 0L;
        while ((n2 = inputStream.read(byArray, 0, 8192)) >= 0) {
            outputStream.write(byArray, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }
}

