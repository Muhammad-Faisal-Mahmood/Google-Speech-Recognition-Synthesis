/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.d0_0;
import j$.util.stream.e_0;
import j$.util.stream.g;
import j$.util.stream.h0_0;
import j$.util.stream.s_0;
import j$.util.stream.t_0;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/*
 * Renamed from j$.util.stream.c
 */
public abstract class c_0 {
    public static /* bridge */ /* synthetic */ int a() {
        return ForkJoinPool.getCommonPoolParallelism();
    }

    public static /* bridge */ /* synthetic */ int b(s_0 s_02) {
        return s_02.getPendingCount();
    }

    public static /* bridge */ /* synthetic */ CountedCompleter c(g g2) {
        return g2.getCompleter();
    }

    public static /* bridge */ /* synthetic */ void d(e_0 e_02) {
        e_02.setPendingCount(1);
    }

    public static /* bridge */ /* synthetic */ void e(g g2) {
        g2.setPendingCount(1);
    }

    public static /* bridge */ /* synthetic */ void f(s_0 s_02) {
        s_02.tryComplete();
    }

    public static /* bridge */ /* synthetic */ void g(t_0 t_02) {
        t_02.addToPendingCount(1);
    }

    public static /* bridge */ /* synthetic */ void h(d0_0 d0_02) {
        d0_02.setPendingCount(1);
    }

    public static /* bridge */ /* synthetic */ void i(h0_0 h0_02) {
        h0_02.propagateCompletion();
    }

    public static /* bridge */ /* synthetic */ void j(h0_0 h0_02, int n2) {
        h0_02.setPendingCount(n2);
    }

    public static /* bridge */ /* synthetic */ void k(e_0 e_02) {
        e_02.tryComplete();
    }

    public static /* bridge */ /* synthetic */ void l(g g2) {
        g2.tryComplete();
    }

    public static /* bridge */ /* synthetic */ void m(s_0 s_02) {
        s_02.addToPendingCount(1);
    }

    public static /* bridge */ /* synthetic */ void n(t_0 t_02) {
        t_02.propagateCompletion();
    }

    public static /* bridge */ /* synthetic */ void o(d0_0 d0_02) {
        d0_02.propagateCompletion();
    }

    public static /* bridge */ /* synthetic */ void p(s_0 s_02) {
        s_02.addToPendingCount(-1);
    }
}

