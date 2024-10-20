/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.sun.misc.a;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.concurrent.s;
import java.util.concurrent.locks.LockSupport;

final class r
extends l {
    private static final a h;
    private static final long i;
    s e;
    volatile s f;
    volatile Thread g;
    volatile int lockState;

    static {
        a a2;
        h = a2 = j$.sun.misc.a.h();
        i = a2.j(r.class, "lockState");
    }

    /*
     * Unable to fully structure code
     */
    r(s var1_1) {
        super(-2, null, null);
        this.f = var1_1;
        var5_2 = null;
        var4_3 = var1_1;
        block0: while (var4_3 != null) {
            block10: {
                var8_8 = (s)var4_3.d;
                var4_3.g = null;
                var4_3.f = null;
                if (var5_2 != null) break block10;
                var4_3.e = null;
                var4_3.i = false;
                ** GOTO lbl51
            }
            var9_9 = var4_3.b;
            var3_5 = var4_3.a;
            var7_7 = var5_2;
            var6_6 = null;
            while (true) {
                block16: {
                    block12: {
                        block15: {
                            block14: {
                                block13: {
                                    block11: {
                                        var10_10 = var7_7.b;
                                        var2_4 = var7_7.a;
                                        if (var2_4 <= var3_5) break block11;
                                        var2_4 = -1;
                                        var1_1 = var6_6;
                                        break block12;
                                    }
                                    if (var2_4 >= var3_5) break block13;
                                    var2_4 = 1;
                                    var1_1 = var6_6;
                                    break block12;
                                }
                                var1_1 = var6_6;
                                if (var6_6 != null) break block14;
                                var1_1 = var6_6 = ConcurrentHashMap.c(var9_9);
                                if (var6_6 == null) break block15;
                                var1_1 = var6_6;
                            }
                            var2_4 = ConcurrentHashMap.g;
                            var2_4 = var10_10 != null && var10_10.getClass() == var1_1 ? ((Comparable)var9_9).compareTo(var10_10) : 0;
                            if (var2_4 != 0) break block12;
                        }
                        var2_4 = r.i(var9_9, var10_10);
                    }
                    var6_6 = var2_4 <= 0 ? var7_7.f : var7_7.g;
                    if (var6_6 != null) break block16;
                    var4_3.e = var7_7;
                    if (var2_4 <= 0) {
                        var7_7.f = var4_3;
                    } else {
                        var7_7.g = var4_3;
                    }
                    var4_3 = r.c(var5_2, var4_3);
lbl51:
                    // 2 sources

                    var1_1 = var8_8;
                    var5_2 = var4_3;
                    var4_3 = var1_1;
                    continue block0;
                }
                var7_7 = var6_6;
                var6_6 = var1_1;
            }
        }
        this.e = var5_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static s b(s s2, s s3) {
        s s4 = s3;
        while (s4 != null) {
            s s5;
            block30: {
                block36: {
                    block34: {
                        boolean bl2;
                        s s6;
                        block38: {
                            void var3_14;
                            s s7;
                            s s8;
                            block37: {
                                s s9;
                                block35: {
                                    block28: {
                                        block31: {
                                            block33: {
                                                void var3_9;
                                                block32: {
                                                    block29: {
                                                        if (s4 == s2) {
                                                            return s2;
                                                        }
                                                        s6 = s4.e;
                                                        if (s6 == null) {
                                                            s4.i = false;
                                                            return s4;
                                                        }
                                                        if (s4.i) {
                                                            s4.i = false;
                                                            return s2;
                                                        }
                                                        s8 = s6.f;
                                                        s7 = null;
                                                        s9 = null;
                                                        if (s8 != s4) break block28;
                                                        s7 = s6.g;
                                                        s5 = s6;
                                                        s s10 = s7;
                                                        s3 = s2;
                                                        if (s7 != null) {
                                                            s5 = s6;
                                                            s s11 = s7;
                                                            s3 = s2;
                                                            if (s7.i) {
                                                                s7.i = false;
                                                                s6.i = true;
                                                                s3 = r.g(s2, s6);
                                                                s5 = s4.e;
                                                                if (s5 == null) {
                                                                    Object var3_7 = null;
                                                                } else {
                                                                    s s12 = s5.g;
                                                                }
                                                            }
                                                        }
                                                        if (var3_9 != null) break block29;
                                                        s2 = s3;
                                                        break block30;
                                                    }
                                                    s7 = var3_9.f;
                                                    s8 = var3_9.g;
                                                    if ((s8 == null || !s8.i) && (s7 == null || !s7.i)) break block31;
                                                    if (s8 == null) break block32;
                                                    s6 = s5;
                                                    s2 = var3_9;
                                                    s5 = s3;
                                                    if (s8.i) break block33;
                                                }
                                                if (s7 != null) {
                                                    s7.i = false;
                                                }
                                                var3_9.i = true;
                                                s5 = r.h(s3, (s)var3_9);
                                                s6 = s4.e;
                                                s2 = s6 == null ? s9 : s6.g;
                                            }
                                            if (s2 != null) {
                                                bl2 = s6 == null ? false : s6.i;
                                                s2.i = bl2;
                                                s2 = s2.g;
                                                if (s2 != null) {
                                                    s2.i = false;
                                                }
                                            }
                                            s2 = s5;
                                            if (s6 != null) {
                                                s6.i = false;
                                                s2 = r.g(s5, s6);
                                            }
                                            break block34;
                                        }
                                        var3_9.i = true;
                                        s2 = s3;
                                        break block30;
                                    }
                                    s5 = s6;
                                    s s13 = s8;
                                    s3 = s2;
                                    if (s8 != null) {
                                        s5 = s6;
                                        s s14 = s8;
                                        s3 = s2;
                                        if (s8.i) {
                                            s8.i = false;
                                            s6.i = true;
                                            s3 = r.h(s2, s6);
                                            s5 = s4.e;
                                            if (s5 == null) {
                                                Object var3_12 = null;
                                            } else {
                                                s s15 = s5.f;
                                            }
                                        }
                                    }
                                    if (var3_14 != null) break block35;
                                    s2 = s3;
                                    break block30;
                                }
                                s9 = var3_14.f;
                                s8 = var3_14.g;
                                if ((s9 == null || !s9.i) && (s8 == null || !s8.i)) break block36;
                                if (s9 == null) break block37;
                                s6 = s5;
                                s2 = var3_14;
                                s5 = s3;
                                if (s9.i) break block38;
                            }
                            if (s8 != null) {
                                s8.i = false;
                            }
                            var3_14.i = true;
                            s5 = r.g(s3, (s)var3_14);
                            s6 = s4.e;
                            s2 = s6 == null ? s7 : s6.f;
                        }
                        if (s2 != null) {
                            bl2 = s6 == null ? false : s6.i;
                            s2.i = bl2;
                            s2 = s2.f;
                            if (s2 != null) {
                                s2.i = false;
                            }
                        }
                        s2 = s5;
                        if (s6 != null) {
                            s6.i = false;
                            s2 = r.h(s5, s6);
                        }
                    }
                    s4 = s2;
                    continue;
                }
                var3_14.i = true;
                s2 = s3;
            }
            s4 = s5;
        }
        return s2;
    }

    static s c(s s2, s s3) {
        s3.i = true;
        s s4 = s3;
        while (true) {
            s s5;
            s s6;
            s s7;
            s s8;
            block10: {
                block9: {
                    block7: {
                        block8: {
                            if ((s3 = s4.e) == null) {
                                s4.i = false;
                                return s4;
                            }
                            if (!s3.i || (s8 = s3.e) == null) break;
                            s7 = s8.f;
                            if (s3 != s7) break block7;
                            s7 = s8.g;
                            if (s7 == null || !s7.i) break block8;
                            s7.i = false;
                            s3.i = false;
                            s8.i = true;
                            break block9;
                        }
                        s6 = s3;
                        s5 = s8;
                        s7 = s2;
                        s8 = s4;
                        if (s4 == s3.g) {
                            s7 = r.g(s2, s3);
                            s6 = s3.e;
                            s2 = s6 == null ? null : s6.e;
                            s8 = s3;
                            s5 = s2;
                        }
                        s2 = s7;
                        s4 = s8;
                        if (s6 == null) continue;
                        s6.i = false;
                        s2 = s7;
                        s4 = s8;
                        if (s5 == null) continue;
                        s5.i = true;
                        s2 = r.h(s7, s5);
                        s4 = s8;
                        continue;
                    }
                    if (s7 == null || !s7.i) break block10;
                    s7.i = false;
                    s3.i = false;
                    s8.i = true;
                }
                s4 = s8;
                continue;
            }
            s5 = s3;
            s6 = s8;
            s7 = s2;
            s8 = s4;
            if (s4 == s3.f) {
                s7 = r.h(s2, s3);
                s4 = s3.e;
                s2 = s4 == null ? null : s4.e;
                s8 = s3;
                s6 = s2;
                s5 = s4;
            }
            s2 = s7;
            s4 = s8;
            if (s5 == null) continue;
            s5.i = false;
            s2 = s7;
            s4 = s8;
            if (s6 == null) continue;
            s6.i = true;
            s2 = r.g(s7, s6);
            s4 = s8;
        }
        return s2;
    }

    private final void d() {
        if (!h.c(this, i, 0, 1)) {
            boolean bl2 = false;
            while (true) {
                int n2;
                if (((n2 = this.lockState) & 0xFFFFFFFD) == 0) {
                    if (!h.c(this, i, n2, 1)) continue;
                    if (!bl2) break;
                    this.g = null;
                    break;
                }
                if ((n2 & 2) == 0) {
                    if (!h.c(this, i, n2, n2 | 2)) continue;
                    this.g = Thread.currentThread();
                    bl2 = true;
                    continue;
                }
                if (!bl2) continue;
                LockSupport.park(this);
            }
        }
    }

    static s g(s s2, s s3) {
        s s4 = s2;
        if (s3 != null) {
            s s5 = s3.g;
            s4 = s2;
            if (s5 != null) {
                s3.g = s4 = s5.f;
                if (s4 != null) {
                    s4.e = s3;
                }
                s5.e = s4 = s3.e;
                if (s4 == null) {
                    s5.i = false;
                    s2 = s5;
                } else if (s4.f == s3) {
                    s4.f = s5;
                } else {
                    s4.g = s5;
                }
                s5.f = s3;
                s3.e = s5;
                s4 = s2;
            }
        }
        return s4;
    }

    static s h(s s2, s s3) {
        s s4 = s2;
        if (s3 != null) {
            s s5 = s3.f;
            s4 = s2;
            if (s5 != null) {
                s3.f = s4 = s5.g;
                if (s4 != null) {
                    s4.e = s3;
                }
                s5.e = s4 = s3.e;
                if (s4 == null) {
                    s5.i = false;
                    s2 = s5;
                } else if (s4.g == s3) {
                    s4.g = s5;
                } else {
                    s4.f = s5;
                }
                s5.g = s3;
                s3.e = s5;
                s4 = s2;
            }
        }
        return s4;
    }

    static int i(Object object, Object object2) {
        int n2;
        block3: {
            block2: {
                int n3;
                if (object == null || object2 == null) break block2;
                n2 = n3 = object.getClass().getName().compareTo(object2.getClass().getName());
                if (n3 != 0) break block3;
            }
            n2 = System.identityHashCode(object) <= System.identityHashCode(object2) ? -1 : 1;
        }
        return n2;
    }

    @Override
    final l a(int n2, Object object) {
        block8: {
            long l2;
            a a2;
            Object object2;
            block9: {
                Object object3;
                object2 = this.f;
                while (true) {
                    object3 = null;
                    if (object2 == null) break block8;
                    int n3 = this.lockState;
                    if ((n3 & 3) != 0) {
                        if (((l)object2).a == n2 && ((object3 = ((l)object2).b) == object || object3 != null && object.equals(object3))) {
                            return object2;
                        }
                        object2 = ((l)object2).d;
                        continue;
                    }
                    a2 = h;
                    l2 = i;
                    if (a2.c(this, l2, n3, n3 + 4)) break;
                }
                object2 = this.e;
                if (object2 != null) break block9;
                object = object3;
            }
            object = ((s)object2).b(n2, object, null);
            return object;
            finally {
                if (a2.f(this, l2) == 6 && (object2 = this.g) != null) {
                    LockSupport.unpark((Thread)object2);
                }
            }
        }
        return null;
    }

    final s e(int n2, Object object, Object object2) {
        s s2 = this.e;
        Object object3 = null;
        int n3 = 0;
        while (true) {
            Object object4;
            block26: {
                block16: {
                    int n4;
                    block18: {
                        Object object5;
                        block22: {
                            block25: {
                                block24: {
                                    block23: {
                                        block21: {
                                            block20: {
                                                block19: {
                                                    block17: {
                                                        block15: {
                                                            if (s2 != null) break block15;
                                                            this.e = object = new s(n2, object, object2, null, null);
                                                            this.f = object;
                                                            break block16;
                                                        }
                                                        n4 = s2.a;
                                                        if (n4 <= n2) break block17;
                                                        n4 = -1;
                                                        object4 = object3;
                                                        break block18;
                                                    }
                                                    if (n4 >= n2) break block19;
                                                    n4 = 1;
                                                    object4 = object3;
                                                    break block18;
                                                }
                                                object5 = s2.b;
                                                if (object5 == object || object5 != null && object.equals(object5)) break;
                                                object4 = object3;
                                                if (object3 != null) break block20;
                                                object4 = object3 = ConcurrentHashMap.c(object);
                                                if (object3 == null) break block21;
                                                object4 = object3;
                                            }
                                            n4 = ConcurrentHashMap.g;
                                            n4 = object5 != null && object5.getClass() == object4 ? ((Comparable)object).compareTo(object5) : 0;
                                            if (n4 != 0) break block18;
                                        }
                                        n4 = n3;
                                        if (n3 != 0) break block22;
                                        object3 = s2.f;
                                        if (object3 == null) break block23;
                                        s s3 = ((s)object3).b(n2, object, (Class)object4);
                                        object3 = s3;
                                        if (s3 != null) break block24;
                                    }
                                    if ((object3 = s2.g) == null || (object3 = ((s)object3).b(n2, object, (Class)object4)) == null) break block25;
                                }
                                return object3;
                            }
                            n4 = 1;
                        }
                        int n5 = r.i(object, object5);
                        n3 = n4;
                        n4 = n5;
                    }
                    object3 = n4 <= 0 ? s2.f : s2.g;
                    if (object3 != null) break block26;
                    object4 = this.f;
                    this.f = object = new s(n2, object, object2, (l)object4, s2);
                    if (object4 != null) {
                        ((s)object4).h = object;
                    }
                    if (n4 <= 0) {
                        s2.f = object;
                    } else {
                        s2.g = object;
                    }
                    if (!s2.i) {
                        ((s)object).i = true;
                    } else {
                        this.d();
                        this.e = r.c(this.e, (s)object);
                    }
                }
                return null;
                finally {
                    this.lockState = 0;
                }
            }
            s2 = object3;
            object3 = object4;
        }
        return s2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final boolean f(s var1_1) {
        block33: {
            block34: {
                block36: {
                    block31: {
                        block35: {
                            block32: {
                                var4_3 = (s)var1_1.d;
                                var3_4 = var1_1.h;
                                if (var3_4 == null) {
                                    this.f = var4_3;
                                } else {
                                    var3_4.d = var4_3;
                                }
                                if (var4_3 != null) {
                                    var4_3.h = var3_4;
                                }
                                if (this.f == null) {
                                    this.e = null;
                                    return true;
                                }
                                var4_3 = this.e;
                                if (var4_3 == null) return true;
                                if (var4_3.g == null) return true;
                                var3_4 = var4_3.f;
                                if (var3_4 == null) return true;
                                if (var3_4.f == null) {
                                    return true;
                                }
                                this.d();
                                try {
                                    var5_5 = var1_1.f;
                                    var6_6 = var1_1.g;
                                    if (var5_5 == null || var6_6 == null) break block31;
                                    var3_4 = var6_6;
                                    while ((var7_7 = var3_4.f) != null) {
                                        var3_4 = var7_7;
                                    }
                                    var2_8 = var3_4.i;
                                    var3_4.i = var1_1.i;
                                    var1_1.i = var2_8;
                                    var7_7 = var3_4.g;
                                    var9_9 = var1_1.e;
                                    if (var3_4 != var6_6) break block32;
                                }
                                catch (Throwable var1_2) {
                                    break block33;
                                }
                                var1_1.e = var3_4;
                                var3_4.g = var1_1;
                                break block35;
                            }
                            var1_1.e = var8_10 = var3_4.e;
                            if (var8_10 != null) {
                                if (var3_4 == var8_10.f) {
                                    var8_10.f = var1_1;
                                } else {
                                    var8_10.g = var1_1;
                                }
                            }
                            var3_4.g = var6_6;
                            var6_6.e = var3_4;
                        }
                        var1_1.f = null;
                        var1_1.g = var7_7;
                        if (var7_7 != null) {
                            var7_7.e = var1_1;
                        }
                        var3_4.f = var5_5;
                        var5_5.e = var3_4;
                        var3_4.e = var9_9;
                        if (var9_9 == null) {
                            var4_3 = var3_4;
                        } else if (var1_1 == var9_9.f) {
                            var9_9.f = var3_4;
                        } else {
                            var9_9.g = var3_4;
                        }
                        var5_5 = var4_3;
                        if (var7_7 == null) ** GOTO lbl-1000
                        var3_4 = var7_7;
                        break block36;
                    }
                    if (var5_5 != null) {
                        var3_4 = var5_5;
                    } else {
                        var5_5 = var4_3;
                        if (var6_6 != null) {
                            var3_4 = var6_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_4 = var1_1;
                            var4_3 = var5_5;
                        }
                    }
                }
                var5_5 = var4_3;
                if (var3_4 == var1_1) ** GOTO lbl93
                {
                    var3_4.e = var5_5 = var1_1.e;
                    if (var5_5 == null) {
                        var4_3 = var3_4;
                    } else if (var1_1 == var5_5.f) {
                        var5_5.f = var3_4;
                    } else {
                        var5_5.g = var3_4;
                    }
                    var1_1.e = null;
                    var1_1.g = null;
                    var1_1.f = null;
                    var5_5 = var4_3;
lbl93:
                    // 2 sources

                    if (!var1_1.i) {
                        var5_5 = r.b(var5_5, var3_4);
                    }
                    this.e = var5_5;
                }
                {
                    if (var1_1 != var3_4 || (var3_4 = var1_1.e) == null) break block34;
                    if (var1_1 == var3_4.f) {
                        var3_4.f = null;
                    } else if (var1_1 == var3_4.g) {
                        var3_4.g = null;
                    }
                    var1_1.e = null;
                }
            }
            this.lockState = 0;
            return false;
        }
        this.lockState = 0;
        throw var1_2;
    }
}

