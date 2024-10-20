/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class hxw
extends hvg
implements RandomAccess,
hxe,
hyn {
    public static final hxw a;
    private static final long[] d;
    public long[] b;
    public int c;

    static {
        long[] lArray = new long[]{};
        d = lArray;
        a = new hxw(lArray, 0, false);
    }

    public hxw() {
        this(d, 0, true);
    }

    private hxw(long[] lArray, int n2, boolean bl2) {
        super(bl2);
        this.b = lArray;
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
    public final hxe a(int n2) {
        if (n2 >= this.c) {
            long[] lArray = n2 == 0 ? d : Arrays.copyOf(this.b, n2);
            return new hxw(lArray, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.bp();
        hxl.c(collection);
        if (!(collection instanceof hxw)) {
            return super.addAll(collection);
        }
        collection = (hxw)collection;
        int n2 = ((hxw)collection).c;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        if (Integer.MAX_VALUE - n3 >= n2) {
            long[] lArray = this.b;
            if ((n2 = n3 + n2) > lArray.length) {
                this.b = Arrays.copyOf(lArray, n2);
            }
            System.arraycopy(((hxw)collection).b, 0, this.b, this.c, ((hxw)collection).c);
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

    @Override
    public final void e(long l2) {
        long[] lArray;
        this.bp();
        int n2 = this.c;
        int n3 = this.b.length;
        if (n2 == n3) {
            lArray = new long[hvh.a(n3)];
            System.arraycopy(this.b, 0, lArray, 0, this.c);
            this.b = lArray;
        }
        lArray = this.b;
        n3 = this.c;
        this.c = n3 + 1;
        lArray[n3] = l2;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hxw)) {
            return super.equals(object);
        }
        object = (hxw)object;
        if (this.c != ((hxw)object).c) {
            return false;
        }
        object = ((hxw)object).b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.b[i2] == object[i2]) continue;
            return false;
        }
        return true;
    }

    public final long f(int n2) {
        this.h(n2);
        return this.b[n2];
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.c; ++i2) {
            n2 = n2 * 31 + hxl.a(this.b[i2]);
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Long)) {
            return -1;
        }
        long l2 = (Long)object;
        int n2 = this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.b[i2] != l2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.bp();
        if (n3 >= n2) {
            long[] lArray = this.b;
            System.arraycopy(lArray, n3, lArray, n2, this.c - n3);
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

