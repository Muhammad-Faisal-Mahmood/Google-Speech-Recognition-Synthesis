/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.StateListDrawable
 *  android.view.MotionEvent
 */
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

public final class jf
extends kl
implements ks {
    private static final int[] r = new int[]{16842919};
    private static final int[] s = new int[0];
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];
    private final Runnable D;
    private final kt E;
    public final int a;
    public final StateListDrawable b;
    public final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public int j = 0;
    public int k = 0;
    public RecyclerView l;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    public final ValueAnimator p;
    public int q;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;

    public jf(RecyclerView recyclerView, StateListDrawable object, Drawable drawable, StateListDrawable stateListDrawable, Drawable drawable2, int n2, int n3, int n4) {
        ValueAnimator valueAnimator;
        this.p = valueAnimator = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        this.q = 0;
        this.D = new ak(this, 16, null);
        jd jd2 = new jd(this);
        this.E = jd2;
        this.b = object;
        this.c = drawable;
        this.w = stateListDrawable;
        this.x = drawable2;
        this.u = Math.max(n2, object.getIntrinsicWidth());
        this.v = Math.max(n2, drawable.getIntrinsicWidth());
        this.y = Math.max(n2, stateListDrawable.getIntrinsicWidth());
        this.z = Math.max(n2, drawable2.getIntrinsicWidth());
        this.a = n3;
        this.t = n4;
        object.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimator.addListener((Animator.AnimatorListener)new je(this));
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new wo(this, 1));
        object = this.l;
        if (object != recyclerView) {
            if (object != null) {
                ((RecyclerView)object).W(this);
                object = this.l;
                ((RecyclerView)object).q.remove(this);
                if (((RecyclerView)object).r == this) {
                    ((RecyclerView)object).r = null;
                }
                this.l.X(jd2);
                this.aB();
            }
            this.l = recyclerView;
            if (recyclerView != null) {
                recyclerView.t(this);
                this.l.q.add(this);
                this.l.u(jd2);
            }
        }
    }

    private final void aB() {
        this.l.removeCallbacks(this.D);
    }

    private final void aC(int n2) {
        this.aB();
        this.l.postDelayed(this.D, n2);
    }

    private final boolean aD() {
        return this.l.getLayoutDirection() == 1;
    }

    private static final int aE(float f2, float f3, int[] nArray, int n2, int n3, int n4) {
        int n5 = nArray[1] - nArray[0];
        if (n5 == 0) {
            return 0;
        }
        if ((n3 += (n4 = (int)((f3 - f2) / (float)n5 * (float)(n2 -= n4)))) < n2 && n3 >= 0) {
            return n4;
        }
        return 0;
    }

    public final void c() {
        this.l.invalidate();
    }

    final void d(int n2) {
        if (n2 == 2 && this.o != 2) {
            this.b.setState(r);
            this.aB();
        }
        if (n2 == 0) {
            this.c();
        } else {
            this.e();
        }
        if (this.o == 2 && n2 != 2) {
            this.b.setState(s);
            this.aC(1200);
        } else if (n2 == 1) {
            this.aC(1500);
        }
        this.o = n2;
    }

    public final void e() {
        int n2 = this.q;
        if (n2 != 0) {
            if (n2 != 3) {
                return;
            }
            this.p.cancel();
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(new float[]{((Float)valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.p.setDuration(500L);
        this.p.setStartDelay(0L);
        this.p.start();
    }

    final boolean f(float f2, float f3) {
        int n2;
        int n3;
        return f3 >= (float)(this.k - this.y) && f2 >= (float)((n3 = this.h) - (n2 = this.g / 2)) && f2 <= (float)(n3 + n2);
    }

    final boolean g(float f2, float f3) {
        int n2;
        int n3;
        return (this.aD() ? f2 <= (float)this.u : f2 >= (float)(this.j - this.u)) && f3 >= (float)((n3 = this.e) - (n2 = this.d / 2)) && f3 <= (float)(n3 + n2);
    }

    @Override
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        if (this.j == this.l.getWidth() && this.k == this.l.getHeight()) {
            if (this.q != 0) {
                int n2;
                int n3;
                int n4;
                int n5;
                if (this.m) {
                    n5 = this.j;
                    n4 = this.u;
                    n5 -= n4;
                    n3 = this.e;
                    n2 = this.d;
                    this.b.setBounds(0, 0, n4, n2);
                    this.c.setBounds(0, 0, this.v, this.k);
                    boolean bl2 = this.aD();
                    float f2 = n3 -= n2 / 2;
                    float f3 = -n3;
                    if (bl2) {
                        this.c.draw(canvas);
                        canvas.translate((float)this.u, f2);
                        canvas.scale(-1.0f, 1.0f);
                        this.b.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate((float)(-this.u), f3);
                    } else {
                        canvas.translate((float)n5, 0.0f);
                        this.c.draw(canvas);
                        canvas.translate(0.0f, f2);
                        this.b.draw(canvas);
                        canvas.translate((float)(-n5), f3);
                    }
                }
                if (this.n) {
                    n5 = this.k;
                    n4 = this.y;
                    n2 = n5 - n4;
                    n3 = this.h;
                    n5 = this.g;
                    this.w.setBounds(0, 0, n5, n4);
                    this.x.setBounds(0, 0, this.j, this.z);
                    canvas.translate(0.0f, (float)n2);
                    this.x.draw(canvas);
                    canvas.translate((float)(n3 -= n5 / 2), 0.0f);
                    this.w.draw(canvas);
                    canvas.translate((float)(-n3), (float)(-n2));
                }
            }
            return;
        }
        this.j = this.l.getWidth();
        this.k = this.l.getHeight();
        this.d(0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final boolean i(MotionEvent var1_1) {
        block9: {
            block7: {
                block6: {
                    block8: {
                        var2_2 = this.o;
                        var4_3 = false;
                        if (var2_2 != 1) break block6;
                        var6_4 = this.g(var1_1.getX(), var1_1.getY());
                        var5_5 = this.f(var1_1.getX(), var1_1.getY());
                        var3_6 = var4_3;
                        if (var1_1.getAction() != 0) break block7;
                        if (var6_4) break block8;
                        var3_6 = var4_3;
                        if (!var5_5) break block7;
                        ** GOTO lbl-1000
                    }
                    if (!var5_5) {
                        this.A = 2;
                        this.f = (int)var1_1.getY();
                    } else lbl-1000:
                    // 2 sources

                    {
                        this.A = 1;
                        this.i = (int)var1_1.getX();
                    }
                    this.d(2);
                    var3_6 = true;
                    break block7;
                }
                if (var2_2 == 2) break block9;
                var3_6 = var4_3;
            }
            return var3_6;
        }
        return true;
    }

    @Override
    public final void j() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void k(MotionEvent var1_1) {
        block10: {
            block11: {
                block12: {
                    if (this.o == 0) break block10;
                    if (var1_1 /* !! */ .getAction() != 0) break block11;
                    var5_2 = this.g(var1_1 /* !! */ .getX(), var1_1 /* !! */ .getY());
                    var6_3 = this.f(var1_1 /* !! */ .getX(), var1_1 /* !! */ .getY());
                    if (var5_2) break block12;
                    if (!var6_3) break block10;
                    ** GOTO lbl-1000
                }
                if (!var6_3) {
                    this.A = 2;
                    this.f = (int)var1_1 /* !! */ .getY();
                } else lbl-1000:
                // 2 sources

                {
                    this.A = 1;
                    this.i = (int)var1_1 /* !! */ .getX();
                }
                this.d(2);
                return;
            }
            if (var1_1 /* !! */ .getAction() == 1 && this.o == 2) {
                this.f = 0.0f;
                this.i = 0.0f;
                this.d(1);
                this.A = 0;
                return;
            }
            if (var1_1 /* !! */ .getAction() == 2 && this.o == 2) {
                this.e();
                if (this.A == 1) {
                    var2_4 = var1_1 /* !! */ .getX();
                    var7_5 = this.C;
                    var7_5[0] = var4_6 = this.t;
                    var7_5[1] = var3_7 = this.j - var4_6;
                    if (!(Math.abs((float)this.h - (var2_4 = Math.max((float)var4_6, Math.min((float)var3_7, var2_4)))) < 2.0f)) {
                        var3_7 = jf.aE(this.i, var2_4, var7_5, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                        if (var3_7 != 0) {
                            this.l.scrollBy(var3_7, 0);
                        }
                        this.i = var2_4;
                    }
                }
                if (this.A == 2) {
                    var2_4 = var1_1 /* !! */ .getY();
                    var1_1 /* !! */  = (MotionEvent)this.B;
                    var3_7 = this.t;
                    var1_1 /* !! */ [0] = (MotionEvent)var3_7;
                    var4_6 = this.k - var3_7;
                    var1_1 /* !! */ [1] = (MotionEvent)var4_6;
                    if (!(Math.abs((float)this.e - (var2_4 = Math.max((float)var3_7, Math.min((float)var4_6, var2_4)))) < 2.0f)) {
                        var3_7 = jf.aE(this.f, var2_4, (int[])var1_1 /* !! */ , this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                        if (var3_7 != 0) {
                            this.l.scrollBy(0, var3_7);
                        }
                        this.f = var2_4;
                    }
                }
            }
        }
    }
}

