/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class vm
extends vy {
    private final View a;

    public vm(View view) {
        this.a = view;
    }

    @Override
    public void a() {
        View view = this.a;
        if (view != null) {
            ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        }
    }
}

