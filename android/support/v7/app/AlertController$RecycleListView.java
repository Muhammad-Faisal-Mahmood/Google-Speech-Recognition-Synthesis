/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ListView
 */
package android.support.v7.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView
extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, er.t);
        this.b = context.getDimensionPixelOffset(0, -1);
        this.a = context.getDimensionPixelOffset(1, -1);
    }
}

