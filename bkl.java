/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
import android.view.MotionEvent;
import android.view.View;
import com.android.car.ui.preference.CarUiTwoActionSwitchPreference;

public final class bkl
implements View.OnTouchListener {
    public final Object a;
    private final int b;

    public /* synthetic */ bkl(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public bkl(jw jw2, int n2) {
        this.b = n2;
        this.a = jw2;
    }

    public final boolean onTouch(View object, MotionEvent motionEvent) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                ((heg)((heg)fkz.a.c()).j("com/google/android/libraries/speech/transcription/voiceime/BackspaceViewPeer", "onTouch", 71, "BackspaceViewPeer.java")).u("#onTouch(%s)", motionEvent);
                n2 = motionEvent.getAction();
                object = this.a;
                if (n2 == 1) {
                    ((fkz)object).a(null);
                }
                ((fkz)object).d.onTouchEvent(motionEvent);
                return false;
            }
            n2 = motionEvent.getAction();
            int n3 = (int)motionEvent.getX();
            int n4 = (int)motionEvent.getY();
            if (n2 == 0) {
                object = ((jw)this.a).q;
                if (object != null && object.isShowing() && n3 >= 0 && n3 < ((jw)this.a).q.getWidth() && n4 >= 0 && n4 < ((jw)this.a).q.getHeight()) {
                    object = (jw)this.a;
                    object.o.postDelayed((Runnable)object.r, 250L);
                }
            } else if (n2 == 1) {
                object = (jw)this.a;
                object.o.removeCallbacks((Runnable)object.r);
            }
            return false;
        }
        return ((CarUiTwoActionSwitchPreference)this.a).lambda$onBindViewHolder$2$com-android-car-ui-preference-CarUiTwoActionSwitchPreference((View)object, motionEvent);
    }
}

