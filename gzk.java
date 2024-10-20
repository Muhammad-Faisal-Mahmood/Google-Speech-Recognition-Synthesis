/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;

public class gzk
extends gzl {
    public Object[] a;
    public int b;
    boolean c;

    public gzk(int n2) {
        fvd.al(n2, "initialCapacity");
        this.a = new Object[n2];
        this.b = 0;
    }

    private final void g(int n2) {
        int n3 = this.a.length;
        if ((n2 = gzk.f(n3, this.b + n2)) <= n3 && !this.c) {
            return;
        }
        this.a = Arrays.copyOf(this.a, n2);
        this.c = false;
    }

    public final void a(Object[] objectArray, int n2) {
        hhk.C(objectArray, n2);
        this.g(n2);
        System.arraycopy(objectArray, 0, this.a, this.b, n2);
        this.b += n2;
    }

    public final void b(Object object) {
        fxf.K(object);
        this.g(1);
        Object[] objectArray = this.a;
        int n2 = this.b;
        this.b = n2 + 1;
        objectArray[n2] = object;
    }

    public final void d(Object ... objectArray) {
        this.a(objectArray, objectArray.length);
    }

    @Override
    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            this.g(collection.size());
            if (collection instanceof gzm) {
                this.b = ((gzm)collection).b(this.a, this.b);
                return;
            }
        }
        super.e(iterable);
    }
}

