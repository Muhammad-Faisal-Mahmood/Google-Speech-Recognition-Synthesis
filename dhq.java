/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;

final class dhq
implements dhs {
    @Override
    public final void a(File file, InputStream inputStream, ZipEntry object, dcx dcx2) {
        file = new File(file, dht.e((ZipEntry)object));
        if (((ZipEntry)object).isDirectory()) {
            dht.f(file);
            return;
        }
        object = file.getParentFile();
        if (object != null) {
            dht.f((File)object);
            object = new FileOutputStream(file);
            try {
                hjg.a(inputStream, (OutputStream)object);
                return;
            }
            finally {
                ((FileOutputStream)object).close();
            }
        }
        throw new IOException("Parent of entry is null");
    }
}

