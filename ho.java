/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.PopupWindow
 */
import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.wear.ambient.AmbientDelegate;

final class ho
extends PopupWindow {
    public ho(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet, n2, 0);
        object = AmbientDelegate.A((Context)object, attributeSet, er.s, n2, 0);
        if (((AmbientDelegate)object).x(2)) {
            this.setOverlapAnchor(((AmbientDelegate)object).w(2, false));
        }
        this.setBackgroundDrawable(((AmbientDelegate)object).r(0));
        ((AmbientDelegate)object).v();
    }
}

