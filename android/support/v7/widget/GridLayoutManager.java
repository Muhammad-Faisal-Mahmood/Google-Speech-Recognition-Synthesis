/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.GridView
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class GridLayoutManager
extends LinearLayoutManager {
    private static final Set H = DesugarCollections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(17, 66, 33, 130)));
    private int I = -1;
    boolean a = false;
    public int b = -1;
    int[] c;
    View[] d;
    final SparseIntArray e = new SparseIntArray();
    final SparseIntArray f = new SparseIntArray();
    public jm g = new jk();
    final Rect h = new Rect();
    int i = -1;
    int j = -1;

    public GridLayoutManager(int n2) {
        this.r(n2);
    }

    public GridLayoutManager(int n2, int n3, boolean bl2) {
        super(n3, bl2);
        this.r(n2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.r(GridLayoutManager.ay((Context)context, (AttributeSet)attributeSet, (int)n2, (int)n3).b);
    }

    private final void bA(int n2) {
        int[] nArray;
        int n3;
        int n4;
        int n5;
        block7: {
            block6: {
                int[] nArray2 = this.c;
                n5 = this.b;
                n4 = n5 + 1;
                if (nArray2 == null || (n3 = nArray2.length) != n4) break block6;
                nArray = nArray2;
                if (nArray2[n3 - 1] == n2) break block7;
            }
            nArray = new int[n4];
        }
        int n6 = 0;
        nArray[0] = 0;
        int n7 = n2 / n5;
        int n8 = n2 % n5;
        n3 = 0;
        n2 = n6;
        for (n4 = 1; n4 <= n5; ++n4) {
            if ((n2 += n8) > 0 && n5 - n2 < n8) {
                n6 = n7 + 1;
                n2 -= n5;
            } else {
                n6 = n7;
            }
            nArray[n4] = n3 += n6;
        }
        this.c = nArray;
    }

    private final void bB() {
        int n2;
        View[] viewArray = this.d;
        if (viewArray != null && viewArray.length == (n2 = this.b)) {
            return;
        }
        this.d = new View[this.b];
    }

    private final void bC(View view, int n2, boolean bl2) {
        jl jl2 = (jl)view.getLayoutParams();
        Rect rect = jl2.d;
        int n3 = rect.top + rect.bottom + jl2.topMargin + jl2.bottomMargin;
        int n4 = rect.left + rect.right + jl2.leftMargin + jl2.rightMargin;
        int n5 = this.c(jl2.a, jl2.b);
        if (this.k == 1) {
            n4 = GridLayoutManager.ap(n5, n2, n4, jl2.width, false);
            n2 = GridLayoutManager.ap(this.l.k(), this.C, n3, jl2.height, true);
        } else {
            n2 = GridLayoutManager.ap(n5, n2, n3, jl2.height, false);
            n4 = GridLayoutManager.ap(this.l.k(), this.B, n4, jl2.width, true);
        }
        this.bD(view, n4, n2, bl2);
    }

    private final void bD(View view, int n2, int n3, boolean bl2) {
        kp kp2 = (kp)view.getLayoutParams();
        if (bl2) {
            boolean bl3;
            boolean bl4 = this.x;
            bl2 = bl3 = true;
            if (bl4) {
                bl2 = bl3;
                if (ko.aZ(view.getMeasuredWidth(), n2, kp2.width)) {
                    bl2 = !ko.aZ(view.getMeasuredHeight(), n3, kp2.height) ? bl3 : false;
                }
            }
        } else {
            bl2 = this.bc(view, n2, n3, kp2);
        }
        if (bl2) {
            view.measure(n2, n3);
        }
    }

    private final void bE() {
        int n2;
        int n3;
        if (this.k == 1) {
            n3 = this.D - this.aw();
            n2 = this.av();
        } else {
            n3 = this.E - this.au();
            n2 = this.ax();
        }
        this.bA(n3 - n2);
    }

    private final int bs(int n2) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.t;
            n2 = this.bu(recyclerView.e, recyclerView.O, n2);
        } else {
            RecyclerView recyclerView = this.t;
            n2 = this.bv(recyclerView.e, recyclerView.O, n2);
        }
        return n2;
    }

    private final int bt(int n2) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.t;
            n2 = this.bu(recyclerView.e, recyclerView.O, n2);
        } else {
            RecyclerView recyclerView = this.t;
            n2 = this.bv(recyclerView.e, recyclerView.O, n2);
        }
        return n2;
    }

    private final int bu(kv kv2, ld ld2, int n2) {
        block10: {
            int n3;
            int n4;
            int n5;
            block9: {
                block8: {
                    if (ld2.g) break block8;
                    n5 = n2;
                    break block9;
                }
                n5 = kv2.a(n2);
                if (n5 == -1) break block10;
            }
            int n6 = this.b;
            n2 = 0;
            int n7 = n4 = 0;
            while (true) {
                int n8;
                n3 = n2 + 1;
                if (n4 >= n5) break;
                if (n3 == n6) {
                    n8 = n7 + 1;
                    n2 = 0;
                } else {
                    n8 = n7;
                    n2 = n3;
                    if (n3 > n6) {
                        n8 = n7 + 1;
                        n2 = 1;
                    }
                }
                ++n4;
                n7 = n8;
            }
            n2 = n7;
            if (n3 > n6) {
                n2 = n7 + 1;
            }
            return n2;
        }
        Log.w((String)"GridLayoutManager", (String)a.af(n2, "Cannot find span size for pre layout position. "));
        return 0;
    }

    private final int bv(kv kv2, ld ld2, int n2) {
        if (!ld2.g) {
            return this.g.a(n2, this.b);
        }
        int n3 = this.f.get(n2, -1);
        if (n3 != -1) {
            return n3;
        }
        n3 = kv2.a(n2);
        if (n3 == -1) {
            Log.w((String)"GridLayoutManager", (String)a.af(n2, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
            return 0;
        }
        return this.g.a(n3, this.b);
    }

    private final int bw(kv kv2, ld ld2, int n2) {
        if (!ld2.g) {
            this.g.b();
            return 1;
        }
        int n3 = this.e.get(n2, -1);
        if (n3 != -1) {
            return n3;
        }
        if (kv2.a(n2) == -1) {
            Log.w((String)"GridLayoutManager", (String)a.af(n2, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
            return 1;
        }
        this.g.b();
        return 1;
    }

    private final Set bx(int n2) {
        return this.bz(this.bs(n2), n2);
    }

    private final Set by(int n2) {
        return this.bz(this.bt(n2), n2);
    }

    private final Set bz(int n2, int n3) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        RecyclerView recyclerView = this.t;
        int n4 = this.bw(recyclerView.e, recyclerView.O, n3);
        for (n3 = n2; n3 < n2 + n4; ++n3) {
            hashSet.add(n3);
        }
        return hashSet;
    }

    @Override
    public final void A(int n2, int n3) {
        this.g.d();
        this.g.c();
    }

    @Override
    public final void B(int n2, int n3) {
        this.g.d();
        this.g.c();
    }

    @Override
    public final int a(kv kv2, ld ld2) {
        if (this.k == 1) {
            return Math.min(this.b, this.aq());
        }
        if (ld2.a() <= 0) {
            return 0;
        }
        return this.bu(kv2, ld2, ld2.a() - 1) + 1;
    }

    @Override
    public final int b(kv kv2, ld ld2) {
        if (this.k == 0) {
            return Math.min(this.b, this.aq());
        }
        if (ld2.a() <= 0) {
            return 0;
        }
        return this.bu(kv2, ld2, ld2.a() - 1) + 1;
    }

    final int c(int n2, int n3) {
        if (this.k == 1 && this.ab()) {
            int[] nArray = this.c;
            n2 = this.b - n2;
            return nArray[n2] - nArray[n2 - n3];
        }
        int[] nArray = this.c;
        return nArray[n3 + n2] - nArray[n2];
    }

    @Override
    public final int d(int n2, kv kv2, ld ld2) {
        this.bE();
        this.bB();
        return super.d(n2, kv2, ld2);
    }

    @Override
    public final int e(int n2, kv kv2, ld ld2) {
        this.bE();
        this.bB();
        return super.e(n2, kv2, ld2);
    }

    @Override
    public final kp f() {
        if (this.k == 0) {
            return new jl(-2, -1);
        }
        return new jl(-1, -2);
    }

    @Override
    public final kp g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new jl((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new jl(layoutParams);
    }

    @Override
    public final kp h(Context context, AttributeSet attributeSet) {
        return new jl(context, attributeSet);
    }

    @Override
    public final View i(kv kv2, ld ld2, boolean bl2, boolean bl3) {
        int n2;
        int n3;
        int n4 = this.ao();
        if (bl3) {
            n3 = this.ao();
            n4 = -1;
            --n3;
            n2 = -1;
        } else {
            n3 = 0;
            n2 = 1;
        }
        int n5 = ld2.a();
        this.S();
        int n6 = this.l.j();
        int n7 = this.l.f();
        View view = null;
        View view2 = null;
        while (n3 != n4) {
            View view3 = this.aA(n3);
            int n8 = GridLayoutManager.bk(view3);
            View view4 = view;
            View view5 = view2;
            if (n8 >= 0) {
                view4 = view;
                view5 = view2;
                if (n8 < n5) {
                    if (this.bv(kv2, ld2, n8) != 0) {
                        view4 = view;
                        view5 = view2;
                    } else if (((kp)view3.getLayoutParams()).c()) {
                        view4 = view;
                        view5 = view2;
                        if (view2 == null) {
                            view5 = view3;
                            view4 = view;
                        }
                    } else {
                        if (this.l.d(view3) < n7 && this.l.a(view3) >= n6) {
                            return view3;
                        }
                        view4 = view;
                        view5 = view2;
                        if (view == null) {
                            view4 = view3;
                            view5 = view2;
                        }
                    }
                }
            }
            n3 += n2;
            view = view4;
            view2 = view5;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    @Override
    public final View j(View object, int n2, kv kv2, ld ld2) {
        int n3;
        int n4;
        View view = this.az((View)object);
        if (view == null) {
            return null;
        }
        jl jl2 = (jl)view.getLayoutParams();
        int n5 = jl2.a;
        int n6 = jl2.b + n5;
        if (super.j((View)object, n2, kv2, ld2) == null) {
            return null;
        }
        boolean bl2 = this.I(n2) == 1;
        boolean bl3 = this.n;
        int n7 = -1;
        if (bl2 != bl3) {
            n2 = this.ao() - 1;
            n4 = -1;
            n3 = -1;
        } else {
            n4 = this.ao();
            n3 = 1;
            n2 = 0;
        }
        int n8 = this.k == 1 && this.ab() ? 1 : 0;
        int n9 = this.bu(kv2, ld2, n2);
        jl2 = null;
        View view2 = null;
        int n10 = -1;
        int n11 = 0;
        int n12 = 0;
        while (n2 != n4) {
            View view3;
            int n13;
            int n14;
            int n15;
            int n16;
            block13: {
                int n17;
                int n18;
                jl jl3;
                View view4;
                block15: {
                    int n19;
                    block17: {
                        block18: {
                            block16: {
                                block14: {
                                    block12: {
                                        n16 = this.bu(kv2, ld2, n2);
                                        view4 = this.aA(n2);
                                        if (view4 == view) break;
                                        if (!view4.hasFocusable() || n16 == n9) break block12;
                                        if (jl2 != null) break;
                                        object = null;
                                        n15 = n11;
                                        n14 = n12;
                                        n13 = n7;
                                        n16 = n10;
                                        view3 = view2;
                                        break block13;
                                    }
                                    jl3 = (jl)view4.getLayoutParams();
                                    n18 = jl3.a;
                                    n17 = jl3.b + n18;
                                    if (view4.hasFocusable() && n18 == n5 && n17 == n6) {
                                        return view4;
                                    }
                                    if (!view4.hasFocusable() || jl2 != null) break block14;
                                    object = null;
                                    break block15;
                                }
                                if (view4.hasFocusable() || view2 != null) break block16;
                                object = jl2;
                                break block15;
                            }
                            n16 = Math.max(n18, n5);
                            n19 = Math.min(n17, n6) - n16;
                            if (!view4.hasFocusable()) break block17;
                            if (n19 <= n11) break block18;
                            object = jl2;
                            break block15;
                        }
                        n15 = n11;
                        n14 = n12;
                        n13 = n7;
                        n16 = n10;
                        object = jl2;
                        view3 = view2;
                        if (n19 != n11) break block13;
                        n19 = n18 <= n7 ? 0 : 1;
                        n15 = n11;
                        n14 = n12;
                        n13 = n7;
                        n16 = n10;
                        object = jl2;
                        view3 = view2;
                        if (n8 != n19) break block13;
                        object = jl2;
                        break block15;
                    }
                    n15 = n11;
                    n14 = n12;
                    n13 = n7;
                    n16 = n10;
                    object = jl2;
                    view3 = view2;
                    if (jl2 != null) break block13;
                    n15 = n11;
                    n14 = n12;
                    n13 = n7;
                    n16 = n10;
                    object = jl2;
                    view3 = view2;
                    if (!this.bm(view4)) break block13;
                    object = jl2;
                    if (n19 > n12) break block15;
                    n15 = n11;
                    n14 = n12;
                    n13 = n7;
                    n16 = n10;
                    object = jl2;
                    view3 = view2;
                    if (n19 != n12) break block13;
                    n19 = n18 <= n10 ? 0 : 1;
                    n15 = n11;
                    n14 = n12;
                    n13 = n7;
                    n16 = n10;
                    object = jl2;
                    view3 = view2;
                    if (n8 != n19) break block13;
                    object = jl2;
                }
                if (view4.hasFocusable()) {
                    n13 = jl3.a;
                    n7 = Math.min(n17, n6);
                    n11 = Math.max(n18, n5);
                    object = view4;
                    n15 = n7 - n11;
                    n14 = n12;
                    n16 = n10;
                    view3 = view2;
                } else {
                    n16 = jl3.a;
                    n10 = Math.min(n17, n6);
                    n12 = Math.max(n18, n5);
                    view3 = view4;
                    n14 = n10 - n12;
                    n13 = n7;
                    n15 = n11;
                }
            }
            n2 += n3;
            n11 = n15;
            n12 = n14;
            n7 = n13;
            n10 = n16;
            jl2 = object;
            view2 = view3;
        }
        if (jl2 != null) {
            return jl2;
        }
        return view2;
    }

    @Override
    public final void k(kv object, ld ld2, js js2, jr jr2) {
        jl jl2;
        int n2;
        int n3;
        int n4;
        int n5 = this.l.i();
        int n6 = this.ao() > 0 ? this.c[this.b] : 0;
        int n7 = n5 != 0x40000000 ? 1 : 0;
        if (n7 != 0) {
            this.bE();
        }
        int n8 = js2.e;
        int n9 = this.b;
        if (n8 != 1) {
            n9 = this.bv((kv)object, ld2, js2.d) + this.bw((kv)object, ld2, js2.d);
        }
        for (n4 = 0; n4 < this.b && js2.d(ld2) && n9 > 0; ++n4) {
            n3 = js2.d;
            n2 = this.bw((kv)object, ld2, n3);
            if (n2 <= this.b) {
                if ((n9 -= n2) < 0 || (jl2 = js2.a((kv)object)) == null) break;
                this.d[n4] = jl2;
                continue;
            }
            object = new StringBuilder("Item at position ");
            ((StringBuilder)object).append(n3);
            ((StringBuilder)object).append(" requires ");
            ((StringBuilder)object).append(n2);
            ((StringBuilder)object).append(" spans but GridLayoutManager has only ");
            ((StringBuilder)object).append(this.b);
            ((StringBuilder)object).append(" spans.");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        if (n4 != 0) {
            if (n8 == 1) {
                n2 = 1;
                n3 = n4;
                n9 = 0;
            } else {
                n9 = n4 - 1;
                n3 = -1;
                n2 = -1;
            }
            int n10 = 0;
            while (n9 != n3) {
                int n11;
                View view = this.d[n9];
                jl2 = (jl)view.getLayoutParams();
                jl2.b = n11 = this.bw((kv)object, ld2, GridLayoutManager.bk(view));
                jl2.a = n10;
                n10 += n11;
                n9 += n2;
            }
            float f2 = 0.0f;
            n9 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                ld2 = this.d[n3];
                if (js2.l == null) {
                    if (n8 == 1) {
                        this.aE((View)ld2);
                    } else {
                        this.aF((View)ld2, 0);
                    }
                } else if (n8 == 1) {
                    this.aC((View)ld2);
                } else {
                    this.aD((View)ld2, 0);
                }
                this.aG((View)ld2, this.h);
                this.bC((View)ld2, n5, false);
                n10 = this.l.b((View)ld2);
                n2 = n9;
                if (n10 > n9) {
                    n2 = n10;
                }
                object = (jl)ld2.getLayoutParams();
                float f3 = (float)this.l.c((View)ld2) / (float)((jl)((Object)object)).b;
                float f4 = f2;
                if (f3 > f2) {
                    f4 = f3;
                }
                f2 = f4;
                n9 = n2;
            }
            n2 = n9;
            if (n7 != 0) {
                this.bA(Math.max(Math.round(f2 * (float)this.b), n6));
                n9 = 0;
                n6 = 0;
                while (true) {
                    n2 = n9;
                    if (n6 >= n4) break;
                    object = this.d[n6];
                    this.bC((View)object, 0x40000000, true);
                    n2 = this.l.b((View)object);
                    n7 = n9;
                    if (n2 > n9) {
                        n7 = n2;
                    }
                    ++n6;
                    n9 = n7;
                }
            }
            for (n9 = 0; n9 < n4; ++n9) {
                jl2 = this.d[n9];
                if (this.l.b((View)jl2) == n2) continue;
                object = (jl)jl2.getLayoutParams();
                ld2 = ((jl)((Object)object)).d;
                n7 = ((Rect)ld2).top + ((Rect)ld2).bottom + ((jl)((Object)object)).topMargin + ((jl)((Object)object)).bottomMargin;
                n6 = ((Rect)ld2).left + ((Rect)ld2).right + ((jl)((Object)object)).leftMargin + ((jl)((Object)object)).rightMargin;
                n3 = this.c(((jl)((Object)object)).a, ((jl)((Object)object)).b);
                if (this.k == 1) {
                    n6 = GridLayoutManager.ap(n3, 0x40000000, n6, ((jl)((Object)object)).width, false);
                    n7 = View.MeasureSpec.makeMeasureSpec((int)(n2 - n7), (int)0x40000000);
                } else {
                    n6 = View.MeasureSpec.makeMeasureSpec((int)(n2 - n6), (int)0x40000000);
                    n7 = GridLayoutManager.ap(n3, 0x40000000, n7, ((jl)((Object)object)).height, false);
                }
                this.bD((View)jl2, n6, n7, true);
            }
            jr2.a = n2;
            if (this.k == 1) {
                if (js2.f == -1) {
                    n9 = js2.b;
                    n6 = 0;
                    n7 = 0;
                    n2 = n9 - n2;
                } else {
                    n3 = js2.b;
                    n9 = n3 + n2;
                    n6 = 0;
                    n7 = 0;
                    n2 = n3;
                }
            } else {
                if (js2.f == -1) {
                    n7 = js2.b;
                    n6 = n7 - n2;
                } else {
                    n6 = js2.b;
                    n7 = n6 + n2;
                }
                n9 = 0;
                n2 = 0;
            }
            n10 = 0;
            n3 = n2;
            n2 = n10;
            n10 = n7;
            n5 = n6;
            n7 = n9;
            while (n2 < n4) {
                ld2 = this.d[n2];
                object = (jl)ld2.getLayoutParams();
                if (this.k == 1) {
                    if (this.ab()) {
                        n9 = this.av() + this.c[this.b - ((jl)((Object)object)).a];
                        n10 = this.l.c((View)ld2);
                        n6 = n9;
                        n9 -= n10;
                    } else {
                        n9 = this.av() + this.c[((jl)((Object)object)).a];
                        n6 = this.l.c((View)ld2) + n9;
                    }
                } else {
                    n9 = this.ax() + this.c[((jl)((Object)object)).a];
                    n6 = this.l.c((View)ld2);
                    n3 = n9;
                    n7 = n6 + n9;
                    n6 = n10;
                    n9 = n5;
                }
                GridLayoutManager.bn((View)ld2, n9, n3, n6, n7);
                if (((kp)((Object)object)).c() || ((kp)((Object)object)).b()) {
                    jr2.c = true;
                }
                boolean bl2 = jr2.d;
                jr2.d = ld2.hasFocusable() | bl2;
                ++n2;
                n5 = n9;
                n10 = n6;
            }
            Arrays.fill(this.d, null);
            return;
        }
        jr2.b = true;
    }

    @Override
    public final void l(kv kv2, ld ld2, jq jq2, int n2) {
        this.bE();
        if (ld2.a() > 0 && !ld2.g) {
            int n3 = this.bv(kv2, ld2, jq2.b);
            if (n2 == 1) {
                while (n3 > 0 && (n2 = jq2.b) > 0) {
                    jq2.b = --n2;
                    n3 = this.bv(kv2, ld2, n2);
                }
            } else {
                int n4;
                int n5 = ld2.a();
                int n6 = jq2.b;
                n2 = n3;
                while (n6 < n5 - 1 && (n3 = this.bv(kv2, ld2, n4 = n6 + 1)) > n2) {
                    n6 = n4;
                    n2 = n3;
                }
                jq2.b = n6;
            }
        }
        this.bB();
    }

    @Override
    public final void m(kv object, ld ld2, xv xv2) {
        super.m((kv)object, ld2, xv2);
        xv2.g(GridView.class.getName());
        object = this.t.m;
        if (object != null && ((kf)object).getItemCount() > 1) {
            xv2.d(xu.i);
        }
    }

    @Override
    public final void n(kv kv2, ld ld2, View object, xv xv2) {
        ViewGroup.LayoutParams layoutParams = object.getLayoutParams();
        if (!(layoutParams instanceof jl)) {
            super.aL((View)object, xv2);
            return;
        }
        object = (jl)layoutParams;
        int n2 = this.bu(kv2, ld2, ((kp)((Object)object)).a());
        if (this.k == 0) {
            xv2.h(bzb.am(((jl)((Object)object)).a, ((jl)((Object)object)).b, n2, 1));
            return;
        }
        xv2.h(bzb.am(n2, 1, ((jl)((Object)object)).a, ((jl)((Object)object)).b));
    }

    @Override
    public final void o(kv kv2, ld ld2) {
        if (ld2.g) {
            int n2 = this.ao();
            for (int i2 = 0; i2 < n2; ++i2) {
                jl jl2 = (jl)this.aA(i2).getLayoutParams();
                int n3 = jl2.a();
                this.e.put(n3, jl2.b);
                this.f.put(n3, jl2.a);
            }
        }
        super.o(kv2, ld2);
        this.e.clear();
        this.f.clear();
    }

    @Override
    public void p(ld ld2) {
        super.p(ld2);
        this.a = false;
        int n2 = this.I;
        if (n2 != -1 && (ld2 = ((ko)this).P(n2)) != null) {
            ld2.sendAccessibilityEvent(0x4000000);
            this.I = -1;
        }
    }

    @Override
    public final void q(Rect object, int n2, int n3) {
        if (this.c == null) {
            super.q((Rect)object, n2, n3);
        }
        int n4 = this.av() + this.aw();
        int n5 = this.ax() + this.au();
        if (this.k == 1) {
            n3 = GridLayoutManager.an(n3, object.height() + n5, this.as());
            object = this.c;
            n2 = GridLayoutManager.an(n2, (int)(object[((Rect)object).length - 1] + n4), this.at());
        } else {
            n2 = GridLayoutManager.an(n2, object.width() + n4, this.at());
            object = this.c;
            n3 = GridLayoutManager.an(n3, (int)(object[((Rect)object).length - 1] + n5), this.as());
        }
        this.aV(n2, n3);
    }

    public final void r(int n2) {
        if (n2 == this.b) {
            return;
        }
        this.a = true;
        if (n2 > 0) {
            this.b = n2;
            this.g.d();
            this.aS();
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "Span count should be at least 1. Provided "));
    }

    @Override
    public final void s(boolean bl2) {
        if (!bl2) {
            super.s(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override
    public final boolean t(kp kp2) {
        return kp2 instanceof jl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean u(int n2, Bundle object) {
        int n3 = xu.i.a();
        int n4 = -1;
        int n5 = n2;
        if (n2 == n3) {
            if (n2 != -1) {
                int n6;
                Object object2;
                block39: {
                    int n7;
                    block37: {
                        n2 = 0;
                        while (n2 < this.ao()) {
                            if (!Objects.requireNonNull(this.aA(n2)).isAccessibilityFocused()) {
                                ++n2;
                                continue;
                            }
                            break block37;
                        }
                        return false;
                    }
                    object2 = this.aA(n2);
                    if (object2 == null) return false;
                    if (object == null) return false;
                    n6 = object.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                    if (!H.contains(n6)) return false;
                    object = this.t.i((View)object2);
                    if (object == null) return false;
                    int n8 = ((lg)object).getAbsoluteAdapterPosition();
                    n3 = this.bt(n8);
                    n4 = this.bs(n8);
                    if (n3 < 0) return false;
                    if (n4 < 0) return false;
                    if (!this.by(n8).contains(this.i) || !this.bx(n8).contains(this.j)) {
                        this.i = n3;
                        this.j = n4;
                    }
                    n5 = n2 = this.i;
                    if (n2 == -1) {
                        n5 = n3;
                    }
                    if ((n2 = this.j) != -1) {
                        n4 = n2;
                    }
                    if (n6 != 17) {
                        if (n6 != 33) {
                            if (n6 != 66) {
                                if (n6 != 130) return false;
                                for (n2 = n8 + 1; n2 < this.aq(); ++n2) {
                                    n8 = this.bt(n2);
                                    n7 = this.bs(n2);
                                    if (n8 < 0 || n7 < 0) break;
                                    if (this.k == 1) {
                                        if (n8 <= n5 || n7 != n4 && !this.bx(n2).contains(n4)) continue;
                                        this.i = n8;
                                    } else {
                                        if (n8 <= n5 || n7 != n4) continue;
                                        this.i = this.bt(n2);
                                    }
                                    break block39;
                                }
                            } else {
                                for (n2 = n8 + 1; n2 < this.aq(); ++n2) {
                                    n8 = this.bt(n2);
                                    n7 = this.bs(n2);
                                    if (n8 < 0 || n7 < 0) break;
                                    if (this.k == 1) {
                                        if ((n8 != n5 || n7 <= n4) && n8 <= n5) continue;
                                        this.i = n8;
                                        this.j = n7;
                                    } else {
                                        if (n7 <= n4 || !this.by(n2).contains(n5)) continue;
                                        this.j = n7;
                                    }
                                    break block39;
                                }
                            }
                        } else {
                            for (n2 = n8 - 1; n2 >= 0; --n2) {
                                n7 = this.bt(n2);
                                n8 = this.bs(n2);
                                if (n7 < 0 || n8 < 0) break;
                                if (this.k == 1) {
                                    if (n7 >= n5 || !this.bx(n2).contains(n4)) continue;
                                    this.i = n7;
                                } else {
                                    if (n7 >= n5 || n8 != n4) continue;
                                    this.i = (Integer)Collections.max(this.by(n2));
                                }
                                break block39;
                            }
                        }
                    } else {
                        for (n2 = n8 - 1; n2 >= 0; --n2) {
                            n7 = this.bt(n2);
                            n8 = this.bs(n2);
                            if (n7 < 0 || n8 < 0) break;
                            if (this.k == 1) {
                                if ((n7 != n5 || n8 >= n4) && n7 >= n5) continue;
                                this.i = n7;
                                this.j = n8;
                            } else {
                                if (!this.by(n2).contains(n5) || n8 >= n4) continue;
                                this.j = n8;
                            }
                            break block39;
                        }
                    }
                    n2 = -1;
                }
                n5 = n2;
                if (n2 == -1) {
                    if (this.k != 0) return false;
                    if (n6 == 17) {
                        Object object3;
                        object = new TreeMap(Collections.reverseOrder());
                        for (n2 = 0; n2 < this.aq(); ++n2) {
                            object3 = this.by(n2).iterator();
                            while (object3.hasNext()) {
                                object2 = (Integer)object3.next();
                                if ((Integer)object2 < 0) return false;
                                object.put(object2, n2);
                            }
                        }
                        object2 = object.keySet().iterator();
                        do {
                            if (!object2.hasNext()) return false;
                        } while ((n2 = ((Integer)(object3 = (Integer)object2.next())).intValue()) >= n3);
                        n5 = (Integer)object.get(object3);
                        this.i = n2;
                        this.j = this.bs(n5);
                    } else {
                        Object object4;
                        if (n6 != 66) return false;
                        object = new TreeMap();
                        for (n2 = 0; n2 < this.aq(); ++n2) {
                            object4 = this.by(n2).iterator();
                            while (object4.hasNext()) {
                                object2 = (Integer)object4.next();
                                if ((Integer)object2 < 0) return false;
                                if (object.containsKey(object2)) continue;
                                object.put(object2, n2);
                            }
                        }
                        object2 = object.keySet().iterator();
                        do {
                            if (!object2.hasNext()) return false;
                        } while ((n2 = ((Integer)(object4 = (Integer)object2.next())).intValue()) <= n3);
                        n5 = (Integer)object.get(object4);
                        this.i = n2;
                        this.j = 0;
                    }
                }
                if (n5 == -1) return false;
                ((ko)this).V(n5);
                this.I = n5;
                return true;
            }
            n5 = -1;
        }
        n2 = n5;
        if (n5 != 16908343) return super.u(n2, (Bundle)object);
        if (object != null) {
            int n9 = object.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            n3 = object.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (n9 == -1) return false;
            if (n3 == -1) return false;
            int n10 = this.t.m.getItemCount();
            n2 = 0;
            while (true) {
                n5 = n4;
                if (n2 >= n10) break;
                object = this.t;
                n5 = this.bv(((RecyclerView)object).e, ((RecyclerView)object).O, n2);
                object = this.t;
                int n11 = this.bu(((RecyclerView)object).e, ((RecyclerView)object).O, n2);
                if (this.k == 1 ? n5 == n3 && n11 == n9 : n5 == n9 && n11 == n3) {
                    n5 = n2;
                    break;
                }
                ++n2;
            }
            if (n5 < 0) return false;
            this.al(n5);
            return true;
        }
        n2 = 16908343;
        return super.u(n2, (Bundle)object);
    }

    @Override
    public final boolean v() {
        return this.q == null && !this.a;
    }

    @Override
    public final void w(ld ld2, js js2, jh jh2) {
        int n2 = this.b;
        for (int i2 = 0; i2 < this.b && js2.d(ld2) && n2 > 0; ++i2) {
            jh2.a(js2.d, Math.max(0, js2.g));
            this.g.b();
            --n2;
            js2.d += js2.e;
        }
    }

    @Override
    public final void x(int n2, int n3) {
        this.g.d();
        this.g.c();
    }

    @Override
    public final void y() {
        this.g.d();
        this.g.c();
    }

    @Override
    public final void z(int n2, int n3) {
        this.g.d();
        this.g.c();
    }
}

