/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class acf {
    public static final List a = jns.f(Application.class, abw.class);
    public static final List b = jns.d(abw.class);

    public static final ach a(Class clazz, Constructor object, Object ... objectArray) {
        jse.e(clazz, "modelClass");
        try {
            object = (ach)((Constructor)object).newInstance(Arrays.copyOf(objectArray, objectArray.length));
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Objects.toString(clazz);
            throw new RuntimeException("An exception happened in constructor of ".concat(String.valueOf(clazz)), invocationTargetException.getCause());
        }
        catch (InstantiationException instantiationException) {
            throw new RuntimeException(a.ak(clazz, "A ", " cannot be instantiated."), instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            Objects.toString(clazz);
            throw new RuntimeException("Failed to access ".concat(String.valueOf(clazz)), illegalAccessException);
        }
    }

    public static final Constructor b(Class clazz, List list) {
        jse.e(clazz, "modelClass");
        jse.e(list, "signature");
        Constructor<?>[] constructorArray = clazz.getConstructors();
        jse.d(constructorArray, "modelClass.constructors");
        for (Constructor<?> object : constructorArray) {
            Object object2 = object.getParameterTypes();
            jse.d(object2, "constructor.parameterTypes");
            object2 = jns.R((Object[])object2);
            if (jse.i(list, object2)) {
                jse.c(object, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return object;
            }
            if (list.size() != object2.size() || !object2.containsAll(list)) continue;
            StringBuilder stringBuilder = new StringBuilder("Class ");
            stringBuilder.append(clazz.getSimpleName());
            stringBuilder.append(" must have parameters in the proper order: ");
            stringBuilder.append(list);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
        return null;
    }
}

