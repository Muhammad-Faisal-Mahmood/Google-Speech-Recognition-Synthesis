/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;

final class dhr
implements dhs {
    private final dhs a;

    public dhr(dhs dhs2) {
        this.a = dhs2;
    }

    @Override
    public final void a(File file, InputStream inputStream, ZipEntry zipEntry, dcx dcx2) {
        if (zipEntry.isDirectory()) {
            return;
        }
        dht.g(inputStream, new File(file, dht.e(zipEntry)), this.a, dcx2, gts.a);
    }
}

