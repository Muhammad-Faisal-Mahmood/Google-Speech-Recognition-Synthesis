/*
 * Decompiled with CFR 0.152.
 */
package com.android.car.ui.toolbar;

import com.android.car.ui.toolbar.TabAdapterV1;
import java.util.function.Consumer;

public final class TabAdapterV1$$ExternalSyntheticLambda0
implements Runnable {
    public TabAdapterV1 f$0;
    public Consumer f$1;

    public /* synthetic */ TabAdapterV1$$ExternalSyntheticLambda0(TabAdapterV1 tabAdapterV1, Consumer consumer) {
        this.f$0 = tabAdapterV1;
        this.f$1 = consumer;
    }

    @Override
    public final void run() {
        this.f$0.lambda$new$0$com-android-car-ui-toolbar-TabAdapterV1(this.f$1);
    }
}

