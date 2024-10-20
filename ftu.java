/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.widget.OverScroller
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class ftu
extends ftx {
    private Runnable a;
    private boolean b;
    OverScroller c;
    private int d = -1;
    private int e;
    private int f = -1;
    private VelocityTracker g;

    public ftu() {
    }

    public ftu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int H(View view) {
        throw null;
    }

    public int I(View view) {
        throw null;
    }

    public int J() {
        throw null;
    }

    public int K(CoordinatorLayout coordinatorLayout, View view, int n2, int n3, int n4) {
        throw null;
    }

    public void M(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public boolean O(View view) {
        throw null;
    }

    public final int R(CoordinatorLayout coordinatorLayout, View view, int n2, int n3, int n4) {
        return this.K(coordinatorLayout, view, this.J() - n2, n3, n4);
    }

    public final void S(CoordinatorLayout coordinatorLayout, View view, int n2) {
        this.K(coordinatorLayout, view, n2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int n2;
        if (this.f < 0) {
            this.f = ViewConfiguration.get((Context)coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
            n2 = this.d;
            if (n2 == -1 || (n2 = motionEvent.findPointerIndex(n2)) == -1) return false;
            if (Math.abs((n2 = (int)motionEvent.getY(n2)) - this.e) > this.f) {
                this.e = n2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.d = -1;
            n2 = (int)motionEvent.getX();
            int n3 = (int)motionEvent.getY();
            boolean bl2 = this.O(view) && coordinatorLayout.k(view, n2, n3);
            this.b = bl2;
            if (bl2) {
                this.e = n3;
                this.d = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                if ((coordinatorLayout = this.c) != null && !coordinatorLayout.isFinished()) {
                    this.c.abortAnimation();
                    return true;
                }
            }
        }
        if ((coordinatorLayout = this.g) == null) return false;
        coordinatorLayout.addMovement(motionEvent);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean g(CoordinatorLayout object, View view, MotionEvent motionEvent) {
        int n2;
        block10: {
            int n3;
            block13: {
                block12: {
                    block11: {
                        block8: {
                            block6: {
                                block9: {
                                    block7: {
                                        n3 = motionEvent.getActionMasked();
                                        if (n3 == 1) break block6;
                                        if (n3 == 2) break block7;
                                        if (n3 == 3) break block8;
                                        if (n3 == 6) {
                                            n3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                                            this.d = motionEvent.getPointerId(n3);
                                            this.e = (int)(motionEvent.getY(n3) + 0.5f);
                                        }
                                        break block9;
                                    }
                                    n3 = motionEvent.findPointerIndex(this.d);
                                    if (n3 == -1) {
                                        return false;
                                    }
                                    n2 = (int)motionEvent.getY(n3);
                                    n3 = this.e;
                                    this.e = n2;
                                    this.R((CoordinatorLayout)object, view, n3 - n2, this.H(view), 0);
                                }
                                n2 = 0;
                                break block10;
                            }
                            VelocityTracker velocityTracker = this.g;
                            if (velocityTracker == null) break block8;
                            velocityTracker.addMovement(motionEvent);
                            this.g.computeCurrentVelocity(1000);
                            float f2 = this.g.getYVelocity(this.d);
                            n3 = -this.I(view);
                            Runnable runnable = this.a;
                            if (runnable != null) {
                                view.removeCallbacks(runnable);
                                this.a = null;
                            }
                            if (this.c == null) {
                                this.c = new OverScroller(view.getContext());
                            }
                            this.c.fling(0, this.T(), 0, Math.round(f2), 0, 0, n3, 0);
                            if (!this.c.computeScrollOffset()) break block11;
                            this.a = object = new ftt(this, (CoordinatorLayout)object, view);
                            view.postOnAnimation((Runnable)object);
                            break block12;
                        }
                        n3 = 0;
                        break block13;
                    }
                    this.M((CoordinatorLayout)object, view);
                }
                n3 = 1;
            }
            this.b = false;
            this.d = -1;
            object = this.g;
            n2 = n3;
            if (object != null) {
                object.recycle();
                this.g = null;
                n2 = n3;
            }
        }
        object = this.g;
        if (object != null) {
            object.addMovement(motionEvent);
        }
        if (this.b) return true;
        if (n2 == 0) return false;
        return true;
    }
}

