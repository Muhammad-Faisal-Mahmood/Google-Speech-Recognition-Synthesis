/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.animation.Interpolator
 *  android.widget.OverScroller
 */
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public final class yt {
    private static final Interpolator e = new yr(0);
    public int a;
    public final int b;
    public int c = -1;
    public View d;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int m;
    private VelocityTracker n;
    private final float o;
    private final float p;
    private final int q;
    private final OverScroller r;
    private final ys s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable v = new kd(this, 13);

    private yt(Context context, ViewGroup viewGroup, ys ys2) {
        a.r(ys2, "Callback may not be null");
        this.u = viewGroup;
        this.s = ys2;
        viewGroup = ViewConfiguration.get((Context)context);
        this.q = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
        this.b = viewGroup.getScaledTouchSlop();
        this.o = viewGroup.getScaledMaximumFlingVelocity();
        this.p = viewGroup.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context, e);
    }

    public static yt b(ViewGroup viewGroup, ys ys2) {
        return new yt(viewGroup.getContext(), viewGroup, ys2);
    }

    private final int m(int n2, int n3, int n4) {
        if (n2 == 0) {
            return 0;
        }
        int n5 = this.u.getWidth();
        int n6 = n5 / 2;
        float f2 = (float)Math.sin((Math.min(1.0f, (float)Math.abs(n2) / (float)n5) - 0.5f) * 0.47123894f);
        if ((n3 = Math.abs(n3)) > 0) {
            float f3 = n6;
            n2 = Math.round(Math.abs((f3 + f2 * f3) / (float)n3) * 1000.0f) * 4;
        } else {
            n2 = (int)(((float)Math.abs(n2) / (float)n4 + 1.0f) * 256.0f);
        }
        return Math.min(n2, 600);
    }

    private final void n(int n2) {
        float[] fArray = this.f;
        if (fArray != null && this.h(n2)) {
            fArray[n2] = 0.0f;
            this.g[n2] = 0.0f;
            this.h[n2] = 0.0f;
            this.i[n2] = 0.0f;
            this.j[n2] = 0;
            this.k[n2] = 0;
            this.l[n2] = 0;
            this.m = ~(1 << n2) & this.m;
        }
    }

    private final void o(float f2, float f3) {
        this.t = true;
        this.s.d(this.d, f2, f3);
        this.t = false;
        if (this.a == 1) {
            this.f(0);
        }
    }

    private final void p() {
        float f2 = this.o;
        this.n.computeCurrentVelocity(1000, f2);
        this.o(yt.v(this.n.getXVelocity(this.c), this.p, this.o), yt.v(this.n.getYVelocity(this.c), this.p, this.o));
    }

    private final void q(float f2, float f3, int n2) {
        this.x(f2, f3, n2);
        this.x(f3, f2, n2);
        this.x(f2, f3, n2);
        this.x(f3, f2, n2);
    }

    private final void r(float f2, float f3, int n2) {
        Object object;
        Object[] objectArray;
        int n3;
        Object[] objectArray2 = this.f;
        int n4 = 0;
        if (objectArray2 == null || objectArray2.length <= n2) {
            n3 = n2 + 1;
            float[] fArray = new float[n3];
            float[] fArray2 = new float[n3];
            float[] fArray3 = new float[n3];
            objectArray = new float[n3];
            object = new int[n3];
            int[] nArray = new int[n3];
            int[] nArray2 = new int[n3];
            if (objectArray2 != null) {
                System.arraycopy(objectArray2, 0, fArray, 0, objectArray2.length);
                objectArray2 = this.g;
                System.arraycopy(objectArray2, 0, fArray2, 0, objectArray2.length);
                objectArray2 = this.h;
                System.arraycopy(objectArray2, 0, fArray3, 0, objectArray2.length);
                objectArray2 = this.i;
                System.arraycopy(objectArray2, 0, objectArray, 0, objectArray2.length);
                objectArray2 = this.j;
                System.arraycopy(objectArray2, 0, object, 0, objectArray2.length);
                objectArray2 = this.k;
                System.arraycopy(objectArray2, 0, nArray, 0, objectArray2.length);
                objectArray2 = this.l;
                System.arraycopy(objectArray2, 0, nArray2, 0, objectArray2.length);
            }
            this.f = fArray;
            this.g = fArray2;
            this.h = fArray3;
            this.i = objectArray;
            this.j = object;
            this.k = nArray;
            this.l = nArray2;
        }
        objectArray = this.f;
        this.h[n2] = f2;
        objectArray[n2] = f2;
        objectArray = this.g;
        this.i[n2] = f3;
        objectArray[n2] = f3;
        objectArray = this.j;
        int n5 = (int)f2;
        int n6 = (int)f3;
        object = this.u;
        n3 = this.q;
        if (n5 < object.getLeft() + n3) {
            n4 = 1;
        }
        object = this.u;
        int n7 = this.q;
        n3 = n4;
        if (n6 < object.getTop() + n7) {
            n3 = n4 | 4;
        }
        object = this.u;
        n7 = this.q;
        n4 = n3;
        if (n5 > object.getRight() - n7) {
            n4 = n3 | 2;
        }
        object = this.u;
        n5 = this.q;
        n3 = n4;
        if (n6 > object.getBottom() - n5) {
            n3 = n4 | 8;
        }
        objectArray[n2] = n3;
        this.m |= 1 << n2;
    }

    private final void s(MotionEvent motionEvent) {
        int n2 = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = motionEvent.getPointerId(i2);
            if (!this.u(n3)) continue;
            float f2 = motionEvent.getX(i2);
            float f3 = motionEvent.getY(i2);
            this.h[n3] = f2;
            this.i[n3] = f3;
        }
    }

    private final boolean t(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        int n2 = this.s.a(view) > 0 ? 1 : 0;
        boolean bl2 = this.s.h() > 0;
        if (n2 != 0 && bl2) {
            n2 = this.b;
            return f2 * f2 + f3 * f3 > (float)(n2 * n2);
        }
        if (n2 != 0) {
            return Math.abs(f2) > (float)this.b;
        }
        return bl2 && Math.abs(f3) > (float)this.b;
    }

    private final boolean u(int n2) {
        return this.h(n2);
    }

    private static final float v(float f2, float f3, float f4) {
        float f5 = Math.abs(f2);
        if (f5 < f3) {
            return 0.0f;
        }
        f3 = f2;
        if (f5 > f4) {
            if (f2 > 0.0f) {
                return f4;
            }
            f3 = -f4;
        }
        return f3;
    }

    private static final int w(int n2, int n3, int n4) {
        int n5 = Math.abs(n2);
        if (n5 < n3) {
            return 0;
        }
        n3 = n2;
        if (n5 > n4) {
            if (n2 > 0) {
                return n4;
            }
            n3 = -n4;
        }
        return n3;
    }

    private final void x(float f2, float f3, int n2) {
        Math.abs(f2);
        Math.abs(f3);
        n2 = this.j[n2];
    }

    public final View a(int n2, int n3) {
        int n4;
        int n5 = this.u.getChildCount();
        while ((n4 = n5 - 1) >= 0) {
            View view = this.u.getChildAt(n4);
            n5 = n4;
            if (n2 < view.getLeft()) continue;
            n5 = n4;
            if (n2 >= view.getRight()) continue;
            n5 = n4;
            if (n3 < view.getTop()) continue;
            if (n3 >= view.getBottom()) {
                n5 = n4;
                continue;
            }
            return view;
        }
        return null;
    }

    public final void c() {
        this.c = -1;
        Object object = this.f;
        if (object != null) {
            Arrays.fill(object, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            this.m = 0;
        }
        if ((object = (Object)this.n) != null) {
            object.recycle();
            this.n = null;
        }
    }

    public final void d(View object, int n2) {
        if (object.getParent() == this.u) {
            this.d = object;
            this.c = n2;
            this.s.b((View)object, n2);
            this.f(1);
            return;
        }
        object = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        ((StringBuilder)object).append(this.u);
        ((StringBuilder)object).append(")");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void e(MotionEvent motionEvent) {
        int n2 = motionEvent.getActionMasked();
        int n3 = motionEvent.getActionIndex();
        int n4 = 0;
        int n5 = 0;
        int n6 = n2;
        if (n2 == 0) {
            this.c();
            n6 = 0;
        }
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        this.n.addMovement(motionEvent);
        if (n6 != 0) {
            if (n6 != 1) {
                if (n6 != 2) {
                    if (n6 != 3) {
                        if (n6 != 5) {
                            block19: {
                                if (n6 != 6) return;
                                n4 = motionEvent.getPointerId(n3);
                                if (this.a == 1 && n4 == this.c) {
                                    n2 = motionEvent.getPointerCount();
                                    for (n6 = n5; n6 < n2; ++n6) {
                                        View view;
                                        float f2;
                                        float f3;
                                        View view2;
                                        n5 = motionEvent.getPointerId(n6);
                                        if (n5 == this.c || (view2 = this.a((int)(f3 = motionEvent.getX(n6)), (int)(f2 = motionEvent.getY(n6)))) != (view = this.d) || !this.k(view, n5)) continue;
                                        if (this.c == -1) {
                                            break;
                                        }
                                        break block19;
                                    }
                                    this.p();
                                }
                            }
                            this.n(n4);
                            return;
                        }
                        n5 = motionEvent.getPointerId(n3);
                        float f4 = motionEvent.getX(n3);
                        n6 = (int)f4;
                        float f5 = motionEvent.getY(n3);
                        n4 = (int)f5;
                        this.r(f4, f5, n5);
                        if (this.a == 0) {
                            this.k(this.a(n6, n4), n5);
                            n6 = this.j[n5];
                            return;
                        }
                        motionEvent = this.d;
                        if (motionEvent == null || n6 < motionEvent.getLeft() || n6 >= motionEvent.getRight() || n4 < motionEvent.getTop() || n4 >= motionEvent.getBottom()) return;
                        this.k(this.d, n5);
                        return;
                    }
                    if (this.a == 1) {
                        this.o(0.0f, 0.0f);
                    }
                    this.c();
                    return;
                }
                if (this.a == 1) {
                    Object object;
                    n6 = this.c;
                    if (!this.u(n6) || (n6 = motionEvent.findPointerIndex(n6)) == -1) return;
                    float f6 = motionEvent.getX(n6);
                    float f7 = motionEvent.getY(n6);
                    Object object2 = this.h;
                    n6 = this.c;
                    float f8 = object2[n6];
                    float f9 = this.i[n6];
                    n6 = this.d.getLeft();
                    n2 = (int)(f6 - f8);
                    n5 = n6 + n2;
                    n6 = this.d.getTop();
                    n3 = (int)(f7 - f9);
                    n4 = n6 + n3;
                    int n7 = this.d.getLeft();
                    int n8 = this.d.getTop();
                    n6 = n5;
                    if (n2 != 0) {
                        n6 = this.s.f(this.d, n5);
                        object2 = this.d;
                        object = wj.a;
                        object2.offsetLeftAndRight(n6 - n7);
                    }
                    n5 = n4;
                    if (n3 != 0) {
                        n5 = this.s.g(this.d, n4);
                        object = this.d;
                        object2 = wj.a;
                        object.offsetTopAndBottom(n5 - n8);
                    }
                    if (n2 != 0 || n3 != 0) {
                        this.s.i(this.d, n6, n5);
                    }
                } else {
                    n5 = motionEvent.getPointerCount();
                    for (n6 = n4; n6 < n5; ++n6) {
                        View view;
                        n4 = motionEvent.getPointerId(n6);
                        if (!this.u(n4)) continue;
                        float f10 = motionEvent.getX(n6);
                        float f11 = motionEvent.getY(n6);
                        float f12 = f10 - this.f[n4];
                        float f13 = f11 - this.g[n4];
                        this.q(f12, f13, n4);
                        if (this.a == 1 || this.t(view = this.a((int)f10, (int)f11), f12, f13) && this.k(view, n4)) break;
                    }
                }
                this.s(motionEvent);
                return;
            }
            if (this.a == 1) {
                this.p();
            }
            this.c();
            return;
        }
        float f14 = motionEvent.getX();
        float f15 = motionEvent.getY();
        n6 = motionEvent.getPointerId(0);
        motionEvent = this.a((int)f14, (int)f15);
        this.r(f14, f15, n6);
        this.k((View)motionEvent, n6);
        n6 = this.j[n6];
    }

    public final void f(int n2) {
        this.u.removeCallbacks(this.v);
        if (this.a != n2) {
            this.a = n2;
            this.s.c(n2);
            if (this.a == 0) {
                this.d = null;
            }
        }
    }

    public final boolean g(int n2, int n3, int n4, int n5) {
        float f2;
        int n6 = this.d.getLeft();
        int n7 = this.d.getTop();
        int n8 = n2 - n6;
        n3 -= n7;
        n2 = n8;
        if (n8 == 0) {
            n2 = 0;
            if (n3 == 0) {
                this.r.abortAnimation();
                this.f(0);
                return false;
            }
        }
        View view = this.d;
        float f3 = this.p;
        float f4 = this.o;
        n8 = yt.w(n4, (int)f3, (int)f4);
        f4 = this.p;
        f3 = this.o;
        n4 = yt.w(n5, (int)f4, (int)f3);
        int n9 = Math.abs(n2);
        int n10 = Math.abs(n3);
        int n11 = Math.abs(n8);
        int n12 = Math.abs(n4);
        n5 = n11 + n12;
        int n13 = n9 + n10;
        if (n8 != 0) {
            f4 = n5;
            f4 = (float)n11 / f4;
        } else {
            f4 = n13;
            f4 = (float)n9 / f4;
        }
        if (n4 != 0) {
            f2 = n5;
            f3 = n12;
        } else {
            f2 = n13;
            f3 = n10;
        }
        f3 /= f2;
        n5 = this.m(n2, n8, this.s.a(view));
        n4 = this.m(n3, n4, this.s.h());
        f2 = n5;
        float f5 = n4;
        this.r.startScroll(n6, n7, n2, n3, (int)(f2 * f4 + f5 * f3));
        this.f(2);
        return true;
    }

    public final boolean h(int n2) {
        return (1 << n2 & this.m) != 0;
    }

    public final boolean i(int n2, int n3) {
        if (this.t) {
            return this.g(n2, n3, (int)this.n.getXVelocity(this.c), (int)this.n.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean j(MotionEvent motionEvent) {
        block15: {
            int n2;
            block12: {
                block13: {
                    int n3;
                    int n4;
                    block14: {
                        n4 = motionEvent.getActionMasked();
                        n3 = motionEvent.getActionIndex();
                        n2 = n4;
                        if (n4 == 0) {
                            this.c();
                            n2 = 0;
                        }
                        if (this.n == null) {
                            this.n = VelocityTracker.obtain();
                        }
                        this.n.addMovement(motionEvent);
                        if (n2 == 0) break block12;
                        if (n2 == 1) break block13;
                        if (n2 == 2) break block14;
                        if (n2 == 3) break block13;
                        if (n2 != 5) {
                            if (n2 == 6) {
                                this.n(motionEvent.getPointerId(n3));
                            }
                        } else {
                            n2 = motionEvent.getPointerId(n3);
                            float f2 = motionEvent.getX(n3);
                            float f3 = motionEvent.getY(n3);
                            this.r(f2, f3, n2);
                            n4 = this.a;
                            if (n4 == 0) {
                                n2 = this.j[n2];
                            } else if (n4 == 2 && (motionEvent = this.a((int)f2, (int)f3)) == this.d) {
                                this.k((View)motionEvent, n2);
                            }
                        }
                        break block15;
                    }
                    if (this.f != null && this.g != null) {
                        n4 = motionEvent.getPointerCount();
                        for (n2 = 0; n2 < n4; ++n2) {
                            int n5 = motionEvent.getPointerId(n2);
                            if (!this.u(n5)) continue;
                            float f4 = motionEvent.getX(n2);
                            float f5 = motionEvent.getY(n2);
                            float f6 = f4 - this.f[n5];
                            float f7 = f5 - this.g[n5];
                            View view = this.a((int)f4, (int)f5);
                            boolean bl2 = this.t(view, f6, f7);
                            if (bl2) {
                                n3 = view.getLeft();
                                int n6 = (int)f6;
                                n6 = this.s.f(view, n6 + n3);
                                int n7 = view.getTop();
                                int n8 = (int)f7;
                                int n9 = this.s.g(view, n8 + n7);
                                n8 = this.s.a(view);
                                int n10 = this.s.h();
                                if ((n8 == 0 || n8 > 0 && n6 == n3) && (n10 == 0 || n10 > 0 && n9 == n7)) break;
                            }
                            this.q(f6, f7, n5);
                            if (this.a == 1 || bl2 && this.k(view, n5)) break;
                        }
                        this.s(motionEvent);
                    }
                    break block15;
                }
                this.c();
                break block15;
            }
            float f8 = motionEvent.getX();
            float f9 = motionEvent.getY();
            n2 = motionEvent.getPointerId(0);
            this.r(f8, f9, n2);
            motionEvent = this.a((int)f8, (int)f9);
            if (motionEvent == this.d && this.a == 2) {
                this.k((View)motionEvent, n2);
            }
            n2 = this.j[n2];
        }
        return this.a == 1;
    }

    final boolean k(View view, int n2) {
        if (view == this.d && this.c == n2) {
            return true;
        }
        if (view != null && this.s.e(view, n2)) {
            this.c = n2;
            this.d(view, n2);
            return true;
        }
        return false;
    }

    public final boolean l() {
        block6: {
            block7: {
                int[] nArray;
                if (this.a != 2) break block6;
                OverScroller overScroller = this.r;
                boolean bl2 = overScroller.computeScrollOffset();
                int n2 = overScroller.getCurrX();
                int n3 = overScroller.getCurrY();
                int n4 = n2 - this.d.getLeft();
                int n5 = n3 - this.d.getTop();
                if (n4 != 0) {
                    overScroller = this.d;
                    nArray = wj.a;
                    overScroller.offsetLeftAndRight(n4);
                }
                if (n5 != 0) {
                    overScroller = this.d;
                    nArray = wj.a;
                    overScroller.offsetTopAndBottom(n5);
                }
                if (n4 != 0 || n5 != 0) {
                    this.s.i(this.d, n2, n3);
                }
                if (!bl2) break block7;
                if (n2 != this.r.getFinalX() || n3 != this.r.getFinalY()) break block6;
                this.r.abortAnimation();
            }
            this.u.post(this.v);
        }
        return this.a == 2;
    }
}

