/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsController
 */
import android.view.WindowInsetsController;
import android.view.WindowInsetsController$OnControllableInsetsChangedListener;
import java.util.concurrent.atomic.AtomicBoolean;

public final class vn
implements WindowInsetsController$OnControllableInsetsChangedListener {
    public final AtomicBoolean a;

    public /* synthetic */ vn(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int n2) {
        boolean bl2 = (n2 & 8) != 0;
        this.a.set(bl2);
    }
}

