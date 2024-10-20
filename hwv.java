/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class hwv
extends hvd {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    protected hze unknownFields = hze.a;

    protected static final boolean A(hwv hwv2, boolean bl2) {
        byte by2 = (Byte)hwv2.C(1);
        if (by2 == 1) {
            return true;
        }
        if (by2 == 0) {
            return false;
        }
        boolean bl3 = hyo.a.b(hwv2).k(hwv2);
        if (bl2) {
            hwv hwv3 = true != bl3 ? null : hwv2;
            hwv2.a(2, hwv3);
        }
        return bl3;
    }

    public static void D(hwv hwv2) {
        if (hwv2 != null && !hwv2.v()) {
            throw new hzc().a();
        }
    }

    public static gpm E(hyf hyf2, hyf hyf3, hwy hwy2, int n2, hzm hzm2, boolean bl2) {
        return new gpm(hyf2, (Object)hyp.b, hyf3, new hwu(hwy2, n2, hzm2, true, bl2));
    }

    public static gpm F(hyf hyf2, Object object, hyf hyf3, int n2, hzm hzm2) {
        return new gpm(hyf2, object, hyf3, new hwu(null, n2, hzm2, false, false));
    }

    public static hwv o(hwv object, byte[] byArray, int n2, int n3, hwj hwj2) {
        if (n3 == 0) {
            return object;
        }
        hwv hwv2 = ((hwv)object).n();
        try {
            hyu hyu2 = hyo.a.b(hwv2);
            object = new hvj(hwj2);
            hyu2.i(hwv2, byArray, n2, n2 + n3, (hvj)object);
            hyu2.g(hwv2);
            return hwv2;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new hxn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        catch (IOException iOException) {
            if (iOException.getCause() instanceof hxn) {
                throw (hxn)iOException.getCause();
            }
            throw new hxn(iOException);
        }
        catch (hzc hzc2) {
            throw hzc2.a();
        }
        catch (hxn hxn2) {
            if (hxn2.a) {
                throw new hxn(hxn2);
            }
            throw hxn2;
        }
    }

    public static hxa p(hxa hxa2) {
        int n2 = hxa2.size();
        return hxa2.f(n2 + n2);
    }

    public static hxb q(hxb hxb2) {
        int n2 = hxb2.size();
        return hxb2.f(n2 + n2);
    }

    public static hxe r(hxe hxe2) {
        int n2 = hxe2.size();
        return hxe2.a(n2 + n2);
    }

    public static hxk s(hxk hxk2) {
        int n2 = hxk2.size();
        return hxk2.d(n2 + n2);
    }

    static Object w(Method object, Object object2, Object ... objectArray) {
        try {
            object = ((Method)object).invoke(object2, objectArray);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", illegalAccessException);
        }
    }

    protected static void z(Class clazz, hwv hwv2) {
        hwv2.y();
        defaultInstanceMap.put(clazz, hwv2);
    }

    public final boolean B() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final Object C(int n2) {
        return this.a(n2, null);
    }

    protected abstract Object a(int var1, Object var2);

    @Override
    public final /* synthetic */ hye aY() {
        return (hwp)this.C(5);
    }

    @Override
    public final void aZ(hwd object) {
        hyu hyu2 = hyo.a.b(this);
        dlm dlm2 = ((hwd)object).f;
        object = dlm2 != null ? dlm2 : new dlm((hwd)object);
        hyu2.m(this, (dlm)object);
    }

    @Override
    public final /* synthetic */ hye bh() {
        hwp hwp2 = (hwp)this.C(5);
        hwp2.x(this);
        return hwp2;
    }

    @Override
    public final int d(hyu hyu2) {
        if (this.B()) {
            int n2 = this.j(hyu2);
            if (n2 >= 0) {
                return n2;
            }
            throw new IllegalStateException(a.af(n2, "serialized size must be non-negative, was "));
        }
        int n3 = this.memoizedSerializedSize & Integer.MAX_VALUE;
        if (n3 != Integer.MAX_VALUE) {
            return n3;
        }
        n3 = this.j(hyu2);
        if (n3 >= 0) {
            this.memoizedSerializedSize = this.memoizedSerializedSize & Integer.MIN_VALUE | n3;
            return n3;
        }
        throw new IllegalStateException(a.af(n3, "serialized size must be non-negative, was "));
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        return hyo.a.b(this).j(this, (hwv)object);
    }

    public final int hashCode() {
        if (!this.B()) {
            int n2;
            int n3 = n2 = this.memoizedHashCode;
            if (n2 == 0) {
                this.memoizedHashCode = n3 = this.i();
            }
            return n3;
        }
        return this.i();
    }

    public final int i() {
        return hyo.a.b(this).b(this);
    }

    public final int j(hyu hyu2) {
        if (hyu2 == null) {
            return hyo.a.b(this).a(this);
        }
        return hyu2.a(this);
    }

    @Override
    public final int k() {
        int n2;
        block7: {
            block6: {
                block5: {
                    if (!this.B()) break block5;
                    n2 = this.j(null);
                    if (n2 < 0) {
                        throw new IllegalStateException(a.af(n2, "serialized size must be non-negative, was "));
                    }
                    break block6;
                }
                n2 = this.memoizedSerializedSize & Integer.MAX_VALUE;
                if (n2 != Integer.MAX_VALUE) break block6;
                n2 = this.j(null);
                if (n2 < 0) break block7;
                this.memoizedSerializedSize = this.memoizedSerializedSize & Integer.MIN_VALUE | n2;
            }
            return n2;
        }
        throw new IllegalStateException(a.af(n2, "serialized size must be non-negative, was "));
    }

    public final hwp l() {
        return (hwp)this.C(5);
    }

    public final hwp m(hwv hwv2) {
        hwp hwp2 = this.l();
        hwp2.x(hwv2);
        return hwp2;
    }

    public final hwv n() {
        return (hwv)this.C(4);
    }

    @Override
    public final /* synthetic */ hyf t() {
        return (hwv)this.C(6);
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string);
        hyh.b(this, stringBuilder, 0);
        return stringBuilder.toString();
    }

    @Override
    public final hym u() {
        return (hym)this.C(7);
    }

    @Override
    public final boolean v() {
        return hwv.A(this, true);
    }

    protected final void x() {
        hyo.a.b(this).g(this);
        this.y();
    }

    final void y() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }
}

