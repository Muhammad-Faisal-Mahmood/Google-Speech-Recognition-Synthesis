/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.wear.ambient.AmbientMode$AmbientController;

public class ActionMenuItemView
extends AppCompatTextView
implements View.OnClickListener,
gf,
gz {
    public fu a;
    public fr b;
    public AmbientMode$AmbientController c;
    private CharSequence d;
    private Drawable e;
    private jg f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        Resources resources = context.getResources();
        this.g = this.l();
        context = context.obtainStyledAttributes(attributeSet, er.c, n2, 0);
        this.h = context.getDimensionPixelSize(0, 0);
        context.recycle();
        this.j = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener(this);
        this.i = -1;
        this.setSaveEnabled(false);
    }

    private final void k() {
        boolean bl2;
        boolean bl3;
        block6: {
            block7: {
                boolean bl4;
                bl3 = TextUtils.isEmpty((CharSequence)this.d);
                bl2 = bl4 = true;
                if (this.e == null) break block6;
                if ((this.a.n & 4) != 4) break block7;
                bl2 = bl4;
                if (this.g) break block6;
            }
            bl2 = false;
        }
        bl2 = (bl3 ^ true) & bl2;
        Object var5_4 = null;
        CharSequence charSequence = bl2 ? this.d : null;
        this.setText(charSequence);
        charSequence = this.a.l;
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            charSequence = bl2 ? null : this.a.d;
            this.setContentDescription(charSequence);
        } else {
            this.setContentDescription(charSequence);
        }
        charSequence = this.a.m;
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            charSequence = bl2 ? var5_4 : this.a.d;
            ag$$ExternalSyntheticApiModelOutline0.m((View)this, charSequence);
            return;
        }
        ag$$ExternalSyntheticApiModelOutline0.m((View)this, charSequence);
    }

    private final boolean l() {
        Configuration configuration = this.getContext().getResources().getConfiguration();
        int n2 = configuration.screenWidthDp;
        int n3 = configuration.screenHeightDp;
        return n2 >= 480 || configuration.orientation == 2;
        {
        }
    }

    @Override
    public final fu a() {
        return this.a;
    }

    public final boolean b() {
        return !TextUtils.isEmpty((CharSequence)this.getText());
    }

    @Override
    public final boolean c() {
        return this.b();
    }

    @Override
    public final boolean d() {
        return this.b() && this.a.getIcon() == null;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final void f(fu fu2) {
        int n2;
        Drawable drawable;
        this.a = fu2;
        this.e = drawable = fu2.getIcon();
        int n3 = 0;
        if (drawable != null) {
            float f2;
            float f3;
            int n4 = drawable.getIntrinsicWidth();
            int n5 = drawable.getIntrinsicHeight();
            int n6 = this.j;
            n2 = n4;
            int n7 = n5;
            if (n4 > n6) {
                f3 = n5;
                f2 = n4;
                n7 = (int)(f3 * ((float)n6 / f2));
                n2 = n6;
            }
            if (n7 > n6) {
                f3 = n2;
                f2 = n7;
                n2 = (int)(f3 * ((float)n6 / f2));
            } else {
                n6 = n7;
            }
            drawable.setBounds(0, 0, n2, n6);
        }
        this.setCompoundDrawables(drawable, null, null, null);
        this.k();
        this.d = fu2.f(this);
        this.k();
        this.setId(fu2.a);
        n2 = n3;
        if (!fu2.isVisible()) {
            n2 = 8;
        }
        this.setVisibility(n2);
        this.setEnabled(fu2.isEnabled());
        if (fu2.hasSubMenu() && this.f == null) {
            this.f = new fh(this);
        }
    }

    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public final void onClick(View object) {
        object = this.b;
        if (object != null) {
            object.b(this.a);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = this.l();
        this.k();
    }

    @Override
    protected final void onMeasure(int n2, int n3) {
        int n4;
        boolean bl2 = this.b();
        if (bl2 && (n4 = this.i) >= 0) {
            super.setPadding(n4, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        super.onMeasure(n2, n3);
        n4 = View.MeasureSpec.getMode((int)n2);
        n2 = View.MeasureSpec.getSize((int)n2);
        int n5 = this.getMeasuredWidth();
        n2 = n4 == Integer.MIN_VALUE ? Math.min(n2, this.h) : this.h;
        if (n4 != 0x40000000 && this.h > 0 && n5 < n2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n2, (int)0x40000000), n3);
        }
        if (!bl2 && this.e != null) {
            super.setPadding((this.getMeasuredWidth() - this.e.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jg jg2;
        if (this.a.hasSubMenu() && (jg2 = this.f) != null && jg2.onTouch((View)this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setPadding(int n2, int n3, int n4, int n5) {
        this.i = n2;
        super.setPadding(n2, n3, n4, n5);
    }
}

