/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalFocusChangeListener
 */
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import com.android.car.ui.FocusParkingView;

public final class bjj
implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final Object a;
    private final int b;

    public /* synthetic */ bjj(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        if (this.b != 0) {
            bji bji2 = (bji)this.a;
            boolean bl2 = bji2.c.hasFocus();
            if (!bl2) {
                if (bji2.d) {
                    bji2.F.j(bji2.y, SystemClock.uptimeMillis());
                    bji2.y = null;
                }
            } else {
                view2 = bji2.c.getFocusedChild();
                while (view2 != null && !view2.isFocused()) {
                    if (view2 instanceof ViewGroup) {
                        view2 = ((ViewGroup)view2).getFocusedChild();
                        continue;
                    }
                    view2 = null;
                }
                bji2.y = view2;
            }
            if (!bji2.d && bl2 && view != null && !(view instanceof FocusParkingView)) {
                bji2.E = AmbientModeSupport$AmbientCallback.t(view);
                if (bji2.E == null) {
                    Log.w((String)"FocusAreaHelper", (String)"No ancestor focus area for ".concat(view.toString()));
                }
            } else {
                bji2.E = null;
            }
            if (bji2.x && bl2 && view != null) {
                view2 = bji2.c;
                if (AmbientModeSupport$AmbientCallback.t(view) == view2) {
                    bji2.F.i();
                }
            }
            if ((bji2.f || bji2.e) && bji2.d != bl2) {
                bji2.c.invalidate();
            }
            bji2.d = bl2;
            return;
        }
        Object object = this.a;
        view = view2;
        if (view2 instanceof FocusParkingView) {
            view = null;
        }
        ((FocusParkingView)((Object)object)).a(view);
    }
}

