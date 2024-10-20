/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnGenericMotionListener
 *  android.view.ViewGroup
 */
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public final class bll
implements View.OnGenericMotionListener {
    public final ViewGroup a;

    public /* synthetic */ bll(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        int n2 = blp.d;
        if (motionEvent.getAction() == 8 && motionEvent.getSource() == 0x400000) {
            view = this.a;
            motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
            motionEvent.setSource(8194);
            view.onGenericMotionEvent(motionEvent);
            return true;
        }
        return false;
    }
}

