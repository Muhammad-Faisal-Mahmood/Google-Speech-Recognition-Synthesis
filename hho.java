/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public final class hho
extends AbstractSet {
    final int a;
    final hhp b;

    public hho(hhp hhp2, int n2) {
        this.b = hhp2;
        this.a = n2;
    }

    final int a() {
        int n2 = this.a;
        return this.b.c[n2 + 1];
    }

    final int b() {
        int n2 = this.a;
        if (n2 == -1) {
            return 0;
        }
        return this.b.c[n2];
    }

    final Object c(int n2) {
        int n3 = this.b();
        return this.b.b[n3 + n2];
    }

    @Override
    public final boolean contains(Object object) {
        Comparator comparator;
        int n2;
        int n3 = this.a;
        int n4 = this.b();
        return Arrays.binarySearch(this.b.b, n4, n2 = this.a(), object, comparator = n3 == -1 ? hhp.a : hhr.a) >= 0;
    }

    @Override
    public final Iterator iterator() {
        return new hhn(this);
    }

    @Override
    public final int size() {
        return this.a() - this.b();
    }
}

