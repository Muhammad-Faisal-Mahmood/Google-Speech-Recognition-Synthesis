/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.method.KeyListener
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.EditText
 *  android.widget.MultiAutoCompleteTextView
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;

public final class hn
extends MultiAutoCompleteTextView {
    private static final int[] a = new int[]{16843126};
    private final hf b;
    private final ie c;
    private final awg d;

    public hn(Context object, AttributeSet attributeSet) {
        lv.a((Context)object);
        super((Context)object, attributeSet, 2130968654);
        lt.d((View)this, this.getContext());
        object = AmbientDelegate.A(this.getContext(), attributeSet, a, 2130968654, 0);
        if (((AmbientDelegate)object).x(0)) {
            this.setDropDownBackgroundDrawable(((AmbientDelegate)object).r(0));
        }
        ((AmbientDelegate)object).v();
        this.b = object = new hf((View)this);
        ((hf)object).b(attributeSet, 2130968654);
        this.c = object = new ie((TextView)this);
        ((ie)object).h(attributeSet, 2130968654);
        ((ie)object).e();
        this.d = object = new awg((EditText)this);
        ((awg)object).j(attributeSet, 2130968654);
        object = this.getKeyListener();
        if (awg.k((KeyListener)object)) {
            boolean bl2 = super.isFocusable();
            boolean bl3 = super.isClickable();
            boolean bl4 = super.isLongClickable();
            int n2 = super.getInputType();
            attributeSet = awg.l((KeyListener)object);
            if (attributeSet != object) {
                super.setKeyListener((KeyListener)attributeSet);
                super.setRawInputType(n2);
                super.setFocusable(bl2);
                super.setClickable(bl3);
                super.setLongClickable(bl4);
            }
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Object object = this.b;
        if (object != null) {
            ((hf)object).a();
        }
        if ((object = this.c) != null) {
            ((ie)object).e();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        kh.d(inputConnection, editorInfo, (View)this);
        return this.d.m(inputConnection);
    }

    public final void setBackgroundDrawable(Drawable object) {
        super.setBackgroundDrawable((Drawable)object);
        object = this.b;
        if (object != null) {
            ((hf)object).e();
        }
    }

    public final void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        hf hf2 = this.b;
        if (hf2 != null) {
            hf2.c(n2);
        }
    }

    public final void setCompoundDrawables(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawables((Drawable)object, drawable, drawable2, drawable3);
        object = this.c;
        if (object != null) {
            ((ie)object).e();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable object, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        super.setCompoundDrawablesRelative((Drawable)object, drawable, drawable2, drawable3);
        object = this.c;
        if (object != null) {
            ((ie)object).e();
        }
    }

    public final void setDropDownBackgroundResource(int n2) {
        this.setDropDownBackgroundDrawable(kh.g(this.getContext(), n2));
    }

    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(awg.l(keyListener));
    }

    public final void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        ie ie2 = this.c;
        if (ie2 != null) {
            ie2.i(context, n2);
        }
    }
}

