/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.car.drivingstate.CarUxRestrictions
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.widget.Toast
 */
import android.car.drivingstate.CarUxRestrictions;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import java.lang.ref.WeakReference;

public final class bml {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public CarUxRestrictions g;
    public final CharSequence h;
    public final Drawable i;
    public final bmk j;
    public final bmi k;
    public final boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    private final WeakReference p;
    private WeakReference q = new WeakReference<Object>(null);
    private final int r;
    private final bny s;

    public bml(bmh bmh2) {
        WeakReference weakReference;
        bmg bmg2 = new bmg(this);
        this.s = bmg2;
        this.p = weakReference = bmh2.a;
        this.f = bmh2.f;
        this.a = bmh2.m;
        this.b = bmh2.p;
        this.h = bmh2.g;
        this.i = bmh2.h;
        this.j = bmh2.i;
        this.k = bmh2.j;
        this.l = true;
        this.m = bmh2.n;
        this.n = bmh2.o;
        this.o = bmh2.q;
        this.c = bmh2.r;
        this.d = bmh2.l;
        this.e = bmh2.k;
        this.r = bmh2.t;
        bnz.b((Context)weakReference.get()).c(bmg2);
    }

    public final void a() {
        if (this.l && this.n) {
            if (!this.d()) {
                bmk bmk2;
                if (this.b) {
                    this.o ^= true;
                    this.c();
                }
                if (this.a) {
                    this.m ^= true;
                    this.c();
                }
                if ((bmk2 = this.j) != null) {
                    bmk2.a(this);
                    return;
                }
            } else {
                Toast.makeText((Context)((Context)this.p.get()), (int)2132017226, (int)1).show();
            }
        }
    }

    public final void b(bmj bmj2) {
        this.q = new WeakReference<bmj>(bmj2);
    }

    public final void c() {
        bmj bmj2 = (bmj)this.q.get();
        if (bmj2 != null) {
            bmj2.onMenuItemChanged(this);
        }
    }

    public final boolean d() {
        CarUxRestrictions carUxRestrictions = this.g;
        if (carUxRestrictions != null) {
            int n2 = this.r;
            if ((carUxRestrictions.getActiveRestrictions() & n2) == 0) {
                return false;
            }
        }
        return true;
    }
}

