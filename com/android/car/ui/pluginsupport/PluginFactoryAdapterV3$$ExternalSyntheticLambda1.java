/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV1
 */
package com.android.car.ui.pluginsupport;

import com.android.car.ui.plugin.oemapis.recyclerview.ContentListItemOEMV1;
import com.android.car.ui.pluginsupport.PluginFactoryAdapterV3;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class PluginFactoryAdapterV3$$ExternalSyntheticLambda1
implements Consumer {
    public bla f$0;

    public /* synthetic */ PluginFactoryAdapterV3$$ExternalSyntheticLambda1(bla bla2) {
        this.f$0 = bla2;
    }

    public final void accept(Object object) {
        PluginFactoryAdapterV3.lambda$toOemListItem$0(this.f$0, (ContentListItemOEMV1)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

