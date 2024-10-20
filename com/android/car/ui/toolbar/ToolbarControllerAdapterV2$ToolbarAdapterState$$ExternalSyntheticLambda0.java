/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.MenuItemAdapterV1;
import com.android.car.ui.toolbar.ToolbarControllerAdapterV2$ToolbarAdapterState;
import j$.util.function.Predicate$_CC;
import java.util.function.Predicate;

public final class ToolbarControllerAdapterV2$ToolbarAdapterState$$ExternalSyntheticLambda0
implements Predicate {
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$_CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$_CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$_CC.$default$or(this, predicate);
    }

    public final boolean test(Object object) {
        return ToolbarControllerAdapterV2$ToolbarAdapterState.lambda$getShownMenuItems$0((MenuItemAdapterV1)object);
    }
}

