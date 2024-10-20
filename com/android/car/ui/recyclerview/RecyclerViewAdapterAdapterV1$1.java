/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterDataObserverOEMV1
 */
package com.android.car.ui.recyclerview;

import com.android.car.ui.plugin.oemapis.recyclerview.AdapterDataObserverOEMV1;
import com.android.car.ui.recyclerview.RecyclerViewAdapterAdapterV1;
import java.util.Iterator;

class RecyclerViewAdapterAdapterV1$1
extends kh {
    final RecyclerViewAdapterAdapterV1 this$0;

    public RecyclerViewAdapterAdapterV1$1(RecyclerViewAdapterAdapterV1 recyclerViewAdapterAdapterV1) {
        this.this$0 = recyclerViewAdapterAdapterV1;
    }

    @Override
    public void onChanged() {
        Iterator iterator = RecyclerViewAdapterAdapterV1.-$$Nest$fgetmAdapterDataObservers(this.this$0).iterator();
        while (iterator.hasNext()) {
            ((AdapterDataObserverOEMV1)iterator.next()).onChanged();
        }
    }

    @Override
    public void onItemRangeChanged(int n2, int n3) {
        Iterator iterator = RecyclerViewAdapterAdapterV1.-$$Nest$fgetmAdapterDataObservers(this.this$0).iterator();
        while (iterator.hasNext()) {
            ((AdapterDataObserverOEMV1)iterator.next()).onItemRangeChanged(n2, n3);
        }
    }

    @Override
    public void onItemRangeChanged(int n2, int n3, Object object) {
        Iterator iterator = RecyclerViewAdapterAdapterV1.-$$Nest$fgetmAdapterDataObservers(this.this$0).iterator();
        while (iterator.hasNext()) {
            ((AdapterDataObserverOEMV1)iterator.next()).onItemRangeChanged(n2, n3, object);
        }
    }

    @Override
    public void onItemRangeInserted(int n2, int n3) {
        Iterator iterator = RecyclerViewAdapterAdapterV1.-$$Nest$fgetmAdapterDataObservers(this.this$0).iterator();
        while (iterator.hasNext()) {
            ((AdapterDataObserverOEMV1)iterator.next()).onItemRangeInserted(n2, n3);
        }
    }

    @Override
    public void onItemRangeMoved(int n2, int n3, int n4) {
        for (AdapterDataObserverOEMV1 adapterDataObserverOEMV1 : RecyclerViewAdapterAdapterV1.-$$Nest$fgetmAdapterDataObservers(this.this$0)) {
            for (int i2 = 0; i2 < n4; ++i2) {
                adapterDataObserverOEMV1.onItemMoved(n2 + i2, n3 + i2);
            }
        }
    }

    @Override
    public void onItemRangeRemoved(int n2, int n3) {
        Iterator iterator = RecyclerViewAdapterAdapterV1.-$$Nest$fgetmAdapterDataObservers(this.this$0).iterator();
        while (iterator.hasNext()) {
            ((AdapterDataObserverOEMV1)iterator.next()).onItemRangeRemoved(n2, n3);
        }
    }

    @Override
    public void onStateRestorationPolicyChanged() {
        Iterator iterator = RecyclerViewAdapterAdapterV1.-$$Nest$fgetmAdapterDataObservers(this.this$0).iterator();
        while (iterator.hasNext()) {
            ((AdapterDataObserverOEMV1)iterator.next()).onStateRestorationPolicyChanged();
        }
    }
}

