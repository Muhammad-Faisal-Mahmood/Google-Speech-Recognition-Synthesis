/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.A;
import j$.util.C;
import j$.util.D;
import j$.util.E;
import j$.util.J;
import j$.util.K;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.w;
import java.util.Collection;
import java.util.Iterator;

public final class Spliterators {
    private static final Spliterator a = new Object();
    private static final A b = new Object();

    private static void a(int n2, int n3, int n4) {
        if (n3 <= n4) {
            if (n3 >= 0) {
                if (n4 <= n2) {
                    return;
                }
                throw new ArrayIndexOutOfBoundsException(n4);
            }
            throw new ArrayIndexOutOfBoundsException(n3);
        }
        StringBuilder stringBuilder = new StringBuilder("origin(");
        stringBuilder.append(n3);
        stringBuilder.append(") > fence(");
        stringBuilder.append(n4);
        stringBuilder.append(")");
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public static A b() {
        return b;
    }

    public static Spliterator c() {
        return a;
    }

    public static w d(A a2) {
        Objects.requireNonNull(a2);
        return new D(a2);
    }

    public static Iterator e(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new C(spliterator);
    }

    public static A f(int[] nArray, int n2, int n3) {
        Spliterators.a(Objects.requireNonNull(nArray).length, n2, n3);
        return new J(nArray, n2, n3, 1040);
    }

    public static Spliterator g(Object[] objectArray, int n2, int n3, int n4) {
        Spliterators.a(Objects.requireNonNull(objectArray).length, n2, n3);
        return new E(objectArray, n2, n3, n4);
    }

    public static <T> Spliterator<T> spliterator(Collection<? extends T> collection, int n2) {
        return new K(Objects.requireNonNull(collection), n2);
    }
}

