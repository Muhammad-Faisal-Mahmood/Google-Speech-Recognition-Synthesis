/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1
 */
package com.android.car.ui.pluginsupport;

import com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1;

class PluginFactoryAdapterV3$2
implements LayoutStyleOEMV1 {
    final int val$carUiRecyclerViewLayout;
    final int val$orientation;
    final boolean val$reversed;
    final int val$spanCount;

    public PluginFactoryAdapterV3$2(int n2, int n3, int n4, boolean bl2) {
        this.val$spanCount = n2;
        this.val$carUiRecyclerViewLayout = n3;
        this.val$orientation = n4;
        this.val$reversed = bl2;
    }

    public int getLayoutType() {
        if (this.val$carUiRecyclerViewLayout != 1) {
            return 0;
        }
        return 1;
    }

    public int getOrientation() {
        if (this.val$orientation != 0) {
            return 1;
        }
        return 0;
    }

    public boolean getReverseLayout() {
        return this.val$reversed;
    }

    public int getSpanCount() {
        return this.val$spanCount;
    }

    public int getSpanSize(int n2) {
        return 1;
    }
}

