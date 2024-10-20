/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region$Op
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build$VERSION
 *  android.text.InputFilter
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.util.Property
 *  android.view.ActionMode$Callback
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.CompoundButton
 *  android.widget.TextView
 */
package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;

public class SwitchCompat
extends CompoundButton {
    private static final Property c = new ls(Float.class);
    private static final int[] d = new int[]{0x10100A0};
    private float A;
    private VelocityTracker B = VelocityTracker.obtain();
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private boolean K;
    private final TextPaint L;
    private ColorStateList M;
    private Layout N;
    private Layout O;
    private TransformationMethod P;
    private final ie Q;
    private final Rect R;
    private bxt S;
    public float a;
    ObjectAnimator b;
    private Drawable e;
    private ColorStateList f = null;
    private PorterDuff.Mode g = null;
    private boolean h = false;
    private boolean i = false;
    private Drawable j;
    private ColorStateList k = null;
    private PorterDuff.Mode l = null;
    private boolean m = false;
    private boolean n = false;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private CharSequence s;
    private CharSequence t;
    private CharSequence u;
    private CharSequence v;
    private boolean w;
    private int x;
    private int y;
    private float z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969931);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        int n3;
        boolean bl2;
        TextPaint textPaint;
        boolean bl3 = true;
        this.K = true;
        this.R = new Rect();
        lt.d((View)this, this.getContext());
        this.L = textPaint = new TextPaint(1);
        textPaint.density = this.getResources().getDisplayMetrics().density;
        AmbientDelegate ambientDelegate = AmbientDelegate.A(context, attributeSet, er.v, n2, 0);
        wj.l((View)this, context, er.v, attributeSet, (TypedArray)ambientDelegate.b, n2, 0);
        Object object = ambientDelegate.r(2);
        this.e = object;
        if (object != null) {
            object.setCallback((Drawable.Callback)this);
        }
        object = ambientDelegate.r(11);
        this.j = object;
        if (object != null) {
            object.setCallback((Drawable.Callback)this);
        }
        this.e(ambientDelegate.t(0));
        this.d(ambientDelegate.t(1));
        this.w = ambientDelegate.w(3, true);
        this.o = ambientDelegate.l(8, 0);
        this.p = ambientDelegate.l(5, 0);
        this.q = ambientDelegate.l(6, 0);
        this.r = ambientDelegate.w(4, false);
        object = ambientDelegate.q(9);
        if (object != null) {
            this.f = object;
            this.h = true;
        }
        if (this.g != (object = a.e(ambientDelegate.m(10, -1), null))) {
            this.g = object;
            this.i = true;
        }
        if (((bl2 = this.h) || this.i) && (object = this.e) != null && (bl2 || this.i)) {
            object = object.mutate();
            this.e = object;
            if (this.h) {
                object.setTintList(this.f);
            }
            if (this.i) {
                this.e.setTintMode(this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.getDrawableState());
            }
        }
        if ((object = ambientDelegate.q(12)) != null) {
            this.k = object;
            this.m = true;
        }
        if (this.l != (object = a.e(ambientDelegate.m(13, -1), null))) {
            this.l = object;
            this.n = true;
        }
        if (((bl2 = this.m) || this.n) && (object = this.j) != null && (bl2 || this.n)) {
            object = object.mutate();
            this.j = object;
            if (this.m) {
                object.setTintList(this.k);
            }
            if (this.n) {
                this.j.setTintMode(this.l);
            }
            if (this.j.isStateful()) {
                this.j.setState(this.getDrawableState());
            }
        }
        if ((n3 = ambientDelegate.p(7, 0)) != 0) {
            float f2;
            float f3;
            AmbientDelegate ambientDelegate2 = AmbientDelegate.y(context, n3, er.w);
            object = ambientDelegate2.q(3);
            this.M = object != null ? object : this.getTextColors();
            n3 = ambientDelegate2.l(0, 0);
            if (n3 != 0 && (f3 = (float)n3) != (f2 = textPaint.getTextSize())) {
                textPaint.setTextSize(f3);
                this.requestLayout();
            }
            n3 = ambientDelegate2.m(1, -1);
            int n4 = ambientDelegate2.m(2, -1);
            object = n3 != 1 ? (n3 != 2 ? (n3 != 3 ? null : Typeface.MONOSPACE) : Typeface.SERIF) : Typeface.SANS_SERIF;
            f3 = 0.0f;
            if (n4 > 0) {
                object = object == null ? Typeface.defaultFromStyle((int)n4) : Typeface.create((Typeface)object, (int)n4);
                this.c((Typeface)object);
                n3 = object != null ? object.getStyle() : 0;
                n3 = ~n3 & n4;
                if (1 != (n3 & 1)) {
                    bl3 = false;
                }
                textPaint.setFakeBoldText(bl3);
                if ((n3 & 2) != 0) {
                    f3 = -0.25f;
                }
                textPaint.setTextSkewX(f3);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                this.c((Typeface)object);
            }
            this.P = ambientDelegate2.w(17, false) ? new eu(this.getContext()) : null;
            this.e(this.s);
            this.d(this.u);
            ambientDelegate2.v();
        }
        object = new ie((TextView)this);
        this.Q = object;
        ((ie)object).h(attributeSet, n2);
        ambientDelegate.v();
        context = ViewConfiguration.get((Context)context);
        this.y = context.getScaledTouchSlop();
        this.C = context.getScaledMinimumFlingVelocity();
        this.m().u(attributeSet, n2);
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }

    private final int g() {
        float f2 = mi.a((View)this) ? 1.0f - this.a : this.a;
        return (int)(f2 * (float)this.h() + 0.5f);
    }

    private final int h() {
        Drawable drawable = this.j;
        if (drawable != null) {
            Rect rect = this.R;
            drawable.getPadding(rect);
            drawable = this.e;
            drawable = drawable != null ? iy.a(drawable) : iy.a;
            return this.D - this.F - rect.left - rect.right - drawable.left - drawable.right;
        }
        return 0;
    }

    private final Layout i(CharSequence charSequence) {
        int n2 = charSequence != null ? (int)Math.ceil(Layout.getDesiredWidth((CharSequence)charSequence, (TextPaint)this.L)) : 0;
        return new StaticLayout(charSequence, this.L, n2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final CharSequence j(CharSequence charSequence) {
        Object object = this.m().a;
        TransformationMethod transformationMethod = this.P;
        zt.g();
        object = charSequence;
        if (transformationMethod != null) {
            object = transformationMethod.getTransformation(charSequence, (View)this);
        }
        return object;
    }

    private final void k() {
        if (!((zt)((bzb)this.S.a).a).a.a) {
            return;
        }
        zl zl2 = zl.a;
    }

    private final boolean l() {
        return this.a > 0.5f;
    }

    private final bxt m() {
        if (this.S == null) {
            this.S = new bxt((TextView)this);
        }
        return this.S;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            CharSequence charSequence2 = charSequence = this.u;
            if (charSequence == null) {
                charSequence2 = this.getResources().getString(2132017158);
            }
            wj.o((View)this, charSequence2);
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            CharSequence charSequence2 = charSequence = this.s;
            if (charSequence == null) {
                charSequence2 = this.getResources().getString(2132017159);
            }
            wj.o((View)this, charSequence2);
        }
    }

    public final void c(Typeface typeface) {
        if (this.L.getTypeface() != null && !this.L.getTypeface().equals((Object)typeface) || this.L.getTypeface() == null && typeface != null) {
            this.L.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }

    public final void d(CharSequence charSequence) {
        this.u = charSequence;
        this.v = this.j(charSequence);
        this.O = null;
        if (this.w) {
            this.k();
        }
    }

    public final void draw(Canvas canvas) {
        int n2;
        Rect rect;
        Drawable drawable;
        int n3;
        int n4;
        int n5;
        block4: {
            int n6;
            int n7;
            int n8;
            block7: {
                int n9;
                int n10;
                block6: {
                    block5: {
                        n10 = this.G;
                        n5 = this.H;
                        n9 = this.I;
                        n4 = this.J;
                        n3 = this.g() + n10;
                        drawable = this.e;
                        drawable = drawable != null ? iy.a(drawable) : iy.a;
                        rect = this.R;
                        Drawable drawable2 = this.j;
                        n2 = n3;
                        if (drawable2 == null) break block4;
                        drawable2.getPadding(rect);
                        n8 = n3 + rect.left;
                        if (drawable == null) break block5;
                        n2 = n10;
                        if (drawable.left > rect.left) {
                            n2 = n10 + (drawable.left - rect.left);
                        }
                        n3 = drawable.top > rect.top ? drawable.top - rect.top + n5 : n5;
                        n7 = n9;
                        if (drawable.right > rect.right) {
                            n7 = n9 - (drawable.right - rect.right);
                        }
                        n10 = n2;
                        n9 = n7;
                        n6 = n3;
                        if (drawable.bottom <= rect.bottom) break block6;
                        n6 = n4 - (drawable.bottom - rect.bottom);
                        break block7;
                    }
                    n6 = n5;
                }
                n2 = n4;
                n3 = n6;
                n6 = n2;
                n7 = n9;
                n2 = n10;
            }
            this.j.setBounds(n2, n3, n7, n6);
            n2 = n8;
        }
        if ((drawable = this.e) != null) {
            drawable.getPadding(rect);
            n3 = n2 - rect.left;
            n2 = n2 + this.F + rect.right;
            this.e.setBounds(n3, n5, n2, n4);
            drawable = this.getBackground();
            if (drawable != null) {
                drawable.setHotspotBounds(n3, n5, n2, n4);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
        if ((drawable = this.j) != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    protected final void drawableStateChanged() {
        boolean bl2;
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable = this.e;
        boolean bl3 = bl2 = false;
        if (drawable != null) {
            bl3 = bl2;
            if (drawable.isStateful()) {
                bl3 = drawable.setState(nArray);
            }
        }
        drawable = this.j;
        bl2 = bl3;
        if (drawable != null) {
            bl2 = bl3;
            if (drawable.isStateful()) {
                bl2 = bl3 | drawable.setState(nArray);
            }
        }
        if (bl2) {
            this.invalidate();
        }
    }

    public final void e(CharSequence charSequence) {
        this.s = charSequence;
        this.t = this.j(charSequence);
        this.N = null;
        if (this.w) {
            this.k();
        }
    }

    public final void f(float f2) {
        this.a = f2;
        this.invalidate();
    }

    public final int getCompoundPaddingLeft() {
        int n2;
        if (!mi.a((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int n3 = n2 = super.getCompoundPaddingLeft() + this.D;
        if (!TextUtils.isEmpty((CharSequence)this.getText())) {
            n3 = n2 + this.q;
        }
        return n3;
    }

    public final int getCompoundPaddingRight() {
        int n2;
        if (mi.a((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int n3 = n2 = super.getCompoundPaddingRight() + this.D;
        if (!TextUtils.isEmpty((CharSequence)this.getText())) {
            n3 = n2 + this.q;
        }
        return n3;
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yj.d(super.getCustomSelectionActionModeCallback());
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        if ((drawable = this.j) != null) {
            drawable.jumpToCurrentState();
        }
        if ((drawable = this.b) != null && drawable.isStarted()) {
            this.b.end();
            this.b = null;
        }
    }

    protected final int[] onCreateDrawableState(int n2) {
        int[] nArray = super.onCreateDrawableState(n2 + 1);
        if (this.isChecked()) {
            SwitchCompat.mergeDrawableStates((int[])nArray, (int[])d);
        }
        return nArray;
    }

    protected final void onDraw(Canvas canvas) {
        int n2;
        Rect rect;
        super.onDraw(canvas);
        Object object = this.j;
        Rect rect2 = this.R;
        if (object != null) {
            object.getPadding(rect2);
        } else {
            rect2.setEmpty();
        }
        int n3 = this.H;
        int n4 = this.J;
        int n5 = rect2.top;
        int n6 = rect2.bottom;
        Drawable drawable = this.e;
        if (object != null) {
            if (this.r && drawable != null) {
                rect = iy.a(drawable);
                drawable.copyBounds(rect2);
                rect2.left += rect.left;
                rect2.right -= rect.right;
                n2 = canvas.save();
                canvas.clipRect(rect2, Region.Op.DIFFERENCE);
                object.draw(canvas);
                canvas.restoreToCount(n2);
            } else {
                object.draw(canvas);
            }
        }
        int n7 = canvas.save();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if ((rect = this.l() ? this.N : this.O) != null) {
            object = this.getDrawableState();
            rect2 = this.M;
            if (rect2 != null) {
                this.L.setColor(rect2.getColorForState((int[])object, 0));
            }
            this.L.drawableState = (int[])object;
            if (drawable != null) {
                drawable = drawable.getBounds();
                n2 = drawable.left + drawable.right;
            } else {
                n2 = this.getWidth();
            }
            int n8 = rect.getWidth();
            int n9 = rect.getHeight();
            n6 = (n3 + n5 + (n4 - n6)) / 2;
            n3 = n9 / 2;
            canvas.translate((float)((n2 /= 2) - (n8 /= 2)), (float)(n6 - n3));
            rect.draw(canvas);
        }
        canvas.restoreToCount(n7);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30 && !TextUtils.isEmpty((CharSequence)(charSequence = this.isChecked() ? this.s : this.u))) {
            CharSequence charSequence2 = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty((CharSequence)charSequence2)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(charSequence2);
            stringBuilder.append(' ');
            stringBuilder.append(charSequence);
            accessibilityNodeInfo.setText((CharSequence)stringBuilder);
        }
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        super.onLayout(bl2, n2, n3, n4, n5);
                        Drawable drawable = this.e;
                        n3 = 0;
                        if (drawable != null) {
                            drawable = this.R;
                            Drawable drawable2 = this.j;
                            if (drawable2 != null) {
                                drawable2.getPadding((Rect)drawable);
                            } else {
                                drawable.setEmpty();
                            }
                            drawable2 = iy.a(this.e);
                            n2 = Math.max(0, drawable2.left - drawable.left);
                            n3 = Math.max(0, drawable2.right - drawable.right);
                        } else {
                            n2 = 0;
                        }
                        if (mi.a((View)this)) {
                            n4 = this.getPaddingLeft() + n2;
                            n2 = this.D + n4 - n2 - n3;
                            n3 = n4;
                            n4 = n2;
                        } else {
                            n4 = this.getWidth() - this.getPaddingRight() - n3;
                            n3 = n4 - this.D + n2 + n3;
                        }
                        n2 = this.getGravity() & 0x70;
                        if (n2 == 16) break block6;
                        if (n2 == 80) break block7;
                        n2 = this.getPaddingTop();
                        n5 = this.E;
                        break block8;
                    }
                    n5 = this.getHeight() - this.getPaddingBottom();
                    n2 = n5 - this.E;
                    break block9;
                }
                int n6 = this.getPaddingTop();
                int n7 = this.getHeight();
                n2 = this.getPaddingBottom();
                n5 = this.E;
                n2 = (n6 + n7 - n2) / 2 - n5 / 2;
            }
            n5 += n2;
        }
        this.G = n3;
        this.H = n2;
        this.J = n5;
        this.I = n4;
    }

    public final void onMeasure(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.w) {
            if (this.N == null) {
                this.N = this.i(this.t);
            }
            if (this.O == null) {
                this.O = this.i(this.v);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.e;
        int n8 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            n7 = this.e.getIntrinsicWidth() - rect.left - rect.right;
            n6 = this.e.getIntrinsicHeight();
        } else {
            n7 = 0;
            n6 = 0;
        }
        if (this.w) {
            n5 = Math.max(this.N.getWidth(), this.O.getWidth());
            n4 = this.o;
            n4 = n5 + (n4 + n4);
        } else {
            n4 = 0;
        }
        this.F = Math.max(n4, n7);
        drawable = this.j;
        if (drawable != null) {
            drawable.getPadding(rect);
            n7 = this.j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
            n7 = n8;
        }
        int n9 = rect.left;
        n5 = rect.right;
        rect = this.e;
        n8 = n5;
        n4 = n9;
        if (rect != null) {
            rect = iy.a((Drawable)rect);
            n4 = Math.max(n9, rect.left);
            n8 = Math.max(n5, rect.right);
        }
        if (this.K) {
            n9 = this.p;
            n5 = this.F;
            n4 = Math.max(n9, n5 + n5 + n4 + n8);
        } else {
            n4 = this.p;
        }
        n6 = Math.max(n7, n6);
        this.D = n4;
        this.E = n6;
        super.onMeasure(n2, n3);
        if (this.getMeasuredHeight() < n6) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), n6);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = this.isChecked() ? this.s : this.u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        block18: {
            int n2;
            block15: {
                block16: {
                    float f2;
                    block17: {
                        this.B.addMovement(motionEvent);
                        n2 = motionEvent.getActionMasked();
                        if (n2 == 0) break block15;
                        f2 = 0.0f;
                        if (n2 == 1) break block16;
                        if (n2 == 2) break block17;
                        if (n2 == 3) break block16;
                        break block18;
                    }
                    n2 = this.x;
                    if (n2 != 1) {
                        if (n2 == 2) {
                            float f3;
                            float f4 = motionEvent.getX();
                            n2 = this.h();
                            float f5 = f4 - this.z;
                            f5 = n2 != 0 ? (f5 /= (float)n2) : (f5 > 0.0f ? 1.0f : -1.0f);
                            float f6 = f5;
                            if (mi.a((View)this)) {
                                f6 = -f5;
                            }
                            if ((f5 = f6 + (f3 = this.a)) < 0.0f) {
                                f5 = f2;
                            } else if (f5 > 1.0f) {
                                f5 = 1.0f;
                            }
                            if (f5 != f3) {
                                this.z = f4;
                                this.f(f5);
                            }
                            return true;
                        }
                    } else {
                        float f7 = motionEvent.getX();
                        float f8 = motionEvent.getY();
                        if (Math.abs(f7 - this.z) > (float)this.y || Math.abs(f8 - this.A) > (float)this.y) {
                            this.x = 2;
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.z = f7;
                            this.A = f8;
                            return true;
                        }
                    }
                    break block18;
                }
                if (this.x == 2) {
                    boolean bl2;
                    this.x = 0;
                    n2 = motionEvent.getAction() == 1 && this.isEnabled() ? 1 : 0;
                    boolean bl3 = this.isChecked();
                    if (n2 != 0) {
                        this.B.computeCurrentVelocity(1000);
                        float f9 = this.B.getXVelocity();
                        bl2 = Math.abs(f9) > (float)this.C ? (mi.a((View)this) ? f9 < 0.0f : f9 > 0.0f) : this.l();
                    } else {
                        bl2 = bl3;
                    }
                    if (bl2 != bl3) {
                        this.playSoundEffect(0);
                    }
                    this.setChecked(bl2);
                    MotionEvent motionEvent2 = MotionEvent.obtain((MotionEvent)motionEvent);
                    motionEvent2.setAction(3);
                    super.onTouchEvent(motionEvent2);
                    motionEvent2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.x = 0;
                this.B.clear();
                break block18;
            }
            float f10 = motionEvent.getX();
            float f11 = motionEvent.getY();
            if (this.isEnabled() && this.e != null) {
                int n3 = this.g();
                this.e.getPadding(this.R);
                n2 = this.H;
                int n4 = this.y;
                int n5 = this.G + n3 - n4;
                int n6 = this.F;
                int n7 = this.R.left;
                int n8 = this.R.right;
                n3 = this.y;
                int n9 = this.J;
                if (f10 > (float)n5 && f10 < (float)(n6 + n5 + n7 + n8 + n3) && f11 > (float)(n2 - n4) && f11 < (float)(n9 + n3)) {
                    this.x = 1;
                    this.z = f10;
                    this.A = f11;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.m();
        zt.g();
    }

    public final void setChecked(boolean bl2) {
        super.setChecked(bl2);
        bl2 = this.isChecked();
        if (bl2) {
            this.b();
        } else {
            this.a();
        }
        float f2 = true != bl2 ? 0.0f : 1.0f;
        if (this.getWindowToken() != null && this.isLaidOut()) {
            ObjectAnimator objectAnimator;
            this.b = objectAnimator = ObjectAnimator.ofFloat((Object)((Object)this), (Property)c, (float[])new float[]{f2});
            objectAnimator.setDuration(250L);
            this.b.setAutoCancel(true);
            this.b.start();
            return;
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f(f2);
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yj.e((TextView)this, callback));
    }

    public final void setFilters(InputFilter[] inputFilterArray) {
        this.m();
        zt.g();
        super.setFilters(inputFilterArray);
    }

    public final void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }

    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.j;
        {
        }
    }
}

