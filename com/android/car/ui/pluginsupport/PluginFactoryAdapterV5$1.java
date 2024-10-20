/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.android.car.ui.plugin.oemapis.FocusParkingViewOEMV1
 *  com.android.car.ui.plugin.oemapis.Function
 */
package com.android.car.ui.pluginsupport;

import android.content.Context;
import com.android.car.ui.FocusParkingView;
import com.android.car.ui.FocusParkingViewAdapterV1;
import com.android.car.ui.plugin.oemapis.FocusParkingViewOEMV1;
import com.android.car.ui.plugin.oemapis.Function;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV5;

class PluginFactoryAdapterV5$1
implements Function {
    public PluginFactoryAdapterV5$1(PluginFactoryAdapterV5 pluginFactoryAdapterV5) {
    }

    public FocusParkingViewOEMV1 apply(Context context) {
        return new FocusParkingViewAdapterV1(new FocusParkingView(context));
    }
}

