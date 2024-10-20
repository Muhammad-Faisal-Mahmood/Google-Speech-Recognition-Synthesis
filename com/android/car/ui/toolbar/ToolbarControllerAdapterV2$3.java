/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.Consumer
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.plugin.oemapis.Consumer;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2;
import java.util.Iterator;

class ToolbarControllerAdapterV2$3
implements Consumer {
    final ToolbarControllerAdapterV2 this$0;

    public ToolbarControllerAdapterV2$3(ToolbarControllerAdapterV2 toolbarControllerAdapterV2) {
        this.this$0 = toolbarControllerAdapterV2;
    }

    public void accept(String string) {
        Iterator iterator = ToolbarControllerAdapterV2.-$$Nest$fgetmDeprecatedSearchListeners(this.this$0).iterator();
        while (iterator.hasNext()) {
            ((bnn)iterator.next()).a();
        }
        iterator = ToolbarControllerAdapterV2.-$$Nest$fgetmSearchListeners(this.this$0).iterator();
        while (iterator.hasNext()) {
            ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(iterator.next()), (Object)string);
        }
    }
}

