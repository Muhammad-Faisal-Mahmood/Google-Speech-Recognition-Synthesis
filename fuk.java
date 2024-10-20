/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

public final class fuk {
    public int a;
    public boolean b;
    public final BottomSheetBehavior c;
    private final Runnable d;

    public fuk(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
        this.d = new ffd(this, 11);
    }

    public final void a(int n2) {
        WeakReference weakReference = this.c.A;
        if (weakReference != null && weakReference.get() != null) {
            this.a = n2;
            if (!this.b) {
                ((View)this.c.A.get()).postOnAnimation(this.d);
                this.b = true;
            }
        }
    }
}

