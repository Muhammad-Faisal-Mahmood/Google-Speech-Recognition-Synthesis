/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.ToolbarControllerAdapterV3;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class ToolbarControllerAdapterV3$$ExternalSyntheticLambda5
implements Consumer {
    public static final int a = 0;
    public ToolbarControllerAdapterV3 f$0;
    public bni f$1;

    public /* synthetic */ ToolbarControllerAdapterV3$$ExternalSyntheticLambda5(ToolbarControllerAdapterV3 toolbarControllerAdapterV3, bni bni2) {
        this.f$0 = toolbarControllerAdapterV3;
        this.f$1 = bni2;
    }

    public final void accept(Object object) {
        this.f$0.lambda$addTab$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV3(this.f$1, (bng)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

