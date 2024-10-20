/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  gqv
 *  hom
 */
import android.database.sqlite.SQLiteDatabase;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class frw
implements hoc {
    public final Object a;
    private final int b;

    public /* synthetic */ frw(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final hog a(bzq object, Object object2) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        object = (Void)object2;
                        return new hog((hpn)this.a);
                    }
                    object2 = (SQLiteDatabase)object2;
                    boolean bl2 = object2.isWriteAheadLoggingEnabled();
                    fsi fsi2 = (fsi)this.a;
                    object = fsi2.i;
                    object = bl2 ? new fsc((SQLiteDatabase)object2, fsi2.c, (Executor)object, fsi2.o) : new fsc((SQLiteDatabase)object2, (Executor)object, (Executor)object, fsi2.o);
                    object2 = hhk.K(object);
                    Objects.requireNonNull(object);
                    return fsi.a((hpn)object2, new fsd(object, 1));
                }
                Object object3 = (fsc)object2;
                Object object4 = new AmbientModeSupport$AmbientController(this.a, null);
                ((fsc)object3).a();
                object2 = goo.a;
                object = new hth(((fsc)object3).a);
                object2 = fxf.ar("Transaction", (gop)object2);
                try {
                    Callable callable = new fsa((fsc)object3, (AmbientModeSupport$AmbientController)object4, (hth)object);
                    callable = gqk.j(callable);
                    object4 = new hpo(callable);
                    ((fsc)object3).c.execute((Runnable)object4);
                    object3 = new ffe(object4, object, 11);
                    ((hpo)object4).c((Runnable)object3, (Executor)hom.a);
                    ((gol)object2).a((hpn)object4);
                    return new hog((hpn)object4);
                }
                finally {
                    ((gol)object2).close();
                }
            }
            object = (fsc)object2;
            ((fsc)object).a();
            Object object5 = (hth)this.a;
            object2 = ((hth)object5).a;
            object5 = (String)((hth)object5).b;
            object2 = new fry((fsc)object, (Object[])object2, (String)object5);
            n2 = fsm.a;
            object2 = new fsk((fsl)object2);
            ((fsc)object).b.execute(gqk.i((Runnable)object2));
            object5 = hom.a;
            fxf.K(object5);
            object = new hog(hhk.L((hpn)object2));
            hhk.T((hpn)object2, new hnz((hog)object, (Executor)object5), (Executor)hom.a);
            return object;
        }
        Object object6 = (hth)this.a;
        Object object7 = ((hth)object6).b;
        Object object8 = "ExecSQL: ".concat((String)object7);
        object = (fsc)object2;
        object2 = fxf.as((String)object8, gqv.a);
        object8 = ((hth)object6).a;
        try {
            object6 = new cmq(object, object7, object8, 11, null);
            ((fsc)object).a();
            object7 = new czm(object, object6, 16);
            object7 = gqk.j((Callable)object7);
            object6 = new hpo((Callable)object7);
            ((fsc)object).b.execute((Runnable)object6);
            ((gol)object2).a((hpn)object6);
            return new hog((hpn)object6);
        }
        finally {
            ((gol)object2).close();
        }
    }
}

