/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class hvm
extends hvg
implements RandomAccess,
hxk,
hyn {
    public static final boolean[] a;
    public int b;
    private boolean[] c;

    static {
        boolean[] blArray = new boolean[]{};
        a = blArray;
        new hvm(blArray, 0, false);
    }

    hvm() {
        this(a, 0, true);
    }

    public hvm(boolean[] blArray, int n2, boolean bl2) {
        super(bl2);
        this.c = blArray;
        this.b = n2;
    }

    private final String g(int n2) {
        int n3 = this.b;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n2);
        stringBuilder.append(", Size:");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    private final void h(int n2) {
        if (n2 >= 0 && n2 < this.b) {
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n2));
    }

    @Override
    public final boolean addAll(Collection object) {
        this.bp();
        hxl.c(object);
        if (!(object instanceof hvm)) {
            return super.addAll((Collection)object);
        }
        hvm hvm2 = (hvm)object;
        int n2 = hvm2.b;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.b;
        if (Integer.MAX_VALUE - n3 >= n2) {
            object = this.c;
            if ((n2 = n3 + n2) > ((Object)object).length) {
                this.c = Arrays.copyOf((boolean[])object, n2);
            }
            System.arraycopy(hvm2.c, 0, this.c, this.b, hvm2.b);
            this.b = n2;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    public final void e(boolean bl2) {
        boolean[] blArray;
        this.bp();
        int n2 = this.b;
        int n3 = this.c.length;
        if (n2 == n3) {
            blArray = new boolean[hvh.a(n3)];
            System.arraycopy(this.c, 0, blArray, 0, this.b);
            this.c = blArray;
        }
        blArray = this.c;
        n3 = this.b;
        this.b = n3 + 1;
        blArray[n3] = bl2;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hvm)) {
            return super.equals(object);
        }
        object = (hvm)object;
        if (this.b != ((hvm)object).b) {
            return false;
        }
        object = ((hvm)object).c;
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (this.c[i2] == object[i2]) continue;
            return false;
        }
        return true;
    }

    public final boolean f(int n2) {
        this.h(n2);
        return this.c[n2];
    }

    @Override
    public final int hashCode() {
        int n2 = 1;
        for (int i2 = 0; i2 < this.b; ++i2) {
            n2 = n2 * 31 + a.f(this.c[i2]);
        }
        return n2;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Boolean)) {
            return -1;
        }
        boolean bl2 = (Boolean)object;
        int n2 = this.b;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.c[i2] != bl2) continue;
            return i2;
        }
        return -1;
    }

    @Override
    protected final void removeRange(int n2, int n3) {
        this.bp();
        if (n3 >= n2) {
            boolean[] blArray = this.c;
            System.arraycopy(blArray, n3, blArray, n2, this.b - n3);
            this.b -= n3 - n2;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final int size() {
        return this.b;
    }
}

