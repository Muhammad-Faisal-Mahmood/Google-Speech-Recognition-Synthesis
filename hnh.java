/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

class hnh
implements PrivilegedExceptionAction {
    public final /* synthetic */ Object run() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object object = field.get(null);
            if (!Unsafe.class.isInstance(object)) continue;
            return (Unsafe)Unsafe.class.cast(object);
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}

