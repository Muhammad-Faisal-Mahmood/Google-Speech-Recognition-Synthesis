/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.InputFilter
 *  android.util.AttributeSet
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.widget.Button
 *  android.widget.TextView
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

public class AppCompatButton
extends Button {
    public final hf a;
    private final ie b;
    private bxt c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968759);
    }

    public AppCompatButton(Context object, AttributeSet attributeSet, int n2) {
        lv.a((Context)object);
        super((Context)object, attributeSet, n2);
        lt.d((View)this, this.getContext());
        object = new hf((View)this);
        this.a = object;
        ((hf)object).b(attributeSet, n2);
        this.b = object = new ie((TextView)this);
        ((ie)object).h(attributeSet, n2);
        ((ie)object).e();
        this.a().u(attributeSet, n2);
    }

    private final bxt a() {
        if (this.c == null) {
            this.c = new bxt((TextView)this);
        }
        return this.c;
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.a;
        if (object != null) {
            ((hf)object).a();
        }
        if ((object = this.b) != null) {
            ((ie)object).e();
        }
    }

    public final int getAutoSizeMaxTextSize() {
        if (mi.c) {
            return super.getAutoSizeMaxTextSize();
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            return ie2.a();
        }
        return -1;
    }

    public final int getAutoSizeMinTextSize() {
        if (mi.c) {
            return super.getAutoSizeMinTextSize();
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            return ie2.b();
        }
        return -1;
    }

    public final int getAutoSizeStepGranularity() {
        if (mi.c) {
            return super.getAutoSizeStepGranularity();
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            return ie2.c();
        }
        return -1;
    }

    public final int[] getAutoSizeTextAvailableSizes() {
        if (mi.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            return ie2.p();
        }
        return new int[0];
    }

    public final int getAutoSizeTextType() {
        if (mi.c) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            return ie2.d();
        }
        return 0;
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yj.d(super.getCustomSelectionActionModeCallback());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }

    protected void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        super.onLayout(bl2, n2, n3, n4, n5);
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.q();
        }
    }

    protected void onTextChanged(CharSequence object, int n2, int n3, int n4) {
        super.onTextChanged((CharSequence)object, n2, n3, n4);
        object = this.b;
        if (object != null && !mi.c && ((ie)object).o()) {
            ((ie)object).g();
        }
    }

    public final void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.a();
        zt.g();
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int n2, int n3, int n4, int n5) {
        if (mi.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n2, n3, n4, n5);
            return;
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.k(n2, n3, n4, n5);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] nArray, int n2) {
        if (mi.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(nArray, n2);
            return;
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.l(nArray, n2);
        }
    }

    public final void setAutoSizeTextTypeWithDefaults(int n2) {
        if (mi.c) {
            super.setAutoSizeTextTypeWithDefaults(n2);
            return;
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.m(n2);
        }
    }

    public void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((hf)object).e();
        }
    }

    public void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        hf hf2 = this.a;
        if (hf2 != null) {
            hf2.c(n2);
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yj.e((TextView)this, callback));
    }

    public final void setFilters(InputFilter[] inputFilterArray) {
        this.a();
        zt.g();
        super.setFilters(inputFilterArray);
    }

    public final void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.i(context, n2);
        }
    }

    public final void setTextSize(int n2, float f2) {
        if (mi.c) {
            super.setTextSize(n2, f2);
            return;
        }
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.n(n2, f2);
        }
    }
}

