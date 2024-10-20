/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 */
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public abstract class jg
implements View.OnTouchListener,
View.OnAttachStateChangeListener {
    private final float a;
    private final int b;
    public final View c;
    public boolean d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i = new int[2];

    public jg(View view) {
        int n2;
        this.c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.a = ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
        this.b = n2 = ViewConfiguration.getTapTimeout();
        this.e = (n2 + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract gi a();

    public boolean b() {
        throw null;
    }

    protected boolean c() {
        gi gi2 = this.a();
        if (gi2 != null && gi2.u()) {
            gi2.k();
        }
        return true;
    }

    public final void d() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        if ((runnable = this.f) != null) {
            this.c.removeCallbacks(runnable);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onTouch(View var1_1, MotionEvent var2_2) {
        block11: {
            block8: {
                block12: {
                    block13: {
                        block14: {
                            block9: {
                                block10: {
                                    var11_3 = this.d;
                                    if (!var11_3) break block9;
                                    var15_4 /* !! */  = this.c;
                                    var1_1 = this.a();
                                    if (var1_1 == null || !var1_1.u() || (var1_1 = var1_1.aQ()) == null || !(var16_5 = (jc)var1_1).isShown()) break block10;
                                    var14_6 = MotionEvent.obtainNoHistory((MotionEvent)var2_2);
                                    var17_7 = this.i;
                                    var15_4 /* !! */ .getLocationOnScreen(var17_7);
                                    var14_6.offsetLocation((float)var17_7[0], (float)var17_7[1]);
                                    var15_4 /* !! */  = (View)this.i;
                                    var1_1.getLocationOnScreen((int[])var15_4 /* !! */ );
                                    var8_8 = -var15_4 /* !! */ [0];
                                    var7_9 = -var15_4 /* !! */ [1];
                                    var14_6.offsetLocation((float)var8_8, (float)var7_9);
                                    var9_11 = var16_5.a(var14_6, this.h);
                                    var14_6.recycle();
                                    var7_9 = var2_2.getActionMasked();
                                    var7_9 = var7_9 != true && var7_9 != 3 ? (Object)true : (Object)false;
                                    if (var9_11 && var7_9 != false) ** GOTO lbl-1000
                                }
                                if (!this.c()) lbl-1000:
                                // 2 sources

                                {
                                    var9_11 = true;
                                } else {
                                    var9_11 = false;
                                }
                                break block11;
                            }
                            var1_1 = this.c;
                            if (!var1_1.isEnabled()) lbl-1000:
                            // 7 sources

                            {
                                while (true) {
                                    var10_12 = false;
                                    break block8;
                                    break;
                                }
                            }
                            var7_10 = var2_2.getActionMasked();
                            if (var7_10 == 0) break block12;
                            if (var7_10 == 1) break block13;
                            if (var7_10 == 2) break block14;
                            if (var7_10 == 3) break block13;
                            ** GOTO lbl-1000
                        }
                        var7_10 = var2_2.findPointerIndex(this.h);
                        if (var7_10 < 0) ** GOTO lbl-1000
                        var6_13 = var2_2.getX(var7_10);
                        var3_14 = var2_2.getY(var7_10);
                        var5_15 = this.a;
                        var4_16 = -var5_15;
                        if (var6_13 >= var4_16 && var3_14 >= var4_16 && var6_13 < (float)(var1_1.getRight() - var1_1.getLeft()) + var5_15 && var3_14 < (float)(var1_1.getBottom() - var1_1.getTop()) + var5_15) ** GOTO lbl-1000
                        this.d();
                        var1_1.getParent().requestDisallowInterceptTouchEvent(true);
                        if (!this.b()) ** GOTO lbl-1000
                        var10_12 = true;
                        break block8;
                    }
                    this.d();
                    ** GOTO lbl-1000
                }
                this.h = var2_2.getPointerId(0);
                if (this.f == null) {
                    this.f = new ak(this, 17, null);
                }
                var1_1.postDelayed(this.f, (long)this.b);
                if (this.g == null) {
                    this.g = new ak(this, 18, null);
                }
                var1_1.postDelayed(this.g, (long)this.e);
                ** while (true)
            }
            var9_11 = var10_12;
            if (var10_12) {
                var12_17 = SystemClock.uptimeMillis();
                var1_1 = MotionEvent.obtain((long)var12_17, (long)var12_17, (int)3, (float)0.0f, (float)0.0f, (int)0);
                this.c.onTouchEvent((MotionEvent)var1_1);
                var1_1.recycle();
                var9_11 = var10_12;
            }
        }
        this.d = var9_11;
        return var9_11 || var11_3;
        {
        }
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View object) {
        this.d = false;
        this.h = -1;
        object = this.f;
        if (object != null) {
            this.c.removeCallbacks((Runnable)object);
        }
    }
}

