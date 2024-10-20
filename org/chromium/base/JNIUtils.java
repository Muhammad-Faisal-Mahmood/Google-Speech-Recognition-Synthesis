/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package org.chromium.base;

import android.util.Log;
import java.util.Locale;
import org.chromium.base.BundleUtils;

public class JNIUtils {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ClassLoader getSplitClassLoader(String string) {
        ClassLoader classLoader;
        if (string.isEmpty()) return JNIUtils.class.getClassLoader();
        boolean bl2 = BundleUtils.c(string);
        Log.i((String)"cr_JNIUtils", (String)String.format(Locale.US, "Init JNI Classloader for %s. isInstalled=%b", string, bl2));
        if (!bl2) return JNIUtils.class.getClassLoader();
        Object object = BundleUtils.a;
        synchronized (object) {
            classLoader = (ClassLoader)BundleUtils.a.get((Object)string);
        }
        object = classLoader;
        if (classLoader != null) return object;
        BundleUtils.a(jjj.c, string);
        classLoader = BundleUtils.a;
        synchronized (classLoader) {
            return (ClassLoader)BundleUtils.a.get((Object)string);
        }
    }
}

