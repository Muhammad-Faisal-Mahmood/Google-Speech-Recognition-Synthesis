/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.Selection
 *  android.text.Spannable
 *  android.text.method.KeyListener
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.ActionMode$Callback
 *  android.view.DragEvent
 *  android.view.View
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class hk
extends EditText {
    private final hf a;
    private final ie b;
    private final awf c;
    private final awg d;
    private AmbientMode$AmbientController e;

    public hk(Context object, AttributeSet attributeSet) {
        lv.a((Context)object);
        super((Context)object, attributeSet, 2130969118);
        lt.d((View)this, this.getContext());
        object = new hf((View)this);
        this.a = object;
        ((hf)object).b(attributeSet, 2130969118);
        this.b = object = new ie((TextView)this);
        ((ie)object).h(attributeSet, 2130969118);
        ((ie)object).e();
        this.c = new awf((Object)this);
        this.d = object = new awg(this);
        ((awg)object).j(attributeSet, 2130969118);
        attributeSet = this.getKeyListener();
        if (awg.k((KeyListener)attributeSet)) {
            boolean bl2 = super.isFocusable();
            boolean bl3 = super.isClickable();
            boolean bl4 = super.isLongClickable();
            int n2 = super.getInputType();
            object = awg.l((KeyListener)attributeSet);
            if (object != attributeSet) {
                super.setKeyListener((KeyListener)object);
                super.setRawInputType(n2);
                super.setFocusable(bl2);
                super.setClickable(bl3);
                super.setLongClickable(bl4);
            }
        }
    }

    private final AmbientMode$AmbientController a() {
        if (this.e == null) {
            this.e = new AmbientMode$AmbientController((Object)this);
        }
        return this.e;
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

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yj.d(super.getCustomSelectionActionModeCallback());
    }

    public final Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public final TextClassifier getTextClassifier() {
        awf awf2;
        if (Build.VERSION.SDK_INT < 28 && (awf2 = this.c) != null) {
            return awf2.k();
        }
        return ((EditText)this.a().a).getTextClassifier();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnection = super.onCreateInputConnection(editorInfo);
        ie.r((TextView)this, inputConnection, editorInfo);
        kh.d(inputConnection, editorInfo, (View)this);
        Object object = inputConnection;
        if (inputConnection != null) {
            object = inputConnection;
            if (Build.VERSION.SDK_INT <= 30) {
                String[] stringArray = wj.r((View)this);
                object = inputConnection;
                if (stringArray != null) {
                    hk$$ExternalSyntheticApiModelOutline0.m(editorInfo, stringArray);
                    object = new AmbientMode$AmbientController((Object)this, null);
                    a.r(editorInfo, "editorInfo must be non-null");
                    object = new yf(inputConnection, (AmbientMode$AmbientController)object);
                }
            }
        }
        return this.d.m((InputConnection)object);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).isActive((View)this);
        }
    }

    public final boolean onDragEvent(DragEvent object) {
        if (Build.VERSION.SDK_INT < 31 && object.getLocalState() == null && wj.r((View)this) != null) {
            Context context;
            block9: {
                context = this.getContext();
                while (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        context = (Activity)context;
                        break block9;
                    }
                    context = ((ContextWrapper)context).getBaseContext();
                }
                context = null;
            }
            if (context == null) {
                ((Object)((Object)this)).toString();
                Log.i((String)"ReceiveContent", (String)"Can't handle drop: no activity: view=".concat(((Object)((Object)this)).toString()));
            } else if (object.getAction() != 1 && object.getAction() == 3) {
                ag$$ExternalSyntheticApiModelOutline1.m((Activity)context, object);
                int n2 = this.getOffsetForPosition(object.getX(), object.getY());
                this.beginBatchEdit();
                try {
                    Selection.setSelection((Spannable)this.getText(), (int)n2);
                    context = object.getClipData();
                    object = Build.VERSION.SDK_INT >= 31 ? new ut((ClipData)context, 3) : new uv((ClipData)context, 3);
                    wj.c((View)this, a.Q((uu)object));
                    return true;
                }
                finally {
                    this.endBatchEdit();
                }
            }
        }
        return super.onDragEvent(object);
    }

    public final boolean onTextContextMenuItem(int n2) {
        block4: {
            Object object;
            int n3;
            block5: {
                if (Build.VERSION.SDK_INT >= 31 || wj.r((View)this) == null) break block4;
                n3 = n2;
                if (n2 == 0x1020022) break block5;
                if (n2 != 16908337) break block4;
                n3 = 16908337;
            }
            if ((object = (object = (ClipboardManager)this.getContext().getSystemService("clipboard")) == null ? null : object.getPrimaryClip()) != null && object.getItemCount() > 0) {
                object = Build.VERSION.SDK_INT >= 31 ? new ut((ClipData)object, 1) : new uv((ClipData)object, 1);
                n2 = n3 == 0x1020022 ? 0 : 1;
                object.c(n2);
                wj.c((View)this, a.Q((uu)object));
            }
            return true;
        }
        return super.onTextContextMenuItem(n2);
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

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yj.e((TextView)this, callback));
    }

    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(awg.l(keyListener));
    }

    public final void setTextAppearance(Context context, int n2) {
        super.setTextAppearance(context, n2);
        ie ie2 = this.b;
        if (ie2 != null) {
            ie2.i(context, n2);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        awf awf2;
        if (Build.VERSION.SDK_INT < 28 && (awf2 = this.c) != null) {
            awf2.b = textClassifier;
            return;
        }
        ((EditText)this.a().a).setTextClassifier(textClassifier);
    }
}

