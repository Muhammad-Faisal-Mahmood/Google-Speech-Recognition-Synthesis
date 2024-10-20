/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.animation.AnimationUtils
 *  android.widget.EdgeEffect
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.OverScroller
 */
package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;

public class NestedScrollView
extends FrameLayout
implements vj,
vg {
    private static final float f = (float)(Math.log(0.78) / Math.log(0.9));
    private static final yk g = new yk();
    private static final int[] h = new int[]{16843130};
    private int A;
    private ym B;
    private final vh C;
    private float D;
    private final bvl E;
    public OverScroller a;
    public EdgeEffect b;
    public EdgeEffect c;
    final yl d;
    va e;
    private final float i;
    private long j;
    private final Rect k = new Rect();
    private int l;
    private boolean m = true;
    private boolean n = false;
    private View o = null;
    private boolean p = false;
    private VelocityTracker q;
    private boolean r;
    private boolean s = true;
    private int t;
    private int u;
    private int v;
    private int w = -1;
    private final int[] x = new int[2];
    private final int[] y = new int[2];
    private int z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969648);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        yl yl2;
        this.d = yl2 = new yl((ViewGroup)this, 0);
        this.e = new va(this.getContext(), yl2);
        this.b = xm.d(context, attributeSet);
        this.c = xm.d(context, attributeSet);
        this.i = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.a = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        yl2 = ViewConfiguration.get((Context)this.getContext());
        this.t = yl2.getScaledTouchSlop();
        this.u = yl2.getScaledMinimumFlingVelocity();
        this.v = yl2.getScaledMaximumFlingVelocity();
        context = context.obtainStyledAttributes(attributeSet, h, n2, 0);
        boolean bl2 = context.getBoolean(0, false);
        if (bl2 != this.r) {
            this.r = bl2;
            this.requestLayout();
        }
        context.recycle();
        this.E = new bvl();
        this.C = new vh((View)this);
        this.setNestedScrollingEnabled(true);
        wj.m((View)this, g);
    }

    private final void A() {
        if (this.q == null) {
            this.q = VelocityTracker.obtain();
        }
    }

    private final void B(int n2, int n3, int[] nArray) {
        int n4 = this.getScrollY();
        this.scrollBy(0, n2);
        n4 = this.getScrollY() - n4;
        if (nArray != null) {
            nArray[1] = nArray[1] + n4;
        }
        this.C.g(0, n4, 0, n2 - n4, null, n3, nArray);
    }

    private final void C(MotionEvent motionEvent) {
        int n2 = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(n2) == this.w) {
            n2 = n2 == 0 ? 1 : 0;
            this.l = (int)motionEvent.getY(n2);
            this.w = motionEvent.getPointerId(n2);
            motionEvent = this.q;
            if (motionEvent != null) {
                motionEvent.clear();
            }
        }
    }

    private final void D() {
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    private final void E(boolean bl2) {
        if (bl2) {
            this.p(2, 1);
        } else {
            this.j(1);
        }
        this.A = this.getScrollY();
        this.postInvalidateOnAnimation();
    }

    private final void F(View view) {
        view.getDrawingRect(this.k);
        this.offsetDescendantRectToMyCoords(view, this.k);
        int n2 = this.b(this.k);
        if (n2 != 0) {
            this.scrollBy(0, n2);
        }
    }

    private final boolean G(View view) {
        return !this.I(view, 0, this.getHeight());
    }

    private static boolean H(View view, View view2) {
        if (view == view2) {
            return true;
        }
        return (view = view.getParent()) instanceof ViewGroup && NestedScrollView.H(view, view2);
    }

    private final boolean I(View view, int n2, int n3) {
        view.getDrawingRect(this.k);
        this.offsetDescendantRectToMyCoords(view, this.k);
        return this.k.bottom + n2 >= this.getScrollY() && this.k.top - n2 <= this.getScrollY() + n3;
    }

    /*
     * Unable to fully structure code
     */
    private final boolean J(int var1_1, int var2_2, int var3_3) {
        block13: {
            block11: {
                block12: {
                    var4_4 = this.getHeight();
                    var9_5 = this.getScrollY();
                    var11_6 = var4_4 + var9_5;
                    var17_7 = this.getFocusables(2);
                    var10_8 = var17_7.size();
                    var14_9 = null;
                    var4_4 = 0;
                    for (var7_10 = 0; var7_10 < var10_8; ++var7_10) {
                        block8: {
                            block10: {
                                block9: {
                                    var16_16 = (View)var17_7.get(var7_10);
                                    var8_13 = var16_16.getTop();
                                    var12_14 = var16_16.getBottom();
                                    var15_15 = var14_9;
                                    var6_12 = var4_4;
                                    if (var2_2 >= var12_14) break block8;
                                    var15_15 = var14_9;
                                    var6_12 = var4_4;
                                    if (var8_13 >= var3_3) break block8;
                                    var5_11 = var2_2 < var8_13 && var12_14 < var3_3 ? 1 : 0;
                                    if (var14_9 != null) break block9;
                                    var15_15 = var16_16;
                                    var6_12 = var5_11;
                                    break block8;
                                }
                                var8_13 = !(var1_1 != 33 ? var12_14 <= var14_9.getBottom() : var8_13 >= var14_9.getTop()) ? 1 : 0;
                                if (var4_4 == 0) break block10;
                                var15_15 = var14_9;
                                var6_12 = var4_4;
                                if (var5_11 == 0) break block8;
                                var15_15 = var14_9;
                                var6_12 = var4_4;
                                if (var8_13 == 0) break block8;
                                ** GOTO lbl36
                            }
                            if (var5_11 != 0) {
                                var4_4 = 1;
lbl36:
                                // 3 sources

                                while (true) {
                                    var15_15 = var16_16;
                                    var6_12 = var4_4;
                                    break;
                                }
                            } else {
                                var15_15 = var14_9;
                                var6_12 = var4_4;
                                if (var8_13 != 0) ** continue;
                            }
                        }
                        var14_9 = var15_15;
                        var4_4 = var6_12;
                    }
                    var15_15 = var14_9;
                    if (var14_9 == null) {
                        var15_15 = this;
                    }
                    if (var2_2 < var9_5) break block11;
                    if (var3_3 > var11_6) break block12;
                    var13_17 = false;
                    break block13;
                }
                if (var1_1 != 33) ** GOTO lbl-1000
                ** GOTO lbl-1000
            }
            if (var1_1 == 33) lbl-1000:
            // 2 sources

            {
                var2_2 -= var9_5;
            } else lbl-1000:
            // 2 sources

            {
                var2_2 = var3_3 - var11_6;
            }
            this.x(var2_2, 0, 1, true);
            var13_17 = true;
        }
        if (var15_15 != this.findFocus()) {
            var15_15.requestFocus(var1_1);
        }
        return var13_17;
    }

    private final boolean K(EdgeEffect edgeEffect, int n2) {
        if (n2 > 0) {
            return true;
        }
        float f2 = xm.b(edgeEffect);
        float f3 = this.getHeight();
        double d2 = Math.log((float)Math.abs(-n2) * 0.35f / (this.i * 0.015f));
        double d3 = f;
        float f4 = this.i;
        return (float)((double)(f4 * 0.015f) * Math.exp((d3 /= -1.0 + d3) * d2)) < f2 * f3;
    }

    private final boolean L(MotionEvent motionEvent) {
        boolean bl2;
        if (xm.b(this.b) != 0.0f) {
            xm.c(this.b, 0.0f, motionEvent.getX() / (float)this.getWidth());
            bl2 = true;
        } else {
            bl2 = false;
        }
        if (xm.b(this.c) != 0.0f) {
            xm.c(this.c, 0.0f, 1.0f - motionEvent.getX() / (float)this.getWidth());
            return true;
        }
        return bl2;
    }

    private final void M(int n2, int n3, boolean bl2) {
        if (this.getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.j > 250L) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n4 = view.getHeight();
            int n5 = layoutParams.topMargin;
            int n6 = layoutParams.bottomMargin;
            int n7 = this.getHeight();
            int n8 = this.getPaddingTop();
            int n9 = this.getPaddingBottom();
            n2 = this.getScrollY();
            n3 = Math.max(0, Math.min(n3 + n2, Math.max(0, n4 + n5 + n6 - (n7 - n8 - n9))));
            this.a.startScroll(this.getScrollX(), n2, 0, n3 - n2, 250);
            this.E(bl2);
        } else {
            if (!this.a.isFinished()) {
                this.y();
            }
            this.scrollBy(n2, n3);
        }
        this.j = AnimationUtils.currentAnimationTimeMillis();
    }

    private static int w(int n2, int n3, int n4) {
        if (n3 < n4 && n2 >= 0) {
            if (n3 + n2 > n4) {
                return n4 - n3;
            }
            return n2;
        }
        return 0;
    }

    private final int x(int n2, int n3, int n4, boolean bl2) {
        int n5;
        int n6;
        if (n4 == 1) {
            this.p(2, 1);
        }
        if (this.l(0, n2, this.y, this.x, n4)) {
            n6 = this.y[1];
            n5 = this.x[1];
            n6 = n2 - n6;
            n2 = n5;
            n5 = n6;
        } else {
            n5 = n2;
            n2 = 0;
        }
        int n7 = this.getScrollY();
        int n8 = this.c();
        n6 = this.getOverScrollMode();
        n6 = (n6 == 0 || n6 == 1 && this.c() > 0) && !bl2 ? 1 : 0;
        boolean bl3 = this.r(n5, 0, n7, n8) && !this.o(n4);
        int n9 = this.getScrollY() - n7;
        Object object = this.y;
        object[1] = 0;
        this.q(n9, n5 - n9, this.x, n4, (int[])object);
        n9 = this.x[1];
        if ((n7 += (n5 -= this.y[1])) < 0) {
            if (n6 != 0) {
                float f2 = n3;
                object = this.b;
                n3 = -n5;
                float f3 = this.getHeight();
                float f4 = this.getWidth();
                xm.c((EdgeEffect)object, (float)n3 / f3, f2 / f4);
                if (!this.c.isFinished()) {
                    this.c.onRelease();
                }
            }
        } else if (n7 > n8 && n6 != 0) {
            float f5 = n3;
            object = this.c;
            float f6 = n5;
            float f7 = this.getHeight();
            float f8 = this.getWidth();
            xm.c((EdgeEffect)object, f6 / f7, 1.0f - f5 / f8);
            if (!this.b.isFinished()) {
                this.b.onRelease();
            }
        }
        if (this.b.isFinished() && this.c.isFinished()) {
            if (bl3 && n4 == 0 && (object = (Object)this.q) != null) {
                object.clear();
            }
        } else {
            this.postInvalidateOnAnimation();
        }
        if (n4 == 1) {
            this.j(1);
            this.b.onRelease();
            this.c.onRelease();
        }
        return n2 + n9;
    }

    private final void y() {
        this.a.abortAnimation();
        this.j(1);
    }

    private final void z() {
        this.w = -1;
        this.p = false;
        this.D();
        this.j(0);
        this.b.onRelease();
        this.c.onRelease();
    }

    public final float a() {
        float f2;
        float f3 = f2 = this.D;
        if (f2 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = this.getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.D = f3 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return f3;
    }

    public final void addView(View view) {
        if (this.getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int n2) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int n2, ViewGroup.LayoutParams layoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    protected final int b(Rect rect) {
        int n2 = this.getChildCount();
        int n3 = 0;
        if (n2 == 0) {
            return 0;
        }
        int n4 = this.getHeight();
        n2 = this.getScrollY();
        int n5 = n2 + n4;
        int n6 = this.getVerticalFadingEdgeLength();
        int n7 = n2;
        if (rect.top > 0) {
            n7 = n2 + n6;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        n6 = rect.bottom < view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin ? n5 - n6 : n5;
        if (rect.bottom > n6 && rect.top > n7) {
            n2 = rect.height() > n4 ? rect.top - n7 : rect.bottom - n6;
            n2 = Math.min(n2, view.getBottom() + layoutParams.bottomMargin - n5);
        } else {
            n2 = n3;
            if (rect.top < n7) {
                n2 = n3;
                if (rect.bottom < n6) {
                    n2 = rect.height() > n4 ? -(n6 - rect.bottom) : -(n7 - rect.top);
                    n2 = Math.max(n2, -this.getScrollY());
                }
            }
        }
        return n2;
    }

    public final int c() {
        if (this.getChildCount() > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            return Math.max(0, view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return 0;
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void computeScroll() {
        int n2;
        int n3;
        int n4;
        int n5;
        block19: {
            block18: {
                block17: {
                    if (this.a.isFinished()) {
                        return;
                    }
                    this.a.computeScrollOffset();
                    n5 = this.a.getCurrY();
                    n4 = n5 - this.A;
                    n3 = this.getHeight();
                    if (n4 <= 0 || xm.b(this.b) == 0.0f) break block17;
                    float f2 = n3;
                    float f3 = -n4;
                    n2 = n3 = Math.round((float)(-n3) / 4.0f * xm.c(this.b, f3 * 4.0f / f2, 0.5f));
                    if (n3 != n4) {
                        this.b.finish();
                        n2 = n3;
                    }
                    break block18;
                }
                n2 = n4;
                if (n4 >= 0) break block19;
                n2 = n4;
                if (xm.b(this.c) == 0.0f) break block19;
                float f4 = n3;
                float f5 = n4;
                n2 = n3 = Math.round(f4 / 4.0f * xm.c(this.c, f5 * 4.0f / f4, 0.5f));
                if (n3 != n4) {
                    this.c.finish();
                    n2 = n3;
                }
            }
            n2 = n4 - n2;
        }
        this.A = n5;
        int[] nArray = this.y;
        nArray[1] = 0;
        this.l(0, n2, nArray, null, 1);
        n4 = n2 - this.y[1];
        n3 = this.c();
        if (tt.e()) {
            yi.b((View)this, Math.abs(this.a.getCurrVelocity()));
        }
        n2 = n4;
        if (n4 != 0) {
            n2 = this.getScrollY();
            this.r(n4, this.getScrollX(), n2, n3);
            n2 = this.getScrollY() - n2;
            int[] nArray2 = this.y;
            nArray2[1] = 0;
            nArray = this.x;
            this.q(n2, n4 -= n2, nArray, 1, nArray2);
            n2 = n4 - this.y[1];
        }
        if (n2 != 0) {
            n4 = this.getOverScrollMode();
            if (n4 == 0 || n4 == 1 && n3 > 0) {
                if (n2 < 0) {
                    if (this.b.isFinished()) {
                        this.b.onAbsorb((int)this.a.getCurrVelocity());
                    }
                } else if (this.c.isFinished()) {
                    this.c.onAbsorb((int)this.a.getCurrVelocity());
                }
            }
            this.y();
        }
        if (!this.a.isFinished()) {
            this.postInvalidateOnAnimation();
            return;
        }
        this.j(1);
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int n2;
        int n3;
        int n4;
        block6: {
            block5: {
                block4: {
                    n4 = this.getChildCount();
                    n3 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
                    if (n4 == 0) {
                        return n3;
                    }
                    View view = this.getChildAt(0);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
                    n4 = view.getBottom() + layoutParams.bottomMargin;
                    n2 = this.getScrollY();
                    n3 = Math.max(0, n4 - n3);
                    if (n2 >= 0) break block4;
                    n4 -= n2;
                    break block5;
                }
                if (n2 > n3) break block6;
            }
            return n4;
        }
        return n4 + (n2 - n3);
    }

    @Override
    public final void d(View view, int n2, int n3, int[] nArray, int n4) {
        this.l(n2, n3, nArray, null, n4);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.m(keyEvent);
        {
        }
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean bl2) {
        return this.C.c(f2, f3, bl2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.C.d(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int n2, int n3, int[] nArray, int[] nArray2) {
        return this.l(n2, n3, nArray, nArray2, 0);
    }

    public final boolean dispatchNestedScroll(int n2, int n3, int n4, int n5, int[] nArray) {
        return this.C.f(n2, n3, n4, n5, nArray);
    }

    public final void draw(Canvas canvas) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        super.draw(canvas);
        int n9 = this.getScrollY();
        boolean bl2 = this.b.isFinished();
        int n10 = 0;
        if (!bl2) {
            n8 = canvas.save();
            n7 = this.getWidth();
            n6 = this.getHeight();
            n5 = Math.min(0, n9);
            if (this.getClipToPadding()) {
                n7 -= this.getPaddingLeft() + this.getPaddingRight();
                n4 = this.getPaddingLeft();
            } else {
                n4 = 0;
            }
            n3 = n6;
            n2 = n5;
            if (this.getClipToPadding()) {
                n3 = n6 - (this.getPaddingTop() + this.getPaddingBottom());
                n2 = n5 + this.getPaddingTop();
            }
            canvas.translate((float)n4, (float)n2);
            this.b.setSize(n7, n3);
            if (this.b.draw(canvas)) {
                this.postInvalidateOnAnimation();
            }
            canvas.restoreToCount(n8);
        }
        if (!this.c.isFinished()) {
            n8 = canvas.save();
            n2 = this.getWidth();
            n5 = this.getHeight();
            n6 = Math.max(this.c(), n9) + n5;
            n7 = n10;
            n4 = n2;
            if (this.getClipToPadding()) {
                n4 = n2 - (this.getPaddingLeft() + this.getPaddingRight());
                n7 = this.getPaddingLeft();
            }
            n3 = n6;
            n2 = n5;
            if (this.getClipToPadding()) {
                n2 = n5 - (this.getPaddingTop() + this.getPaddingBottom());
                n3 = n6 - this.getPaddingBottom();
            }
            canvas.translate((float)(n7 - n4), (float)n3);
            canvas.rotate(180.0f, (float)n4, 0.0f);
            this.c.setSize(n4, n2);
            if (this.c.draw(canvas)) {
                this.postInvalidateOnAnimation();
            }
            canvas.restoreToCount(n8);
        }
    }

    @Override
    public final void e(View view, int n2, int n3, int n4, int n5, int n6) {
        this.B(n5, n6, null);
    }

    @Override
    public final void f(View view, int n2, int n3, int n4, int n5, int n6, int[] nArray) {
        this.B(n5, n6, nArray);
    }

    @Override
    public final void g(View view, View view2, int n2, int n3) {
        this.E.b(n2, n3);
        this.p(2, n3);
    }

    protected final float getBottomFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        View view = this.getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        int n2 = this.getVerticalFadingEdgeLength();
        int n3 = this.getHeight();
        int n4 = this.getPaddingBottom();
        n4 = view.getBottom() + layoutParams.bottomMargin - this.getScrollY() - (n3 - n4);
        if (n4 < n2) {
            return (float)n4 / (float)n2;
        }
        return 1.0f;
    }

    public final int getNestedScrollAxes() {
        return this.E.a();
    }

    protected final float getTopFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        int n2 = this.getVerticalFadingEdgeLength();
        int n3 = this.getScrollY();
        if (n3 < n2) {
            return (float)n3 / (float)n2;
        }
        return 1.0f;
    }

    @Override
    public final void h(View view, int n2) {
        this.E.c(n2);
        this.j(n2);
    }

    public final boolean hasNestedScrollingParent() {
        return this.o(0);
    }

    public final void i(int n2) {
        if (this.getChildCount() > 0) {
            this.a.fling(this.getScrollX(), this.getScrollY(), 0, n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.E(true);
            if (tt.e()) {
                yi.b((View)this, Math.abs(this.a.getCurrVelocity()));
            }
        }
    }

    public final boolean isNestedScrollingEnabled() {
        return this.C.a;
    }

    public final void j(int n2) {
        this.C.b(n2);
    }

    public final boolean k(int n2) {
        View view;
        View view2 = view = this.findFocus();
        if (view == this) {
            view2 = null;
        }
        view = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view2, n2);
        int n3 = (int)((float)this.getHeight() * 0.5f);
        if (view != null && this.I(view, n3, this.getHeight())) {
            view.getDrawingRect(this.k);
            this.offsetDescendantRectToMyCoords(view, this.k);
            this.x(this.b(this.k), 0, 1, true);
            view.requestFocus(n2);
        } else {
            int n4;
            if (n2 == 33 && this.getScrollY() < n3) {
                n4 = this.getScrollY();
            } else {
                n4 = n3;
                if (n2 == 130) {
                    n4 = n3;
                    if (this.getChildCount() > 0) {
                        view = this.getChildAt(0);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
                        n4 = Math.min(view.getBottom() + layoutParams.bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom()), n3);
                    }
                }
            }
            if (n4 == 0) {
                return false;
            }
            n3 = n4;
            if (n2 != 130) {
                n3 = -n4;
            }
            this.x(n3, 0, 1, true);
        }
        if (view2 != null && view2.isFocused() && this.G(view2)) {
            n2 = this.getDescendantFocusability();
            this.setDescendantFocusability(131072);
            this.requestFocus();
            this.setDescendantFocusability(n2);
        }
        return true;
    }

    public final boolean l(int n2, int n3, int[] nArray, int[] nArray2, int n4) {
        return this.C.e(n2, n3, nArray, nArray2, n4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean m(KeyEvent keyEvent) {
        FrameLayout.LayoutParams layoutParams;
        this.k.setEmpty();
        int n2 = this.getChildCount();
        int n3 = 130;
        boolean bl2 = false;
        if (n2 > 0) {
            View view = this.getChildAt(0);
            layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            if (view.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
                boolean bl3 = bl2;
                if (keyEvent.getAction() != 0) return bl3;
                n2 = keyEvent.getKeyCode();
                if (n2 != 19) {
                    if (n2 != 20) {
                        if (n2 != 62) {
                            if (n2 == 92) return this.n(33);
                            if (n2 == 93) return this.n(130);
                            if (n2 != 122) {
                                if (n2 != 123) {
                                    return bl2;
                                }
                                this.s(130);
                                return false;
                            }
                            this.s(33);
                            return false;
                        }
                        if (keyEvent.isShiftPressed()) {
                            n3 = 33;
                        }
                        this.s(n3);
                        return false;
                    }
                    if (!keyEvent.isAltPressed()) return this.k(130);
                    return this.n(130);
                }
                if (!keyEvent.isAltPressed()) return this.k(33);
                return this.n(33);
            }
        }
        if (!this.isFocused()) return false;
        if (keyEvent.getKeyCode() == 4) return false;
        layoutParams = this.findFocus();
        keyEvent = layoutParams;
        if (layoutParams == this) {
            keyEvent = null;
        }
        if ((keyEvent = FocusFinder.getInstance().findNextFocus((ViewGroup)this, (View)keyEvent, 130)) == null) return false;
        if (keyEvent == this) return false;
        if (!keyEvent.requestFocus(130)) return false;
        return true;
    }

    protected final void measureChild(View view, int n2, int n3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(NestedScrollView.getChildMeasureSpec((int)n2, (int)(this.getPaddingLeft() + this.getPaddingRight()), (int)layoutParams.width), View.MeasureSpec.makeMeasureSpec((int)0, (int)0));
    }

    protected final void measureChildWithMargins(View view, int n2, int n3, int n4, int n5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        view.measure(NestedScrollView.getChildMeasureSpec((int)n2, (int)(this.getPaddingLeft() + this.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n3), (int)marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec((int)(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin), (int)0));
    }

    public final boolean n(int n2) {
        int n3;
        Rect rect = this.k;
        int n4 = this.getHeight();
        rect.top = 0;
        this.k.bottom = n4;
        if (n2 == 130 && (n3 = this.getChildCount()) > 0) {
            rect = this.getChildAt(n3 - 1);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)rect.getLayoutParams();
            this.k.bottom = rect.getBottom() + layoutParams.bottomMargin + this.getPaddingBottom();
            rect = this.k;
            rect.top = rect.bottom - n4;
        }
        rect = this.k;
        return this.J(n2, rect.top, rect.bottom);
    }

    public final boolean o(int n2) {
        return this.C.h(n2);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = false;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 8 && !this.p) {
            int n2;
            float f2;
            int n3;
            if (vy.h(motionEvent, 2)) {
                n3 = 9;
                f2 = motionEvent.getAxisValue(9);
                n2 = (int)motionEvent.getX();
            } else if (vy.h(motionEvent, 0x400000)) {
                f2 = motionEvent.getAxisValue(26);
                n2 = this.getWidth() / 2;
                n3 = 26;
            } else {
                n3 = 0;
                n2 = 0;
                f2 = 0.0f;
            }
            if (f2 != 0.0f) {
                float f3 = this.a();
                boolean bl2 = vy.h(motionEvent, 8194);
                this.x(-((int)(f2 * f3)), n2, 1, bl2);
                this.e.a(motionEvent, n3);
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n2 = motionEvent.getAction();
        boolean bl2 = true;
        boolean bl3 = true;
        int n3 = n2;
        if (n2 == 2) {
            if (this.p) return true;
            n3 = 2;
        }
        if ((n3 &= 0xFF) != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 6) {
                            return this.p;
                        }
                        this.C(motionEvent);
                        return this.p;
                    }
                } else {
                    n2 = this.w;
                    if (n2 == -1) return this.p;
                    n3 = motionEvent.findPointerIndex(n2);
                    if (n3 == -1) {
                        Log.e((String)"NestedScrollView", (String)a.ah(n2, "Invalid pointerId=", " in onInterceptTouchEvent"));
                        return this.p;
                    }
                    if (Math.abs((n3 = (int)motionEvent.getY(n3)) - this.l) <= this.t) return this.p;
                    if ((2 & this.getNestedScrollAxes()) != 0) return this.p;
                    this.p = true;
                    this.l = n3;
                    this.A();
                    this.q.addMovement(motionEvent);
                    this.z = 0;
                    motionEvent = this.getParent();
                    if (motionEvent == null) return this.p;
                    motionEvent.requestDisallowInterceptTouchEvent(true);
                    return this.p;
                }
            }
            this.p = false;
            this.w = -1;
            this.D();
            if (this.a.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.c())) {
                this.postInvalidateOnAnimation();
            }
            this.j(0);
            return this.p;
        }
        n3 = (int)motionEvent.getY();
        int n4 = (int)motionEvent.getX();
        if (this.getChildCount() > 0) {
            n2 = this.getScrollY();
            View view = this.getChildAt(0);
            if (n3 >= view.getTop() - n2 && n3 < view.getBottom() - n2 && n4 >= view.getLeft() && n4 < view.getRight()) {
                this.l = n3;
                this.w = motionEvent.getPointerId(0);
                view = this.q;
                if (view == null) {
                    this.q = VelocityTracker.obtain();
                } else {
                    view.clear();
                }
                this.q.addMovement(motionEvent);
                this.a.computeScrollOffset();
                boolean bl4 = bl3;
                if (!this.L(motionEvent)) {
                    bl4 = !this.a.isFinished() ? bl3 : false;
                }
                this.p = bl4;
                this.p(2, 0);
                return this.p;
            }
        }
        boolean bl5 = bl2;
        if (!this.L(motionEvent)) {
            bl5 = !this.a.isFinished() ? bl2 : false;
        }
        this.p = bl5;
        this.D();
        return this.p;
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        super.onLayout(bl2, n2, n3, n4, n5);
        n2 = 0;
        this.m = false;
        View view = this.o;
        if (view != null && NestedScrollView.H(view, (View)this)) {
            this.F(this.o);
        }
        this.o = null;
        if (!this.n) {
            if (this.B != null) {
                this.scrollTo(this.getScrollX(), this.B.a);
                this.B = null;
            }
            if (this.getChildCount() > 0) {
                View view2 = this.getChildAt(0);
                view = (FrameLayout.LayoutParams)view2.getLayoutParams();
                n2 = view2.getMeasuredHeight() + view.topMargin + view.bottomMargin;
            }
            int n6 = this.getPaddingTop();
            int n7 = this.getPaddingBottom();
            n4 = this.getScrollY();
            n2 = NestedScrollView.w(n4, n5 - n3 - n6 - n7, n2);
            if (n2 != n4) {
                this.scrollTo(this.getScrollX(), n2);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.n = true;
    }

    protected final void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        if (this.r && View.MeasureSpec.getMode((int)n3) != 0 && this.getChildCount() > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n4 = view.getMeasuredHeight();
            if (n4 < (n3 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - layoutParams.topMargin - layoutParams.bottomMargin)) {
                view.measure(NestedScrollView.getChildMeasureSpec((int)n2, (int)(this.getPaddingLeft() + this.getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin), (int)layoutParams.width), View.MeasureSpec.makeMeasureSpec((int)n3, (int)0x40000000));
            }
        }
    }

    public final boolean onNestedFling(View view, float f2, float f3, boolean bl2) {
        if (!bl2) {
            this.dispatchNestedFling(0.0f, f3, true);
            this.i((int)f3);
            return true;
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.dispatchNestedPreFling(f2, f3);
    }

    public final void onNestedPreScroll(View view, int n2, int n3, int[] nArray) {
        this.d(view, n2, n3, nArray, 0);
    }

    public final void onNestedScroll(View view, int n2, int n3, int n4, int n5) {
        this.B(n5, 0, null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int n2) {
        this.g(view, view2, n2, 0);
    }

    protected final void onOverScrolled(int n2, int n3, boolean bl2, boolean bl3) {
        super.scrollTo(n2, n3);
    }

    protected final boolean onRequestFocusInDescendants(int n2, Rect rect) {
        int n3;
        if (n2 == 2) {
            n3 = 130;
        } else {
            n3 = n2;
            if (n2 == 1) {
                n3 = 33;
            }
        }
        View view = rect == null ? FocusFinder.getInstance().findNextFocus((ViewGroup)this, null, n3) : FocusFinder.getInstance().findNextFocusFromRect((ViewGroup)this, rect, n3);
        if (view != null && !this.G(view)) {
            return view.requestFocus(n3, rect);
        }
        return false;
    }

    protected final void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof ym)) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (ym)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        this.B = object;
        this.requestLayout();
    }

    protected final Parcelable onSaveInstanceState() {
        ym ym2 = new ym(super.onSaveInstanceState());
        ym2.a = this.getScrollY();
        return ym2;
    }

    protected final void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        View view = this.findFocus();
        if (view != null && this != view && this.I(view, 0, n5)) {
            view.getDrawingRect(this.k);
            this.offsetDescendantRectToMyCoords(view, this.k);
            n2 = this.b(this.k);
            if (n2 != 0) {
                if (this.s) {
                    this.u(n2);
                    return;
                }
                this.scrollBy(0, n2);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int n2) {
        return this.t(view, view2, n2, 0);
    }

    public final void onStopNestedScroll(View view) {
        this.h(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent object) {
        int n2;
        this.A();
        int n3 = n2 = object.getActionMasked();
        if (n2 == 0) {
            this.z = 0;
            n3 = 0;
        }
        MotionEvent motionEvent = MotionEvent.obtain((MotionEvent)object);
        float f2 = this.z;
        float f3 = 0.0f;
        motionEvent.offsetLocation(0.0f, f2);
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 5) {
                            if (n3 == 6) {
                                this.C((MotionEvent)object);
                                this.l = (int)object.getY(object.findPointerIndex(this.w));
                            }
                        } else {
                            n3 = object.getActionIndex();
                            this.l = (int)object.getY(n3);
                            this.w = object.getPointerId(n3);
                        }
                    } else {
                        if (this.p && this.getChildCount() > 0 && this.a.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.c())) {
                            this.postInvalidateOnAnimation();
                        }
                        this.z();
                    }
                } else {
                    int n4 = object.findPointerIndex(this.w);
                    if (n4 == -1) {
                        object = new StringBuilder("Invalid pointerId=");
                        ((StringBuilder)object).append(this.w);
                        ((StringBuilder)object).append(" in onTouchEvent");
                        Log.e((String)"NestedScrollView", (String)((StringBuilder)object).toString());
                    } else {
                        int n5 = (int)object.getY(n4);
                        n2 = this.l - n5;
                        f2 = object.getX(n4) / (float)this.getWidth();
                        float f4 = this.getHeight();
                        float f5 = xm.b(this.b);
                        f4 = (float)n2 / f4;
                        if (f5 != 0.0f) {
                            f3 = f2 = -xm.c(this.b, -f4, f2);
                            if (xm.b(this.b) == 0.0f) {
                                this.b.onRelease();
                                f3 = f2;
                            }
                        } else if (xm.b(this.c) != 0.0f) {
                            f3 = f2 = xm.c(this.c, f4, 1.0f - f2);
                            if (xm.b(this.c) == 0.0f) {
                                this.c.onRelease();
                                f3 = f2;
                            }
                        }
                        n3 = Math.round(f3 * (float)this.getHeight());
                        if (n3 != 0) {
                            this.invalidate();
                        }
                        n2 -= n3;
                        n3 = n2;
                        if (!this.p) {
                            n3 = n2;
                            if (Math.abs(n2) > this.t) {
                                ViewParent viewParent = this.getParent();
                                if (viewParent != null) {
                                    viewParent.requestDisallowInterceptTouchEvent(true);
                                }
                                this.p = true;
                                n3 = n2 > 0 ? n2 - this.t : n2 + this.t;
                            }
                        }
                        if (this.p) {
                            n3 = this.x(n3, (int)object.getX(n4), 0, false);
                            this.l = n5 - n3;
                            this.z += n3;
                        }
                    }
                }
            } else {
                object = this.q;
                object.computeCurrentVelocity(1000, (float)this.v);
                n3 = (int)object.getYVelocity(this.w);
                if (Math.abs(n3) >= this.u) {
                    if (xm.b(this.b) != 0.0f) {
                        if (this.K(this.b, n3)) {
                            this.b.onAbsorb(n3);
                        } else {
                            this.i(-n3);
                        }
                    } else {
                        n3 = -n3;
                        if (xm.b(this.c) != 0.0f) {
                            if (this.K(this.c, n3)) {
                                this.c.onAbsorb(n3);
                            } else {
                                this.i(n3);
                            }
                        } else {
                            f3 = n3;
                            if (!this.dispatchNestedPreFling(0.0f, f3)) {
                                this.dispatchNestedFling(0.0f, f3, true);
                                this.i(n3);
                            }
                        }
                    }
                } else if (this.a.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.c())) {
                    this.postInvalidateOnAnimation();
                }
                this.z();
            }
        } else {
            ViewParent viewParent;
            if (this.getChildCount() == 0) {
                return false;
            }
            if (this.p && (viewParent = this.getParent()) != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.a.isFinished()) {
                this.y();
            }
            n2 = (int)object.getY();
            n3 = object.getPointerId(0);
            this.l = n2;
            this.w = n3;
            this.p(2, 0);
        }
        object = this.q;
        if (object != null) {
            object.addMovement(motionEvent);
        }
        motionEvent.recycle();
        return true;
    }

    public final boolean p(int n2, int n3) {
        return this.C.i(n2, n3);
    }

    public final void q(int n2, int n3, int[] nArray, int n4, int[] nArray2) {
        this.C.g(0, n2, 0, n3, nArray, n4, nArray2);
    }

    /*
     * Unable to fully structure code
     */
    final boolean r(int var1_1, int var2_2, int var3_3, int var4_4) {
        this.getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        this.computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        if (var2_2 > 0) {
            while (true) {
                var2_2 = 1;
                break;
            }
        } else {
            if (var2_2 < 0) ** continue;
            var2_2 = 0;
        }
        var1_1 = var3_3 + var1_1;
        if (var1_1 > var4_4) lbl-1000:
        // 2 sources

        {
            while (true) {
                var1_1 = 1;
                break;
            }
        } else {
            if (var1_1 < 0) {
                var4_4 = 0;
                ** continue;
            }
            var4_4 = var1_1;
            var1_1 = 0;
        }
        if (var1_1 != 0 && !this.o(1)) {
            this.a.springBack(0, var4_4, 0, 0, 0, this.c());
        }
        super.scrollTo(0, var4_4);
        return var2_2 != 0 || var1_1 != 0;
        {
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.m) {
            this.F(view2);
        } else {
            this.o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int n2 = this.b(rect);
        boolean bl3 = n2 != 0;
        if (bl3) {
            if (bl2) {
                this.scrollBy(0, n2);
            } else {
                this.u(n2);
            }
        }
        return bl3;
    }

    public final void requestDisallowInterceptTouchEvent(boolean bl2) {
        if (bl2) {
            this.D();
        }
        super.requestDisallowInterceptTouchEvent(bl2);
    }

    public final void requestLayout() {
        this.m = true;
        super.requestLayout();
    }

    public final void s(int n2) {
        Rect rect;
        int n3 = this.getHeight();
        if (n2 == 130) {
            this.k.top = this.getScrollY() + n3;
            int n4 = this.getChildCount();
            if (n4 > 0) {
                rect = this.getChildAt(n4 - 1);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)rect.getLayoutParams();
                n4 = rect.getBottom() + layoutParams.bottomMargin + this.getPaddingBottom();
                if (this.k.top + n3 > n4) {
                    this.k.top = n4 - n3;
                }
            }
        } else {
            this.k.top = this.getScrollY() - n3;
            if (this.k.top < 0) {
                this.k.top = 0;
            }
        }
        rect = this.k;
        rect.bottom = rect.top + n3;
        rect = this.k;
        this.J(n2, rect.top, rect.bottom);
    }

    public final void scrollTo(int n2, int n3) {
        if (this.getChildCount() > 0) {
            View view = this.getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            int n4 = this.getWidth();
            int n5 = this.getPaddingLeft();
            int n6 = this.getPaddingRight();
            int n7 = view.getWidth();
            int n8 = layoutParams.leftMargin;
            int n9 = layoutParams.rightMargin;
            int n10 = this.getHeight();
            int n11 = this.getPaddingTop();
            int n12 = this.getPaddingBottom();
            int n13 = view.getHeight();
            int n14 = layoutParams.topMargin;
            int n15 = layoutParams.bottomMargin;
            n2 = NestedScrollView.w(n2, n4 - n5 - n6, n7 + n8 + n9);
            n3 = NestedScrollView.w(n3, n10 - n11 - n12, n13 + n14 + n15);
            if (n2 != this.getScrollX() || n3 != this.getScrollY()) {
                super.scrollTo(n2, n3);
            }
        }
    }

    public final void setNestedScrollingEnabled(boolean bl2) {
        this.C.a(bl2);
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int n2) {
        return this.p(n2, 0);
    }

    public final void stopNestedScroll() {
        this.j(0);
    }

    @Override
    public final boolean t(View view, View view2, int n2, int n3) {
        return (n2 & 2) != 0;
    }

    public final void u(int n2) {
        this.M(0, n2, false);
    }

    public final void v(int n2) {
        this.M(-this.getScrollX(), n2 - this.getScrollY(), true);
    }
}

