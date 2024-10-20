/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

public final class bbi {
    public static final Object a = new Object();
    public static volatile bbi b;
    public final int c;

    public bbi() {
        throw null;
    }

    public bbi(int n2) {
        this.c = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static bbi a() {
        Object object = a;
        synchronized (object) {
            bbi bbi2;
            if (b != null) return b;
            b = bbi2 = new bbi(3);
            return b;
        }
    }

    public static String b(String string) {
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("WM-");
        if (string.length() >= 20) {
            stringBuilder.append(string.substring(0, 20));
        } else {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public final void c(String string, String string2) {
        if (this.c <= 6) {
            Log.e((String)string, (String)string2);
        }
    }

    public final void d(String string, String string2, Throwable throwable) {
        if (this.c <= 6) {
            Log.e((String)string, (String)string2, (Throwable)throwable);
        }
    }

    public final void e(String string, String string2) {
        if (this.c <= 4) {
            Log.i((String)string, (String)string2);
        }
    }

    public final void f(String string, String string2) {
        if (this.c <= 5) {
            Log.w((String)string, (String)string2);
        }
    }

    public final void g(String string, String string2, Throwable throwable) {
        if (this.c <= 5) {
            Log.w((String)string, (String)string2, (Throwable)throwable);
        }
    }
}

