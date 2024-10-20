/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AppOpsManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$BaseSavedState
 */
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class rw {
    public rw() {
    }

    public rw(Context context, AttributeSet attributeSet) {
    }

    public static float A(float f2, float f3) {
        if (f2 < 0.0f) {
            return 0.0f;
        }
        if (f2 > f3) {
            return f3;
        }
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static File B(Context object) {
        File file = object.getCacheDir();
        if (file == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(".font");
        stringBuilder.append(Process.myPid());
        stringBuilder.append("-");
        stringBuilder.append(Process.myTid());
        stringBuilder.append("-");
        String string = stringBuilder.toString();
        int n2 = 0;
        while (n2 < 100) {
            Comparable<StringBuilder> comparable = new StringBuilder();
            ((StringBuilder)comparable).append(string);
            ((StringBuilder)comparable).append(n2);
            comparable = new File(file, ((StringBuilder)comparable).toString());
            try {
                boolean bl2 = ((File)comparable).createNewFile();
                if (bl2) {
                    return comparable;
                }
            }
            catch (IOException iOException) {}
            ++n2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void C(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean D(File object, InputStream inputStream) {
        void var0_3;
        Object object2;
        StrictMode.ThreadPolicy threadPolicy;
        block8: {
            Object object3;
            block9: {
                threadPolicy = StrictMode.allowThreadDiskWrites();
                Object var5_9 = null;
                File file = null;
                object2 = file;
                try {
                    object2 = file;
                    object3 = new FileOutputStream((File)object, false);
                }
                catch (Throwable throwable) {
                    break block8;
                }
                catch (IOException iOException) {
                    object = var5_9;
                    break block9;
                }
                try {
                    int n2;
                    object = new byte[1024];
                    while ((n2 = inputStream.read((byte[])object)) != -1) {
                        ((FileOutputStream)object3).write((byte[])object, 0, n2);
                    }
                }
                catch (Throwable throwable) {
                    object2 = object3;
                    break block8;
                }
                catch (IOException iOException) {
                    object = object3;
                    break block9;
                }
                rw.C((Closeable)object3);
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
                return true;
            }
            object2 = object;
            {
                void var1_7;
                object2 = object;
                object3 = new StringBuilder();
                object2 = object;
                ((StringBuilder)object3).append("Error copying resource contents to temp file: ");
                object2 = object;
                ((StringBuilder)object3).append(var1_7.getMessage());
                object2 = object;
                Log.e((String)"TypefaceCompatUtil", (String)((StringBuilder)object3).toString());
            }
            rw.C((Closeable)object);
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return false;
        }
        rw.C(object2);
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw var0_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean E(File object, Resources resources, int n2) {
        void var1_4;
        block4: {
            boolean bl2;
            InputStream inputStream;
            try {
                inputStream = resources.openRawResource(n2);
            }
            catch (Throwable throwable) {
                object = null;
                break block4;
            }
            try {
                bl2 = rw.D((File)object, inputStream);
            }
            catch (Throwable throwable) {
                object = inputStream;
                break block4;
            }
            rw.C(inputStream);
            return bl2;
        }
        rw.C((Closeable)object);
        throw var1_4;
    }

    public static /* synthetic */ List F(Object[] objectArray) {
        ArrayList<Object> arrayList = new ArrayList<Object>(objectArray.length);
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            arrayList.add(Objects.requireNonNull(objectArray[i2]));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static int s(AppOpsManager appOpsManager, String string, int n2, String string2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(string, n2, string2);
    }

    public static Intent t(Activity activity) {
        Object object = activity.getParentActivityIntent();
        if (object != null) {
            return object;
        }
        object = rw.v(activity);
        if (object == null) {
            return null;
        }
        ComponentName componentName = new ComponentName((Context)activity, (String)object);
        try {
            if (rw.w((Context)activity, componentName) == null) {
                activity = Intent.makeMainActivity((ComponentName)componentName);
            } else {
                activity = new Intent();
                activity = activity.setComponent(componentName);
            }
            return activity;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.e((String)"NavUtils", (String)a.aj((String)object, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
            return null;
        }
    }

    public static Intent u(Context context, ComponentName componentName) {
        String string = rw.w(context, componentName);
        if (string == null) {
            return null;
        }
        context = rw.w(context, componentName = new ComponentName(componentName.getPackageName(), string)) == null ? Intent.makeMainActivity((ComponentName)componentName) : new Intent().setComponent(componentName);
        return context;
    }

    public static String v(Activity object) {
        try {
            object = rw.w((Context)object, object.getComponentName());
            return object;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new IllegalArgumentException(nameNotFoundException);
        }
    }

    public static String w(Context context, ComponentName object) {
        Object object2 = context.getPackageManager();
        int n2 = Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072;
        object = object2.getActivityInfo((ComponentName)object, n2);
        object2 = ((ActivityInfo)object).parentActivityName;
        if (object2 != null) {
            return object2;
        }
        if (((ActivityInfo)object).metaData == null) {
            return null;
        }
        object = ((ActivityInfo)object).metaData.getString("android.support.PARENT_ACTIVITY");
        if (object == null) {
            return null;
        }
        if (((String)object).charAt(0) == '.') {
            return String.valueOf(context.getPackageName()).concat((String)object);
        }
        return object;
    }

    public static int x(Context context, String string, String string2) {
        return ((AppOpsManager)context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(string, string2);
    }

    /*
     * WARNING - void declaration
     */
    public static Handler y(Looper looper) {
        void var1_7;
        if (Build.VERSION.SDK_INT >= 28) {
            return fs$$ExternalSyntheticApiModelOutline0.m(looper);
        }
        try {
            Handler handler = (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, true);
            return handler;
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException(throwable);
            }
            throw (RuntimeException)throwable;
        }
        Log.w((String)"HandlerCompat", (String)"Unable to invoke Handler(Looper, Callback, boolean) constructor", (Throwable)var1_7);
        return new Handler(looper);
    }

    public static int z(int n2, int n3, int n4) {
        if (n2 < n3) {
            return n3;
        }
        if (n2 > n4) {
            return n4;
        }
        return n2;
    }

    public void a(rz rz2) {
    }

    public void b() {
    }

    public void c(CoordinatorLayout coordinatorLayout, View view, View view2, int n2) {
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, int n2) {
        return false;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean bl2) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(View view) {
        return false;
    }

    public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, int n2, int n3, int n4) {
        return false;
    }

    public boolean l(View view) {
        return false;
    }

    public void m(CoordinatorLayout coordinatorLayout, View view, View view2, int n2, int[] nArray, int n3) {
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, int n2, int n3, int n4, int[] nArray) {
        nArray[0] = nArray[0] + n3;
        nArray[1] = nArray[1] + n4;
    }

    public void o(View view, Parcelable parcelable) {
    }

    public Parcelable p(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int n2, int n3) {
        return false;
    }

    public boolean r(View view, Rect rect) {
        return false;
    }
}

