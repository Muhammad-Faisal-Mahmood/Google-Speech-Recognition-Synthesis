/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
package com.android.car.ui.toolbar;

import android.widget.TextView;
import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

public final class ToolbarControllerAdapterV1$$ExternalSyntheticLambda7
implements Consumer {
    public bne f$0;

    public /* synthetic */ ToolbarControllerAdapterV1$$ExternalSyntheticLambda7(bne bne2) {
        this.f$0 = bne2;
    }

    public final void accept(Object object) {
        this.f$0.d((TextView)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }
}

