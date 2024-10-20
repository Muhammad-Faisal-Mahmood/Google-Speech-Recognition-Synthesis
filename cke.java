/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

public final class cke {
    public static final Object a;
    public static boolean b;
    private static Method c;

    static {
        int n2 = cbp.c;
        a = new Object();
        c = null;
        b = false;
    }

    public static void a(Context context, String object) {
        try {
            if (c == null) {
                c = context.getClassLoader().loadClass((String)object).getMethod("insertProvider", Context.class);
            }
            c.invoke(null, context);
            return;
        }
        catch (Exception exception) {
            object = exception.getCause();
            if (Log.isLoggable((String)"ProviderInstaller", (int)6)) {
                String string = object == null ? exception.toString() : ((Throwable)object).toString();
                Log.e((String)"ProviderInstaller", (String)"Failed to install provider: ".concat(String.valueOf(string)));
            }
            throw new cce(8);
        }
    }
}

