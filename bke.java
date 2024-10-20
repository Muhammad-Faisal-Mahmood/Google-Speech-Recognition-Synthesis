/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 */
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;

public final class bke
implements View.OnApplyWindowInsetsListener {
    private final int a;

    public /* synthetic */ bke(int n2) {
        this.a = n2;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        block2: {
            block5: {
                block4: {
                    block3: {
                        if (this.a == 0) break block2;
                        if (Build.VERSION.SDK_INT >= 30) break block3;
                        view = view.onApplyWindowInsets(windowInsets);
                        break block4;
                    }
                    if (sk$$ExternalSyntheticApiModelOutline1.m(windowInsets, sk$$ExternalSyntheticApiModelOutline1.m())) break block5;
                    view = view.onApplyWindowInsets(windowInsets);
                }
                return view;
            }
            new Bundle();
            throw null;
        }
        return view.onApplyWindowInsets(dp$$ExternalSyntheticApiModelOutline0.m(sk$$ExternalSyntheticApiModelOutline1.m(new WindowInsets.Builder(windowInsets), sk$$ExternalSyntheticApiModelOutline1.m$3(), dp$$ExternalSyntheticApiModelOutline0.m())));
    }
}

