/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.recyclerview.ViewHolderOEMV1
 */
package com.android.car.ui.recyclerview;

import com.android.car.ui.plugin.oemapis.recyclerview.ViewHolderOEMV1;

public class CarUiListItemAdapterAdapterV2$ViewHolderWrapper
extends lg {
    private final ViewHolderOEMV1 mViewHolder;

    public CarUiListItemAdapterAdapterV2$ViewHolderWrapper(ViewHolderOEMV1 viewHolderOEMV1) {
        super(viewHolderOEMV1.getItemView());
        this.mViewHolder = viewHolderOEMV1;
        this.setIsRecyclable(viewHolderOEMV1.isRecyclable());
    }

    public ViewHolderOEMV1 getViewHolder() {
        return this.mViewHolder;
    }
}

