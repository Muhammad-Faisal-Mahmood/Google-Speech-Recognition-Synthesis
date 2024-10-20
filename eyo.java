/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.os.Build
 *  android.os.ParcelFileDescriptor
 *  android.system.ErrnoException
 *  android.system.Os
 *  android.system.OsConstants
 *  android.system.StructStat
 */
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class eyo {
    public static final String[] a = new String[]{"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};
    public static final String[] b;
    public static final String[] c;

    static {
        String string = !Build.HARDWARE.equals("goldfish") && !Build.HARDWARE.equals("ranchu") ? "" : "androidx.test.services.storage.runfiles";
        b = new String[]{"media", string};
        c = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    public static String a(File object) {
        String string = ((File)object).getCanonicalPath();
        object = string;
        if (!string.endsWith("/")) {
            object = String.valueOf(string).concat("/");
        }
        return object;
    }

    public static void b(ParcelFileDescriptor parcelFileDescriptor, String string) {
        StructStat structStat;
        try {
            structStat = Os.fstat((FileDescriptor)parcelFileDescriptor.getFileDescriptor());
        }
        catch (ErrnoException errnoException) {
            throw new IOException(errnoException);
        }
        try {
            parcelFileDescriptor = Os.lstat((String)string);
        }
        catch (ErrnoException errnoException) {
            throw new IOException(errnoException);
        }
        if (!OsConstants.S_ISLNK((int)parcelFileDescriptor.st_mode)) {
            if (structStat.st_dev == parcelFileDescriptor.st_dev && structStat.st_ino == parcelFileDescriptor.st_ino) {
                return;
            }
            throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(string)));
        }
        throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(string)));
    }

    public static void c(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
            return;
        }
        catch (IOException iOException) {
            fileNotFoundException.addSuppressed(iOException);
            return;
        }
    }

    public static File[] d(Callable fileArray) {
        try {
            fileArray = (File[])fileArray.call();
            return fileArray;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        catch (NullPointerException nullPointerException) {
            throw nullPointerException;
        }
    }

    public static void e(Object object) {
        if (object != null) {
            return;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }
}

