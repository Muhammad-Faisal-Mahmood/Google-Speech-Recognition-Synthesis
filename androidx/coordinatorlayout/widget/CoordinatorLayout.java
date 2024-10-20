/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.Gravity
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$OnHierarchyChangeListener
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CoordinatorLayout
extends ViewGroup
implements vi,
vj {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    private static final uo w;
    public xn e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    public final ayn h;
    private final List i = new ArrayList();
    private final List j;
    private final int[] k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private sa s;
    private boolean t;
    private Drawable u;
    private vk v;
    private final bvl x;

    static {
        Object object = CoordinatorLayout.class.getPackage();
        object = object != null ? ((Package)object).getName() : null;
        a = object;
        d = new py(2);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        w = new up(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969017);
    }

    public CoordinatorLayout(Context object, AttributeSet attributeSet, int n2) {
        super(object, attributeSet, n2);
        this.h = new ayn(null);
        this.j = new ArrayList();
        this.k = new int[2];
        this.l = new int[2];
        this.m = new int[2];
        this.x = new bvl();
        int n3 = 0;
        TypedArray typedArray = n2 == 0 ? object.obtainStyledAttributes(attributeSet, ru.a, 0, 2132084925) : object.obtainStyledAttributes(attributeSet, ru.a, n2, 0);
        if (n2 == 0) {
            wj.l((View)this, object, ru.a, attributeSet, typedArray, 0, 2132084925);
        } else {
            wj.l((View)this, object, ru.a, attributeSet, typedArray, n2, 0);
        }
        n2 = typedArray.getResourceId(0, 0);
        if (n2 != 0) {
            object = object.getResources();
            this.p = object.getIntArray(n2);
            float f2 = object.getDisplayMetrics().density;
            int n4 = this.p.length;
            for (n2 = n3; n2 < n4; ++n2) {
                object = this.p;
                object[n2] = (Context)((int)((float)object[n2] * f2));
            }
        }
        this.u = typedArray.getDrawable(1);
        typedArray.recycle();
        this.z();
        super.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener)new ry(this));
        if (this.getImportantForAccessibility() == 0) {
            this.setImportantForAccessibility(1);
        }
    }

    private final boolean A(int n2) {
        CoordinatorLayout coordinatorLayout;
        Object object;
        block3: {
            object = this;
            while (object != null) {
                coordinatorLayout = object;
                if (!object.isFocused()) {
                    if (object instanceof ViewGroup) {
                        object = ((ViewGroup)object).getFocusedChild();
                        continue;
                    }
                    object = null;
                    continue;
                }
                break block3;
            }
            coordinatorLayout = null;
        }
        this.t((View)this, (View)coordinatorLayout, 2, 1);
        object = this.m;
        object[0] = false;
        object[1] = false;
        this.f((View)coordinatorLayout, 0, 0, 0, n2, 1, (int[])object);
        this.h((View)coordinatorLayout, 1);
        return this.m[1] > 0;
    }

    private final boolean B(rw rw2, View view, MotionEvent motionEvent, int n2) {
        if (n2 != 0) {
            return rw2.g(this, view, motionEvent);
        }
        return rw2.d(this, view, motionEvent);
    }

    private final boolean C(MotionEvent motionEvent, int n2) {
        int n3;
        int n4;
        int n5 = motionEvent.getActionMasked();
        List list = this.j;
        list.clear();
        boolean bl2 = this.isChildrenDrawingOrderEnabled();
        int n6 = this.getChildCount();
        for (n4 = n6 - 1; n4 >= 0; --n4) {
            n3 = bl2 ? this.getChildDrawingOrder(n6, n4) : n4;
            list.add(this.getChildAt(n3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        n6 = list.size();
        comparator = null;
        boolean bl3 = false;
        for (n4 = 0; n4 < n6; ++n4) {
            Comparator comparator2;
            View view = (View)list.get(n4);
            rz rz2 = (rz)view.getLayoutParams();
            rw rw2 = rz2.a;
            if (bl3 && n5 != 0) {
                comparator2 = comparator;
                bl2 = bl3;
                if (rw2 != null) {
                    comparator2 = comparator;
                    if (comparator == null) {
                        comparator2 = CoordinatorLayout.E(motionEvent);
                    }
                    this.B(rw2, view, (MotionEvent)comparator2, n2);
                    bl2 = bl3;
                }
            } else {
                comparator2 = comparator;
                bl2 = bl3;
                if (!bl3) {
                    comparator2 = comparator;
                    bl2 = bl3;
                    if (rw2 != null) {
                        bl3 = this.B(rw2, view, motionEvent, n2);
                        comparator2 = comparator;
                        bl2 = bl3;
                        if (bl3) {
                            this.q = view;
                            comparator2 = comparator;
                            bl2 = bl3;
                            if (n5 != 3) {
                                comparator2 = comparator;
                                bl2 = bl3;
                                if (n5 != 1) {
                                    n3 = 0;
                                    while (true) {
                                        comparator2 = comparator;
                                        bl2 = bl3;
                                        if (n3 >= n4) break;
                                        view = (View)list.get(n3);
                                        rw2 = ((rz)view.getLayoutParams()).a;
                                        comparator2 = comparator;
                                        if (rw2 != null) {
                                            comparator2 = comparator;
                                            if (comparator == null) {
                                                comparator2 = CoordinatorLayout.E(motionEvent);
                                            }
                                            this.B(rw2, view, (MotionEvent)comparator2, n2);
                                        }
                                        ++n3;
                                        comparator = comparator2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (rz2.a == null) {
                    rz2.m = false;
                }
                bl3 = rz2.m;
            }
            comparator = comparator2;
            bl3 = bl2;
        }
        list.clear();
        if (comparator != null) {
            comparator.recycle();
        }
        return bl3;
    }

    private static final void D(int n2, Rect rect, Rect rect2, rz rz2, int n3, int n4) {
        int n5;
        int n6 = n5 = rz2.c;
        if (n5 == 0) {
            n6 = 17;
        }
        n5 = Gravity.getAbsoluteGravity((int)n6, (int)n2);
        n6 = CoordinatorLayout.s(rz2.d);
        int n7 = n5 & 7;
        int n8 = n5 & 0x70;
        n6 = Gravity.getAbsoluteGravity((int)n6, (int)n2);
        n2 = n6 & 7;
        n6 &= 0x70;
        n2 = n2 != 1 ? (n2 != 5 ? rect.left : rect.right) : rect.left + rect.width() / 2;
        n6 = n6 != 16 ? (n6 != 80 ? rect.top : rect.bottom) : rect.top + rect.height() / 2;
        if (n7 != 1) {
            n5 = n2;
            if (n7 != 5) {
                n5 = n2 - n3;
            }
        } else {
            n5 = n2 - n3 / 2;
        }
        if (n8 != 16) {
            n2 = n6;
            if (n8 != 80) {
                n2 = n6 - n4;
            }
        } else {
            n2 = n6 - n4 / 2;
        }
        rect2.set(n5, n2, n3 + n5, n4 + n2);
    }

    private static final MotionEvent E(MotionEvent motionEvent) {
        motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        motionEvent.setAction(3);
        return motionEvent;
    }

    private static final void F(View view, int n2) {
        rz rz2 = (rz)view.getLayoutParams();
        int n3 = rz2.i;
        if (n3 != n2) {
            int[] nArray = wj.a;
            view.offsetLeftAndRight(n2 - n3);
            rz2.i = n2;
        }
    }

    private static final void G(View view, int n2) {
        rz rz2 = (rz)view.getLayoutParams();
        int n3 = rz2.j;
        if (n3 != n2) {
            int[] nArray = wj.a;
            view.offsetTopAndBottom(n2 - n3);
            rz2.j = n2;
        }
    }

    static final rz l(View object) {
        rz rz2 = (rz)object.getLayoutParams();
        if (!rz2.b) {
            if (object instanceof rv) {
                if ((object = ((rv)object).a()) == null) {
                    Log.e((String)"CoordinatorLayout", (String)"Attached behavior class is null");
                }
                rz2.b((rw)object);
                rz2.b = true;
            } else {
                Serializable serializable = object.getClass();
                object = null;
                while (serializable != null) {
                    rx rx2 = ((Class)serializable).getAnnotation(rx.class);
                    object = rx2;
                    if (rx2 != null) break;
                    serializable = ((Class)serializable).getSuperclass();
                    object = rx2;
                }
                if (object != null) {
                    try {
                        rz2.b((rw)object.a().getDeclaredConstructor(null).newInstance(null));
                    }
                    catch (Exception exception) {
                        serializable = new StringBuilder("Default behavior class ");
                        ((StringBuilder)serializable).append(object.a().getName());
                        ((StringBuilder)serializable).append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e((String)"CoordinatorLayout", (String)((StringBuilder)serializable).toString(), (Throwable)exception);
                    }
                }
                rz2.b = true;
            }
        }
        return rz2;
    }

    private final int n() {
        return this.p() - this.getHeight();
    }

    private final int o() {
        return -this.p();
    }

    private final int p() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            View view = this.getChildAt(i2);
            rz rz2 = (rz)view.getLayoutParams();
            n2 += view.getHeight() + rz2.topMargin + rz2.bottomMargin;
        }
        return n2;
    }

    private final int q(int n2) {
        Object object = this.p;
        if (object == null) {
            object = new StringBuilder("No keylines defined for ");
            object.append(this);
            object.append(" - attempted index lookup ");
            object.append(n2);
            Log.e((String)"CoordinatorLayout", (String)object.toString());
            return 0;
        }
        if (n2 >= 0 && n2 < ((int[])object).length) {
            return (int)object[n2];
        }
        object = new StringBuilder("Keyline index ");
        object.append(n2);
        object.append(" out of range for ");
        object.append(this);
        Log.e((String)"CoordinatorLayout", (String)object.toString());
        return 0;
    }

    private final int r() {
        return (int)((float)this.getHeight() * 0.1f);
    }

    private static int s(int n2) {
        int n3 = n2;
        if ((n2 & 7) == 0) {
            n3 = n2 | 0x800003;
        }
        n2 = n3;
        if ((n3 & 0x70) == 0) {
            n2 = n3 | 0x30;
        }
        return n2;
    }

    private static int u(int n2) {
        int n3 = n2;
        if (n2 == 0) {
            n3 = 8388661;
        }
        return n3;
    }

    private static Rect v() {
        Rect rect;
        Rect rect2 = rect = (Rect)w.a();
        if (rect == null) {
            rect2 = new Rect();
        }
        return rect2;
    }

    private final void w(rz rz2, Rect rect, int n2, int n3) {
        int n4 = this.getWidth();
        int n5 = this.getHeight();
        n4 = Math.max(this.getPaddingLeft() + rz2.leftMargin, Math.min(rect.left, n4 - this.getPaddingRight() - n2 - rz2.rightMargin));
        n5 = Math.max(this.getPaddingTop() + rz2.topMargin, Math.min(rect.top, n5 - this.getPaddingBottom() - n3 - rz2.bottomMargin));
        rect.set(n4, n5, n2 + n4, n3 + n5);
    }

    private static void x(Rect rect) {
        rect.setEmpty();
        w.b(rect);
    }

    private final void y() {
        Object object = this.q;
        if (object != null) {
            object = ((rz)object.getLayoutParams()).a;
            if (object != null) {
                long l2 = SystemClock.uptimeMillis();
                MotionEvent motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)3, (float)0.0f, (float)0.0f, (int)0);
                ((rw)object).g(this, this.q, motionEvent);
                motionEvent.recycle();
            }
            this.q = null;
        }
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((rz)this.getChildAt((int)i2).getLayoutParams()).m = false;
        }
        this.n = false;
    }

    private final void z() {
        int[] nArray = wj.a;
        if (this.getFitsSystemWindows()) {
            if (this.v == null) {
                this.v = new bon(this, 1);
            }
            wa.k((View)this, this.v);
            this.setSystemUiVisibility(1280);
            return;
        }
        wa.k((View)this, null);
    }

    public final List a(View view) {
        ayn ayn2 = this.h;
        int n2 = ((pa)ayn2.b).f;
        ArrayList<Object> arrayList = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            ArrayList arrayList2 = (ArrayList)((pa)ayn2.b).g(i2);
            ArrayList<Object> arrayList3 = arrayList;
            if (arrayList2 != null) {
                arrayList3 = arrayList;
                if (arrayList2.contains(view)) {
                    arrayList3 = arrayList;
                    if (arrayList == null) {
                        arrayList3 = new ArrayList<Object>();
                    }
                    arrayList3.add(((pa)ayn2.b).d(i2));
                }
            }
            arrayList = arrayList3;
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    public final void b(View view) {
        ArrayList arrayList = this.h.b(view);
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                View view2 = (View)arrayList.get(i2);
                rw rw2 = ((rz)view2.getLayoutParams()).a;
                if (rw2 == null) continue;
                rw2.i(this, view2, view);
            }
        }
    }

    final void c(View view, boolean bl2, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (bl2) {
                sc.a(this, view, rect);
                return;
            }
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            return;
        }
        rect.setEmpty();
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof rz && super.checkLayoutParams(layoutParams);
    }

    @Override
    public final void d(View view, int n2, int n3, int[] nArray, int n4) {
        int n5;
        int n6;
        int n7 = this.getChildCount();
        int n8 = 0;
        int n9 = n6 = (n5 = 0);
        int n10 = n6;
        while (n5 < n7) {
            int n11;
            int n12;
            View view2 = this.getChildAt(n5);
            if (view2.getVisibility() != 8) {
                Object object = (rz)view2.getLayoutParams();
                n6 = n8;
                n12 = n10;
                n11 = n9;
                if (object.d(n4)) {
                    rw rw2 = object.a;
                    n6 = n8;
                    n12 = n10;
                    n11 = n9;
                    if (rw2 != null) {
                        object = this.k;
                        object[0] = (rz)false;
                        object[1] = (rz)false;
                        rw2.m(this, view2, view, n3, (int[])object, n4);
                        n6 = n2 > 0 ? Math.max(n10, this.k[0]) : Math.min(n10, this.k[0]);
                        n10 = n6;
                        n6 = n3 > 0 ? Math.max(n9, this.k[1]) : Math.min(n9, this.k[1]);
                        n11 = n6;
                        n6 = 1;
                        n12 = n10;
                    }
                }
            } else {
                n11 = n9;
                n12 = n10;
                n6 = n8;
            }
            ++n5;
            n8 = n6;
            n10 = n12;
            n9 = n11;
        }
        nArray[0] = n10;
        nArray[1] = n9;
        if (n8 != 0) {
            this.i(1);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        boolean bl3 = bl2 = super.dispatchKeyEvent(keyEvent);
        if (bl2) return bl3;
        bl3 = bl2;
        if (keyEvent.getAction() != 0) return bl3;
        int n2 = keyEvent.getKeyCode();
        if (n2 != 19) {
            if (n2 != 20) {
                if (n2 != 62) {
                    if (n2 == 92) return this.A(-this.getHeight());
                    if (n2 == 93) return this.A(this.getHeight());
                    if (n2 == 122) return this.A(this.o());
                    if (n2 == 123) return this.A(this.n());
                    return bl2;
                }
                if (!keyEvent.isShiftPressed()) return this.A(this.n());
                return this.A(this.o());
            }
            if (!keyEvent.isAltPressed()) return this.A(this.r());
            return this.A(this.getHeight());
        }
        if (!keyEvent.isAltPressed()) return this.A(-this.r());
        return this.A(-this.getHeight());
    }

    protected final boolean drawChild(Canvas canvas, View view, long l2) {
        rw rw2 = ((rz)view.getLayoutParams()).a;
        return super.drawChild(canvas, view, l2);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && drawable.setState(nArray)) {
            this.invalidate();
        }
    }

    @Override
    public final void e(View view, int n2, int n3, int n4, int n5, int n6) {
        this.f(view, n2, n3, n4, n5, 0, this.l);
    }

    @Override
    public final void f(View view, int n2, int n3, int n4, int n5, int n6, int[] nArray) {
        int n7;
        int n8 = this.getChildCount();
        int n9 = 0;
        int n10 = n2 = (n7 = 0);
        int n11 = n2;
        while (n7 < n8) {
            int n12;
            int n13;
            view = this.getChildAt(n7);
            if (view.getVisibility() != 8) {
                Object object = (rz)view.getLayoutParams();
                n2 = n9;
                n13 = n11;
                n12 = n10;
                if (object.d(n6)) {
                    rw rw2 = object.a;
                    n2 = n9;
                    n13 = n11;
                    n12 = n10;
                    if (rw2 != null) {
                        object = this.k;
                        object[0] = (rz)false;
                        object[1] = (rz)false;
                        rw2.n(this, view, n3, n4, n5, (int[])object);
                        n2 = n4 > 0 ? Math.max(n11, this.k[0]) : Math.min(n11, this.k[0]);
                        n13 = n2;
                        n2 = n5 > 0 ? Math.max(n10, this.k[1]) : Math.min(n10, this.k[1]);
                        n12 = n2;
                        n2 = 1;
                    }
                }
            } else {
                n12 = n10;
                n13 = n11;
                n2 = n9;
            }
            ++n7;
            n9 = n2;
            n11 = n13;
            n10 = n12;
        }
        nArray[0] = nArray[0] + n11;
        nArray[1] = nArray[1] + n10;
        if (n9 != 0) {
            this.i(1);
        }
    }

    @Override
    public final void g(View object, View view, int n2, int n3) {
        this.x.b(n2, n3);
        this.r = view;
        int n4 = this.getChildCount();
        for (n2 = 0; n2 < n4; ++n2) {
            object = (rz)this.getChildAt(n2).getLayoutParams();
            if (!object.d(n3)) continue;
            object = object.a;
        }
    }

    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new rz();
    }

    public final int getNestedScrollAxes() {
        return this.x.a();
    }

    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }

    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }

    @Override
    public final void h(View view, int n2) {
        this.x.c(n2);
        int n3 = this.getChildCount();
        for (int i2 = 0; i2 < n3; ++i2) {
            View view2 = this.getChildAt(i2);
            rz rz2 = (rz)view2.getLayoutParams();
            if (!rz2.d(n2)) continue;
            rw rw2 = rz2.a;
            if (rw2 != null) {
                rw2.c(this, view2, view, n2);
            }
            rz2.c(n2, false);
            rz2.a();
        }
        this.r = null;
    }

    public final void i(int n2) {
        int n3 = n2;
        int n4 = this.getLayoutDirection();
        int n5 = this.i.size();
        Rect rect = CoordinatorLayout.v();
        Rect rect2 = CoordinatorLayout.v();
        Object object = CoordinatorLayout.v();
        block0: for (int i2 = 0; i2 < n5; ++i2) {
            int n6;
            int n7;
            int n8;
            Object object2;
            rz rz2;
            View view;
            View view2 = (View)this.i.get(i2);
            rz rz3 = (rz)view2.getLayoutParams();
            if (n3 == 0 && view2.getVisibility() == 8) continue;
            for (n3 = 0; n3 < i2; ++n3) {
                Object object3;
                view = (View)this.i.get(n3);
                if (rz3.l != view) continue;
                rz2 = (rz)view2.getLayoutParams();
                if (rz2.k == null) continue;
                object2 = CoordinatorLayout.v();
                view = CoordinatorLayout.v();
                Rect rect3 = CoordinatorLayout.v();
                sc.a(this, rz2.k, (Rect)object2);
                this.c(view2, false, (Rect)view);
                n8 = view2.getMeasuredWidth();
                n7 = view2.getMeasuredHeight();
                CoordinatorLayout.D(n4, (Rect)object2, rect3, rz2, n8, n7);
                n6 = rect3.left == view.left && rect3.top == view.top ? 0 : 1;
                this.w(rz2, rect3, n8, n7);
                n8 = rect3.left - view.left;
                n7 = rect3.top - view.top;
                if (n8 != 0) {
                    object3 = wj.a;
                    view2.offsetLeftAndRight(n8);
                }
                if (n7 != 0) {
                    object3 = wj.a;
                    view2.offsetTopAndBottom(n7);
                }
                if (n6 != 0 && (object3 = (Object)rz2.a) != null) {
                    ((rw)object3).i(this, view2, rz2.k);
                }
                CoordinatorLayout.x((Rect)object2);
                CoordinatorLayout.x((Rect)view);
                CoordinatorLayout.x(rect3);
            }
            this.c(view2, true, rect2);
            if (rz3.g != 0 && !rect2.isEmpty()) {
                n6 = Gravity.getAbsoluteGravity((int)rz3.g, (int)n4);
                n3 = n6 & 0x70;
                if (n3 != 48) {
                    if (n3 == 80) {
                        rect.bottom = Math.max(rect.bottom, this.getHeight() - rect2.top);
                    }
                } else {
                    rect.top = Math.max(rect.top, rect2.bottom);
                }
                n3 = n6 & 7;
                if (n3 != 3) {
                    if (n3 == 5) {
                        rect.right = Math.max(rect.right, this.getWidth() - rect2.left);
                    }
                } else {
                    rect.left = Math.max(rect.left, rect2.right);
                }
            }
            if (rz3.h != 0 && view2.getVisibility() == 0 && view2.isLaidOut() && view2.getWidth() > 0 && view2.getHeight() > 0) {
                rz2 = (rz)view2.getLayoutParams();
                object2 = rz2.a;
                rz3 = CoordinatorLayout.v();
                view = CoordinatorLayout.v();
                view.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                if (object2 != null && ((rw)object2).r(view2, (Rect)rz3)) {
                    if (!view.contains((Rect)rz3)) {
                        object = new StringBuilder("Rect should be within the child's bounds. Rect:");
                        ((StringBuilder)object).append(rz3.toShortString());
                        ((StringBuilder)object).append(" | Bounds:");
                        ((StringBuilder)object).append(view.toShortString());
                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                    }
                } else {
                    rz3.set((Rect)view);
                }
                CoordinatorLayout.x((Rect)view);
                if (rz3.isEmpty()) {
                    CoordinatorLayout.x((Rect)rz3);
                } else {
                    n6 = Gravity.getAbsoluteGravity((int)rz2.h, (int)n4);
                    if ((n6 & 0x30) == 48 && (n3 = ((Rect)rz3).top - rz2.topMargin - rz2.j) < rect.top) {
                        CoordinatorLayout.G(view2, rect.top - n3);
                        n3 = 1;
                    } else {
                        n3 = 0;
                    }
                    if ((n6 & 0x50) == 80 && (n8 = this.getHeight() - ((Rect)rz3).bottom - rz2.bottomMargin + rz2.j) < rect.bottom) {
                        CoordinatorLayout.G(view2, n8 - rect.bottom);
                    } else if (n3 == 0) {
                        CoordinatorLayout.G(view2, 0);
                    }
                    if ((n6 & 3) == 3 && (n3 = ((Rect)rz3).left - rz2.leftMargin - rz2.i) < rect.left) {
                        CoordinatorLayout.F(view2, rect.left - n3);
                        n3 = 1;
                    } else {
                        n3 = 0;
                    }
                    if ((n6 & 5) == 5 && (n6 = this.getWidth() - ((Rect)rz3).right - rz2.rightMargin + rz2.i) < rect.right) {
                        CoordinatorLayout.F(view2, n6 - rect.right);
                    } else if (n3 == 0) {
                        CoordinatorLayout.F(view2, 0);
                    }
                    CoordinatorLayout.x((Rect)rz3);
                }
            }
            n7 = i2 + 1;
            n6 = n2;
            if (n6 != 2) {
                view = ((rz)view2.getLayoutParams()).p;
                rz3 = object;
                rz3.set((Rect)view);
                if (!rz3.equals(rect2)) {
                    ((rz)view2.getLayoutParams()).p.set(rect2);
                } else {
                    n3 = n6;
                    object = rz3;
                    continue;
                }
            }
            rz3 = object;
            n8 = n5;
            while (true) {
                n3 = n6;
                n5 = n8;
                object = rz3;
                if (n7 >= n8) continue block0;
                view = (View)this.i.get(n7);
                object = (rz)view.getLayoutParams();
                object2 = ((rz)((Object)object)).a;
                if (object2 != null && ((rw)object2).h(view2)) {
                    if (n6 == 0 && ((rz)((Object)object)).o) {
                        ((rz)((Object)object)).a();
                    } else {
                        boolean bl2;
                        if (n6 != 2) {
                            ((rw)object2).i(this, view, view2);
                            bl2 = false;
                        } else {
                            ((rw)object2).j(this, view2);
                            bl2 = true;
                        }
                        if (n6 == 1) {
                            ((rz)((Object)object)).o = bl2;
                        }
                    }
                }
                ++n7;
            }
        }
        CoordinatorLayout.x(rect);
        CoordinatorLayout.x(rect2);
        CoordinatorLayout.x((Rect)object);
    }

    public final void j(View view, int n2) {
        rz rz2 = (rz)view.getLayoutParams();
        Object object = rz2.k;
        if (object == null && rz2.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (object != null) {
            rz2 = CoordinatorLayout.v();
            Rect rect = CoordinatorLayout.v();
            try {
                sc.a(this, object, (Rect)rz2);
                object = (rz)view.getLayoutParams();
                int n3 = view.getMeasuredWidth();
                int n4 = view.getMeasuredHeight();
                CoordinatorLayout.D(n2, (Rect)rz2, rect, (rz)((Object)object), n3, n4);
                this.w((rz)((Object)object), rect, n3, n4);
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
            finally {
                CoordinatorLayout.x((Rect)rz2);
                CoordinatorLayout.x(rect);
            }
        }
        int n5 = rz2.e;
        if (n5 >= 0) {
            rz2 = (rz)view.getLayoutParams();
            int n6 = Gravity.getAbsoluteGravity((int)CoordinatorLayout.u(rz2.c), (int)n2);
            int n7 = n6 & 7;
            int n8 = n6 & 0x70;
            int n9 = this.getWidth();
            int n10 = this.getHeight();
            int n11 = view.getMeasuredWidth();
            int n12 = view.getMeasuredHeight();
            n6 = n5;
            if (n2 == 1) {
                n6 = n9 - n5;
            }
            n2 = this.q(n6) - n11;
            if (n7 != 1) {
                if (n7 == 5) {
                    n2 += n11;
                }
            } else {
                n2 += n11 / 2;
            }
            n6 = n8 != 16 ? (n8 != 80 ? 0 : n12) : n12 / 2;
            n2 = Math.max(this.getPaddingLeft() + rz2.leftMargin, Math.min(n2, n9 - this.getPaddingRight() - n11 - rz2.rightMargin));
            n6 = Math.max(this.getPaddingTop() + rz2.topMargin, Math.min(n6, n10 - this.getPaddingBottom() - n12 - rz2.bottomMargin));
            view.layout(n2, n6, n11 + n2, n12 + n6);
            return;
        }
        rz rz3 = (rz)view.getLayoutParams();
        rz2 = CoordinatorLayout.v();
        rz2.set(this.getPaddingLeft() + rz3.leftMargin, this.getPaddingTop() + rz3.topMargin, this.getWidth() - this.getPaddingRight() - rz3.rightMargin, this.getHeight() - this.getPaddingBottom() - rz3.bottomMargin);
        if (this.e != null) {
            object = wj.a;
            if (this.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                ((Rect)rz2).left += this.e.b();
                ((Rect)rz2).top += this.e.d();
                ((Rect)rz2).right -= this.e.c();
                ((Rect)rz2).bottom -= this.e.a();
            }
        }
        object = CoordinatorLayout.v();
        Gravity.apply((int)CoordinatorLayout.s(rz3.c), (int)view.getMeasuredWidth(), (int)view.getMeasuredHeight(), (Rect)rz2, (Rect)object, (int)n2);
        view.layout(object.left, object.top, object.right, object.bottom);
        CoordinatorLayout.x((Rect)rz2);
        CoordinatorLayout.x((Rect)object);
    }

    public final boolean k(View view, int n2, int n3) {
        Rect rect = CoordinatorLayout.v();
        sc.a(this, view, rect);
        try {
            boolean bl2 = rect.contains(n2, n3);
            return bl2;
        }
        finally {
            CoordinatorLayout.x(rect);
        }
    }

    public final void m(View view, int n2, int n3, int n4) {
        this.measureChildWithMargins(view, n2, n3, n4, 0);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y();
        if (this.t) {
            if (this.s == null) {
                this.s = new sa(this);
            }
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.s);
        }
        if (this.e == null) {
            int[] nArray = wj.a;
            if (this.getFitsSystemWindows()) {
                vy.d((View)this);
            }
        }
        this.o = true;
    }

    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        this.y();
        if (this.t && this.s != null) {
            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.s);
        }
        if ((view = this.r) != null) {
            this.onStopNestedScroll(view);
        }
        this.o = false;
    }

    public final void onDraw(Canvas canvas) {
        xn xn2;
        int n2;
        super.onDraw(canvas);
        if (this.f && this.u != null && (n2 = (xn2 = this.e) != null ? xn2.d() : 0) > 0) {
            this.u.setBounds(0, 0, this.getWidth(), n2);
            this.u.draw(canvas);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int n2;
        int n3 = n2 = motionEvent.getActionMasked();
        if (n2 == 0) {
            this.y();
            n3 = 0;
        }
        boolean bl2 = this.C(motionEvent, 0);
        if (n3 == 1 || n3 == 3) {
            this.q = null;
            this.y();
        }
        return bl2;
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        n3 = this.getLayoutDirection();
        n4 = this.i.size();
        for (n2 = 0; n2 < n4; ++n2) {
            rw rw2;
            View view = (View)this.i.get(n2);
            if (view.getVisibility() == 8 || (rw2 = ((rz)view.getLayoutParams()).a) != null && rw2.e(this, view, n3)) continue;
            this.j(view, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final void onMeasure(int var1_1, int var2_2) {
        block41: {
            this.i.clear();
            var28_3 /* !! */  = this.h;
            var4_4 = ((pa)var28_3 /* !! */ .b).f;
            for (var3_5 = 0; var3_5 < var4_4; ++var3_5) {
                var27_6 = (ArrayList)((pa)var28_3 /* !! */ .b).g(var3_5);
                if (var27_6 == null) continue;
                var27_6.clear();
                ((uo)var28_3 /* !! */ .d).b(var27_6);
            }
            ((pa)var28_3 /* !! */ .b).clear();
            var5_7 = this.getChildCount();
            for (var3_5 = 0; var3_5 < var5_7; ++var3_5) {
                block45: {
                    block43: {
                        block40: {
                            block44: {
                                block39: {
                                    block42: {
                                        var30_12 /* !! */  = this.getChildAt(var3_5);
                                        var29_11 = CoordinatorLayout.l(var30_12 /* !! */ );
                                        if (var29_11.f != -1) break block42;
                                        var29_11.l = null;
                                        var29_11.k = null;
                                        break block43;
                                    }
                                    var27_6 = var29_11.k;
                                    if (var27_6 == null || var27_6.getId() != var29_11.f) break block39;
                                    var28_3 /* !! */  = var29_11.k;
                                    for (var27_6 = var28_3 /* !! */ .getParent(); var27_6 != this; var27_6 = var27_6.getParent()) {
                                        if (var27_6 != null && var27_6 != var30_12 /* !! */ ) {
                                            if (!(var27_6 instanceof View)) continue;
                                            var28_3 /* !! */  = (View)var27_6;
                                            continue;
                                        }
                                        var29_11.l = null;
                                        var29_11.k = null;
                                        break block39;
                                    }
                                    var29_11.l = var28_3 /* !! */ ;
                                    break block40;
                                }
                                var29_11.k = this.findViewById(var29_11.f);
                                var28_3 /* !! */  = var29_11.k;
                                if (var28_3 /* !! */  == null) break block44;
                                if (var28_3 /* !! */  != this) ** GOTO lbl44
                                if (this.isInEditMode()) {
                                    var29_11.l = null;
                                    var29_11.k = null;
                                } else {
                                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
lbl44:
                                    // 3 sources

                                    for (var27_6 = var28_3 /* !! */ .getParent(); var27_6 != this && var27_6 != null; var27_6 = var27_6.getParent()) {
                                        if (var27_6 == var30_12 /* !! */ ) {
                                            if (this.isInEditMode()) {
                                                var29_11.l = null;
                                                var29_11.k = null;
                                                break block40;
                                            }
                                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                        }
                                        if (!(var27_6 instanceof View)) continue;
                                        var28_3 /* !! */  = (View)var27_6;
                                    }
                                    var29_11.l = var28_3 /* !! */ ;
                                }
                                break block40;
                            }
                            if (!this.isInEditMode()) break block45;
                            var29_11.l = null;
                            var29_11.k = null;
                        }
                        var27_6 = var29_11.k;
                    }
                    this.h.c(var30_12 /* !! */ );
                    for (var4_4 = 0; var4_4 < var5_7; ++var4_4) {
                        if (var4_4 == var3_5 || (var31_13 = this.getChildAt(var4_4)) != var29_11.l && ((var6_9 = Gravity.getAbsoluteGravity((int)((rz)var31_13.getLayoutParams()).g, (int)(var7_10 = this.getLayoutDirection()))) == 0 || (Gravity.getAbsoluteGravity((int)var29_11.h, (int)var7_10) & var6_9) != var6_9) && ((var27_6 = var29_11.a) == null || !var27_6.h((View)var31_13))) continue;
                        if (!((pa)this.h.b).containsKey(var31_13)) {
                            this.h.c(var31_13);
                        }
                        var32_8 = this.h;
                        if (((pa)var32_8.b).containsKey(var31_13) && ((pa)var32_8.b).containsKey(var30_12 /* !! */ )) {
                            var27_6 = var28_3 /* !! */  = (ArrayList)((pa)var32_8.b).get(var31_13);
                            if (var28_3 /* !! */  == null) {
                                var27_6 = var28_3 /* !! */  = (ArrayList)((uo)var32_8.d).a();
                                if (var28_3 /* !! */  == null) {
                                    var27_6 = new ArrayList<View>();
                                }
                                ((pa)var32_8.b).put(var31_13, var27_6);
                            }
                            var27_6.add(var30_12 /* !! */ );
                            continue;
                        }
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    continue;
                }
                var27_6 = new StringBuilder("Could not find CoordinatorLayout descendant view with id ");
                var27_6.append(this.getResources().getResourceName(var29_11.f));
                var27_6.append(" to anchor view ");
                var27_6.append(var30_12 /* !! */ );
                throw new IllegalStateException(var27_6.toString());
            }
            var28_3 /* !! */  = this.i;
            var31_13 = this.h;
            ((ArrayList)var31_13.a).clear();
            ((HashSet)var31_13.c).clear();
            var4_4 = ((pa)var31_13.b).f;
            for (var3_5 = 0; var3_5 < var4_4; ++var3_5) {
                var30_12 /* !! */  = ((pa)var31_13.b).d(var3_5);
                var27_6 = var31_13.a;
                var29_11 = (HashSet)var31_13.c;
                var31_13.d(var30_12 /* !! */ , (ArrayList)var27_6, (HashSet)var29_11);
            }
            var28_3 /* !! */ .addAll(var31_13.a);
            Collections.reverse(this.i);
            var5_7 = this.getChildCount();
            for (var3_5 = 0; var3_5 < var5_7; ++var3_5) {
                var28_3 /* !! */  = this.getChildAt(var3_5);
                var27_6 = this.h;
                var6_9 = ((pa)var27_6.b).f;
                for (var4_4 = 0; var4_4 < var6_9; ++var4_4) {
                    var29_11 = (ArrayList)((pa)var27_6.b).g(var4_4);
                    if (var29_11 == null || !var29_11.contains(var28_3 /* !! */ )) continue;
                    var26_14 = true;
                    break block41;
                }
            }
            var26_14 = false;
        }
        if (var26_14 != this.t) {
            if (var26_14) {
                if (this.o) {
                    if (this.s == null) {
                        this.s = new sa(this);
                    }
                    this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.s);
                }
                this.t = true;
            } else {
                if (this.o && this.s != null) {
                    this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this.s);
                }
                this.t = false;
            }
        }
        var17_15 = this.getPaddingLeft();
        var19_16 = this.getPaddingTop();
        var18_17 = this.getPaddingRight();
        var20_18 = this.getPaddingBottom();
        var9_19 = this.getLayoutDirection();
        var4_4 = var9_19 == 1 ? 1 : 0;
        var22_20 = View.MeasureSpec.getMode((int)var1_1);
        var21_21 = View.MeasureSpec.getSize((int)var1_1);
        var24_22 = View.MeasureSpec.getMode((int)var2_2);
        var23_23 = View.MeasureSpec.getSize((int)var2_2);
        var14_24 = this.getSuggestedMinimumWidth();
        var13_25 = this.getSuggestedMinimumHeight();
        if (this.e == null) ** GOTO lbl-1000
        var27_6 = wj.a;
        if (this.getFitsSystemWindows()) {
            var7_10 = 1;
        } else lbl-1000:
        // 2 sources

        {
            var7_10 = 0;
        }
        var8_26 = this.i.size();
        var11_27 = 0;
        var3_5 = 0;
        var6_9 = var18_17;
        var5_7 = var17_15;
        while (true) {
            block49: {
                block46: {
                    block48: {
                        block47: {
                            var10_28 = var6_9;
                            var12_29 = var5_7;
                            if (var3_5 >= var8_26) break;
                            var27_6 = (View)this.i.get(var3_5);
                            if (var27_6.getVisibility() == 8) break block46;
                            var28_3 /* !! */  = (rz)var27_6.getLayoutParams();
                            var5_7 = var28_3 /* !! */ .e;
                            if (var5_7 < 0 || var22_20 == 0) ** GOTO lbl-1000
                            var25_32 = this.q(var5_7);
                            var6_9 = Gravity.getAbsoluteGravity((int)CoordinatorLayout.u(var28_3 /* !! */ .c), (int)var9_19) & 7;
                            if (var6_9 != 3) break block47;
                            if (var4_4 == 0) ** GOTO lbl-1000
                            var6_9 = 3;
                            var5_7 = 1;
                            break block48;
                        }
                        var5_7 = var4_4;
                    }
                    var16_31 = var6_9;
                    var15_30 = var5_7;
                    if (var6_9 == 5) {
                        ** if (var5_7 == 0) goto lbl-1000
                    }
                    ** GOTO lbl180
lbl-1000:
                    // 2 sources

                    {
                        var5_7 = Math.max(0, var21_21 - var10_28 - var25_32);
                        ** GOTO lbl184
                    }
lbl-1000:
                    // 1 sources

                    {
                        var16_31 = 5;
                        var15_30 = 0;
lbl180:
                        // 2 sources

                        if (var16_31 == 5 && var15_30 == 0 || var16_31 == 3 && var15_30 != 0) {
                            var5_7 = Math.max(0, var25_32 - var12_29);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var5_7 = 0;
                        }
                    }
lbl184:
                    // 3 sources

                    if (var7_10 == 0) ** GOTO lbl-1000
                    var29_11 = wj.a;
                    if (!var27_6.getFitsSystemWindows()) {
                        var15_30 = this.e.b();
                        var25_32 = this.e.c();
                        var6_9 = this.e.d();
                        var16_31 = this.e.a();
                        var15_30 = View.MeasureSpec.makeMeasureSpec((int)(var21_21 - (var15_30 + var25_32)), (int)var22_20);
                        var6_9 = View.MeasureSpec.makeMeasureSpec((int)(var23_23 - (var6_9 + var16_31)), (int)var24_22);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var15_30 = var1_1;
                        var6_9 = var2_2;
                    }
                    var29_11 = var28_3 /* !! */ .a;
                    if (var29_11 == null || !var29_11.k(this, (View)var27_6, var15_30, var5_7, var6_9)) {
                        this.m((View)var27_6, var15_30, var5_7, var6_9);
                    }
                    var5_7 = var3_5;
                    var14_24 = Math.max(var14_24, var17_15 + var18_17 + var27_6.getMeasuredWidth() + var28_3 /* !! */ .leftMargin + var28_3 /* !! */ .rightMargin);
                    var13_25 = Math.max(var13_25, var19_16 + var20_18 + var27_6.getMeasuredHeight() + var28_3 /* !! */ .topMargin + var28_3 /* !! */ .bottomMargin);
                    var11_27 = View.combineMeasuredStates((int)var11_27, (int)var27_6.getMeasuredState());
                    break block49;
                }
                var5_7 = var3_5;
            }
            ++var3_5;
            var5_7 = var12_29;
            var6_9 = var10_28;
        }
        this.setMeasuredDimension(View.resolveSizeAndState((int)var14_24, (int)var1_1, (int)(-16777216 & var11_27)), View.resolveSizeAndState((int)var13_25, (int)var2_2, (int)(var11_27 << 16)));
    }

    public final boolean onNestedFling(View object, float f2, float f3, boolean bl2) {
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            object = this.getChildAt(i2);
            if (object.getVisibility() == 8) continue;
            object = (rz)object.getLayoutParams();
            if (!object.n) continue;
            object = object.a;
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f2, float f3) {
        int n2 = this.getChildCount();
        boolean bl2 = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = this.getChildAt(i2);
            boolean bl3 = bl2;
            if (object.getVisibility() != 8) {
                object = (rz)object.getLayoutParams();
                bl3 = bl2;
                if (((rz)((Object)object)).n) {
                    object = ((rz)((Object)object)).a;
                    bl3 = bl2;
                    if (object != null) {
                        bl3 = bl2 | ((rw)object).l(view);
                    }
                }
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public final void onNestedPreScroll(View view, int n2, int n3, int[] nArray) {
        this.d(view, n2, n3, nArray, 0);
    }

    public final void onNestedScroll(View view, int n2, int n3, int n4, int n5) {
        this.e(view, n2, n3, n4, n5, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int n2) {
        this.g(view, view2, n2, 0);
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sb)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (sb)parcelable;
        super.onRestoreInstanceState(parcelable.d);
        parcelable = parcelable.a;
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            Parcelable parcelable2;
            View view = this.getChildAt(i2);
            int n3 = view.getId();
            rw rw2 = CoordinatorLayout.l((View)view).a;
            if (n3 == -1 || rw2 == null || (parcelable2 = (Parcelable)parcelable.get(n3)) == null) continue;
            rw2.o(view, parcelable2);
        }
    }

    protected final Parcelable onSaveInstanceState() {
        sb sb2 = new sb(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            View view = this.getChildAt(i2);
            int n3 = view.getId();
            rw rw2 = ((rz)view.getLayoutParams()).a;
            if (n3 == -1 || rw2 == null || (rw2 = rw2.p(view)) == null) continue;
            sparseArray.append(n3, (Object)rw2);
        }
        sb2.a = sparseArray;
        return sb2;
    }

    public final boolean onStartNestedScroll(View view, View view2, int n2) {
        return this.t(view, view2, n2, 0);
    }

    public final void onStopNestedScroll(View view) {
        this.h(view, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        int n2 = motionEvent.getActionMasked();
        Object object = this.q;
        boolean bl5 = false;
        if (object != null) {
            object = ((rz)object.getLayoutParams()).a;
            if (object != null) {
                bl4 = ((rw)object).g(this, this.q, motionEvent);
                bl3 = bl5;
            } else {
                bl4 = false;
                bl3 = bl5;
            }
        } else {
            bl4 = bl2 = this.C(motionEvent, 1);
            bl3 = bl5;
            if (n2 != 0) {
                bl4 = bl2;
                bl3 = bl5;
                if (bl2) {
                    bl3 = true;
                    bl4 = bl2;
                }
            }
        }
        if (this.q != null && n2 != 3) {
            bl2 = bl4;
            if (bl3) {
                motionEvent = CoordinatorLayout.E(motionEvent);
                super.onTouchEvent(motionEvent);
                motionEvent.recycle();
                bl2 = bl4;
            }
        } else {
            bl2 = bl4 | super.onTouchEvent(motionEvent);
        }
        if (n2 == 1 || n2 == 3) {
            this.q = null;
            this.y();
        }
        return bl2;
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl2) {
        rw rw2 = ((rz)view.getLayoutParams()).a;
        if (rw2 != null && rw2.f(this, view, rect, bl2)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, bl2);
    }

    public final void requestDisallowInterceptTouchEvent(boolean bl2) {
        super.requestDisallowInterceptTouchEvent(bl2);
        if (bl2 && !this.n) {
            if (this.q == null) {
                int n2 = this.getChildCount();
                MotionEvent motionEvent = null;
                for (int i2 = 0; i2 < n2; ++i2) {
                    View view = this.getChildAt(i2);
                    rw rw2 = ((rz)view.getLayoutParams()).a;
                    MotionEvent motionEvent2 = motionEvent;
                    if (rw2 != null) {
                        motionEvent2 = motionEvent;
                        if (motionEvent == null) {
                            long l2 = SystemClock.uptimeMillis();
                            motionEvent2 = MotionEvent.obtain((long)l2, (long)l2, (int)3, (float)0.0f, (float)0.0f, (int)0);
                        }
                        rw2.d(this, view, motionEvent2);
                    }
                    motionEvent = motionEvent2;
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            this.y();
            this.n = true;
        }
    }

    public final void setFitsSystemWindows(boolean bl2) {
        super.setFitsSystemWindows(bl2);
        this.z();
    }

    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    public final void setVisibility(int n2) {
        super.setVisibility(n2);
        Drawable drawable = this.u;
        if (drawable != null) {
            boolean bl2 = n2 == 0;
            if (drawable.isVisible() != bl2) {
                this.u.setVisible(bl2, false);
            }
        }
    }

    @Override
    public final boolean t(View view, View object, int n2, int n3) {
        int n4 = this.getChildCount();
        boolean bl2 = false;
        for (int i2 = 0; i2 < n4; ++i2) {
            View view2 = this.getChildAt(i2);
            boolean bl3 = bl2;
            if (view2.getVisibility() != 8) {
                object = (rz)view2.getLayoutParams();
                rw rw2 = ((rz)((Object)object)).a;
                if (rw2 != null) {
                    boolean bl4 = rw2.q(this, view2, view, n2, n3);
                    bl3 = bl2 | bl4;
                    ((rz)((Object)object)).c(n3, bl4);
                } else {
                    ((rz)((Object)object)).c(n3, false);
                    bl3 = bl2;
                }
            }
            bl2 = bl3;
        }
        return bl2;
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
        {
        }
    }
}

