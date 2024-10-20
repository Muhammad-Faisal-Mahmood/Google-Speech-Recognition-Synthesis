/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
import android.os.IBinder;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class cgz
extends bow
implements cha {
    private final Object a;

    public cgz() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public cgz(Object object) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = object;
    }

    public static Object b(cha object) {
        int n2;
        if (object instanceof cgz) {
            return ((cgz)object).a;
        }
        IBinder iBinder = object.asBinder();
        Field[] fieldArray = iBinder.getClass().getDeclaredFields();
        int n3 = fieldArray.length;
        object = null;
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            Field field = fieldArray[i2];
            n2 = n4;
            if (!field.isSynthetic()) {
                n2 = n4 + 1;
                object = field;
            }
            n4 = n2;
        }
        if (n4 == 1) {
            kl.at(object);
            if (!((AccessibleObject)object).isAccessible()) {
                ((Field)object).setAccessible(true);
                try {
                    object = ((Field)object).get(iBinder);
                    return object;
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalAccessException);
                }
                catch (NullPointerException nullPointerException) {
                    throw new IllegalArgumentException("Binder object is null.", nullPointerException);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        n2 = fieldArray.length;
        object = new StringBuilder("Unexpected number of IObjectWrapper declared fields: ");
        ((StringBuilder)object).append(n2);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}

