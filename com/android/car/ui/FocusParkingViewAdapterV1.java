/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.android.car.ui.plugin.oemapis.FocusParkingViewOEMV1
 */
package com.android.car.ui;

import android.view.View;
import com.android.car.ui.FocusParkingView;
import com.android.car.ui.plugin.oemapis.FocusParkingViewOEMV1;

public class FocusParkingViewAdapterV1
implements FocusParkingViewOEMV1 {
    private final FocusParkingView mFocusParkingView;

    public FocusParkingViewAdapterV1(FocusParkingView focusParkingView) {
        this.mFocusParkingView = focusParkingView;
    }

    public View getView() {
        return this.mFocusParkingView;
    }

    public void setShouldRestoreFocus(boolean bl2) {
        this.mFocusParkingView.b = bl2;
    }
}

