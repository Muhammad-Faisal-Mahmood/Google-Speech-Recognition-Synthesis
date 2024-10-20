/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

public final class jqv {
    public static final Method a;

    static {
        GenericDeclaration genericDeclaration;
        Method[] methodArray = Throwable.class.getMethods();
        jse.b(methodArray);
        int n2 = methodArray.length;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            genericDeclaration = null;
            Class<?> clazz = null;
            if (n4 >= n2) break;
            Method method = methodArray[n4];
            if (jse.i(method.getName(), "addSuppressed")) {
                Class<?>[] classArray = method.getParameterTypes();
                jse.d(classArray, "getParameterTypes(...)");
                jse.e(classArray, "<this>");
                genericDeclaration = clazz;
                if (classArray.length == 1) {
                    genericDeclaration = classArray[0];
                }
                if (jse.i(genericDeclaration, Throwable.class)) {
                    genericDeclaration = method;
                    break;
                }
            }
            ++n4;
        }
        a = genericDeclaration;
        n2 = methodArray.length;
        for (n4 = n3; n4 < n2 && !jse.i(methodArray[n4].getName(), "getSuppressed"); ++n4) {
        }
    }
}

