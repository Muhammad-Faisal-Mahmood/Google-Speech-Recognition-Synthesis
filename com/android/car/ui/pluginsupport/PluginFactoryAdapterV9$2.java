/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.android.car.ui.plugin.oemapis.FocusAreaOEMV1
 *  com.android.car.ui.plugin.oemapis.Function
 */
package com.android.car.ui.pluginsupport;

import android.content.Context;
import com.android.car.ui.FocusArea;
import com.android.car.ui.FocusAreaAdapterV1;
import com.android.car.ui.plugin.oemapis.FocusAreaOEMV1;
import com.android.car.ui.plugin.oemapis.Function;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV9;

class PluginFactoryAdapterV9$2
implements Function {
    public PluginFactoryAdapterV9$2(PluginFactoryAdapterV9 pluginFactoryAdapterV9) {
    }

    public FocusAreaOEMV1 apply(Context context) {
        return new FocusAreaAdapterV1(new FocusArea(context));
    }
}

