/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2
 *  com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1
 */
package com.android.car.ui.pluginsupport;

import com.android.car.ui.plugin.oemapis.recyclerview.AdapterOEMV2;
import com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV8;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV8$5$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.function.Function;

class PluginFactoryAdapterV8$5
extends kh {
    final kf val$adapter;
    final List val$items;
    final AdapterOEMV2 val$oemAdapter;
    final List val$oemItems;

    public PluginFactoryAdapterV8$5(PluginFactoryAdapterV8 pluginFactoryAdapterV8, List list, List list2, AdapterOEMV2 adapterOEMV2, kf kf2) {
        this.val$oemItems = list;
        this.val$items = list2;
        this.val$oemAdapter = adapterOEMV2;
        this.val$adapter = kf2;
    }

    static /* synthetic */ ListItemOEMV1 lambda$onChanged$0(blf blf2) {
        return PluginFactoryAdapterV8.-$$Nest$smtoOemListItem(blf2);
    }

    @Override
    public void onChanged() {
        this.val$oemItems.clear();
        Object object = new PluginFactoryAdapterV8$5$$ExternalSyntheticLambda0();
        object = bnv.l(this.val$items, (Function)object);
        this.val$oemItems.addAll(object);
        this.val$oemAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemRangeChanged(int n2, int n3) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            this.val$oemItems.set(i2, PluginFactoryAdapterV8.-$$Nest$smtoOemListItem((blf)this.val$items.get(i2)));
        }
        this.val$oemAdapter.notifyItemRangeChanged(n2, n3);
    }

    @Override
    public void onItemRangeChanged(int n2, int n3, Object object) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            this.val$oemItems.set(i2, PluginFactoryAdapterV8.-$$Nest$smtoOemListItem((blf)this.val$items.get(i2)));
        }
        this.val$oemAdapter.notifyItemRangeChanged(n2, n3, object);
    }

    @Override
    public void onItemRangeInserted(int n2, int n3) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            this.val$oemItems.add(i2, PluginFactoryAdapterV8.-$$Nest$smtoOemListItem((blf)this.val$items.get(i2)));
        }
        this.val$oemAdapter.notifyItemRangeInserted(n2, n3);
    }

    @Override
    public void onItemRangeMoved(int n2, int n3, int n4) {
        for (int i2 = n2; i2 <= n2 + n4; ++i2) {
            ListItemOEMV1 listItemOEMV1 = (ListItemOEMV1)this.val$oemItems.remove(i2);
            this.val$oemItems.add(n3, listItemOEMV1);
            this.val$oemAdapter.notifyItemMoved(n2, ++n3);
        }
    }

    @Override
    public void onItemRangeRemoved(int n2, int n3) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            this.val$oemItems.remove(i2);
        }
        this.val$oemAdapter.notifyItemRangeRemoved(n2, n3);
    }

    @Override
    public void onStateRestorationPolicyChanged() {
        int n2 = this.val$adapter.getStateRestorationPolicy().ordinal();
        this.val$oemAdapter.setStateRestorationPolicy(n2);
    }
}

