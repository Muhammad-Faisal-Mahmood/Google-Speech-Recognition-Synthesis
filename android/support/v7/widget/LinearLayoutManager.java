/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class LinearLayoutManager
extends ko
implements lb {
    private js a;
    private boolean b;
    private boolean c = false;
    private boolean d = true;
    private final jr e;
    private int f = 2;
    private int[] g;
    public int k = 1;
    kc l;
    public boolean m = false;
    boolean n = false;
    int o = -1;
    int p = Integer.MIN_VALUE;
    jt q = null;
    final jq r = new jq();

    public LinearLayoutManager() {
        this(1, false);
    }

    public LinearLayoutManager(int n2, boolean bl2) {
        this.e = new jr();
        this.g = new int[2];
        this.W(n2);
        this.X(bl2);
    }

    public LinearLayoutManager(Context object, AttributeSet attributeSet, int n2, int n3) {
        this.e = new jr();
        this.g = new int[2];
        object = LinearLayoutManager.ay(object, attributeSet, n2, n3);
        this.W(object.a);
        this.X(object.c);
        this.s(object.d);
    }

    private final void bA(kv kv2, int n2, int n3) {
        block4: {
            if (n2 == n3) break block4;
            if (n3 > n2) {
                while (--n3 >= n2) {
                    this.aQ(n3, kv2);
                }
            } else {
                for (int i2 = n2; i2 > n3; --i2) {
                    this.aQ(i2, kv2);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void bB() {
        boolean bl2 = this.k != 1 && this.ab() ? this.m ^ true : this.m;
        this.n = bl2;
    }

    private final void bC(int n2, int n3, boolean bl2, ld object) {
        this.a.m = this.ad();
        this.a.f = n2;
        Object object2 = this.g;
        object2[0] = 0;
        int n4 = 1;
        int n5 = 1;
        object2[1] = 0;
        this.R((ld)object, (int[])object2);
        int n6 = Math.max(0, this.g[0]);
        int n7 = Math.max(0, this.g[1]);
        int n8 = n2 == 1 ? n7 : n6;
        object = this.a;
        ((js)object).h = n8;
        if (n2 != 1) {
            n6 = n7;
        }
        ((js)object).i = n6;
        if (n2 == 1) {
            ((js)object).h = n8 + this.l.g();
            object = this.bx();
            js js2 = this.a;
            n2 = true != this.n ? n5 : -1;
            js2.e = n2;
            n2 = LinearLayoutManager.bk((View)object);
            object2 = this.a;
            js2.d = n2 + object2.e;
            object2.b = this.l.a((View)object);
            n2 = this.l.a((View)object) - this.l.f();
        } else {
            object = this.by();
            object2 = this.a;
            object2.h += this.l.j();
            object2 = this.a;
            n2 = n4;
            if (!this.n) {
                n2 = -1;
            }
            object2.e = n2;
            n2 = LinearLayoutManager.bk((View)object);
            js js3 = this.a;
            object2.d = n2 + js3.e;
            js3.b = this.l.d((View)object);
            n2 = -this.l.d((View)object) + this.l.j();
        }
        object = this.a;
        ((js)object).c = n3;
        if (bl2) {
            ((js)object).c = n3 - n2;
        }
        ((js)object).g = n2;
    }

    private final void bD(jq jq2) {
        this.bE(jq2.b, jq2.c);
    }

    private final void bE(int n2, int n3) {
        this.a.c = this.l.f() - n3;
        js js2 = this.a;
        int n4 = true != this.n ? 1 : -1;
        js2.e = n4;
        js2.d = n2;
        js2.f = 1;
        js2.b = n3;
        js2.g = Integer.MIN_VALUE;
    }

    private final void bF(jq jq2) {
        this.bG(jq2.b, jq2.c);
    }

    private final void bG(int n2, int n3) {
        this.a.c = n3 - this.l.j();
        js js2 = this.a;
        js2.d = n2;
        boolean bl2 = this.n;
        n2 = 1;
        if (!bl2) {
            n2 = -1;
        }
        js2.e = n2;
        js2.f = -1;
        js2.b = n3;
        js2.g = Integer.MIN_VALUE;
    }

    private final int bs(ld ld2) {
        if (this.ao() == 0) {
            return 0;
        }
        this.S();
        return kl.n(ld2, this.l, this.ai(this.d ^ true), this.ah(this.d ^ true), this, this.d);
    }

    private final int bt(int n2, kv kv2, ld ld2, boolean bl2) {
        int n3 = this.l.f() - n2;
        if (n3 > 0) {
            n3 = -this.L(-n3, kv2, ld2);
            if (bl2 && (n2 = this.l.f() - (n2 + n3)) > 0) {
                this.l.n(n2);
                return n2 + n3;
            }
            return n3;
        }
        return 0;
    }

    private final int bu(int n2, kv kv2, ld ld2, boolean bl2) {
        int n3 = n2 - this.l.j();
        if (n3 > 0) {
            int n4;
            n3 = n4 = -this.L(n3, kv2, ld2);
            if (bl2) {
                n2 = n2 + n4 - this.l.j();
                n3 = n4;
                if (n2 > 0) {
                    this.l.n(-n2);
                    n3 = n4 - n2;
                }
            }
            return n3;
        }
        return 0;
    }

    private final View bv() {
        return this.O(0, this.ao());
    }

    private final View bw() {
        return this.O(this.ao() - 1, -1);
    }

    private final View bx() {
        int n2 = this.n ? 0 : this.ao() - 1;
        return this.aA(n2);
    }

    private final View by() {
        int n2 = this.n ? this.ao() - 1 : 0;
        return this.aA(n2);
    }

    private final void bz(kv kv2, js js2) {
        block13: {
            int n2;
            int n3;
            block14: {
                if (!js2.a || js2.m) break block13;
                n3 = js2.g;
                n2 = js2.i;
                if (js2.f != -1) break block14;
                int n4 = this.ao();
                if (n3 < 0) break block13;
                n2 = this.l.e() - n3 + n2;
                if (this.n) {
                    for (n3 = 0; n3 < n4; ++n3) {
                        js2 = this.aA(n3);
                        if (this.l.d((View)js2) >= n2 && this.l.m((View)js2) >= n2) {
                            continue;
                        }
                        this.bA(kv2, 0, n3);
                        return;
                    }
                } else {
                    for (n3 = --n4; n3 >= 0; --n3) {
                        js2 = this.aA(n3);
                        if (this.l.d((View)js2) >= n2 && this.l.m((View)js2) >= n2) {
                            continue;
                        }
                        this.bA(kv2, n4, n3);
                        return;
                    }
                }
                break block13;
            }
            if (n3 >= 0) {
                n2 = n3 - n2;
                int n5 = this.ao();
                if (this.n) {
                    for (n3 = --n5; n3 >= 0; --n3) {
                        js2 = this.aA(n3);
                        if (this.l.a((View)js2) <= n2 && this.l.l((View)js2) <= n2) {
                            continue;
                        }
                        this.bA(kv2, n5, n3);
                        return;
                    }
                } else {
                    for (n3 = 0; n3 < n5; ++n3) {
                        js2 = this.aA(n3);
                        if (this.l.a((View)js2) <= n2 && this.l.l((View)js2) <= n2) {
                            continue;
                        }
                        this.bA(kv2, 0, n3);
                        break;
                    }
                }
            }
        }
    }

    private final int c(ld ld2) {
        if (this.ao() == 0) {
            return 0;
        }
        this.S();
        return kl.l(ld2, this.l, this.ai(this.d ^ true), this.ah(this.d ^ true), this, this.d);
    }

    private final int r(ld ld2) {
        if (this.ao() == 0) {
            return 0;
        }
        this.S();
        return kl.m(ld2, this.l, this.ai(this.d ^ true), this.ah(this.d ^ true), this, this.d, this.n);
    }

    @Override
    public final int C(ld ld2) {
        return this.c(ld2);
    }

    @Override
    public final int D(ld ld2) {
        return this.r(ld2);
    }

    @Override
    public final int E(ld ld2) {
        return this.bs(ld2);
    }

    @Override
    public final int F(ld ld2) {
        return this.c(ld2);
    }

    @Override
    public final int G(ld ld2) {
        return this.r(ld2);
    }

    @Override
    public final int H(ld ld2) {
        return this.bs(ld2);
    }

    final int I(int n2) {
        block11: {
            block12: {
                int n3;
                int n4;
                block14: {
                    block13: {
                        n4 = -1;
                        int n5 = 1;
                        if (n2 == 1) break block11;
                        if (n2 == 2) break block12;
                        n3 = n4;
                        if (n2 == 17) break block13;
                        n3 = n4;
                        n4 = n5;
                        if (n2 == 33) break block14;
                        if (n2 != 66) {
                            if (n2 != 130) {
                                return Integer.MIN_VALUE;
                            }
                            if (this.k == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        n3 = 1;
                    }
                    n4 = 0;
                }
                if (this.k == n4) {
                    return n3;
                }
                return Integer.MIN_VALUE;
            }
            if (this.k == 1) {
                return 1;
            }
            if (this.ab()) {
                return -1;
            }
            return 1;
        }
        if (this.k == 1) {
            return -1;
        }
        if (this.ab()) {
            return 1;
        }
        return -1;
    }

    final int J(kv kv2, js js2, ld ld2, boolean bl2) {
        int n2 = js2.c;
        int n3 = js2.g;
        if (n3 != Integer.MIN_VALUE) {
            if (n2 < 0) {
                js2.g = n3 + n2;
            }
            this.bz(kv2, js2);
        }
        int n4 = js2.c + js2.h;
        jr jr2 = this.e;
        while ((js2.m || n4 > 0) && js2.d(ld2)) {
            int n5;
            block9: {
                block8: {
                    jr2.a = 0;
                    jr2.b = false;
                    jr2.c = false;
                    jr2.d = false;
                    this.k(kv2, ld2, js2, jr2);
                    if (jr2.b) break;
                    n3 = js2.b;
                    n5 = jr2.a;
                    js2.b = n3 + js2.f * n5;
                    if (!jr2.c || js2.l != null) break block8;
                    n3 = n4;
                    if (ld2.g) break block9;
                }
                js2.c -= n5;
                n3 = n4 - n5;
            }
            if ((n4 = js2.g) != Integer.MIN_VALUE) {
                js2.g = n5 = n4 + n5;
                n4 = js2.c;
                if (n4 < 0) {
                    js2.g = n5 + n4;
                }
                this.bz(kv2, js2);
            }
            n4 = n3;
            if (!bl2) continue;
            n4 = n3;
            if (!jr2.d) continue;
        }
        return n2 - js2.c;
    }

    public final int K() {
        View view = this.aj(0, this.ao(), false);
        if (view == null) {
            return -1;
        }
        return LinearLayoutManager.bk(view);
    }

    final int L(int n2, kv kv2, ld ld2) {
        if (this.ao() != 0 && n2 != 0) {
            this.S();
            this.a.a = true;
            int n3 = n2 > 0 ? 1 : -1;
            int n4 = Math.abs(n2);
            this.bC(n3, n4, true, ld2);
            js js2 = this.a;
            int n5 = js2.g + this.J(kv2, js2, ld2, false);
            if (n5 >= 0) {
                if (n4 > n5) {
                    n2 = n3 * n5;
                }
                this.l.n(-n2);
                this.a.k = n2;
                return n2;
            }
        }
        return 0;
    }

    @Override
    public final PointF M(int n2) {
        if (this.ao() == 0) {
            return null;
        }
        boolean bl2 = false;
        int n3 = LinearLayoutManager.bk(this.aA(0));
        int n4 = 1;
        if (n2 < n3) {
            bl2 = true;
        }
        n2 = n4;
        if (bl2 != this.n) {
            n2 = -1;
        }
        n4 = this.k;
        float f2 = n2;
        if (n4 == 0) {
            return new PointF(f2, 0.0f);
        }
        return new PointF(0.0f, f2);
    }

    @Override
    public final Parcelable N() {
        jt jt2 = this.q;
        if (jt2 != null) {
            return new jt(jt2);
        }
        jt2 = new jt();
        if (this.ao() > 0) {
            boolean bl2;
            this.S();
            jt2.c = bl2 = this.b ^ this.n;
            if (bl2) {
                View view = this.bx();
                jt2.b = this.l.f() - this.l.a(view);
                jt2.a = LinearLayoutManager.bk(view);
            } else {
                View view = this.by();
                jt2.a = LinearLayoutManager.bk(view);
                jt2.b = this.l.d(view) - this.l.j();
            }
        } else {
            jt2.a();
        }
        return jt2;
    }

    final View O(int n2, int n3) {
        int n4;
        this.S();
        if (n3 <= n2 && n3 >= n2) {
            return this.aA(n2);
        }
        int n5 = this.l.d(this.aA(n2));
        int n6 = n5 < (n4 = this.l.j()) ? 16388 : 4097;
        n4 = n5 < n4 ? 16644 : 4161;
        View view = this.k == 0 ? this.F.h(n2, n3, n4, n6) : this.G.h(n2, n3, n4, n6);
        return view;
    }

    @Override
    public final View P(int n2) {
        View view;
        int n3 = this.ao();
        if (n3 == 0) {
            return null;
        }
        int n4 = n2 - LinearLayoutManager.bk(this.aA(0));
        if (n4 >= 0 && n4 < n3 && LinearLayoutManager.bk(view = this.aA(n4)) == n2) {
            return view;
        }
        return super.P(n2);
    }

    @Override
    public final void Q(String string) {
        if (this.q == null) {
            super.Q(string);
        }
    }

    protected final void R(ld ld2, int[] nArray) {
        int n2 = ld2.a != -1 ? this.l.k() : 0;
        int n3 = this.a.f;
        int n4 = n3 == -1 ? 0 : n2;
        if (n3 != -1) {
            n2 = 0;
        }
        nArray[0] = n2;
        nArray[1] = n4;
    }

    final void S() {
        if (this.a == null) {
            this.a = new js();
        }
    }

    @Override
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (this.ao() > 0) {
            accessibilityEvent.setFromIndex(this.K());
            int n2 = this.ao();
            int n3 = -1;
            View view = this.aj(n2 - 1, -1, false);
            if (view != null) {
                n3 = LinearLayoutManager.bk(view);
            }
            accessibilityEvent.setToIndex(n3);
        }
    }

    @Override
    public final void U(Parcelable parcelable) {
        if (parcelable instanceof jt) {
            parcelable = (jt)parcelable;
            this.q = parcelable;
            if (this.o != -1) {
                parcelable.a();
            }
            this.aS();
        }
    }

    @Override
    public final void V(int n2) {
        this.o = n2;
        this.p = Integer.MIN_VALUE;
        jt jt2 = this.q;
        if (jt2 != null) {
            jt2.a();
        }
        this.aS();
    }

    public final void W(int n2) {
        kc kc2;
        if (n2 != 0 && n2 != 1) {
            throw new IllegalArgumentException(a.af(n2, "invalid orientation:"));
        }
        ((ko)this).Q(null);
        if (n2 == this.k && this.l != null) {
            return;
        }
        this.l = kc2 = kc.p(this, n2);
        this.r.a = kc2;
        this.k = n2;
        this.aS();
    }

    public final void X(boolean bl2) {
        ((ko)this).Q(null);
        if (bl2 == this.m) {
            return;
        }
        this.m = bl2;
        this.aS();
    }

    @Override
    public final boolean Y() {
        return this.k == 0;
    }

    @Override
    public final boolean Z() {
        return this.k == 1;
    }

    @Override
    public final boolean aa() {
        return true;
    }

    protected final boolean ab() {
        return this.ar() == 1;
    }

    @Override
    public final boolean ac() {
        return this.m;
    }

    final boolean ad() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override
    public final boolean ae() {
        if (this.C != 0x40000000 && this.B != 0x40000000) {
            int n2 = this.ao();
            for (int i2 = 0; i2 < n2; ++i2) {
                ViewGroup.LayoutParams layoutParams = this.aA(i2).getLayoutParams();
                if (layoutParams.width >= 0 || layoutParams.height >= 0) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public final void af(int n2, int n3, ld ld2, jh jh2) {
        if (1 == this.k) {
            n2 = n3;
        }
        if (this.ao() != 0 && n2 != 0) {
            this.S();
            n3 = n2 > 0 ? 1 : -1;
            this.bC(n3, Math.abs(n2), true, ld2);
            this.w(ld2, this.a, jh2);
        }
    }

    @Override
    public final void ag(int n2, jh jh2) {
        int n3;
        int n4;
        boolean bl2;
        jt jt2 = this.q;
        int n5 = -1;
        if (jt2 != null && jt2.b()) {
            bl2 = jt2.c;
            n4 = jt2.a;
        } else {
            this.bB();
            boolean bl3 = this.n;
            n4 = n3 = this.o;
            bl2 = bl3;
            if (n3 == -1) {
                if (bl3) {
                    n4 = n2 - 1;
                    bl2 = bl3;
                } else {
                    n4 = 0;
                    bl2 = bl3;
                }
            }
        }
        if (!bl2) {
            n5 = 1;
        }
        for (n3 = 0; n3 < this.f && n4 >= 0 && n4 < n2; n4 += n5, ++n3) {
            jh2.a(n4, 0);
        }
    }

    final View ah(boolean bl2) {
        if (this.n) {
            return this.aj(0, this.ao(), bl2);
        }
        return this.aj(this.ao() - 1, -1, bl2);
    }

    final View ai(boolean bl2) {
        if (this.n) {
            return this.aj(this.ao() - 1, -1, bl2);
        }
        return this.aj(0, this.ao(), bl2);
    }

    final View aj(int n2, int n3, boolean bl2) {
        this.S();
        int n4 = this.k;
        int n5 = true != bl2 ? 320 : 24579;
        View view = n4 == 0 ? this.F.h(n2, n3, n5, 320) : this.G.h(n2, n3, n5, 320);
        return view;
    }

    @Override
    public final void ak(RecyclerView recyclerView) {
    }

    public final void al(int n2) {
        this.o = n2;
        this.p = 0;
        jt jt2 = this.q;
        if (jt2 != null) {
            jt2.a();
        }
        this.aS();
    }

    @Override
    public final void am(RecyclerView object, int n2) {
        object = new lc(object.getContext());
        ((lc)object).a = n2;
        this.aY((lc)object);
    }

    @Override
    public int d(int n2, kv kv2, ld ld2) {
        if (this.k == 1) {
            return 0;
        }
        return this.L(n2, kv2, ld2);
    }

    @Override
    public int e(int n2, kv kv2, ld ld2) {
        if (this.k == 0) {
            return 0;
        }
        return this.L(n2, kv2, ld2);
    }

    @Override
    public kp f() {
        return new kp(-2, -2);
    }

    public View i(kv object, ld ld2, boolean bl2, boolean bl3) {
        int n2;
        int n3;
        this.S();
        int n4 = this.ao();
        if (bl3) {
            n3 = this.ao();
            n4 = -1;
            --n3;
            n2 = -1;
        } else {
            n2 = 1;
            n3 = 0;
        }
        int n5 = ld2.a();
        int n6 = this.l.j();
        int n7 = this.l.f();
        ld2 = null;
        View view = null;
        object = null;
        while (n3 != n4) {
            Object object2;
            View view2;
            ld ld3;
            block12: {
                View view3;
                block16: {
                    block17: {
                        block15: {
                            int n8;
                            block14: {
                                int n9;
                                int n10;
                                block13: {
                                    view3 = this.aA(n3);
                                    n8 = LinearLayoutManager.bk(view3);
                                    n10 = this.l.d(view3);
                                    n9 = this.l.a(view3);
                                    ld3 = ld2;
                                    view2 = view;
                                    object2 = object;
                                    if (n8 < 0) break block12;
                                    ld3 = ld2;
                                    view2 = view;
                                    object2 = object;
                                    if (n8 >= n5) break block12;
                                    if (!((kp)view3.getLayoutParams()).c()) break block13;
                                    ld3 = ld2;
                                    view2 = view;
                                    object2 = object;
                                    if (object == null) {
                                        ld3 = ld2;
                                        view2 = view;
                                        object2 = view3;
                                    }
                                    break block12;
                                }
                                n8 = n9 <= n6 && n10 < n6 ? 1 : 0;
                                n9 = n10 >= n7 && n9 > n7 ? 1 : 0;
                                if (n8 == 0 && n9 == 0) {
                                    return view3;
                                }
                                if (!bl2) break block14;
                                if (n9 != 0) break block15;
                                ld3 = ld2;
                                view2 = view;
                                object2 = object;
                                if (ld2 != null) break block12;
                                break block16;
                            }
                            if (n8 == 0) break block17;
                        }
                        ld3 = ld2;
                        view2 = view3;
                        object2 = object;
                        break block12;
                    }
                    ld3 = ld2;
                    view2 = view;
                    object2 = object;
                    if (ld2 != null) break block12;
                }
                object2 = object;
                view2 = view;
                ld3 = view3;
            }
            n3 += n2;
            ld2 = ld3;
            view = view2;
            object = object2;
        }
        if (ld2 != null) {
            object = ld2;
        } else if (view != null) {
            return view;
        }
        return object;
    }

    @Override
    public View j(View object, int n2, kv kv2, ld ld2) {
        this.bB();
        if (this.ao() == 0) {
            return null;
        }
        if ((n2 = this.I(n2)) == Integer.MIN_VALUE) {
            return null;
        }
        this.S();
        this.bC(n2, (int)((float)this.l.k() * 0.33333334f), false, ld2);
        object = this.a;
        object.g = Integer.MIN_VALUE;
        object.a = false;
        this.J(kv2, (js)object, ld2, true);
        if (n2 == -1) {
            object = this.n ? this.bw() : this.bv();
            n2 = -1;
        } else {
            object = this.n ? this.bv() : this.bw();
        }
        kv2 = n2 == -1 ? this.by() : this.bx();
        if (kv2.hasFocusable()) {
            if (object == null) {
                return null;
            }
            return kv2;
        }
        return object;
    }

    public void k(kv kv2, ld object, js js2, jr jr2) {
        View view = js2.a(kv2);
        if (view == null) {
            jr2.b = true;
            return;
        }
        object = (kp)view.getLayoutParams();
        if (js2.l == null) {
            boolean bl2 = this.n;
            boolean bl3 = js2.f == -1;
            if (bl2 == bl3) {
                this.aE(view);
            } else {
                this.aF(view, 0);
            }
        } else {
            boolean bl4 = this.n;
            boolean bl5 = js2.f == -1;
            if (bl4 == bl5) {
                this.aC(view);
            } else {
                this.aD(view, 0);
            }
        }
        kp kp2 = (kp)view.getLayoutParams();
        kv2 = this.t.f(view);
        int n2 = ((Rect)kv2).left;
        int n3 = ((Rect)kv2).right;
        int n4 = ((Rect)kv2).top;
        int n5 = ((Rect)kv2).bottom;
        n2 = ko.ap(this.D, this.B, this.av() + this.aw() + kp2.leftMargin + kp2.rightMargin + (n2 + n3), kp2.width, ((ko)this).Y());
        n4 = ko.ap(this.E, this.C, this.ax() + this.au() + kp2.topMargin + kp2.bottomMargin + (n4 + n5), kp2.height, ((ko)this).Z());
        if (this.bc(view, n2, n4, kp2)) {
            view.measure(n2, n4);
        }
        jr2.a = this.l.b(view);
        if (this.k == 1) {
            if (this.ab()) {
                n2 = this.D - this.aw();
                n3 = n2 - this.l.c(view);
            } else {
                n3 = this.av();
                n2 = this.l.c(view) + n3;
            }
            if (js2.f == -1) {
                n4 = js2.b;
                n5 = n4 - jr2.a;
            } else {
                n5 = js2.b;
                n4 = jr2.a + n5;
            }
        } else {
            n4 = this.ax();
            int n6 = this.l.c(view) + n4;
            if (js2.f == -1) {
                n5 = js2.b;
                n3 = jr2.a;
                n2 = n5;
                n3 = n5 - n3;
                n5 = n4;
                n4 = n6;
            } else {
                n5 = js2.b;
                n2 = jr2.a;
                n3 = n5;
                n2 += n5;
                n5 = n4;
                n4 = n6;
            }
        }
        LinearLayoutManager.bn(view, n3, n5, n2, n4);
        if (((kp)((Object)object)).c() || ((kp)((Object)object)).b()) {
            jr2.c = true;
        }
        jr2.d = view.hasFocusable();
    }

    public void l(kv kv2, ld ld2, jq jq2, int n2) {
    }

    @Override
    public void m(kv object, ld ld2, xv xv2) {
        super.m((kv)object, ld2, xv2);
        object = this.t.m;
        if (object != null && ((kf)object).getItemCount() > 0) {
            xv2.d(xu.f);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void o(kv object, ld ld2) {
        int n2;
        int n3;
        int n4;
        int n5;
        boolean bl2;
        int n6;
        Object object2;
        int n7;
        Object object3;
        block39: {
            block37: {
                block46: {
                    block47: {
                        block40: {
                            block41: {
                                block43: {
                                    block44: {
                                        block45: {
                                            block42: {
                                                block38: {
                                                    object3 = this.q;
                                                    n7 = -1;
                                                    if ((object3 != null || this.o != -1) && ld2.a() == 0) {
                                                        this.aN((kv)object);
                                                        return;
                                                    }
                                                    object3 = this.q;
                                                    if (object3 != null && ((jt)object3).b()) {
                                                        this.o = ((jt)object3).a;
                                                    }
                                                    this.S();
                                                    this.a.a = false;
                                                    this.bB();
                                                    object3 = this.aB();
                                                    object2 = this.r;
                                                    if (!((jq)object2).e || this.o != -1 || this.q != null) break block38;
                                                    if (object3 != null && (this.l.d((View)object3) >= this.l.f() || this.l.a((View)object3) <= this.l.j())) {
                                                        this.r.c((View)object3, LinearLayoutManager.bk((View)object3));
                                                    }
                                                    break block39;
                                                }
                                                ((jq)object2).d();
                                                object3 = this.r;
                                                ((jq)object3).d = this.n ^ this.c;
                                                if (ld2.g || (n6 = this.o) == -1) break block40;
                                                if (n6 < 0 || n6 >= ld2.a()) break block41;
                                                ((jq)object3).b = n6 = this.o;
                                                object2 = this.q;
                                                if (object2 == null || !((jt)object2).b()) break block42;
                                                ((jq)object3).d = bl2 = ((jt)object2).c;
                                                ((jq)object3).c = bl2 ? this.l.f() - this.q.b : this.l.j() + this.q.b;
                                                break block37;
                                            }
                                            if (this.p != Integer.MIN_VALUE) break block43;
                                            object2 = ((ko)this).P(n6);
                                            if (object2 == null) break block44;
                                            if (this.l.b((View)object2) <= this.l.k()) break block45;
                                            ((jq)object3).a();
                                            break block37;
                                        }
                                        if (this.l.d((View)object2) - this.l.j() < 0) {
                                            ((jq)object3).c = this.l.j();
                                            ((jq)object3).d = false;
                                            break block37;
                                        } else if (this.l.f() - this.l.a((View)object2) < 0) {
                                            ((jq)object3).c = this.l.f();
                                            ((jq)object3).d = true;
                                            break block37;
                                        } else {
                                            n6 = ((jq)object3).d ? this.l.a((View)object2) + this.l.o() : this.l.d((View)object2);
                                            ((jq)object3).c = n6;
                                        }
                                        break block37;
                                    }
                                    if (this.ao() > 0) {
                                        n6 = LinearLayoutManager.bk(this.aA(0));
                                        bl2 = this.o < n6;
                                        bl2 = bl2 == this.n;
                                        ((jq)object3).d = bl2;
                                    }
                                    ((jq)object3).a();
                                    break block37;
                                }
                                ((jq)object3).d = bl2 = this.n;
                                ((jq)object3).c = bl2 ? this.l.f() - this.p : this.l.j() + this.p;
                                break block37;
                            }
                            this.o = -1;
                            this.p = Integer.MIN_VALUE;
                        }
                        if (this.ao() == 0) break block46;
                        View view = this.aB();
                        if (view == null || ((kp)((Object)(object2 = (kp)view.getLayoutParams()))).c() || ((kp)((Object)object2)).a() < 0 || ((kp)((Object)object2)).a() >= ld2.a()) break block47;
                        ((jq)object3).c(view, LinearLayoutManager.bk(view));
                        break block37;
                    }
                    boolean bl3 = this.b;
                    bl2 = this.c;
                    if (bl3 != bl2 || (object2 = this.i((kv)object, ld2, ((jq)object3).d, bl2)) == null) break block46;
                    ((jq)object3).b((View)object2, LinearLayoutManager.bk((View)object2));
                    if (!ld2.g && ((ko)this).v()) {
                        n5 = this.l.d((View)object2);
                        n4 = this.l.a((View)object2);
                        n3 = this.l.j();
                        n2 = this.l.f();
                        n6 = n4 <= n3 && n5 < n3 ? 1 : 0;
                        n5 = n5 >= n2 && n4 > n2 ? 1 : 0;
                        if (n6 != 0 || n5 != 0) {
                            n6 = true != ((jq)object3).d ? n3 : n2;
                            ((jq)object3).c = n6;
                        }
                    }
                    break block37;
                }
                ((jq)object3).a();
                n6 = this.c ? ld2.a() - 1 : 0;
                ((jq)object3).b = n6;
            }
            this.r.e = true;
        }
        object3 = this.a;
        n6 = ((js)object3).k >= 0 ? 1 : -1;
        ((js)object3).f = n6;
        object3 = this.g;
        object3[0] = false;
        object3[1] = false;
        this.R(ld2, (int[])object3);
        n3 = Math.max(0, this.g[0]) + this.l.j();
        n2 = Math.max(0, this.g[1]) + this.l.g();
        n6 = n3;
        n5 = n2;
        if (ld2.g) {
            n4 = this.o;
            n6 = n3;
            n5 = n2;
            if (n4 != -1) {
                n6 = n3;
                n5 = n2;
                if (this.p != Integer.MIN_VALUE) {
                    object3 = ((ko)this).P(n4);
                    n6 = n3;
                    n5 = n2;
                    if (object3 != null) {
                        if (this.n) {
                            n6 = this.l.f() - this.l.a((View)object3);
                            n5 = this.p;
                        } else {
                            n5 = this.l.d((View)object3) - this.l.j();
                            n6 = this.p;
                        }
                        if ((n6 -= n5) > 0) {
                            n6 = n3 + n6;
                            n5 = n2;
                        } else {
                            n5 = n2 - n6;
                            n6 = n3;
                        }
                    }
                }
            }
        }
        object3 = this.r;
        if (!(!((jq)object3).d ? true == this.n : true != this.n)) {
            n7 = 1;
        }
        this.l((kv)object, ld2, (jq)object3, n7);
        this.aH((kv)object);
        this.a.m = this.ad();
        object3 = this.a;
        ((js)object3).j = ld2.g;
        ((js)object3).i = 0;
        object3 = this.r;
        if (((jq)object3).d) {
            this.bF((jq)object3);
            object3 = this.a;
            ((js)object3).h = n6;
            this.J((kv)object, (js)object3, ld2, false);
            object3 = this.a;
            n7 = ((js)object3).b;
            n2 = ((js)object3).d;
            n3 = ((js)object3).c;
            n6 = n5;
            if (n3 > 0) {
                n6 = n5 + n3;
            }
            this.bD(this.r);
            object3 = this.a;
            ((js)object3).h = n6;
            ((js)object3).d += ((js)object3).e;
            this.J((kv)object, (js)object3, ld2, false);
            object3 = this.a;
            n3 = ((js)object3).b;
            n4 = ((js)object3).c;
            n5 = n7;
            n6 = n3;
            if (n4 > 0) {
                this.bG(n2, n7);
                object3 = this.a;
                ((js)object3).h = n4;
                this.J((kv)object, (js)object3, ld2, false);
                n5 = this.a.b;
                n6 = n3;
            }
        } else {
            this.bD((jq)object3);
            object3 = this.a;
            ((js)object3).h = n5;
            this.J((kv)object, (js)object3, ld2, false);
            object3 = this.a;
            n7 = ((js)object3).b;
            n2 = ((js)object3).d;
            n3 = ((js)object3).c;
            n5 = n6;
            if (n3 > 0) {
                n5 = n6 + n3;
            }
            this.bF(this.r);
            object3 = this.a;
            ((js)object3).h = n5;
            ((js)object3).d += ((js)object3).e;
            this.J((kv)object, (js)object3, ld2, false);
            object3 = this.a;
            n3 = ((js)object3).b;
            n4 = ((js)object3).c;
            n5 = n3;
            n6 = n7;
            if (n4 > 0) {
                this.bE(n2, n7);
                object3 = this.a;
                ((js)object3).h = n4;
                this.J((kv)object, (js)object3, ld2, false);
                n6 = this.a.b;
                n5 = n3;
            }
        }
        n3 = n5;
        n7 = n6;
        if (this.ao() > 0) {
            if (this.n ^ this.c) {
                n3 = this.bt(n6, (kv)object, ld2, true);
                n7 = n5 + n3;
                n6 += n3;
                n5 = this.bu(n7, (kv)object, ld2, false);
            } else {
                n3 = this.bu(n5, (kv)object, ld2, true);
                n7 = n5 + n3;
                n5 = this.bt(n6 += n3, (kv)object, ld2, false);
            }
            n3 = n7 + n5;
            n7 = n6 + n5;
        }
        if (ld2.k && this.ao() != 0 && !ld2.g && ((ko)this).v()) {
            object3 = ((kv)object).d;
            int n8 = object3.size();
            int n9 = LinearLayoutManager.bk(this.aA(0));
            n6 = n5 = 0;
            for (n2 = 0; n2 < n8; ++n2) {
                object2 = (lg)object3.get(n2);
                int n10 = n5;
                n4 = n6;
                if (!((lg)object2).isRemoved()) {
                    bl2 = ((lg)object2).getLayoutPosition() < n9;
                    if (bl2 != this.n) {
                        n10 = n5 + this.l.b(((lg)object2).itemView);
                        n4 = n6;
                    } else {
                        n4 = n6 + this.l.b(((lg)object2).itemView);
                        n10 = n5;
                    }
                }
                n5 = n10;
                n6 = n4;
            }
            this.a.l = object3;
            if (n5 > 0) {
                this.bG(LinearLayoutManager.bk(this.by()), n3);
                object3 = this.a;
                ((js)object3).h = n5;
                ((js)object3).c = 0;
                ((js)object3).b();
                this.J((kv)object, this.a, ld2, false);
            }
            if (n6 > 0) {
                this.bE(LinearLayoutManager.bk(this.bx()), n7);
                object3 = this.a;
                ((js)object3).h = n6;
                ((js)object3).c = 0;
                ((js)object3).b();
                this.J((kv)object, this.a, ld2, false);
            }
            this.a.l = null;
        }
        if (!ld2.g) {
            object = this.l;
            ((kc)object).b = ((kc)object).k();
        } else {
            this.r.d();
        }
        this.b = this.c;
    }

    @Override
    public void p(ld ld2) {
        this.q = null;
        this.o = -1;
        this.p = Integer.MIN_VALUE;
        this.r.d();
    }

    public void s(boolean bl2) {
        ((ko)this).Q(null);
        if (this.c == bl2) {
            return;
        }
        this.c = bl2;
        this.aS();
    }

    @Override
    public boolean u(int n2, Bundle object) {
        if (super.u(n2, (Bundle)object)) {
            return true;
        }
        if (n2 == 16908343 && object != null) {
            if (this.k == 1) {
                n2 = object.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (n2 < 0) {
                    return false;
                }
                object = this.t;
                n2 = Math.min(n2, this.b(object.e, object.O) - 1);
            } else {
                n2 = object.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (n2 < 0) {
                    return false;
                }
                object = this.t;
                n2 = Math.min(n2, this.a(object.e, object.O) - 1);
            }
            if (n2 >= 0) {
                this.al(n2);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean v() {
        return this.q == null && this.b == this.c;
    }

    public void w(ld ld2, js js2, jh jh2) {
        int n2 = js2.d;
        if (n2 >= 0 && n2 < ld2.a()) {
            jh2.a(n2, Math.max(0, js2.g));
        }
    }
}

