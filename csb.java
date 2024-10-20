/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

final class csb
extends ixn {
    final cse a;

    public csb(fvc fvc2, cse cse2) {
        this.a = cse2;
        super(fvc2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(iyh iyh2, iwx iwx2) {
        Object object = this.a;
        Object object2 = ((cse)object).a;
        synchronized (object2) {
            if (((cse)object).c) {
            } else {
                ((cse)object).c = true;
                csd csd2 = ((cse)object).b;
                if (csd2 == null) {
                    ((cse)object).d.s = iyh2.n.r;
                    djv.a().d(((cse)object).d);
                } else {
                    object = csd2.a;
                    synchronized (object) {
                        dql dql2 = csd2.b;
                        int n2 = csd2.d;
                        int n3 = csd2.e;
                        dql2.c = SystemClock.elapsedRealtime() - dql2.a;
                        dql2.d = n2;
                        dql2.e = n3;
                        csd2.b.s = iyh2.n.r;
                        djv.a().d(csd2.b);
                        csd2.c = true;
                    }
                }
            }
        }
        super.a(iyh2, iwx2);
    }
}

