/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.ToolbarControllerAdapterV2;
import j$.util.function.Function$_CC;
import java.util.List;
import java.util.function.Function;

public final class ToolbarControllerAdapterV2$$ExternalSyntheticLambda11
implements Function {
    public ToolbarControllerAdapterV2 f$0;
    public List f$1;

    public /* synthetic */ ToolbarControllerAdapterV2$$ExternalSyntheticLambda11(ToolbarControllerAdapterV2 toolbarControllerAdapterV2, List list) {
        this.f$0 = toolbarControllerAdapterV2;
        this.f$1 = list;
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$_CC.$default$andThen(this, function);
    }

    public final Object apply(Object object) {
        return this.f$0.lambda$setTabs$0$com-android-car-ui-toolbar-ToolbarControllerAdapterV2(this.f$1, (bng)object);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$_CC.$default$compose(this, function);
    }
}

