/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.view.ViewTreeObserver$OnTouchModeChangeListener
 */
import android.os.SystemClock;
import android.view.ViewTreeObserver;
import com.android.car.ui.FocusParkingView;

public final class bjk
implements ViewTreeObserver.OnTouchModeChangeListener {
    public final Object a;
    private final int b;

    public /* synthetic */ bjk(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final void onTouchModeChanged(boolean bl2) {
        if (this.b != 0) {
            if (!bl2) {
                Object object = this.a;
                long l2 = SystemClock.uptimeMillis();
                object = (bji)object;
                ((bji)object).D = l2 + ((bji)object).C;
            }
            return;
        }
        if (!bl2) {
            Object object = this.a;
            long l3 = SystemClock.uptimeMillis();
            object = (FocusParkingView)((Object)object);
            ((FocusParkingView)((Object)object)).d = l3 + ((FocusParkingView)((Object)object)).c;
        }
    }
}

