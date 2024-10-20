/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.health.HealthStats
 */
import android.os.health.HealthStats;
import java.util.Collections;
import java.util.Map;

final class dme
extends dmg {
    public static final dme a = new dme();

    private dme() {
    }

    @Override
    public final /* synthetic */ hyf a(String object, Object object2) {
        object2 = ag$$ExternalSyntheticApiModelOutline1.m(object2);
        hwp hwp2 = kdh.a.l();
        hwp2.Y(dmh.a.d(dly.m((HealthStats)object2, 40001)));
        dmd dmd2 = dmd.a;
        object2 = object2 != null && ag$$ExternalSyntheticApiModelOutline1.m$4(object2, 40002) ? ag$$ExternalSyntheticApiModelOutline1.m$2(object2, 40002) : Collections.emptyMap();
        hwp2.Z(dmd2.d((Map)object2));
        if (object != null) {
            object2 = dly.n((String)object);
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            object = (kdh)hwp2.b;
            object2.getClass();
            ((kdh)object).e = object2;
            ((kdh)object).b |= 1;
        }
        object = object2 = (kdh)hwp2.o();
        if (dly.s((kdh)object2)) {
            object = null;
        }
        return object;
    }

    @Override
    public final /* synthetic */ hyf b(hyf hyf2, hyf hyf3) {
        kdh kdh2 = (kdh)hyf2;
        hyf3 = (kdh)hyf3;
        hyf2 = kdh2;
        if (kdh2 != null) {
            hyf2 = kdh2;
            if (hyf3 != null) {
                hwp hwp2 = kdh.a.l();
                hwp2.Y(dmh.a.e(kdh2.c, ((kdh)hyf3).c));
                hwp2.Z(dmd.a.e(kdh2.d, ((kdh)hyf3).d));
                hyf2 = hyf3 = kdh2.e;
                if (hyf3 == null) {
                    hyf2 = kdg.a;
                }
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                hyf3 = (kdh)hwp2.b;
                hyf2.getClass();
                ((kdh)hyf3).e = hyf2;
                ((kdh)hyf3).b |= 1;
                hyf2 = hyf3 = (kdh)hwp2.o();
                if (dly.s((kdh)hyf3)) {
                    hyf2 = null;
                }
            }
        }
        return hyf2;
    }
}

