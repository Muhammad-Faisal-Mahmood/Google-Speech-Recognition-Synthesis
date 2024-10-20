/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.storage.StorageManager
 *  android.provider.MediaStore$Files
 *  android.text.TextUtils
 *  android.util.Log
 */
package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PathUtils {
    static {
        new AtomicBoolean();
    }

    private PathUtils() {
    }

    private static String[] a(List object) {
        ArrayList<String> arrayList = new ArrayList<String>();
        object = object.iterator();
        while (object.hasNext()) {
            File file = (File)object.next();
            if (file == null || TextUtils.isEmpty((CharSequence)file.getAbsolutePath())) continue;
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] getAllPrivateDownloadsDirectories() {
        kne kne2;
        List<Object> list;
        block6: {
            list = new ArrayList();
            kne2 = kne.b();
            File[] fileArray = jjj.c.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (fileArray == null) break block6;
            list = Arrays.asList(fileArray);
        }
        return PathUtils.a(list);
        finally {
            kne2.close();
        }
    }

    public static String getCacheDirectory() {
        throw null;
    }

    public static String getDataDirectory() {
        throw null;
    }

    public static String getDownloadsDirectory() {
        Object object;
        kne kne2;
        block8: {
            block6: {
                block7: {
                    kne2 = kne.a();
                    if (Build.VERSION.SDK_INT < 29) break block6;
                    object = PathUtils.getAllPrivateDownloadsDirectories();
                    if (((String[])object).length != 0) break block7;
                    object = "";
                }
                object = object[0];
                break block8;
            }
            object = Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_DOWNLOADS).getPath();
        }
        return object;
        finally {
            kne2.close();
        }
    }

    public static String[] getExternalDownloadVolumesNames() {
        ArrayList<File> arrayList = new ArrayList<File>();
        for (String string : dp$$ExternalSyntheticApiModelOutline0.m(jjj.c)) {
            if (TextUtils.isEmpty((CharSequence)string) || string.contains("external_primary")) continue;
            File file = sk$$ExternalSyntheticApiModelOutline1.m(dp$$ExternalSyntheticApiModelOutline0.m((StorageManager)jjj.c.getSystemService(StorageManager.class), MediaStore.Files.getContentUri((String)string)));
            File file2 = new File(file, Environment.DIRECTORY_DOWNLOADS);
            if (!file2.isDirectory()) {
                string = file2.getAbsolutePath();
                String string2 = file.getAbsolutePath();
                boolean bl2 = file.isDirectory();
                Log.w((String)"cr_PathUtils", (String)String.format(Locale.US, "Download dir missing: %s, parent dir:%s, isDirectory:%s", string, string2, bl2));
            }
            arrayList.add(file2);
        }
        return PathUtils.a(arrayList);
    }

    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = jjj.c.getApplicationInfo();
        if ((applicationInfo.flags & 0x80) == 0 && (applicationInfo.flags & 1) != 0) {
            return "/system/lib/";
        }
        return applicationInfo.nativeLibraryDir;
    }

    public static String getThumbnailCacheDirectory() {
        throw null;
    }
}

