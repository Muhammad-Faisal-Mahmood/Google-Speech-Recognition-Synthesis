/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.IOException;

public final class hjl {
    public static final hhk a = new hhk(null);

    public static void a(File file) {
        block3: {
            block2: {
                File file2 = file.getCanonicalFile().getParentFile();
                if (file2 == null) break block2;
                file2.mkdirs();
                if (!file2.isDirectory()) break block3;
            }
            return;
        }
        throw new IOException("Unable to create parent directories of ".concat(((Object)file).toString()));
    }
}

