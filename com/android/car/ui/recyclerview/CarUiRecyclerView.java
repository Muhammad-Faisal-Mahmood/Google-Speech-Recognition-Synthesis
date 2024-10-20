/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.android.car.ui.recyclerview;

import android.view.View;

public interface CarUiRecyclerView {
    @Deprecated
    public void addItemDecoration(kl var1);

    public void addOnChildAttachStateChangeListener(kq var1);

    public lg findViewHolderForAdapterPosition(int var1);

    @Deprecated
    public void focusableViewAvailable(View var1);

    public kf getAdapter();

    public int getChildLayoutPosition(View var1);

    public View getView();

    @Deprecated
    public void invalidateItemDecorations();

    @Deprecated
    public boolean post(Runnable var1);

    public void scrollToPosition(int var1);

    public void setAdapter(kf var1);

    @Deprecated
    public void setClipToPadding(boolean var1);

    public void setLayoutStyle(bld var1);

    @Deprecated
    public void setPadding(int var1, int var2, int var3, int var4);
}

