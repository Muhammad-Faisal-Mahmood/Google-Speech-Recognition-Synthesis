/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class hjh {
    static final Logger a = Logger.getLogger(hjh.class.getName());

    private hjh() {
    }

    public static void a(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
            return;
        }
        catch (IOException iOException) {
            try {
                a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", iOException);
                return;
            }
            catch (IOException iOException2) {
                throw new AssertionError((Object)iOException2);
            }
        }
    }
}

