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
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV4;

class PluginFactoryAdapterV4$3
implements Consumer {
    final PluginFactoryAdapterV4 this$0;
    final bju val$insetsChangedListener;

    public PluginFactoryAdapterV4$3(PluginFactoryAdapterV4 pluginFactoryAdapterV4, bju bju2) {
        this.val$insetsChangedListener = bju2;
        this.this$0 = pluginFactoryAdapterV4;
    }

    public void accept(InsetsOEMV1 insetsOEMV1) {
        bju bju2 = this.val$insetsChangedListener;
        if (bju2 != null) {
            bju2.a(PluginFactoryAdapterV4.-$$Nest$madaptInsets(this.this$0, insetsOEMV1));
        }
    }
}

