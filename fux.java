/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.AnimatedStateListDrawable
 *  android.graphics.drawable.AnimatedVectorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.autofill.AutofillManager
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public final class fux
extends hg {
    private static final int e = 2132084844;
    private static final int[] f = new int[]{2130969897};
    private static final int[] g = new int[]{2130969896};
    private static final int[][] h;
    private static final int i;
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton.OnCheckedChangeListener w;
    private final azh x;
    private final azd y;

    static {
        int[] nArray = new int[]{16842910, 2130969896};
        int[] nArray2 = new int[]{16842910, 0x10100A0};
        int[] nArray3 = new int[]{-16842910, 0x10100A0};
        h = new int[][]{nArray, nArray2, {16842910, -16842912}, nArray3, {-16842910, -16842912}};
        i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public fux(Context object, AttributeSet attributeSet) {
        Object object2;
        block10: {
            block9: {
                int n2 = e;
                super(fyl.a((Context)object, attributeSet, 2130968810, n2), attributeSet);
                new LinkedHashSet();
                this.j = new LinkedHashSet();
                object2 = this.getContext();
                object = new azh((Context)object2);
                Resources resources = object2.getResources();
                Resources.Theme theme = object2.getTheme();
                object2 = td.a;
                resources = resources.getDrawable(2131231067, theme);
                resources.setCallback(((azh)((Object)object)).d);
                new azg(resources.getConstantState());
                ((azh)((Object)object)).e = resources;
                this.x = object;
                this.y = new fuu(this);
                resources = this.getContext();
                object = this.b;
                if (object == null) {
                    object = super.getButtonTintList() != null ? super.getButtonTintList() : null;
                }
                this.b = object;
                object = this.a;
                if (object != null) {
                    ((hi)object).b = true;
                    ((hi)object).a();
                }
                object = fuy.a;
                fwl.a((Context)resources, attributeSet, 2130968810, n2);
                fwl.b((Context)resources, attributeSet, 2130968810, n2);
                object2 = AmbientDelegate.A((Context)resources, attributeSet, (int[])object, 2130968810, n2);
                this.q = ((AmbientDelegate)object2).r(2);
                if (this.p != null && fvc.s((Context)resources, 2130969349, false)) {
                    n2 = ((AmbientDelegate)object2).p(0, 0);
                    int n3 = ((AmbientDelegate)object2).p(1, 0);
                    if (n2 == i && n3 == 0) {
                        super.setButtonDrawable(null);
                        this.p = kh.g((Context)resources, 2131231066);
                        this.r = true;
                        if (this.q == null) {
                            this.q = kh.g((Context)resources, 2131231068);
                        }
                    }
                }
                if (!((AmbientDelegate)object2).x(3) || (n2 = ((AmbientDelegate)object2).p(3, 0)) == 0) break block9;
                attributeSet = ye.f((Context)resources, n2);
                object = attributeSet;
                if (attributeSet != null) break block10;
            }
            object = ((AmbientDelegate)object2).q(3);
        }
        this.c = object;
        this.s = a.e(((AmbientDelegate)object2).m(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = ((AmbientDelegate)object2).w(10, false);
        this.m = ((AmbientDelegate)object2).w(6, true);
        this.n = ((AmbientDelegate)object2).w(9, false);
        this.o = ((AmbientDelegate)object2).t(8);
        if (((AmbientDelegate)object2).x(7)) {
            this.a(((AmbientDelegate)object2).m(7, 0));
        }
        ((AmbientDelegate)object2).v();
        this.b();
    }

    private final void b() {
        Object object;
        block22: {
            int n2;
            int n3;
            Object object2;
            block25: {
                float f2;
                float f3;
                float f4;
                int n4;
                int n5;
                block24: {
                    block23: {
                        this.p = fvc.e(this.p, this.b, this.getButtonTintMode());
                        this.q = fvc.e(this.q, this.c, this.s);
                        if (this.r) {
                            object = this.x;
                            if (object != null) {
                                Object object3;
                                object2 = this.y;
                                if (object2 != null) {
                                    object3 = object.e;
                                    if (object3 != null) {
                                        ((AnimatedVectorDrawable)object3).unregisterAnimationCallback(((azd)object2).a());
                                    }
                                    if ((object3 = object.c) != null) {
                                        ((ArrayList)object3).remove(object2);
                                        if (object.c.size() == 0 && (object2 = object.b) != null) {
                                            object.a.c.removeListener((Animator.AnimatorListener)object2);
                                            object.b = null;
                                        }
                                    }
                                }
                                object2 = this.x;
                                object3 = this.y;
                                if (object3 != null) {
                                    object = ((azh)((Object)object2)).e;
                                    if (object != null) {
                                        ((AnimatedVectorDrawable)object).registerAnimationCallback(((azd)object3).a());
                                    } else {
                                        if (((azh)((Object)object2)).c == null) {
                                            ((azh)((Object)object2)).c = new ArrayList();
                                        }
                                        if (!((azh)((Object)object2)).c.contains(object3)) {
                                            ((azh)((Object)object2)).c.add(object3);
                                            if (((azh)((Object)object2)).b == null) {
                                                ((azh)((Object)object2)).b = new aze((azh)((Object)object2));
                                            }
                                            ((azh)((Object)object2)).a.c.addListener(((azh)((Object)object2)).b);
                                        }
                                    }
                                }
                            }
                            if ((object = this.p) instanceof AnimatedStateListDrawable && (object2 = this.x) != null) {
                                ((AnimatedStateListDrawable)object).addTransition(2131427566, 2131428000, (Drawable)object2, false);
                                ((AnimatedStateListDrawable)this.p).addTransition(2131427691, 2131428000, (Drawable)this.x, false);
                            }
                        }
                        if ((object2 = this.p) != null && (object = this.b) != null) {
                            object2.setTintList((ColorStateList)object);
                        }
                        if ((object = this.q) != null && (object2 = this.c) != null) {
                            object.setTintList((ColorStateList)object2);
                        }
                        object2 = this.p;
                        object = this.q;
                        if (object2 == null) break block22;
                        if (object != null) break block23;
                        object = object2;
                        break block22;
                    }
                    n4 = n5 = object.getIntrinsicWidth();
                    if (n5 == -1) {
                        n4 = object2.getIntrinsicWidth();
                    }
                    n5 = n3 = object.getIntrinsicHeight();
                    if (n3 == -1) {
                        n5 = object2.getIntrinsicHeight();
                    }
                    if (n4 > object2.getIntrinsicWidth()) break block24;
                    n2 = n4;
                    n3 = n5;
                    if (n5 <= object2.getIntrinsicHeight()) break block25;
                }
                if ((f4 = (float)n4 / (float)n5) >= (f3 = (float)object2.getIntrinsicWidth()) / (f2 = (float)object2.getIntrinsicHeight())) {
                    n2 = object2.getIntrinsicWidth();
                    n3 = (int)((float)n2 / f4);
                } else {
                    n3 = object2.getIntrinsicHeight();
                    n2 = (int)(f4 * (float)n3);
                }
            }
            object = new LayerDrawable(new Drawable[]{object2, object});
            object.setLayerSize(1, n2, n3);
            object.setLayerGravity(1, 17);
        }
        super.setButtonDrawable((Drawable)object);
        this.refreshDrawableState();
    }

    private final void c() {
        if (Build.VERSION.SDK_INT >= 30 && this.v == null) {
            int n2 = this.t;
            String string = n2 == 1 ? this.getResources().getString(2132017374) : (n2 == 0 ? this.getResources().getString(2132017376) : this.getResources().getString(2132017375));
            super.setStateDescription((CharSequence)string);
        }
    }

    public final void a(int n2) {
        if (this.t != n2) {
            this.t = n2;
            boolean bl2 = n2 == 1;
            super.setChecked(bl2);
            this.refreshDrawableState();
            this.c();
            if (!this.u) {
                this.u = true;
                Object object = this.j;
                if (object != null) {
                    object = ((HashSet)object).iterator();
                    while (object.hasNext()) {
                        ((fuv)object.next()).a();
                    }
                }
                if (this.t != 2 && (object = this.w) != null) {
                    object.onCheckedChanged((CompoundButton)this, this.isChecked());
                }
                if ((object = ag$$ExternalSyntheticApiModelOutline0.m(this.getContext().getSystemService(ag$$ExternalSyntheticApiModelOutline0.m$2()))) != null) {
                    ag$$ExternalSyntheticApiModelOutline0.m((AutofillManager)object, (View)this);
                }
                this.u = false;
            }
        }
    }

    public final Drawable getButtonDrawable() {
        return this.p;
    }

    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    public final boolean isChecked() {
        return this.t == 1;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                int[][] nArray = h;
                int n2 = nArray.length;
                int n3 = fvc.h((View)this, 2130968890);
                int n4 = fvc.h((View)this, 2130968893);
                int n5 = fvc.h((View)this, 2130968966);
                n2 = fvc.h((View)this, 2130968924);
                this.k = new ColorStateList(nArray, new int[]{fvc.i(n5, n4, 1.0f), fvc.i(n5, n3, 1.0f), fvc.i(n5, n2, 0.54f), fvc.i(n5, n2, 0.38f), fvc.i(n5, n2, 0.38f)});
            }
            this.setButtonTintList(this.k);
        }
    }

    protected final int[] onCreateDrawableState(int n2) {
        int[] nArray;
        int[] nArray2;
        block5: {
            int n3;
            nArray2 = super.onCreateDrawableState(n2 + 2);
            if (this.t == 2) {
                fux.mergeDrawableStates((int[])nArray2, (int[])f);
            }
            if (this.n) {
                fux.mergeDrawableStates((int[])nArray2, (int[])g);
            }
            for (n2 = 0; n2 < (n3 = nArray2.length); ++n2) {
                n3 = nArray2[n2];
                if (n3 == 0x10100A0) {
                    nArray = nArray2;
                } else {
                    if (n3 != 0) continue;
                    nArray = (int[])nArray2.clone();
                    nArray[n2] = 0x10100A0;
                }
                break block5;
            }
            nArray = Arrays.copyOf(nArray2, n3 + 1);
            nArray[n3] = 0x10100A0;
        }
        this.d = nArray;
        return nArray2;
    }

    protected final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.m && TextUtils.isEmpty((CharSequence)this.getText()) && (drawable = this.p) != null) {
            boolean bl2 = fvd.c((View)this);
            int n2 = 1;
            if (bl2) {
                n2 = -1;
            }
            int n3 = this.getWidth();
            int n4 = drawable.getIntrinsicWidth();
            int n5 = canvas.save();
            n2 = (n3 - n4) / 2 * n2;
            canvas.translate((float)n2, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(n5);
            if (this.getBackground() != null) {
                canvas = drawable.getBounds();
                this.getBackground().setHotspotBounds(canvas.left + n2, canvas.top, canvas.right + n2, canvas.bottom);
            }
            return;
        }
        super.onDraw(canvas);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            String string = String.valueOf(accessibilityNodeInfo.getText());
            String string2 = String.valueOf(this.o);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(", ");
            stringBuilder.append(string2);
            accessibilityNodeInfo.setText((CharSequence)stringBuilder.toString());
        }
    }

    public final void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof fuw)) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (fuw)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        this.a(object.a);
    }

    public final Parcelable onSaveInstanceState() {
        fuw fuw2 = new fuw(super.onSaveInstanceState());
        fuw2.a = this.t;
        return fuw2;
    }

    @Override
    public final void setButtonDrawable(int n2) {
        ((hg)this).setButtonDrawable(kh.g(this.getContext(), n2));
    }

    @Override
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        this.b();
    }

    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        this.b();
    }

    public final void setButtonTintMode(PorterDuff.Mode mode) {
        hi hi2 = this.a;
        if (hi2 != null) {
            hi2.a = mode;
            hi2.c = true;
            hi2.a();
        }
        this.b();
    }

    public final void setChecked(boolean bl2) {
        this.a(bl2 ? 1 : 0);
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            this.c();
            return;
        }
        super.setStateDescription(charSequence);
    }

    public final void toggle() {
        this.a(this.isChecked() ^ 1);
    }
}

