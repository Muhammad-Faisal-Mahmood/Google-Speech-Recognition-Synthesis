/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.android.car.ui.plugin.oemapis.PluginVersionProviderOEMV1
 */
package com.android.car.ui.pluginsupport;

import android.content.Context;
import com.android.car.ui.plugin.oemapis.PluginVersionProviderOEMV1;

final class PluginVersionProviderAdapterV1 {
    private PluginVersionProviderOEMV1 mOemProvider;

    public PluginVersionProviderAdapterV1(PluginVersionProviderOEMV1 pluginVersionProviderOEMV1) {
        this.mOemProvider = pluginVersionProviderOEMV1;
    }

    public Object getPluginFactory(int n2, Context context, String string) {
        return this.mOemProvider.getPluginFactory(n2, context, string);
    }
}

