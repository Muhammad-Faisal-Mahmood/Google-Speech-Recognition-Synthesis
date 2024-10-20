/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 */
import android.content.Context;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

final class ed
extends ContentFrameLayout {
    final eg a;

    public ed(eg eg2, Context context) {
        this.a = eg2;
        super(context);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
        {
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent object) {
        if (object.getAction() == 0) {
            int n2 = (int)object.getX();
            int n3 = (int)object.getY();
            if (n2 < -5 || n3 < -5 || n2 > this.getWidth() + 5 || n3 > this.getHeight() + 5) {
                object = this.a;
                ((eg)object).A(((eg)object).N(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent((MotionEvent)object);
    }

    public final void setBackgroundResource(int n2) {
        this.setBackgroundDrawable(kh.g(this.getContext(), n2));
    }
}

