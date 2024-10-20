/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.LayerDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Parcelable
 *  android.text.Layout$Alignment
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.Button
 *  android.widget.Checkable
 *  android.widget.CompoundButton
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatButton;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import j$.util.Objects;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class fup
extends AppCompatButton
implements Checkable,
fxx {
    private static final int[] f = new int[]{16842911};
    private static final int[] g = new int[]{0x10100A0};
    public float b;
    public int c;
    public int d;
    int e;
    private final fur h;
    private final LinkedHashSet i;
    private final PorterDuff.Mode j;
    private final ColorStateList k;
    private Drawable l;
    private final int m;
    private int n;
    private int o;
    private final int p;
    private boolean q;
    private boolean r;
    private final int s;
    private int t;

    public fup(Context object, AttributeSet object2) {
        Object object3;
        int n2;
        int n3;
        TypedArray typedArray;
        Object object4;
        block19: {
            block18: {
                super(fyl.a(object, (AttributeSet)object2, 2130969519, 2132084820), (AttributeSet)object2, 2130969519);
                this.i = new LinkedHashSet();
                this.q = false;
                this.r = false;
                this.t = -1;
                this.b = -1.0f;
                this.c = -1;
                this.d = -1;
                this.e = -1;
                object4 = this.getContext();
                typedArray = fwl.c((Context)object4, (AttributeSet)object2, fut.a, 2130969519, 2132084820);
                this.p = n3 = typedArray.getDimensionPixelSize(12, 0);
                this.j = a.e(typedArray.getInt(15, -1), PorterDuff.Mode.SRC_IN);
                this.k = fvc.o(this.getContext(), typedArray, 14);
                object = this.getContext();
                if (!typedArray.hasValue(10) || (n2 = typedArray.getResourceId(10, 0)) == 0) break block18;
                object3 = kh.g(object, n2);
                object = object3;
                if (object3 != null) break block19;
            }
            object = typedArray.getDrawable(10);
        }
        this.l = object;
        this.s = typedArray.getInteger(11, 1);
        this.m = typedArray.getDimensionPixelSize(13, 0);
        n2 = typedArray.getResourceId(17, 0);
        object = null;
        if (n2 != 0 && Objects.equals(object4.getResources().getResourceTypeName(n2), "xml")) {
            object3 = new kqr((Context)object4, n2);
            if (((kqr)object3).a != 0) {
                object = new izk((kqr)object3);
            }
        }
        object2 = object != null ? object.d : new fxm(fxm.f((Context)object4, (AttributeSet)object2, 2130969519, 2132084820));
        object2 = new fur(this, (fxm)object2);
        this.h = object2;
        ((fur)object2).d = typedArray.getDimensionPixelOffset(1, 0);
        ((fur)object2).e = typedArray.getDimensionPixelOffset(2, 0);
        ((fur)object2).f = typedArray.getDimensionPixelOffset(3, 0);
        ((fur)object2).g = typedArray.getDimensionPixelOffset(4, 0);
        if (typedArray.hasValue(8)) {
            ((fur)object2).h = n2 = typedArray.getDimensionPixelSize(8, -1);
            ((fur)object2).c(((fur)object2).b.b(n2));
        }
        ((fur)object2).i = typedArray.getDimensionPixelSize(20, 0);
        ((fur)object2).j = a.e(typedArray.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        ((fur)object2).k = fvc.o(((fur)object2).a.getContext(), typedArray, 6);
        ((fur)object2).l = fvc.o(((fur)object2).a.getContext(), typedArray, 19);
        ((fur)object2).m = fvc.o(((fur)object2).a.getContext(), typedArray, 16);
        ((fur)object2).p = typedArray.getBoolean(5, false);
        ((fur)object2).s = typedArray.getDimensionPixelSize(9, 0);
        ((fur)object2).q = typedArray.getBoolean(21, true);
        int n4 = ((fur)object2).a.getPaddingStart();
        int n5 = ((fur)object2).a.getPaddingTop();
        n2 = ((fur)object2).a.getPaddingEnd();
        int n6 = ((fur)object2).a.getPaddingBottom();
        if (typedArray.hasValue(0)) {
            ((fur)object2).b();
        } else {
            object4 = ((fur)object2).a;
            object3 = new fxi(((fur)object2).b);
            Object object5 = ((fur)object2).t;
            if (object5 != null) {
                ((fxi)object3).q((izk)object5);
            }
            if ((object5 = ((fur)object2).c) != null) {
                ((fxi)object3).j((zk)object5);
            }
            ((fxi)object3).i(((fur)object2).a.getContext());
            object3.setTintList(((fur)object2).k);
            object5 = ((fur)object2).j;
            if (object5 != null) {
                object3.setTintMode((PorterDuff.Mode)object5);
            }
            float f2 = ((fur)object2).i;
            object5 = ((fur)object2).l;
            ((fxi)object3).o(f2);
            ((fxi)object3).n((ColorStateList)object5);
            object5 = new fxi(((fur)object2).b);
            Object object6 = ((fur)object2).t;
            if (object6 != null) {
                ((fxi)object5).q((izk)object6);
            }
            if ((object6 = ((fur)object2).c) != null) {
                ((fxi)object5).j((zk)object6);
            }
            ((fxi)object5).setTint(0);
            ((fxi)object5).o(((fur)object2).i);
            ((fxi)object5).n(ColorStateList.valueOf((int)0));
            ((fur)object2).n = new fxi(((fur)object2).b);
            object6 = ((fur)object2).t;
            if (object6 != null) {
                ((fxi)((fur)object2).n).q((izk)object6);
            }
            if ((object6 = ((fur)object2).c) != null) {
                ((fxi)((fur)object2).n).j((zk)object6);
            }
            ((fur)object2).n.setTint(-1);
            ((fur)object2).r = new RippleDrawable(fwx.a(((fur)object2).m), (Drawable)new InsetDrawable((Drawable)new LayerDrawable(new Drawable[]{object5, object3}), ((fur)object2).d, ((fur)object2).f, ((fur)object2).e, ((fur)object2).g), ((fur)object2).n);
            super.setBackgroundDrawable((Drawable)((fur)object2).r);
            object3 = ((fur)object2).a();
            if (object3 != null) {
                ((fxi)object3).k(((fur)object2).s);
                object3.setState(((fur)object2).a.getDrawableState());
            }
        }
        ((fur)object2).a.setPaddingRelative(n4 + ((fur)object2).d, n5 + ((fur)object2).f, n2 + ((fur)object2).e, n6 + ((fur)object2).g);
        if (object != null) {
            object3 = new zk();
            ((zk)object3).c(0.6f);
            ((zk)object3).e(800.0f);
            ((fur)object2).c = object3;
            if (((fur)object2).t != null) {
                ((fur)object2).d();
            }
            ((fur)object2).t = object;
            ((fur)object2).d();
        }
        typedArray.recycle();
        this.setCompoundDrawablePadding(n3);
        boolean bl2 = this.l != null;
        this.h(bl2);
    }

    private final int a() {
        int n2 = this.getLineCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < n2; ++i2) {
            f2 = Math.max(f2, this.getLayout().getLineWidth(i2));
        }
        return (int)Math.ceil(f2);
    }

    private final void g() {
        if (this.k()) {
            this.setCompoundDrawablesRelative(this.l, null, null, null);
            return;
        }
        if (this.j()) {
            this.setCompoundDrawablesRelative(null, null, this.l, null);
            return;
        }
        if (this.l()) {
            this.setCompoundDrawablesRelative(null, this.l, null, null);
        }
    }

    private final void h(boolean bl2) {
        Drawable drawable = this.l;
        if (drawable != null) {
            int n2;
            int n3;
            this.l = drawable = drawable.mutate();
            drawable.setTintList(this.k);
            drawable = this.j;
            if (drawable != null) {
                this.l.setTintMode((PorterDuff.Mode)drawable);
            }
            int n4 = n3 = this.m;
            if (n3 == 0) {
                n4 = this.l.getIntrinsicWidth();
            }
            n3 = n2 = this.m;
            if (n2 == 0) {
                n3 = this.l.getIntrinsicHeight();
            }
            drawable = this.l;
            int n5 = this.n;
            n2 = this.o;
            drawable.setBounds(n5, n2, n4 + n5, n3 + n2);
            this.l.setVisible(true, bl2);
        }
        if (bl2) {
            this.g();
            return;
        }
        Drawable drawable2 = this.getCompoundDrawablesRelative();
        drawable = drawable2[0];
        Drawable drawable3 = drawable2[1];
        drawable2 = drawable2[2];
        if (this.k() && drawable != this.l || this.j() && drawable2 != this.l || this.l() && drawable3 != this.l) {
            this.g();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void i(int n2, int n3) {
        Layout.Alignment alignment;
        int n4;
        block15: {
            block13: {
                block14: {
                    block12: {
                        if (this.l == null) return;
                        if (this.getLayout() == null) {
                            return;
                        }
                        boolean bl2 = this.k();
                        n4 = 1;
                        if (!bl2 && !this.j()) {
                            if (!this.l()) return;
                            this.n = 0;
                            if (this.s == 16) {
                                this.o = 0;
                                this.h(false);
                                return;
                            }
                            n2 = n4 = this.m;
                            if (n4 == 0) {
                                n2 = this.l.getIntrinsicHeight();
                            }
                            if (this.getLineCount() > 1) {
                                n4 = this.getLayout().getHeight();
                            } else {
                                String string;
                                TextPaint textPaint = this.getPaint();
                                String string2 = string = this.getText().toString();
                                if (this.getTransformationMethod() != null) {
                                    string2 = this.getTransformationMethod().getTransformation((CharSequence)string, (View)this).toString();
                                }
                                string = new Rect();
                                textPaint.getTextBounds(string2, 0, string2.length(), (Rect)string);
                                n4 = Math.min(string.height(), this.getLayout().getHeight());
                            }
                            n2 = Math.max(0, (n3 - n4 - this.getPaddingTop() - n2 - this.p - this.getPaddingBottom()) / 2);
                            if (this.o == n2) return;
                            this.o = n2;
                            this.h(false);
                            return;
                        }
                        this.o = 0;
                        n3 = this.getTextAlignment();
                        if (n3 == 1) break block12;
                        if (n3 == 6 || n3 == 3) break block13;
                        if (n3 == 4) break block14;
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        break block15;
                    }
                    n3 = this.getGravity() & 0x800007;
                    if (n3 == 1) break block14;
                    if (n3 == 5 || n3 == 0x800005) break block13;
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break block15;
                }
                alignment = Layout.Alignment.ALIGN_CENTER;
                break block15;
            }
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        n3 = this.s;
        if (!(n3 == 1 || n3 == 3 || n3 == 2 && alignment == Layout.Alignment.ALIGN_NORMAL || this.s == 4 && alignment == Layout.Alignment.ALIGN_OPPOSITE)) {
            int n5;
            n3 = n5 = this.m;
            if (n5 == 0) {
                n3 = this.l.getIntrinsicWidth();
            }
            n2 = n3 = n2 - this.a() - this.getPaddingEnd() - n3 - this.p - this.getPaddingStart();
            if (alignment == Layout.Alignment.ALIGN_CENTER) {
                n2 = n3 / 2;
            }
            n3 = this.getLayoutDirection() != 1 ? 0 : 1;
            if (this.s != 4) {
                n4 = 0;
            }
            n5 = n2;
            if (n3 != n4) {
                n5 = -n2;
            }
            if (this.n == n5) return;
            this.n = n5;
            this.h(false);
            return;
        }
        this.n = 0;
        this.h(false);
    }

    private final boolean j() {
        int n2 = this.s;
        return n2 == 3 || n2 == 4;
        {
        }
    }

    private final boolean k() {
        int n2 = this.s;
        return n2 == 1 || n2 == 2;
        {
        }
    }

    private final boolean l() {
        int n2 = this.s;
        return n2 == 16 || n2 == 32;
        {
        }
    }

    private final boolean m() {
        fur fur2 = this.h;
        return fur2 != null && !fur2.o;
    }

    final String b() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        Class clazz = true != this.f() ? Button.class : CompoundButton.class;
        return clazz.getName();
    }

    @Override
    public final void c(fxm fxm2) {
        if (this.m()) {
            this.h.c(fxm2);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public final void d(ColorStateList colorStateList) {
        if (this.m()) {
            fur fur2 = this.h;
            if (fur2.k != colorStateList) {
                fur2.k = colorStateList;
                if (fur2.a() != null) {
                    fur2.a().setTintList(fur2.k);
                    return;
                }
            }
        } else {
            hf hf2 = this.a;
            if (hf2 != null) {
                if (hf2.a == null) {
                    hf2.a = new lw();
                }
                lw lw2 = hf2.a;
                lw2.a = colorStateList;
                lw2.d = true;
                hf2.a();
            }
        }
    }

    public final void e(PorterDuff.Mode mode) {
        if (this.m()) {
            fur fur2 = this.h;
            if (fur2.j != mode) {
                fur2.j = mode;
                if (fur2.a() != null && fur2.j != null) {
                    fur2.a().setTintMode(fur2.j);
                    return;
                }
            }
        } else {
            hf hf2 = this.a;
            if (hf2 != null) {
                if (hf2.a == null) {
                    hf2.a = new lw();
                }
                lw lw2 = hf2.a;
                lw2.b = mode;
                lw2.c = true;
                hf2.a();
            }
        }
    }

    public final boolean f() {
        fur fur2 = this.h;
        return fur2 != null && fur2.p;
    }

    public final ColorStateList getBackgroundTintList() {
        Object object;
        object = this.m() ? this.h.k : ((object = this.a) != null && (object = ((hf)object).a) != null ? ((lw)object).a : null);
        return object;
    }

    public final PorterDuff.Mode getBackgroundTintMode() {
        Object object;
        object = this.m() ? this.h.j : ((object = this.a) != null && (object = ((hf)object).a) != null ? ((lw)object).b : null);
        return object;
    }

    public final boolean isChecked() {
        return this.q;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m()) {
            fxf.d((View)this, this.h.a());
        }
    }

    protected final int[] onCreateDrawableState(int n2) {
        int[] nArray = super.onCreateDrawableState(n2 + 2);
        if (this.f()) {
            fup.mergeDrawableStates((int[])nArray, (int[])f);
        }
        if (this.q) {
            fup.mergeDrawableStates((int[])nArray, (int[])g);
        }
        return nArray;
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)this.b());
        accessibilityEvent.setChecked(this.q);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)this.b());
        accessibilityNodeInfo.setCheckable(this.f());
        accessibilityNodeInfo.setChecked(this.q);
        accessibilityNodeInfo.setClickable(this.isClickable());
    }

    @Override
    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        super.onLayout(bl2, n2, n3, n4, n5);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
        n3 = this.getResources().getConfiguration().orientation;
        if (this.t != n3) {
            this.t = n3;
            this.b = -1.0f;
        }
        if (this.b == -1.0f) {
            this.b = n4 - n2;
        }
        if (this.e == -1) {
            Drawable drawable = this.l;
            if (drawable == null) {
                n2 = 0;
            } else {
                n4 = this.p;
                n2 = n3 = this.m;
                if (n3 == 0) {
                    n2 = drawable.getIntrinsicWidth();
                }
                n2 = n4 + n2;
            }
            this.e = this.getMeasuredWidth() - this.a() - n2;
        }
        if (this.c == -1) {
            this.c = this.getPaddingStart();
        }
        if (this.d == -1) {
            this.d = this.getPaddingEnd();
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fuo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (fuo)parcelable;
        super.onRestoreInstanceState(parcelable.d);
        this.setChecked(parcelable.a);
    }

    public final Parcelable onSaveInstanceState() {
        fuo fuo2 = new fuo(super.onSaveInstanceState());
        fuo2.a = this.q;
        return fuo2;
    }

    @Override
    protected final void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        super.onTextChanged(charSequence, n2, n3, n4);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.h.q) {
            this.toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        int[] nArray;
        super.refreshDrawableState();
        if (this.l != null && this.l.setState(nArray = this.getDrawableState())) {
            this.invalidate();
        }
    }

    public final void setBackground(Drawable drawable) {
        ((AppCompatButton)this).setBackgroundDrawable(drawable);
    }

    public final void setBackgroundColor(int n2) {
        if (this.m()) {
            fur fur2 = this.h;
            if (fur2.a() != null) {
                fur2.a().setTint(n2);
            }
            return;
        }
        super.setBackgroundColor(n2);
    }

    @Override
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.m()) {
            if (drawable != this.getBackground()) {
                Log.w((String)"MaterialButton", (String)"MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.h.b();
                super.setBackgroundDrawable(drawable);
                return;
            }
            this.getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override
    public final void setBackgroundResource(int n2) {
        Drawable drawable = n2 != 0 ? kh.g(this.getContext(), n2) : null;
        ((AppCompatButton)this).setBackgroundDrawable(drawable);
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.d(colorStateList);
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.e(mode);
    }

    public final void setChecked(boolean bl2) {
        if (this.f() && this.isEnabled() && this.q != bl2) {
            this.q = bl2;
            this.refreshDrawableState();
            if (!(this.getParent() instanceof fus)) {
                if (!this.r) {
                    this.r = true;
                    Iterator iterator = this.i.iterator();
                    while (iterator.hasNext()) {
                        ((fun)iterator.next()).a();
                    }
                    this.r = false;
                    return;
                }
            } else {
                fus fus2 = (fus)this.getParent();
                throw null;
            }
        }
    }

    public final void setElevation(float f2) {
        super.setElevation(f2);
        if (this.m()) {
            this.h.a().k(f2);
        }
    }

    public final void setTextAlignment(int n2) {
        super.setTextAlignment(n2);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public final void setWidth(int n2) {
        this.b = -1.0f;
        super.setWidth(n2);
    }

    public final void toggle() {
        this.setChecked(this.q ^ true);
    }
}

