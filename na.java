/*
 * Decompiled with CFR 0.152.
 */
import android.window.OnBackInvokedCallback;

public final class na
implements OnBackInvokedCallback {
    public final Object a;
    private final int b;

    public /* synthetic */ na(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onBackInvoked() {
        if (this.b != 0) {
            ((eg)this.a).I();
            return;
        }
        this.a.a();
    }
}

