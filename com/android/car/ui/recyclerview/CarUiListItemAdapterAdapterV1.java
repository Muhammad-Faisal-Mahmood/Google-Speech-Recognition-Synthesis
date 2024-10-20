/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1
 */
package com.android.car.ui.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1;
import com.android.car.ui.recyclerview.CarUiListItemAdapterAdapterV1$ViewHolderWrapper;

public final class CarUiListItemAdapterAdapterV1
extends kf {
    private AdapterOEMV1 mAdapter;

    public CarUiListItemAdapterAdapterV1(AdapterOEMV1 adapterOEMV1) {
        this.mAdapter = adapterOEMV1;
        CarUiListItemAdapterAdapterV1.super.setHasStableIds(adapterOEMV1.hasStableIds());
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

    public void onBindViewHolder(CarUiListItemAdapterAdapterV1$ViewHolderWrapper carUiListItemAdapterAdapterV1$ViewHolderWrapper, int n2) {
        this.mAdapter.bindViewHolder(carUiListItemAdapterAdapterV1$ViewHolderWrapper.getViewHolder(), n2);
    }

    @Override
    public CarUiListItemAdapterAdapterV1$ViewHolderWrapper onCreateViewHolder(ViewGroup viewGroup, int n2) {
        return new CarUiListItemAdapterAdapterV1$ViewHolderWrapper(this.mAdapter.createViewHolder(viewGroup, n2));
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mAdapter.onDetachedFromRecyclerView(null);
    }

    public boolean onFailedToRecycleView(CarUiListItemAdapterAdapterV1$ViewHolderWrapper carUiListItemAdapterAdapterV1$ViewHolderWrapper) {
        return this.mAdapter.onFailedToRecycleView(carUiListItemAdapterAdapterV1$ViewHolderWrapper.getViewHolder());
    }

    public void onViewAttachedToWindow(CarUiListItemAdapterAdapterV1$ViewHolderWrapper carUiListItemAdapterAdapterV1$ViewHolderWrapper) {
        this.mAdapter.onViewAttachedToWindow(carUiListItemAdapterAdapterV1$ViewHolderWrapper.getViewHolder());
    }

    public void onViewDetachedFromWindow(CarUiListItemAdapterAdapterV1$ViewHolderWrapper carUiListItemAdapterAdapterV1$ViewHolderWrapper) {
        this.mAdapter.onViewDetachedFromWindow(carUiListItemAdapterAdapterV1$ViewHolderWrapper.getViewHolder());
    }

    public void onViewRecycled(CarUiListItemAdapterAdapterV1$ViewHolderWrapper carUiListItemAdapterAdapterV1$ViewHolderWrapper) {
        this.mAdapter.onViewRecycled(carUiListItemAdapterAdapterV1$ViewHolderWrapper.getViewHolder());
    }
}

