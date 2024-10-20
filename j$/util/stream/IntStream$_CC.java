/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.A;
import j$.util.Spliterators;
import j$.util.stream.IntStream;
import j$.util.stream.M0;
import j$.util.stream.U0;
import j$.util.stream.b_0;

public final class IntStream$_CC {
    public static IntStream range(int n2, int n3) {
        if (n2 >= n3) {
            A a2 = Spliterators.b();
            return new b_0(a2, M0.p(a2), false);
        }
        U0 u0 = new U0(n2, n3, 0);
        return new b_0(u0, M0.p(u0), false);
    }
}

