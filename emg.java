/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class emg {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/extensions/externallisteningsession/impl/ExternalListeningSessionProviderImpl");
    public final dtu b;
    public final cxv c;
    public final dpq d;
    private final egg e;
    private final jvb f;
    private final dlm g;

    public emg(dtu dtu2, cxv cxv2, dpq dpq2, dlm dlm2, egg egg2, jvb jvb2) {
        jse.e(dlm2, "externalSessionFactory");
        jse.e(jvb2, "blockingScope");
        this.b = dtu2;
        this.c = cxv2;
        this.d = dpq2;
        this.g = dlm2;
        this.e = egg2;
        this.f = jvb2;
    }

    public static /* synthetic */ eaj b(emg emg2, efo efo2, eae eae2) {
        return emg2.c(efo2, eae2, null);
    }

    private final eaj c(efo efo2, eae eae2, ewq ewq2) {
        Serializable serializable = new jsj();
        hpn hpn2 = kl.o(new bwo(serializable, 3));
        dtu dtu2 = cqq.av(this.f);
        serializable = new mz(serializable, 14);
        return new emd(dtu2.j(new emf(this, efo2, ewq2, eae2, (jrk)((Object)serializable), null)), hpn2, eae2, new eqi(dtu2, this, efo2, (jrk)((Object)serializable), 1), (hpr)((dlm)this.g.a).a.b());
    }

    public final eaj a(efx object, ewq ewq2) {
        jse.e(object, "audioRecordParams");
        ((heg)a.f().h(hfo.a, "ALT.ExtSessionProvider").j("com/google/android/libraries/search/audio/extensions/externallisteningsession/impl/ExternalListeningSessionProviderImpl", "createAudioRequestListeningSessionForInternalUse", 106, "ExternalListeningSessionProviderImpl.kt")).r("#audio# create external session");
        Object object2 = gsl.a;
        Object object3 = new emm(dww.n(eip.a.l()).p(), null, null, null, 12);
        object2 = this.e.a((efx)object, (gto)object2, (emm)object3);
        object = object3 = ((efx)object).e;
        if (object3 == null) {
            object = eae.a;
        }
        jse.d(object, "getAudioLibInputParams(...)");
        return this.c((efo)object2, (eae)object, ewq2);
    }
}

