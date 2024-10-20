/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.InsetsOEMV1
 */
package com.android.car.ui.pluginsupport;

import com.android.car.ui.plugin.oemapis.InsetsOEMV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class PluginFactoryAdapterV3$$ExternalSyntheticLambda6
implements Consumer {
    public PluginFactoryAdapterV3 f$0;
    public bju f$1;

    public /* synthetic */ PluginFactoryAdapterV3$$ExternalSyntheticLambda6(PluginFactoryAdapterV3 pluginFactoryAdapterV3, bju bju2) {
        this.f$0 = pluginFactoryAdapterV3;
        this.f$1 = bju2;
    }

    public final void accept(Object object) {
        this.f$0.lambda$installBaseLayoutAround$0$com-android-car-ui-pluginsupport-PluginFactoryAdapterV3(this.f$1, (InsetsOEMV1)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

