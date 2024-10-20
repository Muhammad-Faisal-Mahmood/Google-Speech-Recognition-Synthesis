/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Paint
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.text.InputFilter
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j$.util.Objects;

public class AppCompatTextView
extends TextView {
    private final hf a;
    private final ie b;
    private boolean c;
    private Typeface d;
    private Typeface e;
    private String f;
    private if g;
    private final awf h;
    private bxt i;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context object, AttributeSet attributeSet, int n2) {
        lv.a((Context)object);
        super((Context)object, attributeSet, n2);
        this.c = false;
        this.g = null;
        lt.d((View)this, this.getContext());
        object = new hf((View)this);
        this.a = object;
        ((hf)object).b(attributeSet, n2);
        this.b = object = new ie(this);
        ((ie)object).h(attributeSet, n2);
        ((ie)object).e();
        this.h = new awf((Object)this);
        this.b().u(attributeSet, n2);
    }

    private final void a(Typeface typeface) {
        this.e = typeface;
        super.setTypeface(typeface);
    }

    private final bxt b() {
        if (this.i == null) {
            this.i = new bxt(this);
        }
        return this.i;
    }

    public static /* synthetic */ void g(AppCompatTextView appCompatTextView, int n2) {
        super.setFirstBaselineToTopHeight(n2);
    }

    public static /* synthetic */ void h(AppCompatTextView appCompatTextView, int n2) {
        super.setLastBaselineToBottomHeight(n2);
    }

    public static /* synthetic */ void i(AppCompatTextView appCompatTextView, int n2, float f2) {
        super.setLineHeight(n2, f2);
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

    public final int getFirstBaselineToTopHeight() {
        return this.getPaddingTop() - this.getPaint().getFontMetricsInt().top;
    }

    public final String getFontVariationSettings() {
        return this.f;
    }

    public final int getLastBaselineToBottomHeight() {
        return this.getPaddingBottom() + this.getPaint().getFontMetricsInt().bottom;
    }

    public final TextClassifier getTextClassifier() {
        awf awf2;
        if (Build.VERSION.SDK_INT < 28 && (awf2 = this.h) != null) {
            return awf2.k();
        }
        return super.getTextClassifier();
    }

    public final Typeface getTypeface() {
        return this.d;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    final if j() {
        void var1_2;
        if (this.g != null) return this.g;
        if (Build.VERSION.SDK_INT >= 34) {
            ih ih2 = new ih(this);
        } else if (Build.VERSION.SDK_INT >= 28) {
            ig ig2 = new ig(this);
        } else {
            if if_ = new if(this);
        }
        this.g = var1_2;
        return this.g;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        ie.r(this, inputConnection, editorInfo);
        kh.d(inputConnection, editorInfo, (View)this);
        return inputConnection;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33 && this.onCheckIsTextEditor()) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).isActive((View)this);
        }
    }

    protected final void onLayout(boolean bl2, int n2, int n3, int n4, int n5) {
        super.onLayout(bl2, n2, n3, n4, n5);
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.q();
        }
    }

    protected void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
    }

    protected final void onTextChanged(CharSequence object, int n2, int n3, int n4) {
        super.onTextChanged((CharSequence)object, n2, n3, n4);
        object = this.b;
        if (object != null && !mi.c && ((ie)object).o()) {
            ((ie)object).g();
        }
    }

    public final void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.b();
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

    public final void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((hf)object).e();
        }
    }

    public final void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        hf hf2 = this.a;
        if (hf2 != null) {
            hf2.c(n2);
        }
    }

    public final void setCompoundDrawables(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((ie)object).e();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((ie)object).e();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int n2, int n3, int n4, int n5) {
        Context context = this.getContext();
        Drawable drawable = null;
        Object object = n2 != 0 ? kh.g(context, n2) : null;
        Drawable drawable2 = n3 != 0 ? kh.g(context, n3) : null;
        Drawable drawable3 = n4 != 0 ? kh.g(context, n4) : null;
        if (n5 != 0) {
            drawable = kh.g(context, n5);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable);
        object = this.b;
        if (object != null) {
            ((ie)object).e();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((ie)object).e();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int n2, int n3, int n4, int n5) {
        Context context = this.getContext();
        Drawable drawable = null;
        Object object = n2 != 0 ? kh.g(context, n2) : null;
        Drawable drawable2 = n3 != 0 ? kh.g(context, n3) : null;
        Drawable drawable3 = n4 != 0 ? kh.g(context, n4) : null;
        if (n5 != 0) {
            drawable = kh.g(context, n5);
        }
        this.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable2, drawable3, drawable);
        object = this.b;
        if (object != null) {
            ((ie)object).e();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesWithIntrinsicBounds((Drawable)object, drawable, drawable2, drawable3);
        object = this.b;
        if (object != null) {
            ((ie)object).e();
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yj.e(this, callback));
    }

    public final void setFilters(InputFilter[] inputFilterArray) {
        this.b();
        zt.g();
        super.setFilters(inputFilterArray);
    }

    public final void setFirstBaselineToTopHeight(int n2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.j().a(n2);
            return;
        }
        yj.f(this, n2);
    }

    public final boolean setFontVariationSettings(String string) {
        un un2;
        Typeface typeface;
        Typeface typeface2 = this.d;
        if (this.e != this.getPaint().getTypeface()) {
            Log.w((String)"AppCompatTextView", (String)"getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface2 = this.getPaint().getTypeface();
        }
        if ((typeface = (Typeface)id.a.a(un2 = new un(typeface2, string))) != null) {
            typeface2 = typeface;
        } else {
            Paint paint = id.b;
            typeface = paint;
            if (paint == null) {
                typeface = new Paint();
                id.b = typeface;
            }
            if (Objects.equals(ag$$ExternalSyntheticApiModelOutline0.m((Paint)typeface), string)) {
                ag$$ExternalSyntheticApiModelOutline0.m((Paint)typeface, null);
            }
            typeface.setTypeface(typeface2);
            if (ag$$ExternalSyntheticApiModelOutline0.m((Paint)typeface, string)) {
                typeface2 = typeface.getTypeface();
                id.a.b(un2, typeface2);
            } else {
                typeface2 = null;
            }
        }
        if (typeface2 != null) {
            this.a(typeface2);
            this.f = string;
            return true;
        }
        return false;
    }

    public final void setLastBaselineToBottomHeight(int n2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.j().b(n2);
            return;
        }
        yj.g(this, n2);
    }

    public final void setLineHeight(int n2) {
        yj.h(this, n2);
    }

    public final void setLineHeight(int n2, float f2) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.j().c(n2, f2);
            return;
        }
        yj.i(this, n2, f2);
    }

    public void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.i(context, n2);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        awf awf2;
        if (Build.VERSION.SDK_INT < 28 && (awf2 = this.h) != null) {
            awf2.b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
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

    public final void setTypeface(Typeface typeface) {
        this.d = typeface;
        this.a(typeface);
    }

    public final void setTypeface(Typeface typeface, int n2) {
        if (this.c) {
            return;
        }
        Typeface typeface2 = typeface;
        if (typeface != null) {
            typeface2 = typeface;
            if (n2 > 0) {
                if (this.getContext() != null) {
                    typeface2 = Typeface.create((Typeface)typeface, (int)n2);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
        }
        this.c = true;
        try {
            super.setTypeface(typeface2, n2);
            return;
        }
        finally {
            this.c = false;
        }
    }
}

