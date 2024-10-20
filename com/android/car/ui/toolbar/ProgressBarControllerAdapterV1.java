/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.toolbar.ProgressBarControllerOEMV1
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.plugin.oemapis.toolbar.ProgressBarControllerOEMV1;

class ProgressBarControllerAdapterV1
implements bmq {
    private boolean mIndeterminate = true;
    private int mMax = 100;
    private int mMin = 0;
    private final ProgressBarControllerOEMV1 mOemProgressbar;
    private int mProgress = 0;
    private boolean mVisible = false;

    public ProgressBarControllerAdapterV1(ProgressBarControllerOEMV1 progressBarControllerOEMV1) {
        this.mOemProgressbar = progressBarControllerOEMV1;
    }

    public int getMax() {
        return this.mMax;
    }

    public int getMin() {
        return this.mMin;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public boolean isIndeterminate() {
        return this.mIndeterminate;
    }

    public boolean isVisible() {
        return this.mVisible;
    }

    public void setIndeterminate(boolean bl2) {
        ProgressBarControllerOEMV1 progressBarControllerOEMV1 = this.mOemProgressbar;
        if (progressBarControllerOEMV1 != null) {
            progressBarControllerOEMV1.setIndeterminate(bl2);
        }
        this.mIndeterminate = bl2;
    }

    public void setMax(int n2) {
        ProgressBarControllerOEMV1 progressBarControllerOEMV1 = this.mOemProgressbar;
        if (progressBarControllerOEMV1 != null) {
            progressBarControllerOEMV1.setMax(n2);
        }
        this.mMax = n2;
    }

    public void setMin(int n2) {
        ProgressBarControllerOEMV1 progressBarControllerOEMV1 = this.mOemProgressbar;
        if (progressBarControllerOEMV1 != null) {
            progressBarControllerOEMV1.setMin(n2);
        }
        this.mMin = n2;
    }

    public void setProgress(int n2) {
        ProgressBarControllerOEMV1 progressBarControllerOEMV1 = this.mOemProgressbar;
        if (progressBarControllerOEMV1 != null) {
            progressBarControllerOEMV1.setProgress(n2);
        }
        this.mProgress = n2;
    }

    public void setVisible(boolean bl2) {
        ProgressBarControllerOEMV1 progressBarControllerOEMV1 = this.mOemProgressbar;
        if (progressBarControllerOEMV1 != null) {
            progressBarControllerOEMV1.setVisible(bl2);
        }
        this.mVisible = bl2;
    }
}

