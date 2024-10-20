/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.ActionMode$Callback
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.widget.CheckedTextView
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

public final class hh
extends CheckedTextView {
    private final hf a;
    private final ie b;
    private final adr c;
    private bxt d;

    public hh(Context object, AttributeSet attributeSet) {
        lv.a((Context)object);
        super((Context)object, attributeSet, 2130968822);
        lt.d((View)this, this.getContext());
        object = new ie((TextView)this);
        this.b = object;
        ((ie)object).h(attributeSet, 2130968822);
        ((ie)object).e();
        this.a = object = new hf((View)this);
        ((hf)object).b(attributeSet, 2130968822);
        this.c = object = new adr(this);
        ((adr)object).d(attributeSet);
        this.a().u(attributeSet, 2130968822);
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
            ((ie)object).e();
        }
        if ((object = this.a) != null) {
            ((hf)object).a();
        }
        if ((object = this.c) != null) {
            ((adr)object).c();
        }
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yj.d(super.getCustomSelectionActionModeCallback());
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        kh.d(inputConnection, editorInfo, (View)this);
        return inputConnection;
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

    public final void setCheckMarkDrawable(int n2) {
        this.setCheckMarkDrawable(kh.g(this.getContext(), n2));
    }

    public final void setCheckMarkDrawable(Drawable object) {
        super.setCheckMarkDrawable((Drawable)object);
        object = this.c;
        if (object != null) {
            if (((adr)object).a) {
                ((adr)object).a = false;
                return;
            }
            ((adr)object).a = true;
            ((adr)object).c();
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

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yj.e((TextView)this, callback));
    }

    public final void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.i(context, n2);
        }
    }
}

