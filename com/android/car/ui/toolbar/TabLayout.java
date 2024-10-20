/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.android.car.ui.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

public class TabLayout
extends LinearLayout {
    public final int a;
    public List b = Collections.emptyList();
    public int c = -1;

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        n2 = true != context.getResources().getBoolean(2131034134) ? 2131624025 : 2131624026;
        this.a = n2;
    }

    public final void a(int n2) {
        if (n2 >= 0 && n2 < this.b.size()) {
            Object object = this.getChildAt(n2);
            bng bng2 = (bng)this.b.get(n2);
            Object object2 = (ImageView)bnv.i(object, 2131427538);
            TextView textView = (TextView)bnv.i(object, 2131427539);
            object.setOnClickListener((View.OnClickListener)new bnh(this, n2));
            boolean bl2 = n2 == this.c;
            object.setActivated(bl2);
            if (bng2.a) {
                object2.setImageTintList(this.getContext().getColorStateList(2131099859));
            } else {
                object2.setImageTintList(null);
            }
            object = bng2.c;
            object2.setImageDrawable(null);
            object2 = bng2.b;
            textView.setText(null);
            n2 = n2 == this.c ? 2132083430 : 2132083429;
            textView.setTextAppearance(n2);
            return;
        }
        throw new IllegalArgumentException(a.af(n2, "Tab position is invalid: "));
    }
}

