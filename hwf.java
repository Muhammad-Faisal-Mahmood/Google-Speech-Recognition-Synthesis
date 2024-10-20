/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class hwf
extends hvg
implements RandomAccess,
hxk,
hyn {
    public static final double[] a;
    public double[] b;
    public int c;

    static {
        double[] dArray = new double[]{};
        a = dArray;
        new hwf(dArray, 0, false);
    }

    hwf() {
        this(a, 0, true);
    }

    public hwf(double[] dArray, int n2, boolean bl2) {
        super(bl2);
        this.b = dArray;
        this.c = n2;
    }

    private final String g(int n2) {
        int n3 = this.c;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n2);
        stringBuilder.append(", Size:");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    private final void h(int n2) {
        if (n2 >= 0 && n2 < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n2));
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.bp();
        hxl.c(collection);
        if (!(collection instanceof hwf)) {
            return super.addAll(collection);
        }
        collection = (hwf)collection;
        int n2 = ((hwf)collection).c;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        if (Integer.MAX_VALUE - n3 >= n2) {
            double[] dArray = this.b;
            if ((n2 = n3 + n2) > dArray.length) {
                this.b = Arrays.copyOf(dArray, n2);
            }
            System.arraycopy(((hwf)collection).b, 0, this.b, this.c, ((hwf)collection).c);
            this.c = n2;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    public final double e(int n2) {
        this.h(n2);
        return this.b[n2];
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hwf)) {
            return super.equals(object);
        }
        object = (hwf)object;
        if (this.c != ((hwf)object).c) {
            return false;
        }
        object = ((hwf)object).b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (Double.doubleToLongBits(this.b[i2]) == Double.doubleToLongBits((double)object[i2])) continue;
            return false;
        }
        return true;
    }

    public final void f(double d2) {
        double[] dArray;
        this.bp();
        int n2 = this.c;
        int n3 = this.b.length;
        if (n2 == n3) {
            dArray = new double[hvh.a(n3)];
            System.arraycopy(this.b, 0, dArray, 0, this.c);
            this.b = dArray;
        }
        dArray = this.b;
        n3 = this.c;
        this.c = n3 + 1;
        dArray[n3] = d2;
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.c; ++i2) {
            n2 = n2 * 31 + hxl.a(Double.doubleToLongBits(this.b[i2]));
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Double)) {
            return -1;
        }
        double d2 = (Double)object;
        int n2 = this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.b[i2] != d2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.bp();
        if (n3 >= n2) {
            double[] dArray = this.b;
            System.arraycopy(dArray, n3, dArray, n2, this.c - n3);
            this.c -= n3 - n2;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final int size() {
        return this.c;
    }
}

