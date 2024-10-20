/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.widget.EditText
 */
package com.android.car.ui.toolbar;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.EditText;
import java.util.function.BiConsumer;

public class CarUiEditText
extends EditText {
    public BiConsumer a = null;

    public CarUiEditText(Context context) {
        super(context);
    }

    public CarUiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CarUiEditText(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public CarUiEditText(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
    }

    public final boolean onPrivateIMECommand(String string, Bundle bundle) {
        BiConsumer biConsumer = this.a;
        if (biConsumer != null) {
            ag$$ExternalSyntheticApiModelOutline1.m(biConsumer, (Object)string, (Object)bundle);
        }
        return false;
    }
}

