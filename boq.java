/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

public final class boq
implements FilenameFilter {
    final String a;

    public boq(String string) {
        this.a = string;
    }

    @Override
    public final boolean accept(File file, String string) {
        return string.startsWith(this.a);
    }
}

