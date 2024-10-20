/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1
 */
package com.android.car.ui.pluginsupport;

import android.graphics.drawable.Drawable;
import com.android.car.ui.plugin.oemapis.recyclerview.LayoutStyleOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewAttributesOEMV1;

class PluginFactoryAdapterV8$7
implements RecyclerViewAttributesOEMV1 {
    final Drawable val$background;
    final int val$height;
    final boolean val$isLtr;
    final LayoutStyleOEMV1 val$layoutStyle;
    final int val$marginBottom;
    final int val$marginEnd;
    final int val$marginLeft;
    final int val$marginRight;
    final int val$marginStart;
    final int val$marginTop;
    final int val$minHeight;
    final int val$minWidth;
    final int val$paddingBottom;
    final int val$paddingEnd;
    final int val$paddingLeft;
    final int val$paddingRight;
    final int val$paddingStart;
    final int val$paddingTop;
    final boolean val$rotaryScrollEnabled;
    final int val$size;
    final int val$width;

    public PluginFactoryAdapterV8$7(boolean bl2, int n2, LayoutStyleOEMV1 layoutStyleOEMV1, int n3, int n4, int n5, int n6, int n7, boolean bl3, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, Drawable drawable) {
        this.val$rotaryScrollEnabled = bl2;
        this.val$size = n2;
        this.val$layoutStyle = layoutStyleOEMV1;
        this.val$width = n3;
        this.val$height = n4;
        this.val$minWidth = n5;
        this.val$minHeight = n6;
        this.val$paddingLeft = n7;
        this.val$isLtr = bl3;
        this.val$paddingStart = n8;
        this.val$paddingEnd = n9;
        this.val$paddingRight = n10;
        this.val$paddingTop = n11;
        this.val$paddingBottom = n12;
        this.val$marginLeft = n13;
        this.val$marginStart = n14;
        this.val$marginEnd = n15;
        this.val$marginRight = n16;
        this.val$marginTop = n17;
        this.val$marginBottom = n18;
        this.val$background = drawable;
    }

    public int geMinWidth() {
        return this.val$minWidth;
    }

    public Drawable getBackground() {
        return this.val$background;
    }

    public int getLayoutHeight() {
        return this.val$height;
    }

    public LayoutStyleOEMV1 getLayoutStyle() {
        return this.val$layoutStyle;
    }

    public int getLayoutWidth() {
        return this.val$width;
    }

    public int getMarginBottom() {
        return this.val$marginBottom;
    }

    public int getMarginLeft() {
        int n2 = this.val$marginLeft;
        if (n2 != 0) {
            return n2;
        }
        if (this.val$isLtr) {
            return this.val$marginStart;
        }
        return this.val$marginEnd;
    }

    public int getMarginRight() {
        int n2 = this.val$marginRight;
        if (n2 != 0) {
            return n2;
        }
        if (this.val$isLtr) {
            return this.val$marginEnd;
        }
        return this.val$marginStart;
    }

    public int getMarginTop() {
        return this.val$marginTop;
    }

    public int getMinHeight() {
        return this.val$minHeight;
    }

    public int getPaddingBottom() {
        return this.val$paddingBottom;
    }

    public int getPaddingLeft() {
        int n2 = this.val$paddingLeft;
        if (n2 != 0) {
            return n2;
        }
        if (this.val$isLtr) {
            return this.val$paddingStart;
        }
        return this.val$paddingEnd;
    }

    public int getPaddingRight() {
        int n2 = this.val$paddingRight;
        if (n2 != 0) {
            return n2;
        }
        if (this.val$isLtr) {
            return this.val$paddingEnd;
        }
        return this.val$paddingStart;
    }

    public int getPaddingTop() {
        return this.val$paddingTop;
    }

    public int getSize() {
        int n2 = this.val$size;
        if (n2 != 0) {
            if (n2 != 1) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public boolean isRotaryScrollEnabled() {
        return this.val$rotaryScrollEnabled;
    }
}

