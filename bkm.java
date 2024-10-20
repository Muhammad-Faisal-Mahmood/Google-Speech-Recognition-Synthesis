/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.preference.EditTextPreference;

public final class bkm
extends bkr
implements TextView.OnEditorActionListener {
    private EditText an;
    private CharSequence ao;
    private final boolean ap;

    public bkm() {
        this.ap = true;
    }

    private final EditTextPreference G() {
        return (EditTextPreference)this.F();
    }

    @Override
    protected final void B(View view) {
        super.B(view);
        view = (EditText)bnv.h(view, 16908291);
        this.an = view;
        if (view != null) {
            view.requestFocus();
            this.an.setText(this.ao);
            this.an.setInputType(1);
            this.an.setImeOptions(6);
            this.an.setOnEditorActionListener((TextView.OnEditorActionListener)this);
            view = this.an;
            view.setSelection(view.getText().length());
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override
    protected final void C(boolean bl2) {
        if (bl2) {
            String string = this.an.getText().toString();
            if (this.G().callChangeListener(string)) {
                this.G().setText(string);
            }
        }
    }

    @Override
    protected final boolean D() {
        return true;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.ao = this.G().getText();
            return;
        }
        this.ao = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    public final boolean onEditorAction(TextView object, int n2, KeyEvent keyEvent) {
        if (n2 == 6 && this.ap) {
            object = object.getText();
            this.G().callChangeListener(object);
            this.c();
            return true;
        }
        return false;
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ao);
    }
}

