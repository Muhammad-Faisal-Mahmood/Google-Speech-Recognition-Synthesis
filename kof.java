/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
import android.content.Context;
import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class kof {
    private static final String b = "kof";
    protected final Context a;

    protected kof(Context context) {
        if (context != null) {
            this.a = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    public static List c(Context context) {
        String string;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int n2 = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        if (!(n2 == 0 || (string = context.getResources().getString(n2)) == null || string.equals("com.google.android.gms.net.PlayServicesCronetProvider") || string.equals("com.google.android.gms.net.GmsCoreCronetProvider") || string.equals("org.chromium.net.impl.JavaCronetProvider") || string.equals("org.chromium.net.impl.NativeCronetProvider") || kof.g(context, string, 1, linkedHashSet, true))) {
            Log.e((String)b, (String)a.aj(string, "Unable to instantiate Cronet implementation class ", " that is listed as in the app string resource file under CronetProviderClassName key"));
        }
        kof.g(context, "com.google.android.gms.net.PlayServicesCronetProvider", 3, linkedHashSet, false);
        kof.g(context, "com.google.android.gms.net.GmsCoreCronetProvider", 3, linkedHashSet, false);
        kof.g(context, "org.chromium.net.impl.NativeCronetProvider", 2, linkedHashSet, false);
        kof.g(context, "org.chromium.net.impl.HttpEngineNativeProvider", 5, linkedHashSet, false);
        kof.g(context, "org.chromium.net.impl.JavaCronetProvider", 4, linkedHashSet, false);
        return DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static void f(String string, boolean bl2, Exception exception) {
        if (bl2) {
            string = "Unable to load provider class: ".concat(string);
            Log.e((String)b, (String)string, (Throwable)exception);
        }
    }

    private static boolean g(Context context, String string, int n2, Set set, boolean bl2) {
        Object object = context.getClassLoader();
        try {
            object = ((ClassLoader)object).loadClass(string).asSubclass(kof.class).getConstructor(Context.class);
            koe koe2 = new koe();
            koe2.a = (kof)((Constructor)object).newInstance(context);
            koe2.b = n2;
            set.add(koe2);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            kof.f(string, bl2, classNotFoundException);
        }
        catch (IllegalAccessException illegalAccessException) {
            kof.f(string, bl2, illegalAccessException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            kof.f(string, bl2, noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            kof.f(string, bl2, invocationTargetException);
        }
        catch (InstantiationException instantiationException) {
            kof.f(string, bl2, instantiationException);
        }
        return false;
    }

    public abstract String a();

    public abstract String b();

    public abstract kob d();

    public abstract void e();

    public final String toString() {
        String string = this.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder("[class=");
        stringBuilder.append(string);
        stringBuilder.append(", name=");
        stringBuilder.append(this.a());
        stringBuilder.append(", version=");
        stringBuilder.append(this.b());
        stringBuilder.append(", enabled=true]");
        return stringBuilder.toString();
    }
}

