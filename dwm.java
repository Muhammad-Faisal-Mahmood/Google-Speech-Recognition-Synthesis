/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  hom
 */
import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class dwm {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public dwm(Context context, gto gto2, dtf dtf2, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.c = context;
        this.d = fvd.ap(new aim(context, 19));
        this.a = (Boolean)gto2.e(false);
        this.b = dtf2;
        this.e = clearcutMetricSnapshotTransmitter;
    }

    public dwm(dhc object) {
        this.c = new cxv((Executor)hom.a);
        this.d = new AtomicBoolean(false);
        djj djj2 = ((dhc)object).c;
        fxf.K(djj2);
        this.e = djj2;
        this.a = ((dhc)object).d;
        dhe dhe2 = new dhe(this);
        this.b = dhe2;
        object = djj2;
        djj2.h(dhe2);
    }

    public dwm(dua object, String string, String string2, boolean bl2) {
        this.b = object;
        this.d = string;
        this.e = string2;
        this.a = bl2;
        fps fps2 = new fps(((dua)object).c);
        fps2.d("phenotype");
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("/");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(".pb");
        fps2.e(((StringBuilder)object).toString());
        if (bl2) {
            int n2 = crt.a;
            fps2.c();
        }
        this.c = fps2.a();
    }

    public final hpn a(String string) {
        return hno.f(((dua)this.b).b().c((String)this.d, string), new dwj(), ((dua)this.b).d());
    }

    public final hpn b(dwn dwn2) {
        return hhk.O(new czm(this, dwn2, 5), ((dua)this.b).d());
    }

    public final boolean c() {
        Object object = ((dua)this.b).e;
        if (this.a) {
            object = ((dwq)object).b();
            return ((dvi)object).e && new hxd(((dvi)object).i, dvi.a).contains(hqn.d);
        }
        object = ((dwq)object).a();
        return ((dvh)object).e && new hxd(((dvh)object).j, dvh.a).contains(hqn.d);
    }
}

