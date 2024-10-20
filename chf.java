/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;

final class chf
implements chi {
    @Override
    public final int a(Context object, String string) {
        Object object2 = chk.b;
        int n2 = 0;
        try {
            object = object.getApplicationContext().getClassLoader();
            object2 = new StringBuilder("com.google.android.gms.dynamite.descriptors.");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(".ModuleDescriptor");
            object2 = ((ClassLoader)object).loadClass(((StringBuilder)object2).toString());
            object = ((Class)object2).getDeclaredField("MODULE_ID");
            object2 = ((Class)object2).getDeclaredField("MODULE_VERSION");
            if (!a.k(((Field)object).get(null), string)) {
                object2 = String.valueOf(((Field)object).get(null));
                object = new StringBuilder("Module descriptor id '");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append("' didn't match expected id '");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("'");
                Log.e((String)"DynamiteModule", (String)((StringBuilder)object).toString());
            } else {
                int n3;
                n2 = n3 = ((Field)object2).getInt(null);
            }
        }
        catch (Exception exception) {
            Log.e((String)"DynamiteModule", (String)"Failed to load module descriptor class: ".concat(String.valueOf(exception.getMessage())));
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder("Local module descriptor class for ");
            stringBuilder.append(string);
            stringBuilder.append(" not found.");
            Log.w((String)"DynamiteModule", (String)stringBuilder.toString());
        }
        return n2;
    }

    @Override
    public final int b(Context context, String string, boolean bl2) {
        return chk.a(context, string, bl2);
    }
}

