/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Collection;

public final class dth
implements hny {
    public final ClearcutMetricSnapshotTransmitter a;
    public final Context b;
    public final kfl c;
    public final dte d;

    public /* synthetic */ dth(ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter, Context context, kfl kfl2, dte dte2) {
        this.a = clearcutMetricSnapshotTransmitter;
        this.b = context;
        this.c = kfl2;
        this.d = dte2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        Object object2;
        if (!((Boolean)object).booleanValue()) {
            return hpj.a;
        }
        dte dte2 = this.d;
        Object object3 = this.b;
        Object object4 = this.a;
        String string = dte2.c;
        if (dte2.e) {
            object = object2 = ((ClearcutMetricSnapshotTransmitter)object4).c;
            if (object2 == null) {
                synchronized (object4) {
                    object = object2 = ((ClearcutMetricSnapshotTransmitter)object4).c;
                    if (object2 == null) {
                        object = new cae((Context)object3, string);
                        ((cae)object).b(cat.b);
                        ((ClearcutMetricSnapshotTransmitter)object4).c = object = ((cae)object).a();
                    }
                }
            }
        } else {
            object = object2 = ((ClearcutMetricSnapshotTransmitter)object4).b;
            if (object2 == null) {
                synchronized (object4) {
                    object = object2 = ((ClearcutMetricSnapshotTransmitter)object4).b;
                    if (object2 == null) {
                        object = new cae((Context)object3, string);
                        ((ClearcutMetricSnapshotTransmitter)object4).b = object = ((cae)object).a();
                    }
                }
            }
        }
        object = ((caj)object).e(this.c);
        if (ipb.a.b().a((Context)object3)) {
            ((cai)object).p = cro.a(object3, (crc)ClearcutMetricSnapshotTransmitter.a.a());
        }
        if (dte2.e) return crh.a(((cai)object).a());
        object2 = dte2.f;
        if (!fxf.P((String)object2)) {
            if (((cag)object).a.c()) throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
            object4 = ((cag)object).n;
            if (!((hwp)object4).b.B()) {
                ((hwp)object4).u();
            }
            object4 = (ikp)((hwr)object4).b;
            object3 = ikp.a;
            object2.getClass();
            ((ikp)object4).b |= 0x1000000;
            ((ikp)object4).i = object2;
        }
        if ((dte2.b & 2) != 0) {
            ((cag)object).d(dte2.d);
        }
        if ((dte2.b & 0x10) != 0) {
            object2 = dte2.g;
            if (!((cag)object).a.i.a(cau.d)) throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
            ((cag)object).h = object2;
        }
        if ((object2 = dte2.h).isEmpty()) return crh.a(((cai)object).a());
        ((cag)object).c(hhk.ah((Collection)object2));
        return crh.a(((cai)object).a());
    }
}

