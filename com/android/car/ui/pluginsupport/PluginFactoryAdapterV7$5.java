/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1
 */
package com.android.car.ui.pluginsupport;

import com.android.car.ui.plugin.oemapis.recyclerview.ListItemOEMV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV7;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV7$5$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.function.Function;

class PluginFactoryAdapterV7$5
extends kh {
    final List val$items;
    final List val$oemItems;

    public PluginFactoryAdapterV7$5(PluginFactoryAdapterV7 pluginFactoryAdapterV7, List list, List list2) {
        this.val$oemItems = list;
        this.val$items = list2;
    }

    static /* synthetic */ ListItemOEMV1 lambda$onChanged$0(blf blf2) {
        return PluginFactoryAdapterV7.-$$Nest$smtoOemListItem(blf2);
    }

    @Override
    public void onChanged() {
        this.val$oemItems.clear();
        Object object = new PluginFactoryAdapterV7$5$$ExternalSyntheticLambda0();
        object = bnv.l(this.val$items, (Function)object);
        this.val$oemItems.addAll(object);
    }

    @Override
    public void onItemRangeChanged(int n2, int n3) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            this.val$oemItems.set(i2, PluginFactoryAdapterV7.-$$Nest$smtoOemListItem((blf)this.val$items.get(i2)));
        }
    }

    @Override
    public void onItemRangeChanged(int n2, int n3, Object object) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            this.val$oemItems.set(i2, PluginFactoryAdapterV7.-$$Nest$smtoOemListItem((blf)this.val$items.get(i2)));
        }
    }

    @Override
    public void onItemRangeInserted(int n2, int n3) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            this.val$oemItems.add(i2, PluginFactoryAdapterV7.-$$Nest$smtoOemListItem((blf)this.val$items.get(i2)));
        }
    }

    @Override
    public void onItemRangeMoved(int n2, int n3, int n4) {
        for (int i2 = n2; i2 <= n2 + n4; ++i2) {
            ListItemOEMV1 listItemOEMV1 = (ListItemOEMV1)this.val$oemItems.remove(i2);
            this.val$oemItems.add(n3, listItemOEMV1);
            ++n3;
        }
    }

    @Override
    public void onItemRangeRemoved(int n2, int n3) {
        for (int i2 = n2; i2 <= n2 + n3; ++i2) {
            this.val$oemItems.remove(i2);
        }
    }
}

