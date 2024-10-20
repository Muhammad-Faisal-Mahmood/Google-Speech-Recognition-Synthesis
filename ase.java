/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 */
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

public final class ase
extends ast {
    private EditText ag;
    private CharSequence ah;
    private final Runnable ai = new akt(this, 7, null);
    private long aj = -1L;

    private final EditTextPreference H() {
        return (EditTextPreference)this.G();
    }

    private final void I(boolean bl2) {
        long l2 = bl2 ? SystemClock.currentThreadTimeMillis() : -1L;
        this.aj = l2;
    }

    @Override
    protected final void B(View view) {
        super.B(view);
        view = (EditText)view.findViewById(16908291);
        this.ag = view;
        if (view != null) {
            view.requestFocus();
            this.ag.setText(this.ah);
            view = this.ag;
            view.setSelection(view.getText().length());
            if (this.H().getOnBindEditTextListener() != null) {
                this.H().getOnBindEditTextListener().a();
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override
    public final void C(boolean bl2) {
        if (bl2) {
            String string = this.ag.getText().toString();
            EditTextPreference editTextPreference = this.H();
            if (editTextPreference.callChangeListener(string)) {
                editTextPreference.setText(string);
            }
        }
    }

    @Override
    protected final void D() {
        this.I(true);
        this.E();
    }

    public final void E() {
        long l2 = this.aj;
        if (l2 != -1L && l2 + 1000L > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.ag;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager)this.ag.getContext().getSystemService("input_method")).showSoftInput((View)this.ag, 0)) {
                    this.I(false);
                    return;
                }
                this.ag.removeCallbacks(this.ai);
                this.ag.postDelayed(this.ai, 50L);
                return;
            }
            this.I(false);
        }
    }

    @Override
    protected final boolean F() {
        return true;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.ah = this.H().getText();
            return;
        }
        this.ah = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ah);
    }
}

