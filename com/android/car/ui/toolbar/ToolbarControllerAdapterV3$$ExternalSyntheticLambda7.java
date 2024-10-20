/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.ToolbarControllerAdapterV3;
import j$.util.function.Consumer$_CC;
import java.util.List;
import java.util.function.Consumer;

public final class ToolbarControllerAdapterV3$$ExternalSyntheticLambda7
implements Consumer {
    public ToolbarControllerAdapterV3 f$0;
    public List f$1;
    public bng f$2;
    public Consumer f$3;

    public /* synthetic */ ToolbarControllerAdapterV3$$ExternalSyntheticLambda7(ToolbarControllerAdapterV3 toolbarControllerAdapterV3, List list, bng bng2, Consumer consumer) {
        this.f$0 = toolbarControllerAdapterV3;
        this.f$1 = list;
        this.f$2 = bng2;
        this.f$3 = consumer;
    }

    public final void accept(Object object) {
        this.f$0.lambda$setTabs$1$com-android-car-ui-toolbar-ToolbarControllerAdapterV3(this.f$1, this.f$2, this.f$3, (bng)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

