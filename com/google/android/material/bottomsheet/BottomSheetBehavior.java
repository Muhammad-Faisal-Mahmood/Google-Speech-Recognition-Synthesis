/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseIntArray
 *  android.util.TypedValue
 *  android.view.MotionEvent
 *  android.view.RoundedCorner
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.WindowInsets
 *  android.view.animation.PathInterpolator
 */
package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BottomSheetBehavior
extends rw {
    public WeakReference A;
    public WeakReference B;
    public int C;
    public boolean D;
    final SparseIntArray E;
    private int F = 0;
    private float G;
    private boolean H;
    private int I;
    private int J;
    private ColorStateList K;
    private int L = -1;
    private int M = -1;
    private boolean N;
    private boolean O;
    private boolean P;
    private fxm Q;
    private boolean R;
    private final fuk S = new fuk(this);
    private ValueAnimator T;
    private boolean U = true;
    private boolean V;
    private boolean W;
    private int X;
    private boolean Y;
    private final float Z;
    public boolean a = true;
    private int aa;
    private final ArrayList ab = new ArrayList();
    private VelocityTracker ac;
    private int ad = -1;
    private Map ae;
    private final ys af;
    public int b;
    public int c;
    public fxi d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    int n;
    public int o;
    public int p;
    float q = 0.5f;
    public int r;
    float s = -1.0f;
    public boolean t;
    public boolean u;
    public boolean v = true;
    public int w = 4;
    public yt x;
    int y;
    public int z;

    public BottomSheetBehavior() {
        this.Z = 0.1f;
        this.E = new SparseIntArray();
        this.af = new fuf(this);
    }

    public BottomSheetBehavior(Context context, AttributeSet object) {
        super(context, (AttributeSet)object);
        this.Z = 0.1f;
        this.E = new SparseIntArray();
        this.af = new fuf(this);
        this.J = context.getResources().getDimensionPixelSize(2131166469);
        TypedArray typedArray = context.obtainStyledAttributes((AttributeSet)object, fum.a);
        int n2 = 3;
        if (typedArray.hasValue(3)) {
            this.K = fvc.o(context, typedArray, 3);
        }
        if (typedArray.hasValue(22)) {
            this.Q = new fxm(fxm.f(context, (AttributeSet)object, 2130968731, 2132084253));
        }
        if (this.Q != null) {
            object = new fxi(this.Q);
            this.d = object;
            ((fxi)object).i(context);
            object = this.K;
            if (object != null) {
                this.d.l((ColorStateList)object);
            } else {
                object = new TypedValue();
                context.getTheme().resolveAttribute(0x1010031, (TypedValue)object, true);
                this.d.setTint(((TypedValue)object).data);
            }
        }
        object = ValueAnimator.ofFloat((float[])new float[]{this.R(), 1.0f});
        this.T = object;
        object.setDuration(500L);
        this.T.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new fud(this, 0));
        this.s = typedArray.getDimension(2, -1.0f);
        if (typedArray.hasValue(0)) {
            this.L = typedArray.getDimensionPixelSize(0, -1);
        }
        if (typedArray.hasValue(1)) {
            this.M = typedArray.getDimensionPixelSize(1, -1);
        }
        if ((object = typedArray.peekValue(10)) != null && ((TypedValue)object).data == -1) {
            this.K(((TypedValue)object).data);
        } else {
            this.K(typedArray.getDimensionPixelSize(10, -1));
        }
        boolean bl2 = typedArray.getBoolean(9, false);
        if (this.t != bl2) {
            this.t = bl2;
            if (!bl2 && this.w == 5) {
                this.L(4);
            }
            this.Y();
        }
        this.N = typedArray.getBoolean(14, false);
        bl2 = typedArray.getBoolean(7, true);
        if (this.a != bl2) {
            this.a = bl2;
            if (this.A != null) {
                this.U();
            }
            if (!this.a || this.w != 6) {
                n2 = this.w;
            }
            this.M(n2);
            this.Z(this.w, true);
            this.Y();
        }
        this.u = typedArray.getBoolean(13, false);
        this.v = typedArray.getBoolean(4, true);
        this.U = typedArray.getBoolean(5, true);
        this.F = typedArray.getInt(11, 0);
        float f2 = typedArray.getFloat(8, 0.5f);
        if (!(f2 <= 0.0f) && !(f2 >= 1.0f)) {
            this.q = f2;
            if (this.A != null) {
                this.V();
            }
            if ((object = typedArray.peekValue(6)) != null && ((TypedValue)object).type == 16) {
                this.J(((TypedValue)object).data);
            } else {
                this.J(typedArray.getDimensionPixelOffset(6, 0));
            }
            this.b = typedArray.getInt(12, 500);
            this.f = typedArray.getBoolean(18, false);
            this.g = typedArray.getBoolean(19, false);
            this.h = typedArray.getBoolean(20, false);
            this.O = typedArray.getBoolean(21, true);
            this.i = typedArray.getBoolean(15, false);
            this.j = typedArray.getBoolean(16, false);
            this.k = typedArray.getBoolean(17, false);
            this.P = typedArray.getBoolean(24, true);
            typedArray.recycle();
            this.G = ViewConfiguration.get((Context)context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    private final float R() {
        WeakReference weakReference;
        if (this.d != null && (weakReference = this.A) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            weakReference = (View)this.A.get();
            if (this.ab() && (weakReference = weakReference.getRootWindowInsets()) != null) {
                fxi fxi2 = this.d;
                float[] fArray = fxi2.h;
                float f2 = fArray != null ? fArray[3] : fxi2.a.a.b.a(fxi2.h());
                float f3 = BottomSheetBehavior.ad(f2, ut$$ExternalSyntheticApiModelOutline0.m((WindowInsets)weakReference, 0));
                fxi2 = this.d;
                fArray = fxi2.h;
                f2 = fArray != null ? fArray[0] : fxi2.a.a.c.a(fxi2.h());
                return Math.max(f3, BottomSheetBehavior.ad(f2, ut$$ExternalSyntheticApiModelOutline0.m((WindowInsets)weakReference, 1)));
            }
        }
        return 0.0f;
    }

    private final int S() {
        int n2;
        if (this.H) {
            return Math.min(Math.max(this.I, this.z - this.y * 9 / 16), this.aa) + this.l;
        }
        if (!this.N && !this.f && (n2 = this.e) > 0) {
            return Math.max(this.c, n2 + this.J);
        }
        return this.c + this.l;
    }

    private final int T(int n2) {
        if (n2 != 3) {
            if (n2 != 4) {
                if (n2 != 5) {
                    return this.p;
                }
                return this.z;
            }
            return this.r;
        }
        return this.G();
    }

    private final void U() {
        int n2 = this.S();
        if (this.a) {
            this.r = Math.max(this.z - n2, this.o);
            return;
        }
        this.r = this.z - n2;
    }

    private final void V() {
        this.p = (int)((float)this.z * (1.0f - this.q));
    }

    private final void W(View view, xu xu2, int n2) {
        wj.s(view, xu2, new fug(this, n2));
    }

    private final void X() {
        this.C = -1;
        this.ad = -1;
        VelocityTracker velocityTracker = this.ac;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ac = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void Y() {
        WeakReference weakReference = this.A;
        if (weakReference == null || (weakReference = (View)weakReference.get()) == null) return;
        wj.k((View)weakReference, 524288);
        wj.k((View)weakReference, 262144);
        wj.k((View)weakReference, 0x100000);
        int n2 = this.E.get(0, -1);
        if (n2 != -1) {
            wj.k((View)weakReference, n2);
            this.E.delete(0);
        }
        boolean bl2 = this.a;
        int n3 = 6;
        if (!bl2 && this.w != 6) {
            fug fug2;
            String string;
            SparseIntArray sparseIntArray;
            block11: {
                sparseIntArray = this.E;
                string = weakReference.getResources().getString(2132017206);
                fug2 = new fug(this, 6);
                List list = wj.g((View)weakReference);
                for (n2 = 0; n2 < list.size(); ++n2) {
                    if (!TextUtils.equals((CharSequence)string, (CharSequence)((xu)list.get(n2)).b())) continue;
                    n2 = ((xu)list.get(n2)).a();
                    break block11;
                }
                n2 = -1;
                for (int i2 = 0; i2 < 32 && n2 == -1; ++i2) {
                    int n4 = wj.a[i2];
                    boolean bl3 = true;
                    for (n2 = 0; n2 < list.size(); ++n2) {
                        boolean bl4 = ((xu)list.get(n2)).a() != n4;
                        bl3 &= bl4;
                    }
                    n2 = n4;
                    if (bl3) continue;
                    n2 = -1;
                }
            }
            if (n2 != -1) {
                wj.h((View)weakReference, new xu(null, n2, string, fug2, null));
            }
            sparseIntArray.put(0, n2);
        }
        if (this.t && this.w != 5) {
            this.W((View)weakReference, xu.e, 5);
        }
        if ((n2 = this.w) != 3) {
            if (n2 != 4) {
                if (n2 != 6) return;
                this.W((View)weakReference, xu.d, 4);
                this.W((View)weakReference, xu.c, 3);
                return;
            }
            if (this.a) {
                n3 = 3;
            }
            this.W((View)weakReference, xu.c, n3);
            return;
        }
        if (this.a) {
            n3 = 4;
        }
        this.W((View)weakReference, xu.d, n3);
    }

    private final void Z(int n2, boolean bl2) {
        boolean bl3;
        if (n2 != 2 && this.R != (bl3 = this.w == 3 && (this.P || this.ab())) && this.d != null) {
            Object object;
            this.R = bl3;
            float f2 = 1.0f;
            if (bl2 && (object = this.T) != null) {
                if (object.isRunning()) {
                    this.T.reverse();
                    return;
                }
                float f3 = this.d.a.k;
                if (bl3) {
                    f2 = this.R();
                }
                this.T.setFloatValues(new float[]{f3, f2});
                this.T.start();
                return;
            }
            object = this.T;
            if (object != null && object.isRunning()) {
                this.T.cancel();
            }
            object = this.d;
            if (this.R) {
                f2 = this.R();
            }
            ((fxi)object).m(f2);
        }
    }

    private final void aa(boolean bl2) {
        block6: {
            int n2;
            int n3;
            Object object;
            block7: {
                int n4;
                object = this.A;
                if (object == null || !((object = ((View)((Reference)object).get()).getParent()) instanceof CoordinatorLayout)) break block6;
                object = (CoordinatorLayout)object;
                n3 = object.getChildCount();
                n2 = n4 = 0;
                if (!bl2) break block7;
                if (this.ae != null) break block6;
                this.ae = new HashMap(n3);
                n2 = n4;
            }
            while (n2 < n3) {
                View view = object.getChildAt(n2);
                if (view != this.A.get() && bl2) {
                    this.ae.put(view, view.getImportantForAccessibility());
                }
                ++n2;
            }
            if (!bl2) {
                this.ae = null;
            }
        }
    }

    private final boolean ab() {
        Object object = this.A;
        if (object != null && ((Reference)object).get() != null) {
            object = new int[2];
            ((View)this.A.get()).getLocationOnScreen((int[])object);
            if (object[1] == false) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean ac() {
        boolean bl2;
        yt yt2 = this.x;
        boolean bl3 = bl2 = false;
        if (yt2 == null) return bl3;
        if (this.v) return true;
        if (this.w == 1) return true;
        return bl2;
    }

    private static final float ad(float f2, RoundedCorner roundedCorner) {
        float f3;
        if (roundedCorner != null && (f3 = (float)ut$$ExternalSyntheticApiModelOutline0.m(roundedCorner)) > 0.0f && f2 > 0.0f) {
            return f3 / f2;
        }
        return 0.0f;
    }

    private static final int ae(int n2, int n3, int n4, int n5) {
        n3 = ViewGroup.getChildMeasureSpec((int)n2, (int)n3, (int)n5);
        if (n4 == -1) {
            return n3;
        }
        n2 = View.MeasureSpec.getMode((int)n3);
        n3 = View.MeasureSpec.getSize((int)n3);
        if (n2 != 0x40000000) {
            n2 = n4;
            if (n3 != 0) {
                n2 = Math.min(n3, n4);
            }
            return View.MeasureSpec.makeMeasureSpec((int)n2, (int)Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec((int)Math.min(n3, n4), (int)0x40000000);
    }

    public final int G() {
        int n2;
        if (this.a) {
            n2 = this.o;
        } else {
            int n3 = this.n;
            n2 = this.O ? 0 : this.m;
            n2 = Math.max(n3, n2);
        }
        return n2;
    }

    final View H(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (wa.n(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            int n2 = viewGroup.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                view = this.H(viewGroup.getChildAt(i2));
                if (view == null) continue;
                return view;
            }
        }
        return null;
    }

    public final void I(int n2) {
        if ((View)this.A.get() != null && !this.ab.isEmpty()) {
            int n3;
            int n4 = this.r;
            int n5 = n3 = 0;
            if (n2 <= n4) {
                if (n4 == this.G()) {
                    n5 = n3;
                } else {
                    this.G();
                    n5 = n3;
                }
            }
            while (n5 < this.ab.size()) {
                ((fuh)this.ab.get(n5)).a();
                ++n5;
            }
        }
    }

    public final void J(int n2) {
        if (n2 >= 0) {
            this.n = n2;
            this.Z(this.w, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final void K(int n2) {
        block4: {
            block5: {
                block3: {
                    block2: {
                        if (n2 != -1) break block2;
                        if (this.H) break block3;
                        this.H = true;
                        break block4;
                    }
                    if (this.H || this.c != n2) break block5;
                }
                return;
            }
            this.H = false;
            this.c = Math.max(0, n2);
        }
        this.Q();
    }

    public final void L(int n2) {
        if (!this.t && n2 == 5) {
            Log.w((String)"BottomSheetBehavior", (String)"Cannot set state: 5");
            return;
        }
        int n3 = n2 == 6 && this.a && this.T(6) <= this.o ? 3 : n2;
        WeakReference weakReference = this.A;
        if (weakReference != null && weakReference.get() != null) {
            weakReference = (View)this.A.get();
            mp mp2 = new mp(this, (View)weakReference, n3, 7);
            ViewParent viewParent = weakReference.getParent();
            if (viewParent != null && viewParent.isLayoutRequested() && weakReference.isAttachedToWindow()) {
                weakReference.post(mp2);
                return;
            }
            mp2.run();
            return;
        }
        this.M(n2);
    }

    public final void M(int n2) {
        block6: {
            block8: {
                block10: {
                    int n3;
                    block9: {
                        int n4;
                        block7: {
                            WeakReference weakReference;
                            if (this.w == n2) break block6;
                            this.w = n2;
                            n4 = 4;
                            n3 = n2;
                            if (n2 != 4) {
                                n3 = n2;
                                if (n2 != 3) {
                                    n3 = n2;
                                    if (n2 != 6) {
                                        n3 = n2;
                                        if (this.t) {
                                            n3 = n2;
                                            if (n2 == 5) {
                                                n3 = 5;
                                            }
                                        }
                                    }
                                }
                            }
                            if ((weakReference = this.A) == null || (View)weakReference.get() == null) break block6;
                            int n5 = 0;
                            if (n3 != 3) break block7;
                            this.aa(true);
                            n2 = n3;
                            break block8;
                        }
                        if (n3 == 6 || n3 == 5) break block9;
                        n2 = n3;
                        if (n3 != 4) break block8;
                        n2 = n4;
                        break block10;
                    }
                    n2 = n3;
                }
                this.aa(false);
            }
            this.Z(n2, true);
            for (n2 = n5; n2 < this.ab.size(); ++n2) {
                ((fuh)this.ab.get(n2)).b();
            }
            this.Y();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void N(View var1_1, int var2_2, boolean var3_3) {
        block3: {
            block4: {
                var4_4 = this.T(var2_2);
                var6_5 = this.x;
                if (var6_5 == null) break block3;
                if (!var3_3) break block4;
                if (!var6_5.i(var1_1.getLeft(), var4_4)) break block3;
                ** GOTO lbl-1000
            }
            var5_6 = var1_1.getLeft();
            var6_5.d = var1_1;
            var6_5.c = -1;
            if (!var6_5.g(var5_6, var4_4, 0, 0)) {
                if (var6_5.a == 0 && var6_5.d != null) {
                    var6_5.d = null;
                }
            } else lbl-1000:
            // 2 sources

            {
                this.M(2);
                this.Z(var2_2, true);
                this.S.a(var2_2);
                return;
            }
        }
        this.M(var2_2);
    }

    public final boolean O() {
        return this.t;
    }

    public final boolean P(View view, float f2) {
        if (this.u) {
            return true;
        }
        if (view.getTop() < this.r) {
            return false;
        }
        int n2 = this.S();
        float f3 = view.getTop();
        float f4 = this.Z;
        float f5 = this.r;
        float f6 = n2;
        return Math.abs(f3 + f2 * f4 - f5) / f6 > 0.5f;
    }

    public final void Q() {
        if (this.A != null) {
            View view;
            this.U();
            if (this.w == 4 && (view = (View)this.A.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override
    public final void a(rz rz2) {
        this.A = null;
        this.x = null;
    }

    @Override
    public final void b() {
        this.A = null;
        this.x = null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void c(CoordinatorLayout var1_1, View var2_2, View var3_3, int var4_4) {
        block8: {
            block10: {
                block12: {
                    block14: {
                        block13: {
                            block11: {
                                block9: {
                                    var7_5 = var2_2.getTop();
                                    var6_6 = this.G();
                                    var4_4 = 3;
                                    if (var7_5 == var6_6) {
                                        this.M(3);
                                        return;
                                    }
                                    var1_1 = this.B;
                                    if (var1_1 == null || var3_3 != var1_1.get() || !this.Y) break block8;
                                    if (this.X <= 0) break block9;
                                    if (!this.a && var2_2.getTop() > this.p) lbl-1000:
                                    // 4 sources

                                    {
                                        while (true) {
                                            var4_4 = 6;
                                            ** GOTO lbl47
                                            break;
                                        }
                                    }
                                    break block10;
                                }
                                if (!this.t) break block11;
                                var1_1 = this.ac;
                                if (var1_1 == null) {
                                    var5_7 = 0.0f;
                                } else {
                                    var1_1.computeCurrentVelocity(1000, this.G);
                                    var5_7 = this.ac.getYVelocity(this.C);
                                }
                                if (!this.P(var2_2, var5_7)) break block11;
                                var4_4 = 5;
                                break block10;
                            }
                            if (this.X != 0) break block12;
                            var7_5 = var2_2.getTop();
                            if (!this.a) break block13;
                            if (Math.abs(var7_5 - this.o) >= Math.abs(var7_5 - this.r)) ** GOTO lbl-1000
                            break block10;
                        }
                        var6_6 = this.p;
                        if (var7_5 >= var6_6) break block14;
                        if (var7_5 >= Math.abs(var7_5 - this.r)) ** GOTO lbl-1000
                        break block10;
                    }
                    if (Math.abs(var7_5 - var6_6) >= Math.abs(var7_5 - this.r)) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                if (this.a) lbl-1000:
                // 4 sources

                {
                    while (true) {
                        var4_4 = 4;
                        break;
                    }
                } else {
                    if (Math.abs((var4_4 = var2_2.getTop()) - this.p) >= Math.abs(var4_4 - this.r)) ** continue;
                    ** continue;
                }
            }
            this.N(var2_2, var4_4, false);
            this.Y = false;
        }
    }

    @Override
    public final boolean d(CoordinatorLayout coordinatorLayout, View object, MotionEvent motionEvent) {
        if (object.isShown() && this.v) {
            float f2;
            WeakReference weakReference;
            int n2;
            int n3 = n2 = motionEvent.getActionMasked();
            if (n2 == 0) {
                this.X();
                n3 = 0;
            }
            if (this.ac == null) {
                this.ac = VelocityTracker.obtain();
            }
            this.ac.addMovement(motionEvent);
            Object var9_6 = null;
            if (n3 != 0) {
                if (n3 == 1 || n3 == 3) {
                    this.D = false;
                    this.C = -1;
                    if (this.W) {
                        this.W = false;
                        return false;
                    }
                }
            } else {
                n2 = (int)motionEvent.getX();
                this.ad = (int)motionEvent.getY();
                if (this.w != 2 && (weakReference = (weakReference = this.B) != null ? (View)weakReference.get() : null) != null && coordinatorLayout.k((View)weakReference, n2, this.ad)) {
                    this.C = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.D = true;
                }
                boolean bl2 = this.C == -1 && !coordinatorLayout.k((View)object, n2, this.ad);
                this.W = bl2;
            }
            if (!this.W && (object = this.x) != null && ((yt)object).j(motionEvent)) {
                return true;
            }
            weakReference = this.B;
            object = var9_6;
            if (weakReference != null) {
                object = (View)weakReference.get();
            }
            return n3 == 2 && object != null && !this.W && this.w != 1 && !coordinatorLayout.k((View)object, (int)motionEvent.getX(), (int)motionEvent.getY()) && this.x != null && (n3 = this.ad) != -1 && Math.abs((float)n3 - (f2 = motionEvent.getY())) > (float)this.x.b;
        }
        this.W = true;
        return false;
    }

    @Override
    public final boolean e(CoordinatorLayout object, View view, int n2) {
        int n3;
        block26: {
            Object object2;
            block28: {
                boolean bl2;
                block27: {
                    if (object.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        view.setFitsSystemWindows(true);
                    }
                    object2 = this.A;
                    int n4 = 0;
                    if (object2 != null) break block26;
                    this.I = object.getResources().getDimensionPixelSize(2131165468);
                    boolean bl3 = Build.VERSION.SDK_INT >= 29 && !this.N && !this.H;
                    bl2 = bl3;
                    if (this.f) break block27;
                    bl2 = bl3;
                    if (this.g) break block27;
                    bl2 = bl3;
                    if (this.h) break block27;
                    bl2 = bl3;
                    if (this.i) break block27;
                    bl2 = bl3;
                    if (this.j) break block27;
                    bl2 = bl3;
                    if (this.k) break block27;
                    if (!bl3) break block28;
                    bl2 = true;
                }
                wa.k(view, new fwn(new fue(this, bl2), new fwp(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
                if (view.isAttachedToWindow()) {
                    vy.d(view);
                } else {
                    view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)new fwo());
                }
            }
            ilo.g(view, new ful(view));
            this.A = new WeakReference<View>(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            object2 = view.getContext();
            fvc.p((Context)object2, 2130969602, 300);
            fvc.p((Context)object2, 2130969607, 150);
            fvc.p((Context)object2, 2130969606, 100);
            object2 = view.getResources();
            object2.getDimension(2131165890);
            object2.getDimension(2131165891);
            object2 = this.d;
            if (object2 != null) {
                float f2;
                view.setBackground((Drawable)object2);
                object2 = this.d;
                float f3 = f2 = this.s;
                if (f2 == -1.0f) {
                    f3 = wa.a(view);
                }
                ((fxi)object2).k(f3);
            } else {
                object2 = this.K;
                if (object2 != null) {
                    wa.h(view, (ColorStateList)object2);
                }
            }
            this.Y();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.x == null) {
            this.x = yt.b((ViewGroup)object, this.af);
        }
        int n5 = view.getTop();
        ((CoordinatorLayout)object).j(view, n2);
        this.y = object.getWidth();
        this.z = object.getHeight();
        this.aa = n3 = view.getHeight();
        int n6 = this.z;
        int n7 = this.m;
        n2 = n3;
        if (n6 - n3 < n7) {
            if (this.O) {
                n2 = this.M;
                n2 = n2 == -1 ? n6 : Math.min(n6, n2);
                this.aa = n2;
            } else {
                n2 = n6 - n7;
                n6 = this.M;
                if (n6 != -1) {
                    n2 = Math.min(n2, n6);
                }
                this.aa = n2;
            }
        }
        this.o = Math.max(0, this.z - n2);
        this.V();
        this.U();
        n2 = this.w;
        if (n2 == 3) {
            n2 = this.G();
            object = wj.a;
            view.offsetTopAndBottom(n2);
        } else if (n2 == 6) {
            n2 = this.p;
            object = wj.a;
            view.offsetTopAndBottom(n2);
        } else if (this.t && n2 == 5) {
            n2 = this.z;
            object = wj.a;
            view.offsetTopAndBottom(n2);
        } else if (n2 == 4) {
            n2 = this.r;
            object = wj.a;
            view.offsetTopAndBottom(n2);
        } else if (n2 == 1 || n2 == 2) {
            n2 = view.getTop();
            object = wj.a;
            view.offsetTopAndBottom(n5 - n2);
        }
        this.Z(this.w, false);
        this.B = new WeakReference<View>(this.H(view));
        for (n2 = n4; n2 < this.ab.size(); ++n2) {
            object = (fuh)this.ab.get(n2);
        }
        return true;
    }

    @Override
    public final boolean g(CoordinatorLayout object, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int n2 = motionEvent.getActionMasked();
        if (this.w == 1 && n2 == 0) {
            return true;
        }
        if (this.ac()) {
            this.x.e(motionEvent);
        }
        if (n2 == 0) {
            this.X();
        }
        if (this.ac == null) {
            this.ac = VelocityTracker.obtain();
        }
        this.ac.addMovement(motionEvent);
        if (this.ac() && n2 == 2 && !this.W) {
            float f2 = Math.abs((float)this.ad - motionEvent.getY());
            object = this.x;
            if (f2 > (float)((yt)object).b) {
                ((yt)object).d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.W;
    }

    @Override
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int n2, int n3, int n4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        view.measure(BottomSheetBehavior.ae(n2, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n3, this.L, marginLayoutParams.width), BottomSheetBehavior.ae(n4, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.M, marginLayoutParams.height));
        return true;
    }

    @Override
    public final boolean l(View view) {
        boolean bl2;
        WeakReference weakReference = this.B;
        boolean bl3 = bl2 = false;
        if (weakReference != null) {
            bl3 = bl2;
            if (view == weakReference.get()) {
                bl3 = bl2;
                if (this.w != 3) {
                    bl3 = bl2;
                    if (!this.V) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    @Override
    public final void m(CoordinatorLayout object, View view, View view2, int n2, int[] nArray, int n3) {
        block6: {
            block10: {
                block13: {
                    int n4;
                    int n5;
                    block12: {
                        boolean bl2;
                        block11: {
                            block8: {
                                block7: {
                                    block9: {
                                        if (n3 == 1 || view2 != (object = (object = this.B) != null ? (View)((Reference)object).get() : null)) break block6;
                                        n5 = view.getTop();
                                        n4 = n5 - n2;
                                        if (n2 <= 0) break block7;
                                        if (!this.Y && !this.U && view2 == object && view2.canScrollVertically(1)) break block8;
                                        if (n4 >= this.G()) break block9;
                                        nArray[1] = n3 = n5 - this.G();
                                        object = wj.a;
                                        view.offsetTopAndBottom(-n3);
                                        this.M(3);
                                        break block10;
                                    }
                                    if (!this.v) break block6;
                                    nArray[1] = n2;
                                    n3 = -n2;
                                    object = wj.a;
                                    view.offsetTopAndBottom(n3);
                                    this.M(1);
                                    break block10;
                                }
                                if (n2 >= 0) break block10;
                                bl2 = view2.canScrollVertically(-1);
                                if (this.Y || this.U || view2 != object) break block11;
                                if (!bl2) break block12;
                            }
                            this.V = true;
                            return;
                        }
                        if (bl2) break block10;
                    }
                    n3 = this.r;
                    if (n4 <= n3 || this.O()) break block13;
                    nArray[1] = n3 = n5 - n3;
                    object = wj.a;
                    view.offsetTopAndBottom(-n3);
                    this.M(4);
                    break block10;
                }
                if (!this.v) break block6;
                nArray[1] = n2;
                n3 = -n2;
                object = wj.a;
                view.offsetTopAndBottom(n3);
                this.M(1);
            }
            this.I(view.getTop());
            this.X = n2;
            this.Y = true;
            this.V = false;
        }
    }

    @Override
    public final void n(CoordinatorLayout coordinatorLayout, View view, int n2, int n3, int n4, int[] nArray) {
    }

    @Override
    public final void o(View object, Parcelable parcelable) {
        object = (fuj)parcelable;
        int n2 = this.F;
        int n3 = 4;
        if (n2 != 0) {
            if (n2 == -1 || (n2 & 1) == 1) {
                this.c = object.b;
            }
            if (n2 == -1 || (n2 & 2) == 2) {
                this.a = object.e;
            }
            if (n2 == -1 || (n2 & 4) == 4) {
                this.t = object.f;
            }
            if (n2 == -1 || (n2 & 8) == 8) {
                this.u = object.g;
            }
        }
        int n4 = object.a;
        n2 = n3;
        if (n4 != 1) {
            n2 = n4 == 2 ? n3 : n4;
        }
        this.w = n2;
    }

    @Override
    public final Parcelable p(View view) {
        return new fuj((Parcelable)View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int n2, int n3) {
        boolean bl2 = false;
        this.X = 0;
        this.Y = false;
        if ((n2 & 2) != 0) {
            bl2 = true;
        }
        return bl2;
    }
}

