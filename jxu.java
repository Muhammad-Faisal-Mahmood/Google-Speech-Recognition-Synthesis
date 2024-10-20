/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CancellationException;

public class jxu
implements jxy {
    public final jrk a;
    public final jub b;
    public final jub c;
    public final juc d;
    public final juc e;
    private final int f;
    private final jub g;
    private final jub h;
    private final juc i;
    private final juc j;
    private final juc k;

    public jxu(int n2) {
        this.f = n2;
        this.a = null;
        if (n2 >= 0) {
            Object object = jud.a;
            long l2 = 0L;
            this.b = new jub(0L, (jse)object);
            this.c = new jub(0L, jud.a);
            int n3 = jxw.a;
            if (n2 != 0) {
                l2 = n2 != Integer.MAX_VALUE ? (long)n2 : Long.MAX_VALUE;
            }
            this.g = new jub(l2, jud.a);
            this.h = new jub(this.C(), jud.a);
            object = new kau(0L, null, this, 3);
            this.d = new juc(object, jud.a);
            this.e = new juc(object, jud.a);
            if (this.L()) {
                object = jxw.s;
                jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            jud jud2 = jud.a;
            this.i = new juc(object, jud2);
            this.j = new juc(jxw.r, jud2);
            this.k = new juc(null, jud2);
            return;
        }
        throw new IllegalArgumentException(a.ah(n2, "Invalid channel capacity: ", ", should be >=0"));
    }

    static /* synthetic */ void A(jxu jxu2) {
        jxu2.E(1L);
    }

    public static final void B(jxj jxj2, kau kau2, int n2) {
        jxj2.x(kau2, n2);
    }

    private final long C() {
        return this.g.b;
    }

    /*
     * Unable to fully structure code
     */
    private final void D() {
        block19: {
            if (this.L()) {
                return;
            }
            var10_1 = (kau)this.i.a;
            block0: while (true) {
                block23: {
                    block20: {
                        block18: {
                            block21: {
                                block22: {
                                    var2_3 = this.g.b();
                                    var4_4 = var2_3 / (long)jxw.a;
                                    if (this.b() <= var2_3) {
                                        if (var10_1.b < var4_4 && var10_1.b() != null) {
                                            this.O(var4_4, (kau)var10_1);
                                        }
                                        jxu.A(this);
                                        return;
                                    }
                                    var9_7 = var10_1;
                                    if (var10_1.b == var4_4) break block20;
                                    var9_7 = this.i;
                                    var12_9 = jxv.a;
                                    block1: while (!kbr.a(var11_8 = kat.a((kau)var10_1, var4_4, var12_9))) {
                                        var13_10 = kbr.b(var11_8);
                                        while (true) {
                                            var14_11 = (kau)var9_7.a;
                                            if (var14_11.b >= var13_10.b) break block1;
                                            if (!var13_10.j()) continue block1;
                                            if (var9_7.d(var14_11, var13_10)) {
                                                if (!var14_11.h()) break block1;
                                                var14_11.e();
                                                break block1;
                                            }
                                            if (!var13_10.h()) continue;
                                            var13_10.e();
                                        }
                                    }
                                    if (kbr.a(var11_8)) {
                                        this.q();
                                        this.O(var4_4, (kau)var10_1);
                                        jxu.A(this);
lbl34:
                                        // 3 sources

                                        while (true) {
                                            var9_7 = null;
                                            break block18;
                                            break;
                                        }
                                    }
                                    var9_7 = kbr.b(var11_8);
                                    var6_5 = var9_7.b;
                                    if (var6_5 <= var4_4) break block21;
                                    if (!this.g.c(1L + var2_3, var6_5 * (long)jxw.a)) break block22;
                                    this.E(var9_7.b * (long)jxw.a - var2_3);
                                    ** GOTO lbl34
                                }
                                jxu.A(this);
                                ** continue;
                            }
                            var8_6 = jve.a;
                        }
                        if (var9_7 == null) continue;
                    }
                    if (!((var10_1 = var9_7.m(var1_2 = (int)(var2_3 % (long)jxw.a))) instanceof jxj) || var2_3 < this.c.b || !var9_7.t(var1_2, var10_1, jxw.f)) break block23;
                    if (jxu.Q(var10_1)) {
                        var9_7.s(var1_2, jxw.c);
                        break block19;
                    }
                    var9_7.s(var1_2, jxw.i);
                    var9_7.q(var1_2, false);
                    ** GOTO lbl73
                }
                while (true) {
                    block26: {
                        block25: {
                            block24: {
                                if (!((var10_1 = var9_7.m(var1_2)) instanceof jxj)) break block24;
                                if (var2_3 < this.c.b) {
                                    if (!var9_7.t(var1_2, var10_1, new jyl((jxj)var10_1))) continue;
                                    break block19;
                                }
                                if (!var9_7.t(var1_2, var10_1, jxw.f)) continue;
                                if (jxu.Q(var10_1)) {
                                    var9_7.s(var1_2, jxw.c);
                                    break block19;
                                }
                                var9_7.s(var1_2, jxw.i);
                                var9_7.q(var1_2, false);
                                break block25;
                            }
                            if (var10_1 != jxw.i) break block26;
                        }
                        jxu.A(this);
                        var10_1 = var9_7;
                        continue block0;
                    }
                    if (var10_1 == null) {
                        if (!var9_7.t(var1_2, null, jxw.d)) continue;
                        break block19;
                    }
                    if (var10_1 == jxw.c || var10_1 == jxw.g || var10_1 == jxw.h || var10_1 == jxw.j || var10_1 == jxw.k) break block19;
                    if (var10_1 != jxw.e) break block0;
                }
                break;
            }
            Objects.toString(var10_1);
            throw new IllegalStateException("Unexpected cell state: ".concat(var10_1.toString()));
        }
        jxu.A(this);
    }

    private final void E(long l2) {
        if ((this.h.a(l2) & 0x4000000000000000L) != 0L) {
            while ((this.h.b & 0x4000000000000000L) != 0L) {
            }
        }
    }

    private final void F(jxj jxj2) {
        this.H(jxj2, true);
    }

    private final void G(jxj jxj2) {
        this.H(jxj2, false);
    }

    private final void H(jxj object, boolean bl2) {
        if (!(object instanceof jxr)) {
            if (object instanceof jul) {
                jqb jqb2 = (jqb)object;
                object = bl2 ? this.i() : this.j();
                jqb2.bD(jns.aj((Throwable)object));
                return;
            }
            if (object instanceof jyi) {
                ((jyi)object).a.bD(new jyc(new jya(this.h())));
                return;
            }
            if (object instanceof jxq) {
                object = (jxq)object;
                jul jul2 = ((jxq)object).b;
                jse.b(jul2);
                ((jxq)object).b = null;
                ((jxq)object).a = jxw.k;
                Throwable throwable = ((jxq)object).c.h();
                if (throwable == null) {
                    jul2.bD(false);
                    return;
                }
                object = throwable;
                if (jve.b) {
                    object = throwable;
                    if (jul2 instanceof jqp) {
                        object = kbs.a(throwable, jul2);
                    }
                }
                jul2.bD(jns.aj((Throwable)object));
                return;
            }
            if (object instanceof kcj) {
                object = (kcj)object;
                int n2 = jxw.a;
                throw null;
            }
            Objects.toString(object);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(object)));
        }
        object = (jxr)object;
        throw null;
    }

    private final boolean I(long l2) {
        return l2 < this.C() || l2 < this.a() + (long)this.f;
        {
        }
    }

    private final boolean J(long l2, boolean bl2) {
        boolean bl3;
        block23: {
            boolean bl4;
            int n2 = (int)(l2 >> 60);
            bl3 = bl4 = false;
            if (n2 != 0) {
                bl3 = bl4;
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 == 3) {
                            Object object;
                            Object object2;
                            Object object3 = this.N(l2 & 0xFFFFFFFFFFFFFFFL);
                            Object object4 = null;
                            block0: do {
                                n2 = jxw.a;
                                object = object4;
                                block1: while (--n2 >= 0) {
                                    long l3 = ((kau)object3).b;
                                    l2 = jxw.a;
                                    while ((object2 = ((kau)object3).m(n2)) != jxw.h) {
                                        long l4 = (long)n2 + l3 * l2;
                                        if (object2 == jxw.c) {
                                            if (l4 < this.a()) break block0;
                                            if (!((kau)object3).t(n2, object2, jxw.k)) continue;
                                            ((kau)object3).p(n2);
                                            ((kau)object3).g();
                                            continue block1;
                                        }
                                        if (object2 != jxw.d && object2 != null) {
                                            if (!(object2 instanceof jxj) && !(object2 instanceof jyl)) {
                                                object4 = jxw.f;
                                                if (object2 == object4 || object2 == jxw.e) break block0;
                                                if (object2 == object4) continue;
                                                continue block1;
                                            }
                                            if (l4 < this.a()) break block0;
                                            object4 = object2 instanceof jyl ? ((jyl)object2).a : (jxj)object2;
                                            if (!((kau)object3).t(n2, object2, jxw.k)) continue;
                                            object = kbf.a(object, object4);
                                            ((kau)object3).p(n2);
                                            ((kau)object3).g();
                                            continue block1;
                                        }
                                        if (!((kau)object3).t(n2, object2, jxw.k)) continue;
                                        ((kau)object3).g();
                                        continue block1;
                                    }
                                    break block0;
                                }
                                object3 = object2 = ((kau)object3).c();
                                object4 = object;
                            } while (object2 != null);
                            if (object != null) {
                                if (!(object instanceof ArrayList)) {
                                    this.G((jxj)object);
                                } else {
                                    object3 = (ArrayList)object;
                                    n2 = ((ArrayList)object3).size();
                                    while (--n2 >= 0) {
                                        this.G((jxj)((ArrayList)object3).get(n2));
                                    }
                                }
                            }
                            return true;
                        }
                        throw new IllegalStateException(a.af(n2, "unexpected close status: "));
                    }
                    this.N(l2 & 0xFFFFFFFFFFFFFFFL);
                    if (bl2) {
                        while (true) {
                            block24: {
                                kau kau2;
                                Object object = (kau)this.e.a;
                                l2 = this.a();
                                if (this.b() > l2) {
                                    long l5 = l2 / (long)jxw.a;
                                    kau2 = object;
                                    if (((kau)object).b != l5) {
                                        object = this.y(l5, (kau)object);
                                        kau2 = object;
                                        if (object == null) {
                                            if (((kau)this.e.a).b >= l5) continue;
                                        }
                                    }
                                } else {
                                    return true;
                                }
                                kau2.d();
                                n2 = (int)(l2 % (long)jxw.a);
                                do {
                                    if ((object = kau2.m(n2)) == null || object == jxw.d) continue;
                                    if (object == jxw.c) {
                                        bl3 = bl4;
                                        break block23;
                                    }
                                    if (object == jxw.i || object == jxw.k || object == jxw.h || object == jxw.g) break block24;
                                    if (object == jxw.f) {
                                        bl3 = bl4;
                                        break block23;
                                    }
                                    if (object == jxw.e || l2 != this.a()) break block24;
                                    bl3 = bl4;
                                    break block23;
                                } while (!kau2.t(n2, object, jxw.g));
                                this.D();
                            }
                            this.c.c(l2, 1L + l2);
                        }
                    }
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    private final boolean K(long l2) {
        return this.J(l2, true);
    }

    private final boolean L() {
        long l2 = this.C();
        return l2 == 0L || l2 == Long.MAX_VALUE;
        {
        }
    }

    private final int M(kau kau2, int n2, Object object, long l2, Object object2, boolean bl2) {
        block14: {
            block15: {
                block18: {
                    block17: {
                        block16: {
                            int n3;
                            Object object3;
                            block13: {
                                while (true) {
                                    object3 = kau2.m(n2);
                                    n3 = 0;
                                    if (object3 == null) {
                                        if (this.I(l2)) {
                                            if (!bl2) {
                                                if (!kau2.t(n2, null, jxw.c)) continue;
                                                return 1;
                                            }
                                        } else if (!bl2) {
                                            if (object2 == null) {
                                                return 3;
                                            }
                                            if (!kau2.t(n2, null, object2)) continue;
                                            return 2;
                                        }
                                        if (!kau2.t(n2, null, jxw.i)) continue;
                                        kau2.q(n2, false);
                                        return 4;
                                    }
                                    if (object3 != jxw.d) break block13;
                                    if (kau2.t(n2, object3, jxw.c)) break;
                                }
                                return 1;
                            }
                            if (object3 == jxw.j) break block14;
                            if (object3 == jxw.g) break block15;
                            if (object3 == jxw.k) {
                                kau2.p(n2);
                                this.q();
                                return 4;
                            }
                            bl2 = jve.a;
                            kau2.p(n2);
                            object2 = object3;
                            if (object3 instanceof jyl) {
                                object2 = ((jyl)object3).a;
                            }
                            if (!jxu.T(object2, object)) break block16;
                            kau2.s(n2, jxw.h);
                            n2 = n3;
                            break block17;
                        }
                        if (kau2.k(n2, jxw.j) != jxw.j) break block18;
                        n2 = 5;
                    }
                    return n2;
                }
                kau2.q(n2, true);
                return 5;
            }
            kau2.p(n2);
            return 5;
        }
        kau2.p(n2);
        return 5;
    }

    /*
     * Unable to fully structure code
     */
    private final kau N(long var1_1) {
        var11_2 = this.i.a;
        var12_3 = (kau)this.d.a;
        var10_4 = var11_2;
        if (var12_3.b > ((kau)var11_2).b) {
            var10_4 = var12_3;
        }
        var12_3 = (kau)this.e.a;
        var11_2 = var10_4;
        if (var12_3.b > ((kau)var10_4).b) {
            var11_2 = var12_3;
        }
        var10_4 = (kau)var11_2;
        while (true) {
            block19: {
                block18: {
                    var11_2 = var10_4.a();
                    var13_5 = kat.a;
                    var12_3 = null;
                    if (var11_2 == var13_5) break block18;
                    if ((var11_2 = (kau)var11_2) == null) {
                        if (!var10_4.a.d(null, var13_5)) continue;
                    }
                    break block19;
                }
                if (this.t()) {
                    block16: {
                        var11_2 = var10_4;
                        block1: do {
                            var3_6 = jxw.a;
                            block2: while (--var3_6 >= 0) {
                                var4_7 = var11_2.b;
                                var8_9 = jxw.a;
                                var6_8 = this.a();
                                if ((var4_7 = var4_7 * var8_9 + (long)var3_6) < var6_8) break block1;
                                do {
                                    if ((var13_5 = var11_2.m(var3_6)) == null || var13_5 == jxw.d) continue;
                                    if (var13_5 != jxw.c) continue block2;
                                    break block16;
                                } while (!var11_2.t(var3_6, var13_5, jxw.k));
                                var11_2.g();
                            }
                            var11_2 = var13_5 = var11_2.c();
                        } while (var13_5 != null);
                        var4_7 = -1L;
                    }
                    if (var4_7 != -1L) {
                        this.k(var4_7);
                    }
                }
                var13_5 = var10_4;
                var11_2 = var12_3;
                block4: while (true) {
                    var12_3 = var11_2;
                    if (var13_5 == null) break;
                    var3_6 = jxw.a;
                    while (--var3_6 >= 0) {
                        block17: {
                            var12_3 = var11_2;
                            if (var13_5.b * (long)jxw.a + (long)var3_6 < var1_1) break block4;
                            do lbl-1000:
                            // 4 sources

                            {
                                block20: {
                                    if ((var14_10 = var13_5.m(var3_6)) == null || var14_10 == jxw.d) continue;
                                    if (!(var14_10 instanceof jyl)) break block20;
                                    if (!var13_5.t(var3_6, var14_10, jxw.k)) ** GOTO lbl-1000
                                    var12_3 = kbf.a(var11_2, ((jyl)var14_10).a);
                                    var13_5.q(var3_6, true);
                                    break block17;
                                }
                                var12_3 = var11_2;
                                if (!(var14_10 instanceof jxj)) break block17;
                                if (!var13_5.t(var3_6, var14_10, jxw.k)) ** GOTO lbl-1000
                                var12_3 = kbf.a(var11_2, var14_10);
                                var13_5.q(var3_6, true);
                                break block17;
                            } while (!var13_5.t(var3_6, var14_10, jxw.k));
                            var13_5.g();
                            var12_3 = var11_2;
                        }
                        var11_2 = var12_3;
                    }
                    var13_5 = var13_5.c();
                }
                if (var12_3 != null) {
                    if (!(var12_3 instanceof ArrayList)) {
                        this.F((jxj)var12_3);
                    } else {
                        var11_2 = (ArrayList)var12_3;
                        var3_6 = var11_2.size();
                        while (--var3_6 >= 0) {
                            this.F((jxj)var11_2.get(var3_6));
                        }
                    }
                }
                return var10_4;
            }
            var10_4 = var11_2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void O(long var1_1, kau var3_2) {
        while (true) {
            var4_3 = var3_2;
            if (var3_2.b >= var1_1) break;
            var4_3 = var3_2.b();
            if (var4_3 == null) {
                var4_3 = var3_2;
                break;
            }
            var3_2 = var4_3;
        }
        block1: while (true) {
            if (var4_3.i() && (var3_2 = var4_3.b()) != null) {
                var4_3 = var3_2;
                continue;
            }
            var5_4 = this.i;
            while (true) {
                block10: {
                    block9: {
                        var3_2 = (kau)var5_4.a;
                        if (var3_2.b >= var4_3.b) break block9;
                        if (var4_3.j()) ** break;
                        continue block1;
                        if (!var5_4.d(var3_2, var4_3)) break block10;
                        if (var3_2.h()) {
                            var3_2.e();
                        }
                    }
                    return;
                }
                if (!var4_3.h()) continue;
                var4_3.e();
            }
            break;
        }
    }

    private static final void P(jxj jxj2, kau kau2, int n2) {
        jxj2.x(kau2, n2 + jxw.a);
    }

    private static final boolean Q(Object object) {
        if (object instanceof jul) {
            jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return jxw.c((jul)object, jon.a);
        }
        if (!(object instanceof kcj)) {
            if (object instanceof jxr) {
                object = (jxr)object;
                throw null;
            }
            Objects.toString(object);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(object)));
        }
        jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        object = (kcj)object;
        throw null;
    }

    private final Object R(jqb jqb2) {
        jul jul2 = new jul(jjj.n(jqb2), 1);
        jul2.r();
        Throwable throwable = this.j();
        Object object = throwable;
        if (jve.b) {
            object = kbs.a(throwable, jul2);
        }
        jul2.bD(jns.aj((Throwable)object));
        object = jul2.a();
        if (object == jqh.a) {
            jsd.j(jqb2);
        }
        if (object == jqh.a) {
            return object;
        }
        return jon.a;
    }

    private final void S(jul jul2) {
        Throwable throwable;
        Throwable throwable2 = throwable = this.j();
        if (jve.b) {
            throwable2 = kbs.a(throwable, jul2);
        }
        jul2.bD(jns.aj(throwable2));
    }

    private static final boolean T(Object object, Object object2) {
        block2: {
            block6: {
                boolean bl2;
                block4: {
                    block5: {
                        block3: {
                            if (object instanceof kcj) break block2;
                            if (!(object instanceof jyi)) break block3;
                            jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
                            bl2 = jxw.c(((jyi)object).a, new jyc(object2));
                            break block4;
                        }
                        if (!(object instanceof jxq)) break block5;
                        jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
                        jxq jxq2 = (jxq)object;
                        object = jxq2.b;
                        jse.b(object);
                        jxq2.b = null;
                        jxq2.a = object2;
                        object2 = jxq2.c;
                        bl2 = jxw.c((jul)object, true);
                        break block4;
                    }
                    if (!(object instanceof jul)) break block6;
                    jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                    bl2 = jxw.c((jul)object, object2);
                }
                return bl2;
            }
            Objects.toString(object);
            throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(object)));
        }
        object = (kcj)object;
        throw null;
    }

    /*
     * Unable to fully structure code
     */
    static /* synthetic */ Object d(jxu var0, jqb var1_1) {
        block10: {
            block9: {
                if (!(var1_1 instanceof jxs)) ** GOTO lbl-1000
                var7_2 = (jxs)var1_1;
                var2_3 = var7_2.c;
                if ((var2_3 & -2147483648) != 0) {
                    var7_2.c = var2_3 + -2147483648;
                    var1_1 = var7_2;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new jxs((jxu)var0, (jqb)var1_1);
                }
                var7_2 = var1_1.a;
                var9_4 = jqh.a;
                var2_3 = var1_1.c;
                if (var2_3 == 0) ** GOTO lbl18
                if (var2_3 == 1) {
                    jns.ak(var7_2);
                    var0 = ((jyc)var7_2).b;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
                    // 1 sources

                    jns.ak(var7_2);
                    var8_5 = (kau)var0.e.a;
                    while (true) {
                        if (var0.p()) {
                            var0 = new jya(var0.h());
                            break block9;
                        }
                        var3_6 = var0.c.b();
                        var5_7 = var3_6 / (long)jxw.a;
                        var2_3 = (int)(var3_6 % (long)jxw.a);
                        var7_2 = var8_5;
                        if (var8_5.b != var5_7 && (var7_2 = var0.y(var5_7, (kau)var8_5)) == null) continue;
                        var8_5 = var0.x((kau)var7_2, var2_3, var3_6, null);
                        if (var8_5 == jxw.l) break block10;
                        if (var8_5 != jxw.n) break;
                        var8_5 = var7_2;
                        if (var3_6 >= var0.b()) continue;
                        var7_2.d();
                        var8_5 = var7_2;
                    }
                    if (var8_5 == jxw.m) {
                        var1_1.c = 1;
                        var0 = var1_1 = var0.w((kau)var7_2, var2_3, var3_6, (jqb)var1_1);
                        if (var1_1 == var9_4) {
                            return var9_4;
                        }
                    } else {
                        var7_2.d();
                        var0 = var8_5;
                    }
                }
            }
            return var0;
        }
        throw new IllegalStateException("unexpected");
    }

    public final long a() {
        return this.c.b;
    }

    public final long b() {
        return this.b.b & 0xFFFFFFFFFFFFFFFL;
    }

    @Override
    public final Object c(jqb jqb2) {
        return jxu.d(this, jqb2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public Object e(Object var1_1, jqb var2_2) {
        block50: {
            block52: {
                block71: {
                    block51: {
                        block53: {
                            block64: {
                                block62: {
                                    block55: {
                                        block56: {
                                            block57: {
                                                block58: {
                                                    block59: {
                                                        block65: {
                                                            block66: {
                                                                block70: {
                                                                    block67: {
                                                                        block68: {
                                                                            block69: {
                                                                                block54: {
                                                                                    var12_8 = (kau)this.d.a;
                                                                                    while (true) {
                                                                                        var7_12 = this.b.b();
                                                                                        var5_11 = var7_12 & 0xFFFFFFFFFFFFFFFL;
                                                                                        var11_13 = this.s(var7_12);
                                                                                        var7_12 = var5_11 / (long)jxw.a;
                                                                                        var3_9 = (int)(var5_11 % (long)jxw.a);
                                                                                        if (var12_8.b != var7_12) {
                                                                                            var13_14 = this.z(var7_12, (kau)var12_8);
                                                                                            if (var13_14 == null) {
                                                                                                if (!var11_13) continue;
                                                                                                var1_1 = this.R((jqb)var2_2 /* !! */ );
                                                                                                if (var1_1 != jqh.a) break block50;
                                                                                                break block51;
                                                                                            }
                                                                                        } else {
                                                                                            var13_14 = var12_8;
                                                                                        }
                                                                                        if ((var4_10 = this.v((kau)var13_14, var3_9, var1_1, var5_11, null, var11_13)) == 0) break block52;
                                                                                        if (var4_10 == 1) break block50;
                                                                                        if (var4_10 == 2) break block53;
                                                                                        if (var4_10 == 3) break block54;
                                                                                        if (var4_10 == 4) break;
                                                                                        var13_14.d();
                                                                                        var12_8 = var13_14;
                                                                                    }
                                                                                    if (var5_11 < this.a()) {
                                                                                        var13_14.d();
                                                                                    }
                                                                                    if ((var1_1 = this.R((jqb)var2_2 /* !! */ )) != jqh.a) break block50;
                                                                                    break block51;
                                                                                }
                                                                                var14_15 = var12_8 = jsl.q(jjj.n((jqb)var2_2 /* !! */ ));
                                                                                var4_10 = this.v((kau)var13_14, var3_9, var1_1, var5_11, var12_8, false);
                                                                                if (var4_10 == 0) break block55;
                                                                                if (var4_10 == 1) break block56;
                                                                                if (var4_10 == 2) break block57;
                                                                                if (var4_10 == 4) break block58;
                                                                                if (var4_10 != 5) break block59;
                                                                                var14_15 = var12_8;
                                                                                var13_14.d();
                                                                                var14_15 = var12_8;
                                                                                var15_16 = (kau)this.d.a;
                                                                                while (true) {
                                                                                    block60: {
                                                                                        block63: {
                                                                                            block61: {
                                                                                                var14_15 = var13_14 = var12_8;
                                                                                                var7_12 = this.b.b();
                                                                                                var5_11 = var7_12 & 0xFFFFFFFFFFFFFFFL;
                                                                                                var14_15 = var13_14;
                                                                                                var11_13 = this.s(var7_12);
                                                                                                var14_15 = var13_14;
                                                                                                var9_17 = jxw.a;
                                                                                                var14_15 = var13_14;
                                                                                                var7_12 = var5_11 / var9_17;
                                                                                                var3_9 = (int)(var5_11 % var9_17);
                                                                                                var14_15 = var13_14;
                                                                                                var9_17 = var15_16.b;
                                                                                                if (var9_17 == var7_12) break block60;
                                                                                                var12_8 = this.z(var7_12, (kau)var15_16);
                                                                                                if (var12_8 != null) break block61;
                                                                                                var12_8 = var13_14;
                                                                                                if (!var11_13) continue;
                                                                                                try {
                                                                                                    this.S((jul)var13_14);
                                                                                                    var12_8 = var13_14;
                                                                                                    break block62;
                                                                                                }
                                                                                                catch (Throwable var2_3) {
                                                                                                    break block63;
                                                                                                }
                                                                                            }
                                                                                            var15_16 = var12_8;
                                                                                            break block60;
                                                                                            catch (Throwable var2_4) {
                                                                                                // empty catch block
                                                                                            }
                                                                                        }
                                                                                        var1_1 = var13_14;
                                                                                        break block64;
                                                                                    }
                                                                                    var14_15 = var12_8 = var13_14;
                                                                                    var4_10 = this.v((kau)var15_16, var3_9, var1_1, var5_11, var13_14, var11_13);
                                                                                    if (var4_10 == 0) break block65;
                                                                                    if (var4_10 == 1) break block66;
                                                                                    if (var4_10 == 2) break block67;
                                                                                    if (var4_10 == 3) break block68;
                                                                                    if (var4_10 == 4) break;
                                                                                    var14_15 = var12_8;
                                                                                    var15_16.d();
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                                var14_15 = var12_8;
                                                                                if (var5_11 >= this.a()) break block69;
                                                                                var14_15 = var12_8;
                                                                                var15_16.d();
                                                                            }
lbl102:
                                                                            // 4 sources

                                                                            while (true) {
                                                                                var1_1 = var12_8;
                                                                                this.S((jul)var12_8);
                                                                                break block62;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var1_1 = var12_8;
                                                                        var1_1 = var12_8;
                                                                        var2_2 /* !! */  = new IllegalStateException("unexpected");
                                                                        var1_1 = var12_8;
                                                                        throw var2_2 /* !! */ ;
                                                                    }
                                                                    if (!var11_13) break block70;
                                                                    var1_1 = var12_8;
                                                                    var15_16.g();
                                                                    ** GOTO lbl102
                                                                }
                                                                var1_1 = var12_8;
                                                                jxu.P((jxj)var12_8, (kau)var15_16, var3_9);
                                                                break block62;
                                                            }
                                                            var1_1 = var12_8;
                                                            var13_14 = jon.a;
lbl130:
                                                            // 4 sources

                                                            while (true) {
                                                                var1_1 = var12_8;
                                                                var12_8.bD(var13_14);
                                                                break block62;
                                                                break;
                                                            }
                                                        }
                                                        var1_1 = var12_8;
                                                        try {
                                                            var15_16.d();
                                                            var1_1 = var12_8;
                                                        }
                                                        catch (Throwable var2_6) {}
                                                        var13_14 = jon.a;
                                                        ** GOTO lbl130
                                                    }
                                                    var1_1 = var12_8;
                                                    var1_1 = var12_8;
                                                    var2_2 /* !! */  = new IllegalStateException("unexpected");
                                                    var1_1 = var12_8;
                                                    throw var2_2 /* !! */ ;
                                                }
                                                var12_8 = var14_15 = var12_8;
                                                var1_1 = var14_15;
                                                if (var5_11 >= this.a()) ** GOTO lbl102
                                                var1_1 = var14_15;
                                                var13_14.d();
                                                var12_8 = var14_15;
                                                ** continue;
                                            }
                                            var1_1 = var12_8;
                                            jxu.P((jxj)var12_8, (kau)var13_14, var3_9);
                                            break block62;
                                        }
                                        var1_1 = var12_8;
                                        var13_14 = jon.a;
                                        ** GOTO lbl130
                                    }
                                    var1_1 = var12_8;
                                    var13_14.d();
                                    var1_1 = var12_8;
                                    var13_14 = jon.a;
                                    ** continue;
                                }
                                var12_8 = var12_8.a();
                                if (var12_8 == jqh.a) {
                                    jsd.j((jqb)var2_2 /* !! */ );
                                }
                                var2_2 /* !! */  = jqh.a;
                                var1_1 = var12_8;
                                if (var12_8 != var2_2 /* !! */ ) {
                                    var1_1 = jon.a;
                                }
                                if (var1_1 != var2_2 /* !! */ ) break block50;
                                break block51;
                                break block64;
                                catch (Throwable var2_7) {
                                    var1_1 = var14_15;
                                }
                            }
                            var1_1.u();
                            throw var2_5;
                        }
                        if (!var11_13) break block71;
                        var13_14.g();
                        var1_1 = this.R((jqb)var2_2 /* !! */ );
                        if (var1_1 != jqh.a) break block50;
                    }
                    return var1_1;
                }
                var11_13 = jve.a;
                break block50;
            }
            var13_14.d();
        }
        return jon.a;
    }

    @Override
    public final Object f() {
        block10: {
            Object object;
            block9: {
                long l2 = this.c.b;
                long l3 = this.b.b;
                if (this.K(l3)) {
                    return new jya(this.h());
                }
                if (l2 >= (l3 & 0xFFFFFFFFFFFFFFFL)) {
                    return jyc.a;
                }
                object = this.e;
                kbt kbt2 = jxw.j;
                Object object2 = (kau)((juc)object).a;
                while (true) {
                    if (this.p()) {
                        object = new jya(this.h());
                        break block9;
                    }
                    l3 = this.c.b();
                    long l4 = jxw.a;
                    l2 = l3 / l4;
                    int n2 = (int)(l3 % l4);
                    object = object2;
                    if (((kau)object2).b != l2 && (object = this.y(l2, (kau)object2)) == null) continue;
                    object2 = this.x((kau)object, n2, l3, kbt2);
                    if (object2 == jxw.l) {
                        this.m(l3);
                        ((kau)object).g();
                        object = jyc.a;
                        break block9;
                    }
                    if (object2 != jxw.n) break;
                    object2 = object;
                    if (l3 >= this.b()) continue;
                    ((kau)object).d();
                    object2 = object;
                }
                if (object2 == jxw.m) break block10;
                ((kau)object).d();
                object = object2;
            }
            return object;
        }
        throw new IllegalStateException("unexpected");
    }

    @Override
    public Object g(Object object) {
        block7: {
            Object object2;
            block8: {
                block9: {
                    boolean bl2;
                    block10: {
                        block11: {
                            long l2 = this.b.b;
                            if (!this.s(l2) && !this.I(l2 & 0xFFFFFFFFFFFFFFFL)) {
                                return jyc.a;
                            }
                            object2 = this.d;
                            kbt kbt2 = jxw.i;
                            object2 = (kau)((juc)object2).a;
                            while (true) {
                                long l3 = this.b.b();
                                l2 = l3 & 0xFFFFFFFFFFFFFFFL;
                                bl2 = this.s(l3);
                                long l4 = jxw.a;
                                l3 = l2 / l4;
                                int n2 = (int)(l2 % l4);
                                if (((kau)object2).b != l3) {
                                    kau kau2 = this.z(l3, (kau)object2);
                                    if (kau2 == null) {
                                        if (!bl2) continue;
                                        object = new jya(this.j());
                                        break block7;
                                    }
                                    object2 = kau2;
                                }
                                if ((n2 = this.v((kau)object2, n2, object, l2, kbt2, bl2)) == 0) break block8;
                                if (n2 == 1) break block9;
                                if (n2 == 2) break block10;
                                if (n2 == 3) break block11;
                                if (n2 == 4) break;
                                ((kau)object2).d();
                            }
                            if (l2 < this.a()) {
                                ((kau)object2).d();
                            }
                            object = new jya(this.j());
                            break block7;
                        }
                        throw new IllegalStateException("unexpected");
                    }
                    if (bl2) {
                        ((kau)object2).g();
                        object = new jya(this.j());
                    } else {
                        ((kau)object2).g();
                        object = jyc.a;
                    }
                    break block7;
                }
                object = jon.a;
                break block7;
            }
            ((kau)object2).d();
            object = jon.a;
        }
        return object;
    }

    public final Throwable h() {
        return (Throwable)this.j.a;
    }

    public final Throwable i() {
        Throwable throwable;
        Throwable throwable2 = throwable = this.h();
        if (throwable == null) {
            throwable2 = new jyd();
        }
        return throwable2;
    }

    protected final Throwable j() {
        Throwable throwable;
        Throwable throwable2 = throwable = this.h();
        if (throwable == null) {
            throwable2 = new jye();
        }
        return throwable2;
    }

    protected final void k(long l2) {
        boolean bl2 = jve.a;
        Object object = (kau)this.e.a;
        while (true) {
            Object object2 = this.c;
            int n2 = this.f;
            long l3 = ((jub)object2).b;
            if (l2 < Math.max((long)n2 + l3, this.C())) {
                return;
            }
            if (!this.c.c(l3, 1L + l3)) continue;
            long l4 = l3 / (long)jxw.a;
            n2 = (int)(l3 % (long)jxw.a);
            object2 = object;
            if (((kau)object).b != l4 && (object2 = this.y(l4, (kau)object)) == null) continue;
            if (this.x((kau)object2, n2, l3, null) == jxw.n) {
                object = object2;
                if (l3 >= this.b()) continue;
                ((kau)object2).d();
                object = object2;
                continue;
            }
            ((kau)object2).d();
            object = object2;
        }
    }

    @Override
    public final void l(jrk jrk2) {
        Object object;
        if (this.k.d(null, jrk2)) {
            return;
        }
        juc juc2 = this.k;
        while ((object = juc2.a) == jxw.p) {
            if (!this.k.d(jxw.p, jxw.q)) continue;
            jrk2.a(this.h());
            return;
        }
        if (object == jxw.q) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        Objects.toString(object);
        throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(object)));
    }

    public final void m(long l2) {
        block8: {
            if (!this.L()) {
                while (this.C() <= l2) {
                }
                int n2 = jxw.b;
                for (int i2 = 0; i2 < n2; ++i2) {
                    l2 = this.C();
                    if (l2 != (0x3FFFFFFFFFFFFFFFL & this.h.b) || l2 != this.C()) {
                        continue;
                    }
                    break block8;
                }
                jub jub2 = this.h;
                while (!jub2.c(l2 = jub2.b, jxw.a(l2 & 0x3FFFFFFFFFFFFFFFL, true))) {
                }
                while (true) {
                    long l3;
                    long l4;
                    if ((l4 = this.C()) == (l3 = (l2 = this.h.b) & 0x3FFFFFFFFFFFFFFFL) && l4 == this.C()) {
                        jub2 = this.h;
                        while (!jub2.c(l2 = jub2.b, jxw.a(l2 & 0x3FFFFFFFFFFFFFFFL, false))) {
                        }
                        break;
                    }
                    if ((0x4000000000000000L & l2) != 0L) continue;
                    this.h.c(l2, jxw.a(l3, true));
                }
            }
        }
    }

    @Override
    public final boolean n(Throwable throwable) {
        return this.o(throwable, false);
    }

    protected final boolean o(Throwable object, boolean bl2) {
        long l2;
        Object object2;
        if (bl2) {
            object2 = this.b;
            while ((int)((l2 = ((jub)object2).b) >> 60) == 0 && !((jub)object2).c(l2, jxw.b(l2 & 0xFFFFFFFFFFFFFFFL, 1))) {
            }
        }
        boolean bl3 = this.j.d(jxw.r, object);
        if (bl2) {
            object = this.b;
            while (!((jub)object).c(l2 = ((jub)object).b, jxw.b(l2 & 0xFFFFFFFFFFFFFFFL, 3))) {
            }
        } else {
            long l3;
            object = this.b;
            do {
                int n2;
                if ((n2 = (int)((l3 = ((jub)object).b) >> 60)) != 0) {
                    if (n2 != 1) break;
                    l2 = jxw.b(l3 & 0xFFFFFFFFFFFFFFFL, 3);
                    continue;
                }
                l2 = jxw.b(l3 & 0xFFFFFFFFFFFFFFFL, 2);
            } while (!((jub)object).c(l3, l2));
        }
        this.q();
        if (bl3) {
            Object object3;
            object2 = this.k;
            while (!((juc)object2).d(object3, object = (object3 = ((juc)object2).a) == null ? jxw.p : jxw.q)) {
            }
            if (object3 != null) {
                jsl.c(object3, 1);
                ((jrk)object3).a(this.h());
                return true;
            }
        }
        return bl3;
    }

    public final boolean p() {
        return this.K(this.b.b);
    }

    @Override
    public final boolean q() {
        return this.s(this.b.b);
    }

    @Override
    public final void r(CancellationException cancellationException) {
        this.o(cancellationException, true);
    }

    public final boolean s(long l2) {
        return this.J(l2, false);
    }

    protected boolean t() {
        return false;
    }

    public final String toString() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = (int)(this.b.b >> 60);
        if (n2 != 2) {
            if (n2 == 3) {
                stringBuilder.append("cancelled,");
            }
        } else {
            stringBuilder.append("closed,");
        }
        n2 = this.f;
        Object object2 = new StringBuilder("capacity=");
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append(",");
        stringBuilder.append(((StringBuilder)object2).toString());
        stringBuilder.append("data=[");
        Object object3 = jns.f((kau)this.e.a, (kau)this.d.a, (kau)this.i.a);
        object2 = new ArrayList();
        object3 = object3.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            if ((kau)object == jxw.s) continue;
            object2.add(object);
        }
        Iterator iterator = object2.iterator();
        if (iterator.hasNext()) {
            long l2;
            long l3;
            object2 = object3 = iterator.next();
            if (iterator.hasNext()) {
                l3 = ((kau)object3).b;
                do {
                    object = iterator.next();
                    l2 = ((kau)object).b;
                    long l4 = l3 - l2;
                    n2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (n2 > 0) {
                        l3 = l2;
                    }
                    object2 = object3;
                    if (n2 > 0) {
                        object2 = object;
                    }
                    object3 = object2;
                } while (iterator.hasNext());
            }
            object3 = (kau)object2;
            l3 = this.a();
            long l5 = this.b();
            block2: do {
                int n3 = jxw.a;
                for (n2 = 0; n2 < n3; ++n2) {
                    long l6;
                    l2 = ((kau)object3).b * (long)jxw.a + (long)n2;
                    long l7 = l2 - l5;
                    long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (l8 >= 0 && l2 >= l3) break block2;
                    object2 = ((kau)object3).m(n2);
                    object = ((kau)object3).l(n2);
                    if (object2 instanceof jul) {
                        l6 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        object2 = l6 < 0 && l8 >= 0 ? "receive" : (l8 < 0 && l6 >= 0 ? "send" : "cont");
                    } else if (object2 instanceof kcj) {
                        l6 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        object2 = l6 < 0 && l8 >= 0 ? "onReceive" : (l8 < 0 && l6 >= 0 ? "onSend" : "select");
                    } else if (object2 instanceof jyi) {
                        object2 = "receiveCatching";
                    } else if (object2 instanceof jxr) {
                        object2 = "sendBroadcast";
                    } else if (object2 instanceof jyl) {
                        object2 = a.ak(object2, "EB(", ")");
                    } else if (!jse.i(object2, jxw.e) && !jse.i(object2, jxw.f)) {
                        if (object2 == null || jse.i(object2, jxw.d) || jse.i(object2, jxw.h) || jse.i(object2, jxw.g) || jse.i(object2, jxw.j) || jse.i(object2, jxw.i) || jse.i(object2, jxw.k)) continue;
                        object2 = object2.toString();
                    } else {
                        object2 = "resuming_sender";
                    }
                    if (object != null) {
                        iterator = new StringBuilder("(");
                        ((StringBuilder)((Object)iterator)).append((String)object2);
                        ((StringBuilder)((Object)iterator)).append(",");
                        ((StringBuilder)((Object)iterator)).append(object);
                        ((StringBuilder)((Object)iterator)).append("),");
                        stringBuilder.append(((StringBuilder)((Object)iterator)).toString());
                        continue;
                    }
                    stringBuilder.append(String.valueOf(object2).concat(","));
                }
            } while ((object3 = ((kau)object3).b()) != null);
            if (stringBuilder.length() != 0) {
                if (stringBuilder.charAt(jse.v(stringBuilder)) == ',') {
                    jse.d(stringBuilder.deleteCharAt(stringBuilder.length() - 1), "deleteCharAt(...)");
                }
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            throw new NoSuchElementException("Char sequence is empty.");
        }
        throw new NoSuchElementException();
    }

    @Override
    public final jxq u() {
        return new jxq(this);
    }

    public final int v(kau kau2, int n2, Object object, long l2, Object object2, boolean bl2) {
        block11: {
            block14: {
                block13: {
                    block12: {
                        Object object3;
                        block10: {
                            kau2.r(n2, object);
                            if (bl2) {
                                return this.M(kau2, n2, object, l2, object2, true);
                            }
                            object3 = kau2.m(n2);
                            if (object3 != null) break block10;
                            if (this.I(l2)) {
                                if (kau2.t(n2, null, jxw.c)) {
                                    return 1;
                                }
                            } else {
                                if (object2 == null) {
                                    return 3;
                                }
                                if (kau2.t(n2, null, object2)) {
                                    return 2;
                                }
                            }
                            break block11;
                        }
                        if (!(object3 instanceof jxj)) break block11;
                        kau2.p(n2);
                        if (!jxu.T(object3, object)) break block12;
                        kau2.s(n2, jxw.h);
                        n2 = 0;
                        break block13;
                    }
                    if (kau2.k(n2, jxw.j) != jxw.j) break block14;
                    n2 = 5;
                }
                return n2;
            }
            kau2.q(n2, true);
            return 5;
        }
        return this.M(kau2, n2, object, l2, object2, false);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object w(kau var1_1, int var2_3, long var3_4, jqb var5_5) {
        block15: {
            if (!(var5_5 instanceof jxt)) ** GOTO lbl-1000
            var11_6 = (jxt)var5_5;
            var6_7 = var11_6.c;
            if ((var6_7 & -2147483648) != 0) {
                var11_6.c = var6_7 + -2147483648;
                var5_5 = var11_6;
            } else lbl-1000:
            // 2 sources

            {
                var5_5 = new jxt(this, (jqb)var5_5);
            }
            var11_6 = var5_5.a;
            var12_8 = jqh.a;
            var6_7 = var5_5.c;
            if (var6_7 != 0) {
                if (var6_7 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                jns.ak(var11_6);
                var1_1 = var11_6;
                return ((jyc)var1_1).b;
            }
            jns.ak(var11_6);
            var5_5.c = 1;
            var13_9 = jsl.q(jjj.n((jqb)var5_5));
            try {
                var14_10 = new jyi(var13_9);
                var11_6 = this.x((kau)var1_1, var2_3, var3_4, var14_10);
                if (var11_6 == jxw.l) {
                    jxu.B(var14_10, (kau)var1_1, var2_3);
                    break block15;
                }
                if (var11_6 == jxw.n) {
                    if (var3_4 < this.b()) {
                        var1_1.d();
                    }
                    var1_1 = (kau)this.e.a;
lbl30:
                    // 4 sources

                    while (true) {
                        if (this.p()) {
                            var11_6 = this.h();
                            var1_1 = new jya((Throwable)var11_6);
                            var11_6 = new jyc(var1_1);
                            var13_9.bD(var11_6);
                            break block15;
                        }
                        var7_11 = this.c.b();
                        var3_4 = jxw.a;
                        var9_12 = var7_11 / var3_4;
                        break;
                    }
                }
                ** GOTO lbl67
            }
            catch (Throwable var1_2) {
                var13_9.u();
                throw var1_2;
            }
            var2_3 = (int)(var7_11 % var3_4);
            var11_6 = var1_1;
            {
                block16: {
                    if (var1_1.b != var9_12 && (var11_6 = this.y(var9_12, (kau)var1_1)) == null) ** GOTO lbl30
                    var15_13 = this.x((kau)var11_6, var2_3, var7_11, var14_10);
                    if (var15_13 == jxw.l) {
                        jxu.B(var14_10, (kau)var11_6, var2_3);
                        break block15;
                    }
                    if (var15_13 != jxw.n) break block16;
                    var1_1 = var11_6;
                    if (var7_11 >= this.b()) ** GOTO lbl30
                    var11_6.d();
                    var1_1 = var11_6;
                    ** continue;
                }
                if (var15_13 == jxw.m) {
                    var1_1 = new IllegalStateException("unexpected");
                    throw var1_1;
                }
                var11_6.d();
                var1_1 = new jyc(var15_13);
lbl64:
                // 2 sources

                while (true) {
                    var13_9.B(var1_1);
                    break block15;
                    break;
                }
lbl67:
                // 1 sources

                var1_1.d();
                var1_1 = new jyc(var11_6);
                ** continue;
            }
        }
        var11_6 = var13_9.a();
        if (var11_6 == jqh.a) {
            jsd.j((jqb)var5_5);
        }
        var1_1 = var11_6;
        if (var11_6 != var12_8) return ((jyc)var1_1).b;
        return var12_8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object x(kau object, int n2, long l2, Object object2) {
        Object object3 = ((kau)object).m(n2);
        if (object3 == null) {
            if (l2 >= (this.b.b & 0xFFFFFFFFFFFFFFFL)) {
                if (object2 == null) {
                    return jxw.m;
                }
                if (((kau)object).t(n2, null, object2)) {
                    this.D();
                    return jxw.l;
                }
            }
        } else if (object3 == jxw.c && ((kau)object).t(n2, object3, jxw.h)) {
            this.D();
            return ((kau)object).n(n2);
        }
        while (true) {
            if ((object3 = ((kau)object).m(n2)) != null && object3 != jxw.d) {
                if (object3 == jxw.c) {
                    if (!((kau)object).t(n2, object3, jxw.h)) continue;
                    this.D();
                    return ((kau)object).n(n2);
                }
                if (object3 == jxw.i) return jxw.n;
                if (object3 == jxw.g) {
                    return jxw.n;
                }
                if (object3 == jxw.k) {
                    this.D();
                    return jxw.n;
                }
                if (object3 == jxw.f || !((kau)object).t(n2, object3, jxw.e)) continue;
                boolean bl2 = object3 instanceof jyl;
                object2 = object3;
                if (bl2) {
                    object2 = ((jyl)object3).a;
                }
                if (jxu.Q(object2)) {
                    ((kau)object).s(n2, jxw.h);
                    this.D();
                    return ((kau)object).n(n2);
                }
                ((kau)object).s(n2, jxw.i);
                ((kau)object).q(n2, false);
                if (!bl2) return jxw.n;
                this.D();
                return jxw.n;
            }
            if (l2 < (this.b.b & 0xFFFFFFFFFFFFFFFL)) {
                if (!((kau)object).t(n2, object3, jxw.g)) continue;
                this.D();
                return jxw.n;
            }
            if (object2 == null) {
                return jxw.m;
            }
            if (((kau)object).t(n2, object3, object2)) break;
        }
        this.D();
        return jxw.l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final kau y(long l2, kau object) {
        long l3;
        Object object2;
        juc juc2;
        Object object3;
        jxv jxv2 = jxv.a;
        block0: while (!kbr.a(object3 = kat.a((kau)object, l2, jxv2))) {
            kau kau2 = kbr.b(object3);
            while (true) {
                juc2 = this.e;
                object2 = (kau)juc2.a;
                if (((kau)object2).b >= kau2.b) break block0;
                if (!kau2.j()) continue block0;
                if (juc2.d(object2, kau2)) {
                    if (!((kau)object2).h()) break block0;
                    ((kau)object2).e();
                    break block0;
                }
                if (!kau2.h()) continue;
                kau2.e();
            }
        }
        boolean bl2 = kbr.a(object3);
        juc2 = null;
        if (bl2) {
            this.q();
            if (((kau)object).b * (long)jxw.a >= this.b()) {
                return juc2;
            }
            ((kau)object).d();
            return null;
        }
        object = kbr.b(object3);
        if (!this.L() && l2 <= this.C() / (long)jxw.a) {
            object2 = this.i;
            while (true) {
                object3 = (kau)((juc)object2).a;
                if (((kau)object3).b >= ((kau)object).b || !((kau)object).j()) break;
                if (((juc)object2).d(object3, object)) {
                    if (!((kau)object3).h()) break;
                    ((kau)object3).e();
                    break;
                }
                if (!((kau)object).h()) continue;
                ((kau)object).e();
            }
        }
        if ((l3 = ((kau)object).b) > l2) {
            long l4;
            long l5 = jxw.a;
            object3 = this.c;
            while ((l4 = ((jub)object3).b) < (l2 = l3 * l5) && !this.c.c(l4, l2)) {
            }
            if (((kau)object).b * (long)jxw.a >= this.b()) {
                return juc2;
            }
            ((kau)object).d();
            return null;
        }
        bl2 = jve.a;
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final kau z(long l2, kau object) {
        Object object2;
        jxv jxv2 = jxv.a;
        block0: while (!kbr.a(object2 = kat.a((kau)object, l2, jxv2))) {
            kau kau2 = kbr.b(object2);
            while (true) {
                juc juc2 = this.d;
                kau kau3 = (kau)juc2.a;
                if (kau3.b >= kau2.b) break block0;
                if (!kau2.j()) continue block0;
                if (juc2.d(kau3, kau2)) {
                    if (!kau3.h()) break block0;
                    kau3.e();
                    break block0;
                }
                if (!kau2.h()) continue;
                kau2.e();
            }
        }
        boolean bl2 = kbr.a(object2);
        jxv2 = null;
        if (bl2) {
            this.q();
            if (((kau)object).b * (long)jxw.a >= this.a()) {
                return jxv2;
            }
            ((kau)object).d();
            return null;
        }
        object = kbr.b(object2);
        long l3 = ((kau)object).b;
        if (l3 > l2) {
            long l4;
            long l5 = jxw.a;
            object2 = this.b;
            while ((l4 = 0xFFFFFFFFFFFFFFFL & (l2 = ((jub)object2).b)) < l3 * l5 && !this.b.c(l2, jxw.b(l4, (int)(l2 >> 60)))) {
            }
            if (((kau)object).b * (long)jxw.a >= this.a()) {
                return jxv2;
            }
            ((kau)object).d();
            return null;
        }
        bl2 = jve.a;
        return object;
    }
}

