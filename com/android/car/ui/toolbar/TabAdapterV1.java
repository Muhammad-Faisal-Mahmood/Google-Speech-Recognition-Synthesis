/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.toolbar.TabOEMV1
 *  com.android.car.ui.plugin.oemapis.toolbar.TabOEMV1$Builder
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.plugin.oemapis.toolbar.TabOEMV1;
import com.android.car.ui.toolbar.TabAdapterV1$$ExternalSyntheticLambda0;
import java.util.function.Consumer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class TabAdapterV1 {
    private final bng mClientTab;
    private final TabOEMV1 mPluginTab;

    public TabAdapterV1(bng bng2) {
        this.mClientTab = bng2;
        Object object = bng2.d;
        TabOEMV1.Builder builder = TabOEMV1.builder();
        Object object2 = bng2.c;
        object2 = null;
        builder = builder.setIcon(null);
        Object object3 = bng2.b;
        builder = builder.setTitle(null);
        if (object != null) {
            object2 = new TabAdapterV1$$ExternalSyntheticLambda0(this, (Consumer)object);
        }
        this.mPluginTab = builder.setOnSelectedListener((Runnable)object2).setTinted(bng2.a).build();
    }

    public bng getClientTab() {
        return this.mClientTab;
    }

    public TabOEMV1 getPluginTab() {
        return this.mPluginTab;
    }

    public /* synthetic */ void lambda$new$0$com-android-car-ui-toolbar-TabAdapterV1(Consumer consumer) {
        ag$$ExternalSyntheticApiModelOutline1.m(consumer, (Object)this.mClientTab);
    }
}

