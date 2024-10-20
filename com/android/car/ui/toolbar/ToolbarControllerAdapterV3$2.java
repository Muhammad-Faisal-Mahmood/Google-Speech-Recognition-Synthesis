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
import com.android.car.ui.toolbar.ToolbarControllerAdapterV3;

class ToolbarControllerAdapterV3$2
implements Consumer {
    final ToolbarControllerAdapterV3 this$0;

    public ToolbarControllerAdapterV3$2(ToolbarControllerAdapterV3 toolbarControllerAdapterV3) {
        this.this$0 = toolbarControllerAdapterV3;
    }

    public void accept(TextView textView) {
        ToolbarControllerAdapterV3.-$$Nest$fgetmSearchWidescreenController(this.this$0).d(textView);
    }
}

