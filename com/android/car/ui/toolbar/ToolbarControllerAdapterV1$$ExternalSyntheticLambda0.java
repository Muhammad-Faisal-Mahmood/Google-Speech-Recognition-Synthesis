/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.ToolbarControllerAdapterV1;
import j$.util.function.Function$_CC;
import java.util.List;
import java.util.function.Function;

public final class ToolbarControllerAdapterV1$$ExternalSyntheticLambda0
implements Function {
    public ToolbarControllerAdapterV1 f$0;
    public List f$1;

    public /* synthetic */ ToolbarControllerAdapterV1$$ExternalSyntheticLambda0(ToolbarControllerAdapterV1 toolbarControllerAdapterV1, List list) {
        this.f$0 = toolbarControllerAdapterV1;
        this.f$1 = list;
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        return this.f$0.lambda$updateModernTabsFromDeprecatedOnes$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV1(this.f$1, (bng)object);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

