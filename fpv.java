/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public final class fpv
implements fqv {
    public fpv() {
        new ConcurrentHashMap();
    }

    public fpv(byte[] byArray) {
    }

    @Override
    public final File d(Uri uri) {
        return fvc.I(uri);
    }

    @Override
    public final InputStream e(Uri object) {
        object = fvc.I(object);
        return new fqc(new FileInputStream((File)object), (File)object);
    }

    @Override
    public final String f() {
        return "file";
    }

    @Override
    public final boolean g(Uri uri) {
        return fvc.I(uri).exists();
    }

    @Override
    public final Iterable h(Uri object) {
        Object object2 = fvc.I(object);
        boolean bl2 = ((File)object2).isDirectory();
        if (bl2) {
            File[] fileArray = ((File)object2).listFiles();
            if (fileArray != null) {
                ArrayList<Uri> arrayList = new ArrayList<Uri>();
                for (int i2 = 0; i2 < fileArray.length; ++i2) {
                    Object object3 = fileArray[i2];
                    object2 = ((File)object3).getAbsolutePath();
                    object = object2;
                    if (((File)object3).isDirectory()) {
                        object = object2;
                        if (!((String)object2).endsWith("/")) {
                            object = String.valueOf(object2).concat("/");
                        }
                    }
                    object2 = new Uri.Builder().scheme("file").authority("").path("/");
                    object3 = new gzs();
                    object2.path((String)object);
                    arrayList.add(fvc.J((Uri.Builder)object2, (gzs)object3));
                }
                return arrayList;
            }
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", object));
        }
        throw new FileNotFoundException(String.format("%s is not a directory", object));
    }

    @Override
    public final void i(Uri uri) {
        if (fvc.I(uri).mkdirs()) {
            return;
        }
        throw new IOException(String.format("%s could not be created", uri));
    }

    @Override
    public final void j(Uri uri) {
        File file = fvc.I(uri);
        if (file.isDirectory()) {
            if (file.delete()) {
                return;
            }
            throw new IOException(String.format("%s could not be deleted", uri));
        }
        throw new FileNotFoundException(String.format("%s is not a directory", uri));
    }

    @Override
    public final void k(Uri uri) {
        File file = fvc.I(uri);
        if (!file.isDirectory()) {
            if (!file.delete()) {
                if (!file.exists()) {
                    throw new FileNotFoundException(String.format("%s does not exist", uri));
                }
                throw new IOException(String.format("%s could not be deleted", uri));
            }
            return;
        }
        throw new FileNotFoundException(String.format("%s is a directory", uri));
    }

    @Override
    public final void l(Uri uri, Uri uri2) {
        File file = fvc.I(uri);
        File file2 = fvc.I(uri2);
        hjl.a(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
    }

    @Override
    public final boolean m(Uri uri) {
        return fvc.I(uri).isDirectory();
    }

    @Override
    public final long p(Uri object) {
        if (((File)(object = fvc.I((Uri)object))).isDirectory()) {
            return 0L;
        }
        return ((File)object).length();
    }

    @Override
    public final OutputStream q(Uri object) {
        object = fvc.I(object);
        hjl.a((File)object);
        return new fqd(new FileOutputStream((File)object, true), (File)object);
    }

    @Override
    public final OutputStream r(Uri object) {
        object = fvc.I(object);
        hjl.a((File)object);
        return new fqd(new FileOutputStream((File)object), (File)object);
    }
}

