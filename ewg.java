/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class ewg {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/store/session/SessionAudioStore");
    private static final ely j;
    public final Executor b;
    public final Executor c;
    public final long d;
    public final hpn e;
    public final hpn f;
    public final eae g;
    public final int h;
    public final emg i;
    private final jvb k;
    private final eip l;
    private final evu m;

    static {
        hwp hwp2 = ely.a.l();
        jse.e(hwp2, "builder");
        elz elz2 = elz.c;
        jse.e(elz2, "value");
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = (ely)hwp2.b;
        hwv2.c = elz2.d;
        hwv2.b |= 1;
        hwv2 = hwp2.o();
        jse.d(hwv2, "build(...)");
        j = hwv2;
    }

    public ewg(jvb jvb2, Executor executor, Executor executor2, evu evu2, emg emg2, long l2, eip eip2, hpn hpn2, hpn hpn3, eae eae2, int n2) {
        jse.e(jvb2, "lightweightScope");
        jse.e(executor, "lightweightExecutor");
        jse.e(executor2, "audioReadBlockingExecutor");
        jse.e(evu2, "audioStore");
        jse.e(eip2, "clientInfo");
        jse.e(eae2, "params");
        this.k = jvb2;
        this.b = executor;
        this.c = executor2;
        this.m = evu2;
        this.i = emg2;
        this.d = l2;
        this.l = eip2;
        this.e = hpn2;
        this.f = hpn3;
        this.g = eae2;
        this.h = n2;
    }

    public final evq a(String object) {
        Object object2 = (hwr)ecm.a.l();
        jse.e(object2, "builder");
        int n2 = this.g.d;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        Object object3 = (ecm)((hwr)object2).b;
        ((ecm)object3).b |= 1;
        ((ecm)object3).c = n2;
        n2 = Integer.bitCount(this.g.e);
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object3 = (ecm)((hwr)object2).b;
        ((ecm)object3).b |= 2;
        ((ecm)object3).d = n2;
        n2 = this.g.f;
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object3 = this.m;
        Object object4 = (ecm)((hwr)object2).b;
        ((ecm)object4).b |= 4;
        ((ecm)object4).e = n2;
        object4 = emb.a;
        jse.d(object4, "clientInfo");
        dpf.h((gpm)object4, this.l, (hwr)object2);
        object4 = emb.b;
        jse.d(object4, "source");
        dpf.h((gpm)object4, object, (hwr)object2);
        object = emb.c;
        jse.d(object, "token");
        dpf.h((gpm)object, String.valueOf(this.h), (hwr)object2);
        object = ema.a;
        jse.d(object, "storingDestination");
        dpf.h((gpm)object, j, (hwr)object2);
        object = ((hwp)object2).o();
        jse.d(object, "build(...)");
        object = (ecm)object;
        jse.e(object, "metadata");
        object2 = ema.a;
        jse.d(object2, "storingDestination");
        object2 = fvc.aF((hwt)object, (gpm)object2);
        jse.d(object2, "get(...)");
        object = ((evu)object3).a((ely)object2) ? new evt((evu)object3, (ecm)object) : evu.a;
        return object;
    }

    public final jvi b(String object, dzl dzl2) {
        jur jur2 = new jur();
        object = this.a((String)object);
        jsj jsj2 = new jsj();
        jsj2.a = dzl2.k(new ewf((evq)object, jur2, jsj2, this));
        return jur2;
    }

    public final void c() {
        if (!this.m.a(j)) {
            ((heg)a.f().h(hfo.a, "ALT.SessionAudioStore").j("com/google/android/libraries/search/audio/store/session/SessionAudioStore", "maybeStore", 70, "SessionAudioStore.kt")).s("#audio# skipping session(%s) storing process, not enabled", this.h);
            return;
        }
        jvb jvb2 = this.k;
        jqg jqg2 = jqg.a;
        jvc jvc2 = jvc.a;
        jse.af(jvb2, fxf.ay(jqg2), jvc2, new ewd(null, this));
    }
}

