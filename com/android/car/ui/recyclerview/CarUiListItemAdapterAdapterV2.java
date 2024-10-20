/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2
 */
package com.android.car.ui.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2;
import com.android.car.ui.recyclerview.CarUiListItemAdapterAdapterV2$ViewHolderWrapper;

public final class CarUiListItemAdapterAdapterV2
extends kf {
    private AdapterOEMV2 mAdapter;

    public CarUiListItemAdapterAdapterV2(AdapterOEMV2 adapterOEMV2) {
        this.mAdapter = adapterOEMV2;
        CarUiListItemAdapterAdapterV2.super.setHasStableIds(adapterOEMV2.hasStableIds());
    }

    @Override
    public int getItemCount() {
        return this.mAdapter.getItemCount();
    }

    @Override
    public long getItemId(int n2) {
        return this.mAdapter.getItemId(n2);
    }

    @Override
    public int getItemViewType(int n2) {
        return this.mAdapter.getItemViewType(n2);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.mAdapter.onAttachedToRecyclerView(null);
    }

    public void onBindViewHolder(CarUiListItemAdapterAdapterV2$ViewHolderWrapper carUiListItemAdapterAdapterV2$ViewHolderWrapper, int n2) {
        this.mAdapter.bindViewHolder(carUiListItemAdapterAdapterV2$ViewHolderWrapper.getViewHolder(), n2);
    }

    @Override
    public CarUiListItemAdapterAdapterV2$ViewHolderWrapper onCreateViewHolder(ViewGroup viewGroup, int n2) {
        return new CarUiListItemAdapterAdapterV2$ViewHolderWrapper(this.mAdapter.createViewHolder(viewGroup, n2));
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mAdapter.onDetachedFromRecyclerView(null);
    }

    public boolean onFailedToRecycleView(CarUiListItemAdapterAdapterV2$ViewHolderWrapper carUiListItemAdapterAdapterV2$ViewHolderWrapper) {
        return this.mAdapter.onFailedToRecycleView(carUiListItemAdapterAdapterV2$ViewHolderWrapper.getViewHolder());
    }

    public void onViewAttachedToWindow(CarUiListItemAdapterAdapterV2$ViewHolderWrapper carUiListItemAdapterAdapterV2$ViewHolderWrapper) {
        this.mAdapter.onViewAttachedToWindow(carUiListItemAdapterAdapterV2$ViewHolderWrapper.getViewHolder());
    }

    public void onViewDetachedFromWindow(CarUiListItemAdapterAdapterV2$ViewHolderWrapper carUiListItemAdapterAdapterV2$ViewHolderWrapper) {
        this.mAdapter.onViewDetachedFromWindow(carUiListItemAdapterAdapterV2$ViewHolderWrapper.getViewHolder());
    }

    public void onViewRecycled(CarUiListItemAdapterAdapterV2$ViewHolderWrapper carUiListItemAdapterAdapterV2$ViewHolderWrapper) {
        this.mAdapter.onViewRecycled(carUiListItemAdapterAdapterV2$ViewHolderWrapper.getViewHolder());
    }

    @Override
    public void setStateRestorationPolicy(ke ke2) {
        int n2 = ke2.ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                this.mAdapter.setStateRestorationPolicy(0);
            } else {
                this.mAdapter.setStateRestorationPolicy(2);
            }
        } else {
            this.mAdapter.setStateRestorationPolicy(1);
        }
        n2 = this.mAdapter.getStateRestorationPolicyInt();
        if (n2 != 1) {
            if (n2 != 2) {
                super.setStateRestorationPolicy(ke.a);
                return;
            }
            super.setStateRestorationPolicy(ke.c);
            return;
        }
        super.setStateRestorationPolicy(ke.b);
    }
}

