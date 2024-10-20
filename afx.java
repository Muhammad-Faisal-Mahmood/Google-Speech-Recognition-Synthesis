/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public final class afx {
    private static final Object a = new Object();
    private static final afw b = afw.a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(String string, Throwable object) {
        Object object2;
        block6: {
            if (object == null) {
                object = null;
            } else {
                Object object3 = a;
                synchronized (object3) {
                    for (object2 = object; object2 != null; object2 = ((Throwable)object2).getCause()) {
                        if (!(object2 instanceof UnknownHostException)) continue;
                        object = "UnknownHostException (no network)";
                        break block6;
                    }
                    object = Log.getStackTraceString((Throwable)object).trim().replace("\t", "    ");
                }
            }
        }
        object2 = string;
        if (TextUtils.isEmpty((CharSequence)object)) return object2;
        object2 = ((String)object).replace("\n", "\n  ");
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("\n  ");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append("\n");
        return ((StringBuilder)object).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(String string, String string2) {
        Object object = a;
        synchronized (object) {
            b.a(string, string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(String string, String string2, Throwable throwable) {
        Object object = a;
        synchronized (object) {
            b.a(string, string2, throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(String string, String string2) {
        Object object = a;
        synchronized (object) {
            Log.i((String)string, (String)afx.a(string2, null));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(String string, String string2) {
        Object object = a;
        synchronized (object) {
            b.b(string, string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(String string, String string2, Throwable throwable) {
        Object object = a;
        synchronized (object) {
            b.b(string, string2, throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void g(String string) {
        Object object = a;
        synchronized (object) {
            afx.a(string, null);
            return;
        }
    }
}

