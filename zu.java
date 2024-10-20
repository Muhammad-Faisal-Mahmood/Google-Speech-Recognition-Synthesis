/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.EditText
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class zu
implements TextWatcher {
    public boolean a;
    private final EditText b;

    public zu(EditText editText) {
        this.b = editText;
        this.a = true;
    }

    public final void afterTextChanged(Editable object) {
        if (!this.b.isInEditMode() && this.a) {
            object = zl.a;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
    }

    public final void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
    }
}

