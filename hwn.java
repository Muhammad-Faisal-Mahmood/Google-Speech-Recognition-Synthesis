/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class hwn
extends hvg
implements RandomAccess,
hxa,
hyn {
    public static final float[] a;
    public static final hwn b;
    public float[] c;
    public int d;

    static {
        float[] fArray = new float[]{};
        a = fArray;
        b = new hwn(fArray, 0, false);
    }

    hwn() {
        this(a, 0, true);
    }

    public hwn(float[] fArray, int n2, boolean bl2) {
        super(bl2);
        this.c = fArray;
        this.d = n2;
    }

    private final String h(int n2) {
        int n3 = this.d;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n2);
        stringBuilder.append(", Size:");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    private final void i(int n2) {
        if (n2 >= 0 && n2 < this.d) {
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n2));
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.bp();
        hxl.c(collection);
        if (!(collection instanceof hwn)) {
            return super.addAll(collection);
        }
        collection = (hwn)collection;
        int n2 = ((hwn)collection).d;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.d;
        if (Integer.MAX_VALUE - n3 >= n2) {
            float[] fArray = this.c;
            if ((n2 = n3 + n2) > fArray.length) {
                this.c = Arrays.copyOf(fArray, n2);
            }
            System.arraycopy(((hwn)collection).c, 0, this.c, this.d, ((hwn)collection).d);
            this.d = n2;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    public final float e(int n2) {
        this.i(n2);
        return this.c[n2];
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hwn)) {
            return super.equals(object);
        }
        object = (hwn)object;
        if (this.d != ((hwn)object).d) {
            return false;
        }
        object = ((hwn)object).c;
        for (int i2 = 0; i2 < this.d; ++i2) {
            if (Float.floatToIntBits(this.c[i2]) == Float.floatToIntBits((float)object[i2])) continue;
            return false;
        }
        return true;
    }

    @Override
    public final hxa f(int n2) {
        if (n2 >= this.d) {
            float[] fArray = n2 == 0 ? a : Arrays.copyOf(this.c, n2);
            return new hwn(fArray, this.d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void g(float f2) {
        float[] fArray;
        this.bp();
        int n2 = this.d;
        int n3 = this.c.length;
        if (n2 == n3) {
            fArray = new float[hvh.a(n3)];
            System.arraycopy(this.c, 0, fArray, 0, this.d);
            this.c = fArray;
        }
        fArray = this.c;
        n2 = this.d;
        this.d = n2 + 1;
        fArray[n2] = f2;
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.d; ++i2) {
            n2 = n2 * 31 + Float.floatToIntBits(this.c[i2]);
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Float)) {
            return -1;
        }
        float f2 = ((Float)object).floatValue();
        int n2 = this.d;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.c[i2] != f2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.bp();
        if (n3 >= n2) {
            float[] fArray = this.c;
            System.arraycopy(fArray, n3, fArray, n2, this.d - n3);
            this.d -= n3 - n2;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final int size() {
        return this.d;
    }
}

