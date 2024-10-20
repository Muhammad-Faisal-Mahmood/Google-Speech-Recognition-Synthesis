/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.pm.ApplicationInfo
 *  android.util.ArrayMap
 *  dalvik.system.BaseDexClassLoader
 */
package org.chromium.base;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.util.ArrayMap;
import dalvik.system.BaseDexClassLoader;
import j$.util.DesugarCollections;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BundleUtils {
    public static final ArrayMap a;
    private static final Object b;

    static {
        b = new Object();
        a = new ArrayMap();
        DesugarCollections.synchronizedMap(new ArrayMap());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Context a(Context context, String object) {
        int n2;
        Object object2;
        block21: {
            Object object3;
            block20: {
                object3 = context;
                while (object3 instanceof ContextWrapper) {
                    if (object3 instanceof Application) {
                        context = jjj.ab(context, (String)object);
                        break block20;
                    }
                    object3 = ((ContextWrapper)object3).getBaseContext();
                }
                object3 = b;
                synchronized (object3) {
                    context = jjj.ab(context, (String)object);
                }
            }
            context.getClassLoader().getParent();
            object3 = a;
            synchronized (object3) {
                object2 = (ClassLoader)object3.get(object);
                n2 = 0;
                if (object2 != null) {
                    if (!object2.equals(context.getClassLoader())) {
                        BundleUtils.b(context, (ClassLoader)object2);
                        n2 = 1;
                    }
                } else {
                    object3.put(object, (Object)context.getClassLoader());
                }
            }
            String string = a.ai((String)object, "Android.IsolatedSplits.ClassLoaderReplaced.");
            object2 = knn.a;
            ((ReentrantReadWriteLock)((knl)object2).a).readLock().lock();
            object = (bzo)((knl)object2).b.get(string);
            if (object != null) break block21;
            ((ReentrantReadWriteLock)((knl)object2).a).readLock().unlock();
            ((ReentrantReadWriteLock)((knl)object2).a).writeLock().lock();
            try {
                object3 = (bzo)((knl)object2).b.get(string);
                object = object3;
                if (object3 == null) {
                    if (((knl)object2).b.size() >= 256) {
                        ((AtomicInteger)((knl)object2).c).incrementAndGet();
                        return context;
                    }
                    object = new bzo(null, null);
                    ((knl)object2).b.put(string, object);
                }
                if (((bzo)object).aq(n2)) return context;
                ((AtomicInteger)((knl)object2).c).incrementAndGet();
                return context;
            }
            finally {
                ((ReentrantReadWriteLock)((knl)object2).a).writeLock().unlock();
            }
        }
        try {
            if (((bzo)object).aq(n2)) return context;
            ((AtomicInteger)((knl)object2).c).incrementAndGet();
            return context;
        }
        finally {
            ((ReentrantReadWriteLock)((knl)object2).a).readLock().unlock();
        }
    }

    public static void b(Context context, ClassLoader classLoader) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper)context).getBaseContext();
        }
        Field field = context.getClass().getDeclaredField("mClassLoader");
        field.setAccessible(true);
        field.set(context, classLoader);
    }

    public static boolean c(String string) {
        return BundleUtils.e(string) != null;
    }

    private static String d(String string, String string2) {
        if ((string2 = BundleUtils.e(string2)) != null) {
            Object object = jjj.c.getApplicationInfo();
            object = (String)object.getClass().getField("primaryCpuAbi").get(object);
            string = System.mapLibraryName(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("!/lib/");
            stringBuilder.append((String)object);
            stringBuilder.append("/");
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        return null;
    }

    private static String e(String string) {
        int n2;
        ApplicationInfo applicationInfo = jjj.c.getApplicationInfo();
        Object[] objectArray = ag$$ExternalSyntheticApiModelOutline0.m(applicationInfo);
        if (objectArray != null && (n2 = Arrays.binarySearch(objectArray, string)) >= 0) {
            return applicationInfo.splitSourceDirs[n2];
        }
        return null;
    }

    public static String getNativeLibraryPath(String object, String string) {
        String string2;
        kne kne2;
        block10: {
            ClassLoader classLoader;
            block11: {
                block12: {
                    kne2 = kne.a();
                    string2 = ((BaseDexClassLoader)BundleUtils.class.getClassLoader()).findLibrary((String)object);
                    if (string2 != null) break block10;
                    classLoader = jjj.c.getClassLoader();
                    if (classLoader instanceof BaseDexClassLoader) {
                        string2 = ((BaseDexClassLoader)classLoader).findLibrary((String)object);
                    } else {
                        boolean bl2 = classLoader instanceof knk;
                        if (bl2) break block11;
                    }
                    if (string2 == null) break block12;
                    kne2.close();
                    return string2;
                }
                object = BundleUtils.d((String)object, string);
                return object;
            }
            object = (knk)classLoader;
            throw null;
        }
        kne2.close();
        return string2;
        finally {
            kne2.close();
        }
    }

    public static boolean isBundleForNative() {
        return false;
    }
}

