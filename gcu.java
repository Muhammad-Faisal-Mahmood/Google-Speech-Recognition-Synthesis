/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;

public final class gcu
implements gcc {
    public final jnu a;
    private final bmu b;

    public gcu(jnu jnu2, bmu bmu2) {
        this.a = jnu2;
        this.b = bmu2;
    }

    @Override
    public final hpn a(WorkerParameters workerParameters) {
        return ((gcc)this.a.b()).a(workerParameters);
    }

    @Override
    public final hpn b(WorkerParameters object) {
        gol gol2 = fxf.aq("NoAccountWorkerFactory startWork()");
        try {
            Object object2 = this.b;
            dcf dcf2 = new dcf(this, gol2, (WorkerParameters)object, 7);
            Object object3 = (Set)((imc)((bmu)object2).a).a;
            object = hav.i(object3.size());
            Iterator iterator = object3.iterator();
            while (iterator.hasNext()) {
                gce gce2 = (gce)iterator.next();
                object3 = new gmf(gce2, 1);
                ((hat)object).j(object3);
            }
            object2 = ((bmu)object2).b;
            object = ((hat)object).g();
            object = ((bzo)object2).I(dcf2, (hav)object);
            return object;
        }
        finally {
            gol2.close();
        }
    }
}

