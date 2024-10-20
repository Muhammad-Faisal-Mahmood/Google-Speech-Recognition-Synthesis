/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.Locale;
import java.util.Random;

public final class cyr {
    private static final Random a = new Random();

    public static String a(String string, Object ... objectArray) {
        return String.format(Locale.US, string, objectArray);
    }

    public static boolean b(long l2) {
        long l3 = l2 - 0L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (l4 <= 0) {
            if (l4 < 0) {
                cyr.g("Bad sample interval: %d", l2);
            }
            return false;
        }
        return a.nextLong() % l2 == 0L;
    }

    public static void c(String string, Object object) {
        if (Log.isLoggable((String)"MDD", (int)3)) {
            cyr.a(string, object);
        }
    }

    public static void d(String string, Object object, Object object2) {
        if (Log.isLoggable((String)"MDD", (int)3)) {
            cyr.a(string, object, object2);
        }
    }

    public static void e(String string, Object ... objectArray) {
        if (Log.isLoggable((String)"MDD", (int)3)) {
            cyr.a(string, objectArray);
        }
    }

    public static void f(String string) {
        if (Log.isLoggable((String)"MDD", (int)6)) {
            Log.e((String)"MDD", (String)string);
        }
    }

    public static void g(String string, Object object) {
        if (Log.isLoggable((String)"MDD", (int)6)) {
            Log.e((String)"MDD", (String)cyr.a(string, object));
        }
    }

    public static void h(String string, Object object, Object object2) {
        if (Log.isLoggable((String)"MDD", (int)6)) {
            Log.e((String)"MDD", (String)cyr.a(string, object, object2));
        }
    }

    public static void i(String string, Object ... objectArray) {
        if (Log.isLoggable((String)"MDD", (int)6)) {
            Log.e((String)"MDD", (String)cyr.a(string, objectArray));
        }
    }

    public static void j(Throwable throwable, String string, Object ... objectArray) {
        if (Log.isLoggable((String)"MDD", (int)6)) {
            cyr.q(throwable, cyr.a(string, objectArray));
        }
    }

    public static void k(String string, Object object, Object object2) {
        if (Log.isLoggable((String)"MDD", (int)2)) {
            cyr.a(string, object, object2);
        }
    }

    public static void l(String string, Object ... objectArray) {
        if (Log.isLoggable((String)"MDD", (int)2)) {
            cyr.a(string, objectArray);
        }
    }

    public static void m(String string, Object object) {
        if (Log.isLoggable((String)"MDD", (int)5)) {
            Log.w((String)"MDD", (String)cyr.a(string, object));
        }
    }

    public static void n(String string, Object object, Object object2) {
        if (Log.isLoggable((String)"MDD", (int)5)) {
            Log.w((String)"MDD", (String)cyr.a(string, object, object2));
        }
    }

    public static void o(Throwable serializable, String string, Object ... object) {
        if (Log.isLoggable((String)"MDD", (int)5)) {
            if (Log.isLoggable((String)"MDD", (int)3)) {
                Log.w((String)"MDD", (String)cyr.a(string, object), (Throwable)serializable);
                return;
            }
            string = cyr.a(string, object);
            object = String.valueOf(serializable);
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(string);
            ((StringBuilder)serializable).append(": ");
            ((StringBuilder)serializable).append((String)object);
            Log.w((String)"MDD", (String)((StringBuilder)serializable).toString());
        }
    }

    public static void p(String string, Object ... objectArray) {
        if (Log.isLoggable((String)"MDD", (int)3)) {
            cyr.a(string, objectArray);
        }
    }

    public static void q(Throwable object, String string) {
        if (Log.isLoggable((String)"MDD", (int)6)) {
            if (Log.isLoggable((String)"MDD", (int)3)) {
                Log.e((String)"MDD", (String)string, (Throwable)object);
                return;
            }
            object = String.valueOf(object);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
            Log.e((String)"MDD", (String)stringBuilder.toString());
        }
    }
}

