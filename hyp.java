/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.RandomAccess;

public final class hyp
extends hvg
implements RandomAccess {
    public static final Object[] a;
    public static final hyp b;
    private Object[] c;
    private int d;

    static {
        Object[] objectArray = new Object[]{};
        a = objectArray;
        b = new hyp(objectArray, 0, false);
    }

    hyp() {
        this(a, 0, true);
    }

    public hyp(Object[] objectArray, int n2, boolean bl2) {
        super(bl2);
        this.c = objectArray;
        this.d = n2;
    }

    private final String f(int n2) {
        int n3 = this.d;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n2);
        stringBuilder.append(", Size:");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    private final void g(int n2) {
        if (n2 >= 0 && n2 < this.d) {
            return;
        }
        throw new IndexOutOfBoundsException(this.f(n2));
    }

    @Override
    public final void add(int n2, Object object) {
        int n3;
        this.bp();
        if (n2 >= 0 && n2 <= (n3 = this.d)) {
            int n4 = n2 + 1;
            Object[] objectArray = this.c;
            int n5 = objectArray.length;
            if (n3 < n5) {
                System.arraycopy(objectArray, n2, objectArray, n4, n3 - n2);
            } else {
                objectArray = new Object[hvh.a(n5)];
                System.arraycopy(this.c, 0, objectArray, 0, n2);
                System.arraycopy(this.c, n2, objectArray, n4, this.d - n2);
                this.c = objectArray;
            }
            this.c[n2] = object;
            ++this.d;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.f(n2));
    }

    @Override
    public final boolean add(Object object) {
        this.bp();
        int n2 = this.d;
        int n3 = this.c.length;
        if (n2 == n3) {
            n3 = hvh.a(n3);
            this.c = Arrays.copyOf(this.c, n3);
        }
        Object[] objectArray = this.c;
        n3 = this.d;
        this.d = n3 + 1;
        objectArray[n3] = object;
        ++this.modCount;
        return true;
    }

    public final void e(int n2) {
        int n3 = this.c.length;
        if (n2 <= n3) {
            return;
        }
        if (n3 != 0) {
            while (n3 < n2) {
                n3 = hvh.a(n3);
            }
            this.c = Arrays.copyOf(this.c, n3);
            return;
        }
        this.c = new Object[Math.max(n2, 10)];
    }

    public final Object get(int n2) {
        this.g(n2);
        return this.c[n2];
    }

    @Override
    public final Object remove(int n2) {
        this.bp();
        this.g(n2);
        Object[] objectArray = this.c;
        Object object = objectArray[n2];
        int n3 = this.d;
        if (n2 < n3 - 1) {
            System.arraycopy(objectArray, n2 + 1, objectArray, n2, n3 - n2 - 1);
        }
        --this.d;
        ++this.modCount;
        return object;
    }

    @Override
    public final Object set(int n2, Object object) {
        this.bp();
        this.g(n2);
        Object[] objectArray = this.c;
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        ++this.modCount;
        return object2;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

