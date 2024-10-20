/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 *  com.android.car.ui.plugin.oemapis.FocusAreaOEMV1
 */
package com.android.car.ui;

import android.view.View;
import android.widget.LinearLayout;
import com.android.car.ui.FocusArea;
import com.android.car.ui.plugin.oemapis.FocusAreaOEMV1;

public class FocusAreaAdapterV1
implements FocusAreaOEMV1 {
    private final FocusArea mFocusArea;

    public FocusAreaAdapterV1(FocusArea focusArea) {
        this.mFocusArea = focusArea;
    }

    public LinearLayout getView() {
        return this.mFocusArea;
    }

    public void setBoundsOffset(int n2, int n3, int n4, int n5) {
        this.mFocusArea.b(n2, n3, n4, n5);
    }

    public void setDefaultFocus(View view) {
        this.mFocusArea.a.s = view;
    }

    public void setHighlightPadding(int n2, int n3, int n4, int n5) {
        this.mFocusArea.c(n2, n3, n4, n5);
    }

    public void setNudgeShortcut(int n2, View view) {
        if (bji.a.contains(n2)) {
            bji bji2 = this.mFocusArea.a;
            bji2.b();
            if (view == null) {
                bji2.t.remove(n2);
                return;
            }
            bji2.t.put(n2, (Object)view);
            return;
        }
        throw new IllegalArgumentException("direction must be FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, or FOCUS_RIGHT.");
    }

    public void setWrapAround(boolean bl2) {
        this.mFocusArea.a.w = bl2;
    }
}

