/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

public final class eng {
    public final ftb a;
    public final gui b = fvd.ap(new dty(this, 11));
    public final gui c;
    public final gui d;
    public final gui e;
    public final gui f;
    public final gui g;
    public final gui h;
    public final gui i;
    public final gui j;
    public final gui k;
    public final gui l;
    public final gui m;
    public final gui n;
    public final gui o;
    public final gui p;
    public final gui q;
    private final fta r;
    private final gui s;
    private final gui t;
    private final gui u;
    private final gui v;
    private final gui w;
    private final gui x;

    public eng(ScheduledExecutorService scheduledExecutorService, ftc ftc2, Application application) {
        ftb ftb2;
        fvd.ap(new dty(this, 13));
        this.c = fvd.ap(new dty(this, 18));
        this.d = fvd.ap(new dty(this, 19));
        this.s = fvd.ap(new dty(this, 20));
        this.t = fvd.ap(new enf(this, 1));
        this.e = fvd.ap(new enf(this, 2));
        this.u = fvd.ap(new enf(this, 3));
        this.v = fvd.ap(new enf(this, 4));
        this.f = fvd.ap(new enf(this, 5));
        this.g = fvd.ap(new enf(this, 0));
        this.h = fvd.ap(new enf(this, 6));
        this.i = fvd.ap(new enf(this, 7));
        this.j = fvd.ap(new enf(this, 8));
        this.k = fvd.ap(new enf(this, 9));
        this.l = fvd.ap(new enf(this, 10));
        this.m = fvd.ap(new enf(this, 11));
        this.w = fvd.ap(new enf(this, 12));
        this.x = fvd.ap(new enf(this, 13));
        this.n = fvd.ap(new dty(this, 12));
        this.o = fvd.ap(new dty(this, 14));
        fvd.ap(new dty(this, 15));
        this.p = fvd.ap(new dty(this, 16));
        this.q = fvd.ap(new dty(this, 17));
        this.a = ftb2 = ftb.e("audio_library_android");
        fta fta2 = ftb2.a;
        if (fta2 == null) {
            this.r = fte.b(ftc2, scheduledExecutorService, ftb2, application);
            return;
        }
        this.r = fta2;
        ((fte)fta2).b = ftc2;
    }

    public final void a(String string, String string2) {
        ((fsx)this.s.a()).b(string, string2);
    }

    public final void b(String string, String string2, String string3) {
        ((fsx)this.t.a()).b(string, string2, string3);
    }

    public final void c(String string, String string2, String string3, String string4) {
        ((fsx)this.u.a()).b(string, string2, string3, string4);
    }

    public final void d(String string, String string2, String string3, boolean bl2) {
        ((fsx)this.v.a()).b(string, string2, string3, bl2);
    }

    public final void e(String string, String string2, String string3, String string4) {
        ((fsx)this.w.a()).b(string, string2, string3, string4);
    }

    public final void f(String string, String string2, boolean bl2, String string3) {
        ((fsx)this.x.a()).b(string, string2, bl2, string3);
    }
}

