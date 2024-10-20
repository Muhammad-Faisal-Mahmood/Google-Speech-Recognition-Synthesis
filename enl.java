/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Optional;

public final class enl
implements enh {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider");
    private final eip b;
    private final eae c;
    private final Optional d;
    private final Object e;
    private eaj f;
    private final emg g;
    private final dtu h;

    public enl(eip eip2, eae eae2, dtu dtu2, emg emg2, Optional optional) {
        jse.e(eae2, "audioParams");
        jse.e(optional, "realLoopbackCheckerOptional");
        this.b = eip2;
        this.c = eae2;
        this.h = dtu2;
        this.g = emg2;
        this.d = optional;
        this.e = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final dzl a() {
        Object object = this.e;
        synchronized (object) {
            Object object2;
            Object object3 = this.c;
            if (!((eae)object3).l) {
                return null;
            }
            if (!((eae)object3).m) {
                ((heg)a.g().h(hfo.a, "ALT.RealLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 43, "RealLoopbackAudioProvider.kt")).r("#audio# Only push mechanism is supported for loopback audio.");
                return null;
            }
            object3 = this.d;
            if (!((Optional)object3).isPresent()) {
                ((heg)a.h().h(hfo.a, "ALT.RealLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 51, "RealLoopbackAudioProvider.kt")).r("#audio# Real audio loopback not supported. (system module missing?)");
                return null;
            }
            object3 = (eni)((Optional)object3).get();
            Object object4 = a;
            ((heg)((hdz)object4).f().h(hfo.a, "ALT.RealLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 57, "RealLoopbackAudioProvider.kt")).u("#audio# Starting listening to the real loopback audio for %s.", crh.O(this.b));
            enj enj2 = object3.a();
            object3 = enj2 != null ? Integer.valueOf(enj2.b) : null;
            if (object3 != null && (Integer)object3 == 1) {
                object3 = dww.m(efx.a.l());
                object2 = this.c;
                hwp hwp2 = (hwp)((hwv)object2).C(5);
                hwp2.x((hwv)object2);
                object2 = dpf.k(hwp2);
                ((dlm)object2).j(16);
                ((dlm)object2).k(enj2.c);
                ((cxt)object3).o(((dlm)object2).i());
                object3 = ((cxt)object3).n();
            } else if (object3 != null && (Integer)object3 == 2) {
                object3 = dww.m(efx.a.l());
                object2 = this.c;
                hwp hwp3 = (hwp)((hwv)object2).C(5);
                hwp3.x((hwv)object2);
                object2 = dpf.k(hwp3);
                ((dlm)object2).j(12);
                ((dlm)object2).k(enj2.c);
                ((cxt)object3).o(((dlm)object2).i());
                object3 = ((cxt)object3).n();
            } else if (object3 != null && (Integer)object3 == 4) {
                object3 = dww.m(efx.a.l());
                object2 = this.c;
                hwp hwp4 = (hwp)((hwv)object2).C(5);
                hwp4.x((hwv)object2);
                object2 = dpf.k(hwp4);
                ((dlm)object2).j(15);
                ((dlm)object2).k(enj2.c);
                ((cxt)object3).o(((dlm)object2).i());
                ((cxt)object3).p(15);
                object3 = ((cxt)object3).n();
            } else {
                object3 = null;
            }
            if (object3 == null) {
                ((heg)((hdz)object4).h().h(hfo.a, "ALT.RealLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/RealLoopbackAudioProvider", "startListening", 73, "RealLoopbackAudioProvider.kt")).r("#audio# Real audio loopback is not supported.");
                return null;
            }
            object2 = this.h;
            eae eae2 = ((efx)object3).e;
            object4 = eae2;
            if (eae2 == null) {
                object4 = eae.a;
            }
            jse.d(object4, "getAudioLibInputParams(...)");
            object4 = dtu.g((dtu)object2, (eae)object4);
            this.f = this.g.a((efx)object3, (ewq)object4);
            return (dzl)object4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        Object object = this.e;
        synchronized (object) {
            try {
                eaj eaj2 = this.f;
                if (eaj2 != null) {
                    eaj2.a();
                }
            }
            catch (Throwable throwable) {
                jns.aj(throwable);
            }
            return;
        }
    }
}

