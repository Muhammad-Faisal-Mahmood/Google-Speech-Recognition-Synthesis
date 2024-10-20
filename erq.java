/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.TelephonyManager
 */
import android.content.Context;
import android.telephony.TelephonyManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class erq
implements erx {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl");
    public List b;
    public List c;
    private final Context d;
    private final jvb e;
    private final List f;
    private final dtu g;
    private final dtu h;
    private final gpm i;

    static {
        jns.f(1999, 4, 3, 2);
    }

    public erq(dml object, dtu dtu2, Context context, Executor executor, jvb jvb2, jqf jqf2, bzb bzb2) {
        jse.e(object, "audioSessionIdStore");
        jse.e(dtu2, "tokenGenerator");
        jse.e(executor, "lightweightExecutor");
        jse.e(jvb2, "lightweightScope");
        jse.e(jqf2, "mainContext");
        this.g = dtu2;
        this.d = context;
        this.e = jvb2;
        object = (TelephonyManager)context.getSystemService("phone");
        this.h = cqq.av(jvb2);
        this.i = bzb2.G();
        this.b = object = jpa.a;
        this.c = object;
        this.f = object;
    }

    private final void f(jro jro2) {
        this.h.k(jro2);
    }

    @Override
    public final long a() {
        return this.g.i();
    }

    public final erg b() {
        Object object;
        Object object2;
        Object object3;
        ArrayList<eqx> arrayList = new ArrayList<eqx>();
        for (hwv hwv2 : this.b) {
            bzo bzo2 = euf.B(eqx.a.l());
            object2 = object3 = eqz.b(hwv2.c);
            if (object3 == null) {
                object2 = eqz.a;
            }
            bzo2.Y((eqz)object2);
            object2 = object3 = eqw.b(hwv2.e);
            if (object3 == null) {
                object2 = eqw.a;
            }
            jse.e(object2, "value");
            object3 = (hwp)bzo2.a;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object3 = (eqx)((hwp)object3).b;
            ((eqx)object3).d = ((eqw)object2).c;
            ((eqx)object3).c = 3;
            arrayList.add(bzo2.X());
        }
        for (hwv hwv2 : this.c) {
            object = euf.B(eqx.a.l());
            object2 = object3 = eqz.b(((erw)hwv2).e);
            if (object3 == null) {
                object2 = eqz.a;
            }
            ((bzo)object).Y((eqz)object2);
            if ((((erw)hwv2).b & 4) != 0) {
                int n2 = ((erw)hwv2).g;
                object2 = (hwp)((bzo)object).a;
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                object2 = (eqx)((hwp)object2).b;
                ((eqx)object2).b |= 2;
                ((eqx)object2).f = n2;
            }
            object2 = ((erw)hwv2).c == 2 ? (ebt)((erw)hwv2).d : ebt.a;
            jse.e(object2, "value");
            object3 = (hwp)((bzo)object).a;
            if (!((hwp)object3).b.B()) {
                ((hwp)object3).u();
            }
            object3 = (eqx)((hwp)object3).b;
            object2.getClass();
            ((eqx)object3).d = object2;
            ((eqx)object3).c = 2;
            arrayList.add(((bzo)object).X());
        }
        jns.A(arrayList, this.f);
        object2 = erg.a.l();
        jse.e(object2, "builder");
        object3 = DesugarCollections.unmodifiableList(((erg)((hwp)object2).b).b);
        jse.d(object3, "getUpdatesList(...)");
        new hzr((List)object3);
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object = (erg)((hwp)object2).b;
        object3 = ((erg)object).b;
        if (!object3.c()) {
            ((erg)object).b = hwv.s((hxk)object3);
        }
        hvc.g(arrayList, ((erg)object).b);
        object2 = ((hwp)object2).o();
        jse.d(object2, "build(...)");
        return (erg)object2;
    }

    public final void c(erg object, erh erh2) {
        ((heg)a.c().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "notifyListeners", 482, "MicStateReporterImpl.kt")).C("#audio# notify listeners with(update(%s), delta(%s))", new ern((hwv)object, 1), new erm(erh2));
        object = new ero(0);
        gpm.y(this.i, (jrk)object);
    }

    @Override
    public final void d(erv erv2) {
        jse.e(erv2, "partialRequestUpdate");
        hei hei2 = a;
        ((heg)hei2.c().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "updateState", 164, "MicStateReporterImpl.kt")).u("#audio# update state partially with upcoming update(%s)", new ern(erv2, 2));
        if ((erv2.b & 2) != 0) {
            this.f(new eht(this, erv2, null, 4));
            return;
        }
        ((heg)hei2.h().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "updateState", 169, "MicStateReporterImpl.kt")).r("#audio# skip partial upcoming update as no updateId present");
    }

    @Override
    public final void e(erw erw2) {
        jse.e(erw2, "partialUpdate");
        hei hei2 = a;
        ((heg)hei2.c().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "updateState", 145, "MicStateReporterImpl.kt")).u("#audio# update state partially with(%s)", new ern(erw2, 0));
        if ((erw2.b & 2) != 0) {
            this.f(new erp(this, erw2, null));
            return;
        }
        ((heg)hei2.h().h(hfo.a, "ALT.MicStateReporter").j("com/google/android/libraries/search/audio/microphone/state/impl/MicStateReporterImpl", "updateState", 150, "MicStateReporterImpl.kt")).r("#audio# skip partial update as no updateId present");
    }
}

