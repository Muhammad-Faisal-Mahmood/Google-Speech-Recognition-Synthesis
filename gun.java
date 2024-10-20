/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class gun {
    private static final Object a;

    static {
        Object object;
        a = object = gun.c();
        if (object != null) {
            gun.d("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (object != null) {
            gun.e(object);
        }
    }

    public static void a(Throwable throwable, Class clazz) {
        if (!clazz.isInstance(throwable)) {
            return;
        }
        throw (Throwable)clazz.cast(throwable);
    }

    public static void b(Throwable throwable) {
        if (!(throwable instanceof RuntimeException)) {
            if (!(throwable instanceof Error)) {
                return;
            }
            throw (Error)throwable;
        }
        throw (RuntimeException)throwable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object c() {
        Object object = null;
        try {
            Object object2 = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
            return object2;
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
        catch (Throwable throwable) {
            return object;
        }
    }

    private static Method d(String object, Class ... classArray) {
        try {
            object = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod((String)object, classArray);
            return object;
        }
        catch (Throwable throwable) {
            return null;
        }
        catch (ThreadDeath threadDeath) {
            throw threadDeath;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void e(Object object) {
        Method method;
        block4: {
            method = gun.d("getStackTraceDepth", Throwable.class);
            if (method != null) break block4;
            return;
        }
        try {
            Throwable throwable = new Throwable();
            method.invoke(object, throwable);
            return;
        }
        catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException exception) {
            return;
        }
    }
}

