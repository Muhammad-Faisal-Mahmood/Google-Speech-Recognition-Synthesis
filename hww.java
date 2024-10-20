/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class hww
extends hvg
implements RandomAccess,
hxb,
hyn {
    public static final hww a;
    private static final int[] d;
    public int[] b;
    public int c;

    static {
        int[] nArray = new int[]{};
        d = nArray;
        a = new hww(nArray, 0, false);
    }

    public hww() {
        this(d, 0, true);
    }

    private hww(int[] nArray, int n2, boolean bl2) {
        super(bl2);
        this.b = nArray;
        this.c = n2;
    }

    private final String h(int n2) {
        int n3 = this.c;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n2);
        stringBuilder.append(", Size:");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    private final void i(int n2) {
        if (n2 >= 0 && n2 < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n2));
    }

    @Override
    public final boolean addAll(Collection object) {
        this.bp();
        hxl.c(object);
        if (!(object instanceof hww)) {
            return super.addAll((Collection)object);
        }
        hww hww2 = (hww)object;
        int n2 = hww2.c;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        if (Integer.MAX_VALUE - n3 >= n2) {
            object = this.b;
            if ((n3 += n2) > ((Object)object).length) {
                this.b = Arrays.copyOf((int[])object, n3);
            }
            System.arraycopy(hww2.b, 0, this.b, this.c, hww2.c);
            this.c = n3;
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
    public final int e(int n2) {
        this.i(n2);
        return this.b[n2];
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hww)) {
            return super.equals(object);
        }
        object = (hww)object;
        if (this.c != ((hww)object).c) {
            return false;
        }
        object = ((hww)object).b;
        for (int i2 = 0; i2 < this.c; ++i2) {
            if (this.b[i2] == object[i2]) continue;
            return false;
        }
        return true;
    }

    @Override
    public final hxb f(int n2) {
        if (n2 >= this.c) {
            int[] nArray = n2 == 0 ? d : Arrays.copyOf(this.b, n2);
            return new hww(nArray, this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final void g(int n2) {
        int[] nArray;
        this.bp();
        int n3 = this.c;
        int n4 = this.b.length;
        if (n3 == n4) {
            nArray = new int[hvh.a(n4)];
            System.arraycopy(this.b, 0, nArray, 0, this.c);
            this.b = nArray;
        }
        nArray = this.b;
        n4 = this.c;
        this.c = n4 + 1;
        nArray[n4] = n2;
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.c; ++i2) {
            n2 = n2 * 31 + this.b[i2];
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        int n2 = (Integer)object;
        int n3 = this.c;
        for (int i2 = 0; i2 < n3; ++i2) {
            if (this.b[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.bp();
        if (n3 >= n2) {
            int[] nArray = this.b;
            System.arraycopy(nArray, n3, nArray, n2, this.c - n3);
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

