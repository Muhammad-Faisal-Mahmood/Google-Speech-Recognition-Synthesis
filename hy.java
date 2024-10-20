/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ListAdapter
 *  android.widget.SpinnerAdapter
 */
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

public final class hy
extends jw
implements ia {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final ib d;
    private int s;

    public hy(ib ib2, Context context, AttributeSet attributeSet) {
        this.d = ib2;
        super(context, attributeSet, 2130969862);
        this.c = new Rect();
        this.l = ib2;
        this.y();
        this.m = new eyt(this, 1);
    }

    public static /* synthetic */ void m(hy hy2) {
        super.s();
    }

    @Override
    public final CharSequence d() {
        return this.a;
    }

    @Override
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override
    public final void h(int n2) {
        this.s = n2;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override
    public final void l(int n2, int n3) {
        boolean bl2 = this.u();
        this.n();
        this.x();
        super.s();
        jc jc2 = this.e;
        jc2.setChoiceMode(1);
        jc2.setTextDirection(n2);
        jc2.setTextAlignment(n3);
        n2 = this.d.getSelectedItemPosition();
        jc2 = this.e;
        if (this.u() && jc2 != null) {
            jc2.a = false;
            jc2.setSelection(n2);
            if (jc2.getChoiceMode() != 0) {
                jc2.setItemChecked(n2, true);
            }
        }
        if (!bl2 && (jc2 = this.d.getViewTreeObserver()) != null) {
            gj gj2 = new gj(this, 3);
            jc2.addOnGlobalLayoutListener(gj2);
            this.v(new hx(this, gj2));
        }
    }

    public final void n() {
        int n2;
        Object object = this.c();
        if (object != null) {
            object.getPadding(this.d.d);
            n2 = mi.a((View)this.d) ? this.d.d.right : -this.d.d.left;
        } else {
            object = this.d.d;
            ((Rect)object).right = 0;
            ((Rect)object).left = 0;
            n2 = 0;
        }
        object = this.d;
        int n3 = object.getPaddingLeft();
        int n4 = object.getPaddingRight();
        int n5 = object.getWidth();
        int n6 = ((ib)((Object)object)).c;
        if (n6 == -2) {
            int n7 = ((ib)((Object)object)).a((SpinnerAdapter)this.b, this.c());
            int n8 = this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.d.left - this.d.d.right;
            n6 = n7;
            if (n7 > n8) {
                n6 = n8;
            }
            this.r(Math.max(n6, n5 - n3 - n4));
        } else if (n6 == -1) {
            this.r(n5 - n3 - n4);
        } else {
            this.r(n6);
        }
        n2 = mi.a((View)this.d) ? (n2 += n5 - n4 - this.f - this.s) : (n2 += n3 + this.s);
        this.g = n2;
    }
}

