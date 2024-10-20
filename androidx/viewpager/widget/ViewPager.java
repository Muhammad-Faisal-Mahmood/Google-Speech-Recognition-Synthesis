/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.SoundEffectConstants
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.animation.Interpolator
 *  android.widget.EdgeEffect
 *  android.widget.Scroller
 */
package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;

public class ViewPager
extends ViewGroup {
    public static final int[] a = new int[]{16842931};
    private static final Interpolator d = new yr(2);
    private final Runnable A;
    private int B = 0;
    public EdgeEffect b;
    public EdgeEffect c;
    private final ArrayList e = new ArrayList();
    private final azw f = new azw();
    private final Rect g = new Rect();
    private Scroller h;
    private final float i;
    private final float j = Float.MAX_VALUE;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private final boolean q;
    private float r;
    private float s;
    private float t;
    private float u;
    private int v = -1;
    private VelocityTracker w;
    private boolean x = true;
    private boolean y;
    private int z;

    public ViewPager(Context context) {
        super(context);
        this.i = -3.4028235E38f;
        this.q = true;
        this.A = new akt((Object)this, 11, null);
        this.d(context);
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = -3.4028235E38f;
        this.q = true;
        this.A = new akt((Object)this, 11, null);
        this.d(context);
    }

    private final int h() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }

    private final Rect i(Rect rect, View view) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        for (rect = view.getParent(); rect instanceof ViewGroup && rect != this; rect = rect.getParent()) {
            rect = (ViewGroup)rect;
            rect2.left += rect.getLeft();
            rect2.right += rect.getRight();
            rect2.top += rect.getTop();
            rect2.bottom += rect.getBottom();
        }
        return rect2;
    }

    private final void j() {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            boolean bl2 = ((azw)this.e.get((int)i2)).c;
        }
    }

    private final boolean k() {
        azw azw2;
        float f2;
        int n2;
        block7: {
            azw azw3;
            if (this.e.size() == 0) {
                if (this.x) {
                    return false;
                }
                this.y = false;
                this.e();
                if (this.y) {
                    return false;
                }
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            n2 = this.h();
            f2 = n2 > 0 ? (float)this.getScrollX() / (float)n2 : 0.0f;
            float f3 = n2 > 0 ? 0.0f / (float)n2 : 0.0f;
            int n3 = 0;
            float f4 = 0.0f;
            int n4 = -1;
            azw azw4 = null;
            n2 = 1;
            while (true) {
                int n5;
                azw2 = azw4;
                if (n3 >= this.e.size()) break block7;
                azw3 = (azw)this.e.get(n3);
                if (n2 == 0 && (n5 = azw3.b) != ++n4) {
                    azw4 = this.f;
                    azw4.e = f4 + 0.0f + f3;
                    azw4.b = n4;
                    throw null;
                }
                f4 = azw3.e;
                float f5 = azw3.d;
                if (n2 == 0) {
                    azw2 = azw4;
                    if (!(f2 >= f4)) break block7;
                }
                if (f2 < f4 + 0.0f + f3 || n3 == this.e.size() - 1) break;
                n4 = azw3.b;
                f5 = azw3.d;
                ++n3;
                n2 = 0;
                azw4 = azw3;
            }
            azw2 = azw3;
        }
        this.h();
        n2 = azw2.b;
        f2 = azw2.e;
        f2 = azw2.d;
        this.y = false;
        this.e();
        if (this.y) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final void a(int n2) {
        if (this.B == n2) {
            return;
        }
        this.B = n2;
    }

    public final void addFocusables(ArrayList arrayList, int n2, int n3) {
        block6: {
            block5: {
                int n4 = arrayList.size();
                int n5 = this.getDescendantFocusability();
                if (n5 == 393216) break block5;
                for (n2 = 0; n2 < this.getChildCount(); ++n2) {
                    if (this.getChildAt(n2).getVisibility() != 0) continue;
                    this.f();
                }
                if (n5 == 262144 && n4 != arrayList.size()) break block6;
            }
            if (this.isFocusable() && ((n3 & 1) != 1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) && arrayList != null) {
                arrayList.add(this);
            }
        }
    }

    public final void addTouchables(ArrayList arrayList) {
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            if (this.getChildAt(i2).getVisibility() != 0) continue;
            this.f();
        }
    }

    public final void addView(View view, int n2, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (!this.checkLayoutParams(layoutParams)) {
            layoutParams2 = new azx();
        }
        layoutParams = (azx)layoutParams2;
        boolean bl2 = layoutParams.a;
        boolean bl3 = view.getClass().getAnnotation(azv.class) != null;
        layoutParams.a = bl2 | bl3;
        super.addView(view, n2, layoutParams2);
    }

    /*
     * Unable to fully structure code
     */
    public final boolean b(int var1_1) {
        block13: {
            var7_2 = this.findFocus();
            if (var7_2 == this) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_3 = null;
                    break block13;
                    break;
                }
            }
            var6_3 = var7_2;
            if (var7_2 != null) {
                var6_3 = var7_2.getParent();
                while (var6_3 instanceof ViewGroup) {
                    if (var6_3 == this) {
                        var6_3 = var7_2;
                        break block13;
                    }
                    var6_3 = var6_3.getParent();
                }
                var8_4 = new StringBuilder();
                var8_4.append(var7_2.getClass().getSimpleName());
                var6_3 = var7_2.getParent();
                while (var6_3 instanceof ViewGroup) {
                    var8_4.append(" => ");
                    var8_4.append(var6_3.getClass().getSimpleName());
                    var6_3 = var6_3.getParent();
                }
                Log.e((String)"ViewPager", (String)"arrowScroll tried to find focus based on non-child current focused view ".concat(var8_4.toString()));
                ** continue;
            }
        }
        var7_2 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, var6_3, var1_1);
        var5_5 = false;
        if (var7_2 != null && var7_2 != var6_3) {
            if (var1_1 == 17) {
                var3_6 = this.i((Rect)this.g, (View)var7_2).left;
                var2_8 = this.i((Rect)this.g, (View)var6_3).left;
                var4_10 = var6_3 != null && var3_6 >= var2_8 ? var5_5 : var7_2.requestFocus();
            } else {
                var4_10 = var5_5;
                if (var1_1 == 66) {
                    var3_7 = this.i((Rect)this.g, (View)var7_2).left;
                    var2_9 = this.i((Rect)this.g, (View)var6_3).left;
                    var4_10 = var6_3 != null && var3_7 <= var2_9 ? var5_5 : var7_2.requestFocus();
                }
            }
        } else {
            var4_10 = var5_5;
            if (var1_1 != 17) {
                // empty if block
            }
        }
        if (var4_10) {
            this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection((int)var1_1));
        }
        return var4_10;
    }

    protected final boolean c(View view, boolean bl2, int n2, int n3, int n4) {
        if (view instanceof ViewGroup) {
            int n5;
            ViewGroup viewGroup = (ViewGroup)view;
            int n6 = view.getScrollX();
            int n7 = view.getScrollY();
            int n8 = viewGroup.getChildCount();
            while ((n5 = n8 - 1) >= 0) {
                View view2 = viewGroup.getChildAt(n5);
                int n9 = n3 + n6;
                n8 = n5;
                if (n9 < view2.getLeft()) continue;
                n8 = n5;
                if (n9 >= view2.getRight()) continue;
                int n10 = n4 + n7;
                n8 = n5;
                if (n10 < view2.getTop()) continue;
                n8 = n5;
                if (n10 >= view2.getBottom()) continue;
                if (!this.c(view2, true, n2, n9 - view2.getLeft(), n10 - view2.getTop())) {
                    n8 = n5;
                    continue;
                }
                return true;
            }
        }
        return bl2 && view.canScrollHorizontally(-n2);
    }

    public final boolean canScrollHorizontally(int n2) {
        return false;
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof azx && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        if (!this.h.isFinished() && this.h.computeScrollOffset()) {
            int n2 = this.getScrollX();
            int n3 = this.getScrollY();
            int n4 = this.h.getCurrX();
            int n5 = this.h.getCurrY();
            if (n2 != n4 || n3 != n5) {
                this.scrollTo(n4, n5);
                if (!this.k()) {
                    this.h.abortAnimation();
                    this.scrollTo(0, n5);
                }
            }
            this.postInvalidateOnAnimation();
            return;
        }
        this.j();
    }

    final void d(Context context) {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        this.h = new Scroller(context, d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.p = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.b = new EdgeEffect(context);
        this.c = new EdgeEffect(context);
        this.n = (int)(f2 * 16.0f);
        wj.m((View)this, new azy());
        if (this.getImportantForAccessibility() == 0) {
            this.setImportantForAccessibility(1);
        }
        wa.k((View)this, new azu(this));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        if (super.dispatchKeyEvent(keyEvent)) return true;
        if (keyEvent.getAction() != 0) return false;
        int n2 = keyEvent.getKeyCode();
        if (n2 != 21) {
            if (n2 != 22) {
                if (n2 != 61) return false;
                if (keyEvent.hasNoModifiers()) {
                    bl2 = this.b(2);
                } else {
                    if (!keyEvent.hasModifiers(1)) return false;
                    bl2 = this.b(1);
                }
            } else {
                if (keyEvent.hasModifiers(2)) return false;
                bl2 = this.b(66);
            }
        } else {
            if (keyEvent.hasModifiers(2)) return false;
            bl2 = this.b(17);
        }
        if (!bl2) return false;
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.getChildAt(i2).getVisibility() != 0) continue;
            this.f();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.getOverScrollMode() == 0) {
            boolean bl2;
            float f2;
            float f3;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            if (!this.b.isFinished()) {
                n6 = canvas.save();
                n5 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                n4 = this.getWidth();
                canvas.rotate(270.0f);
                n3 = -n5;
                n2 = this.getPaddingTop();
                f3 = this.i;
                f2 = n4;
                canvas.translate((float)(n3 + n2), f3 * f2);
                this.b.setSize(n5, n4);
                bl2 = this.b.draw(canvas);
                canvas.restoreToCount(n6);
            } else {
                bl2 = false;
            }
            boolean bl3 = bl2;
            if (!this.c.isFinished()) {
                int n7 = canvas.save();
                n5 = this.getWidth();
                n6 = this.getHeight();
                n2 = this.getPaddingTop();
                n3 = this.getPaddingBottom();
                canvas.rotate(90.0f);
                n4 = -this.getPaddingTop();
                f3 = -(this.j + 1.0f);
                f2 = n5;
                canvas.translate((float)n4, f3 * f2);
                this.c.setSize(n6 - n2 - n3, n5);
                bl3 = bl2 | this.c.draw(canvas);
                canvas.restoreToCount(n7);
            }
            if (bl3) {
                this.postInvalidateOnAnimation();
            }
            return;
        }
        this.b.finish();
        this.c.finish();
    }

    protected final void e() {
        if (this.z > 0) {
            int n2 = this.getScrollX();
            int n3 = this.getPaddingLeft();
            int n4 = this.getPaddingRight();
            int n5 = this.getWidth();
            int n6 = this.getChildCount();
            for (int i2 = 0; i2 < n6; ++i2) {
                View view = this.getChildAt(i2);
                azx azx2 = (azx)view.getLayoutParams();
                int n7 = n3;
                int n8 = n4;
                if (azx2.a) {
                    n8 = azx2.b & 7;
                    if (n8 != 1) {
                        if (n8 != 3) {
                            if (n8 != 5) {
                                n7 = n3;
                                n8 = n3;
                                n3 = n7;
                            } else {
                                n8 = n5 - n4 - view.getMeasuredWidth();
                                n4 += view.getMeasuredWidth();
                            }
                        } else {
                            n7 = view.getWidth() + n3;
                            n8 = n3;
                            n3 = n7;
                        }
                    } else {
                        n8 = Math.max((n5 - view.getMeasuredWidth()) / 2, n3);
                    }
                    n8 = n8 + n2 - view.getLeft();
                    if (n8 != 0) {
                        view.offsetLeftAndRight(n8);
                    }
                    n8 = n4;
                    n7 = n3;
                }
                n3 = n7;
                n4 = n8;
            }
        }
        this.y = true;
    }

    final void f() {
        if (this.e.size() <= 0) {
            return;
        }
        Object object = ((azw)this.e.get((int)0)).a;
        throw null;
    }

    final azw g() {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            azw azw2 = (azw)this.e.get(i2);
            if (azw2.b != 0) continue;
            return azw2;
        }
        return null;
    }

    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new azx();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new azx(this.getContext(), attributeSet);
    }

    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new azx();
    }

    protected final int getChildDrawingOrder(int n2, int n3) {
        throw null;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
    }

    protected final void onDetachedFromWindow() {
        this.removeCallbacks(this.A);
        Scroller scroller = this.h;
        if (scroller != null && !scroller.isFinished()) {
            this.h.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean onInterceptTouchEvent(MotionEvent object) {
        block23: {
            block26: {
                float f2;
                block24: {
                    Object object2;
                    int n2;
                    block25: {
                        int n3 = object.getAction() & 0xFF;
                        n2 = 0;
                        if (n3 == 3 || n3 == 1) break block23;
                        if (n3 == 0) break block24;
                        if (this.l) {
                            return true;
                        }
                        if (this.m) {
                            return false;
                        }
                        if (n3 == 2) break block25;
                        if (n3 == 6 && object.getPointerId(n3 = object.getActionIndex()) == this.v) {
                            if (n3 == 0) {
                                n2 = 1;
                            }
                            this.r = object.getX(n2);
                            this.v = object.getPointerId(n2);
                            VelocityTracker velocityTracker = this.w;
                            if (velocityTracker != null) {
                                velocityTracker.clear();
                            }
                        }
                        break block26;
                    }
                    n2 = this.v;
                    if (n2 == -1) break block26;
                    n2 = object.findPointerIndex(n2);
                    float f3 = object.getX(n2);
                    float f4 = f3 - this.r;
                    float f5 = Math.abs(f4);
                    float f6 = object.getY(n2);
                    float f7 = this.u;
                    float f8 = f4 - 0.0f;
                    n2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                    f7 = Math.abs(f6 - f7);
                    if (n2 != 0) {
                        float f9 = this.r;
                        if (!(!this.q && (f9 < (float)this.o && n2 > 0 || f9 > (float)(this.getWidth() - this.o) && f4 < 0.0f) || !this.c((View)this, false, (int)f4, (int)f3, (int)f6))) {
                            this.r = f3;
                            this.s = f6;
                            this.m = true;
                            return false;
                        }
                    }
                    if (f5 > (f4 = (float)this.p) && f5 * 0.5f > f7) {
                        this.l = true;
                        object2 = this.getParent();
                        if (object2 != null) {
                            object2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.a(1);
                        f5 = n2 > 0 ? this.t + (float)this.p : this.t - (float)this.p;
                        this.r = f5;
                        this.s = f6;
                        if (!this.k) {
                            this.k = true;
                        }
                    } else if (f7 > f4) {
                        this.m = true;
                    }
                    if (!this.l) break block26;
                    f7 = this.r - f3;
                    this.r = f3;
                    f3 = f6 / (float)this.getHeight();
                    f6 = this.getWidth();
                    f5 = xm.b(this.b);
                    f6 = f7 / f6;
                    f5 = f5 != 0.0f ? -xm.c(this.b, -f6, 1.0f - f3) : (xm.b(this.c) != 0.0f ? xm.c(this.c, f6, f3) : 0.0f);
                    if (Math.abs(f7 - (f5 *= (float)this.getWidth())) < 1.0E-4f) {
                        if (f5 != 0.0f) {
                            this.postInvalidateOnAnimation();
                        }
                        break block26;
                    } else {
                        this.getScrollX();
                        this.h();
                        object = (azw)this.e.get(0);
                        object2 = this.e;
                        object2 = (azw)((ArrayList)object2).get(((ArrayList)object2).size() - 1);
                        if (object.b != 0) {
                            f5 = object.e;
                        }
                        n2 = ((azw)object2).b;
                        throw null;
                    }
                }
                this.t = f2 = object.getX();
                this.r = f2;
                this.u = f2 = object.getY();
                this.s = f2;
                this.v = object.getPointerId(0);
                this.m = false;
                this.h.computeScrollOffset();
                if (xm.b(this.b) == 0.0f && xm.b(this.c) == 0.0f) {
                    this.j();
                    this.l = false;
                } else {
                    this.l = true;
                    this.a(1);
                    if (xm.b(this.b) != 0.0f) {
                        xm.c(this.b, 0.0f, 1.0f - this.s / (float)this.getHeight());
                    }
                    if (xm.b(this.c) != 0.0f) {
                        xm.c(this.c, 0.0f, this.s / (float)this.getHeight());
                    }
                }
            }
            if (this.w == null) {
                this.w = VelocityTracker.obtain();
            }
            this.w.addMovement(object);
            return this.l;
        }
        this.v = -1;
        this.l = false;
        this.m = false;
        object = this.w;
        if (object != null) {
            object.recycle();
            this.w = null;
        }
        this.b.onRelease();
        this.c.onRelease();
        if (this.b.isFinished()) {
            this.c.isFinished();
        }
        return false;
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        Object object;
        int n6 = this.getChildCount();
        int n7 = this.getPaddingLeft();
        int n8 = this.getPaddingTop();
        int n9 = this.getPaddingRight();
        int n10 = this.getPaddingBottom();
        int n11 = this.getScrollX();
        int n12 = 0;
        int n13 = 0;
        while (true) {
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            block11: {
                View view;
                int n19;
                block15: {
                    block16: {
                        int n20;
                        block12: {
                            block13: {
                                block14: {
                                    n19 = n5 - n3;
                                    n20 = n4 - n2;
                                    if (n12 >= n6) break;
                                    view = this.getChildAt(n12);
                                    n18 = n7;
                                    n17 = n8;
                                    n16 = n9;
                                    n15 = n10;
                                    n14 = n13;
                                    if (view.getVisibility() == 8) break block11;
                                    object = (azx)view.getLayoutParams();
                                    n18 = n7;
                                    n17 = n8;
                                    n16 = n9;
                                    n15 = n10;
                                    n14 = n13;
                                    if (!object.a) break block11;
                                    n15 = object.b;
                                    n14 = n15 & 7;
                                    n16 = n15 & 0x70;
                                    if (n14 == 1) break block12;
                                    if (n14 == 3) break block13;
                                    if (n14 == 5) break block14;
                                    n14 = n7;
                                    n15 = n7;
                                    n7 = n14;
                                    break block15;
                                }
                                n14 = n20 - n9 - view.getMeasuredWidth();
                                n9 += view.getMeasuredWidth();
                                break block16;
                            }
                            n14 = view.getMeasuredWidth() + n7;
                            n15 = n7;
                            n7 = n14;
                            break block15;
                        }
                        n14 = Math.max((n20 - view.getMeasuredWidth()) / 2, n7);
                    }
                    n15 = n14;
                }
                if (n16 != 16) {
                    if (n16 != 48) {
                        if (n16 != 80) {
                            n16 = n8;
                            n14 = n8;
                            n8 = n16;
                        } else {
                            n14 = n19 - n10 - view.getMeasuredHeight();
                            n10 += view.getMeasuredHeight();
                        }
                    } else {
                        n16 = view.getMeasuredHeight() + n8;
                        n14 = n8;
                        n8 = n16;
                    }
                } else {
                    n14 = Math.max((n19 - view.getMeasuredHeight()) / 2, n8);
                }
                view.layout(n15 += n11, n14, view.getMeasuredWidth() + n15, view.getMeasuredHeight() + n14);
                n14 = n13 + 1;
                n15 = n10;
                n16 = n9;
                n17 = n8;
                n18 = n7;
            }
            ++n12;
            n7 = n18;
            n8 = n17;
            n9 = n16;
            n10 = n15;
            n13 = n14;
        }
        for (n2 = 0; n2 < n6; ++n2) {
            object = this.getChildAt(n2);
            if (object.getVisibility() == 8 || ((azx)object.getLayoutParams()).a) continue;
            this.f();
        }
        this.z = n13;
        if (this.x) {
            object = this.g();
            if (object != null) {
                float f2 = this.h();
                float f3 = this.i;
                float f4 = this.j;
                n2 = (int)(f2 * Math.max(f3, Math.min(object.e, f4)));
            } else {
                n2 = 0;
            }
            this.j();
            this.scrollTo(n2, 0);
            this.k();
        }
        this.x = false;
    }

    protected final void onMeasure(int n2, int n3) {
        azx azx2;
        int n4;
        int n5;
        View view;
        this.setMeasuredDimension(ViewPager.getDefaultSize((int)0, (int)n2), ViewPager.getDefaultSize((int)0, (int)n3));
        n2 = this.getMeasuredWidth();
        this.o = Math.min(n2 / 10, this.n);
        n2 = n2 - this.getPaddingLeft() - this.getPaddingRight();
        n3 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        int n6 = this.getChildCount();
        int n7 = 0;
        while (true) {
            int n8 = 0x40000000;
            if (n7 >= n6) break;
            view = this.getChildAt(n7);
            n5 = n2;
            n4 = n3;
            if (view.getVisibility() != 8) {
                azx2 = (azx)view.getLayoutParams();
                n5 = n2;
                n4 = n3;
                if (azx2 != null) {
                    n5 = n2;
                    n4 = n3;
                    if (azx2.a) {
                        int n9;
                        int n10;
                        n5 = azx2.b;
                        n4 = n5 & 7;
                        int n11 = n5 & 0x70;
                        n5 = 1;
                        boolean bl2 = n11 == 48 || n11 == 80;
                        n11 = n5;
                        if (n4 != 3) {
                            n11 = n4 == 5 ? n5 : 0;
                        }
                        n4 = Integer.MIN_VALUE;
                        if (bl2) {
                            n5 = Integer.MIN_VALUE;
                            n4 = 0x40000000;
                        } else {
                            n5 = n11 != 0 ? 0x40000000 : Integer.MIN_VALUE;
                        }
                        if (azx2.width != -2) {
                            n4 = azx2.width != -1 ? azx2.width : n2;
                            n10 = 0x40000000;
                            n9 = n4;
                        } else {
                            n9 = n2;
                            n10 = n4;
                        }
                        if (azx2.height != -2) {
                            n5 = azx2.height != -1 ? azx2.height : n3;
                        } else {
                            n4 = n3;
                            n8 = n5;
                            n5 = n4;
                        }
                        view.measure(View.MeasureSpec.makeMeasureSpec((int)n9, (int)n10), View.MeasureSpec.makeMeasureSpec((int)n5, (int)n8));
                        if (bl2) {
                            n4 = n3 - view.getMeasuredHeight();
                            n5 = n2;
                        } else {
                            n5 = n2;
                            n4 = n3;
                            if (n11 != 0) {
                                n5 = n2 - view.getMeasuredWidth();
                                n4 = n3;
                            }
                        }
                    }
                }
            }
            ++n7;
            n2 = n5;
            n3 = n4;
        }
        View.MeasureSpec.makeMeasureSpec((int)n2, (int)0x40000000);
        n4 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)0x40000000);
        n5 = this.getChildCount();
        for (n3 = 0; n3 < n5; ++n3) {
            view = this.getChildAt(n3);
            if (view.getVisibility() == 8 || (azx2 = (azx)view.getLayoutParams()) != null && azx2.a) continue;
            float f2 = n2;
            float f3 = azx2.c;
            view.measure(View.MeasureSpec.makeMeasureSpec((int)((int)(f2 * 0.0f)), (int)0x40000000), n4);
        }
    }

    protected final boolean onRequestFocusInDescendants(int n2, Rect rect) {
        int n3;
        int n4 = this.getChildCount();
        if ((n2 & 2) != 0) {
            n3 = 1;
            n2 = 0;
        } else {
            n2 = n4 - 1;
            n3 = -1;
            n4 = -1;
        }
        while (n2 != n4) {
            if (this.getChildAt(n2).getVisibility() == 0) {
                this.f();
            }
            n2 += n3;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof azz)) {
            super.onRestoreInstanceState(object);
            return;
        }
        azz azz2 = (azz)object;
        super.onRestoreInstanceState(azz2.d);
        int n2 = azz2.a;
        object = azz2.b;
        object = azz2.e;
    }

    public final Parcelable onSaveInstanceState() {
        azz azz2 = new azz(super.onSaveInstanceState());
        azz2.a = 0;
        return azz2;
    }

    protected final void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        if (n2 != n4) {
            float f2;
            if (n4 > 0 && !this.e.isEmpty()) {
                if (!this.h.isFinished()) {
                    Scroller scroller = this.h;
                    this.h();
                    scroller.setFinalX(0);
                    return;
                }
                n3 = this.getPaddingLeft();
                int n6 = this.getPaddingRight();
                n5 = this.getPaddingLeft();
                int n7 = this.getPaddingRight();
                float f3 = this.getScrollX();
                int n8 = this.getScrollY();
                this.scrollTo((int)(f3 / (float)(n4 - n5 - n7) * (float)(n2 - n3 - n6)), n8);
                return;
            }
            azw azw2 = this.g();
            if (azw2 != null) {
                f2 = this.j;
                f2 = Math.min(azw2.e, f2);
            } else {
                f2 = 0.0f;
            }
            n5 = this.getPaddingLeft();
            n4 = this.getPaddingRight();
            n3 = this.getScrollX();
            n2 = (int)(f2 * (float)(n2 - n5 - n4));
            if (n2 != n3) {
                this.j();
                this.scrollTo(n2, this.getScrollY());
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
        {
        }
    }
}

