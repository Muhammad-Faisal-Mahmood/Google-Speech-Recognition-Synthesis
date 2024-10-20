/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.ToolbarControllerAdapterV3;
import j$.util.function.Function$_CC;
import java.util.List;
import java.util.function.Function;

public final class ToolbarControllerAdapterV3$$ExternalSyntheticLambda11
implements Function {
    public ToolbarControllerAdapterV3 f$0;
    public List f$1;

    public /* synthetic */ ToolbarControllerAdapterV3$$ExternalSyntheticLambda11(ToolbarControllerAdapterV3 toolbarControllerAdapterV3, List list) {
        this.f$0 = toolbarControllerAdapterV3;
        this.f$1 = list;
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        return this.f$0.lambda$updateModernTabsFromDeprecatedOnes$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV3(this.f$1, (bng)object);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

