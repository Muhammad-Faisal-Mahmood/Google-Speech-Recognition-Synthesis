/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.view.ContextThemeWrapper
 *  android.view.Gravity
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.window.OnBackInvokedDispatcher
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.List;

public class Toolbar
extends ViewGroup
implements vf {
    private int A;
    private int B;
    private int C;
    private int D = 8388627;
    private ColorStateList E;
    private ColorStateList F;
    private boolean G;
    private boolean H;
    private final ArrayList I = new ArrayList();
    private final int[] J;
    private me K;
    private final Runnable L;
    private final AmbientMode$AmbientController M;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public ImageView e;
    public Drawable f;
    public CharSequence g;
    public ImageButton h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public ll s;
    public CharSequence t;
    public CharSequence u;
    public final ArrayList v = new ArrayList();
    public ArrayList w;
    public gy x;
    public lz y;
    public final bmu z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970110);
    }

    public Toolbar(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet, n2);
        int n3;
        this.J = new int[2];
        this.z = new bmu(new kd(this, 3, null));
        this.w = new ArrayList();
        this.M = new AmbientMode$AmbientController(this);
        this.L = new kd(this, 4);
        AmbientDelegate ambientDelegate = AmbientDelegate.A(this.getContext(), attributeSet, er.x, n2, 0);
        wj.l((View)this, (Context)object, er.x, attributeSet, (TypedArray)ambientDelegate.b, n2, 0);
        this.l = ambientDelegate.p(28, 0);
        this.m = ambientDelegate.p(19, 0);
        this.D = ambientDelegate.n(0, this.D);
        this.n = ambientDelegate.n(2, 48);
        n2 = n3 = ambientDelegate.k(22, 0);
        if (ambientDelegate.x(27)) {
            n2 = ambientDelegate.k(27, n3);
        }
        this.r = n2;
        this.q = n2;
        this.p = n2;
        this.o = n2;
        n2 = ambientDelegate.k(25, -1);
        if (n2 >= 0) {
            this.o = n2;
        }
        if ((n2 = ambientDelegate.k(24, -1)) >= 0) {
            this.p = n2;
        }
        if ((n2 = ambientDelegate.k(26, -1)) >= 0) {
            this.q = n2;
        }
        if ((n2 = ambientDelegate.k(23, -1)) >= 0) {
            this.r = n2;
        }
        this.A = ambientDelegate.l(13, -1);
        int n4 = ambientDelegate.k(9, Integer.MIN_VALUE);
        int n5 = ambientDelegate.k(5, Integer.MIN_VALUE);
        n2 = ambientDelegate.l(7, 0);
        n3 = ambientDelegate.l(8, 0);
        this.k();
        object = this.s;
        ((ll)object).h = false;
        if (n2 != Integer.MIN_VALUE) {
            ((ll)object).e = n2;
            ((ll)object).a = n2;
        }
        if (n3 != Integer.MIN_VALUE) {
            ((ll)object).f = n3;
            ((ll)object).b = n3;
        }
        if (n4 != Integer.MIN_VALUE || n5 != Integer.MIN_VALUE) {
            ((ll)object).a(n4, n5);
        }
        this.B = ambientDelegate.k(10, Integer.MIN_VALUE);
        this.C = ambientDelegate.k(6, Integer.MIN_VALUE);
        this.f = ambientDelegate.r(4);
        this.g = ambientDelegate.t(3);
        object = ambientDelegate.t(21);
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.v((CharSequence)object);
        }
        if (!TextUtils.isEmpty((CharSequence)(object = ambientDelegate.t(18)))) {
            this.u((CharSequence)object);
        }
        this.j = this.getContext();
        this.t(ambientDelegate.p(17, 0));
        object = ambientDelegate.r(16);
        if (object != null) {
            this.q((Drawable)object);
        }
        if (!TextUtils.isEmpty((CharSequence)(object = ambientDelegate.t(15)))) {
            this.p((CharSequence)object);
        }
        if ((object = ambientDelegate.r(11)) != null) {
            this.o((Drawable)object);
        }
        if (!TextUtils.isEmpty((CharSequence)(object = ambientDelegate.t(12)))) {
            if (!TextUtils.isEmpty((CharSequence)object)) {
                this.J();
            }
            if ((attributeSet = this.e) != null) {
                attributeSet.setContentDescription((CharSequence)object);
            }
        }
        if (ambientDelegate.x(29)) {
            attributeSet = ambientDelegate.q(29);
            this.E = attributeSet;
            object = this.b;
            if (object != null) {
                object.setTextColor((ColorStateList)attributeSet);
            }
        }
        if (ambientDelegate.x(20)) {
            object = ambientDelegate.q(20);
            this.F = object;
            attributeSet = this.c;
            if (attributeSet != null) {
                attributeSet.setTextColor((ColorStateList)object);
            }
        }
        if (ambientDelegate.x(14)) {
            this.n(ambientDelegate.p(14, 0));
        }
        ambientDelegate.v();
    }

    protected static final ma B(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ma) {
            return new ma((ma)layoutParams);
        }
        if (layoutParams instanceof dc) {
            return new ma((dc)layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ma((ViewGroup.MarginLayoutParams)layoutParams);
        }
        return new ma(layoutParams);
    }

    private final int C(int n2) {
        int n3 = this.getLayoutDirection();
        if ((n2 = Gravity.getAbsoluteGravity((int)n2, (int)n3) & 7) != 1 && n2 != 3 && n2 != 5) {
            if (n3 == 1) {
                return 5;
            }
            return 3;
        }
        return n2;
    }

    private final int D(View view, int n2) {
        int n3;
        ma ma2 = (ma)view.getLayoutParams();
        int n4 = view.getMeasuredHeight();
        n2 = n2 > 0 ? (n4 - n2) / 2 : 0;
        int n5 = n3 = ma2.a & 0x70;
        if (n3 != 16) {
            n5 = n3;
            if (n3 != 48) {
                n5 = n3;
                if (n3 != 80) {
                    n5 = this.D & 0x70;
                }
            }
        }
        if (n5 != 48) {
            if (n5 != 80) {
                n3 = this.getPaddingTop();
                int n6 = this.getPaddingBottom();
                n2 = this.getHeight();
                n5 = (n2 - n3 - n6 - n4) / 2;
                if (n5 < ma2.topMargin) {
                    n2 = ma2.topMargin;
                } else {
                    n4 = n2 - n6 - n4 - n5 - n3;
                    n2 = n5;
                    if (n4 < ma2.bottomMargin) {
                        n2 = Math.max(0, n5 - (ma2.bottomMargin - n4));
                    }
                }
                return n3 + n2;
            }
            return this.getHeight() - this.getPaddingBottom() - n4 - ma2.bottomMargin - n2;
        }
        return this.getPaddingTop() - n2;
    }

    private final int E(View view, int n2, int[] nArray, int n3) {
        ma ma2 = (ma)view.getLayoutParams();
        int n4 = ma2.leftMargin - nArray[0];
        n2 += Math.max(0, n4);
        nArray[0] = Math.max(0, -n4);
        n4 = this.D(view, n3);
        n3 = view.getMeasuredWidth();
        view.layout(n2, n4, n2 + n3, view.getMeasuredHeight() + n4);
        return n2 + (n3 + ma2.rightMargin);
    }

    private final int F(View view, int n2, int[] nArray, int n3) {
        ma ma2 = (ma)view.getLayoutParams();
        int n4 = ma2.rightMargin - nArray[1];
        n2 -= Math.max(0, n4);
        nArray[1] = Math.max(0, -n4);
        n3 = this.D(view, n3);
        n4 = view.getMeasuredWidth();
        view.layout(n2 - n4, n3, n2, view.getMeasuredHeight() + n3);
        return n2 - (n4 + ma2.leftMargin);
    }

    private final int G(View view, int n2, int n3, int n4, int n5, int[] nArray) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n6 = marginLayoutParams.leftMargin - nArray[0];
        int n7 = marginLayoutParams.rightMargin - nArray[1];
        int n8 = Math.max(0, n6) + Math.max(0, n7);
        nArray[0] = Math.max(0, -n6);
        nArray[1] = Math.max(0, -n7);
        view.measure(Toolbar.getChildMeasureSpec((int)n2, (int)(this.getPaddingLeft() + this.getPaddingRight() + n8 + n3), (int)marginLayoutParams.width), Toolbar.getChildMeasureSpec((int)n4, (int)(this.getPaddingTop() + this.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + n5), (int)marginLayoutParams.height));
        return view.getMeasuredWidth() + n8;
    }

    private final void H(List list, int n2) {
        int n3 = this.getLayoutDirection();
        int n4 = this.getChildCount();
        int n5 = Gravity.getAbsoluteGravity((int)n2, (int)this.getLayoutDirection());
        list.clear();
        if (n3 == 1) {
            n2 = n4;
            while ((n4 = n2 - 1) >= 0) {
                View view = this.getChildAt(n4);
                ma ma2 = (ma)view.getLayoutParams();
                n2 = n4;
                if (ma2.b != 0) continue;
                n2 = n4;
                if (!this.L(view)) continue;
                n2 = n4;
                if (this.C(ma2.a) != n5) continue;
                list.add(view);
                n2 = n4;
            }
        } else {
            for (n2 = 0; n2 < n4; ++n2) {
                View view = this.getChildAt(n2);
                ma ma3 = (ma)view.getLayoutParams();
                if (ma3.b != 0 || !this.L(view) || this.C(ma3.a) != n5) continue;
                list.add(view);
            }
        }
    }

    private final void I(View view, boolean bl2) {
        Object object = view.getLayoutParams();
        object = object == null ? new ma() : (!this.checkLayoutParams((ViewGroup.LayoutParams)object) ? Toolbar.B(object) : (ma)((Object)object));
        object.b = 1;
        if (bl2 && this.i != null) {
            view.setLayoutParams(object);
            this.v.add(view);
            return;
        }
        this.addView(view, (ViewGroup.LayoutParams)object);
    }

    private final void J() {
        if (this.e == null) {
            this.e = new hm(this.getContext(), null);
        }
    }

    private final boolean K(View view) {
        return view.getParent() == this || this.v.contains(view);
        {
        }
    }

    private final boolean L(View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    private static final int M(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return view.getMarginStart() + view.getMarginEnd();
    }

    private static final int N(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        return view.topMargin + view.bottomMargin;
    }

    private final void O(View view, int n2, int n3, int n4, int n5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n6 = Toolbar.getChildMeasureSpec((int)n2, (int)(this.getPaddingLeft() + this.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n3), (int)marginLayoutParams.width);
        n3 = Toolbar.getChildMeasureSpec((int)n4, (int)(this.getPaddingTop() + this.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin), (int)marginLayoutParams.height);
        n4 = View.MeasureSpec.getMode((int)n3);
        n2 = n3;
        if (n4 != 0x40000000) {
            n2 = n3;
            if (n5 >= 0) {
                n2 = n5;
                if (n4 != 0) {
                    n2 = Math.min(View.MeasureSpec.getSize((int)n3), n5);
                }
                n2 = View.MeasureSpec.makeMeasureSpec((int)n2, (int)0x40000000);
            }
        }
        view.measure(n6, n2);
    }

    public final me A() {
        if (this.K == null) {
            this.K = new me(this);
        }
        return this.K;
    }

    public final int a() {
        ll ll2 = this.s;
        if (ll2 != null) {
            int n2 = ll2.g ? ll2.a : ll2.b;
            return n2;
        }
        return 0;
    }

    public final int b() {
        ll ll2 = this.s;
        if (ll2 != null) {
            int n2 = ll2.g ? ll2.b : ll2.a;
            return n2;
        }
        return 0;
    }

    public final int c() {
        Object object = this.a;
        int n2 = object != null && (object = ((ActionMenuView)object).a) != null && ((fs)object).hasVisibleItems() ? Math.max(this.a(), Math.max(this.C, 0)) : this.a();
        return n2;
    }

    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && layoutParams instanceof ma;
    }

    public final int d() {
        int n2 = this.e() != null ? Math.max(this.b(), Math.max(this.B, 0)) : this.b();
        return n2;
    }

    public final Drawable e() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        this.l();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            actionMenuView = actionMenuView.g();
            if (this.y == null) {
                this.y = new lz(this);
            }
            this.a.c.o();
            lz lz2 = this.y;
            Context context = this.j;
            ((fs)((Object)actionMenuView)).h(lz2, context);
            this.w();
        }
        return this.a.g();
    }

    public final MenuInflater g() {
        return new fc(this.getContext());
    }

    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ma();
    }

    public final CharSequence h() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();
        Menu menu = this.f();
        for (int i2 = 0; i2 < menu.size(); ++i2) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    public final void j() {
        Object object = this.y;
        object = object == null ? null : ((lz)object).b;
        if (object != null) {
            ((fu)object).collapseActionView();
        }
    }

    public final void k() {
        if (this.s == null) {
            this.s = new ll();
        }
    }

    public final void l() {
        if (this.a == null) {
            Object object;
            this.a = object = new ActionMenuView(this.getContext());
            object.i(this.k);
            object = this.a;
            object.e = this.M;
            object.d = new ly(this, 0);
            object = new ma();
            ((ma)((Object)object)).a = this.n & 0x70 | 0x800005;
            this.a.setLayoutParams((ViewGroup.LayoutParams)object);
            this.I((View)this.a, false);
        }
    }

    public final void m() {
        if (this.d == null) {
            this.d = new hl(this.getContext(), null, 2130970109);
            ma ma2 = new ma();
            ma2.a = this.n & 0x70 | 0x800003;
            this.d.setLayoutParams((ViewGroup.LayoutParams)ma2);
        }
    }

    public void n(int n2) {
        this.g().inflate(n2, this.f());
    }

    public final void o(Drawable drawable) {
        ImageView imageView;
        if (drawable != null) {
            this.J();
            if (!this.K((View)this.e)) {
                this.I((View)this.e, true);
            }
        } else {
            imageView = this.e;
            if (imageView != null && this.K((View)imageView)) {
                this.removeView((View)this.e);
                this.v.remove(this.e);
            }
        }
        if ((imageView = this.e) != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w();
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.L);
        this.w();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int n2 = motionEvent.getActionMasked();
        int n3 = 9;
        int n4 = n2;
        if (n2 == 9) {
            this.H = false;
            n4 = 9;
        }
        if (!this.H) {
            boolean bl2 = super.onHoverEvent(motionEvent);
            if (n4 == 9) {
                n4 = n3;
                if (!bl2) {
                    this.H = true;
                    n4 = n3;
                }
            }
        }
        if (n4 == 10 || n4 == 3) {
            this.H = false;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    protected void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        Object object;
        int n8;
        int n9;
        int[] nArray;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        block51: {
            block52: {
                block49: {
                    block50: {
                        n2 = this.getLayoutDirection();
                        n14 = this.getWidth();
                        n13 = this.getHeight();
                        n12 = this.getPaddingLeft();
                        n11 = this.getPaddingRight();
                        n10 = n14 - n11;
                        nArray = this.J;
                        n9 = this.getPaddingTop();
                        n8 = this.getPaddingBottom();
                        nArray[1] = 0;
                        nArray[0] = 0;
                        object = wj.a;
                        n4 = this.getMinimumHeight();
                        n7 = n4 >= 0 ? Math.min(n4, n5 - n3) : 0;
                        n6 = n2 == 1 ? 1 : 0;
                        if (!this.L((View)this.d)) break block49;
                        if (n6 == 0) break block50;
                        n5 = this.F((View)this.d, n10, nArray, n7);
                        n4 = n12;
                        break block51;
                    }
                    n4 = this.E((View)this.d, n12, nArray, n7);
                    break block52;
                }
                n4 = n12;
            }
            n5 = n10;
        }
        n2 = n4;
        n3 = n5;
        if (this.L((View)this.h)) {
            if (n6 != 0) {
                n3 = this.F((View)this.h, n5, nArray, n7);
                n2 = n4;
            } else {
                n2 = this.E((View)this.h, n4, nArray, n7);
                n3 = n5;
            }
        }
        n5 = n2;
        n4 = n3;
        if (this.L((View)this.a)) {
            if (n6 != 0) {
                n5 = this.E((View)this.a, n2, nArray, n7);
                n4 = n3;
            } else {
                n4 = this.F((View)this.a, n3, nArray, n7);
                n5 = n2;
            }
        }
        n2 = this.getLayoutDirection() == 1 ? this.c() : this.d();
        n3 = this.getLayoutDirection() == 1 ? this.d() : this.c();
        nArray[0] = Math.max(0, n2 - n5);
        nArray[1] = Math.max(0, n3 - (n10 - n4));
        int n15 = Math.max(n5, n2);
        n3 = Math.min(n4, n10 - n3);
        n2 = n15;
        n5 = n3;
        if (this.L(this.i)) {
            if (n6 != 0) {
                n5 = this.F(this.i, n3, nArray, n7);
                n2 = n15;
            } else {
                n2 = this.E(this.i, n15, nArray, n7);
                n5 = n3;
            }
        }
        n3 = n2;
        n4 = n5;
        if (this.L((View)this.e)) {
            if (n6 != 0) {
                n4 = this.F((View)this.e, n5, nArray, n7);
                n3 = n2;
            } else {
                n3 = this.E((View)this.e, n2, nArray, n7);
                n4 = n5;
            }
        }
        boolean bl3 = this.L((View)this.b);
        bl2 = this.L((View)this.c);
        if (bl3) {
            object = (Object)((ma)this.b.getLayoutParams());
            n5 = ((ma)((Object)object)).topMargin;
            n2 = this.b.getMeasuredHeight();
            n2 = ((ma)((Object)object)).bottomMargin + (n5 + n2);
        } else {
            n2 = 0;
        }
        if (bl2) {
            object = (Object)((ma)this.c.getLayoutParams());
            n2 += ((ma)((Object)object)).topMargin + this.c.getMeasuredHeight() + ((ma)((Object)object)).bottomMargin;
        }
        if (!bl3 && !bl2) {
            n2 = n3;
            n3 = n4;
        } else {
            void var18_21;
            object = bl3 ? (Object)this.b : (Object)this.c;
            if (bl2) {
                TextView textView = this.c;
            } else {
                TextView textView = this.b;
            }
            object = (Object)((ma)object.getLayoutParams());
            ma ma2 = (ma)var18_21.getLayoutParams();
            n5 = bl3 && this.b.getMeasuredWidth() > 0 || bl2 && this.c.getMeasuredWidth() > 0 ? 1 : 0;
            n10 = this.D & 0x70;
            if (n10 != 48) {
                if (n10 != 80) {
                    n10 = (n13 - n9 - n8 - n2) / 2;
                    if (n10 < ((ma)((Object)object)).topMargin + this.q) {
                        n2 = ((ma)((Object)object)).topMargin + this.q;
                    } else {
                        n15 = n13 - n8 - n2 - n10 - n9;
                        n2 = n10;
                        if (n15 < ((ma)((Object)object)).bottomMargin + this.r) {
                            n2 = Math.max(0, n10 - (ma2.bottomMargin + this.r - n15));
                        }
                    }
                    n2 = n9 + n2;
                } else {
                    n2 = n13 - n8 - ma2.bottomMargin - this.r - n2;
                }
            } else {
                n2 = this.getPaddingTop() + ((ma)((Object)object)).topMargin + this.q;
            }
            if (n6 != 0) {
                if (n5 != 0) {
                    n6 = this.o;
                    n5 = 1;
                } else {
                    n6 = 0;
                    n5 = 0;
                }
                n4 -= Math.max(0, n6 -= nArray[1]);
                nArray[1] = Math.max(0, -n6);
                if (bl3) {
                    object = (Object)((ma)this.b.getLayoutParams());
                    n10 = n4 - this.b.getMeasuredWidth();
                    n6 = this.b.getMeasuredHeight() + n2;
                    this.b.layout(n10, n2, n4, n6);
                    n2 = n10 - this.p;
                    n6 += ((ma)((Object)object)).bottomMargin;
                } else {
                    n10 = n4;
                    n6 = n2;
                    n2 = n10;
                }
                if (bl2) {
                    object = (Object)((ma)this.c.getLayoutParams());
                    n15 = n6 + ((ma)((Object)object)).topMargin;
                    n10 = this.c.getMeasuredWidth();
                    n6 = this.c.getMeasuredHeight();
                    this.c.layout(n4 - n10, n15, n4, n6 + n15);
                    n6 = n4 - this.p;
                    n10 = ((ma)((Object)object)).bottomMargin;
                } else {
                    n6 = n4;
                }
                if (n5 != 0) {
                    n4 = Math.min(n2, n6);
                }
                n2 = n3;
                n3 = n4;
            } else {
                if (n5 != 0) {
                    n6 = this.o;
                    n5 = 1;
                } else {
                    n6 = 0;
                    n5 = 0;
                }
                n3 += Math.max(0, n6 -= nArray[0]);
                nArray[0] = Math.max(0, -n6);
                if (bl3) {
                    object = (Object)((ma)this.b.getLayoutParams());
                    n6 = this.b.getMeasuredWidth() + n3;
                    n10 = this.b.getMeasuredHeight() + n2;
                    this.b.layout(n3, n2, n6, n10);
                    n6 += this.p;
                    n2 = n10 + ((ma)((Object)object)).bottomMargin;
                } else {
                    n6 = n3;
                }
                if (bl2) {
                    object = (Object)((ma)this.c.getLayoutParams());
                    n10 = n2 + ((ma)((Object)object)).topMargin;
                    n2 = this.c.getMeasuredWidth() + n3;
                    n15 = this.c.getMeasuredHeight();
                    this.c.layout(n3, n10, n2, n15 + n10);
                    n10 = n2 + this.p;
                    n2 = ((ma)((Object)object)).bottomMargin;
                } else {
                    n10 = n3;
                }
                n2 = n3;
                n3 = n4;
                if (n5 != 0) {
                    n2 = Math.max(n6, n10);
                    n3 = n4;
                }
            }
        }
        this.H(this.I, 3);
        n5 = this.I.size();
        for (n4 = 0; n4 < n5; ++n4) {
            n2 = this.E((View)this.I.get(n4), n2, nArray, n7);
        }
        this.H(this.I, 5);
        n5 = this.I.size();
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = this.F((View)this.I.get(n4), n3, nArray, n7);
        }
        this.H(this.I, 1);
        ArrayList arrayList = this.I;
        n10 = nArray[0];
        n6 = nArray[1];
        n15 = arrayList.size();
        n4 = 0;
        for (n5 = 0; n5 < n15; n4 += n8 + object.getMeasuredWidth() + n9, ++n5) {
            object = (View)arrayList.get(n5);
            ma ma3 = (ma)object.getLayoutParams();
            n10 = ma3.leftMargin - n10;
            n6 = ma3.rightMargin - n6;
            n8 = Math.max(0, n10);
            n9 = Math.max(0, n6);
            n10 = Math.max(0, -n10);
            n6 = Math.max(0, -n6);
        }
        n5 = 0;
        n12 = n12 + (n14 - n12 - n11) / 2 - n4 / 2;
        n4 += n12;
        if (n12 >= n2) {
            n2 = n4 > n3 ? n12 - (n4 - n3) : n12;
        }
        n4 = this.I.size();
        n3 = n5;
        while (true) {
            if (n3 >= n4) {
                this.I.clear();
                return;
            }
            n2 = this.E((View)this.I.get(n3), n2, nArray, n7);
            ++n3;
        }
    }

    protected final void onMeasure(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n72 = mi.a((View)this);
        boolean bl2 = this.L((View)this.d);
        int n9 = 0;
        if (bl2) {
            this.O((View)this.d, n2, 0, n3, this.A);
            n8 = this.d.getMeasuredWidth() + Toolbar.M((View)this.d);
            n7 = Math.max(0, this.d.getMeasuredHeight() + Toolbar.N((View)this.d));
            n6 = View.combineMeasuredStates((int)0, (int)this.d.getMeasuredState());
        } else {
            n8 = 0;
            n6 = n7 = 0;
        }
        int n10 = n8;
        int n11 = n7;
        n8 = n6;
        if (this.L((View)this.h)) {
            this.O((View)this.h, n2, 0, n3, this.A);
            n10 = this.h.getMeasuredWidth() + Toolbar.M((View)this.h);
            n11 = Math.max(n7, this.h.getMeasuredHeight() + Toolbar.N((View)this.h));
            n8 = View.combineMeasuredStates((int)n6, (int)this.h.getMeasuredState());
        }
        int[] nArray = this.J;
        n6 = this.d();
        n7 = Math.max(n6, n10);
        nArray[n72] = Math.max(0, n6 - n10);
        if (this.L((View)this.a)) {
            this.O((View)this.a, n2, n7, n3, this.A);
            n6 = this.a.getMeasuredWidth() + Toolbar.M((View)this.a);
            n11 = Math.max(n11, this.a.getMeasuredHeight() + Toolbar.N((View)this.a));
            n8 = View.combineMeasuredStates((int)n8, (int)this.a.getMeasuredState());
        } else {
            n6 = 0;
        }
        int n12 = this.c();
        n10 = n7 + Math.max(n12, n6);
        nArray[n72 ^ 1] = Math.max(0, n12 - n6);
        int n13 = n11;
        n6 = n8;
        n7 = n10;
        if (this.L(this.i)) {
            n7 = n10 + this.G(this.i, n2, n10, n3, 0, nArray);
            n5 = Math.max(n11, this.i.getMeasuredHeight() + Toolbar.N(this.i));
            n6 = View.combineMeasuredStates((int)n8, (int)this.i.getMeasuredState());
        }
        n11 = n5;
        n8 = n6;
        n10 = n7;
        if (this.L((View)this.e)) {
            n10 = n7 + this.G((View)this.e, n2, n7, n3, 0, nArray);
            n11 = Math.max(n5, this.e.getMeasuredHeight() + Toolbar.N((View)this.e));
            n8 = View.combineMeasuredStates((int)n6, (int)this.e.getMeasuredState());
        }
        int n14 = this.getChildCount();
        n7 = n11;
        for (n6 = 0; n6 < n14; ++n6) {
            View view = this.getChildAt(n6);
            n12 = n7;
            int n15 = n8;
            n11 = n10;
            if (((ma)view.getLayoutParams()).b == 0) {
                n12 = n7;
                n15 = n8;
                n11 = n10;
                if (this.L(view)) {
                    n11 = n10 + this.G(view, n2, n10, n3, 0, nArray);
                    n12 = Math.max(n7, view.getMeasuredHeight() + Toolbar.N(view));
                    n15 = View.combineMeasuredStates((int)n8, (int)view.getMeasuredState());
                }
            }
            n7 = n12;
            n8 = n15;
            n10 = n11;
        }
        int n16 = this.q + this.r;
        n14 = this.o + this.p;
        if (this.L((View)this.b)) {
            this.G((View)this.b, n2, n10 + n14, n3, n16, nArray);
            n6 = this.b.getMeasuredWidth() + Toolbar.M((View)this.b);
            int n17 = this.b.getMeasuredHeight();
            n11 = Toolbar.N((View)this.b);
            n8 = View.combineMeasuredStates((int)n8, (int)this.b.getMeasuredState());
            n11 = n17 + n11;
        } else {
            n11 = 0;
            n6 = n9;
        }
        n12 = n6;
        n9 = n11;
        int n18 = n8;
        if (this.L((View)this.c)) {
            n12 = Math.max(n6, this.G((View)this.c, n2, n10 + n14, n3, n11 + n16, nArray));
            n9 = n11 + (this.c.getMeasuredHeight() + Toolbar.N((View)this.c));
            n4 = View.combineMeasuredStates((int)n8, (int)this.c.getMeasuredState());
        }
        n8 = Math.max(n7, n9);
        n9 = this.getPaddingLeft();
        n11 = this.getPaddingRight();
        n6 = this.getPaddingTop();
        n7 = this.getPaddingBottom();
        this.setMeasuredDimension(View.resolveSizeAndState((int)Math.max(n10 + n12 + (n9 + n11), this.getSuggestedMinimumWidth()), (int)n2, (int)(0xFF000000 & n4)), View.resolveSizeAndState((int)Math.max(n8 + (n6 + n7), this.getSuggestedMinimumHeight()), (int)n3, (int)(n4 << 16)));
    }

    protected final void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof mb)) {
            super.onRestoreInstanceState(object);
            return;
        }
        mb mb2 = (mb)object;
        super.onRestoreInstanceState(mb2.d);
        object = this.a;
        object = object != null ? object.a : null;
        int n2 = mb2.a;
        if (n2 != 0 && this.y != null && object != null && (object = object.findItem(n2)) != null) {
            object.expandActionView();
        }
        if (mb2.b) {
            this.removeCallbacks(this.L);
            this.post(this.L);
        }
    }

    public final void onRtlPropertiesChanged(int n2) {
        super.onRtlPropertiesChanged(n2);
        this.k();
        ll ll2 = this.s;
        boolean bl2 = ll2.g;
        boolean bl3 = true;
        if (n2 != 1) {
            bl3 = false;
        }
        if (bl3 == bl2) {
            return;
        }
        ll2.g = bl3;
        if (ll2.h) {
            int n3;
            if (bl3) {
                int n4;
                n2 = n4 = ll2.d;
                if (n4 == Integer.MIN_VALUE) {
                    n2 = ll2.e;
                }
                ll2.a = n2;
                n2 = n4 = ll2.c;
                if (n4 == Integer.MIN_VALUE) {
                    n2 = ll2.f;
                }
                ll2.b = n2;
                return;
            }
            n2 = n3 = ll2.c;
            if (n3 == Integer.MIN_VALUE) {
                n2 = ll2.e;
            }
            ll2.a = n2;
            n2 = n3 = ll2.d;
            if (n3 == Integer.MIN_VALUE) {
                n2 = ll2.f;
            }
            ll2.b = n2;
            return;
        }
        ll2.a = ll2.e;
        ll2.b = ll2.f;
    }

    protected final Parcelable onSaveInstanceState() {
        mb mb2 = new mb(super.onSaveInstanceState());
        Object object = this.y;
        if (object != null && (object = ((lz)object).b) != null) {
            mb2.a = ((fu)object).a;
        }
        mb2.b = this.y();
        return mb2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int n2;
        int n3 = n2 = motionEvent.getActionMasked();
        if (n2 == 0) {
            this.G = false;
            n3 = 0;
        }
        n2 = n3;
        if (!this.G) {
            boolean bl2 = super.onTouchEvent(motionEvent);
            n2 = n3;
            if (n3 == 0) {
                if (!bl2) {
                    this.G = true;
                }
                n2 = 0;
            }
        }
        if (n2 == 1 || n2 == 3) {
            this.G = false;
        }
        return true;
    }

    public final void p(CharSequence charSequence) {
        ImageButton imageButton;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.m();
        }
        if ((imageButton = this.d) != null) {
            imageButton.setContentDescription(charSequence);
            ag$$ExternalSyntheticApiModelOutline0.m((View)this.d, charSequence);
        }
    }

    public void q(Drawable drawable) {
        ImageButton imageButton;
        if (drawable != null) {
            this.m();
            if (!this.K((View)this.d)) {
                this.I((View)this.d, true);
            }
        } else {
            imageButton = this.d;
            if (imageButton != null && this.K((View)imageButton)) {
                this.removeView((View)this.d);
                this.v.remove(this.d);
            }
        }
        if ((imageButton = this.d) != null) {
            imageButton.setImageDrawable(drawable);
        }
    }

    @Override
    public final void r(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.z.I(ambientMode$AmbientController);
    }

    @Override
    public final void s(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.z.J(ambientMode$AmbientController);
    }

    public final void t(int n2) {
        if (this.k != n2) {
            this.k = n2;
            if (n2 == 0) {
                this.j = this.getContext();
                return;
            }
            this.j = new ContextThemeWrapper(this.getContext(), n2);
        }
    }

    public final void u(CharSequence charSequence) {
        TextView textView;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.c == null) {
                Context context = this.getContext();
                this.c = textView = new AppCompatTextView(context);
                textView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int n2 = this.m;
                if (n2 != 0) {
                    this.c.setTextAppearance(context, n2);
                }
                if ((textView = this.F) != null) {
                    this.c.setTextColor((ColorStateList)textView);
                }
            }
            if (!this.K((View)this.c)) {
                this.I((View)this.c, true);
            }
        } else {
            textView = this.c;
            if (textView != null && this.K((View)textView)) {
                this.removeView((View)this.c);
                this.v.remove(this.c);
            }
        }
        if ((textView = this.c) != null) {
            textView.setText(charSequence);
        }
        this.u = charSequence;
    }

    public final void v(CharSequence charSequence) {
        TextView textView;
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.b == null) {
                Context context = this.getContext();
                this.b = textView = new AppCompatTextView(context);
                textView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int n2 = this.l;
                if (n2 != 0) {
                    this.b.setTextAppearance(context, n2);
                }
                if ((textView = this.E) != null) {
                    this.b.setTextColor((ColorStateList)textView);
                }
            }
            if (!this.K((View)this.b)) {
                this.I((View)this.b, true);
            }
        } else {
            textView = this.b;
            if (textView != null && this.K((View)textView)) {
                this.removeView((View)this.b);
                this.v.remove(this.b);
            }
        }
        if ((textView = this.b) != null) {
            textView.setText(charSequence);
        }
        this.t = charSequence;
    }

    public final void w() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = a$$ExternalSyntheticApiModelOutline0.m((View)this);
            if (this.x() && onBackInvokedDispatcher != null) {
                this.isAttachedToWindow();
            }
        }
    }

    public final boolean x() {
        lz lz2 = this.y;
        return lz2 != null && lz2.b != null;
    }

    public final boolean y() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.l();
    }

    public final boolean z() {
        Object object = this.a;
        return object != null && (object = ((ActionMenuView)object).c) != null && ((gy)object).m();
    }
}

