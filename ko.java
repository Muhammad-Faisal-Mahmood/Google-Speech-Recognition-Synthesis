/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 */
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

public abstract class ko {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final awg F;
    public final awg G;
    private final mg a;
    private final mg b;
    in s;
    public RecyclerView t;
    public lc u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public final boolean y;
    public int z;

    public ko() {
        km km2 = new km(this, 1);
        this.a = km2;
        km km3 = new km(this, 0);
        this.b = km3;
        this.F = new awg(km2);
        this.G = new awg(km3);
        this.v = false;
        this.w = false;
        this.x = true;
        this.y = true;
    }

    public static boolean aZ(int n2, int n3, int n4) {
        int n5 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        if (n4 > 0 && n2 != n4) {
            return false;
        }
        if (n5 != Integer.MIN_VALUE) {
            if (n5 != 0) {
                if (n5 != 0x40000000) {
                    return false;
                }
                return n3 == n2;
            }
            return true;
        }
        return n3 >= n2;
    }

    public static int an(int n2, int n3, int n4) {
        int n5 = View.MeasureSpec.getMode((int)n2);
        n2 = View.MeasureSpec.getSize((int)n2);
        if (n5 != Integer.MIN_VALUE) {
            if (n5 != 0x40000000) {
                n2 = Math.max(n3, n4);
            }
            return n2;
        }
        return Math.min(n2, Math.max(n3, n4));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int ap(int n2, int n3, int n4, int n5, boolean bl2) {
        block11: {
            block13: {
                block10: {
                    block12: {
                        block9: {
                            block8: {
                                n2 = Math.max(0, n2 - n4);
                                if (!bl2) break block8;
                                if (n5 >= 0) break block9;
                                if (n5 == -1 && (n3 == Integer.MIN_VALUE || n3 != 0 && n3 == 0x40000000)) break block10;
                                break block11;
                            }
                            if (n5 < 0) break block12;
                        }
                        n3 = 0x40000000;
                        return View.MeasureSpec.makeMeasureSpec((int)n5, (int)n3);
                    }
                    if (n5 != -1) break block13;
                }
                n5 = n2;
                return View.MeasureSpec.makeMeasureSpec((int)n5, (int)n3);
            }
            if (n5 == -2) {
                if (n3 != Integer.MIN_VALUE && n3 != 0x40000000) {
                    n3 = 0;
                    n5 = n2;
                    return View.MeasureSpec.makeMeasureSpec((int)n5, (int)n3);
                }
                n3 = Integer.MIN_VALUE;
                n5 = n2;
                return View.MeasureSpec.makeMeasureSpec((int)n5, (int)n3);
            }
        }
        n3 = 0;
        n5 = 0;
        return View.MeasureSpec.makeMeasureSpec((int)n5, (int)n3);
    }

    public static kn ay(Context context, AttributeSet attributeSet, int n2, int n3) {
        kn kn2 = new kn();
        context = context.obtainStyledAttributes(attributeSet, et.a, n2, n3);
        kn2.a = context.getInt(0, 1);
        kn2.b = context.getInt(10, 1);
        kn2.c = context.getBoolean(9, false);
        kn2.d = context.getBoolean(11, false);
        context.recycle();
        return kn2;
    }

    public static final int be(View view) {
        return view.getBottom() + ((kp)view.getLayoutParams()).d.bottom;
    }

    public static final int bf(View view) {
        return view.getLeft() - ((kp)view.getLayoutParams()).d.left;
    }

    public static final int bg(View view) {
        Rect rect = ((kp)view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bh(View view) {
        Rect rect = ((kp)view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bi(View view) {
        return view.getRight() + ((kp)view.getLayoutParams()).d.right;
    }

    public static final int bj(View view) {
        return view.getTop() - ((kp)view.getLayoutParams()).d.top;
    }

    public static final int bk(View view) {
        return ((kp)view.getLayoutParams()).a();
    }

    public static final void bn(View view, int n2, int n3, int n4, int n5) {
        kp kp2 = (kp)view.getLayoutParams();
        Rect rect = kp2.d;
        view.layout(n2 + rect.left + kp2.leftMargin, n3 + rect.top + kp2.topMargin, n4 - rect.right - kp2.rightMargin, n5 - rect.bottom - kp2.bottomMargin);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void c(View object, int n2, boolean bl2) {
        Object object2;
        lg lg2;
        block15: {
            block14: {
                lg2 = RecyclerView.j((View)object);
                if (!bl2 && !lg2.isRemoved()) {
                    this.t.aa.r(lg2);
                } else {
                    this.t.aa.o(lg2);
                }
                object2 = (kp)object.getLayoutParams();
                if (lg2.wasReturnedFromScrap() || lg2.isScrap()) break block14;
                if (object.getParent() == this.t) {
                    int n3 = this.s.d((View)object);
                    int n4 = n2;
                    if (n2 == -1) {
                        n4 = this.s.a();
                    }
                    if (n3 == -1) {
                        object2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        ((StringBuilder)object2).append(this.t.indexOfChild((View)object));
                        ((StringBuilder)object2).append(this.t.m());
                        throw new IllegalStateException(((StringBuilder)object2).toString());
                    }
                    if (n3 != n4) {
                        object = this.t.n;
                        View view = ((ko)object).aA(n3);
                        if (view == null) {
                            object2 = new StringBuilder("Cannot move a child from non-existing index:");
                            ((StringBuilder)object2).append(n3);
                            ((StringBuilder)object2).append(((ko)object).t.toString());
                            throw new IllegalArgumentException(((StringBuilder)object2).toString());
                        }
                        ((ko)object).aI(n3);
                        kp kp2 = (kp)view.getLayoutParams();
                        lg lg3 = RecyclerView.j(view);
                        if (lg3.isRemoved()) {
                            ((ko)object).t.aa.o(lg3);
                        } else {
                            ((ko)object).t.aa.r(lg3);
                        }
                        ((ko)object).s.h(view, n4, (ViewGroup.LayoutParams)kp2, lg3.isRemoved());
                    }
                    break block15;
                } else {
                    this.s.g((View)object, n2, false);
                    ((kp)((Object)object2)).e = true;
                    lc lc2 = this.u;
                    if (lc2 != null && lc2.e && lc2.a((View)object) == lc2.a) {
                        lc2.f = object;
                    }
                }
                break block15;
            }
            if (lg2.isScrap()) {
                lg2.unScrap();
            } else {
                lg2.clearReturnedFromScrapFlag();
            }
            this.s.h((View)object, n2, object.getLayoutParams(), false);
        }
        if (((kp)((Object)object2)).f) {
            lg2.itemView.invalidate();
            ((kp)((Object)object2)).f = false;
        }
    }

    public void A(int n2, int n3) {
    }

    public void B(int n2, int n3) {
    }

    public int C(ld ld2) {
        throw null;
    }

    public int D(ld ld2) {
        throw null;
    }

    public int E(ld ld2) {
        throw null;
    }

    public int F(ld ld2) {
        throw null;
    }

    public int G(ld ld2) {
        throw null;
    }

    public int H(ld ld2) {
        throw null;
    }

    public Parcelable N() {
        throw null;
    }

    public View P(int n2) {
        int n3 = this.ao();
        for (int i2 = 0; i2 < n3; ++i2) {
            View view = this.aA(i2);
            lg lg2 = RecyclerView.j(view);
            if (lg2 == null || lg2.getLayoutPosition() != n2 || lg2.shouldIgnore() || !this.t.O.g && lg2.isRemoved()) continue;
            return view;
        }
        return null;
    }

    public void Q(String string) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            recyclerView.v(string);
        }
    }

    public void T(AccessibilityEvent accessibilityEvent) {
        Object object = this.t;
        Object object2 = ((RecyclerView)object).e;
        object2 = ((RecyclerView)object).O;
        if (object != null && accessibilityEvent != null) {
            boolean bl2;
            boolean bl3 = bl2 = true;
            if (!object.canScrollVertically(1)) {
                bl3 = bl2;
                if (!this.t.canScrollVertically(-1)) {
                    bl3 = bl2;
                    if (!this.t.canScrollHorizontally(-1)) {
                        bl3 = this.t.canScrollHorizontally(1) ? bl2 : false;
                    }
                }
            }
            accessibilityEvent.setScrollable(bl3);
            object = this.t.m;
            if (object != null) {
                accessibilityEvent.setItemCount(((kf)object).getItemCount());
            }
        }
    }

    public void U(Parcelable parcelable) {
        throw null;
    }

    public void V(int n2) {
        throw null;
    }

    public boolean Y() {
        throw null;
    }

    public boolean Z() {
        throw null;
    }

    public int a(kv object, ld ld2) {
        object = this.t;
        if (object != null && (object = ((RecyclerView)object).m) != null && this.Y()) {
            return ((kf)object).getItemCount();
        }
        return 1;
    }

    public final View aA(int n2) {
        in in2 = this.s;
        if (in2 != null) {
            return in2.e(n2);
        }
        return null;
    }

    public final View aB() {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return null;
        }
        if ((recyclerView = recyclerView.getFocusedChild()) != null && !this.s.k((View)recyclerView)) {
            return recyclerView;
        }
        return null;
    }

    public final void aC(View view) {
        this.aD(view, -1);
    }

    public final void aD(View view, int n2) {
        this.c(view, n2, true);
    }

    public final void aE(View view) {
        this.aF(view, -1);
    }

    public final void aF(View view, int n2) {
        this.c(view, n2, false);
    }

    public final void aG(View view, Rect rect) {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        rect.set(recyclerView.f(view));
    }

    public final void aH(kv kv2) {
        int n2 = this.ao();
        while (--n2 >= 0) {
            View view = this.aA(n2);
            lg lg2 = RecyclerView.j(view);
            if (lg2.shouldIgnore()) continue;
            if (lg2.isInvalid() && !lg2.isRemoved() && !this.t.m.hasStableIds()) {
                this.aR(n2);
                kv2.k(lg2);
                continue;
            }
            this.aI(n2);
            kv2.l(view);
            this.t.aa.r(lg2);
        }
    }

    public final void aI(int n2) {
        this.aA(n2);
        this.s.i(n2);
    }

    public void aJ(int n2) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            int n3 = recyclerView.h.a();
            for (int i2 = 0; i2 < n3; ++i2) {
                recyclerView.h.e(i2).offsetLeftAndRight(n2);
            }
        }
    }

    public void aK(int n2) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            int n3 = recyclerView.h.a();
            for (int i2 = 0; i2 < n3; ++i2) {
                recyclerView.h.e(i2).offsetTopAndBottom(n2);
            }
        }
    }

    public final void aL(View view, xv xv2) {
        Object object = RecyclerView.j(view);
        if (object != null && !((lg)object).isRemoved() && !this.s.k(((lg)object).itemView)) {
            object = this.t;
            this.n(((RecyclerView)object).e, ((RecyclerView)object).O, view, xv2);
        }
    }

    public void aM(int n2) {
    }

    public final void aN(kv kv2) {
        int n2;
        int n3 = this.ao();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (RecyclerView.j(this.aA(n2)).shouldIgnore()) continue;
            this.aQ(n2, kv2);
            n3 = n2;
        }
    }

    public final void aO(kv object) {
        int n2 = ((kv)object).a.size();
        for (int i2 = n2 - 1; i2 >= 0; --i2) {
            kk kk2;
            View view = ((lg)((kv)object).a.get((int)i2)).itemView;
            lg lg2 = RecyclerView.j(view);
            if (lg2.shouldIgnore()) continue;
            lg2.setIsRecyclable(false);
            if (lg2.isTmpDetached()) {
                this.t.removeDetachedView(view, false);
            }
            if ((kk2 = this.t.F) != null) {
                kk2.d(lg2);
            }
            lg2.setIsRecyclable(true);
            ((kv)object).g(view);
        }
        ((kv)object).a.clear();
        object = ((kv)object).b;
        if (object != null) {
            ((ArrayList)object).clear();
        }
        if (n2 > 0) {
            this.t.invalidate();
        }
    }

    public final void aP(View view, kv kv2) {
        in in2 = this.s;
        int n2 = in2.c;
        if (n2 != 1) {
            if (n2 != 2) {
                block7: {
                    in2.c = 1;
                    in2.d = view;
                    n2 = in2.e.r(view);
                    if (n2 >= 0) break block7;
                }
                if (in2.a.g(n2)) {
                    in2.l(view);
                }
                in2.e.u(n2);
                kv2.j(view);
                return;
                finally {
                    in2.c = 0;
                    in2.d = null;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void aQ(int n2, kv kv2) {
        View view = this.aA(n2);
        this.aR(n2);
        kv2.j(view);
    }

    public final void aR(int n2) {
        if (this.aA(n2) != null) {
            in in2 = this.s;
            int n3 = in2.c;
            if (n3 != 1) {
                if (n3 != 2) {
                    View view;
                    block8: {
                        n2 = in2.b(n2);
                        view = in2.e.s(n2);
                        if (view != null) break block8;
                        in2.c = 0;
                        in2.d = null;
                        return;
                    }
                    try {
                        in2.c = 1;
                        in2.d = view;
                        if (in2.a.g(n2)) {
                            in2.l(view);
                        }
                        in2.e.u(n2);
                        return;
                    }
                    finally {
                        in2.c = 0;
                        in2.d = null;
                    }
                }
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
    }

    public final void aS() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aT(RecyclerView recyclerView) {
        this.aU(View.MeasureSpec.makeMeasureSpec((int)recyclerView.getWidth(), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)recyclerView.getHeight(), (int)0x40000000));
    }

    public final void aU(int n2, int n3) {
        this.D = View.MeasureSpec.getSize((int)n2);
        this.B = n2 = View.MeasureSpec.getMode((int)n2);
        if (n2 == 0 && !RecyclerView.a) {
            this.D = 0;
        }
        this.E = View.MeasureSpec.getSize((int)n3);
        this.C = n2 = View.MeasureSpec.getMode((int)n3);
        if (n2 == 0 && !RecyclerView.a) {
            this.E = 0;
        }
    }

    public final void aV(int n2, int n3) {
        RecyclerView.r(this.t, n2, n3);
    }

    public final void aW(int n2, int n3) {
        int n4 = this.ao();
        if (n4 != 0) {
            int n5 = Integer.MIN_VALUE;
            int n6 = Integer.MAX_VALUE;
            int n7 = Integer.MAX_VALUE;
            int n8 = Integer.MIN_VALUE;
            for (int i2 = 0; i2 < n4; ++i2) {
                View view = this.aA(i2);
                Rect rect = this.t.k;
                RecyclerView.K(view, rect);
                int n9 = n6;
                if (rect.left < n6) {
                    n9 = rect.left;
                }
                n6 = n5;
                if (rect.right > n5) {
                    n6 = rect.right;
                }
                int n10 = n7;
                if (rect.top < n7) {
                    n10 = rect.top;
                }
                n7 = n8;
                if (rect.bottom > n8) {
                    n7 = rect.bottom;
                }
                n5 = n6;
                n8 = n7;
                n6 = n9;
                n7 = n10;
            }
            this.t.k.set(n6, n7, n5, n8);
            this.q(this.t.k, n2, n3);
            return;
        }
        this.t.A(n2, n3);
    }

    public final void aX(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.t = null;
            this.s = null;
            this.D = 0;
            this.E = 0;
        } else {
            this.t = recyclerView;
            this.s = recyclerView.h;
            this.D = recyclerView.getWidth();
            this.E = recyclerView.getHeight();
        }
        this.B = 0x40000000;
        this.C = 0x40000000;
    }

    public final void aY(lc lc2) {
        Object object = this.u;
        if (object != null && lc2 != object && ((lc)object).e) {
            ((lc)object).d();
        }
        this.u = lc2;
        object = this.t;
        ((RecyclerView)object).L.d();
        if (lc2.g) {
            StringBuilder stringBuilder = new StringBuilder("An instance of ");
            stringBuilder.append(lc2.getClass().getSimpleName());
            stringBuilder.append(" was started more than once. Each instance of");
            stringBuilder.append(lc2.getClass().getSimpleName());
            stringBuilder.append(" is intended to only be used once. You should create a new instance for each use.");
            Log.w((String)"RecyclerView", (String)stringBuilder.toString());
        }
        lc2.b = object;
        lc2.c = this;
        int n2 = lc2.a;
        if (n2 != -1) {
            object = lc2.b;
            ((RecyclerView)object).O.a = n2;
            lc2.e = true;
            lc2.d = true;
            n2 = lc2.a;
            lc2.f = ((RecyclerView)object).n.P(n2);
            lc2.b.L.b();
            lc2.g = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public boolean aa() {
        throw null;
    }

    public boolean ac() {
        throw null;
    }

    public boolean ae() {
        return false;
    }

    public void af(int n2, int n3, ld ld2, jh jh2) {
        throw null;
    }

    public void ag(int n2, jh jh2) {
    }

    public void ak(RecyclerView recyclerView) {
    }

    public void am(RecyclerView recyclerView, int n2) {
        throw null;
    }

    public final int ao() {
        in in2 = this.s;
        if (in2 != null) {
            return in2.a();
        }
        return 0;
    }

    public final int aq() {
        Object object = this.t;
        object = object != null ? ((RecyclerView)object).g() : null;
        if (object != null) {
            return ((kf)object).getItemCount();
        }
        return 0;
    }

    public final int ar() {
        return this.t.getLayoutDirection();
    }

    public final int as() {
        RecyclerView recyclerView = this.t;
        int[] nArray = wj.a;
        return recyclerView.getMinimumHeight();
    }

    public final int at() {
        RecyclerView recyclerView = this.t;
        int[] nArray = wj.a;
        return recyclerView.getMinimumWidth();
    }

    public final int au() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int av() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int aw() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int ax() {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View az(View view) {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return null;
        }
        if ((view = recyclerView.l(view)) == null) {
            return null;
        }
        if (this.s.k(view)) {
            return null;
        }
        return view;
    }

    public int b(kv object, ld ld2) {
        object = this.t;
        if (object != null && (object = ((RecyclerView)object).m) != null && this.Z()) {
            return ((kf)object).getItemCount();
        }
        return 1;
    }

    public final boolean ba() {
        lc lc2 = this.u;
        return lc2 != null && lc2.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean bb(RecyclerView recyclerView, View view, Rect rect, boolean bl2, boolean bl3) {
        int n2 = this.av();
        int n3 = this.ax();
        int n4 = this.D;
        int n5 = this.aw();
        int n6 = this.E;
        int n7 = this.au();
        int n8 = view.getLeft() + rect.left - view.getScrollX();
        int n9 = view.getTop() + rect.top - view.getScrollY();
        int n10 = rect.width();
        int n11 = rect.height();
        int n12 = n8 - n2;
        int n13 = n9 - n3;
        n2 = 0;
        n3 = Math.min(0, n12);
        n4 = n10 + n8 - (n4 - n5);
        n8 = Math.min(0, n13);
        n5 = Math.max(0, n4);
        n9 = Math.max(0, n11 + n9 - (n6 - n7));
        if (this.ar() == 1) {
            n6 = n5 != 0 ? n5 : Math.max(n3, n4);
        } else {
            n6 = n3;
            if (n3 == 0) {
                n6 = Math.min(n12, n5);
            }
        }
        n3 = n8 != 0 ? n8 : Math.min(n13, n9);
        n6 = (new int[]{n6, n3})[0];
        if (bl3) {
            view = recyclerView.getFocusedChild();
            if (view == null) return false;
            n7 = this.av();
            n13 = this.ax();
            n5 = this.D;
            n12 = this.aw();
            n9 = this.E;
            n8 = this.au();
            rect = this.t.k;
            RecyclerView.K(view, rect);
            if (rect.left - n6 >= n5 - n12 || rect.right - n6 <= n7 || rect.top - n3 >= n9 - n8 || rect.bottom - n3 <= n13) return false;
        }
        if (n6 == 0) {
            if (n3 == 0) return false;
            n6 = n2;
        }
        if (bl2) {
            recyclerView.scrollBy(n6, n3);
            return true;
        } else {
            recyclerView.au(n6, n3);
        }
        return true;
    }

    public final boolean bc(View view, int n2, int n3, kp kp2) {
        return view.isLayoutRequested() || !this.x || !ko.aZ(view.getWidth(), n2, kp2.width) || !ko.aZ(view.getHeight(), n3, kp2.height);
        {
        }
    }

    public final void bd() {
        this.w = true;
    }

    public final void bl(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((kp)view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.t != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            rect2 = this.t.l;
            rect2.set(rect);
            matrix.mapRect((RectF)rect2);
            rect.set((int)Math.floor(rect2.left), (int)Math.floor(rect2.top), (int)Math.ceil(rect2.right), (int)Math.ceil(rect2.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final boolean bm(View view) {
        return !this.F.i(view) || !this.G.i(view);
    }

    public void bo() {
    }

    public final void bp(int n2, int n3) {
        this.t.A(n2, n3);
    }

    public final void bq(Runnable runnable) {
        RecyclerView recyclerView = this.t;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void br(RecyclerView recyclerView) {
        this.w = false;
        this.ak(recyclerView);
    }

    public int d(int n2, kv kv2, ld ld2) {
        throw null;
    }

    public int e(int n2, kv kv2, ld ld2) {
        throw null;
    }

    public abstract kp f();

    public kp g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof kp) {
            return new kp((kp)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new kp((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new kp(layoutParams);
    }

    public kp h(Context context, AttributeSet attributeSet) {
        return new kp(context, attributeSet);
    }

    public View j(View view, int n2, kv kv2, ld ld2) {
        throw null;
    }

    public void m(kv kv2, ld ld2, xv xv2) {
        if (this.t.canScrollVertically(-1) || this.t.canScrollHorizontally(-1)) {
            xv2.c(8192);
            xv2.i(true);
            xv2.j();
        }
        if (this.t.canScrollVertically(1) || this.t.canScrollHorizontally(1)) {
            xv2.c(4096);
            xv2.i(true);
            xv2.j();
        }
        kv2 = AccessibilityNodeInfo.CollectionInfo.obtain((int)this.b(kv2, ld2), (int)this.a(kv2, ld2), (boolean)false, (int)0);
        xv2.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)kv2);
    }

    public void n(kv kv2, ld ld2, View view, xv xv2) {
        boolean bl2 = this.Z();
        int n2 = 0;
        int n3 = bl2 ? ko.bk(view) : 0;
        if (this.Y()) {
            n2 = ko.bk(view);
        }
        xv2.h(bzb.am(n3, 1, n2, 1));
    }

    public void o(kv kv2, ld ld2) {
        throw null;
    }

    public void p(ld ld2) {
    }

    public void q(Rect rect, int n2, int n3) {
        int n4 = rect.width();
        int n5 = this.av();
        int n6 = this.aw();
        int n7 = rect.height();
        int n8 = this.ax();
        int n9 = this.au();
        this.aV(ko.an(n2, n4 + n5 + n6, this.at()), ko.an(n3, n7 + n8 + n9, this.as()));
    }

    public boolean t(kp kp2) {
        return kp2 != null;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean u(int var1_1, Bundle var2_2) {
        block14: {
            block12: {
                block13: {
                    var10_3 = this.t;
                    var11_4 = var10_3.e;
                    var11_4 = var10_3.O;
                    var9_5 = false;
                    if (var10_3 == null) return var9_5;
                    var8_6 = this.E;
                    var7_7 = this.D;
                    var10_3 = new Rect();
                    var6_8 = var8_6;
                    var5_9 = var7_7;
                    if (this.t.getMatrix().isIdentity()) {
                        var6_8 = var8_6;
                        var5_9 = var7_7;
                        if (this.t.getGlobalVisibleRect((Rect)var10_3)) {
                            var6_8 = var10_3.height();
                            var5_9 = var10_3.width();
                        }
                    }
                    if (var1_1 == 4096) break block12;
                    if (var1_1 == 8192) break block13;
                    var6_8 = 0;
                    var5_9 = 0;
                    break block14;
                }
                var6_8 = this.t.canScrollVertically(-1) != false ? -(var6_8 - this.ax() - this.au()) : 0;
                var7_7 = var6_8;
                if (!this.t.canScrollHorizontally(-1)) ** GOTO lbl-1000
                var5_9 = -(var5_9 - this.av() - this.aw());
                break block14;
            }
            var6_8 = this.t.canScrollVertically(1) != false ? var6_8 - this.ax() - this.au() : 0;
            var7_7 = var6_8;
            if (this.t.canScrollHorizontally(1)) {
                var5_9 = var5_9 - this.av() - this.aw();
            } else lbl-1000:
            // 2 sources

            {
                var5_9 = 0;
                var6_8 = var7_7;
            }
        }
        var7_7 = var6_8;
        if (var6_8 == 0) {
            if (var5_9 == 0) return var9_5;
            var7_7 = 0;
        }
        if (var2_2 != null) {
            var3_11 = var4_10 = var2_2.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (var4_10 < 0.0f) {
                return var9_5;
            }
        } else {
            var3_11 = 1.0f;
        }
        if (Float.compare(var3_11, Infinityf) == 0) {
            var10_3 = this.t;
            var2_2 = var10_3.m;
            if (var2_2 == null) return var9_5;
            if (var1_1 != 4096) {
                if (var1_1 != 8192) return true;
                var10_3.ae(0);
                return true;
            }
            var10_3.ae(var2_2.getItemCount() - 1);
            return true;
        }
        var6_8 = var7_7;
        var1_1 = var5_9;
        if (Float.compare(1.0f, var3_11) != 0) {
            var6_8 = var7_7;
            var1_1 = var5_9;
            if (Float.compare(0.0f, var3_11) != 0) {
                var4_10 = var5_9;
                var6_8 = (int)((float)var7_7 * var3_11);
                var1_1 = (int)(var4_10 * var3_11);
            }
        }
        this.t.av(var1_1, var6_8, true);
        return true;
    }

    public boolean v() {
        throw null;
    }

    public void x(int n2, int n3) {
    }

    public void y() {
    }

    public void z(int n2, int n3) {
    }
}

