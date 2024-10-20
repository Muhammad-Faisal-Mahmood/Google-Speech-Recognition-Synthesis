/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

public final class eif
implements esy {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothFallbackAwareAudioRoute");
    public final emm b;
    public final jvb c;
    public final ehq d;
    public final ebc e;
    public final jur f;
    public final czh g;
    private final ebd h;
    private final Executor i;
    private final ekk j;
    private final hou k;

    public eif(emm object, ebd ebd2, int n2, gfl object2, jvb jvb2, Executor object3, czh object4) {
        this.b = object;
        this.h = ebd2;
        this.c = jvb2;
        this.i = object3;
        this.g = object4;
        object3 = (hwp)ebd2.C(5);
        ((hwp)object3).x(ebd2);
        object3 = doc.g((hwp)object3);
        object4 = ebc.a;
        jse.e(object4, "value");
        Object object5 = (hwp)((bzb)object3).a;
        if (!((hwp)object5).b.B()) {
            ((hwp)object5).u();
        }
        object5 = (ebd)((hwp)object5).b;
        ((ebd)object5).c = ((ebc)object4).d;
        ((ebd)object5).b |= 1;
        ebd ebd3 = ((bzb)object3).e();
        ebd3.getClass();
        object3 = (Executor)((gfl)object2).h.b();
        object3.getClass();
        object5 = (jvb)((gfl)object2).b.b();
        object5.getClass();
        Context context = ((ilt)((gfl)object2).g).a();
        eie eie2 = (eie)((gfl)object2).a.b();
        eie2.getClass();
        czh czh2 = ((end)((gfl)object2).d).a();
        object4 = (Optional)((imc)((gfl)object2).f).a;
        object4.getClass();
        Object object6 = ((gfl)object2).c.b();
        object2 = (hwg)((gfl)object2).e.b();
        this.d = object3 = new ehq((emm)object, ebd3, n2, (Executor)object3, (jvb)object5, context, eie2, czh2, (Optional)object4, (hwg)object6, (hwg)object2);
        object = object2 = ebc.b(ebd2.c);
        if (object2 == null) {
            object = ebc.c;
        }
        jse.d(object, "getConnectionStrategyFallbackBehavior(...)");
        this.e = object;
        this.f = object = new jur();
        object = jsd.k((jvi)object);
        object2 = dww.e(eaz.a.l());
        ((dml)object2).e(ebd2);
        this.j = new ekk((hpn)object, ((dml)object2).d(), ((ehq)object3).j.c, gsl.a);
        this.k = new hou();
        jse.ah(jvb2, null, null, new aus(this, null, 12), 3);
    }

    @Override
    public final ekk a() {
        return this.j;
    }

    @Override
    public final hpn b() {
        return this.f(new aus(this, null, 14, null));
    }

    @Override
    public final hpn c(ebg ebg2) {
        jse.e(ebg2, "disconnectReason");
        return this.f(new bes(this, ebg2, null, 9));
    }

    @Override
    public final /* synthetic */ eln d() {
        return null;
    }

    @Override
    public final /* synthetic */ esy e() {
        return this;
    }

    public final hpn f(jro object) {
        object = new ctz(this, object, 17, null);
        Executor executor = this.i;
        object = this.k.b((hnx)object, executor);
        jse.d(object, "submitAsync(...)");
        return object;
    }
}

