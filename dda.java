/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class dda {
    public static final dda a = new dda();

    public static final List d(File object) {
        if (!object.isDirectory()) {
            ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/base/FileUtil", "listFiles", 145, "FileUtil.java")).u("isDirectory returned false while listing files for %s", object);
            object = null;
        } else {
            File[] fileArray = object.listFiles();
            if (fileArray == null) {
                ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/base/FileUtil", "listFiles", 151, "FileUtil.java")).u("Failed to list files for directory %s", object);
            }
            object = fileArray;
        }
        object = object != null && ((File[])object).length != 0 ? Arrays.asList(object) : Collections.emptyList();
        return object;
    }

    public final long a(File object) {
        if (!((File)object).isDirectory()) {
            return ((File)object).length();
        }
        object = dda.d((File)object).iterator();
        long l2 = 0L;
        while (object.hasNext()) {
            l2 += this.a((File)object.next());
        }
        return l2;
    }

    public final boolean b(String string, File file, dhu dhu2) {
        return this.c(string, file, ddx.a, dhu2);
    }

    final boolean c(String object, File file, ddx object2, dhu dhu2) {
        boolean bl2;
        block5: {
            boolean bl3 = file.exists();
            bl2 = true;
            boolean bl4 = true;
            if (!bl3) {
                return true;
            }
            SystemClock.elapsedRealtime();
            if (file.isDirectory()) {
                Iterator iterator = dda.d(file).iterator();
                while (true) {
                    bl2 = bl4;
                    if (!iterator.hasNext()) break;
                    bl4 &= this.c((String)object, (File)iterator.next(), (ddx)object2, dhu2);
                }
            }
            object2 = dec.g((String)object, dec.e(file));
            try {
                object = dhu2 == dhu.g ? ddd.a.l() : (hfk)ddd.a.f();
                ((hfk)object.j("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 103, "FileUtil.java")).C("Deleting file %s, reason: %s", object2, dhu2);
                if (file.delete()) break block5;
                ((hfk)((hfk)ddd.a.h()).j("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 105, "FileUtil.java")).u("Failed to delete %s", object2);
            }
            catch (SecurityException securityException) {
                ((hfk)((hfk)((hfk)ddd.a.h()).i(securityException)).j("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 112, "FileUtil.java")).u("Security exception thrown when attempting deletion of %s", object2);
            }
            bl2 = false;
        }
        ddb.a();
        SystemClock.elapsedRealtime();
        return bl2;
    }
}

