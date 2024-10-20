/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PointF
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.View
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 */
import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class lc {
    public int a = -1;
    public RecyclerView b;
    public ko c;
    public boolean d;
    public boolean e;
    public View f;
    public boolean g;
    protected final LinearInterpolator h;
    protected final DecelerateInterpolator i;
    protected PointF j;
    protected int k;
    protected int l;
    private final la m = new la();
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public lc() {
    }

    public lc(Context context) {
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.o = false;
        this.k = 0;
        this.l = 0;
        this.n = context.getResources().getDisplayMetrics();
    }

    public static int i(int n2, int n3, int n4, int n5, int n6) {
        if (n6 != -1) {
            if (n6 != 0) {
                return n5 - n3;
            }
            if ((n2 = n4 - n2) > 0) {
                return n2;
            }
            n2 = n5 - n3;
            if (n2 < 0) {
                return n2;
            }
            return 0;
        }
        return n4 - n2;
    }

    private static int k(int n2, int n3) {
        if (n2 * (n3 = n2 - n3) <= 0) {
            return 0;
        }
        return n3;
    }

    public final int a(View view) {
        return this.b.d(view);
    }

    public final PointF b(int n2) {
        ko ko2 = this.c;
        if (ko2 instanceof lb) {
            return ((lb)((Object)ko2)).M(n2);
        }
        Log.w((String)"RecyclerView", (String)"You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(lb.class.getCanonicalName())));
        return null;
    }

    final void c(int n2, int n3) {
        ld ld2;
        Object object;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            this.d();
        }
        if (this.d && this.f == null && this.c != null && (object = this.b(this.a)) != null && (((PointF)object).x != 0.0f || ((PointF)object).y != 0.0f)) {
            recyclerView.Y((int)Math.signum(((PointF)object).x), (int)Math.signum(((PointF)object).y), null);
        }
        this.d = false;
        object = this.f;
        if (object != null) {
            if (this.a((View)object) == this.a) {
                object = this.f;
                ld2 = recyclerView.O;
                this.j((View)object, this.m);
                this.m.a(recyclerView);
                this.d();
            } else {
                Log.e((String)"RecyclerView", (String)"Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            object = recyclerView.O;
            object = this.m;
            if (this.b.n.ao() == 0) {
                this.d();
            } else {
                this.k = n2 = lc.k(this.k, n2);
                this.l = n3 = lc.k(this.l, n3);
                if (n2 == 0 && n3 == 0) {
                    ld2 = this.b(this.a);
                    if (ld2 != null && (((PointF)ld2).x != 0.0f || ((PointF)ld2).y != 0.0f)) {
                        float f2 = (float)Math.sqrt(((PointF)ld2).x * ((PointF)ld2).x + ((PointF)ld2).y * ((PointF)ld2).y);
                        ((PointF)ld2).x /= f2;
                        ((PointF)ld2).y /= f2;
                        this.j = ld2;
                        this.k = (int)(((PointF)ld2).x * 10000.0f);
                        this.l = (int)(((PointF)ld2).y * 10000.0f);
                        n2 = this.g(10000);
                        f2 = this.k;
                        float f3 = this.l;
                        float f4 = n2;
                        ld2 = this.h;
                        ((la)object).b((int)(f2 * 1.2f), (int)(f3 * 1.2f), (int)(f4 * 1.2f), (Interpolator)ld2);
                    } else {
                        ((la)object).a = this.a;
                        this.d();
                    }
                }
            }
            object = this.m;
            n2 = ((la)object).a;
            ((la)object).a(recyclerView);
            if (n2 >= 0 && this.e) {
                this.d = true;
                recyclerView.L.b();
            }
        }
    }

    public final void d() {
        if (!this.e) {
            return;
        }
        this.e = false;
        this.l = 0;
        this.k = 0;
        this.j = null;
        this.b.O.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        ko ko2 = this.c;
        if (ko2.u == this) {
            ko2.u = null;
        }
        this.c = null;
        this.b = null;
    }

    public final int e(View view, int n2) {
        ko ko2 = this.c;
        if (ko2 != null && ko2.Z()) {
            kp kp2 = (kp)view.getLayoutParams();
            return lc.i(ko.bj(view) - kp2.topMargin, ko.be(view) + kp2.bottomMargin, ko2.ax(), ko2.E - ko2.au(), n2);
        }
        return 0;
    }

    protected int f(int n2) {
        return (int)Math.ceil((double)this.g(n2) / 0.3356);
    }

    protected int g(int n2) {
        float f2 = Math.abs(n2);
        if (!this.o) {
            this.p = 25.0f / (float)this.n.densityDpi;
            this.o = true;
        }
        return (int)Math.ceil(f2 * this.p);
    }

    protected int h() {
        int n2;
        PointF pointF = this.j;
        int n3 = n2 = 0;
        if (pointF != null) {
            if (pointF.y == 0.0f) {
                n3 = n2;
            } else if (!(this.j.y > 0.0f)) {
                n3 = -1;
            } else {
                return 1;
            }
        }
        return n3;
    }

    protected void j(View view, la la2) {
        Object object = this.j;
        int n2 = 0;
        int n3 = object != null && object.x != 0.0f ? (this.j.x > 0.0f ? 1 : -1) : 0;
        ko ko2 = this.c;
        int n4 = n2;
        if (ko2 != null) {
            if (!ko2.Y()) {
                n4 = n2;
            } else {
                object = (kp)view.getLayoutParams();
                n4 = lc.i(ko.bf(view) - object.leftMargin, ko.bi(view) + object.rightMargin, ko2.av(), ko2.D - ko2.aw(), n3);
            }
        }
        if ((n2 = this.f((int)Math.sqrt(n4 * n4 + (n3 = this.e(view, this.h())) * n3))) > 0) {
            la2.b(-n4, -n3, n2, (Interpolator)this.i);
        }
    }
}

