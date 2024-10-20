/*
 * Decompiled with CFR 0.152.
 */
package j$.com.android.tools.r8;

import j$.com.android.tools.r8.a;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

public final class b {
    public final Unsafe a;
    public final Class b;
    public final long c;

    public /* synthetic */ b(Class serializable, String string, Class clazz) {
        Object object = j$.com.android.tools.r8.b.c();
        ((AccessibleObject)object).setAccessible(true);
        this.a = object = (Unsafe)((Field)object).get(null);
        this.b = ((Class)serializable).getDeclaredField(string).getType();
        if (clazz.isPrimitive() && clazz != Integer.TYPE && clazz != Long.TYPE) {
            serializable = new StringBuilder("Using a VarHandle for a field of type '");
            ((StringBuilder)serializable).append(clazz.getName());
            ((StringBuilder)serializable).append("' requires native VarHandle support available from Android 13. VarHandle desugaring only supports primitive types int and long and reference types.");
            throw new UnsupportedOperationException(((StringBuilder)serializable).toString());
        }
        this.c = ((Unsafe)object).objectFieldOffset(((Class)serializable).getDeclaredField(string));
    }

    public static /* synthetic */ Field c() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            return field;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers()) || !Unsafe.class.isAssignableFrom(field.getType())) continue;
                return field;
            }
            throw new UnsupportedOperationException("Couldn't find the Unsafe", noSuchFieldException);
        }
    }

    public static /* synthetic */ int j(Object object) {
        if (object instanceof Integer) {
            return (Integer)object;
        }
        if (object instanceof Byte) {
            return ((Byte)object).byteValue();
        }
        if (object instanceof Character) {
            return ((Character)object).charValue();
        }
        if (object instanceof Short) {
            return ((Short)object).shortValue();
        }
        throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public static /* synthetic */ long k(Object object) {
        if (object instanceof Long) {
            return (Long)object;
        }
        return j$.com.android.tools.r8.b.j(object);
    }

    public final /* synthetic */ boolean a(Object object, Object object2, Object object3) {
        Class clazz = this.b;
        Class<Integer> clazz2 = Integer.TYPE;
        if (clazz == clazz2) {
            clazz2 = this.a;
            int n2 = j$.com.android.tools.r8.b.j(object2);
            int n3 = j$.com.android.tools.r8.b.j(object3);
            return ((Unsafe)((Object)clazz2)).compareAndSwapInt(object, this.c, n2, n3);
        }
        if (clazz == Long.TYPE) {
            clazz2 = this.a;
            long l2 = j$.com.android.tools.r8.b.k(object2);
            long l3 = j$.com.android.tools.r8.b.k(object3);
            return ((Unsafe)((Object)clazz2)).compareAndSwapLong(object, this.c, l2, l3);
        }
        return j$.com.android.tools.r8.a.a(this.a, object, this.c, object2, object3);
    }

    public final /* synthetic */ Object b(Object object) {
        Class<Integer> clazz = Integer.TYPE;
        long l2 = this.c;
        Class clazz2 = this.b;
        if (clazz2 == clazz) {
            return this.a.getInt(object, l2);
        }
        if (clazz2 == Long.TYPE) {
            return this.a.getLong(object, l2);
        }
        return this.a.getObject(object, l2);
    }

    public final /* synthetic */ void d(int n2, Object object) {
        Class clazz = this.b;
        Class<Integer> clazz2 = Integer.TYPE;
        if (clazz == clazz2) {
            this.a.putInt(object, this.c, n2);
        } else if (clazz == Long.TYPE) {
            this.a.putLong(object, this.c, n2);
        } else {
            this.f(object, n2);
        }
    }

    public final /* synthetic */ void e(Object object, long l2) {
        block4: {
            block3: {
                Class clazz;
                block2: {
                    clazz = this.b;
                    Class<Long> clazz2 = Long.TYPE;
                    if (clazz != clazz2) break block2;
                    this.a.putLong(object, this.c, l2);
                    break block3;
                }
                if (clazz == Integer.TYPE) break block4;
                this.a.putObject(object, this.c, l2);
            }
            return;
        }
        throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public final /* synthetic */ void f(Object object, Object object2) {
        Class clazz = this.b;
        Class<Integer> clazz2 = Integer.TYPE;
        if (clazz == clazz2) {
            this.d(j$.com.android.tools.r8.b.j(object2), object);
        } else if (clazz == Long.TYPE) {
            this.e(object, j$.com.android.tools.r8.b.k(object2));
        } else {
            this.a.putObject(object, this.c, object2);
        }
    }

    public final /* synthetic */ void g(int n2, Object object) {
        Class clazz = this.b;
        Class<Integer> clazz2 = Integer.TYPE;
        if (clazz == clazz2) {
            this.a.putOrderedInt(object, this.c, n2);
        } else if (clazz == Long.TYPE) {
            this.a.putOrderedLong(object, this.c, n2);
        } else {
            this.i(object, n2);
        }
    }

    public final /* synthetic */ void h(Object object, long l2) {
        block4: {
            block3: {
                Class clazz;
                block2: {
                    clazz = this.b;
                    Class<Long> clazz2 = Long.TYPE;
                    if (clazz != clazz2) break block2;
                    this.a.putOrderedLong(object, this.c, l2);
                    break block3;
                }
                if (clazz == Integer.TYPE) break block4;
                this.a.putOrderedObject(object, this.c, l2);
            }
            return;
        }
        throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public final /* synthetic */ void i(Object object, Object object2) {
        Class clazz = this.b;
        Class<Integer> clazz2 = Integer.TYPE;
        if (clazz == clazz2) {
            this.g(j$.com.android.tools.r8.b.j(object2), object);
        } else if (clazz == Long.TYPE) {
            this.h(object, j$.com.android.tools.r8.b.k(object2));
        } else {
            this.a.putOrderedObject(object, this.c, object2);
        }
    }

    public final /* synthetic */ boolean l(ConcurrentLinkedQueue concurrentLinkedQueue, Object object, Object object2) {
        Object object3 = this.b;
        Class<Integer> clazz = Integer.TYPE;
        if (object3 == clazz) {
            object3 = this.a;
            int n2 = j$.com.android.tools.r8.b.j(object);
            int n3 = j$.com.android.tools.r8.b.j(object2);
            return ((Unsafe)object3).compareAndSwapInt(concurrentLinkedQueue, this.c, n2, n3);
        }
        if (object3 == Long.TYPE) {
            object3 = this.a;
            long l2 = j$.com.android.tools.r8.b.k(object);
            long l3 = j$.com.android.tools.r8.b.k(object2);
            return ((Unsafe)object3).compareAndSwapLong(concurrentLinkedQueue, this.c, l2, l3);
        }
        return j$.com.android.tools.r8.a.a(this.a, concurrentLinkedQueue, this.c, object, object2);
    }
}

