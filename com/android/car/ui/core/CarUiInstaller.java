/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.BroadcastReceiver
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.IntentFilter
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.UserManager
 *  android.util.Log
 */
package com.android.car.ui.core;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.UserManager;
import android.util.Log;
import com.android.car.ui.baselayout.Insets;
import j$.util.DesugarArrays;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.function.IntFunction;

public class CarUiInstaller
extends ContentProvider {
    public static final int a = 0;
    private static final HashSet b = new HashSet();

    /*
     * WARNING - void declaration
     */
    public static Object a(ClassLoader object, Class object2, String string, Object object3, Object ... objectArray) {
        void var0_3;
        try {
            object = ((ClassLoader)object).loadClass(((Class)object2).getName());
            object2 = DesugarArrays.stream(objectArray);
            Object object4 = new bpf(1);
            object2 = object2.map(object4);
            object4 = new bjw();
            object = ((Class)object).getDeclaredMethod(string, (Class[])object2.toArray((IntFunction<A[]>)object4));
            ((Method)object).setAccessible(true);
            object = ((Method)object).invoke(object3, objectArray);
            return object;
        }
        catch (SecurityException securityException) {
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        object2 = String.valueOf(object3);
        object3 = new StringBuilder("Failed to make reflective call to ");
        ((StringBuilder)object3).append(string);
        ((StringBuilder)object3).append(" on ");
        ((StringBuilder)object3).append((String)object2);
        string = ((StringBuilder)object3).toString();
        object2 = var0_3;
        if (var0_3.getCause() != null) {
            object2 = var0_3.getCause();
        }
        throw new RuntimeException(string, (Throwable)object2);
    }

    /*
     * WARNING - void declaration
     */
    public static Object b(ClassLoader constructor, Insets insets) {
        void var0_3;
        if (insets == null) {
            return null;
        }
        try {
            constructor = ((ClassLoader)((Object)constructor)).loadClass(Insets.class.getName());
            Class<Integer> clazz = Integer.TYPE;
            constructor = ((Class)((Object)constructor)).getDeclaredConstructor(clazz, clazz, clazz, clazz);
            constructor.setAccessible(true);
            constructor = constructor.newInstance(insets.getLeft(), insets.getTop(), insets.getRight(), insets.getBottom());
            return constructor;
        }
        catch (SecurityException securityException) {
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_3);
    }

    public final int delete(Uri uri, String string, String[] stringArray) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean onCreate() {
        Object object = this.getContext();
        if (object != null && object.getApplicationContext() instanceof Application) {
            object.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
            Application application = (Application)object.getApplicationContext();
            object = new Thread(new akt(object, 19));
            if (Build.VERSION.SDK_INT >= 29) {
                if (ag$$ExternalSyntheticApiModelOutline1.m((UserManager)application.getSystemService(UserManager.class))) {
                    ((Thread)object).start();
                } else {
                    ag$$ExternalSyntheticApiModelOutline0.m(application, (BroadcastReceiver)new bjy((Thread)object), new IntentFilter("android.intent.action.USER_UNLOCKED"), 0);
                }
            } else {
                ((Thread)object).start();
            }
            object = b;
            // MONITORENTER : object
            boolean bl2 = ((HashSet)object).add(application);
            // MONITOREXIT : object
            if (!bl2) return true;
            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new bjx());
            return true;
        }
        Log.e((String)"CarUiInstaller", (String)"CarUiInstaller had a null context, unable to call register! Need app to call register by itself");
        return false;
    }

    public final Cursor query(Uri uri, String[] stringArray, String string, String[] stringArray2, String string2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        return 0;
    }
}

