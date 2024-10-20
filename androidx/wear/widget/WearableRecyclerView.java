/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Point
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package androidx.wear.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewTreeObserver;

public class WearableRecyclerView
extends RecyclerView {
    private final bai ac;
    private boolean ad;
    private final ViewTreeObserver.OnPreDrawListener ae;

    public WearableRecyclerView(Context context) {
        this(context, null);
    }

    public WearableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WearableRecyclerView(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public WearableRecyclerView(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2);
        bai bai2;
        this.ac = bai2 = new bai();
        this.ae = new baj();
        this.t = true;
        this.setClipToPadding(false);
        if (attributeSet != null) {
            float f2;
            TypedArray typedArray = context.obtainStyledAttributes(attributeSet, baa.d, n2, n3);
            wj.l((View)this, context, baa.d, attributeSet, typedArray, n2, n3);
            this.ad = typedArray.getBoolean(1, this.ad);
            bai2.a = f2 = 1.0f - typedArray.getFloat(0, 1.0f - bai2.a);
            bai2.b = f2 * f2;
            bai2.c = f2 = typedArray.getFloat(2, bai2.c);
            bai2.d = (float)Math.toRadians(f2);
            typedArray.recycle();
        }
    }

    @Override
    protected final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        Object object = new Point();
        this.getDisplay().getSize(object);
        int n2 = object.x;
        int n3 = object.y;
        object = this.ac;
        object.k = this;
        object.e = f2 = (float)Math.max(n2, n3) / 2.0f;
        object.f = f2 * f2;
        object.g = (float)n3 / object.d;
        object.l = VelocityTracker.obtain();
        this.getViewTreeObserver().addOnPreDrawListener(this.ae);
    }

    @Override
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ac.k = null;
        this.getViewTreeObserver().removeOnPreDrawListener(this.ae);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        block6: {
            block10: {
                block13: {
                    float f2;
                    Object object;
                    block7: {
                        int n2;
                        int n3;
                        block8: {
                            block12: {
                                float f3;
                                float f4;
                                block11: {
                                    block9: {
                                        if (!this.ad) break block6;
                                        object = this.ac;
                                        f4 = motionEvent.getRawX() - ((bai)object).e;
                                        f3 = motionEvent.getRawY() - ((bai)object).e;
                                        MotionEvent motionEvent2 = MotionEvent.obtain((MotionEvent)motionEvent);
                                        ((bai)object).l.addMovement(motionEvent2);
                                        motionEvent2.recycle();
                                        n3 = motionEvent.getActionMasked();
                                        f2 = f4 * f4 + f3 * f3;
                                        if (n3 == 0) break block7;
                                        if (n3 == 1) break block8;
                                        if (n3 == 2) break block9;
                                        if (n3 != 3 || !((bai)object).h) break block6;
                                        ((bai)object).h = false;
                                        ((bai)object).i = false;
                                        ((bai)object).k.invalidate();
                                        break block10;
                                    }
                                    if (!((bai)object).i) break block11;
                                    f3 = (float)Math.atan2(f3, f4);
                                    f4 = ((bai)object).j;
                                    f2 = ((bai)object).g;
                                    n3 = Math.round(bai.a(f3 - f4) * f2);
                                    if (n3 != 0) {
                                        ((bai)object).k.scrollBy(0, n3);
                                        f4 = ((bai)object).g;
                                        f4 = (float)n3 / f4;
                                        ((bai)object).j = f4 = ((bai)object).j + f4;
                                        ((bai)object).j = bai.a(f4);
                                    }
                                    break block10;
                                }
                                if (!((bai)object).h) break block12;
                                f3 = motionEvent.getRawX() - ((bai)object).e;
                                f2 = (float)Math.hypot(f3, f4 = motionEvent.getRawY() - ((bai)object).e);
                                if (f2 == 0.0f) break block6;
                                ((bai)object).i = true;
                                ((bai)object).k.invalidate();
                                ((bai)object).j = (float)Math.atan2(f4 /= f2, f3 /= f2);
                                break block10;
                            }
                            if (!(f2 / ((bai)object).f > ((bai)object).b)) break block6;
                            break block13;
                        }
                        ((bai)object).h = false;
                        ((bai)object).i = false;
                        ((bai)object).l.computeCurrentVelocity(1000, (float)((bai)object).k.I);
                        n3 = n2 = (int)((bai)object).l.getYVelocity();
                        if (motionEvent.getX() < ((bai)object).e * 1.5f) {
                            n3 = -n2;
                        }
                        ((bai)object).l.clear();
                        n2 = Math.abs(n3);
                        object = ((bai)object).k;
                        if (n2 <= ((RecyclerView)object).H || !((RecyclerView)object).al(0, (int)((float)n3 * 1.5f))) break block6;
                        break block10;
                    }
                    if (!(f2 / ((bai)object).f > ((bai)object).b)) break block6;
                }
                ((bai)object).h = true;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}

