/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Executor;

public final class enc {
    public static final hfn a = hfn.q();
    public final iku b;
    public final Executor c;
    public final gui d;
    private final gup e;

    public enc(iku iku2, Executor executor, Context context, gup gup2) {
        this.b = iku2;
        this.c = executor;
        this.e = gup2;
        this.d = fvd.ap(new dty(context, 10));
    }

    public final void a(hpn hpn2, ekk ekk2) {
        hhk.T(hpn2, gqk.g(new enb((Object)this, guh.b(this.e), ekk2.b, 0)), this.c);
    }

    public final void b(hpn object, ekk ekk2) {
        eaz eaz2 = ekk2.b;
        hhk.T((hpn)object, gqk.g(new ena(this, eaz2, 0)), this.c);
        object = gqk.g(new ena(this, eaz2, 2));
        hhk.T(ekk2.a, (hpb)object, this.c);
    }

    public final void c() {
        eng eng2 = (eng)this.b.b();
        String string = (String)this.d.a();
        ((fsx)eng2.d.a()).b(string);
    }

    public final void d(eip eip2, hpn hpn2, eaz eaz2) {
        hhk.T(hpn2, gqk.g(new gdy(this, guh.b(this.e), eip2, eaz2, 1)), this.c);
    }

    public final void e(eip eip2, String string) {
        if (eip2 != null && eio.a(eip2.b) != eio.J) {
            return;
        }
        ((fsx)((eng)this.b.b()).l.a()).b(string);
        ((hfk)((hfk)a.h()).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl", "maybeLogClientInfoUndefined", 488, "MonitoringLoggerImpl.java")).u("#audio# Please specify the correct client info for %s as it will lead to failure in the future.", string);
    }
}

