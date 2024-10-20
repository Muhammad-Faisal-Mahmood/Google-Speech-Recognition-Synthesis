/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.android.car.ui.plugin.oemapis.recyclerview.ViewHolderOEMV1
 */
package com.android.car.ui.recyclerview;

import android.view.View;
import com.android.car.ui.plugin.oemapis.recyclerview.ViewHolderOEMV1;

class RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1
implements ViewHolderOEMV1 {
    private lg mViewHolder;

    public RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1(lg lg2) {
        this.mViewHolder = lg2;
    }

    public View getItemView() {
        return this.mViewHolder.itemView;
    }

    public lg getViewHolder() {
        return this.mViewHolder;
    }

    public boolean isRecyclable() {
        return this.mViewHolder.isRecyclable();
    }
}

