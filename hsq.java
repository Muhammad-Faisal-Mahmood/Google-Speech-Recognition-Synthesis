/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.util.HashMap;

public final class hsq
implements iua {
    public final Object a;
    private final int b;

    public hsq(int n2) {
        this.b = n2;
        this.a = new HashMap();
    }

    public hsq(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final itz a(ixb object, itw itw2, itx itx2) {
        Object object2;
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return new jmx(this, itx2.a((ixb)object, itw2));
            }
            if (!((Boolean)this.a.a()).booleanValue()) {
                return itx2.a((ixb)object, itw2);
            }
            Object object3 = (djt)itw2.g(crx.a);
            if (object3 == null) {
                object3 = itx2.b();
                String string = ((ixb)object).b;
                StringBuilder stringBuilder = new StringBuilder("https://");
                stringBuilder.append((String)object3);
                stringBuilder.append("/");
                stringBuilder.append(string);
                object3 = new cse(new dql(null, stringBuilder.toString(), false, SystemClock.elapsedRealtime()));
                return new csc(itx2.a((ixb)object, itw2.i((fvc)object3)), (cse)object3);
            } else {
                object3 = new cse(dql.a(itx2.b(), (djt)object3));
            }
            return new csc(itx2.a((ixb)object, itw2.i((fvc)object3)), (cse)object3);
        }
        hqw hqw2 = (hqw)itw2.g(hqx.a);
        hre hre2 = hqw2.g;
        if (((hrf)itw2.g(hrf.a)).c() != 2) return itx2.a((ixb)object, itw2);
        Object object4 = object2 = (String)itw2.g(hri.a);
        if (object2 == null) {
            ((hrf)itw2.g(hrf.a)).b();
            object4 = idm.g.a;
        }
        hsp hsp2 = new hsp((String)object4, (hrl)itw2.g(hrl.a), ((ixb)object).b);
        Object object5 = this.a;
        synchronized (object5) {
            object4 = object2 = (gto)this.a.get(hsp2);
            if (object2 == null) {
                object4 = gto.h(hre2.a());
                this.a.put(hsp2, object4);
            }
        }
        if (!((gto)object4).g()) return itx2.a((ixb)object, itw2);
        object2 = new kpy();
        ((kpy)object2).a = (hrv)((gto)object4).c();
        ((kpy)object2).b = hqw2.c;
        fxf.K(((kpy)object2).a);
        fxf.K(((kpy)object2).b);
        return idi.D(new dan(new hru((kpy)object2), 15)).a((ixb)object, itw2, itx2);
    }
}

