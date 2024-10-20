/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class tl
extends tk {
    /*
     * WARNING - void declaration
     */
    @Override
    protected final Typeface c(Object object) {
        void var1_4;
        try {
            Object object2 = Array.newInstance(this.a, 1);
            Array.set(object2, 0, object);
            object = this.g;
            Integer n2 = -1;
            object = (Typeface)((Method)object).invoke(null, object2, "sans-serif", n2, n2);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_4);
    }

    @Override
    protected final Method e(Class genericDeclaration) {
        Class<?> clazz = Array.newInstance(genericDeclaration, 1).getClass();
        genericDeclaration = Integer.TYPE;
        genericDeclaration = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{clazz, String.class, genericDeclaration, genericDeclaration});
        ((Method)genericDeclaration).setAccessible(true);
        return genericDeclaration;
    }
}

