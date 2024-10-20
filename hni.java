/*
 * Decompiled with CFR 0.152.
 */
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

final class hni
extends hmw {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        try {
            object = Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                object = new hnh();
                object = (Unsafe)AccessController.doPrivileged(object);
            }
            catch (PrivilegedActionException privilegedActionException) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException.getCause());
            }
        }
        try {
            c = ((Unsafe)object).objectFieldOffset(hnk.class.getDeclaredField("waiters"));
            b = ((Unsafe)object).objectFieldOffset(hnk.class.getDeclaredField("listeners"));
            d = ((Unsafe)object).objectFieldOffset(hnk.class.getDeclaredField("value"));
            e = ((Unsafe)object).objectFieldOffset(hnj.class.getDeclaredField("thread"));
            f = ((Unsafe)object).objectFieldOffset(hnj.class.getDeclaredField("next"));
            a = object;
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new RuntimeException(noSuchFieldException);
        }
    }

    @Override
    public final hna a(hnk hnk2, hna hna2) {
        hna hna3;
        while (hna2 != (hna3 = hnk2.listeners) && !this.e(hnk2, hna3, hna2)) {
        }
        return hna3;
    }

    @Override
    public final hnj b(hnk hnk2, hnj hnj2) {
        hnj hnj3;
        while (hnj2 != (hnj3 = hnk2.waiters) && !this.g(hnk2, hnj3, hnj2)) {
        }
        return hnj3;
    }

    @Override
    public final void c(hnj hnj2, hnj hnj3) {
        a.putObject(hnj2, f, hnj3);
    }

    @Override
    public final void d(hnj hnj2, Thread thread) {
        a.putObject(hnj2, e, thread);
    }

    @Override
    public final boolean e(hnk hnk2, hna hna2, hna hna3) {
        return hng.a(a, hnk2, b, hna2, hna3);
    }

    @Override
    public final boolean f(hnk hnk2, Object object, Object object2) {
        return hng.a(a, hnk2, d, object, object2);
    }

    @Override
    public final boolean g(hnk hnk2, hnj hnj2, hnj hnj3) {
        return hng.a(a, hnk2, c, hnj2, hnj3);
    }
}

