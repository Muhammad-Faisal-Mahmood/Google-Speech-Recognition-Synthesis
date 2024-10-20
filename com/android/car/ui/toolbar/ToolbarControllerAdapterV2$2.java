/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 *  com.android.car.ui.plugin.oemapis.Consumer
 */
package com.android.car.ui.toolbar;

import android.widget.TextView;
import com.android.car.ui.plugin.oemapis.Consumer;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2;

class ToolbarControllerAdapterV2$2
implements Consumer {
    final ToolbarControllerAdapterV2 this$0;

    public ToolbarControllerAdapterV2$2(ToolbarControllerAdapterV2 toolbarControllerAdapterV2) {
        this.this$0 = toolbarControllerAdapterV2;
    }

    public void accept(TextView textView) {
        ToolbarControllerAdapterV2.-$$Nest$fgetmSearchWidescreenController(this.this$0).d(textView);
    }
}

