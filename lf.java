/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.animation.Interpolator
 *  android.widget.OverScroller
 */
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

public final class lf
implements Runnable {
    public OverScroller a;
    Interpolator b;
    final RecyclerView c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public lf(RecyclerView recyclerView) {
        this.c = recyclerView;
        this.b = RecyclerView.c;
        this.f = false;
        this.g = false;
        this.a = new OverScroller(recyclerView.getContext(), RecyclerView.c);
    }

    private final void e() {
        this.c.removeCallbacks(this);
        int[] nArray = wj.a;
        this.c.postOnAnimation(this);
    }

    public final void a(int n2, int n3) {
        this.c.ad(2);
        this.e = 0;
        this.d = 0;
        Interpolator interpolator = this.b;
        Interpolator interpolator2 = RecyclerView.c;
        if (interpolator != interpolator2) {
            this.b = interpolator2;
            this.a = new OverScroller(this.c.getContext(), RecyclerView.c);
        }
        this.a.fling(0, 0, n2, n3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.b();
    }

    final void b() {
        if (this.f) {
            this.g = true;
            return;
        }
        this.e();
    }

    public final void c(int n2, int n3, int n4, Interpolator interpolator) {
        int n5 = n4;
        if (n4 == Integer.MIN_VALUE) {
            int n6;
            int n7 = Math.abs(n2);
            n4 = n7 > (n6 = Math.abs(n3)) ? 1 : 0;
            n5 = n4 != 0 ? this.c.getWidth() : this.c.getHeight();
            if (1 != n4) {
                n7 = n6;
            }
            n5 = Math.min((int)(((float)n7 / (float)n5 + 1.0f) * 300.0f), 2000);
        }
        Interpolator interpolator2 = interpolator;
        if (interpolator == null) {
            interpolator2 = RecyclerView.c;
        }
        if (this.b != interpolator2) {
            this.b = interpolator2;
            this.a = new OverScroller(this.c.getContext(), interpolator2);
        }
        this.e = 0;
        this.d = 0;
        this.c.ad(2);
        this.a.startScroll(0, 0, n2, n3, n5);
        this.b();
    }

    public final void d() {
        this.c.removeCallbacks(this);
        this.a.abortAnimation();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void run() {
        block42: {
            var9_1 = this.c;
            if (var9_1.n == null) {
                this.d();
                return;
            }
            this.g = false;
            this.f = true;
            var9_1.z();
            var9_1 = this.a;
            if (!var9_1.computeScrollOffset()) break block42;
            var1_2 /* !! */  = var9_1.getCurrX();
            var3_3 = var9_1.getCurrY();
            var4_4 = this.d;
            var2_5 /* !! */  = this.e;
            this.d = var1_2 /* !! */ ;
            this.e = var3_3;
            var10_6 = this.c;
            var1_2 /* !! */  = RecyclerView.ar(var1_2 /* !! */  - var4_4, var10_6.B, var10_6.D, var10_6.getWidth());
            var10_6 = this.c;
            var2_5 /* !! */  = RecyclerView.ar(var3_3 - var2_5 /* !! */ , var10_6.C, var10_6.E, var10_6.getHeight());
            var11_7 = this.c;
            var10_6 = var11_7.T;
            var10_6[0] = false;
            var10_6[1] = false;
            var4_4 = var1_2 /* !! */ ;
            var3_3 = var2_5 /* !! */ ;
            if (var11_7.ak(var1_2 /* !! */ , var2_5 /* !! */ , (int[])var10_6, null, 1)) {
                var10_6 = this.c.T;
                var4_4 = var1_2 /* !! */  - var10_6[0];
                var3_3 = var2_5 /* !! */  - var10_6[1];
            }
            if (this.c.getOverScrollMode() != 2) {
                this.c.y(var4_4, var3_3);
            }
            var10_6 = this.c;
            if (var10_6.m != null) {
                var11_7 = var10_6.T;
                var11_7[0] = false;
                var11_7[1] = false;
                var10_6.Y(var4_4, var3_3, (int[])var11_7);
                var10_6 = this.c;
                var11_7 = var10_6.T;
                var5_8 /* !! */  = var11_7[0];
                var6_9 /* !! */  = var11_7[1];
                var7_10 = var4_4 - var5_8 /* !! */ ;
                var8_11 = var3_3 - var6_9 /* !! */ ;
                var11_7 = var10_6.n.u;
                var4_4 = var7_10;
                var3_3 = var8_11;
                var1_2 /* !! */  = (int)var6_9 /* !! */ ;
                var2_5 /* !! */  = (int)var5_8 /* !! */ ;
                if (var11_7 != null) {
                    var4_4 = var7_10;
                    var3_3 = var8_11;
                    var1_2 /* !! */  = (int)var6_9 /* !! */ ;
                    var2_5 /* !! */  = (int)var5_8 /* !! */ ;
                    if (!var11_7.d) {
                        var4_4 = var7_10;
                        var3_3 = var8_11;
                        var1_2 /* !! */  = (int)var6_9 /* !! */ ;
                        var2_5 /* !! */  = (int)var5_8 /* !! */ ;
                        if (var11_7.e) {
                            var1_2 /* !! */  = var10_6.O.a();
                            if (var1_2 /* !! */  == 0) {
                                var11_7.d();
                                var4_4 = var7_10;
                                var3_3 = var8_11;
                                var1_2 /* !! */  = (int)var6_9 /* !! */ ;
                                var2_5 /* !! */  = (int)var5_8 /* !! */ ;
                            } else if (var11_7.a >= var1_2 /* !! */ ) {
                                var11_7.a = var1_2 /* !! */  - 1;
                                var11_7.c((int)var5_8 /* !! */ , (int)var6_9 /* !! */ );
                                var4_4 = var7_10;
                                var3_3 = var8_11;
                                var1_2 /* !! */  = (int)var6_9 /* !! */ ;
                                var2_5 /* !! */  = (int)var5_8 /* !! */ ;
                            } else {
                                var11_7.c((int)var5_8 /* !! */ , (int)var6_9 /* !! */ );
                                var4_4 = var7_10;
                                var3_3 = var8_11;
                                var1_2 /* !! */  = (int)var6_9 /* !! */ ;
                                var2_5 /* !! */  = (int)var5_8 /* !! */ ;
                            }
                        }
                    }
                }
            } else {
                var1_2 /* !! */  = 0;
                var2_5 /* !! */  = 0;
            }
            if (!this.c.p.isEmpty()) {
                this.c.invalidate();
            }
            var11_7 = this.c;
            var10_6 = var11_7.T;
            var10_6[0] = false;
            var10_6[1] = false;
            var11_7.D(var2_5 /* !! */ , var1_2 /* !! */ , var4_4, var3_3, null, 1, (int[])var10_6);
            var11_7 = this.c;
            var10_6 = var11_7.T;
            var5_8 /* !! */  = var4_4 - var10_6[0];
            var4_4 = var3_3 - var10_6[1];
            var3_3 = var2_5 /* !! */ ;
            if (var2_5 /* !! */  != 0) ** GOTO lbl103
            if (var1_2 /* !! */  == 0) {
                var2_5 /* !! */  = 0;
                var3_3 = 0;
            } else {
                var3_3 = 0;
lbl103:
                // 2 sources

                var11_7.E(var3_3, var1_2 /* !! */ );
                var2_5 /* !! */  = var1_2 /* !! */ ;
            }
            if (!RecyclerView.aj(this.c)) {
                this.c.invalidate();
            }
            var8_11 = var9_1.getCurrX();
            var6_9 /* !! */  = var9_1.getFinalX();
            var1_2 /* !! */  = var9_1.getCurrY();
            var7_10 = var9_1.getFinalY();
            if (var9_1.isFinished()) ** GOTO lbl-1000
            if (var8_11 != var6_9 /* !! */  && var5_8 /* !! */  == false) {
                var5_8 /* !! */  = false;
                var1_2 /* !! */  = 0;
            } else if (var1_2 /* !! */  != var7_10 && var4_4 == 0) {
                var4_4 = 0;
                var1_2 /* !! */  = 0;
            } else lbl-1000:
            // 2 sources

            {
                var1_2 /* !! */  = 1;
            }
            var11_7 = this.c;
            var10_6 = var11_7.n.u;
            if (!(var10_6 != null && var10_6.d || var1_2 /* !! */  == 0)) {
                if (var11_7.getOverScrollMode() != 2) {
                    var2_5 /* !! */  = (int)var9_1.getCurrVelocity();
                    var1_2 /* !! */  = var5_8 /* !! */  < 0 ? -var2_5 /* !! */  : (var5_8 /* !! */  > 0 ? var2_5 /* !! */  : 0);
                    if (var4_4 < 0) {
                        var2_5 /* !! */  = -var2_5 /* !! */ ;
                    } else if (var4_4 <= 0) {
                        var2_5 /* !! */  = 0;
                    }
                    var10_6 = this.c;
                    if (var1_2 /* !! */  < 0) {
                        var10_6.G();
                        if (var10_6.B.isFinished()) {
                            var10_6.B.onAbsorb(-var1_2 /* !! */ );
                        }
                    } else if (var1_2 /* !! */  > 0) {
                        var10_6.H();
                        if (var10_6.D.isFinished()) {
                            var10_6.D.onAbsorb(var1_2 /* !! */ );
                        }
                    }
                    if (var2_5 /* !! */  < 0) {
                        var10_6.I();
                        if (var10_6.C.isFinished()) {
                            var10_6.C.onAbsorb(-var2_5 /* !! */ );
                        }
                    } else if (var2_5 /* !! */  > 0) {
                        var10_6.F();
                        if (var10_6.E.isFinished()) {
                            var10_6.E.onAbsorb(var2_5 /* !! */ );
                        }
                    }
                    if (var1_2 /* !! */  != 0 || var2_5 /* !! */  != 0) {
                        var10_6.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.b) {
                    this.c.N.b();
                }
            } else {
                this.b();
                var11_7 = this.c;
                var10_6 = var11_7.M;
                if (var10_6 != null) {
                    var10_6.a((RecyclerView)var11_7, var3_3, var2_5 /* !! */ );
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                ki.a((View)this.c, Math.abs(var9_1.getCurrVelocity()));
            }
        }
        if ((var9_1 = this.c.n.u) != null && var9_1.d) {
            var9_1.c(0, 0);
        }
        this.f = false;
        if (this.g) {
            this.e();
            return;
        }
        this.c.ad(0);
        this.c.ah(1);
    }
}

