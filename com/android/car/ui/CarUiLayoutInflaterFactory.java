/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.LayoutInflater$Factory2
 *  android.view.View
 */
package com.android.car.ui;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.android.car.ui.preference.CarUiPreferenceViewStub;
import com.android.car.ui.recyclerview.CarUiRecyclerView;

public class CarUiLayoutInflaterFactory
extends AppCompatViewInflater
implements LayoutInflater.Factory2 {
    @Override
    protected AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return bkd.a(context).createTextView(context, attributeSet);
    }

    @Override
    protected View createView(Context object, String string, AttributeSet attributeSet) {
        block7: {
            block3: {
                block6: {
                    block5: {
                        block4: {
                            block2: {
                                if (!CarUiRecyclerView.class.getName().equals(string)) break block2;
                                object = bkd.a(object).createRecyclerView((Context)object, attributeSet).getView();
                                break block3;
                            }
                            if (!string.contentEquals("CarUiTextView")) break block4;
                            object = bkd.a(object).createTextView((Context)object, attributeSet);
                            break block3;
                        }
                        if (!"androidx.recyclerview.widget.RecyclerView".equals(string)) break block5;
                        object = new RecyclerView((Context)object, attributeSet);
                        break block3;
                    }
                    if (!"TextView".equals(string)) break block6;
                    object = bkd.a(object).createTextView((Context)object, attributeSet);
                    break block3;
                }
                if (CarUiPreferenceViewStub.class.getName().equals(string)) break block7;
                object = null;
            }
            return object;
        }
        return bkd.a(object).createCarUiPreferenceView((Context)object, attributeSet);
    }

    public View onCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        return ((AppCompatViewInflater)this).createView(context, string, attributeSet);
    }

    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        return null;
    }
}

