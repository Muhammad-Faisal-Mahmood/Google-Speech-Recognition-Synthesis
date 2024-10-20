/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.car.ui.plugin.oemapis.Consumer
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.plugin.oemapis.Consumer;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV3;
import java.util.Iterator;

class ToolbarControllerAdapterV3$3
implements Consumer {
    final ToolbarControllerAdapterV3 this$0;

    public ToolbarControllerAdapterV3$3(ToolbarControllerAdapterV3 toolbarControllerAdapterV3) {
        this.this$0 = toolbarControllerAdapterV3;
    }

    public void accept(String string) {
        Iterator iterator = ToolbarControllerAdapterV3.-$$Nest$fgetmDeprecatedSearchListeners(this.this$0).iterator();
        while (iterator.hasNext()) {
            ((bnn)iterator.next()).a();
        }
        iterator = ToolbarControllerAdapterV3.-$$Nest$fgetmSearchListeners(this.this$0).iterator();
        while (iterator.hasNext()) {
            ag$$ExternalSyntheticApiModelOutline1.m(ag$$ExternalSyntheticApiModelOutline1.m(iterator.next()), (Object)string);
        }
    }
}

