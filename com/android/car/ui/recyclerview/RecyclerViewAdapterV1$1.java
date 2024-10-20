/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1
 */
package com.android.car.ui.recyclerview;

import com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1;
import com.android.car.ui.recyclerview.RecyclerViewAdapterV1;

class RecyclerViewAdapterV1$1
implements LayoutStyleOEMV1 {
    final bld val$layoutStyle;

    public RecyclerViewAdapterV1$1(RecyclerViewAdapterV1 recyclerViewAdapterV1, bld bld2) {
        this.val$layoutStyle = bld2;
    }

    public int getLayoutType() {
        return this.val$layoutStyle.a();
    }

    public int getOrientation() {
        return this.val$layoutStyle.b();
    }

    public boolean getReverseLayout() {
        return this.val$layoutStyle.f();
    }

    public int getSpanCount() {
        return this.val$layoutStyle.c();
    }

    public int getSpanSize(int n2) {
        bld bld2 = this.val$layoutStyle;
        if (bld2 instanceof blb) {
            ((blb)bld2).c.b();
        }
        return 1;
    }
}

