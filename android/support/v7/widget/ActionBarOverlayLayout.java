/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorListenerAdapter
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.Menu
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewPropertyAnimator
 *  android.view.Window$Callback
 *  android.view.WindowInsets
 *  android.widget.OverScroller
 */
package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;

public class ActionBarOverlayLayout
extends ViewGroup
implements io,
vi,
vj {
    static final int[] a;
    private static final Rect k;
    private static final xn l;
    private static final Rect m;
    private xn A;
    private xn B;
    private xn C;
    private OverScroller D;
    private final Runnable E;
    private final Runnable F;
    private final gt G;
    private me H;
    private final bvl I;
    public int b = 0;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public gr h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int n;
    private ContentFrameLayout o;
    private Drawable p;
    private boolean q;
    private int r;
    private final Rect s = new Rect();
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private final Rect v = new Rect();
    private final Rect w = new Rect();
    private boolean x = true;
    private boolean y = false;
    private xn z;

    static {
        k = new Rect();
        a = new int[]{2130968582, 16842841};
        xf xf2 = Build.VERSION.SDK_INT >= 30 ? new xe() : (Build.VERSION.SDK_INT >= 29 ? new xd() : new xc());
        xf2.c(tg.d(0, 1, 0, 1));
        l = xf2.a();
        m = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context object, AttributeSet object2) {
        super(object, object2);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.z = xn.a;
        object2 = xn.a;
        this.A = object2;
        this.B = object2;
        this.C = object2;
        this.j = new gq(this);
        this.E = new ak(this, 13, null);
        this.F = new ak(this, 14, null);
        this.v((Context)object);
        this.I = new bvl();
        object = new gt((Context)object);
        this.G = object;
        this.addView((View)object);
    }

    private final void v(Context context) {
        Drawable drawable;
        TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(a);
        boolean bl2 = false;
        this.n = typedArray.getDimensionPixelSize(0, 0);
        this.p = drawable = typedArray.getDrawable(1);
        if (drawable == null) {
            bl2 = true;
        }
        this.setWillNotDraw(bl2);
        typedArray.recycle();
        this.D = new OverScroller(context);
    }

    private static final boolean w(View object, Rect rect, boolean bl2) {
        boolean bl3;
        object = (gs)object.getLayoutParams();
        if (object.leftMargin != rect.left) {
            object.leftMargin = rect.left;
            bl3 = true;
        } else {
            bl3 = false;
        }
        if (object.topMargin != rect.top) {
            object.topMargin = rect.top;
            bl3 = true;
        }
        if (object.rightMargin != rect.right) {
            object.rightMargin = rect.right;
            bl3 = true;
        }
        if (bl2 && object.bottomMargin != rect.bottom) {
            object.bottomMargin = rect.bottom;
            return true;
        }
        return bl3;
    }

    private static final boolean x(View view, Rect rect) {
        if (view.getPaddingLeft() == rect.left && view.getPaddingTop() == rect.top && view.getPaddingRight() == rect.right) {
            return false;
        }
        view.setPadding(rect.left, rect.top, rect.right, view.getPaddingBottom());
        return true;
    }

    @Override
    public final void a() {
        this.i();
        ActionMenuView actionMenuView = this.H.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void b() {
        this.removeCallbacks(this.E);
        this.removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override
    public final void c(int n2) {
        this.i();
        if (n2 != 2) {
            if (n2 != 5) {
                if (n2 != 109) {
                    return;
                }
                this.d = true;
                return;
            }
            Log.i((String)"ToolbarWidgetWrapper", (String)"Progress display unsupported");
            return;
        }
        Log.i((String)"ToolbarWidgetWrapper", (String)"Progress display unsupported");
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gs;
    }

    @Override
    public final void d(View view, int n2, int n3, int[] nArray, int n4) {
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.p != null) {
            int n2 = this.c.getVisibility() == 0 ? (int)((float)this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.p.setBounds(0, n2, this.getWidth(), this.p.getIntrinsicHeight() + n2);
            this.p.draw(canvas);
        }
    }

    @Override
    public final void e(View view, int n2, int n3, int n4, int n5, int n6) {
        if (n6 == 0) {
            this.onNestedScroll(view, n2, n3, n4, n5);
        }
    }

    @Override
    public final void f(View view, int n2, int n3, int n4, int n5, int n6, int[] nArray) {
        this.e(view, n2, n3, n4, n5, n6);
    }

    @Override
    public final void g(View view, View view2, int n2, int n3) {
        if (n3 == 0) {
            this.onNestedScrollAccepted(view, view2, n2);
        }
    }

    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gs();
    }

    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new gs(layoutParams);
    }

    public final int getNestedScrollAxes() {
        return this.I.a();
    }

    @Override
    public final void h(View view, int n2) {
        if (n2 == 0) {
            this.onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.o == null) {
            this.o = (ContentFrameLayout)this.findViewById(2131427391);
            this.c = (ActionBarContainer)this.findViewById(2131427392);
            View view = this.findViewById(2131427390);
            if (view instanceof Toolbar) {
                this.H = ((Toolbar)view).A();
                return;
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(view.getClass().getSimpleName())));
        }
    }

    public final void j(int n2) {
        this.b();
        n2 = -Math.max(0, Math.min(n2, this.c.getHeight()));
        this.c.setTranslationY(n2);
    }

    public final void k(boolean bl2) {
        if (bl2 != this.q) {
            this.q = bl2;
            if (!bl2) {
                this.b();
                this.j(0);
            }
        }
    }

    @Override
    public final void l(Menu menu, gd object) {
        gy gy2;
        Object object2;
        block9: {
            block8: {
                this.i();
                object2 = this.H;
                if (((me)object2).f == null) {
                    ((me)object2).f = new gy(((me)object2).a.getContext());
                }
                gy2 = ((me)object2).f;
                gy2.e = object;
                object = ((me)object2).a;
                if (menu == null && ((Toolbar)object).a == null) break block8;
                ((Toolbar)object).l();
                object2 = ((Toolbar)object).a.a;
                if (object2 != menu) break block9;
            }
            return;
        }
        if (object2 != null) {
            ((fs)object2).m(((Toolbar)object).x);
            ((fs)object2).m(((Toolbar)object).y);
        }
        if (((Toolbar)object).y == null) {
            ((Toolbar)object).y = new lz((Toolbar)object);
        }
        gy2.o();
        if (menu != null) {
            object2 = ((Toolbar)object).j;
            menu = (fs)menu;
            menu.h(gy2, (Context)object2);
            menu.h(((Toolbar)object).y, ((Toolbar)object).j);
        } else {
            ((fi)gy2).b(((Toolbar)object).j, null);
            ((Toolbar)object).y.b(((Toolbar)object).j, null);
            ((fi)gy2).i();
            ((Toolbar)object).y.i();
        }
        ((Toolbar)object).a.i(((Toolbar)object).k);
        ((Toolbar)object).a.j(gy2);
        ((Toolbar)object).x = gy2;
        ((Toolbar)object).w();
    }

    @Override
    public final void m() {
        this.i();
        this.H.e = true;
    }

    @Override
    public final void n(Window.Callback callback) {
        this.i();
        this.H.d = callback;
    }

    @Override
    public final void o(CharSequence charSequence) {
        this.i();
        this.H.f(charSequence);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets object) {
        block10: {
            block9: {
                boolean bl2;
                block8: {
                    boolean bl3;
                    this.i();
                    int n2 = this.getWindowSystemUiVisibility();
                    wa.e(this.G, l, this.w);
                    boolean bl4 = this.w.equals((Object)m);
                    this.x = bl4 ^ true;
                    boolean bl5 = true;
                    bl2 = (n2 & 0x100) != 0;
                    bl4 = bl4 || bl2 && (n2 & 0x600) != 0;
                    this.y = bl4;
                    Object object2 = this.h;
                    if (object2 != null) {
                        bl4 = !bl2 && !bl4;
                        ((eq)object2).j = bl4;
                    }
                    object = xn.n((WindowInsets)object, (View)this);
                    this.v.set(((xn)object).b(), ((xn)object).d(), ((xn)object).c(), ((xn)object).a());
                    ActionBarContainer actionBarContainer = this.c;
                    object2 = this.v;
                    if (this.y) {
                        bl3 = ActionBarOverlayLayout.w((View)actionBarContainer, k, false);
                        bl4 = ActionBarOverlayLayout.x((View)actionBarContainer, (Rect)object2);
                    } else {
                        bl3 = ActionBarOverlayLayout.x((View)actionBarContainer, k);
                        bl4 = ActionBarOverlayLayout.w((View)actionBarContainer, (Rect)object2, false);
                    }
                    wa.e((View)this, (xn)object, this.s);
                    object2 = this.s;
                    this.z = object2 = ((xn)object).l(((Rect)object2).left, ((Rect)object2).top, ((Rect)object2).right, ((Rect)object2).bottom);
                    if (!this.A.equals(object2)) {
                        this.A = this.z;
                        bl2 = bl5;
                    } else {
                        bl2 = bl4 | bl3;
                    }
                    if (this.t.equals((Object)this.s)) break block8;
                    this.t.set(this.s);
                    break block9;
                }
                if (!bl2) break block10;
            }
            this.requestLayout();
        }
        return ((xn)object).i().k().j().e();
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v(this.getContext());
        vy.d((View)this);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        n5 = this.getChildCount();
        n3 = this.getPaddingLeft();
        n4 = this.getPaddingTop();
        for (n2 = 0; n2 < n5; ++n2) {
            View view = this.getChildAt(n2);
            if (view.getVisibility() == 8) continue;
            gs gs2 = (gs)view.getLayoutParams();
            int n6 = view.getMeasuredWidth();
            int n7 = view.getMeasuredHeight();
            int n8 = gs2.leftMargin + n3;
            int n9 = gs2.topMargin + n4;
            view.layout(n8, n9, n6 + n8, n7 + n9);
        }
    }

    protected final void onMeasure(int n2, int n3) {
        int n4;
        int n5;
        this.i();
        this.measureChildWithMargins((View)this.c, n2, 0, n3, 0);
        Object object = (gs)this.c.getLayoutParams();
        int n6 = Math.max(0, this.c.getMeasuredWidth() + object.leftMargin + object.rightMargin);
        int n7 = Math.max(0, this.c.getMeasuredHeight() + object.topMargin + object.bottomMargin);
        int n8 = View.combineMeasuredStates((int)0, (int)this.c.getMeasuredState());
        object = wj.a;
        int n9 = (this.getWindowSystemUiVisibility() & 0x100) != 0 ? 1 : 0;
        if (n9 != 0) {
            n4 = n5 = this.n;
            if (this.y) {
                n4 = n5 + this.v.top;
            }
        } else {
            n4 = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        this.u.set(this.s);
        object = this.z;
        this.B = object;
        if (!this.d && n9 == 0 && this.x) {
            if (this.y) {
                object = this.u;
                ((Rect)object).top = Math.max(((Rect)object).top, n4);
                object = this.u;
                ((Rect)object).bottom = Math.max(((Rect)object).bottom, 0);
            } else {
                object = this.u;
                ((Rect)object).top += n4;
                object = this.u;
                ((Rect)object).bottom = ((Rect)object).bottom;
            }
            this.B = this.B.l(0, n4, 0, 0);
        } else {
            tg tg2 = this.y ? tg.d(((xn)object).b(), Math.max(this.B.d(), n4), this.B.c(), Math.max(this.B.a(), 0)) : tg.d(((xn)object).b(), this.B.d() + n4, this.B.c(), this.B.a());
            object = this.B;
            object = Build.VERSION.SDK_INT >= 30 ? new xe((xn)object) : (Build.VERSION.SDK_INT >= 29 ? new xd((xn)object) : new xc((xn)object));
            ((xf)object).c(tg2);
            this.B = ((xf)object).a();
        }
        ActionBarOverlayLayout.w((View)this.o, this.u, true);
        if (!this.C.equals(this.B)) {
            object = this.B;
            this.C = object;
            wj.d((View)this.o, (xn)object);
        }
        this.measureChildWithMargins((View)this.o, n2, 0, n3, 0);
        object = (gs)this.o.getLayoutParams();
        n4 = Math.max(n6, this.o.getMeasuredWidth() + object.leftMargin + object.rightMargin);
        n7 = Math.max(n7, this.o.getMeasuredHeight() + object.topMargin + object.bottomMargin);
        n8 = View.combineMeasuredStates((int)n8, (int)this.o.getMeasuredState());
        n5 = this.getPaddingLeft();
        n9 = this.getPaddingRight();
        n7 = Math.max(n7 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max(n4 + (n5 + n9), this.getSuggestedMinimumWidth()), (int)n2, (int)n8), View.resolveSizeAndState((int)n7, (int)n3, (int)(n8 << 16)));
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean bl2) {
        if (this.q && bl2) {
            this.D.fling(0, 0, 0, (int)f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.D.getFinalY() > this.c.getHeight()) {
                this.b();
                this.F.run();
            } else {
                this.b();
                this.E.run();
            }
            this.f = true;
            return true;
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public final void onNestedPreScroll(View view, int n2, int n3, int[] nArray) {
    }

    public final void onNestedScroll(View view, int n2, int n3, int n4, int n5) {
        this.r = n2 = this.r + n3;
        this.j(n2);
    }

    public final void onNestedScrollAccepted(View object, View object2, int n2) {
        object = this.I;
        int n3 = 0;
        ((bvl)object).b(n2, 0);
        object = this.c;
        n2 = n3;
        if (object != null) {
            n2 = -((int)object.getTranslationY());
        }
        this.r = n2;
        this.b();
        object = this.h;
        if (object != null) {
            object2 = (eq)object;
            object = object2.l;
            if (object != null) {
                ((fe)object).a();
                object2.l = null;
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int n2) {
        if ((n2 & 2) != 0 && this.c.getVisibility() == 0) {
            return this.q;
        }
        return false;
    }

    public final void onStopNestedScroll(View view) {
        if (this.q && !this.f) {
            if (this.r <= this.c.getHeight()) {
                this.b();
                this.postDelayed(this.E, 600L);
                return;
            }
            this.b();
            this.postDelayed(this.F, 600L);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int n2) {
        super.onWindowSystemUiVisibilityChanged(n2);
        this.i();
        int n3 = this.g;
        this.g = n2;
        gr gr2 = this.h;
        if (gr2 != null) {
            boolean bl2 = (n2 & 0x100) != 0;
            boolean bl3 = !bl2 && !this.y;
            gr2 = (eq)gr2;
            ((eq)gr2).j = bl3;
            if ((n2 & 4) != 0 && bl2) {
                if (!((eq)gr2).k) {
                    ((eq)gr2).k = true;
                    ((eq)gr2).k(true);
                }
            } else if (((eq)gr2).k) {
                ((eq)gr2).k = false;
                ((eq)gr2).k(true);
            }
        }
        if (((n3 ^ n2) & 0x100) != 0 && this.h != null) {
            vy.d((View)this);
        }
    }

    protected final void onWindowVisibilityChanged(int n2) {
        super.onWindowVisibilityChanged(n2);
        this.b = n2;
        gr gr2 = this.h;
        if (gr2 != null) {
            ((eq)gr2).i = n2;
        }
    }

    @Override
    public final boolean p() {
        this.i();
        ViewGroup viewGroup = this.H.a;
        return viewGroup.getVisibility() == 0 && (viewGroup = viewGroup.a) != null && ((ActionMenuView)viewGroup).b;
    }

    @Override
    public final boolean q() {
        this.i();
        Object object = this.H.a.a;
        return object != null && (object = ((ActionMenuView)object).c) != null && ((gy)object).k();
    }

    @Override
    public final boolean r() {
        boolean bl2;
        this.i();
        Object object = this.H.a.a;
        boolean bl3 = bl2 = false;
        if (object != null) {
            object = ((ActionMenuView)object).c;
            bl3 = bl2;
            if (object != null) {
                if (((gy)object).k == null && !((gy)object).l()) {
                    return false;
                }
                bl3 = true;
            }
        }
        return bl3;
    }

    @Override
    public final boolean s() {
        this.i();
        return this.H.a.y();
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override
    public final boolean t(View view, View view2, int n2, int n3) {
        return n3 == 0 && this.onStartNestedScroll(view, view2, n2);
    }

    @Override
    public final boolean u() {
        this.i();
        return this.H.a.z();
    }
}

