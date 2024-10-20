/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewDebug$ExportedProperty
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

public final class hb
extends jo {
    @ViewDebug.ExportedProperty
    public boolean a;
    @ViewDebug.ExportedProperty
    public int b;
    @ViewDebug.ExportedProperty
    public int c;
    @ViewDebug.ExportedProperty
    public boolean d;
    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public hb() {
        super(-2);
        this.a = false;
    }

    public hb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public hb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public hb(hb hb2) {
        super((ViewGroup.LayoutParams)hb2);
        this.a = hb2.a;
    }
}

