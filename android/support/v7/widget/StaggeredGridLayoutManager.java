/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class StaggeredGridLayoutManager
extends ko
implements lb {
    private final ln H;
    private boolean I;
    private int[] J;
    private final Runnable K;
    lr[] a;
    public kc b;
    kc c;
    public boolean d;
    boolean e;
    int f;
    int g;
    abf h;
    private int i = -1;
    private int j;
    private int k;
    private final jn l;
    private BitSet m;
    private int n;
    private boolean o;
    private boolean p;
    private lq q;
    private final Rect r;

    public StaggeredGridLayoutManager(Context object, AttributeSet object2, int n2, int n3) {
        int n4 = 0;
        this.d = false;
        this.e = false;
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.h = new abf();
        this.n = 2;
        this.r = new Rect();
        this.H = new ln(this);
        this.I = true;
        this.K = new kd(this, 2);
        object2 = StaggeredGridLayoutManager.ay(object, object2, n2, n3);
        n2 = object2.a;
        if (n2 != 0 && n2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        ((ko)this).Q(null);
        if (n2 != this.j) {
            this.j = n2;
            object = this.b;
            this.b = this.c;
            this.c = object;
            this.aS();
        }
        n2 = object2.b;
        ((ko)this).Q(null);
        if (n2 != this.i) {
            this.h.b();
            this.aS();
            this.i = n2;
            this.m = new BitSet(n2);
            this.a = new lr[this.i];
            for (n2 = n4; n2 < this.i; ++n2) {
                this.a[n2] = new lr(this, n2);
            }
            this.aS();
        }
        this.I(object2.c);
        this.l = new jn();
        this.b = kc.p(this, this.j);
        this.c = kc.p(this, 1 - this.j);
    }

    private final int O(int n2) {
        if (this.ao() == 0) {
            if (this.e) {
                return 1;
            }
            return -1;
        }
        boolean bl2 = n2 < this.c();
        if (bl2 != this.e) {
            return -1;
        }
        return 1;
    }

    private final int R(ld ld2) {
        if (this.ao() == 0) {
            return 0;
        }
        return kl.l(ld2, this.b, this.r(this.I ^ true), this.l(this.I ^ true), this, this.I);
    }

    private final int S(ld ld2) {
        if (this.ao() == 0) {
            return 0;
        }
        return kl.m(ld2, this.b, this.r(this.I ^ true), this.l(this.I ^ true), this, this.I, this.e);
    }

    private final int W(ld ld2) {
        if (this.ao() == 0) {
            return 0;
        }
        return kl.n(ld2, this.b, this.r(this.I ^ true), this.l(this.I ^ true), this, this.I);
    }

    private final int X(kv kv2, jn jn2, ld ld2) {
        Object object;
        this.m.set(0, this.i, true);
        int n2 = this.l.i ? (jn2.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE) : (jn2.e == 1 ? jn2.g + jn2.b : jn2.f - jn2.b);
        Object object2 = jn2.e;
        for (object = 0; object < this.i; ++object) {
            if (this.a[object].a.isEmpty()) continue;
            this.by(this.a[object], (int)object2, n2);
        }
        int n3 = this.e ? this.b.f() : this.b.j();
        object = 0;
        while (jn2.a(ld2) && (this.l.i || !this.m.isEmpty())) {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            boolean bl2;
            View view = kv2.b(jn2.c);
            jn2.c += jn2.d;
            lo lo2 = (lo)view.getLayoutParams();
            int n4 = lo2.a();
            Object object7 = this.h.b;
            object = object7 != null && n4 < ((Object)(object7 = (Object)((int[])object7))).length ? (Object)object7[n4] : -1;
            int n5 = object == -1 ? 1 : 0;
            if (n5 != 0) {
                Object object8;
                Object object9;
                int n6;
                bl2 = lo2.b;
                if (this.bz(jn2.e)) {
                    object = this.i - 1;
                    object6 = -1;
                    object5 = -1;
                } else {
                    object6 = this.i;
                    object5 = 1;
                    object = 0;
                }
                object2 = jn2.e;
                object7 = null;
                object4 = null;
                if (object2 == 1) {
                    n6 = this.b.j();
                    object2 = Integer.MAX_VALUE;
                    object7 = object4;
                    object9 = object;
                    object = object2;
                    while (true) {
                        object4 = object7;
                        if (object9 != object6) {
                            object4 = this.a[object9];
                            object8 = ((lr)object4).d(n6);
                            object2 = object8 < object ? object8 : object;
                            if (object8 < object) {
                                object7 = object4;
                            }
                            object9 += object5;
                            object = object2;
                            continue;
                        }
                        break;
                    }
                } else {
                    n6 = this.b.f();
                    object2 = Integer.MIN_VALUE;
                    object9 = object;
                    object = object2;
                    while (true) {
                        object4 = object7;
                        if (object9 == object6) break;
                        object4 = this.a[object9];
                        object8 = ((lr)object4).f(n6);
                        object2 = object8 > object ? object8 : object;
                        if (object8 > object) {
                            object7 = object4;
                        }
                        object9 += object5;
                        object = object2;
                    }
                }
                object7 = object4;
                object4 = this.h;
                ((abf)object4).c(n4);
                object4 = ((abf)object4).b;
                ((int[])object4)[n4] = object = ((lr)object7).e;
            } else {
                object7 = this.a[object];
            }
            lo2.a = object7;
            if (jn2.e == 1) {
                this.aE(view);
            } else {
                this.aF(view, 0);
            }
            bl2 = lo2.b;
            if (this.j == 1) {
                this.bA(view, StaggeredGridLayoutManager.ap(this.k, this.B, 0, lo2.width, false), StaggeredGridLayoutManager.ap(this.E, this.C, this.ax() + this.au(), lo2.height, true));
            } else {
                this.bA(view, StaggeredGridLayoutManager.ap(this.D, this.B, this.av() + this.aw(), lo2.width, true), StaggeredGridLayoutManager.ap(this.k, this.C, 0, lo2.height, false));
            }
            if (jn2.e == 1) {
                bl2 = lo2.b;
                object5 = ((lr)object7).d(n3);
                object6 = this.b.b(view) + object5;
                object = object5;
                object2 = object6;
                if (n5 != 0) {
                    bl2 = lo2.b;
                    object = object5;
                    object2 = object6;
                }
            } else {
                bl2 = lo2.b;
                object6 = ((lr)object7).f(n3);
                object = object5 = object6 - this.b.b(view);
                object2 = object6;
                if (n5 != 0) {
                    bl2 = lo2.b;
                    object2 = object6;
                    object = object5;
                }
            }
            bl2 = lo2.b;
            if (jn2.e == 1) {
                object3 = lo2.a;
                object4 = lr.n(view);
                ((lo)((Object)object4)).a = object3;
                ((lr)object3).a.add(view);
                ((lr)object3).c = Integer.MIN_VALUE;
                if (((lr)object3).a.size() == 1) {
                    ((lr)object3).b = Integer.MIN_VALUE;
                }
                if (((kp)((Object)object4)).c() || ((kp)((Object)object4)).b()) {
                    ((lr)object3).d += ((lr)object3).f.b.b(view);
                }
            } else {
                object4 = lo2.a;
                object3 = lr.n(view);
                ((lo)((Object)object3)).a = object4;
                ((lr)object4).a.add(0, view);
                ((lr)object4).b = Integer.MIN_VALUE;
                if (((lr)object4).a.size() == 1) {
                    ((lr)object4).c = Integer.MIN_VALUE;
                }
                if (((kp)((Object)object3)).c() || ((kp)((Object)object3)).b()) {
                    ((lr)object4).d += ((lr)object4).f.b.b(view);
                }
            }
            if (this.L() && this.j == 1) {
                bl2 = lo2.b;
                n5 = this.c.f() - (this.i - 1 - ((lr)object7).e) * this.k;
                object5 = n5 - this.c.b(view);
            } else {
                bl2 = lo2.b;
                n5 = ((lr)object7).e;
                object5 = this.k;
                object5 = this.c.j() + n5 * object5;
                n5 = this.c.b(view) + object5;
            }
            if (this.j == 1) {
                StaggeredGridLayoutManager.bn(view, object5, object, n5, object2);
            } else {
                StaggeredGridLayoutManager.bn(view, object, object5, object2, n5);
            }
            bl2 = lo2.b;
            this.by((lr)object7, this.l.e, n2);
            this.bs(kv2, this.l);
            if (this.l.h && view.hasFocusable()) {
                bl2 = lo2.b;
                this.m.set(((lr)object7).e, false);
                object = 1;
                continue;
            }
            object = 1;
        }
        if (object == 0) {
            this.bs(kv2, this.l);
        }
        if (this.l.e == -1) {
            n2 = this.ad(this.b.j());
            n2 = this.b.j() - n2;
        } else {
            n2 = this.ab(this.b.f()) - this.b.f();
        }
        if (n2 > 0) {
            return Math.min(jn2.b, n2);
        }
        return 0;
    }

    private final int ab(int n2) {
        int n3 = this.a[0].d(n2);
        for (int i2 = 1; i2 < this.i; ++i2) {
            int n4 = this.a[i2].d(n2);
            int n5 = n3;
            if (n4 > n3) {
                n5 = n4;
            }
            n3 = n5;
        }
        return n3;
    }

    private final int ad(int n2) {
        int n3 = this.a[0].f(n2);
        for (int i2 = 1; i2 < this.i; ++i2) {
            int n4 = this.a[i2].f(n2);
            int n5 = n3;
            if (n4 < n3) {
                n5 = n4;
            }
            n3 = n5;
        }
        return n3;
    }

    private final void ah(kv kv2, ld ld2, boolean bl2) {
        int n2 = this.ab(Integer.MIN_VALUE);
        if (n2 != Integer.MIN_VALUE && (n2 = this.b.f() - n2) > 0) {
            int n3 = -this.k(-n2, kv2, ld2);
            if (bl2 && (n2 -= n3) > 0) {
                this.b.n(n2);
            }
        }
    }

    private final void ai(kv kv2, ld ld2, boolean bl2) {
        int n2 = this.ad(Integer.MAX_VALUE);
        if (n2 != Integer.MAX_VALUE && (n2 -= this.b.j()) > 0) {
            n2 -= this.k(n2, kv2, ld2);
            if (bl2 && n2 > 0) {
                this.b.n(-n2);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void aj(int var1_1, int var2_2, int var3_3) {
        block22: {
            block21: {
                block19: {
                    block20: {
                        var5_4 = this.e != false ? this.i() : this.c();
                        if (var3_3 != 8) break block19;
                        if (var1_1 >= var2_2) break block20;
                        var4_5 = var2_2 + 1;
                        break block21;
                    }
                    var7_6 = var1_1 + 1;
                    var6_7 = var2_2;
                    break block22;
                }
                var4_5 = var1_1 + var2_2;
            }
            var6_7 = var1_1;
            var7_6 = var4_5;
        }
        var10_8 = this.h;
        var9_9 = var10_8.b;
        if (var9_9 != null && var6_7 < ((int[])var9_9).length) {
            block16: {
                block18: {
                    block17: {
                        var9_9 = var10_8.a;
                        if (var9_9 == null) {
                            while (true) {
                                var4_5 = -1;
                                break block16;
                                break;
                            }
                        }
                        for (var4_5 = var9_9.size() - 1; var4_5 >= 0; --var4_5) {
                            var9_9 = (lp)var10_8.a.get(var4_5);
                            if (var9_9.a != var6_7) {
                                continue;
                            }
                            break block17;
                        }
                        var9_9 = null;
                    }
                    if (var9_9 != null) {
                        var10_8.a.remove(var9_9);
                    }
                    var8_10 = var10_8.a.size();
                    for (var4_5 = 0; var4_5 < var8_10; ++var4_5) {
                        if (((lp)var10_8.a.get((int)var4_5)).a < var6_7) {
                            continue;
                        }
                        break block18;
                    }
                    var4_5 = -1;
                }
                if (var4_5 == -1) ** continue;
                var9_9 = (lp)var10_8.a.get(var4_5);
                var10_8.a.remove(var4_5);
                var4_5 = var9_9.a;
            }
            if (var4_5 == -1) {
                var9_9 = (int[])var10_8.b;
                Arrays.fill((int[])var9_9, var6_7, ((Object)var9_9).length, -1);
                var4_5 = ((int[])var10_8.b).length;
            } else {
                var4_5 = Math.min(var4_5 + 1, ((int[])var10_8.b).length);
                Arrays.fill((int[])var10_8.b, var6_7, var4_5, -1);
            }
        }
        if (var3_3 != 1) {
            if (var3_3 != 2) {
                if (var3_3 == 8) {
                    this.h.e(var1_1, 1);
                    this.h.d(var2_2, 1);
                }
            } else {
                this.h.e(var1_1, var2_2);
            }
        } else {
            this.h.d(var1_1, var2_2);
        }
        if (var7_6 > var5_4 && var6_7 <= (var1_1 = this.e != false ? this.c() : this.i())) {
            this.aS();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final void al(kv var1_1, ld var2_2, boolean var3_3) {
        block56: {
            block57: {
                var15_4 = this.H;
                if ((this.q != null || this.f != -1) && var2_2.a() == 0) break block56;
                var14_5 = var15_4.e;
                var10_6 = 1;
                var8_7 = var14_5 && this.f == -1 && this.q == null ? 0 : 1;
                if (var8_7 == 0) break block57;
                var15_4.a();
                var16_8 /* !! */  = this.q;
                if (var16_8 /* !! */  != null) {
                    var7_9 = var16_8 /* !! */ .c;
                    if (var7_9 > 0) {
                        if (var7_9 == this.i) {
                            for (var7_9 = 0; var7_9 < this.i; ++var7_9) {
                                this.a[var7_9].j();
                                var16_8 /* !! */  = this.q;
                                var9_10 = var11_11 = var16_8 /* !! */ .d[var7_9];
                                if (var11_11 != -2147483648) {
                                    var9_10 = var16_8 /* !! */ .i != false ? this.b.f() : this.b.j();
                                    var9_10 = var11_11 + var9_10;
                                }
                                this.a[var7_9].l(var9_10);
                            }
                        } else {
                            var16_8 /* !! */ .b();
                            var16_8 /* !! */  = this.q;
                            var16_8 /* !! */ .a = var16_8 /* !! */ .b;
                        }
                    }
                    var16_8 /* !! */  = this.q;
                    this.p = var16_8 /* !! */ .j;
                    this.I(var16_8 /* !! */ .h);
                    this.bv();
                    var17_12 = this.q;
                    var7_9 = var17_12.a;
                    if (var7_9 != -1) {
                        this.f = var7_9;
                        var15_4.c = var17_12.i;
                    } else {
                        var15_4.c = this.e;
                    }
                    if (var17_12.e > 1) {
                        var16_8 /* !! */  = this.h;
                        var16_8 /* !! */ .b = var17_12.f;
                        var16_8 /* !! */ .a = var17_12.g;
                    }
                } else {
                    this.bv();
                    var15_4.c = this.e;
                }
                if (var2_2.g || (var7_9 = this.f) == -1) ** GOTO lbl78
                if (var7_9 >= 0 && var7_9 < var2_2.a()) {
                    var16_8 /* !! */  = this.q;
                    if (var16_8 /* !! */  != null && var16_8 /* !! */ .a != -1 && var16_8 /* !! */ .c > 0) {
                        var15_4.b = -2147483648;
                        var15_4.a = this.f;
                    } else {
                        var16_8 /* !! */  = this.P(this.f);
                        if (var16_8 /* !! */  != null) {
                            var7_9 = this.e != false ? this.i() : this.c();
                            var15_4.a = var7_9;
                            if (this.g != -2147483648) {
                                var15_4.b = var15_4.c ? this.b.f() - this.g - this.b.a((View)var16_8 /* !! */ ) : this.b.j() + this.g - this.b.d((View)var16_8 /* !! */ );
                            } else if (this.b.b((View)var16_8 /* !! */ ) > this.b.k()) {
                                var7_9 = var15_4.c != false ? this.b.f() : this.b.j();
                                var15_4.b = var7_9;
                            } else {
                                var7_9 = this.b.d((View)var16_8 /* !! */ ) - this.b.j();
                                var15_4.b = var7_9 < 0 ? -var7_9 : ((var7_9 = this.b.f() - this.b.a((View)var16_8 /* !! */ )) < 0 ? var7_9 : -2147483648);
                            }
                        } else {
                            var15_4.a = var7_9 = this.f;
                            var9_10 = this.g;
                            if (var9_10 == -2147483648) {
                                var14_5 = this.O(var7_9) == 1;
                                var15_4.c = var14_5;
                                var7_9 = var14_5 != false ? var15_4.g.b.f() : var15_4.g.b.j();
                                var15_4.b = var7_9;
                            } else {
                                var15_4.b = var15_4.c != false ? var15_4.g.b.f() - var9_10 : var15_4.g.b.j() + var9_10;
                            }
                            var15_4.d = true;
                        }
                    }
                } else {
                    block55: {
                        this.f = -1;
                        this.g = -2147483648;
lbl78:
                        // 2 sources

                        if (this.o) {
                            var11_11 = var2_2.a();
                            for (var7_9 = this.ao() - 1; var7_9 >= 0; --var7_9) {
                                var9_10 = StaggeredGridLayoutManager.bk(this.aA(var7_9));
                                if (var9_10 < 0 || var9_10 >= var11_11) continue;
                                var7_9 = var9_10;
                                break block55;
                            }
                        } else {
                            var12_13 = var2_2.a();
                            var11_11 = this.ao();
                            for (var7_9 = 0; var7_9 < var11_11; ++var7_9) {
                                var9_10 = StaggeredGridLayoutManager.bk(this.aA(var7_9));
                                if (var9_10 < 0 || var9_10 >= var12_13) continue;
                                var7_9 = var9_10;
                                break block55;
                            }
                        }
                        var7_9 = 0;
                    }
                    var15_4.a = var7_9;
                    var15_4.b = -2147483648;
                }
                var15_4.e = true;
            }
            if (this.q == null && this.f == -1 && (var15_4.c != this.o || this.L() != this.p)) {
                this.h.b();
                var15_4.d = true;
            }
            if (this.ao() > 0 && ((var16_8 /* !! */  = this.q) == null || var16_8 /* !! */ .c <= 0)) {
                if (var15_4.d) {
                    for (var7_9 = 0; var7_9 < this.i; ++var7_9) {
                        this.a[var7_9].j();
                        var8_7 = var15_4.b;
                        if (var8_7 == -2147483648) continue;
                        this.a[var7_9].l(var8_7);
                    }
                } else if (var8_7 == 0 && this.H.f != null) {
                    for (var7_9 = 0; var7_9 < this.i; ++var7_9) {
                        var16_8 /* !! */  = this.a[var7_9];
                        var16_8 /* !! */ .j();
                        var16_8 /* !! */ .l(this.H.f[var7_9]);
                    }
                } else {
                    for (var8_7 = 0; var8_7 < this.i; ++var8_7) {
                        var16_8 /* !! */  = this.a[var8_7];
                        var14_5 = this.e;
                        var11_11 = var15_4.b;
                        var7_9 = var14_5 != false ? var16_8 /* !! */ .d(-2147483648) : var16_8 /* !! */ .f(-2147483648);
                        var16_8 /* !! */ .j();
                        if (var7_9 == -2147483648 || var14_5 && var7_9 < var16_8 /* !! */ .f.b.f() || !var14_5 && var7_9 > var16_8 /* !! */ .f.b.j()) continue;
                        var9_10 = var7_9;
                        if (var11_11 != -2147483648) {
                            var9_10 = var7_9 + var11_11;
                        }
                        var16_8 /* !! */ .c = var9_10;
                        var16_8 /* !! */ .b = var9_10;
                    }
                    var17_12 = this.H;
                    var18_14 = this.a;
                    var8_7 = var18_14.length;
                    var16_8 /* !! */  = var17_12.f;
                    if (var16_8 /* !! */  == null || ((Object)var16_8 /* !! */ ).length < var8_7) {
                        var17_12.f = new int[var17_12.g.a.length];
                    }
                    for (var7_9 = 0; var7_9 < var8_7; ++var7_9) {
                        var17_12.f[var7_9] = var18_14[var7_9].f(-2147483648);
                    }
                }
            }
            this.aH(var1_1);
            this.l.a = false;
            this.J(this.c.k());
            this.bx(var15_4.a, var2_2);
            if (var15_4.c) {
                this.bw(-1);
                this.X(var1_1, this.l, var2_2);
                this.bw(1);
                var16_8 /* !! */  = this.l;
                var16_8 /* !! */ .c = var15_4.a + var16_8 /* !! */ .d;
                this.X(var1_1, (jn)var16_8 /* !! */ , var2_2);
            } else {
                this.bw(1);
                this.X(var1_1, this.l, var2_2);
                this.bw(-1);
                var16_8 /* !! */  = this.l;
                var16_8 /* !! */ .c = var15_4.a + var16_8 /* !! */ .d;
                this.X(var1_1, (jn)var16_8 /* !! */ , var2_2);
            }
            if (this.c.h() != 0x40000000) {
                var9_10 = this.ao();
                var5_15 = 0.0f;
                for (var7_9 = 0; var7_9 < var9_10; ++var7_9) {
                    var16_8 /* !! */  = this.aA(var7_9);
                    var6_17 = this.c.b((View)var16_8 /* !! */ );
                    var4_16 = var5_15;
                    if (!(var6_17 < var5_15)) {
                        var16_8 /* !! */  = (lo)var16_8 /* !! */ .getLayoutParams();
                        var4_16 = Math.max(var5_15, var6_17);
                    }
                    var5_15 = var4_16;
                }
                var11_11 = this.k;
                var7_9 = var8_7 = Math.round(var5_15 * (float)this.i);
                if (this.c.h() == -2147483648) {
                    var7_9 = Math.min(var8_7, this.c.k());
                }
                this.J(var7_9);
                if (this.k != var11_11) {
                    for (var7_9 = 0; var7_9 < var9_10; ++var7_9) {
                        var17_12 = this.aA(var7_9);
                        var16_8 /* !! */  = (lo)var17_12.getLayoutParams();
                        var14_5 = var16_8 /* !! */ .b;
                        if (this.L() && this.j == 1) {
                            var8_7 = -(this.i - 1 - var16_8 /* !! */ .a.e);
                            var17_12.offsetLeftAndRight(this.k * var8_7 - var8_7 * var11_11);
                            continue;
                        }
                        var12_13 = var16_8 /* !! */ .a.e;
                        var13_18 = this.k;
                        var8_7 = this.j;
                        var12_13 = var13_18 * var12_13 - var12_13 * var11_11;
                        if (var8_7 == 1) {
                            var17_12.offsetLeftAndRight(var12_13);
                            continue;
                        }
                        var17_12.offsetTopAndBottom(var12_13);
                    }
                }
            }
            if (this.ao() > 0) {
                if (this.e) {
                    this.ah(var1_1, var2_2, true);
                    this.ai(var1_1, var2_2, false);
                } else {
                    this.ai(var1_1, var2_2, true);
                    this.ah(var1_1, var2_2, false);
                }
            }
            if (!var3_3 || var2_2.g || this.n == 0 || this.ao() <= 0 || this.s() == null) ** GOTO lbl-1000
            this.bq(this.K);
            if (this.K()) {
                var7_9 = var10_6;
            } else lbl-1000:
            // 2 sources

            {
                var7_9 = 0;
            }
            if (var2_2.g) {
                this.H.a();
            }
            this.o = var15_4.c;
            this.p = this.L();
            if (var7_9 != 0) {
                this.H.a();
                this.al(var1_1, var2_2, false);
            }
            return;
        }
        this.aN(var1_1);
        var15_4.a();
    }

    private final void bA(View view, int n2, int n3) {
        this.aG(view, this.r);
        lo lo2 = (lo)view.getLayoutParams();
        n2 = StaggeredGridLayoutManager.bB(n2, lo2.leftMargin + this.r.left, lo2.rightMargin + this.r.right);
        n3 = StaggeredGridLayoutManager.bB(n3, lo2.topMargin + this.r.top, lo2.bottomMargin + this.r.bottom);
        if (this.bc(view, n2, n3, lo2)) {
            view.measure(n2, n3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final int bB(int n2, int n3, int n4) {
        int n5;
        int n6 = n3;
        if (n3 == 0) {
            if (n4 == 0) return n2;
            n6 = 0;
        }
        n3 = n5 = View.MeasureSpec.getMode((int)n2);
        if (n5 == Integer.MIN_VALUE) return View.MeasureSpec.makeMeasureSpec((int)Math.max(0, View.MeasureSpec.getSize((int)n2) - n6 - n4), (int)n3);
        if (n5 != 0x40000000) return n2;
        n3 = 0x40000000;
        return View.MeasureSpec.makeMeasureSpec((int)Math.max(0, View.MeasureSpec.getSize((int)n2) - n6 - n4), (int)n3);
    }

    private final void bs(kv kv2, jn jn2) {
        if (jn2.a && !jn2.i) {
            int n2;
            if (jn2.b == 0) {
                if (jn2.e == -1) {
                    this.bt(kv2, jn2.g);
                    return;
                }
                this.bu(kv2, jn2.f);
                return;
            }
            int n3 = jn2.e;
            int n4 = 1;
            if (n3 == -1) {
                int n5 = jn2.f;
                n4 = this.a[0].f(n5);
                for (n2 = 1; n2 < this.i; ++n2) {
                    int n6 = this.a[n2].f(n5);
                    n3 = n4;
                    if (n6 > n4) {
                        n3 = n6;
                    }
                    n4 = n3;
                }
                n2 = n5 - n4;
                n2 = n2 < 0 ? jn2.g : jn2.g - Math.min(n2, jn2.b);
                this.bt(kv2, n2);
                return;
            }
            int n7 = jn2.g;
            n3 = this.a[0].d(n7);
            for (n2 = n4; n2 < this.i; ++n2) {
                int n8 = this.a[n2].d(n7);
                n4 = n3;
                if (n8 < n3) {
                    n4 = n8;
                }
                n3 = n4;
            }
            n2 = n3 - jn2.g;
            if (n2 < 0) {
                n2 = jn2.f;
            } else {
                n4 = jn2.f;
                n2 = Math.min(n2, jn2.b) + n4;
            }
            this.bu(kv2, n2);
        }
    }

    private final void bt(kv kv2, int n2) {
        View view;
        int n3 = this.ao();
        while (--n3 >= 0 && this.b.d(view = this.aA(n3)) >= n2 && this.b.m(view) >= n2) {
            lo lo2 = (lo)view.getLayoutParams();
            boolean bl2 = lo2.b;
            if (lo2.a.a.size() == 1) break;
            lr lr2 = lo2.a;
            int n4 = lr2.a.size();
            View view2 = (View)lr2.a.remove(n4 - 1);
            lo2 = lr.n(view2);
            lo2.a = null;
            if (lo2.c() || lo2.b()) {
                lr2.d -= lr2.f.b.b(view2);
            }
            if (n4 == 1) {
                lr2.b = Integer.MIN_VALUE;
            }
            lr2.c = Integer.MIN_VALUE;
            this.aP(view, kv2);
        }
    }

    private final void bu(kv kv2, int n2) {
        View view;
        while (this.ao() > 0 && this.b.a(view = this.aA(0)) <= n2 && this.b.l(view) <= n2) {
            Object object = (lo)view.getLayoutParams();
            boolean bl2 = object.b;
            if (object.a.a.size() == 1) break;
            object = object.a;
            View view2 = (View)((lr)object).a.remove(0);
            lo lo2 = lr.n(view2);
            lo2.a = null;
            if (((lr)object).a.size() == 0) {
                ((lr)object).c = Integer.MIN_VALUE;
            }
            if (lo2.c() || lo2.b()) {
                ((lr)object).d -= ((lr)object).f.b.b(view2);
            }
            ((lr)object).b = Integer.MIN_VALUE;
            this.aP(view, kv2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void bv() {
        boolean bl2 = this.j != 1 && this.L() ? this.d ^ true : this.d;
        this.e = bl2;
    }

    private final void bw(int n2) {
        jn jn2 = this.l;
        jn2.e = n2;
        boolean bl2 = this.e;
        int n3 = 1;
        boolean bl3 = n2 == -1;
        n2 = bl2 == bl3 ? n3 : -1;
        jn2.d = n2;
    }

    private final void bx(int n2, ld object) {
        boolean bl2;
        int n3;
        jn jn2 = this.l;
        boolean bl3 = false;
        jn2.b = 0;
        jn2.c = n2;
        if (this.ba() && (n3 = ((ld)object).a) != -1) {
            boolean bl4 = this.e;
            bl2 = n3 < n2;
            if (bl4 == bl2) {
                n2 = this.b.k();
                n3 = 0;
            } else {
                n3 = this.b.k();
                n2 = 0;
            }
        } else {
            n2 = 0;
            n3 = 0;
        }
        object = this.t;
        if (object != null && ((RecyclerView)object).i) {
            this.l.f = this.b.j() - n3;
            this.l.g = this.b.f() + n2;
        } else {
            this.l.g = this.b.e() + n2;
            this.l.f = -n3;
        }
        object = this.l;
        ((jn)object).h = false;
        ((jn)object).a = true;
        bl2 = bl3;
        if (this.b.h() == 0) {
            bl2 = bl3;
            if (this.b.e() == 0) {
                bl2 = true;
            }
        }
        ((jn)object).i = bl2;
    }

    private final void by(lr lr2, int n2, int n3) {
        int n4 = lr2.d;
        if (n2 == -1) {
            if (lr2.e() + n4 <= n3) {
                this.m.set(lr2.e, false);
                return;
            }
        } else if (lr2.c() - n4 >= n3) {
            this.m.set(lr2.e, false);
        }
    }

    private final boolean bz(int n2) {
        int n3 = this.j;
        boolean bl2 = n2 == -1;
        if (n3 == 0) {
            return bl2 != this.e;
        }
        return (bl2 = bl2 == this.e) == this.L();
    }

    @Override
    public final void A(int n2, int n3) {
        this.aj(n2, n3, 2);
    }

    @Override
    public final void B(int n2, int n3) {
        this.aj(n2, n3, 4);
    }

    @Override
    public final int C(ld ld2) {
        return this.R(ld2);
    }

    @Override
    public final int D(ld ld2) {
        return this.S(ld2);
    }

    @Override
    public final int E(ld ld2) {
        return this.W(ld2);
    }

    @Override
    public final int F(ld ld2) {
        return this.R(ld2);
    }

    @Override
    public final int G(ld ld2) {
        return this.S(ld2);
    }

    @Override
    public final int H(ld ld2) {
        return this.W(ld2);
    }

    public final void I(boolean bl2) {
        ((ko)this).Q(null);
        lq lq2 = this.q;
        if (lq2 != null && lq2.h != bl2) {
            lq2.h = bl2;
        }
        this.d = bl2;
        this.aS();
    }

    final void J(int n2) {
        this.k = n2 / this.i;
        View.MeasureSpec.makeMeasureSpec((int)n2, (int)this.c.h());
    }

    public final boolean K() {
        if (this.ao() != 0 && this.n != 0 && this.w) {
            int n2;
            if (this.e) {
                n2 = this.i();
                this.c();
            } else {
                n2 = this.c();
                this.i();
            }
            if (n2 == 0 && this.s() != null) {
                this.h.b();
                this.v = true;
                this.aS();
                return true;
            }
        }
        return false;
    }

    final boolean L() {
        return this.ar() == 1;
    }

    @Override
    public final PointF M(int n2) {
        int n3 = this.O(n2);
        PointF pointF = new PointF();
        if (n3 == 0) {
            return null;
        }
        n2 = this.j;
        float f2 = n3;
        if (n2 == 0) {
            pointF.x = f2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = f2;
        }
        return pointF;
    }

    @Override
    public final Parcelable N() {
        lq lq2;
        block11: {
            block7: {
                Object object;
                Object object2 = this.q;
                if (object2 != null) {
                    return new lq((lq)object2);
                }
                lq2 = new lq();
                lq2.h = this.d;
                lq2.i = this.o;
                lq2.j = this.p;
                object2 = this.h;
                int n2 = 0;
                if (object2 != null && (object = ((abf)object2).b) != null) {
                    lq2.f = (int[])object;
                    lq2.e = lq2.f.length;
                    lq2.g = ((abf)object2).a;
                } else {
                    lq2.e = 0;
                }
                int n3 = this.ao();
                int n4 = -1;
                if (n3 <= 0) break block7;
                n3 = this.o ? this.i() : this.c();
                lq2.a = n3;
                object2 = this.e ? this.l(true) : this.r(true);
                n3 = object2 == null ? n4 : StaggeredGridLayoutManager.bk((View)object2);
                lq2.b = n3;
                lq2.c = n3 = this.i;
                lq2.d = new int[n3];
                while (n2 < this.i) {
                    block9: {
                        block10: {
                            block8: {
                                if (!this.o) break block8;
                                n3 = n4 = this.a[n2].d(Integer.MIN_VALUE);
                                if (n4 == Integer.MIN_VALUE) break block9;
                                n3 = this.b.f();
                                break block10;
                            }
                            n3 = n4 = this.a[n2].f(Integer.MIN_VALUE);
                            if (n4 == Integer.MIN_VALUE) break block9;
                            n3 = this.b.j();
                        }
                        n3 = n4 - n3;
                    }
                    lq2.d[n2] = n3;
                    ++n2;
                }
                break block11;
            }
            lq2.a = -1;
            lq2.b = -1;
            lq2.c = 0;
        }
        return lq2;
    }

    @Override
    public final void Q(String string) {
        if (this.q == null) {
            super.Q(string);
        }
    }

    @Override
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (this.ao() > 0) {
            View view = this.r(false);
            View view2 = this.l(false);
            if (view != null && view2 != null) {
                int n2;
                int n3 = StaggeredGridLayoutManager.bk(view);
                if (n3 < (n2 = StaggeredGridLayoutManager.bk(view2))) {
                    accessibilityEvent.setFromIndex(n3);
                    accessibilityEvent.setToIndex(n2);
                    return;
                }
                accessibilityEvent.setFromIndex(n2);
                accessibilityEvent.setToIndex(n3);
            }
        }
    }

    @Override
    public final void U(Parcelable parcelable) {
        if (parcelable instanceof lq) {
            parcelable = (lq)parcelable;
            this.q = parcelable;
            if (this.f != -1) {
                parcelable.a();
                this.q.b();
            }
            this.aS();
        }
    }

    @Override
    public final void V(int n2) {
        lq lq2 = this.q;
        if (lq2 != null && lq2.a != n2) {
            lq2.a();
        }
        this.f = n2;
        this.g = Integer.MIN_VALUE;
        this.aS();
    }

    @Override
    public final boolean Y() {
        return this.j == 0;
    }

    @Override
    public final boolean Z() {
        return this.j == 1;
    }

    @Override
    public final int a(kv kv2, ld ld2) {
        if (this.j == 1) {
            return Math.min(this.i, ld2.a());
        }
        return -1;
    }

    @Override
    public final void aJ(int n2) {
        super.aJ(n2);
        for (int i2 = 0; i2 < this.i; ++i2) {
            this.a[i2].k(n2);
        }
    }

    @Override
    public final void aK(int n2) {
        super.aK(n2);
        for (int i2 = 0; i2 < this.i; ++i2) {
            this.a[i2].k(n2);
        }
    }

    @Override
    public final void aM(int n2) {
        if (n2 == 0) {
            this.K();
        }
    }

    @Override
    public final boolean aa() {
        return this.n != 0;
    }

    @Override
    public final boolean ac() {
        return this.d;
    }

    @Override
    public final void af(int n2, int n3, ld ld2, jh jh2) {
        if (1 == this.j) {
            n2 = n3;
        }
        if (this.ao() != 0 && n2 != 0) {
            this.w(n2, ld2);
            Object object = this.J;
            int n4 = 0;
            if (object == null || ((int[])object).length < (n2 = this.i)) {
                this.J = new int[this.i];
            }
            n2 = 0;
            for (n3 = 0; n3 < this.i; ++n3) {
                int n5;
                int n6;
                object = this.l;
                if (object.d == -1) {
                    n6 = object.f;
                    n5 = this.a[n3].f(n6);
                } else {
                    n6 = this.a[n3].d(object.g);
                    n5 = this.l.g;
                }
                n6 -= n5;
                n5 = n2;
                if (n6 >= 0) {
                    this.J[n2] = n6;
                    n5 = n2 + 1;
                }
                n2 = n5;
            }
            Arrays.sort(this.J, 0, n2);
            for (n3 = n4; n3 < n2 && this.l.a(ld2); ++n3) {
                jh2.a(this.l.c, this.J[n3]);
                object = this.l;
                object.c += object.d;
            }
        }
    }

    @Override
    public final void ak(RecyclerView recyclerView) {
        this.bq(this.K);
        for (int i2 = 0; i2 < this.i; ++i2) {
            this.a[i2].j();
        }
        recyclerView.requestLayout();
    }

    @Override
    public final void am(RecyclerView object, int n2) {
        object = new lc(object.getContext());
        ((lc)object).a = n2;
        this.aY((lc)object);
    }

    @Override
    public final int b(kv kv2, ld ld2) {
        if (this.j == 0) {
            return Math.min(this.i, ld2.a());
        }
        return -1;
    }

    @Override
    public final void bo() {
        this.h.b();
        for (int i2 = 0; i2 < this.i; ++i2) {
            this.a[i2].j();
        }
    }

    final int c() {
        if (this.ao() == 0) {
            return 0;
        }
        return StaggeredGridLayoutManager.bk(this.aA(0));
    }

    @Override
    public final int d(int n2, kv kv2, ld ld2) {
        return this.k(n2, kv2, ld2);
    }

    @Override
    public final int e(int n2, kv kv2, ld ld2) {
        return this.k(n2, kv2, ld2);
    }

    @Override
    public final kp f() {
        if (this.j == 0) {
            return new lo(-2, -1);
        }
        return new lo(-1, -2);
    }

    @Override
    public final kp g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new lo((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new lo(layoutParams);
    }

    @Override
    public final kp h(Context context, AttributeSet attributeSet) {
        return new lo(context, attributeSet);
    }

    final int i() {
        int n2 = this.ao();
        if (n2 == 0) {
            return 0;
        }
        return StaggeredGridLayoutManager.bk(this.aA(n2 - 1));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final View j(View var1_1, int var2_2, kv var3_3, ld var4_4) {
        block21: {
            block22: {
                block28: {
                    block27: {
                        block23: {
                            block24: {
                                block25: {
                                    block26: {
                                        if (this.ao() == 0) {
                                            return null;
                                        }
                                        if ((var1_1 = this.az(var1_1)) == null) {
                                            return null;
                                        }
                                        this.bv();
                                        var7_5 = 1;
                                        if (var2_2 == 1) break block22;
                                        if (var2_2 == 2) break block23;
                                        if (var2_2 == 17) break block24;
                                        if (var2_2 == 33) break block25;
                                        if (var2_2 == 66) break block26;
                                        if (var2_2 != 130) lbl-1000:
                                        // 5 sources

                                        {
                                            while (true) {
                                                var2_2 = -2147483648;
                                                break block21;
                                                break;
                                            }
                                        }
                                        if (this.j != 1) ** GOTO lbl-1000
                                        break block27;
                                    }
                                    if (this.j != 0) ** GOTO lbl-1000
                                    break block27;
                                }
                                if (this.j != 1) ** GOTO lbl-1000
                                ** GOTO lbl-1000
                            }
                            if (this.j == 0) ** break;
                            ** while (true)
                            ** GOTO lbl-1000
                        }
                        if (this.j != 1) break block28;
                    }
lbl31:
                    // 3 sources

                    while (true) {
                        var2_2 = 1;
                        break block21;
                        break;
                    }
                }
                if (!this.L()) ** GOTO lbl31
                ** GOTO lbl-1000
            }
            if (this.j == 1) lbl-1000:
            // 5 sources

            {
                while (true) {
                    var2_2 = -1;
                    break;
                }
            } else {
                if (!this.L()) ** continue;
                ** continue;
            }
        }
        if (var2_2 == -2147483648) {
            return null;
        }
        var10_6 = (lo)var1_1.getLayoutParams();
        var9_7 = var10_6.b;
        var10_6 = var10_6.a;
        var5_8 = var2_2 == 1 ? this.i() : this.c();
        this.bx(var5_8, var4_4);
        this.bw(var2_2);
        var11_9 = this.l;
        var11_9.c = var11_9.d + var5_8;
        var11_9.b = (int)((float)this.b.k() * 0.33333334f);
        var11_9 = this.l;
        var11_9.h = true;
        var8_10 = 0;
        var11_9.a = false;
        this.X(var3_3, var11_9, var4_4);
        this.o = this.e;
        var3_3 = var10_6.g(var5_8, var2_2);
        if (var3_3 != null && var3_3 != var1_1) {
            return var3_3;
        }
        if (this.bz(var2_2)) {
            for (var6_11 = this.i - 1; var6_11 >= 0; --var6_11) {
                var3_3 = this.a[var6_11].g(var5_8, var2_2);
                if (var3_3 == null || var3_3 == var1_1) continue;
                return var3_3;
            }
        } else {
            for (var6_11 = 0; var6_11 < this.i; ++var6_11) {
                var3_3 = this.a[var6_11].g(var5_8, var2_2);
                if (var3_3 == null || var3_3 == var1_1) continue;
                return var3_3;
            }
        }
        var9_7 = this.d;
        var5_8 = var2_2 != -1 ? 0 : 1;
        var6_11 = (var5_8 = (var9_7 ^ 1) == var5_8 ? var7_5 : 0) != 0 ? var10_6.a() : var10_6.b();
        var3_3 = this.P(var6_11);
        if (var3_3 != null && var3_3 != var1_1) {
            return var3_3;
        }
        if (this.bz(var2_2)) {
            for (var2_2 = this.i - 1; var2_2 >= 0; --var2_2) {
                if (var2_2 == var10_6.e || (var3_3 = this.P(var6_11 = var5_8 != 0 ? this.a[var2_2].a() : this.a[var2_2].b())) == null || var3_3 == var1_1) continue;
                return var3_3;
            }
        } else {
            for (var6_11 = var8_10; var6_11 < this.i; ++var6_11) {
                var2_2 = var5_8 != 0 ? this.a[var6_11].a() : this.a[var6_11].b();
                var3_3 = this.P(var2_2);
                if (var3_3 == null || var3_3 == var1_1) continue;
                return var3_3;
            }
        }
        return null;
    }

    final int k(int n2, kv kv2, ld object) {
        if (this.ao() != 0 && n2 != 0) {
            this.w(n2, (ld)object);
            int n3 = this.X(kv2, this.l, (ld)object);
            if (this.l.b >= n3) {
                n2 = n2 < 0 ? -n3 : n3;
            }
            this.b.n(-n2);
            this.o = this.e;
            object = this.l;
            ((jn)object).b = 0;
            this.bs(kv2, (jn)object);
            return n2;
        }
        return 0;
    }

    final View l(boolean bl2) {
        int n2 = this.b.j();
        int n3 = this.b.f();
        View view = null;
        for (int i2 = this.ao() - 1; i2 >= 0; --i2) {
            View view2 = this.aA(i2);
            int n4 = this.b.d(view2);
            int n5 = this.b.a(view2);
            View view3 = view;
            if (n5 > n2) {
                view3 = view;
                if (n4 < n3) {
                    if (n5 > n3 && bl2) {
                        view3 = view;
                        if (view == null) {
                            view3 = view2;
                        }
                    } else {
                        return view2;
                    }
                }
            }
            view = view3;
        }
        return view;
    }

    @Override
    public final void m(kv kv2, ld ld2, xv xv2) {
        super.m(kv2, ld2, xv2);
        xv2.g("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override
    public final void n(kv object, ld ld2, View view, xv xv2) {
        object = view.getLayoutParams();
        if (!(object instanceof lo)) {
            super.aL(view, xv2);
            return;
        }
        object = (lo)((Object)object);
        if (this.j == 0) {
            int n2 = ((lo)((Object)object)).d();
            boolean bl2 = ((lo)((Object)object)).b;
            xv2.h(bzb.am(n2, 1, -1, -1));
            return;
        }
        int n3 = ((lo)((Object)object)).d();
        boolean bl3 = ((lo)((Object)object)).b;
        xv2.h(bzb.am(-1, -1, n3, 1));
    }

    @Override
    public final void o(kv kv2, ld ld2) {
        this.al(kv2, ld2, true);
    }

    @Override
    public final void p(ld ld2) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    @Override
    public final void q(Rect rect, int n2, int n3) {
        int n4 = this.av() + this.aw();
        int n5 = this.ax() + this.au();
        if (this.j == 1) {
            n3 = StaggeredGridLayoutManager.an(n3, rect.height() + n5, this.as());
            n2 = StaggeredGridLayoutManager.an(n2, this.k * this.i + n4, this.at());
        } else {
            n2 = StaggeredGridLayoutManager.an(n2, rect.width() + n4, this.at());
            n3 = StaggeredGridLayoutManager.an(n3, this.k * this.i + n5, this.as());
        }
        this.aV(n2, n3);
    }

    final View r(boolean bl2) {
        int n2 = this.b.j();
        int n3 = this.b.f();
        int n4 = this.ao();
        View view = null;
        for (int i2 = 0; i2 < n4; ++i2) {
            View view2 = this.aA(i2);
            int n5 = this.b.d(view2);
            View view3 = view;
            if (this.b.a(view2) > n2) {
                view3 = view;
                if (n5 < n3) {
                    if (n5 < n2 && bl2) {
                        view3 = view;
                        if (view == null) {
                            view3 = view2;
                        }
                    } else {
                        return view2;
                    }
                }
            }
            view = view3;
        }
        return view;
    }

    final View s() {
        int n2 = this.ao();
        int n3 = n2 - 1;
        BitSet bitSet = new BitSet(this.i);
        bitSet.set(0, this.i, true);
        int n4 = this.j == 1 && this.L() ? 1 : -1;
        if (this.e) {
            n2 = -1;
        } else {
            n3 = 0;
        }
        int n5 = n3 < n2 ? 1 : -1;
        while (n3 != n2) {
            int n6;
            int n7;
            boolean bl2;
            Object object;
            Object object2;
            View view;
            block12: {
                block14: {
                    block15: {
                        block13: {
                            view = this.aA(n3);
                            object2 = (lo)view.getLayoutParams();
                            if (!bitSet.get(((lo)((Object)object2)).a.e)) break block12;
                            object = ((lo)((Object)object2)).a;
                            if (!this.e) break block13;
                            if (object.c() >= this.b.f()) break block14;
                            object2 = object.a;
                            bl2 = lr.n((View)((View)((ArrayList)object2).get((int)(((ArrayList)object2).size() - 1)))).b;
                            break block15;
                        }
                        if (object.e() <= this.b.j()) break block14;
                        bl2 = lr.n((View)((View)object.a.get((int)0))).b;
                    }
                    return view;
                }
                bitSet.clear(((lo)((Object)object2)).a.e);
            }
            bl2 = ((lo)((Object)object2)).b;
            n3 = n7 = n3 + n5;
            if (n7 == n2) continue;
            object = this.aA(n7);
            if (this.e) {
                int n8;
                n6 = this.b.a(view);
                if (n6 < (n8 = this.b.a((View)object))) {
                    return view;
                }
                n3 = n7;
                if (n6 != n8) continue;
            } else {
                n6 = this.b.d(view);
                if (n6 > (n3 = this.b.d((View)object))) {
                    return view;
                }
                if (n6 != n3) {
                    n3 = n7;
                    continue;
                }
            }
            object = (lo)object.getLayoutParams();
            n3 = ((lo)((Object)object2)).a.e - ((lo)((Object)object)).a.e >= 0 ? 0 : 1;
            n6 = n4 >= 0 ? 0 : 1;
            if (n3 == n6) {
                n3 = n7;
                continue;
            }
            return view;
        }
        return null;
    }

    @Override
    public final boolean t(kp kp2) {
        return kp2 instanceof lo;
    }

    @Override
    public final boolean v() {
        return this.q == null;
    }

    final void w(int n2, ld object) {
        int n3;
        int n4;
        if (n2 > 0) {
            n4 = this.i();
            n3 = 1;
        } else {
            n4 = this.c();
            n3 = -1;
        }
        this.l.a = true;
        this.bx(n4, (ld)object);
        this.bw(n3);
        object = this.l;
        ((jn)object).c = n4 + ((jn)object).d;
        ((jn)object).b = Math.abs(n2);
    }

    @Override
    public final void x(int n2, int n3) {
        this.aj(n2, n3, 1);
    }

    @Override
    public final void y() {
        this.h.b();
        this.aS();
    }

    @Override
    public final void z(int n2, int n3) {
        this.aj(n2, n3, 8);
    }
}

