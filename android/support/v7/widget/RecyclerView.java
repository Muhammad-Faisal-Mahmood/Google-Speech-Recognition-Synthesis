/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.LayoutTransition
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.os.Trace
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.animation.Interpolator
 *  android.widget.EdgeEffect
 *  android.widget.OverScroller
 */
package android.support.v7.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RecyclerView
extends ViewGroup
implements vg {
    public static final boolean a;
    public static final int ab = 0;
    private static final int[] ac;
    private static final float ad;
    private static final Class[] ae;
    public static final boolean b;
    public static final Interpolator c;
    static final le d;
    boolean A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public EdgeEffect E;
    public kk F;
    public kr G;
    public final int H;
    public final int I;
    public float J;
    public float K;
    public final lf L;
    public jj M;
    public jh N;
    public final ld O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public li S;
    public final int[] T;
    final List U;
    boolean V;
    va W;
    private final int[] aA;
    private final int[] aB;
    private Runnable aC;
    private boolean aD;
    private int aE;
    private int aF;
    private final vb aG;
    private ki aH;
    private AmbientMode$AmbientController aI;
    private final AmbientMode$AmbientController aJ;
    public final bxt aa;
    private final float af;
    private final kx ag = new kx(this);
    private final Rect ah;
    private int ai;
    private boolean aj;
    private int ak;
    private final AccessibilityManager al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private VelocityTracker aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private boolean aw;
    private List ax;
    private final int[] ay;
    private vh az;
    public final kv e = new kv(this);
    public kz f;
    public hd g;
    public in h;
    public boolean i;
    public final Runnable j;
    public final Rect k;
    public final RectF l;
    public kf m;
    public ko n;
    public final List o;
    public final ArrayList p;
    public final ArrayList q;
    public ks r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public List y;
    public boolean z;

    static {
        ac = new int[]{16843830};
        ad = (float)(Math.log(0.78) / Math.log(0.9));
        a = true;
        b = true;
        Class<Integer> clazz = Integer.TYPE;
        ae = new Class[]{Context.class, AttributeSet.class, clazz, clazz};
        c = new yr(1);
        d = new le();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969759);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        Drawable drawable;
        Object object = null;
        this.aa = new bxt(null);
        this.j = new kd(this, 1);
        this.k = new Rect();
        this.ah = new Rect();
        this.l = new RectF();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.ai = 0;
        this.z = false;
        this.A = false;
        this.am = 0;
        this.an = 0;
        this.aH = d;
        this.F = new kk(null);
        this.ao = 0;
        this.ap = -1;
        this.J = Float.MIN_VALUE;
        this.K = Float.MIN_VALUE;
        this.aw = true;
        this.L = new lf(this);
        if (b) {
            object = new jh();
        }
        this.N = object;
        this.O = new ld();
        this.P = false;
        this.Q = false;
        this.aI = new AmbientMode$AmbientController(this);
        this.R = false;
        this.ay = new int[2];
        this.aA = new int[2];
        this.aB = new int[2];
        this.T = new int[2];
        this.U = new ArrayList();
        this.aC = new kd(this, 0);
        this.aE = 0;
        this.aF = 0;
        this.aJ = new AmbientMode$AmbientController(this);
        this.aG = object = new yl(this, 1);
        this.W = new va(this.getContext(), (vb)object);
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        object = ViewConfiguration.get((Context)context);
        this.av = object.getScaledTouchSlop();
        this.J = ag$$ExternalSyntheticApiModelOutline0.m((ViewConfiguration)object);
        this.K = ag$$ExternalSyntheticApiModelOutline0.m$1((ViewConfiguration)object);
        this.H = object.getScaledMinimumFlingVelocity();
        this.I = object.getScaledMaximumFlingVelocity();
        this.af = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        boolean bl2 = this.getOverScrollMode() == 2;
        this.setWillNotDraw(bl2);
        this.F.m = this.aI;
        this.g = new hd(new AmbientMode$AmbientController(this));
        this.h = new in(new AmbientMode$AmbientController(this));
        if (wc.a((View)this) == 0) {
            wc.b((View)this, 8);
        }
        if (this.getImportantForAccessibility() == 0) {
            this.setImportantForAccessibility(1);
        }
        this.al = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.aa(new li(this));
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, et.a, n2, 0);
        wj.l((View)this, context, et.a, attributeSet, typedArray, n2, 0);
        String string = typedArray.getString(8);
        if (typedArray.getInt(2, -1) == -1) {
            this.setDescendantFocusability(262144);
        }
        this.i = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable)typedArray.getDrawable(6);
            drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable)typedArray.getDrawable(4);
            object = typedArray.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && object != null) {
                Resources resources = this.getContext().getResources();
                new jf(this, stateListDrawable, drawable, stateListDrawable2, (Drawable)object, resources.getDimensionPixelSize(2131165506), resources.getDimensionPixelSize(2131165508), resources.getDimensionPixelOffset(2131165507));
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(this.m()));
            }
        }
        typedArray.recycle();
        this.V = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        this.aP(context, string, attributeSet, n2);
        object = ac;
        drawable = context.obtainStyledAttributes(attributeSet, (int[])object, n2, 0);
        wj.l((View)this, context, (int[])object, attributeSet, (TypedArray)drawable, n2, 0);
        bl2 = drawable.getBoolean(0, true);
        drawable.recycle();
        this.setNestedScrollingEnabled(bl2);
        this.setTag(2131427696, true);
    }

    public static void K(View view, Rect rect) {
        kp kp2 = (kp)view.getLayoutParams();
        Rect rect2 = kp2.d;
        rect.set(view.getLeft() - rect2.left - kp2.leftMargin, view.getTop() - rect2.top - kp2.topMargin, view.getRight() + rect2.right + kp2.rightMargin, view.getBottom() + rect2.bottom + kp2.bottomMargin);
    }

    private final int a(int n2, float f2) {
        float f3 = this.getHeight();
        float f4 = this.getWidth();
        float f5 = (float)n2 / f4;
        float f6 = f2 / f3;
        EdgeEffect edgeEffect = this.B;
        f4 = 0.0f;
        f3 = 0.0f;
        f2 = 0.0f;
        if (edgeEffect != null && xm.b(edgeEffect) != 0.0f) {
            if (this.canScrollHorizontally(-1)) {
                this.B.onRelease();
            } else {
                f2 = -xm.c(this.B, -f5, 1.0f - f6);
                if (xm.b(this.B) == 0.0f) {
                    this.B.onRelease();
                }
            }
            this.invalidate();
        } else {
            edgeEffect = this.D;
            f2 = f3;
            if (edgeEffect != null) {
                f2 = f3;
                if (xm.b(edgeEffect) != 0.0f) {
                    if (this.canScrollHorizontally(1)) {
                        this.D.onRelease();
                        f2 = f4;
                    } else {
                        f2 = xm.c(this.D, f5, f6);
                        if (xm.b(this.D) == 0.0f) {
                            this.D.onRelease();
                        }
                    }
                    this.invalidate();
                }
            }
        }
        return Math.round(f2 * (float)this.getWidth());
    }

    private final void aA() {
        this.aJ();
        this.ad(0);
    }

    private final void aB() {
        int n2;
        Object object;
        int n3;
        long l2;
        Object object2 = this.O;
        boolean bl2 = true;
        ((ld)object2).b(1);
        this.J(this.O);
        this.O.i = false;
        this.af();
        this.aa.q();
        this.Q();
        this.aF();
        boolean bl3 = this.aw;
        Object object3 = null;
        object2 = bl3 && this.hasFocus() && this.m != null ? this.getFocusedChild() : null;
        object2 = object2 == null ? object3 : ((object2 = this.l((View)object2)) == null ? object3 : this.i((View)object2));
        if (object2 == null) {
            this.aI();
        } else {
            object3 = this.O;
            l2 = this.m.hasStableIds() ? ((lg)object2).getItemId() : -1L;
            ((ld)object3).m = l2;
            object3 = this.O;
            n3 = this.z ? -1 : (((lg)object2).isRemoved() ? ((lg)object2).mOldPosition : ((lg)object2).getAbsoluteAdapterPosition());
            ((ld)object3).l = n3;
            object = this.O;
            object2 = ((lg)object2).itemView;
            n3 = object2.getId();
            while (!object2.isFocused() && object2 instanceof ViewGroup && object2.hasFocus()) {
                object2 = object3 = ((ViewGroup)object2).getFocusedChild();
                if (object3.getId() == -1) continue;
                n3 = object3.getId();
                object2 = object3;
            }
            ((ld)object).n = n3;
        }
        object2 = this.O;
        if (!((ld)object2).j || !this.Q) {
            bl2 = false;
        }
        ((ld)object2).h = bl2;
        this.Q = false;
        this.P = false;
        ((ld)object2).g = ((ld)object2).k;
        ((ld)object2).e = this.m.getItemCount();
        this.aD(this.ay);
        if (this.O.j) {
            n2 = this.h.a();
            for (n3 = 0; n3 < n2; ++n3) {
                object2 = RecyclerView.j(this.h.e(n3));
                if (((lg)object2).shouldIgnore() || ((lg)object2).isInvalid() && !this.m.hasStableIds()) continue;
                kk.j((lg)object2);
                ((lg)object2).getUnmodifiedPayloads();
                object3 = kk.k((lg)object2);
                this.aa.x((lg)object2, (bvl)object3);
                if (!this.O.h || !((lg)object2).isUpdated() || ((lg)object2).isRemoved() || ((lg)object2).shouldIgnore() || ((lg)object2).isInvalid()) continue;
                l2 = this.e((lg)object2);
                this.aa.p(l2, (lg)object2);
            }
        }
        if (this.O.k) {
            n2 = this.h.c();
            for (n3 = 0; n3 < n2; ++n3) {
                object2 = RecyclerView.j(this.h.f(n3));
                if (((lg)object2).shouldIgnore()) continue;
                ((lg)object2).saveOldPosition();
            }
            object2 = this.O;
            bl2 = ((ld)object2).f;
            ((ld)object2).f = false;
            this.n.o(this.e, (ld)object2);
            this.O.f = bl2;
            for (n3 = 0; n3 < this.h.a(); ++n3) {
                object = RecyclerView.j(this.h.e(n3));
                if (((lg)object).shouldIgnore() || (object2 = (mh)((pa)this.aa.a).get(object)) != null && (((mh)object2).a & 4) != 0) continue;
                kk.j((lg)object);
                bl2 = ((lg)object).hasAnyOfTheFlags(8192);
                ((lg)object).getUnmodifiedPayloads();
                bvl bvl2 = kk.k((lg)object);
                if (bl2) {
                    this.ax((lg)object, bvl2);
                    continue;
                }
                bxt bxt2 = this.aa;
                object2 = object3 = (mh)((pa)bxt2.a).get(object);
                if (object3 == null) {
                    object3 = bxt2.a;
                    object2 = mh.a();
                    ((pa)object3).put(object, object2);
                }
                ((mh)object2).a |= 2;
                ((mh)object2).c = bvl2;
            }
            this.x();
        } else {
            this.x();
        }
        this.R();
        this.ag(false);
        this.O.d = 2;
    }

    private final void aC() {
        this.af();
        this.Q();
        this.O.b(6);
        this.g.e();
        int n2 = this.m.getItemCount();
        ld ld2 = this.O;
        ld2.e = n2;
        ld2.c = 0;
        if (this.f != null && this.m.canRestoreState()) {
            ld2 = this.f.a;
            if (ld2 != null) {
                this.n.U((Parcelable)ld2);
            }
            this.f = null;
        }
        ld2 = this.O;
        ld2.g = false;
        this.n.o(this.e, ld2);
        ld2 = this.O;
        ld2.f = false;
        boolean bl2 = ld2.j && this.F != null;
        ld2.j = bl2;
        ld2.d = 4;
        this.R();
        this.ag(false);
    }

    private final void aD(int[] nArray) {
        int n2 = this.h.a();
        if (n2 != 0) {
            int n3 = Integer.MIN_VALUE;
            int n4 = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < n2; ++i2) {
                lg lg2 = RecyclerView.j(this.h.e(i2));
                int n5 = n3;
                int n6 = n4;
                if (!lg2.shouldIgnore()) {
                    int n7 = lg2.getLayoutPosition();
                    int n8 = n4;
                    if (n7 < n4) {
                        n8 = n7;
                    }
                    n5 = n3;
                    n6 = n8;
                    if (n7 > n3) {
                        n6 = n8;
                        n5 = n7;
                    }
                }
                n3 = n5;
                n4 = n6;
            }
            nArray[0] = n4;
            nArray[1] = n3;
            return;
        }
        nArray[0] = -1;
        nArray[1] = -1;
    }

    private final void aE(MotionEvent motionEvent) {
        int n2 = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(n2) == this.ap) {
            int n3;
            n2 = n2 == 0 ? 1 : 0;
            this.ap = motionEvent.getPointerId(n2);
            this.at = n3 = (int)(motionEvent.getX(n2) + 0.5f);
            this.ar = n3;
            this.au = n2 = (int)(motionEvent.getY(n2) + 0.5f);
            this.as = n2;
        }
    }

    private final void aF() {
        if (this.z) {
            this.g.j();
            if (this.A) {
                this.n.y();
            }
        }
        if (this.aN()) {
            this.g.g();
        } else {
            this.g.e();
        }
        boolean bl2 = this.P;
        boolean bl3 = true;
        boolean bl4 = bl2 || this.Q;
        ld ld2 = this.O;
        bl2 = !(!this.u || this.F == null || !(bl2 = this.z) && !bl4 && !this.n.v || bl2 && !this.m.hasStableIds());
        ld2.j = bl2;
        ld2 = this.O;
        bl2 = ld2.j && bl4 && !this.z && this.aN() ? bl3 : false;
        ld2.k = bl2;
    }

    private final void aG() {
        boolean bl2;
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl2 = this.B.isFinished();
        } else {
            bl2 = false;
        }
        edgeEffect = this.C;
        boolean bl3 = bl2;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl3 = bl2 | this.C.isFinished();
        }
        edgeEffect = this.D;
        bl2 = bl3;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl2 = bl3 | this.D.isFinished();
        }
        edgeEffect = this.E;
        bl3 = bl2;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            bl3 = bl2 | this.E.isFinished();
        }
        if (bl3) {
            this.postInvalidateOnAnimation();
        }
    }

    private final void aH(View view, View view2) {
        ko ko2;
        Object object = view2 != null ? view2 : view;
        this.k.set(0, 0, object.getWidth(), object.getHeight());
        object = object.getLayoutParams();
        if (object instanceof kp) {
            object = (kp)((Object)object);
            if (!object.e) {
                object = object.d;
                ko2 = this.k;
                ((Rect)ko2).left -= object.left;
                ko2 = this.k;
                ((Rect)ko2).right += object.right;
                ko2 = this.k;
                ((Rect)ko2).top -= object.top;
                ko2 = this.k;
                ((Rect)ko2).bottom += object.bottom;
            }
        }
        if (view2 != null) {
            this.offsetDescendantRectToMyCoords(view2, this.k);
            this.offsetRectIntoDescendantCoords(view, this.k);
        } else {
            view2 = null;
        }
        ko2 = this.n;
        object = this.k;
        boolean bl2 = this.u;
        boolean bl3 = view2 == null;
        ko2.bb(this, view, (Rect)object, bl2 ^ true, bl3);
    }

    private final void aI() {
        ld ld2 = this.O;
        ld2.m = -1L;
        ld2.l = -1;
        ld2.n = -1;
    }

    private final void aJ() {
        VelocityTracker velocityTracker = this.aq;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        this.ah(0);
        this.aG();
    }

    private final void aK(int n2) {
        int n3;
        int n4 = n3 = this.n.Y();
        if (this.n.Z()) {
            n4 = n3 | 2;
        }
        this.aw(n4, n2);
    }

    private final void aL() {
        this.L.d();
        Object object = this.n;
        if (object != null && (object = ((ko)object).u) != null) {
            ((lc)object).d();
        }
    }

    private final boolean aM(MotionEvent motionEvent) {
        Object object = this.q;
        int n2 = motionEvent.getAction();
        int n3 = ((ArrayList)object).size();
        for (int i2 = 0; i2 < n3; ++i2) {
            object = (ks)this.q.get(i2);
            if (!object.i(motionEvent) || n2 == 3) continue;
            this.r = object;
            return true;
        }
        return false;
    }

    private final boolean aN() {
        return this.F != null && this.n.v();
    }

    private final boolean aO(EdgeEffect edgeEffect, int n2, int n3) {
        if (n2 > 0) {
            return true;
        }
        float f2 = xm.b(edgeEffect);
        float f3 = n3;
        double d2 = Math.log((float)Math.abs(-n2) * 0.35f / (this.af * 0.015f));
        double d3 = ad;
        float f4 = this.af;
        return (float)((double)(f4 * 0.015f) * Math.exp((d3 /= -1.0 + d3) * d2)) < f2 * f3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void aP(Context object, String charSequence, AttributeSet attributeSet, int n2) {
        Object object2;
        if (charSequence != null && !(object2 = ((String)charSequence).trim()).isEmpty()) {
            block17: {
                Constructor<ko> constructor;
                if (object2.charAt(0) == '.') {
                    charSequence = String.valueOf(object.getPackageName()).concat(String.valueOf(object2));
                } else {
                    charSequence = object2;
                    if (!object2.contains(".")) {
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(RecyclerView.class.getPackage().getName());
                        ((StringBuilder)charSequence).append('.');
                        ((StringBuilder)charSequence).append((String)object2);
                        charSequence = ((StringBuilder)charSequence).toString();
                    }
                }
                try {
                    object2 = this.isInEditMode() ? this.getClass().getClassLoader() : object.getClassLoader();
                    Class<ko> clazz = Class.forName((String)charSequence, false, (ClassLoader)object2).asSubclass(ko.class);
                    try {
                        constructor = clazz.getConstructor(ae);
                        object2 = new Object[4];
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        object2 = null;
                        try {
                            object = clazz.getConstructor(null);
                            break block17;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            noSuchMethodException2.initCause(noSuchMethodException);
                            object2 = new IllegalStateException(a.al((String)charSequence, attributeSet, ": Error creating LayoutManager "), noSuchMethodException2);
                            throw object2;
                        }
                    }
                }
                catch (ClassCastException classCastException) {
                    throw new IllegalStateException(a.al((String)charSequence, attributeSet, ": Class is not a LayoutManager "), classCastException);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new IllegalStateException(a.al((String)charSequence, attributeSet, ": Cannot access non-public constructor "), illegalAccessException);
                }
                catch (InstantiationException instantiationException) {
                    throw new IllegalStateException(a.al((String)charSequence, attributeSet, ": Could not instantiate the LayoutManager: "), instantiationException);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw new IllegalStateException(a.al((String)charSequence, attributeSet, ": Could not instantiate the LayoutManager: "), invocationTargetException);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw new IllegalStateException(a.al((String)charSequence, attributeSet, ": Unable to find LayoutManager "), classNotFoundException);
                }
                object2[0] = object;
                object2[1] = attributeSet;
                {
                    object2[2] = n2;
                    object2[3] = 0;
                    object = constructor;
                }
            }
            ((Constructor)object).setAccessible(true);
            this.ac((ko)((Constructor)object).newInstance(object2));
            return;
        }
    }

    public static /* synthetic */ boolean aj(RecyclerView recyclerView) {
        return recyclerView.awakenScrollBars();
    }

    public static final int ar(int n2, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int n3) {
        if (n2 > 0 && edgeEffect != null && xm.b(edgeEffect) != 0.0f) {
            float f2 = -n2;
            float f3 = n3;
            if ((n3 = Math.round((float)(-n3) / 4.0f * xm.c(edgeEffect, f2 * 4.0f / f3, 0.5f))) != n2) {
                edgeEffect.finish();
            }
            return n2 - n3;
        }
        int n4 = n2;
        if (n2 < 0) {
            n4 = n2;
            if (edgeEffect2 != null) {
                n4 = n2;
                if (xm.b(edgeEffect2) != 0.0f) {
                    float f4 = n3;
                    float f5 = n2;
                    if ((n3 = Math.round(f4 / 4.0f * xm.c(edgeEffect2, f5 * 4.0f / f4, 0.5f))) != n2) {
                        edgeEffect2.finish();
                    }
                    n4 = n2 - n3;
                }
            }
        }
        return n4;
    }

    public static final long as() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    private final int ay(int n2, float f2) {
        float f3 = this.getWidth();
        float f4 = this.getHeight();
        float f5 = (float)n2 / f4;
        float f6 = f2 / f3;
        EdgeEffect edgeEffect = this.C;
        f4 = 0.0f;
        f3 = 0.0f;
        f2 = 0.0f;
        if (edgeEffect != null && xm.b(edgeEffect) != 0.0f) {
            if (this.canScrollVertically(-1)) {
                this.C.onRelease();
            } else {
                f2 = -xm.c(this.C, -f5, f6);
                if (xm.b(this.C) == 0.0f) {
                    this.C.onRelease();
                }
            }
            this.invalidate();
        } else {
            edgeEffect = this.E;
            f2 = f3;
            if (edgeEffect != null) {
                f2 = f3;
                if (xm.b(edgeEffect) != 0.0f) {
                    if (this.canScrollVertically(1)) {
                        this.E.onRelease();
                        f2 = f4;
                    } else {
                        f2 = xm.c(this.E, f5, 1.0f - f6);
                        if (xm.b(this.E) == 0.0f) {
                            this.E.onRelease();
                        }
                    }
                    this.invalidate();
                }
            }
        }
        return Math.round(f2 * (float)this.getHeight());
    }

    private final vh az() {
        if (this.az == null) {
            this.az = new vh((View)this);
        }
        return this.az;
    }

    public static lg j(View view) {
        if (view == null) {
            return null;
        }
        return ((kp)view.getLayoutParams()).c;
    }

    public static RecyclerView k(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView)view;
            }
            view = (ViewGroup)view;
            int n2 = view.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                RecyclerView recyclerView = RecyclerView.k(view.getChildAt(i2));
                if (recyclerView == null) continue;
                return recyclerView;
            }
        }
        return null;
    }

    public static /* synthetic */ void n(RecyclerView recyclerView, View view, int n2, ViewGroup.LayoutParams layoutParams) {
        recyclerView.attachViewToParent(view, n2, layoutParams);
    }

    public static /* synthetic */ void o(RecyclerView recyclerView, int n2) {
        recyclerView.detachViewFromParent(n2);
    }

    public static /* synthetic */ void p(RecyclerView recyclerView, View view, int n2, ViewGroup.LayoutParams layoutParams) {
        recyclerView.attachViewToParent(view, n2, layoutParams);
    }

    public static /* synthetic */ void q(RecyclerView recyclerView, View view) {
        recyclerView.detachViewFromParent(view);
    }

    public static /* synthetic */ void r(RecyclerView recyclerView, int n2, int n3) {
        recyclerView.setMeasuredDimension(n2, n3);
    }

    public static void w(lg lg2) {
        block4: {
            WeakReference weakReference = lg2.mNestedRecyclerView;
            if (weakReference != null) {
                weakReference = (View)weakReference.get();
                while (weakReference != null) {
                    if (weakReference != lg2.itemView) {
                        if ((weakReference = weakReference.getParent()) instanceof View) {
                            weakReference = (View)weakReference;
                            continue;
                        }
                        weakReference = null;
                        continue;
                    }
                    break block4;
                }
                lg2.mNestedRecyclerView = null;
            }
        }
    }

    public final void A(int n2, int n3) {
        int n4 = this.getPaddingLeft();
        int n5 = this.getPaddingRight();
        int[] nArray = wj.a;
        this.setMeasuredDimension(ko.an(n2, n4 + n5, this.getMinimumWidth()), ko.an(n3, this.getPaddingTop() + this.getPaddingBottom(), this.getMinimumHeight()));
    }

    public final void B(View object) {
        object = RecyclerView.j((View)object);
        kf kf2 = this.m;
        if (kf2 != null && object != null) {
            kf2.onViewDetachedFromWindow((lg)object);
        }
        if ((object = this.y) != null) {
            int n2 = object.size();
            while (--n2 >= 0) {
                ((kq)this.y.get(n2)).b();
            }
        }
    }

    final void C() {
        Object object;
        Object object2;
        Object object3;
        long l2;
        if (this.m == null) {
            Log.w((String)"RecyclerView", (String)"No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            Log.e((String)"RecyclerView", (String)"No layout manager attached; skipping layout");
            return;
        }
        Object object4 = this.O;
        Object object5 = 0;
        ((ld)object4).i = false;
        Object object6 = this.aD && (this.aE != this.getWidth() || this.aF != this.getHeight()) ? 1 : 0;
        this.aE = 0;
        this.aF = 0;
        this.aD = false;
        if (this.O.d == 1) {
            this.aB();
            this.n.aT(this);
            this.aC();
        } else {
            object4 = this.g;
            if ((((hd)object4).b.isEmpty() || ((hd)object4).a.isEmpty()) && object6 == 0 && this.n.D == this.getWidth() && this.n.E == this.getHeight()) {
                this.n.aT(this);
            } else {
                this.n.aT(this);
                this.aC();
            }
        }
        this.O.b(4);
        this.af();
        this.Q();
        object4 = this.O;
        ((ld)object4).d = 1;
        boolean bl2 = ((ld)object4).j;
        Object var12_5 = null;
        if (bl2) {
            int n2;
            Object object7;
            for (object6 = this.h.a() - 1; object6 >= 0; --object6) {
                object4 = RecyclerView.j(this.h.e((int)object6));
                if (((lg)object4).shouldIgnore()) continue;
                l2 = this.e((lg)object4);
                object7 = new bvl();
                ((bvl)object7).d((lg)object4);
                object3 = (lg)((ox)this.aa.b).c(l2);
                if (object3 != null && !((lg)object3).shouldIgnore()) {
                    boolean bl3 = this.aa.t((lg)object3);
                    bl2 = this.aa.t((lg)object4);
                    if (bl3 && object3 == object4) {
                        this.aa.w((lg)object4, (bvl)object7);
                        continue;
                    }
                    object2 = this.aa.v((lg)object3, 4);
                    this.aa.w((lg)object4, (bvl)object7);
                    object7 = this.aa.v((lg)object4, 8);
                    if (object2 == null) {
                        n2 = this.h.a();
                        for (object = 0; object < n2; ++object) {
                            object2 = RecyclerView.j(this.h.e((int)object));
                            if (object2 == object4 || this.e((lg)object2) != l2) continue;
                            object3 = this.m;
                            if (object3 != null && ((kf)object3).hasStableIds()) {
                                object3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                ((StringBuilder)object3).append(object2);
                                ((StringBuilder)object3).append(" \n View Holder 2:");
                                ((StringBuilder)object3).append(object4);
                                ((StringBuilder)object3).append(this.m());
                                throw new IllegalStateException(((StringBuilder)object3).toString());
                            }
                            object3 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                            ((StringBuilder)object3).append(object2);
                            ((StringBuilder)object3).append(" \n View Holder 2:");
                            ((StringBuilder)object3).append(object4);
                            ((StringBuilder)object3).append(this.m());
                            throw new IllegalStateException(((StringBuilder)object3).toString());
                        }
                        object2 = new StringBuilder("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
                        ((StringBuilder)object2).append(object3);
                        ((StringBuilder)object2).append(" cannot be found but it is necessary for ");
                        ((StringBuilder)object2).append(object4);
                        ((StringBuilder)object2).append(this.m());
                        Log.e((String)"RecyclerView", (String)((StringBuilder)object2).toString());
                        continue;
                    }
                    ((lg)object3).setIsRecyclable(false);
                    if (bl3) {
                        this.s((lg)object3);
                    }
                    if (object3 != object4) {
                        if (bl2) {
                            this.s((lg)object4);
                        }
                        ((lg)object3).mShadowedHolder = object4;
                        this.s((lg)object3);
                        this.e.m((lg)object3);
                        ((lg)object4).setIsRecyclable(false);
                        ((lg)object4).mShadowingHolder = object3;
                    }
                    if (!this.F.l((lg)object3, (lg)object4, (bvl)object2, (bvl)object7)) continue;
                    this.T();
                    continue;
                }
                this.aa.w((lg)object4, (bvl)object7);
            }
            object3 = this.aa;
            object7 = this.aJ;
            for (object6 = ((pa)((bxt)object3).a).f - 1; object6 >= 0; --object6) {
                bvl bvl2;
                object2 = (lg)((pa)((bxt)object3).a).d((int)object6);
                object4 = (mh)((pa)((bxt)object3).a).e((int)object6);
                object = ((mh)object4).a;
                if ((object & 3) == 3) {
                    ((AmbientMode$AmbientController)object7).v((lg)object2);
                } else if ((object & 1) != 0) {
                    bvl2 = ((mh)object4).c;
                    if (bvl2 == null) {
                        ((AmbientMode$AmbientController)object7).v((lg)object2);
                    } else {
                        ((AmbientMode$AmbientController)object7).x((lg)object2, bvl2, ((mh)object4).d);
                    }
                } else if ((object & 0xE) == 14) {
                    ((AmbientMode$AmbientController)object7).w((lg)object2, ((mh)object4).c, ((mh)object4).d);
                } else if ((object & 0xC) == 12) {
                    bvl bvl3 = ((mh)object4).c;
                    bvl2 = ((mh)object4).d;
                    ((lg)object2).setIsRecyclable(false);
                    Object object8 = (RecyclerView)((AmbientMode$AmbientController)object7).a;
                    if (((RecyclerView)object8).z) {
                        if (((RecyclerView)object8).F.l((lg)object2, (lg)object2, bvl3, bvl2)) {
                            ((RecyclerView)((AmbientMode$AmbientController)object7).a).T();
                        }
                    } else {
                        object8 = ((RecyclerView)object8).F;
                        object = bvl3.b;
                        n2 = bvl2.b;
                        if (object == n2 && bvl3.a == bvl2.a) {
                            ((kk)object8).a((lg)object2);
                        } else if (((kk)object8).g((lg)object2, (int)object, bvl3.a, n2, bvl2.a)) {
                            ((RecyclerView)((AmbientMode$AmbientController)object7).a).T();
                        }
                    }
                } else if ((object & 4) != 0) {
                    ((AmbientMode$AmbientController)object7).x((lg)object2, ((mh)object4).c, null);
                } else if ((object & 8) != 0) {
                    ((AmbientMode$AmbientController)object7).w((lg)object2, ((mh)object4).c, ((mh)object4).d);
                }
                mh.b((mh)object4);
            }
        }
        this.n.aO(this.e);
        object4 = this.O;
        ((ld)object4).b = ((ld)object4).e;
        this.z = false;
        this.A = false;
        ((ld)object4).j = false;
        ((ld)object4).k = false;
        this.n.v = false;
        object4 = this.e.b;
        if (object4 != null) {
            ((ArrayList)object4).clear();
        }
        object4 = this.n;
        if (((ko)object4).A) {
            ((ko)object4).z = 0;
            ((ko)object4).A = false;
            this.e.n();
        }
        this.n.p(this.O);
        this.R();
        this.ag(false);
        this.aa.q();
        object4 = this.ay;
        object6 = object4[0];
        object = object4[1];
        this.aD((int[])object4);
        object4 = this.ay;
        if (object4[0] != object6 || object4[1] != object) {
            this.E(0, 0);
        }
        if (this.aw && this.m != null && this.hasFocus() && this.getDescendantFocusability() != 393216 && (this.getDescendantFocusability() != 131072 || !this.isFocused()) && (this.isFocused() || this.h.k((View)(object4 = this.getFocusedChild())))) {
            block60: {
                block59: {
                    if (this.O.m != -1L && this.m.hasStableIds()) {
                        l2 = this.O.m;
                        object4 = this.m;
                        if (object4 != null && ((kf)object4).hasStableIds()) {
                            object = this.h.c();
                            object6 = 0;
                            object4 = null;
                            while (true) {
                                object3 = object4;
                                if (object6 >= object) break block59;
                                object2 = RecyclerView.j(this.h.f((int)object6));
                                object3 = object4;
                                if (object2 != null) {
                                    object3 = object4;
                                    if (!((lg)object2).isRemoved()) {
                                        object3 = object4;
                                        if (((lg)object2).getItemId() == l2) {
                                            if (!this.h.k(((lg)object2).itemView)) {
                                                object3 = object2;
                                                break block59;
                                            }
                                            object3 = object2;
                                        }
                                    }
                                }
                                ++object6;
                                object4 = object3;
                            }
                        }
                    }
                    object3 = null;
                }
                if (object3 != null && !this.h.k(((lg)object3).itemView) && ((lg)object3).itemView.hasFocusable()) {
                    object4 = ((lg)object3).itemView;
                } else {
                    object4 = var12_5;
                    if (this.h.a() > 0) {
                        object4 = this.O;
                        object6 = ((ld)object4).l;
                        if (object6 == -1) {
                            object6 = object5;
                        }
                        object5 = ((ld)object4).a();
                        for (object = object6; object < object5 && (object4 = this.h((int)object)) != null; ++object) {
                            if (!((lg)object4).itemView.hasFocusable()) continue;
                            object4 = ((lg)object4).itemView;
                            break block60;
                        }
                        object6 = Math.min(object5, object6) - 1;
                        while (true) {
                            object4 = var12_5;
                            if (object6 < 0) break;
                            object4 = this.h((int)object6);
                            if (object4 == null) {
                                object4 = var12_5;
                                break;
                            }
                            if (((lg)object4).itemView.hasFocusable()) {
                                object4 = ((lg)object4).itemView;
                                break;
                            }
                            --object6;
                        }
                    }
                }
            }
            if (object4 != null) {
                object6 = this.O.n;
                object3 = object4;
                if ((long)object6 != -1L) {
                    object2 = object4.findViewById(object6);
                    object3 = object4;
                    if (object2 != null) {
                        object3 = object4;
                        if (object2.isFocusable()) {
                            object3 = object2;
                        }
                    }
                }
                object3.requestFocus();
            }
        }
        this.aI();
    }

    public final void D(int n2, int n3, int n4, int n5, int[] nArray, int n6, int[] nArray2) {
        this.az().g(n2, n3, n4, n5, nArray, n6, nArray2);
    }

    public final void E(int n2, int n3) {
        ++this.an;
        int n4 = this.getScrollX();
        int n5 = this.getScrollY();
        this.onScrollChanged(n4, n5, n4 - n2, n5 - n3);
        List list = this.ax;
        if (list != null) {
            n5 = list.size();
            while (--n5 >= 0) {
                ((kt)this.ax.get(n5)).a(this, n2, n3);
            }
        }
        --this.an;
    }

    public final void F() {
        EdgeEffect edgeEffect;
        if (this.E != null) {
            return;
        }
        this.E = edgeEffect = this.aH.b(this);
        if (this.i) {
            edgeEffect.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public final void G() {
        EdgeEffect edgeEffect;
        if (this.B != null) {
            return;
        }
        this.B = edgeEffect = this.aH.b(this);
        if (this.i) {
            edgeEffect.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    public final void H() {
        EdgeEffect edgeEffect;
        if (this.D != null) {
            return;
        }
        this.D = edgeEffect = this.aH.b(this);
        if (this.i) {
            edgeEffect.setSize(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
            return;
        }
        edgeEffect.setSize(this.getMeasuredHeight(), this.getMeasuredWidth());
    }

    public final void I() {
        EdgeEffect edgeEffect;
        if (this.C != null) {
            return;
        }
        this.C = edgeEffect = this.aH.b(this);
        if (this.i) {
            edgeEffect.setSize(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
            return;
        }
        edgeEffect.setSize(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    final void J(ld ld2) {
        if (this.ao == 2) {
            OverScroller overScroller = this.L.a;
            ld2.o = overScroller.getFinalX() - overScroller.getCurrX();
            ld2.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        ld2.o = 0;
        ld2.p = 0;
    }

    final void L() {
        this.E = null;
        this.C = null;
        this.D = null;
        this.B = null;
    }

    public void M() {
        if (this.p.size() == 0) {
            return;
        }
        ko ko2 = this.n;
        if (ko2 != null) {
            ko2.Q("Cannot invalidate item decorations during a scroll or layout");
        }
        this.O();
        this.requestLayout();
    }

    public final void N(int n2) {
        if (this.n == null) {
            return;
        }
        this.ad(2);
        this.n.V(n2);
        this.awakenScrollBars();
    }

    final void O() {
        int n2;
        int n3 = this.h.c();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            ((kp)this.h.f((int)n2).getLayoutParams()).e = true;
        }
        kv kv2 = this.e;
        n3 = kv2.c.size();
        for (n2 = n4; n2 < n3; ++n2) {
            kp kp2 = (kp)((lg)kv2.c.get((int)n2)).itemView.getLayoutParams();
            if (kp2 == null) continue;
            kp2.e = true;
        }
    }

    public final void P(int n2, int n3, boolean bl2) {
        int n4;
        lg lg2;
        int n5;
        int n6 = this.h.c();
        int n7 = 0;
        while (true) {
            n5 = n2 + n3;
            if (n7 >= n6) break;
            lg2 = RecyclerView.j(this.h.f(n7));
            if (lg2 != null && !lg2.shouldIgnore()) {
                n4 = lg2.mPosition;
                if (n4 >= n5) {
                    lg2.offsetPosition(-n3, bl2);
                    this.O.f = true;
                } else if (n4 >= n2) {
                    lg2.flagRemovedAndOffsetPosition(n2 - 1, -n3, bl2);
                    this.O.f = true;
                }
            }
            ++n7;
        }
        kv kv2 = this.e;
        n7 = kv2.c.size();
        while ((n6 = n7 - 1) >= 0) {
            lg2 = (lg)kv2.c.get(n6);
            n7 = n6;
            if (lg2 == null) continue;
            n4 = lg2.mPosition;
            if (n4 >= n5) {
                lg2.offsetPosition(-n3, bl2);
                n7 = n6;
                continue;
            }
            n7 = n6;
            if (n4 < n2) continue;
            lg2.addFlags(8);
            kv2.i(n6);
            n7 = n6;
        }
        this.requestLayout();
    }

    public final void Q() {
        ++this.am;
    }

    final void R() {
        this.S(true);
    }

    public final void S(boolean bl2) {
        int n2;
        this.am = n2 = this.am - 1;
        if (n2 <= 0) {
            this.am = 0;
            if (bl2) {
                Object object;
                n2 = this.ak;
                this.ak = 0;
                if (n2 != 0 && this.ao()) {
                    object = AccessibilityEvent.obtain();
                    object.setEventType(2048);
                    object.setContentChangeTypes(n2);
                    this.sendAccessibilityEventUnchecked((AccessibilityEvent)object);
                }
                for (n2 = this.U.size() - 1; n2 >= 0; --n2) {
                    int n3;
                    object = (lg)this.U.get(n2);
                    if (((lg)object).itemView.getParent() != this || ((lg)object).shouldIgnore() || (n3 = ((lg)object).mPendingAccessibilityState) == -1) continue;
                    ((lg)object).itemView.setImportantForAccessibility(n3);
                    ((lg)object).mPendingAccessibilityState = -1;
                }
                this.U.clear();
            }
        }
    }

    public final void T() {
        if (!this.R && this.s) {
            Runnable runnable = this.aC;
            int[] nArray = wj.a;
            this.postOnAnimation(runnable);
            this.R = true;
        }
    }

    public final void U(boolean bl2) {
        Object object;
        Object object2;
        int n2;
        this.A = bl2 | this.A;
        this.z = true;
        int n3 = this.h.c();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            object2 = RecyclerView.j(this.h.f(n2));
            if (object2 == null || ((lg)object2).shouldIgnore()) continue;
            ((lg)object2).addFlags(6);
        }
        this.O();
        object2 = this.e;
        n3 = ((kv)object2).c.size();
        for (n2 = n4; n2 < n3; ++n2) {
            object = (lg)((kv)object2).c.get(n2);
            if (object == null) continue;
            ((lg)object).addFlags(6);
            ((lg)object).addChangePayload(null);
        }
        object = ((kv)object2).f.m;
        if (object != null && ((kf)object).hasStableIds()) {
            return;
        }
        ((kv)object2).h();
    }

    public final void V() {
        Object object = this.F;
        if (object != null) {
            ((kk)object).e();
        }
        if ((object = this.n) != null) {
            ((ko)object).aN(this.e);
            this.n.aO(this.e);
        }
        this.e.d();
    }

    public final void W(kl kl2) {
        ko ko2 = this.n;
        if (ko2 != null) {
            ko2.Q("Cannot remove item decoration during a scroll  or layout");
        }
        this.p.remove(kl2);
        if (this.p.isEmpty()) {
            boolean bl2 = this.getOverScrollMode() == 2;
            this.setWillNotDraw(bl2);
        }
        this.O();
        this.requestLayout();
    }

    public final void X(kt kt2) {
        List list = this.ax;
        if (list != null) {
            list.remove(kt2);
        }
    }

    public final void Y(int n2, int n3, int[] nArray) {
        this.af();
        this.Q();
        Trace.beginSection((String)"RV Scroll");
        this.J(this.O);
        n2 = n2 != 0 ? this.n.d(n2, this.e, this.O) : 0;
        n3 = n3 != 0 ? this.n.e(n3, this.e, this.O) : 0;
        Trace.endSection();
        int n4 = this.h.a();
        for (int i2 = 0; i2 < n4; ++i2) {
            View view = this.h.e(i2);
            lg lg2 = this.i(view);
            if (lg2 == null || (lg2 = lg2.mShadowingHolder) == null) continue;
            int n5 = view.getLeft();
            int n6 = view.getTop();
            view = lg2.itemView;
            if (n5 == view.getLeft() && n6 == view.getTop()) continue;
            view.layout(n5, n6, view.getWidth() + n5, view.getHeight() + n6);
        }
        this.R();
        this.ag(false);
        if (nArray != null) {
            nArray[0] = n2;
            nArray[1] = n3;
        }
    }

    public void Z(int n2) {
        if (this.w) {
            return;
        }
        this.ai();
        ko ko2 = this.n;
        if (ko2 == null) {
            Log.e((String)"RecyclerView", (String)"Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        ko2.V(n2);
        this.awakenScrollBars();
    }

    public final void aa(li li2) {
        this.S = li2;
        wj.m((View)this, li2);
    }

    public void ab(kf object) {
        this.suppressLayout(false);
        Object object2 = this.m;
        if (object2 != null) {
            ((kf)object2).unregisterAdapterDataObserver(this.ag);
            this.m.onDetachedFromRecyclerView(this);
        }
        this.V();
        this.g.j();
        Object object3 = this.m;
        this.m = object;
        if (object != null) {
            ((kf)object).registerAdapterDataObserver(this.ag);
            ((kf)object).onAttachedToRecyclerView(this);
        }
        if ((object = this.n) != null) {
            ((ko)object).bo();
        }
        object = this.e;
        kf kf2 = this.m;
        ((kv)object).d();
        ((kv)object).f((kf)object3, true);
        object2 = ((kv)object).p();
        if (object3 != null) {
            --((htf)object2).b;
        }
        if (((htf)object2).b == 0) {
            for (int i2 = 0; i2 < ((SparseArray)((htf)object2).c).size(); ++i2) {
                object3 = (ku)((SparseArray)((htf)object2).c).valueAt(i2);
                ArrayList arrayList = ((ku)object3).a;
                int n2 = arrayList.size();
                for (int i3 = 0; i3 < n2; ++i3) {
                    wa.v(((lg)arrayList.get((int)i3)).itemView);
                }
                ((ku)object3).a.clear();
            }
        }
        if (kf2 != null) {
            ++((htf)object2).b;
        }
        ((kv)object).e();
        this.O.f = true;
        this.U(false);
        this.requestLayout();
    }

    public final void ac(ko ko2) {
        Object object;
        if (ko2 == this.n) {
            return;
        }
        this.ai();
        if (this.n != null) {
            object = this.F;
            if (object != null) {
                ((kk)object).e();
            }
            this.n.aN(this.e);
            this.n.aO(this.e);
            this.e.d();
            if (this.s) {
                this.n.br(this);
            }
            this.n.aX(null);
            this.n = null;
        } else {
            this.e.d();
        }
        object = this.h;
        ((in)object).a.d();
        int n2 = ((in)object).b.size();
        while (--n2 >= 0) {
            ((in)object).e.t((View)((in)object).b.get(n2));
            ((in)object).b.remove(n2);
        }
        object = ((in)object).e;
        int n3 = ((AmbientMode$AmbientController)object).q();
        for (n2 = 0; n2 < n3; ++n2) {
            View view = ((AmbientMode$AmbientController)object).s(n2);
            ((RecyclerView)((AmbientMode$AmbientController)object).a).B(view);
            view.clearAnimation();
        }
        ((RecyclerView)((AmbientMode$AmbientController)object).a).removeAllViews();
        this.n = ko2;
        if (ko2 != null) {
            if (ko2.t == null) {
                this.n.aX(this);
                if (this.s) {
                    this.n.bd();
                }
            } else {
                object = new StringBuilder("LayoutManager ");
                ((StringBuilder)object).append(ko2);
                ((StringBuilder)object).append(" is already attached to a RecyclerView:");
                ((StringBuilder)object).append(ko2.t.m());
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
        }
        this.e.n();
        this.requestLayout();
    }

    public final void ad(int n2) {
        if (n2 != this.ao) {
            Object object;
            this.ao = n2;
            if (n2 != 2) {
                this.aL();
            }
            if ((object = this.n) != null) {
                ((ko)object).aM(n2);
            }
            if ((object = this.ax) != null) {
                int n3 = object.size();
                while (--n3 >= 0) {
                    ((kt)this.ax.get(n3)).b(n2);
                }
            }
        }
    }

    public final void ae(int n2) {
        if (this.w) {
            return;
        }
        ko ko2 = this.n;
        if (ko2 == null) {
            Log.e((String)"RecyclerView", (String)"Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        ko2.am(this, n2);
    }

    public final void af() {
        int n2;
        this.ai = n2 = this.ai + 1;
        if (n2 == 1 && !this.w) {
            this.v = false;
        }
    }

    public final void ag(boolean bl2) {
        int n2;
        int n3 = n2 = this.ai;
        if (n2 <= 0) {
            this.ai = 1;
            n3 = 1;
        }
        if (!bl2 && !this.w) {
            this.v = false;
        }
        if (n3 == 1) {
            if (bl2 && this.v && !this.w && this.n != null && this.m != null) {
                this.C();
            }
            if (!this.w) {
                this.v = false;
            }
        }
        --this.ai;
    }

    public final void ah(int n2) {
        this.az().b(n2);
    }

    public final void ai() {
        this.ad(0);
        this.aL();
    }

    public final boolean ak(int n2, int n3, int[] nArray, int[] nArray2, int n4) {
        return this.az().e(n2, n3, nArray, nArray2, n4);
    }

    public final boolean al(int n2, int n3) {
        return this.am(n2, n3, this.H, this.I);
    }

    /*
     * Unable to fully structure code
     */
    public final boolean am(int var1_1, int var2_2, int var3_3, int var4_4) {
        block38: {
            block39: {
                block33: {
                    block32: {
                        block36: {
                            block37: {
                                block31: {
                                    block34: {
                                        block35: {
                                            var14_5 = this.n;
                                            if (var14_5 == null) {
                                                Log.e((String)"RecyclerView", (String)"Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                                return false;
                                            }
                                            if (this.w) {
                                                return false;
                                            }
                                            var12_6 = var14_5.Y();
                                            var13_7 = var14_5.Z();
                                            var7_8 = var12_6 && Math.abs(var1_1) >= var3_3 ? var1_1 : 0;
                                            var1_1 = var13_7 && Math.abs(var2_2) >= var3_3 ? var2_2 : 0;
                                            var2_2 = var7_8;
                                            if (var7_8 == 0) {
                                                if (var1_1 != 0) {
                                                    var2_2 = 0;
                                                } else {
                                                    return false;
                                                }
                                            }
                                            if (var2_2 == 0) break block34;
                                            var14_5 = this.B;
                                            if (var14_5 == null || xm.b((EdgeEffect)var14_5) == 0.0f) break block35;
                                            var14_5 = this.B;
                                            var7_8 = -var2_2;
                                            var3_3 = var2_2;
                                            if (!this.aO((EdgeEffect)var14_5, var7_8, this.getWidth())) ** GOTO lbl28
                                            this.B.onAbsorb(var7_8);
lbl26:
                                            // 2 sources

                                            while (true) {
                                                var3_3 = 0;
lbl28:
                                                // 3 sources

                                                while (true) {
                                                    var2_2 = 0;
                                                    break block31;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        var14_5 = this.D;
                                        if (var14_5 != null && xm.b((EdgeEffect)var14_5) != 0.0f) {
                                            var3_3 = var2_2;
                                            if (!this.aO(this.D, var2_2, this.getWidth())) ** continue;
                                            this.D.onAbsorb(var2_2);
                                            ** continue;
                                        }
                                    }
                                    var3_3 = 0;
                                }
                                if (var1_1 == 0) break block36;
                                var14_5 = this.C;
                                if (var14_5 == null || xm.b((EdgeEffect)var14_5) == 0.0f) break block37;
                                var14_5 = this.C;
                                var8_9 = -var1_1;
                                var7_8 = var1_1;
                                if (!this.aO((EdgeEffect)var14_5, var8_9, this.getHeight())) ** GOTO lbl51
                                this.C.onAbsorb(var8_9);
lbl49:
                                // 2 sources

                                while (true) {
                                    var7_8 = 0;
lbl51:
                                    // 3 sources

                                    while (true) {
                                        var8_9 = 0;
                                        var1_1 = var7_8;
                                        var7_8 = var8_9;
                                        break block32;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var14_5 = this.E;
                            if (var14_5 != null && xm.b((EdgeEffect)var14_5) != 0.0f) {
                                var7_8 = var1_1;
                                if (!this.aO(this.E, var1_1, this.getHeight())) ** continue;
                                this.E.onAbsorb(var1_1);
                                ** continue;
                            }
                        }
                        var8_9 = 0;
                        var7_8 = var1_1;
                        var1_1 = var8_9;
                    }
                    var8_9 = var3_3;
                    if (var3_3 != 0) ** GOTO lbl75
                    if (var1_1 == 0) {
                        var1_1 = 0;
                        var8_9 = 0;
                    } else {
                        var8_9 = 0;
lbl75:
                        // 2 sources

                        var3_3 = -var4_4;
                        var8_9 = Math.max(var3_3, Math.min(var8_9, var4_4));
                        var1_1 = Math.max(var3_3, Math.min(var1_1, var4_4));
                        this.aK(1);
                        this.L.a(var8_9, var1_1);
                    }
                    var3_3 = var2_2;
                    if (var2_2 == 0) {
                        if (var7_8 == 0) {
                            return var8_9 != 0 || var1_1 != 0;
                            {
                            }
                        }
                        var3_3 = 0;
                    }
                    if (this.dispatchNestedPreFling(var5_10 = (float)var3_3, var6_11 = (float)var7_8)) break block38;
                    var12_6 = var12_6 || var13_7;
                    this.dispatchNestedFling(var5_10, var6_11, var12_6);
                    var14_5 = this.G;
                    if (var14_5 == null) break block39;
                    var16_12 = var14_5.a;
                    var15_13 = var16_12.n;
                    if (var15_13 == null || var16_12.g() == null) break block39;
                    var1_1 = var14_5.a.H;
                    if (Math.abs(var7_8) <= var1_1 && Math.abs(var3_3) <= var1_1 || !(var15_13 instanceof lb)) break block39;
                    var16_12 = new blq(((blr)var14_5).d);
                    var10_14 = var15_13.aq();
                    if (var10_14 == 0) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var1_1 = -1;
                            break block33;
                            break;
                        }
                    }
                    var17_15 = var14_5.d(var15_13);
                    if (var17_15 == null || (var11_16 = ko.bk((View)var17_15)) == -1) ** GOTO lbl-1000
                    var17_15 = (lb)var15_13;
                    var8_9 = var10_14 - 1;
                    if ((var17_15 = var17_15.M(var8_9)) != null) ** break;
                    ** while (true)
                    if (var15_13.Y()) {
                        var1_1 = var2_2 = var14_5.c(var15_13, var14_5.f(var15_13), var3_3, 0);
                        if (var17_15.x < 0.0f) {
                            var1_1 = -var2_2;
                        }
                    } else {
                        var1_1 = 0;
                    }
                    if (var15_13.Z()) {
                        var2_2 = var9_17 = var14_5.c(var15_13, var14_5.g(var15_13), 0, var7_8);
                        if (var17_15.y < 0.0f) {
                            var2_2 = -var9_17;
                        }
                    } else {
                        var2_2 = 0;
                    }
                    if (var15_13.Z()) {
                        var1_1 = var2_2;
                    }
                    if (var1_1 == 0) {
                        var1_1 = -1;
                    } else {
                        var1_1 = var2_2 = var11_16 + var1_1;
                        if (var2_2 < 0) {
                            var1_1 = 0;
                        }
                        if (var1_1 >= var10_14) {
                            var1_1 = var8_9;
                        }
                    }
                }
                if (var1_1 != -1) {
                    var16_12.a = var1_1;
                    var15_13.aY((lc)var16_12);
                    return true;
                }
            }
            if (var12_6) {
                var2_2 = -var4_4;
                this.aK(1);
                var1_1 = Math.max(var2_2, Math.min(var3_3, var4_4));
                var2_2 = Math.max(var2_2, Math.min(var7_8, var4_4));
                this.L.a(var1_1, var2_2);
                return true;
            }
        }
        return false;
    }

    public final boolean an() {
        return !this.u || this.z || this.g.l();
        {
        }
    }

    public final boolean ao() {
        AccessibilityManager accessibilityManager = this.al;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean ap() {
        return this.am > 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final boolean aq(int var1_1, int var2_2, MotionEvent var3_3, int var4_4) {
        block16: {
            block17: {
                block21: {
                    block19: {
                        block20: {
                            block18: {
                                this.z();
                                if (this.m != null) {
                                    var20_5 /* !! */  = this.T;
                                    var20_5 /* !! */ [0] = 0;
                                    var20_5 /* !! */ [1] = 0;
                                    this.Y(var1_1, var2_2, var20_5 /* !! */ );
                                    var20_5 /* !! */  = this.T;
                                    var13_6 = var20_5 /* !! */ [0];
                                    var11_8 = var14_7 = var20_5 /* !! */ [1];
                                    var12_9 = var13_6;
                                    var13_6 = var1_1 - var13_6;
                                    var14_7 = var2_2 - var14_7;
                                } else {
                                    var15_10 = 0;
                                    var14_7 = var11_8 = (var12_9 = 0);
                                    var13_6 = var11_8;
                                    var11_8 = var15_10;
                                }
                                if (!this.p.isEmpty()) {
                                    this.invalidate();
                                }
                                var20_5 /* !! */  = this.T;
                                var20_5 /* !! */ [0] = 0;
                                var20_5 /* !! */ [1] = 0;
                                this.D(var12_9, var11_8, var13_6, var14_7, this.aA, var4_4, var20_5 /* !! */ );
                                var20_5 /* !! */  = this.T;
                                var16_11 = var20_5 /* !! */ [0];
                                var15_10 = var20_5 /* !! */ [1];
                                var4_4 = var16_11 == 0 && var15_10 == 0 ? 0 : 1;
                                var18_12 = this.at;
                                var20_5 /* !! */  = this.aA;
                                var17_13 = var20_5 /* !! */ [0];
                                this.at = var18_12 - var17_13;
                                var18_12 = this.au;
                                var19_14 = var20_5 /* !! */ [1];
                                this.au = var18_12 - var19_14;
                                var20_5 /* !! */  = this.aB;
                                var20_5 /* !! */ [0] = var20_5 /* !! */ [0] + var17_13;
                                var20_5 /* !! */ [1] = var20_5 /* !! */ [1] + var19_14;
                                if (this.getOverScrollMode() == 2) break block16;
                                if (var3_3 == null || vy.h(var3_3, 8194)) break block17;
                                var5_15 = var3_3.getX();
                                var8_16 = var13_6 - var16_11;
                                var10_17 = var3_3.getY();
                                var9_18 = var14_7 - var15_10;
                                if (var8_16 < 0.0f) {
                                    this.G();
                                    var20_5 /* !! */  = (int[])this.B;
                                    var7_19 = -var8_16;
                                    var6_20 = this.getWidth();
                                    xm.c((EdgeEffect)var20_5 /* !! */ , var7_19 / var6_20, 1.0f - (var10_17 /= (float)this.getHeight()));
lbl51:
                                    // 2 sources

                                    while (true) {
                                        var13_6 = 1;
                                        break;
                                    }
                                } else {
                                    if (var8_16 > 0.0f) {
                                        this.H();
                                        xm.c(this.D, var8_16 / (float)this.getWidth(), var10_17 / (float)this.getHeight());
                                        ** continue;
                                    }
                                    var13_6 = 0;
                                }
                                if (!(var9_18 < 0.0f)) break block18;
                                this.I();
                                var20_5 /* !! */  = (int[])this.C;
                                var7_19 = -var9_18;
                                var6_20 = this.getHeight();
                                xm.c((EdgeEffect)var20_5 /* !! */ , var7_19 / var6_20, var5_15 /= (float)this.getWidth());
                                break block19;
                            }
                            cfr_temp_0 = var9_18 - 0.0f;
                            var14_7 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                            if (var14_7 <= 0) break block20;
                            this.F();
                            xm.c(this.E, var9_18 / (float)this.getHeight(), 1.0f - var5_15 / (float)this.getWidth());
                            break block19;
                        }
                        if (var13_6 == 0 && var8_16 == 0.0f && var14_7 == 0) break block21;
                    }
                    this.postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31 && vy.h(var3_3, 0x400000)) {
                    this.aG();
                }
            }
            this.y(var1_1, var2_2);
        }
        var1_1 = var12_9;
        if (var12_9 != 0) ** GOTO lbl93
        if (var11_8 == 0) {
            var11_8 = 0;
            var1_1 = 0;
        } else {
            var1_1 = 0;
lbl93:
            // 2 sources

            this.E(var1_1, var11_8);
        }
        if (!this.awakenScrollBars()) {
            this.invalidate();
        }
        return var4_4 != 0 || var1_1 != 0 || var11_8 != 0;
        {
        }
    }

    public final void at(lg lg2, int n2) {
        if (this.ap()) {
            lg2.mPendingAccessibilityState = n2;
            this.U.add(lg2);
            return;
        }
        lg2.itemView.setImportantForAccessibility(n2);
    }

    public final void au(int n2, int n3) {
        this.av(n2, n3, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void av(int n2, int n3, boolean bl2) {
        ko ko2 = this.n;
        if (ko2 == null) {
            Log.e((String)"RecyclerView", (String)"Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.w) return;
        boolean bl3 = ko2.Y();
        int n4 = 0;
        if (!bl3) {
            n2 = 0;
        }
        if (!ko2.Z()) {
            n3 = 0;
        }
        int n5 = n2;
        if (n2 == 0) {
            if (n3 == 0) return;
            n5 = 0;
        }
        if (bl2) {
            n2 = n4;
            if (n5 != 0) {
                n2 = 1;
            }
            n4 = n2;
            if (n3 != 0) {
                n4 = n2 | 2;
            }
            this.aw(n4, 1);
        }
        this.L.c(n5, n3, Integer.MIN_VALUE, null);
    }

    public final void aw(int n2, int n3) {
        this.az().i(n2, n3);
    }

    public final void ax(lg lg2, bvl bvl2) {
        lg2.setFlags(0, 8192);
        if (this.O.h && lg2.isUpdated() && !lg2.isRemoved() && !lg2.shouldIgnore()) {
            long l2 = this.e(lg2);
            this.aa.p(l2, lg2);
        }
        this.aa.x(lg2, bvl2);
    }

    public final int b(lg object) {
        int n2;
        block17: {
            int n3;
            boolean bl2 = ((lg)object).hasAnyOfTheFlags(524);
            n2 = n3 = -1;
            if (!bl2) {
                if (!((lg)object).isBound()) {
                    n2 = n3;
                } else {
                    hd hd2 = this.g;
                    int n4 = ((lg)object).mPosition;
                    int n5 = hd2.a.size();
                    for (int i2 = 0; i2 < n5; ++i2) {
                        object = (hc)hd2.a.get(i2);
                        n2 = ((hc)object).a;
                        if (n2 != 1) {
                            int n6;
                            if (n2 != 2) {
                                if (n2 != 8) {
                                    n2 = n4;
                                } else {
                                    n2 = ((hc)object).b;
                                    if (n2 == n4) {
                                        n2 = ((hc)object).d;
                                    } else {
                                        n6 = n4;
                                        if (n2 < n4) {
                                            n6 = n4 - 1;
                                        }
                                        n2 = n6;
                                        if (((hc)object).d <= n6) {
                                            n2 = n6 + 1;
                                        }
                                    }
                                }
                            } else {
                                n6 = ((hc)object).b;
                                n2 = n4;
                                if (n6 <= n4) {
                                    n2 = ((hc)object).d;
                                    if (n6 + n2 > n4) {
                                        n2 = n3;
                                        break block17;
                                    }
                                    n2 = n4 - n2;
                                }
                            }
                        } else {
                            n2 = n4;
                            if (((hc)object).b <= n4) {
                                n2 = n4 + ((hc)object).d;
                            }
                        }
                        n4 = n2;
                    }
                    n2 = n4;
                }
            }
        }
        return n2;
    }

    public final int c(View object) {
        if ((object = RecyclerView.j((View)object)) != null) {
            return ((lg)object).getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kp && this.n.t((kp)layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        ko ko2 = this.n;
        if (ko2 != null && ko2.Y()) {
            return ko2.C(this.O);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        ko ko2 = this.n;
        if (ko2 != null && ko2.Y()) {
            return ko2.D(this.O);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        ko ko2 = this.n;
        if (ko2 != null && ko2.Y()) {
            return ko2.E(this.O);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        ko ko2 = this.n;
        if (ko2 != null && ko2.Z()) {
            return ko2.F(this.O);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        ko ko2 = this.n;
        if (ko2 != null && ko2.Z()) {
            return ko2.G(this.O);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        ko ko2 = this.n;
        if (ko2 != null && ko2.Z()) {
            return ko2.H(this.O);
        }
        return 0;
    }

    public final int d(View object) {
        if ((object = RecyclerView.j((View)object)) != null) {
            return ((lg)object).getLayoutPosition();
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) return true;
        ko ko2 = this.n;
        int n2 = 0;
        int n3 = 0;
        if (ko2 == null) {
            return false;
        }
        if (ko2.Z()) {
            n2 = keyEvent.getKeyCode();
            if (n2 != 92 && n2 != 93) {
                if (n2 != 122 && n2 != 123) return false;
                boolean bl2 = ko2.ac();
                if (n2 == 122) {
                    if (bl2) {
                        n3 = this.g().getItemCount();
                    }
                } else if (!bl2) {
                    n3 = this.g().getItemCount();
                }
                this.ae(n3);
                return true;
            }
            n3 = this.getMeasuredHeight();
            if (n2 == 93) {
                this.au(0, n3);
                return true;
            } else {
                this.au(0, -n3);
            }
            return true;
        }
        if (!ko2.Y()) return false;
        n3 = keyEvent.getKeyCode();
        if (n3 != 92 && n3 != 93) {
            if (n3 != 122 && n3 != 123) return false;
            boolean bl3 = ko2.ac();
            if (n3 == 122) {
                n3 = n2;
                if (bl3) {
                    n3 = this.g().getItemCount();
                }
            } else {
                n3 = bl3 ? n2 : this.g().getItemCount();
            }
            this.ae(n3);
            return true;
        }
        n2 = this.getMeasuredWidth();
        if (n3 == 93) {
            this.au(n2, 0);
            return true;
        } else {
            this.au(-n2, 0);
        }
        return true;
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean bl2) {
        return this.az().c(f2, f3, bl2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.az().d(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int n2, int n3, int[] nArray, int[] nArray2) {
        return this.az().e(n2, n3, nArray, nArray2, 0);
    }

    public final boolean dispatchNestedScroll(int n2, int n3, int n4, int n5, int[] nArray) {
        return this.az().f(n2, n3, n4, n5, nArray);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        this.onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.dispatchThawSelfOnly(sparseArray);
    }

    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        this.dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        int n2;
        int n3;
        int n4;
        super.draw(canvas);
        int n5 = this.p.size();
        int n6 = 0;
        for (n4 = 0; n4 < n5; ++n4) {
            ((kl)this.p.get(n4)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.B;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            n3 = canvas.save();
            n4 = this.i ? this.getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float)(-this.getHeight() + n4), 0.0f);
            edgeEffect = this.B;
            n5 = edgeEffect != null && edgeEffect.draw(canvas) ? 1 : 0;
            canvas.restoreToCount(n3);
        } else {
            n5 = 0;
        }
        edgeEffect = this.C;
        n4 = n5;
        if (edgeEffect != null) {
            n4 = n5;
            if (!edgeEffect.isFinished()) {
                n3 = canvas.save();
                if (this.i) {
                    canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
                }
                n4 = (edgeEffect = this.C) != null && edgeEffect.draw(canvas) ? 1 : 0;
                n4 = n5 | n4;
                canvas.restoreToCount(n3);
            }
        }
        edgeEffect = this.D;
        n5 = n4;
        if (edgeEffect != null) {
            n5 = n4;
            if (!edgeEffect.isFinished()) {
                n3 = canvas.save();
                n2 = this.getWidth();
                n5 = this.i ? this.getPaddingTop() : 0;
                canvas.rotate(90.0f);
                n2 = -n2;
                canvas.translate((float)n5, (float)n2);
                edgeEffect = this.D;
                n5 = edgeEffect != null && edgeEffect.draw(canvas) ? 1 : 0;
                n5 = n4 | n5;
                canvas.restoreToCount(n3);
            }
        }
        edgeEffect = this.E;
        n4 = n5;
        if (edgeEffect != null) {
            n4 = n5;
            if (!edgeEffect.isFinished()) {
                n3 = canvas.save();
                canvas.rotate(180.0f);
                if (this.i) {
                    n2 = -this.getWidth();
                    n4 = this.getPaddingRight();
                    int n7 = -this.getHeight();
                    int n8 = this.getPaddingBottom();
                    canvas.translate((float)(n2 + n4), (float)(n7 + n8));
                } else {
                    n2 = -this.getWidth();
                    n4 = -this.getHeight();
                    canvas.translate((float)n2, (float)n4);
                }
                edgeEffect = this.E;
                n4 = n6;
                if (edgeEffect != null) {
                    n4 = n6;
                    if (edgeEffect.draw(canvas)) {
                        n4 = 1;
                    }
                }
                n4 = n5 | n4;
                canvas.restoreToCount(n3);
            }
        }
        if (!(n4 != 0 || this.F != null && this.p.size() > 0 && this.F.h())) {
            return;
        }
        this.postInvalidateOnAnimation();
    }

    public final boolean drawChild(Canvas canvas, View view, long l2) {
        return super.drawChild(canvas, view, l2);
    }

    final long e(lg lg2) {
        long l2 = this.m.hasStableIds() ? lg2.getItemId() : (long)lg2.mPosition;
        return l2;
    }

    public final Rect f(View view) {
        kp kp2 = (kp)view.getLayoutParams();
        if (!kp2.e) {
            return kp2.d;
        }
        if (this.O.g && (kp2.b() || kp2.c.isInvalid())) {
            return kp2.d;
        }
        Rect rect = kp2.d;
        rect.set(0, 0, 0, 0);
        int n2 = this.p.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.k.set(0, 0, 0, 0);
            ((kl)this.p.get(i2)).a(this.k, view, this, this.O);
            rect.left += this.k.left;
            rect.top += this.k.top;
            rect.right += this.k.right;
            rect.bottom += this.k.bottom;
        }
        kp2.e = false;
        return rect;
    }

    /*
     * Unable to fully structure code
     */
    public final View focusSearch(View var1_1, int var2_2) {
        block23: {
            block24: {
                block33: {
                    block34: {
                        block35: {
                            block36: {
                                block37: {
                                    block38: {
                                        block31: {
                                            block32: {
                                                block30: {
                                                    block29: {
                                                        block27: {
                                                            block28: {
                                                                block26: {
                                                                    block25: {
                                                                        block22: {
                                                                            block18: {
                                                                                block21: {
                                                                                    block20: {
                                                                                        block19: {
                                                                                            var7_3 = this.m;
                                                                                            var6_4 = 0;
                                                                                            var4_5 = var7_3 != null && this.n != null && this.ap() == false && this.w == false ? 1 : 0;
                                                                                            var7_3 = FocusFinder.getInstance();
                                                                                            if (var4_5 == 0) break block18;
                                                                                            var3_6 = var2_2;
                                                                                            if (var2_2 == 2) break block19;
                                                                                            if (var2_2 != 1) break block18;
                                                                                            var3_6 = 1;
                                                                                        }
                                                                                        if (this.n.Z() && var7_3.findNextFocus(this, (View)var1_1, var2_2 = var3_6 == 2 ? 130 : 33) == null) break block20;
                                                                                        if (!this.n.Y()) break block21;
                                                                                        var2_2 = this.n.ar() == 1 ? 1 : 0;
                                                                                        var4_5 = var3_6 == 2 ? 1 : 0;
                                                                                        if (var7_3.findNextFocus(this, (View)var1_1, var2_2 = 1 != (var2_2 ^ var4_5) ? 17 : 66) != null) break block21;
                                                                                    }
                                                                                    this.z();
                                                                                    if (this.l((View)var1_1) == null) {
                                                                                        return null;
                                                                                    }
                                                                                    this.af();
                                                                                    this.n.j((View)var1_1, var3_6, this.e, this.O);
                                                                                    this.ag(false);
                                                                                }
                                                                                var7_3 = var7_3.findNextFocus(this, (View)var1_1, var3_6);
                                                                                var4_5 = var3_6;
                                                                                break block22;
                                                                            }
                                                                            if ((var7_3 = var7_3.findNextFocus(this, (View)var1_1, var2_2)) == null && var4_5 != 0) {
                                                                                this.z();
                                                                                if (this.l((View)var1_1) == null) {
                                                                                    return null;
                                                                                }
                                                                                this.af();
                                                                                var7_3 = this.n.j((View)var1_1, var2_2, this.e, this.O);
                                                                                this.ag(false);
                                                                                var4_5 = var2_2;
                                                                            } else {
                                                                                var4_5 = var2_2;
                                                                            }
                                                                        }
                                                                        if (var7_3 != null && !var7_3.hasFocusable()) {
                                                                            if (this.getFocusedChild() == null) {
                                                                                return super.focusSearch((View)var1_1, var4_5);
                                                                            }
                                                                            this.aH((View)var7_3, null);
                                                                            return var1_1;
                                                                        }
                                                                        if (var7_3 == null || var7_3 == this || var7_3 == var1_1 || this.l((View)var7_3) == null) break block23;
                                                                        if (var1_1 == null || this.l((View)var1_1) == null) break block24;
                                                                        this.k.set(0, 0, var1_1.getWidth(), var1_1.getHeight());
                                                                        this.ah.set(0, 0, var7_3.getWidth(), var7_3.getHeight());
                                                                        this.offsetDescendantRectToMyCoords((View)var1_1, this.k);
                                                                        this.offsetDescendantRectToMyCoords((View)var7_3, this.ah);
                                                                        var5_7 = this.n.ar() == 1 ? -1 : 1;
                                                                        var8_8 = this.k;
                                                                        var9_9 = this.ah;
                                                                        if (var8_8.left < var9_9.left) break block25;
                                                                        var8_8 = this.k;
                                                                        var9_9 = this.ah;
                                                                        if (var8_8.right > var9_9.left) break block26;
                                                                    }
                                                                    var9_9 = this.k;
                                                                    var8_8 = this.ah;
                                                                    if (var9_9.right >= var8_8.right) break block26;
                                                                    var2_2 = 1;
                                                                    break block27;
                                                                }
                                                                var8_8 = this.k;
                                                                var9_9 = this.ah;
                                                                if (var8_8.right > var9_9.right) break block28;
                                                                var9_9 = this.k;
                                                                var8_8 = this.ah;
                                                                if (var9_9.left < var8_8.right) ** GOTO lbl-1000
                                                            }
                                                            var8_8 = this.k;
                                                            var9_9 = this.ah;
                                                            if (var8_8.left > var9_9.left) {
                                                                var2_2 = -1;
                                                            } else lbl-1000:
                                                            // 2 sources

                                                            {
                                                                var2_2 = 0;
                                                            }
                                                        }
                                                        var9_9 = this.k;
                                                        var8_8 = this.ah;
                                                        if (var9_9.top < var8_8.top) break block29;
                                                        var8_8 = this.k;
                                                        var9_9 = this.ah;
                                                        if (var8_8.bottom > var9_9.top) break block30;
                                                    }
                                                    var8_8 = this.k;
                                                    var9_9 = this.ah;
                                                    if (var8_8.bottom >= var9_9.bottom) break block30;
                                                    var3_6 = 1;
                                                    break block31;
                                                }
                                                var9_9 = this.k;
                                                var8_8 = this.ah;
                                                if (var9_9.bottom > var8_8.bottom) break block32;
                                                var9_9 = this.k;
                                                var8_8 = this.ah;
                                                var3_6 = var6_4;
                                                if (var9_9.top < var8_8.bottom) break block31;
                                            }
                                            var8_8 = this.k;
                                            var9_9 = this.ah;
                                            var3_6 = var6_4;
                                            if (var8_8.top > var9_9.top) {
                                                var3_6 = -1;
                                            }
                                        }
                                        if (var4_5 == 1) break block33;
                                        if (var4_5 == 2) break block34;
                                        if (var4_5 == 17) break block35;
                                        if (var4_5 == 33) break block36;
                                        if (var4_5 == 66) break block37;
                                        if (var4_5 != 130) break block38;
                                        if (var3_6 <= 0) break block23;
                                        break block24;
                                    }
                                    var1_1 = new StringBuilder("Invalid direction: ");
                                    var1_1.append(var4_5);
                                    var1_1.append(this.m());
                                    throw new IllegalArgumentException(var1_1.toString());
                                }
                                if (var2_2 <= 0) break block23;
                                break block24;
                            }
                            if (var3_6 >= 0) break block23;
                            break block24;
                        }
                        if (var2_2 >= 0) break block23;
                        break block24;
                    }
                    if (var3_6 <= 0 && (var3_6 != 0 || var2_2 * var5_7 <= 0)) break block23;
                    break block24;
                }
                if (var3_6 >= 0 && (var3_6 != 0 || var2_2 * var5_7 >= 0)) break block23;
            }
            return var7_3;
        }
        return super.focusSearch((View)var1_1, var4_5);
    }

    public kf g() {
        return this.m;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ko ko2 = this.n;
        if (ko2 != null) {
            return ko2.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.m()));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ko ko2 = this.n;
        if (ko2 != null) {
            return ko2.h(this.getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.m()));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ko ko2 = this.n;
        if (ko2 != null) {
            return ko2.g(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(this.m()));
    }

    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public final boolean getClipToPadding() {
        return this.i;
    }

    public final lg h(int n2) {
        boolean bl2 = this.z;
        lg lg2 = null;
        if (bl2) {
            return null;
        }
        int n3 = this.h.c();
        for (int i2 = 0; i2 < n3; ++i2) {
            lg lg3 = RecyclerView.j(this.h.f(i2));
            lg lg4 = lg2;
            if (lg3 != null) {
                lg4 = lg2;
                if (!lg3.isRemoved()) {
                    lg4 = lg2;
                    if (this.b(lg3) == n2) {
                        if (this.h.k(lg3.itemView)) {
                            lg4 = lg3;
                        } else {
                            return lg3;
                        }
                    }
                }
            }
            lg2 = lg4;
        }
        return lg2;
    }

    public final boolean hasNestedScrollingParent() {
        return this.az().h(0);
    }

    public final lg i(View view) {
        ViewParent viewParent = view.getParent();
        if (viewParent != null && viewParent != this) {
            throw new IllegalArgumentException(a.am(this, view, "View ", " is not a direct child of "));
        }
        return RecyclerView.j(view);
    }

    public final boolean isAttachedToWindow() {
        return this.s;
    }

    public final boolean isLayoutSuppressed() {
        return this.w;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.az().a;
    }

    public final View l(View view) {
        ViewParent viewParent = view.getParent();
        View view2 = view;
        view = viewParent;
        while (view != null && view != this && view instanceof View) {
            view2 = view;
            view = view2.getParent();
        }
        if (view == this) {
            return view2;
        }
        return null;
    }

    public final String m() {
        StringBuilder stringBuilder = new StringBuilder(" ");
        stringBuilder.append(super.toString());
        stringBuilder.append(", adapter:");
        stringBuilder.append(this.m);
        stringBuilder.append(", layout:");
        stringBuilder.append(this.n);
        stringBuilder.append(", context:");
        stringBuilder.append(this.getContext());
        return stringBuilder.toString();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.am = 0;
        boolean bl2 = true;
        this.s = true;
        if (!this.u || this.isLayoutRequested()) {
            bl2 = false;
        }
        this.u = bl2;
        this.e.e();
        Object object = this.n;
        if (object != null) {
            ((ko)object).bd();
        }
        this.R = false;
        if (b) {
            this.M = object = (jj)jj.a.get();
            if (object == null) {
                float f2;
                this.M = new jj();
                object = wj.a;
                object = this.getDisplay();
                bl2 = this.isInEditMode();
                float f3 = f2 = 60.0f;
                if (!bl2) {
                    f3 = f2;
                    if (object != null && !((f3 = object.getRefreshRate()) >= 30.0f)) {
                        f3 = f2;
                    }
                }
                object = this.M;
                ((jj)object).e = (long)(1.0E9f / f3);
                jj.a.set(object);
            }
            this.M.c.add(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object object = this.F;
        if (object != null) {
            ((kk)object).e();
        }
        this.ai();
        this.s = false;
        object = this.n;
        if (object != null) {
            ((ko)object).br(this);
        }
        this.U.clear();
        this.removeCallbacks(this.aC);
        while (mh.b.a() != null) {
        }
        object = this.e;
        for (int i2 = 0; i2 < ((kv)object).c.size(); ++i2) {
            wa.v(((lg)((kv)object).c.get((int)i2)).itemView);
        }
        ((kv)object).f(((kv)object).f.m, false);
        object = new wn(this, 1).a();
        while (object.hasNext()) {
            wa.A((View)object.next()).T();
        }
        if (b && (object = this.M) != null) {
            ((jj)object).c.remove(this);
            this.M = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int n2 = this.p.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((kl)this.p.get(i2)).b(canvas, this);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onGenericMotionEvent(MotionEvent var1_1) {
        block12: {
            block15: {
                block17: {
                    block18: {
                        block16: {
                            block14: {
                                block13: {
                                    if (this.n == null || this.w || var1_1.getAction() != 8) break block12;
                                    var5_2 = var1_1.getSource();
                                    var3_3 = 0.0f;
                                    var2_4 = 0.0f;
                                    var4_5 = 0.0f;
                                    if ((var5_2 & 2) == 0) break block13;
                                    var2_4 = this.n.Z() != false ? -var1_1.getAxisValue(9) : 0.0f;
                                    var3_3 = var4_5;
                                    if (this.n.Y()) {
                                        var3_3 = var1_1.getAxisValue(10);
                                    }
                                    var13_6 = false;
                                    var5_2 = 0;
                                    ** GOTO lbl27
                                }
                                if ((var1_1.getSource() & 0x400000) != 0) {
                                    var2_4 = var1_1.getAxisValue(26);
                                    if (this.n.Z()) {
                                        var2_4 = -var2_4;
                                    } else if (this.n.Y()) {
                                        var3_3 = var2_4;
                                        var2_4 = 0.0f;
                                    } else {
                                        var2_4 = 0.0f;
                                    }
                                    var13_6 = this.V;
                                    var5_2 = 26;
lbl27:
                                    // 2 sources

                                    var7_7 = var5_2;
                                } else {
                                    var3_3 = 0.0f;
                                    var13_6 = false;
                                    var7_7 = 0;
                                }
                                var4_5 = this.K;
                                var8_8 = (int)(var3_3 * this.J);
                                var6_9 = (int)(var2_4 * var4_5);
                                if (!var13_6) break block14;
                                var15_10 = this.L.a;
                                var9_12 = var15_10.getFinalY();
                                var5_2 = var15_10.getCurrY();
                                this.av(var8_8 + (var15_10.getFinalX() - var15_10.getCurrX()), var6_9 + (var9_12 - var5_2), true);
                                break block15;
                            }
                            var16_14 = this.n;
                            if (var16_14 != null) break block16;
                            Log.e((String)"RecyclerView", (String)"Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            break block15;
                        }
                        if (this.w) break block15;
                        var15_11 = this.T;
                        var15_11[0] = 0;
                        var15_11[1] = 0;
                        var12_15 = var16_14.Y();
                        var14_16 = var16_14.Z();
                        var5_2 = var14_16 != false ? var12_15 | 2 : (int)var12_15;
                        var2_4 = var1_1 == null ? (float)this.getHeight() / 2.0f : var1_1.getY();
                        var3_3 = var1_1 == null ? (float)this.getWidth() / 2.0f : var1_1.getX();
                        var8_8 -= this.a(var8_8, var2_4);
                        var9_13 = var6_9 - this.ay(var6_9, var3_3);
                        this.aw(var5_2, 1);
                        var10_17 = 1 != var12_15 ? 0 : var8_8;
                        var11_18 = true != var14_16 ? 0 : var9_13;
                        var5_2 = var8_8;
                        var6_9 = var9_13;
                        if (this.ak(var10_17, var11_18, this.T, this.aA, 1)) {
                            var15_11 = this.T;
                            var5_2 = var8_8 - var15_11[0];
                            var6_9 = var9_13 - var15_11[1];
                        }
                        var8_8 = 1 != var12_15 ? 0 : var5_2;
                        var9_13 = true != var14_16 ? 0 : var6_9;
                        this.aq(var8_8, var9_13, var1_1, 1);
                        var15_11 = this.M;
                        if (var15_11 == null) break block17;
                        var8_8 = var5_2;
                        if (var5_2 != 0) break block18;
                        if (var6_9 == 0) break block17;
                        var8_8 = 0;
                    }
                    var15_11.a(this, var8_8, var6_9);
                }
                this.ah(1);
            }
            if (var7_7 != 0 && !var13_6) {
                this.W.a(var1_1, 26);
            }
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent object) {
        block31: {
            block36: {
                block35: {
                    int n2;
                    block34: {
                        int n3;
                        ko ko2;
                        block28: {
                            block29: {
                                block33: {
                                    block32: {
                                        boolean bl2;
                                        boolean bl3;
                                        block30: {
                                            if (this.w) {
                                                return false;
                                            }
                                            this.r = null;
                                            if (this.aM((MotionEvent)object)) {
                                                this.aA();
                                                return true;
                                            }
                                            ko2 = this.n;
                                            if (ko2 == null) {
                                                return false;
                                            }
                                            bl3 = ko2.Y();
                                            bl2 = ko2.Z();
                                            if (this.aq == null) {
                                                this.aq = VelocityTracker.obtain();
                                            }
                                            this.aq.addMovement(object);
                                            n2 = object.getActionMasked();
                                            n3 = object.getActionIndex();
                                            if (n2 == 0) break block28;
                                            if (n2 == 1) break block29;
                                            if (n2 == 2) break block30;
                                            if (n2 != 3) {
                                                if (n2 != 5) {
                                                    if (n2 == 6) {
                                                        this.aE((MotionEvent)object);
                                                    }
                                                } else {
                                                    this.ap = object.getPointerId(n3);
                                                    this.at = n2 = (int)(object.getX(n3) + 0.5f);
                                                    this.ar = n2;
                                                    this.au = n3 = (int)(object.getY(n3) + 0.5f);
                                                    this.as = n3;
                                                }
                                            } else {
                                                this.aA();
                                            }
                                            break block31;
                                        }
                                        n3 = object.findPointerIndex(this.ap);
                                        if (n3 < 0) {
                                            object = new StringBuilder("Error processing scroll; pointer index for id ");
                                            object.append(this.ap);
                                            object.append(" not found. Did any MotionEvents get skipped?");
                                            Log.e((String)"RecyclerView", (String)object.toString());
                                            return false;
                                        }
                                        float f2 = object.getX(n3);
                                        float f3 = object.getY(n3);
                                        if (this.ao == 1) break block31;
                                        int n4 = (int)(f3 + 0.5f);
                                        n3 = (int)(f2 + 0.5f);
                                        int n5 = this.ar;
                                        n2 = this.as;
                                        if (bl3 && Math.abs(n3 - n5) > this.av) {
                                            this.at = n3;
                                            n3 = 1;
                                        } else {
                                            n3 = 0;
                                        }
                                        if (!bl2 || Math.abs(n4 - n2) <= this.av) break block32;
                                        this.au = n4;
                                        break block33;
                                    }
                                    if (n3 == 0) break block31;
                                }
                                this.ad(1);
                                break block31;
                            }
                            this.aq.clear();
                            this.ah(0);
                            break block31;
                        }
                        if (this.aj) {
                            this.aj = false;
                        }
                        this.ap = object.getPointerId(0);
                        this.at = n3 = (int)(object.getX() + 0.5f);
                        this.ar = n3;
                        this.au = n3 = (int)(object.getY() + 0.5f);
                        this.as = n3;
                        ko2 = this.B;
                        if (ko2 != null && xm.b((EdgeEffect)ko2) != 0.0f && !this.canScrollHorizontally(-1)) {
                            xm.c(this.B, 0.0f, 1.0f - object.getY() / (float)this.getHeight());
                            n2 = 1;
                        } else {
                            n2 = 0;
                        }
                        ko2 = this.D;
                        n3 = n2;
                        if (ko2 != null) {
                            n3 = n2;
                            if (xm.b((EdgeEffect)ko2) != 0.0f) {
                                n3 = n2;
                                if (!this.canScrollHorizontally(1)) {
                                    xm.c(this.D, 0.0f, object.getY() / (float)this.getHeight());
                                    n3 = 1;
                                }
                            }
                        }
                        ko2 = this.C;
                        n2 = n3;
                        if (ko2 != null) {
                            n2 = n3;
                            if (xm.b((EdgeEffect)ko2) != 0.0f) {
                                n2 = n3;
                                if (!this.canScrollVertically(-1)) {
                                    xm.c(this.C, 0.0f, object.getX() / (float)this.getWidth());
                                    n2 = 1;
                                }
                            }
                        }
                        if ((ko2 = this.E) == null || xm.b((EdgeEffect)ko2) == 0.0f || this.canScrollVertically(1)) break block34;
                        xm.c(this.E, 0.0f, 1.0f - object.getX() / (float)this.getWidth());
                        break block35;
                    }
                    if (n2 == 0 && this.ao != 2) break block36;
                }
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.ad(1);
                this.ah(1);
            }
            object = this.aB;
            object[1] = (MotionEvent)false;
            object[0] = (MotionEvent)false;
            this.aK(0);
        }
        return this.ao == 1;
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        Trace.beginSection((String)"RV OnLayout");
        this.C();
        Trace.endSection();
        this.u = true;
    }

    protected final void onMeasure(int n2, int n3) {
        Object object = this.n;
        if (object == null) {
            this.A(n2, n3);
            return;
        }
        boolean bl2 = ((ko)object).aa();
        boolean bl3 = false;
        if (bl2) {
            int n4 = View.MeasureSpec.getMode((int)n2);
            int n5 = View.MeasureSpec.getMode((int)n3);
            this.n.bp(n2, n3);
            bl2 = bl3;
            if (n4 == 0x40000000) {
                bl2 = bl3;
                if (n5 == 0x40000000) {
                    bl2 = true;
                }
            }
            this.aD = bl2;
            if (!bl2 && this.m != null) {
                if (this.O.d == 1) {
                    this.aB();
                }
                this.n.aU(n2, n3);
                this.O.i = true;
                this.aC();
                this.n.aW(n2, n3);
                if (this.n.ae()) {
                    this.n.aU(View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0x40000000));
                    this.O.i = true;
                    this.aC();
                    this.n.aW(n2, n3);
                }
                this.aE = this.getMeasuredWidth();
                this.aF = this.getMeasuredHeight();
            }
            return;
        }
        if (this.t) {
            ((ko)object).bp(n2, n3);
            return;
        }
        if (this.x) {
            this.af();
            this.Q();
            this.aF();
            this.R();
            object = this.O;
            if (((ld)object).k) {
                ((ld)object).g = true;
            } else {
                this.g.e();
                this.O.g = false;
            }
            this.x = false;
            this.ag(false);
        } else if (this.O.k) {
            this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
            return;
        }
        object = this.m;
        this.O.e = object != null ? ((kf)object).getItemCount() : 0;
        this.af();
        this.n.bp(n2, n3);
        this.ag(false);
        this.O.g = false;
    }

    protected final boolean onRequestFocusInDescendants(int n2, Rect rect) {
        if (this.ap()) {
            return false;
        }
        return super.onRequestFocusInDescendants(n2, rect);
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof kz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (kz)parcelable;
        this.f = parcelable;
        super.onRestoreInstanceState(parcelable.d);
        this.requestLayout();
    }

    protected final Parcelable onSaveInstanceState() {
        kz kz2 = new kz(super.onSaveInstanceState());
        Object object = this.f;
        if (object != null) {
            kz2.a = ((kz)object).a;
        } else {
            object = this.n;
            object = object != null ? ((ko)object).N() : null;
            kz2.a = object;
        }
        return kz2;
    }

    protected final void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        if (n2 == n4 && n3 == n5) {
            return;
        }
        this.L();
    }

    public boolean onTouchEvent(MotionEvent object) {
        block19: {
            block21: {
                Object object2;
                block20: {
                    block32: {
                        block25: {
                            int n2;
                            block22: {
                                boolean bl2;
                                boolean bl3;
                                block23: {
                                    int n3;
                                    block31: {
                                        int n4;
                                        int n5;
                                        boolean bl4;
                                        boolean bl5;
                                        int n6;
                                        int n7;
                                        int[] nArray;
                                        int n8;
                                        int n9;
                                        block26: {
                                            boolean bl6;
                                            block30: {
                                                block29: {
                                                    block27: {
                                                        block28: {
                                                            block24: {
                                                                bl3 = this.w;
                                                                n9 = 0;
                                                                if (bl3 || this.aj) break block19;
                                                                object2 = this.r;
                                                                if (object2 != null) break block20;
                                                                if (object.getAction() != 0 && this.aM((MotionEvent)object)) break block21;
                                                                object2 = this.n;
                                                                if (object2 == null) break block19;
                                                                bl3 = ((ko)object2).Y();
                                                                bl2 = ((ko)object2).Z();
                                                                if (this.aq == null) {
                                                                    this.aq = VelocityTracker.obtain();
                                                                }
                                                                n3 = object.getActionMasked();
                                                                n8 = object.getActionIndex();
                                                                n2 = n3;
                                                                if (n3 == 0) {
                                                                    object2 = this.aB;
                                                                    object2[1] = false;
                                                                    object2[0] = false;
                                                                    n2 = 0;
                                                                }
                                                                object2 = MotionEvent.obtain((MotionEvent)object);
                                                                nArray = this.aB;
                                                                object2.offsetLocation((float)nArray[0], (float)nArray[1]);
                                                                if (n2 == 0) break block22;
                                                                if (n2 == 1) break block23;
                                                                if (n2 == 2) break block24;
                                                                if (n2 != 3) {
                                                                    if (n2 != 5) {
                                                                        if (n2 == 6) {
                                                                            this.aE((MotionEvent)object);
                                                                        }
                                                                    } else {
                                                                        this.ap = object.getPointerId(n8);
                                                                        this.at = n2 = (int)(object.getX(n8) + 0.5f);
                                                                        this.ar = n2;
                                                                        this.au = n2 = (int)(object.getY(n8) + 0.5f);
                                                                        this.as = n2;
                                                                    }
                                                                } else {
                                                                    this.aA();
                                                                }
                                                                break block25;
                                                            }
                                                            n2 = object.findPointerIndex(this.ap);
                                                            if (n2 < 0) {
                                                                object = new StringBuilder("Error processing scroll; pointer index for id ");
                                                                ((StringBuilder)object).append(this.ap);
                                                                ((StringBuilder)object).append(" not found. Did any MotionEvents get skipped?");
                                                                Log.e((String)"RecyclerView", (String)((StringBuilder)object).toString());
                                                                return false;
                                                            }
                                                            float f2 = object.getX(n2);
                                                            float f3 = object.getY(n2);
                                                            n2 = this.at;
                                                            n7 = (int)(f2 + 0.5f);
                                                            n3 = n2 - n7;
                                                            n2 = this.au;
                                                            n6 = (int)(f3 + 0.5f);
                                                            n8 = n2 - n6;
                                                            bl5 = bl2;
                                                            bl4 = bl3;
                                                            n5 = n8;
                                                            n4 = n3;
                                                            if (this.ao == 1) break block26;
                                                            if (!bl3) break block27;
                                                            n2 = n3 > 0 ? Math.max(0, n3 - this.av) : Math.min(0, n3 + this.av);
                                                            if (n2 == 0) break block28;
                                                            bl3 = true;
                                                            n3 = n2;
                                                            break block29;
                                                        }
                                                        bl4 = false;
                                                        bl6 = true;
                                                        n3 = n2;
                                                        break block30;
                                                    }
                                                    bl3 = false;
                                                }
                                                bl6 = bl3;
                                                bl4 = bl3;
                                            }
                                            if (bl2) {
                                                n2 = n8 > 0 ? Math.max(0, n8 - this.av) : Math.min(0, n8 + this.av);
                                                if (n2 != 0) {
                                                    bl3 = true;
                                                    bl2 = true;
                                                } else {
                                                    bl3 = true;
                                                    bl2 = bl4;
                                                }
                                            } else {
                                                bl3 = false;
                                                n2 = n8;
                                                bl2 = bl4;
                                            }
                                            bl5 = bl3;
                                            bl4 = bl6;
                                            n5 = n2;
                                            n4 = n3;
                                            if (bl2) {
                                                this.ad(1);
                                                n4 = n3;
                                                n5 = n2;
                                                bl4 = bl6;
                                                bl5 = bl3;
                                            }
                                        }
                                        if (this.ao != 1) break block25;
                                        nArray = this.T;
                                        nArray[0] = 0;
                                        nArray[1] = 0;
                                        n4 -= this.a(n4, object.getY());
                                        n8 = n5 - this.ay(n5, object.getX());
                                        n5 = true != bl4 ? 0 : n4;
                                        int n10 = true != bl5 ? 0 : n8;
                                        n2 = n4;
                                        n3 = n8;
                                        if (this.ak(n5, n10, this.T, this.aA, 0)) {
                                            nArray = this.T;
                                            n2 = n4 - nArray[0];
                                            n3 = n8 - nArray[1];
                                            int[] nArray2 = this.aB;
                                            n8 = nArray2[0];
                                            nArray = this.aA;
                                            nArray2[0] = n8 + nArray[0];
                                            nArray2[1] = nArray2[1] + nArray[1];
                                            this.getParent().requestDisallowInterceptTouchEvent(true);
                                        }
                                        nArray = this.aA;
                                        this.at = n7 - nArray[0];
                                        this.au = n6 - nArray[1];
                                        n8 = true != bl4 ? 0 : n2;
                                        if (this.aq(n8, n4 = true != bl5 ? 0 : n3, (MotionEvent)object, 0)) {
                                            this.getParent().requestDisallowInterceptTouchEvent(true);
                                        }
                                        if ((object = this.M) == null) break block25;
                                        if (n2 != 0) break block31;
                                        if (n3 == 0) break block25;
                                        n2 = n9;
                                    }
                                    ((jj)object).a(this, n2, n3);
                                    break block25;
                                }
                                this.aq.addMovement((MotionEvent)object2);
                                this.aq.computeCurrentVelocity(1000, (float)this.I);
                                float f4 = bl3 ? -this.aq.getXVelocity(this.ap) : 0.0f;
                                float f5 = bl2 ? -this.aq.getYVelocity(this.ap) : 0.0f;
                                if (f4 == 0.0f && f5 == 0.0f || !this.al((int)f4, (int)f5)) {
                                    this.ad(0);
                                }
                                this.aJ();
                                break block32;
                            }
                            this.ap = object.getPointerId(0);
                            this.at = n2 = (int)(object.getX() + 0.5f);
                            this.ar = n2;
                            this.au = n2 = (int)(object.getY() + 0.5f);
                            this.as = n2;
                            this.aK(0);
                        }
                        this.aq.addMovement((MotionEvent)object2);
                    }
                    object2.recycle();
                    return true;
                }
                object2.k((MotionEvent)object);
                int n11 = object.getAction();
                if (n11 == 3 || n11 == 1) {
                    this.r = null;
                }
            }
            this.aA();
            return true;
        }
        return false;
    }

    public final void removeDetachedView(View object, boolean bl2) {
        lg lg2 = RecyclerView.j((View)object);
        if (lg2 != null) {
            if (lg2.isTmpDetached()) {
                lg2.clearTmpDetachFlag();
            } else if (!lg2.shouldIgnore()) {
                object = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                ((StringBuilder)object).append(lg2);
                ((StringBuilder)object).append(this.m());
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
        }
        object.clearAnimation();
        this.B((View)object);
        super.removeDetachedView((View)object, bl2);
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.n.ba() && !this.ap() && view2 != null) {
            this.aH(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean bl2) {
        return this.n.bb(this, view, rect, bl2, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean bl2) {
        int n2 = this.q.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((ks)this.q.get(i2)).j();
        }
        super.requestDisallowInterceptTouchEvent(bl2);
    }

    public final void requestLayout() {
        if (this.ai == 0 && !this.w) {
            super.requestLayout();
            return;
        }
        this.v = true;
    }

    public final void s(lg object) {
        View view = ((lg)object).itemView;
        ViewParent viewParent = view.getParent();
        lg lg2 = this.i(view);
        this.e.m(lg2);
        if (((lg)object).isTmpDetached()) {
            this.h.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (viewParent != this) {
            this.h.g(view, -1, true);
            return;
        }
        object = this.h;
        int n2 = ((in)object).e.r(view);
        if (n2 >= 0) {
            ((in)object).a.e(n2);
            ((in)object).j(view);
            return;
        }
        Objects.toString(view);
        throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void scrollBy(int n2, int n3) {
        boolean bl2;
        ko ko2 = this.n;
        if (ko2 == null) {
            Log.e((String)"RecyclerView", (String)"Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.w) return;
        boolean bl3 = ko2.Y();
        boolean bl4 = bl2 = ko2.Z();
        if (!bl3) {
            if (!bl2) return;
            bl4 = true;
        }
        if (!bl3) {
            n2 = 0;
        }
        if (!bl4) {
            n3 = 0;
        }
        this.aq(n2, n3, null, 0);
    }

    public final void scrollTo(int n2, int n3) {
        Log.w((String)"RecyclerView", (String)"RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.ap()) {
            int n2 = 0;
            int n3 = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (n3 == 0) {
                n3 = n2;
            }
            this.ak |= n3;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public final void setClipToPadding(boolean bl2) {
        if (bl2 != this.i) {
            this.L();
        }
        this.i = bl2;
        super.setClipToPadding(bl2);
        if (this.u) {
            this.requestLayout();
        }
    }

    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public final void setNestedScrollingEnabled(boolean bl2) {
        this.az().a(bl2);
    }

    public final boolean startNestedScroll(int n2) {
        return this.az().i(n2, 0);
    }

    public final void stopNestedScroll() {
        this.az().b(0);
    }

    public final void suppressLayout(boolean bl2) {
        if (bl2 != this.w) {
            this.v("Do not suppressLayout in layout or scroll");
            if (!bl2) {
                this.w = false;
                if (this.v && this.n != null && this.m != null) {
                    this.requestLayout();
                }
                this.v = false;
                return;
            }
            long l2 = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain((long)l2, (long)l2, (int)3, (float)0.0f, (float)0.0f, (int)0));
            this.w = true;
            this.aj = true;
            this.ai();
        }
    }

    public void t(kl kl2) {
        ko ko2 = this.n;
        if (ko2 != null) {
            ko2.Q("Cannot add item decoration during a scroll  or layout");
        }
        if (this.p.isEmpty()) {
            this.setWillNotDraw(false);
        }
        this.p.add(kl2);
        this.O();
        this.requestLayout();
    }

    public final void u(kt kt2) {
        if (this.ax == null) {
            this.ax = new ArrayList();
        }
        this.ax.add(kt2);
    }

    public final void v(String string) {
        if (this.ap()) {
            if (string == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(this.m()));
            }
            throw new IllegalStateException(string);
        }
        if (this.an > 0) {
            Log.w((String)"RecyclerView", (String)"Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", (Throwable)new IllegalStateException("".concat(this.m())));
        }
    }

    final void x() {
        Object object;
        int n2;
        int n3 = this.h.c();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            object = RecyclerView.j(this.h.f(n2));
            if (((lg)object).shouldIgnore()) continue;
            ((lg)object).clearOldPosition();
        }
        object = this.e;
        n3 = ((kv)object).c.size();
        for (n2 = 0; n2 < n3; ++n2) {
            ((lg)((kv)object).c.get(n2)).clearOldPosition();
        }
        n3 = ((kv)object).a.size();
        for (n2 = 0; n2 < n3; ++n2) {
            ((lg)((kv)object).a.get(n2)).clearOldPosition();
        }
        ArrayList arrayList = ((kv)object).b;
        if (arrayList != null) {
            n3 = arrayList.size();
            for (n2 = n4; n2 < n3; ++n2) {
                ((lg)((kv)object).b.get(n2)).clearOldPosition();
            }
        }
    }

    public final void y(int n2, int n3) {
        boolean bl2;
        EdgeEffect edgeEffect = this.B;
        boolean bl3 = bl2 = false;
        if (edgeEffect != null) {
            bl3 = bl2;
            if (!edgeEffect.isFinished()) {
                bl3 = bl2;
                if (n2 > 0) {
                    this.B.onRelease();
                    bl3 = this.B.isFinished();
                }
            }
        }
        edgeEffect = this.D;
        bl2 = bl3;
        if (edgeEffect != null) {
            bl2 = bl3;
            if (!edgeEffect.isFinished()) {
                bl2 = bl3;
                if (n2 < 0) {
                    this.D.onRelease();
                    bl2 = bl3 | this.D.isFinished();
                }
            }
        }
        edgeEffect = this.C;
        bl3 = bl2;
        if (edgeEffect != null) {
            bl3 = bl2;
            if (!edgeEffect.isFinished()) {
                bl3 = bl2;
                if (n3 > 0) {
                    this.C.onRelease();
                    bl3 = bl2 | this.C.isFinished();
                }
            }
        }
        edgeEffect = this.E;
        bl2 = bl3;
        if (edgeEffect != null) {
            bl2 = bl3;
            if (!edgeEffect.isFinished()) {
                bl2 = bl3;
                if (n3 < 0) {
                    this.E.onRelease();
                    bl2 = bl3 | this.E.isFinished();
                }
            }
        }
        if (bl2) {
            this.postInvalidateOnAnimation();
        }
    }

    public final void z() {
        if (this.u && !this.z) {
            if (this.g.l()) {
                if (this.g.k(4) && !this.g.k(11)) {
                    block6: {
                        Trace.beginSection((String)"RV PartialInvalidate");
                        this.af();
                        this.Q();
                        this.g.g();
                        if (!this.v) {
                            int n2 = this.h.a();
                            for (int i2 = 0; i2 < n2; ++i2) {
                                lg lg2 = RecyclerView.j(this.h.e(i2));
                                if (lg2 == null || lg2.shouldIgnore() || !lg2.isUpdated()) continue;
                                this.C();
                                break block6;
                            }
                            this.g.d();
                        }
                    }
                    this.ag(true);
                    this.R();
                    Trace.endSection();
                    return;
                }
                if (this.g.l()) {
                    Trace.beginSection((String)"RV FullInvalidate");
                    this.C();
                    Trace.endSection();
                }
            }
            return;
        }
        Trace.beginSection((String)"RV FullInvalidate");
        this.C();
        Trace.endSection();
    }
}

