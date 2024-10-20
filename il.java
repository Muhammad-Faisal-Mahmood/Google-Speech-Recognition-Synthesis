/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.InputFilter
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.TextView
 *  android.widget.ToggleButton
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public final class il
extends ToggleButton {
    private final hf a;
    private final ie b;
    private bxt c;

    public il(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet, 16842827);
        lt.d((View)this, this.getContext());
        object = new hf((View)this);
        this.a = object;
        ((hf)object).b(attributeSet, 16842827);
        this.b = object = new ie((TextView)this);
        ((ie)object).h(attributeSet, 16842827);
        this.a().u(attributeSet, 16842827);
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

    public final void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.a();
        zt.g();
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

    public final void setFilters(InputFilter[] inputFilterArray) {
        this.a();
        zt.g();
        super.setFilters(inputFilterArray);
    }
}

