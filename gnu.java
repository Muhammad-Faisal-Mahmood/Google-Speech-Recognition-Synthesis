/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.util.SparseArray
 *  gqv
 */
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public final class gnu
implements gpw {
    public final Object a;
    private final int b;

    public gnu(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public static void b(gqm object, int n2) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object62;
        int n3 = ((gqm)object).b;
        int n4 = 0;
        if ((n3 & 0x20) != 0) {
            object5 = object62 = ((gqm)object).i;
            if (object62 == null) {
                object5 = gmv.a;
            }
            if ((((gmv)object5).b & 2) != 0) {
                object4 = Locale.US;
                object3 = ((gok)((gqm)object).e.get((int)0)).c;
                object62 = object2 = ((gmv)object5).d;
                if (object2 == null) {
                    object62 = gmt.a;
                }
                Log.println((int)n2, (String)"trace_manager", (String)String.format((Locale)object4, "Trace %s timed out before completion. %s spans remaining", object3, ((gmt)object62).d));
            }
            if ((((gmv)object5).b & 1) != 0) {
                object3 = Locale.US;
                object2 = ((gok)((gqm)object).e.get((int)0)).c;
                object5 = object62 = ((gmv)object5).c;
                if (object62 == null) {
                    object5 = gmu.a;
                }
                Log.println((int)n2, (String)"trace_manager", (String)String.format((Locale)object3, "Trace %s tried to log too many spans. %s spans dropped", object2, ((gmu)object5).c));
            }
        }
        object5 = new ox();
        for (Object object62 : ((gqm)object).e) {
            ((ox)object5).f(((gok)object62).d, object62);
        }
        object2 = new ArrayList();
        for (n3 = 0; n3 < ((ox)object5).a(); ++n3) {
            object62 = (gok)((ox)object5).d(n3);
            long l2 = ((gok)object62).d;
            if ((((gok)object62).b & 0x20) != 0) {
                long l3 = ((gok)object62).h;
                object = new StringBuilder();
                ((StringBuilder)object).append(l3);
                ((StringBuilder)object).append(" ms");
                object = ((StringBuilder)object).toString();
            } else {
                object = "unfinished";
            }
            do {
                if ((object3 = (gok)((ox)object5).c(l2)) == null) {
                    object = "Orphaned Root > ".concat((String)object);
                    break;
                }
                l2 = ((gok)object3).e;
                object4 = ((gok)object3).c;
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object4);
                ((StringBuilder)object3).append(" > ");
                ((StringBuilder)object3).append((String)object);
                object = ((StringBuilder)object3).toString();
            } while (l2 != -1L);
            ((ArrayList)object2).add(String.format(Locale.US, "%06d\t%s", ((gok)object62).f, object));
        }
        Collections.sort(object2);
        int n5 = object2.size();
        for (n3 = n4; n3 < n5; ++n3) {
            Log.println((int)n2, (String)"trace_manager", (String)((String)object2.get(n3)));
        }
    }

    @Override
    public final void a(gqm object, SparseArray sparseArray) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                object = (gto)this.a.b();
                if (((gto)object).g()) {
                    object = (drw)((gto)object).c();
                }
                return;
            }
            for (n2 = 0; n2 < sparseArray.size(); ++n2) {
                Object object2 = (gop)sparseArray.valueAt(n2);
                boolean bl2 = fxf.aw(gqv.a);
                don don2 = null;
                if (bl2 && ((gom)(object2 = gop.h(don.c, (gop)object2, gqv.a))).b()) {
                    don2 = (don)((gom)object2).a();
                }
                if (don2 == null || (dom)don2.a.get() == null || don2.b.get()) continue;
                ((doo)this.a).a((gqm)object);
            }
            return;
        }
        if (Log.isLoggable((String)"trace_manager", (int)2)) {
            gnu.b((gqm)object, 2);
        }
    }
}

