/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterDataObserverOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV1
 */
package com.android.car.ui.recyclerview;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterDataObserverOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV1;
import com.android.car.ui.recyclerview.RecyclerViewAdapterAdapterV1$1;
import com.android.car.ui.recyclerview.RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class RecyclerViewAdapterAdapterV1
implements AdapterOEMV1 {
    private final kf mAdapter;
    private kh mAdapterDataObserver;
    private List mAdapterDataObservers = new ArrayList();
    private final Context mAppContext;

    static /* bridge */ /* synthetic */ List -$$Nest$fgetmAdapterDataObservers(RecyclerViewAdapterAdapterV1 recyclerViewAdapterAdapterV1) {
        return recyclerViewAdapterAdapterV1.mAdapterDataObservers;
    }

    public RecyclerViewAdapterAdapterV1(Context context, kf kf2) {
        this.mAdapterDataObserver = new RecyclerViewAdapterAdapterV1$1(this);
        this.mAppContext = context;
        this.mAdapter = kf2;
    }

    public void bindViewHolder(RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1 recyclerViewAdapterAdapterV1$ViewHolderAdapterV1, int n2) {
        this.mAdapter.bindViewHolder(recyclerViewAdapterAdapterV1$ViewHolderAdapterV1.getViewHolder(), n2);
    }

    public RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1 createViewHolder(ViewGroup viewGroup, int n2) {
        viewGroup = new FrameLayout(this.mAppContext);
        return new RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1(this.mAdapter.createViewHolder(viewGroup, n2));
    }

    public kf getAdapter() {
        return this.mAdapter;
    }

    public int getItemCount() {
        return this.mAdapter.getItemCount();
    }

    public long getItemId(int n2) {
        return this.mAdapter.getItemId(n2);
    }

    public int getItemViewType(int n2) {
        return this.mAdapter.getItemViewType(n2);
    }

    public int getStateRestorationPolicyInt() {
        int n2 = this.mAdapter.getStateRestorationPolicy().ordinal();
        int n3 = 1;
        if (n2 != 1) {
            n3 = 2;
            if (n2 != 2) {
                return 0;
            }
        }
        return n3;
    }

    public boolean hasStableIds() {
        return this.mAdapter.hasStableIds();
    }

    public void onAttachedToRecyclerView(RecyclerViewOEMV1 recyclerViewOEMV1) {
        this.mAdapter.onAttachedToRecyclerView(null);
        this.mAdapter.registerAdapterDataObserver(this.mAdapterDataObserver);
    }

    public void onDetachedFromRecyclerView(RecyclerViewOEMV1 recyclerViewOEMV1) {
        this.mAdapter.unregisterAdapterDataObserver(this.mAdapterDataObserver);
        this.mAdapter.onDetachedFromRecyclerView(null);
    }

    public boolean onFailedToRecycleView(RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1 recyclerViewAdapterAdapterV1$ViewHolderAdapterV1) {
        return this.mAdapter.onFailedToRecycleView(recyclerViewAdapterAdapterV1$ViewHolderAdapterV1.getViewHolder());
    }

    public void onViewAttachedToWindow(RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1 recyclerViewAdapterAdapterV1$ViewHolderAdapterV1) {
        this.mAdapter.onViewAttachedToWindow(recyclerViewAdapterAdapterV1$ViewHolderAdapterV1.getViewHolder());
    }

    public void onViewDetachedFromWindow(RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1 recyclerViewAdapterAdapterV1$ViewHolderAdapterV1) {
        this.mAdapter.onViewDetachedFromWindow(recyclerViewAdapterAdapterV1$ViewHolderAdapterV1.getViewHolder());
    }

    public void onViewRecycled(RecyclerViewAdapterAdapterV1$ViewHolderAdapterV1 recyclerViewAdapterAdapterV1$ViewHolderAdapterV1) {
        this.mAdapter.onViewRecycled(recyclerViewAdapterAdapterV1$ViewHolderAdapterV1.getViewHolder());
    }

    public void registerAdapterDataObserver(AdapterDataObserverOEMV1 adapterDataObserverOEMV1) {
        if (adapterDataObserverOEMV1 == null) {
            return;
        }
        this.mAdapterDataObservers.add(adapterDataObserverOEMV1);
    }

    public void setMaxItems(int n2) {
        kf kf2 = this.mAdapter;
        if (kf2 instanceof bli) {
            ((bli)kf2).a = n2;
        }
    }

    public void unregisterAdapterDataObserver(AdapterDataObserverOEMV1 adapterDataObserverOEMV1) {
        if (adapterDataObserverOEMV1 == null) {
            return;
        }
        this.mAdapterDataObservers.remove(adapterDataObserverOEMV1);
    }
}

