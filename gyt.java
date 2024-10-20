/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class gyt
extends gyv {
    static final gyv g(int n2) {
        gyv gyv2 = n2 < 0 ? gyv.c : (n2 > 0 ? gyv.d : gyv.b);
        return gyv2;
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final gyv b(int n2, int n3) {
        return gyt.g(Integer.compare(n2, n3));
    }

    @Override
    public final gyv c(Comparable comparable, Comparable comparable2) {
        return gyt.g(comparable.compareTo(comparable2));
    }

    @Override
    public final gyv d(Object object, Object object2, Comparator comparator) {
        return gyt.g(comparator.compare(object, object2));
    }

    @Override
    public final gyv e(boolean bl2, boolean bl3) {
        return gyt.g(Boolean.compare(bl2, bl3));
    }

    @Override
    public final gyv f(boolean bl2, boolean bl3) {
        return gyt.g(Boolean.compare(bl3, bl2));
    }
}

