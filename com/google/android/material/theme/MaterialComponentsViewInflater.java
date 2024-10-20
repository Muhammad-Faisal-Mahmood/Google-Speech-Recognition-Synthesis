/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class MaterialComponentsViewInflater
extends AppCompatViewInflater {
    @Override
    protected final he createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new fyg(context, attributeSet);
    }

    @Override
    protected final AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new fup(context, attributeSet);
    }

    @Override
    protected final hg createCheckBox(Context context, AttributeSet attributeSet) {
        return new fux(context, attributeSet);
    }

    @Override
    protected final hq createRadioButton(Context context, AttributeSet attributeSet) {
        return new fwr(context, attributeSet);
    }

    @Override
    protected final AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new fyj(context, attributeSet);
    }
}

