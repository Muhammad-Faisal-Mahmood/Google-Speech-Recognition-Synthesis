/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.WindowInsetsController
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class vo
extends vm {
    private final View a;

    public vo(View view) {
        super(view);
        this.a = view;
    }

    @Override
    public final void a() {
        Object object = this.a;
        object = object != null ? sk$$ExternalSyntheticApiModelOutline1.m(object) : null;
        if (object != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vn vn2 = new vn(atomicBoolean);
            sk$$ExternalSyntheticApiModelOutline1.m((WindowInsetsController)object, vn2);
            if (!atomicBoolean.get() && (atomicBoolean = this.a) != null) {
                ((InputMethodManager)atomicBoolean.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
            }
            sk$$ExternalSyntheticApiModelOutline1.m$1((WindowInsetsController)object, vn2);
            sk$$ExternalSyntheticApiModelOutline1.m$1((WindowInsetsController)object, sk$$ExternalSyntheticApiModelOutline1.m());
            return;
        }
        super.a();
    }
}

