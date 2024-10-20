/*
 * Decompiled with CFR 0.152.
 */
package j$.sun.misc;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

public final class a {
    private static final a b;
    private final Unsafe a;

    static {
        Field field = j$.sun.misc.a.i();
        ((AccessibleObject)field).setAccessible(true);
        try {
            a a2;
            b = a2 = new a((Unsafe)field.get(null));
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError("Couldn't get the Unsafe", illegalAccessException);
        }
    }

    a(Unsafe unsafe) {
        this.a = unsafe;
    }

    public static a h() {
        return b;
    }

    private static Field i() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) || !Unsafe.class.isAssignableFrom(field.getType())) continue;
                return field;
            }
            throw new AssertionError("Couldn't find the Unsafe", noSuchFieldException);
        }
    }

    public final int a(Class clazz) {
        return this.a.arrayBaseOffset(clazz);
    }

    public final int b(Class clazz) {
        return this.a.arrayIndexScale(clazz);
    }

    public final boolean c(Object object, long l2, int n2, int n3) {
        return this.a.compareAndSwapInt(object, l2, n2, n3);
    }

    public final boolean d(Object object, long l2, long l3, long l4) {
        return this.a.compareAndSwapLong(object, l2, l3, l4);
    }

    public final boolean e(Object object, long l2, Object object2) {
        return j$.com.android.tools.r8.a.a(this.a, object, l2, null, object2);
    }

    public final int f(Object object, long l2) {
        int n2;
        while (!this.a.compareAndSwapInt(object, l2, n2 = this.a.getIntVolatile(object, l2), n2 - 4)) {
        }
        return n2;
    }

    public final Object g(Object object, long l2) {
        return this.a.getObjectVolatile(object, l2);
    }

    public final long j(Class clazz, String string) {
        try {
            long l2 = this.k(clazz.getDeclaredField(string));
            return l2;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new AssertionError("Cannot find field:", noSuchFieldException);
        }
    }

    public final long k(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final void l(Object object, long l2, Object object2) {
        this.a.putObjectVolatile(object, l2, object2);
    }
}

