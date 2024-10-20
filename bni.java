/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;

@Deprecated
public final class bni {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

