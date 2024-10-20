/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;

final class u
implements FileFilter {
    @Override
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}

