/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.ToolbarControllerAdapterV2;
import j$.util.function.Consumer$_CC;
import java.util.List;
import java.util.function.Consumer;

public final class ToolbarControllerAdapterV2$$ExternalSyntheticLambda10
implements Consumer {
    public ToolbarControllerAdapterV2 f$0;
    public List f$1;
    public bng f$2;
    public Consumer f$3;

    public /* synthetic */ ToolbarControllerAdapterV2$$ExternalSyntheticLambda10(ToolbarControllerAdapterV2 toolbarControllerAdapterV2, List list, bng bng2, Consumer consumer) {
        this.f$0 = toolbarControllerAdapterV2;
        this.f$1 = list;
        this.f$2 = bng2;
        this.f$3 = consumer;
    }

    public final void accept(Object object) {
        this.f$0.lambda$updateModernTabsFromDeprecatedOnes$1$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(this.f$1, this.f$2, this.f$3, (bng)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

