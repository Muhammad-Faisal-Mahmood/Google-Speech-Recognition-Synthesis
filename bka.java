/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.lang.reflect.Constructor;

public final class bka
implements Comparable {
    public final Class a;
    public final Class b;
    public final int c;

    public bka(String object, Class clazz, int n2) {
        try {
            object = Class.forName((String)object);
        }
        catch (ClassNotFoundException classNotFoundException) {
            object = null;
        }
        this.a = object;
        this.b = clazz;
        this.c = n2;
    }

    public final bkc a(Object object) {
        try {
            Constructor constructor = this.b.getDeclaredConstructor(this.a);
            constructor.setAccessible(true);
            object = (bkc)constructor.newInstance(object);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            object = this.b;
            Object object2 = this.a;
            object = object.toString();
            object2 = String.valueOf(object2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(" must have a constructor that accepts ");
            stringBuilder.append((String)object2);
            Log.e((String)"carui", (String)stringBuilder.toString());
            object = null;
        }
        return object;
    }
}

