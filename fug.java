/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class fug
implements yd {
    final int a;
    final BottomSheetBehavior b;

    public fug(BottomSheetBehavior bottomSheetBehavior, int n2) {
        this.a = n2;
        this.b = bottomSheetBehavior;
    }

    @Override
    public final boolean a(View view) {
        this.b.L(this.a);
        return true;
    }
}

