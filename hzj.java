/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  libcore.io.Memory
 */
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

public final class hzj {
    public static final boolean a;
    static final long b;
    static final boolean c;
    private static final Unsafe d;
    private static final Class e;
    private static final boolean f;
    private static final hzi g;
    private static final long h;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l2;
        Object object;
        boolean bl2;
        boolean bl3;
        Class<Long> clazz;
        block11: {
            clazz = hzj.j();
            d = clazz;
            e = Memory.class;
            f = bl3 = hzj.v(Long.TYPE);
            bl2 = hzj.v(Integer.TYPE);
            object = null;
            if (clazz != null) {
                if (bl3) {
                    object = new hzh((Unsafe)((Object)clazz));
                } else if (bl2) {
                    object = new hzg((Unsafe)((Object)clazz));
                }
            }
            g = object;
            bl2 = true;
            if (object != null) {
                object = ((hzi)object).a;
                try {
                    object = object.getClass();
                    ((Class)object).getMethod("objectFieldOffset", Field.class);
                    ((Class)object).getMethod("getLong", Object.class, Long.TYPE);
                    hzj.i();
                }
                catch (Throwable throwable) {
                    hzj.l(throwable);
                }
            }
            if ((object = g) != null) {
                object = ((hzi)object).a;
                try {
                    object = object.getClass();
                    ((Class)object).getMethod("objectFieldOffset", Field.class);
                    ((Class)object).getMethod("arrayBaseOffset", Class.class);
                    ((Class)object).getMethod("arrayIndexScale", Class.class);
                    ((Class)object).getMethod("getInt", Object.class, Long.TYPE);
                    ((Class)object).getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                    ((Class)object).getMethod("getLong", Object.class, Long.TYPE);
                    clazz = Long.TYPE;
                    ((Class)object).getMethod("putLong", Object.class, clazz, clazz);
                    ((Class)object).getMethod("getObject", Object.class, Long.TYPE);
                    ((Class)object).getMethod("putObject", Object.class, Long.TYPE, Object.class);
                    bl3 = true;
                    break block11;
                }
                catch (Throwable throwable) {
                    hzj.l(throwable);
                }
            }
            bl3 = false;
        }
        a = bl3;
        b = hzj.z(byte[].class);
        hzj.z(boolean[].class);
        hzj.B(boolean[].class);
        hzj.z(int[].class);
        hzj.B(int[].class);
        hzj.z(long[].class);
        hzj.B(long[].class);
        hzj.z(float[].class);
        hzj.B(float[].class);
        hzj.z(double[].class);
        hzj.B(double[].class);
        hzj.z(Object[].class);
        hzj.B(Object[].class);
        clazz = hzj.i();
        long l3 = l2 = -1L;
        if (clazz != null) {
            object = g;
            l3 = object == null ? l2 : ((hzi)object).a.objectFieldOffset((Field)((Object)clazz));
        }
        h = l3;
        bl3 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? bl2 : false;
        c = bl3;
    }

    private hzj() {
    }

    private static Field A(Class annotatedElement, String string) {
        try {
            annotatedElement = annotatedElement.getDeclaredField(string);
        }
        catch (Throwable throwable) {
            annotatedElement = null;
        }
        return annotatedElement;
    }

    private static void B(Class clazz) {
        if (a) {
            hzj.g.a.arrayIndexScale(clazz);
        }
    }

    static byte a(long l2) {
        return g.a(l2);
    }

    static double b(Object object, long l2) {
        return g.b(object, l2);
    }

    static float c(Object object, long l2) {
        return g.c(object, l2);
    }

    static int d(Object object, long l2) {
        return g.j(object, l2);
    }

    static long e(ByteBuffer byteBuffer) {
        return g.k(byteBuffer, h);
    }

    static long f(Object object, long l2) {
        return g.k(object, l2);
    }

    static Object g(Class object) {
        try {
            object = d.allocateInstance((Class<?>)object);
            return object;
        }
        catch (InstantiationException instantiationException) {
            throw new IllegalStateException(instantiationException);
        }
    }

    public static Object h(Object object, long l2) {
        return hzj.g.a.getObject(object, l2);
    }

    public static Field i() {
        Field field;
        Field field2 = field = hzj.A(Buffer.class, "effectiveDirectAddress");
        if (field == null) {
            field2 = hzj.A(Buffer.class, "address");
            if (field2 != null && field2.getType() == Long.TYPE) {
                return field2;
            }
            field2 = null;
        }
        return field2;
    }

    static Unsafe j() {
        Object object;
        try {
            object = new hzf();
            object = (Unsafe)AccessController.doPrivileged(object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    static void k(long l2, byte[] byArray, long l3, long l4) {
        g.d(l2, byArray, l3, l4);
    }

    public static void l(Throwable throwable) {
        Logger.getLogger(hzj.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(((Object)throwable).toString()));
    }

    static void m(Object object, long l2, boolean bl2) {
        g.e(object, l2, bl2);
    }

    static void n(byte[] byArray, long l2, byte by2) {
        g.f(byArray, b + l2, by2);
    }

    public static void o(Object object, long l2, byte by2) {
        int n2 = (~((int)l2) & 3) << 3;
        hzj.s(object, l2 &= 0xFFFFFFFFFFFFFFFCL, (by2 & 0xFF) << n2 | ~(255 << n2) & hzj.d(object, l2));
    }

    public static void p(Object object, long l2, byte by2) {
        int n2 = ((int)l2 & 3) << 3;
        hzj.s(object, l2 &= 0xFFFFFFFFFFFFFFFCL, (by2 & 0xFF) << n2 | ~(255 << n2) & hzj.d(object, l2));
    }

    static void q(Object object, long l2, double d2) {
        g.g(object, l2, d2);
    }

    static void r(Object object, long l2, float f2) {
        g.h(object, l2, f2);
    }

    static void s(Object object, long l2, int n2) {
        g.l(object, l2, n2);
    }

    static void t(Object object, long l2, long l3) {
        g.m(object, l2, l3);
    }

    public static void u(Object object, long l2, Object object2) {
        hzj.g.a.putObject(object, l2, object2);
    }

    static boolean v(Class clazz) {
        try {
            Class clazz2 = e;
            clazz2.getMethod("peekLong", clazz, Boolean.TYPE);
            clazz2.getMethod("pokeLong", clazz, Long.TYPE, Boolean.TYPE);
            clazz2.getMethod("pokeInt", clazz, Integer.TYPE, Boolean.TYPE);
            clazz2.getMethod("peekInt", clazz, Boolean.TYPE);
            clazz2.getMethod("pokeByte", clazz, Byte.TYPE);
            clazz2.getMethod("peekByte", clazz);
            Class<Integer> clazz3 = Integer.TYPE;
            clazz2.getMethod("pokeByteArray", clazz, byte[].class, clazz3, clazz3);
            clazz3 = Integer.TYPE;
            clazz2.getMethod("peekByteArray", clazz, byte[].class, clazz3, clazz3);
            return true;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    static boolean w(Object object, long l2) {
        return g.i(object, l2);
    }

    public static boolean x(Object object, long l2) {
        return (byte)(hzj.d(object, l2 & 0xFFFFFFFFFFFFFFFCL) >>> (int)(((l2 ^ 0xFFFFFFFFFFFFFFFFL) & 3L) << 3) & 0xFF) != 0;
    }

    public static boolean y(Object object, long l2) {
        return (byte)(hzj.d(object, l2 & 0xFFFFFFFFFFFFFFFCL) >>> (int)((3L & l2) << 3) & 0xFF) != 0;
    }

    private static int z(Class clazz) {
        if (a) {
            return hzj.g.a.arrayBaseOffset(clazz);
        }
        return -1;
    }
}

