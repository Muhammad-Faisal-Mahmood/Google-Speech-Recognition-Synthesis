/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.android.car.ui.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

@Deprecated
public class CarUiRecyclerViewContainer
extends FrameLayout {
    public CarUiRecyclerViewContainer(Context context) {
        this(context, null);
    }

    public CarUiRecyclerViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarUiRecyclerViewContainer(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        CarUiRecyclerViewContainer.inflate((Context)context, (int)2131624013, (ViewGroup)this);
    }
}

