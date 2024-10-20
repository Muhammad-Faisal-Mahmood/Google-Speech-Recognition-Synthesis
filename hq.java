/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.InputFilter
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.CompoundButton
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class hq
extends RadioButton {
    private final hi a;
    private final hf b;
    private final ie c;
    private bxt d;

    public hq(Context object, AttributeSet attributeSet) {
        lv.a((Context)object);
        super((Context)object, attributeSet, 2130969749);
        lt.d((View)this, this.getContext());
        object = new hi((CompoundButton)this);
        this.a = object;
        ((hi)object).b(attributeSet, 2130969749);
        this.b = object = new hf((View)this);
        ((hf)object).b(attributeSet, 2130969749);
        this.c = object = new ie((TextView)this);
        ((ie)object).h(attributeSet, 2130969749);
        this.a().u(attributeSet, 2130969749);
    }

    private final bxt a() {
        if (this.d == null) {
            this.d = new bxt((TextView)this);
        }
        return this.d;
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

    public final void setAllCaps(boolean bl2) {
        super.setAllCaps(bl2);
        this.a();
        zt.g();
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

    public final void setButtonDrawable(int n2) {
        this.setButtonDrawable(kh.g(this.getContext(), n2));
    }

    public final void setButtonDrawable(Drawable object) {
        super.setButtonDrawable((Drawable)object);
        object = this.a;
        if (object != null) {
            ((hi)object).c();
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

    public final void setFilters(InputFilter[] inputFilterArray) {
        this.a();
        zt.g();
        super.setFilters(inputFilterArray);
    }
}

