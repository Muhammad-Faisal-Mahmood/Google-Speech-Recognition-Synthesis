/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 */
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;

public final class bma
implements View.OnTouchListener {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final int b;
    public final View.OnClickListener c;
    public View d;
    public boolean e;
    private final int f;
    private final Runnable g = new akt(this, 20, null);

    public bma(Context context, View.OnClickListener onClickListener) {
        int n2;
        int n3;
        this.f = n3 = context.getResources().getInteger(2131492874);
        this.b = n2 = context.getResources().getInteger(2131492875);
        if (n3 >= 0 && n2 >= 0) {
            this.c = onClickListener;
            return;
        }
        throw new IllegalArgumentException("negative intervals are not allowed");
    }

    public final void a() {
        this.a.removeCallbacks(this.g);
        this.e = false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.d = view;
        int n2 = motionEvent.getAction();
        if (n2 != 0) {
            if (n2 != 1 && n2 != 3) {
                return false;
            }
            if (!this.e) {
                this.c.onClick(view);
            }
            this.a.removeCallbacks(this.g);
            this.d.setPressed(false);
            this.e = false;
            return true;
        }
        this.a.removeCallbacks(this.g);
        this.a.postDelayed(this.g, (long)this.f);
        this.d.setPressed(true);
        return true;
    }
}

