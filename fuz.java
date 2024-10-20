/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 */
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class fuz
implements View.OnTouchListener {
    private final Dialog a;
    private final int b;
    private final int c;
    private final int d;

    public fuz(Dialog dialog, Rect rect) {
        this.a = dialog;
        this.b = rect.left;
        this.c = rect.top;
        this.d = ViewConfiguration.get((Context)dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view.findViewById(0x1020002);
        int n2 = view2.getLeft();
        n2 = this.b + n2;
        int n3 = view2.getWidth();
        int n4 = view2.getTop();
        int n5 = this.c + n4;
        if (new RectF((float)n2, (float)n5, (float)(n3 + n2), (float)((n4 = view2.getHeight()) + n5)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        view2 = MotionEvent.obtain((MotionEvent)motionEvent);
        if (motionEvent.getAction() == 1) {
            view2.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            view2.setAction(0);
            float f2 = -this.d - 1;
            view2.setLocation(f2, f2);
        }
        view.performClick();
        return this.a.onTouchEvent((MotionEvent)view2);
    }
}

