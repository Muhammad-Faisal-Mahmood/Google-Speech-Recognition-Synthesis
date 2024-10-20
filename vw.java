/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

final class vw
implements ViewTreeObserver.OnGlobalLayoutListener,
View.OnAttachStateChangeListener {
    public final WeakHashMap a = new WeakHashMap();

    public final void a(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }

    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.a.entrySet()) {
                boolean bl2;
                View view = (View)entry.getKey();
                boolean bl3 = (Boolean)entry.getValue();
                boolean bl4 = view.isShown();
                boolean bl5 = bl2 = false;
                if (bl4) {
                    bl5 = bl2;
                    if (view.getWindowVisibility() == 0) {
                        bl5 = true;
                    }
                }
                if (bl3 == bl5) continue;
                int n2 = true != bl5 ? 32 : 16;
                wj.j(view, n2);
                entry.setValue(bl5);
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        this.a(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

