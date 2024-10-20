/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class blz
implements View.OnTouchListener {
    public final View a;
    private float b = -1.0f;
    private final View c;
    private final RecyclerView d;
    private final int e;

    public blz(RecyclerView recyclerView, View view, View view2) {
        this.d = recyclerView;
        this.a = view;
        this.c = bnv.i(view2, 2131427509);
        this.e = ViewConfiguration.get((Context)recyclerView.getContext()).getScaledTouchSlop();
    }

    private final void a(float f2) {
        int n2 = (int)this.a.getY();
        int n3 = this.c.getHeight() / 2;
        int n4 = (int)this.a.getY() + this.a.getHeight() - this.c.getHeight() / 2;
        n3 = n4 - (new int[]{n2 + n3, n4})[0];
        Object object = this.c;
        float f3 = object.getY();
        float f4 = (float)object.getHeight() / 2.0f;
        if (n3 == 0) {
            n2 = 0;
        } else {
            object = this.d;
            int n5 = ((RecyclerView)object).computeVerticalScrollRange();
            n2 = object.getHeight();
            int n6 = object.getPaddingTop();
            n4 = this.d.getPaddingBottom();
            n2 = (int)((f2 - (f3 + f4)) / (float)n3 * (float)(n5 - (n2 - n6 - n4)));
        }
        if (n2 != 0) {
            this.d.scrollBy(0, n2);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int n2 = motionEvent.getAction();
        if (n2 != 0) {
            if (n2 != 2) {
                float f2 = this.b;
                float f3 = motionEvent.getY();
                n2 = this.e;
                if (Math.abs(f2 - f3) < (float)n2) {
                    this.a(motionEvent.getY() + this.a.getY());
                }
                this.b = -1.0f;
            } else {
                view = this.c;
                float f4 = view.getY();
                float f5 = view.getHeight();
                if (motionEvent.getY() + this.a.getY() < f4 + f5 && motionEvent.getY() + this.a.getY() > this.c.getY()) {
                    view = this.c;
                    this.a(view.getY() + (float)view.getHeight() / 2.0f + (motionEvent.getY() - this.b));
                    this.b = motionEvent.getY();
                }
            }
        } else {
            this.b = motionEvent.getY();
        }
        return true;
    }
}

