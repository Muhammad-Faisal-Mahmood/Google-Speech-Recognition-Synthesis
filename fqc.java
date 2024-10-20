/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileInputStream;

public final class fqc
extends fqf
implements fpw {
    private final FileInputStream a;
    private final File b;

    public fqc(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override
    public final File a() {
        return this.b;
    }
}

