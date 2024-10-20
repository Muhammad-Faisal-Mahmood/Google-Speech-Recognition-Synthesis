/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewStub
 *  android.widget.CheckedTextView
 *  android.widget.FrameLayout
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView
extends fwg
implements gf {
    private static final int[] e = new int[]{0x10100A0};
    public boolean c;
    boolean d = true;
    private int i;
    private final CheckedTextView j;
    private FrameLayout k;
    private fu l;
    private final us m;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet object, int n2) {
        super(context, (AttributeSet)object, n2);
        object = new fwh(this);
        this.m = object;
        this.q(0);
        LayoutInflater.from((Context)context).inflate(2131624045, (ViewGroup)this, true);
        this.i = context.getResources().getDimensionPixelSize(2131165478);
        context = (CheckedTextView)this.findViewById(2131427603);
        this.j = context;
        wj.m((View)context, (us)object);
    }

    @Override
    public final fu a() {
        return this.l;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final void f(fu object) {
        Object object2;
        TypedValue typedValue;
        this.l = object;
        int n2 = object.a;
        if (n2 > 0) {
            this.setId(n2);
        }
        boolean bl2 = object.isVisible();
        int n3 = 1;
        n2 = true != bl2 ? 8 : 0;
        this.setVisibility(n2);
        if (this.getBackground() == null) {
            typedValue = new TypedValue();
            if (this.getContext().getTheme().resolveAttribute(2130968891, typedValue, true)) {
                object2 = new StateListDrawable();
                object2.addState(e, (Drawable)new ColorDrawable(typedValue.data));
                object2.addState(EMPTY_STATE_SET, (Drawable)new ColorDrawable(0));
            } else {
                object2 = null;
            }
            this.setBackground((Drawable)object2);
        }
        bl2 = object.isCheckable();
        this.refreshDrawableState();
        if (this.c != bl2) {
            this.c = bl2;
            this.m.d((View)this.j, 2048);
        }
        bl2 = object.isChecked();
        this.refreshDrawableState();
        this.j.setChecked(bl2);
        object2 = this.j;
        typedValue = object2.getTypeface();
        n2 = bl2 && this.d ? n3 : 0;
        object2.setTypeface((Typeface)typedValue, n2);
        this.setEnabled(object.isEnabled());
        object2 = object.d;
        this.j.setText((CharSequence)object2);
        object2 = object.getIcon();
        if (object2 != null) {
            n2 = this.i;
            object2.setBounds(0, 0, n2, n2);
        }
        this.j.setCompoundDrawablesRelative((Drawable)object2, null, null, null);
        object2 = object.getActionView();
        if (object2 != null) {
            if (this.k == null) {
                this.k = (FrameLayout)((ViewStub)this.findViewById(2131427602)).inflate();
            }
            if (object2.getParent() != null) {
                ((ViewGroup)object2.getParent()).removeView((View)object2);
            }
            this.k.removeAllViews();
            this.k.addView((View)object2);
        }
        this.setContentDescription(object.l);
        ag$$ExternalSyntheticApiModelOutline0.m((View)this, object.m);
        object = this.l;
        if (object.d == null && object.getIcon() == null && this.l.getActionView() != null) {
            this.j.setVisibility(8);
            object = this.k;
            if (object != null) {
                object = (jo)object.getLayoutParams();
                ((jo)((Object)object)).width = -1;
                this.k.setLayoutParams((ViewGroup.LayoutParams)object);
                return;
            }
        } else {
            this.j.setVisibility(0);
            object = this.k;
            if (object != null) {
                object = (jo)object.getLayoutParams();
                ((jo)((Object)object)).width = -2;
                this.k.setLayoutParams((ViewGroup.LayoutParams)object);
            }
        }
    }

    protected final int[] onCreateDrawableState(int n2) {
        int[] nArray = super.onCreateDrawableState(n2 + 1);
        fu fu2 = this.l;
        if (fu2 != null && fu2.isCheckable() && fu2.isChecked()) {
            NavigationMenuItemView.mergeDrawableStates((int[])nArray, (int[])e);
        }
        return nArray;
    }
}

