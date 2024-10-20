/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.ToolbarControllerAdapterV2;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class ToolbarControllerAdapterV2$$ExternalSyntheticLambda2
implements Consumer {
    public static final int a = 0;
    public ToolbarControllerAdapterV2 f$0;
    public bni f$1;

    public /* synthetic */ ToolbarControllerAdapterV2$$ExternalSyntheticLambda2(ToolbarControllerAdapterV2 toolbarControllerAdapterV2, bni bni2) {
        this.f$0 = toolbarControllerAdapterV2;
        this.f$1 = bni2;
    }

    public final void accept(Object object) {
        this.f$0.lambda$addTab$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(this.f$1, (bng)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

