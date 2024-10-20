/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;

final class gtj
extends AbstractList {
    final Object[] a;
    final Object b;
    final Object c;

    public gtj(Object[] objectArray, Object object, Object object2) {
        this.a = objectArray;
        this.b = object;
        this.c = object2;
    }

    @Override
    public final Object get(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                return this.a[n2 - 2];
            }
            return this.c;
        }
        return this.b;
    }

    @Override
    public final int size() {
        return this.a.length + 2;
    }
}

