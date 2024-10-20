/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterDataObserverOEMV1
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2
 *  com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV3
 */
package com.android.car.ui.recyclerview;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterDataObserverOEMV1;
import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2;
import com.android.car.ui.plugin.oemapis.recyclerview.RecyclerViewOEMV3;
import com.android.car.ui.recyclerview.RecyclerViewAdapterAdapterV2$1;
import com.android.car.ui.recyclerview.RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class RecyclerViewAdapterAdapterV2
implements AdapterOEMV2 {
    private final kf mAdapter;
    private kh mAdapterDataObserver;
    private List mAdapterDataObservers = new ArrayList();
    private final Context mAppContext;

    static /* bridge */ /* synthetic */ List -$$Nest$fgetmAdapterDataObservers(RecyclerViewAdapterAdapterV2 recyclerViewAdapterAdapterV2) {
        return recyclerViewAdapterAdapterV2.mAdapterDataObservers;
    }

    public RecyclerViewAdapterAdapterV2(Context context, kf kf2) {
        this.mAdapterDataObserver = new RecyclerViewAdapterAdapterV2$1(this);
        this.mAppContext = context;
        this.mAdapter = kf2;
    }

    public void bindViewHolder(RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1 recyclerViewAdapterAdapterV2$ViewHolderAdapterV1, int n2) {
        this.mAdapter.bindViewHolder(recyclerViewAdapterAdapterV2$ViewHolderAdapterV1.getViewHolder(), n2);
    }

    public RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1 createViewHolder(ViewGroup viewGroup, int n2) {
        viewGroup = new FrameLayout(this.mAppContext);
        return new RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1(this.mAdapter.createViewHolder(viewGroup, n2));
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

    public void notifyDataSetChanged() {
        this.mAdapter.notifyDataSetChanged();
    }

    public void notifyItemMoved(int n2, int n3) {
        this.mAdapter.notifyItemMoved(n2, n3);
    }

    public void notifyItemRangeChanged(int n2, int n3) {
        this.mAdapter.notifyItemRangeChanged(n2, n3);
    }

    public void notifyItemRangeChanged(int n2, int n3, Object object) {
        this.mAdapter.notifyItemRangeChanged(n2, n3, object);
    }

    public void notifyItemRangeInserted(int n2, int n3) {
        this.mAdapter.notifyItemRangeInserted(n2, n3);
    }

    public void notifyItemRangeRemoved(int n2, int n3) {
        this.mAdapter.notifyItemRangeRemoved(n2, n3);
    }

    public void onAttachedToRecyclerView(RecyclerViewOEMV3 recyclerViewOEMV3) {
        this.mAdapter.onAttachedToRecyclerView(null);
        this.mAdapter.registerAdapterDataObserver(this.mAdapterDataObserver);
    }

    public void onDetachedFromRecyclerView(RecyclerViewOEMV3 recyclerViewOEMV3) {
        this.mAdapter.unregisterAdapterDataObserver(this.mAdapterDataObserver);
        this.mAdapter.onDetachedFromRecyclerView(null);
    }

    public boolean onFailedToRecycleView(RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1 recyclerViewAdapterAdapterV2$ViewHolderAdapterV1) {
        return this.mAdapter.onFailedToRecycleView(recyclerViewAdapterAdapterV2$ViewHolderAdapterV1.getViewHolder());
    }

    public void onViewAttachedToWindow(RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1 recyclerViewAdapterAdapterV2$ViewHolderAdapterV1) {
        this.mAdapter.onViewAttachedToWindow(recyclerViewAdapterAdapterV2$ViewHolderAdapterV1.getViewHolder());
    }

    public void onViewDetachedFromWindow(RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1 recyclerViewAdapterAdapterV2$ViewHolderAdapterV1) {
        this.mAdapter.onViewDetachedFromWindow(recyclerViewAdapterAdapterV2$ViewHolderAdapterV1.getViewHolder());
    }

    public void onViewRecycled(RecyclerViewAdapterAdapterV2$ViewHolderAdapterV1 recyclerViewAdapterAdapterV2$ViewHolderAdapterV1) {
        this.mAdapter.onViewRecycled(recyclerViewAdapterAdapterV2$ViewHolderAdapterV1.getViewHolder());
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

    public void setStateRestorationPolicy(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                this.mAdapter.setStateRestorationPolicy(ke.a);
                return;
            }
            this.mAdapter.setStateRestorationPolicy(ke.c);
            return;
        }
        this.mAdapter.setStateRestorationPolicy(ke.b);
    }

    public void unregisterAdapterDataObserver(AdapterDataObserverOEMV1 adapterDataObserverOEMV1) {
        if (adapterDataObserverOEMV1 == null) {
            return;
        }
        this.mAdapterDataObservers.remove(adapterDataObserverOEMV1);
    }
}

