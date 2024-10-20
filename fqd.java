/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileOutputStream;

public final class fqd
extends fqg
implements fpw {
    public final FileOutputStream a;
    private final File b;

    public fqd(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override
    public final File a() {
        return this.b;
    }
}

