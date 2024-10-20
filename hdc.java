/*
 * Decompiled with CFR 0.152.
 */
public final class hdc
extends hav {
    public static final hdc a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objectArray = new Object[]{};
        f = objectArray;
        a = new hdc(objectArray, 0, objectArray, 0, 0);
    }

    public hdc(Object[] objectArray, int n2, Object[] objectArray2, int n3, int n4) {
        this.b = objectArray;
        this.c = n2;
        this.d = objectArray2;
        this.g = n3;
        this.e = n4;
    }

    @Override
    public final int b(Object[] objectArray, int n2) {
        System.arraycopy(this.b, 0, objectArray, n2, this.e);
        return n2 + this.e;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean contains(Object object) {
        Object[] objectArray;
        if (object != null && (objectArray = this.d).length != 0) {
            int n2 = fvd.X(object);
            while (true) {
                Object object2;
                if ((object2 = objectArray[n2 &= this.g]) == null) {
                    return false;
                }
                if (object2.equals(object)) {
                    return true;
                }
                ++n2;
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.e;
    }

    @Override
    public final int e() {
        return 0;
    }

    @Override
    public final gzx h() {
        return gzx.i(this.b, this.e);
    }

    @Override
    public final int hashCode() {
        return this.c;
    }

    @Override
    public final hdx k() {
        return ((gzm)this).f().v();
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final Object[] m() {
        return this.b;
    }

    @Override
    public final int size() {
        return this.e;
    }

    @Override
    public Object writeReplace() {
        return super.writeReplace();
    }
}

