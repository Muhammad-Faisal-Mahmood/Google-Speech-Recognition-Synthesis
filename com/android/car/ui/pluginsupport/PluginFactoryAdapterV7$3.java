/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.Consumer
 *  com.android.car.ui.plugin.oemapis.InsetsOEMV1
 */
package com.android.car.ui.pluginsupport;

import com.android.car.ui.plugin.oemapis.Consumer;
import com.android.car.ui.plugin.oemapis.InsetsOEMV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV7;

class PluginFactoryAdapterV7$3
implements Consumer {
    final PluginFactoryAdapterV7 this$0;
    final bju val$insetsChangedListener;

    public PluginFactoryAdapterV7$3(PluginFactoryAdapterV7 pluginFactoryAdapterV7, bju bju2) {
        this.val$insetsChangedListener = bju2;
        this.this$0 = pluginFactoryAdapterV7;
    }

    public void accept(InsetsOEMV1 insetsOEMV1) {
        bju bju2 = this.val$insetsChangedListener;
        if (bju2 != null) {
            bju2.a(PluginFactoryAdapterV7.-$$Nest$madaptInsets(this.this$0, insetsOEMV1));
        }
    }
}

