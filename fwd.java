/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;

final class fwd
implements fwt {
    final fwe a;
    private final int b;

    public fwd(fwe fwe2, int n2) {
        this.b = n2;
        this.a = fwe2;
    }

    @Override
    public final void a(Typeface object) {
        if (this.b != 0) {
            fwe fwe2 = this.a;
            giu giu2 = fwe2.I;
            if (giu2 != null) {
                giu2.b();
            }
            if (fwe2.q != object) {
                fwe2.q = object;
                fwe2.p = fvc.m(fwe2.a.getContext().getResources().getConfiguration(), object);
                giu2 = fwe2.p;
                object = giu2;
                if (giu2 == null) {
                    object = fwe2.q;
                }
                fwe2.o = object;
                fwe2.f();
            }
            return;
        }
        fwe fwe3 = this.a;
        giu giu3 = fwe3.H;
        if (giu3 != null) {
            giu3.b();
        }
        if (fwe3.t != object) {
            fwe3.t = object;
            fwe3.s = fvc.m(fwe3.a.getContext().getResources().getConfiguration(), object);
            giu3 = fwe3.s;
            object = giu3;
            if (giu3 == null) {
                object = fwe3.t;
            }
            fwe3.r = object;
            fwe3.f();
        }
    }
}

