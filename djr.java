/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.SystemClock
 */
import android.content.Context;
import android.os.SystemClock;
import java.util.Random;

public final class djr
implements imb {
    private final jnu a;
    private final int b;

    public djr(jnu jnu2, int n2) {
        this.b = n2;
        this.a = jnu2;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.b) {
            default: {
                Context context = ((ilt)this.a).a();
                return iog.a.b().d(context);
            }
            case 19: {
                Context context = ((ilt)this.a).a();
                return iop.a.b().d(context);
            }
            case 18: {
                Object object = ((ilt)this.a).a();
                object = iop.a.b().c((Context)object);
                idi.m(object);
                return object;
            }
            case 17: {
                Object object = ((ilt)this.a).a();
                object = iop.a.b().a((Context)object);
                idi.m(object);
                return object;
            }
            case 16: {
                Object object = ((ilt)this.a).a();
                object = iom.a.b().a((Context)object);
                idi.m(object);
                return object;
            }
            case 15: {
                Context context = ((ilt)this.a).a();
                return iph.a.b().a(context);
            }
            case 14: {
                Context context = ((ilt)this.a).a();
                return iov.a.b().c(context);
            }
            case 13: {
                Object object = ((ilt)this.a).a();
                object = ioj.a.b().a((Context)object);
                idi.m(object);
                return object;
            }
            case 12: {
                Object object = ((ilt)this.a).a();
                object = iog.a.b().b((Context)object);
                idi.m(object);
                return object;
            }
            case 11: {
                Context context = ((ilt)this.a).a();
                return iog.a.b().c(context);
            }
            case 10: {
                cgw cgw2 = (cgw)this.a.b();
                return new djz();
            }
            case 9: {
                return (cgw)((bqw)this.a).a().e(new cgw());
            }
            case 8: {
                djv djv2 = (djv)this.a.b();
                djv.c(djv2);
                idi.m(djv2);
                return djv2;
            }
            case 7: {
                cgw cgw3 = (cgw)this.a.b();
                return new Random(SystemClock.elapsedRealtime());
            }
            case 6: {
                return new dmr(((ilt)this.a).a());
            }
            case 5: {
                dry dry2 = (dry)dly.y((gto)((imc)this.a).a, new djo(8));
                idi.m(dry2);
                return dry2;
            }
            case 4: {
                drm drm2 = (drm)dly.y(((bqw)this.a).a(), new djo(6));
                idi.m(drm2);
                return drm2;
            }
            case 3: {
                drw drw2 = (drw)dly.y((gto)((imc)this.a).a, new djo(10));
                idi.m(drw2);
                return drw2;
            }
            case 2: {
                return (dkd)((bqw)this.a).a().e(dkd.a().b());
            }
            case 1: {
                dpe dpe2 = (dpe)dly.y((gto)((imc)this.a).a, new djo(3));
                idi.m(dpe2);
                return dpe2;
            }
            case 0: 
        }
        drf drf2 = (drf)dly.y(((bqw)this.a).a(), new djo(4));
        idi.m(drf2);
        return drf2;
    }
}

