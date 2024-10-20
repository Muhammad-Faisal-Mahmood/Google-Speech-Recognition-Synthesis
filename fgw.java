/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 *  hom
 */
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import j$.util.Optional;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fgw {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController");
    public final fgu b;
    public final ffk c;
    public final fkj d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    hpn f;
    eaj g;
    public edk h;
    public final ivu i;
    private final hpr j;
    private final hpr k;
    private final jnu l;
    private final efh m;
    private efj n;
    private final emg o;

    public fgw(efh efh2, jnu jnu2, emg emg2, fkj fkj2, hpr hpr2, hpr hpr3, ivu ivu2, fgu fgu2, ffk ffk2) {
        this.m = efh2;
        this.l = jnu2;
        this.o = emg2;
        this.d = fkj2;
        this.j = hpr2;
        this.k = hpr3;
        this.i = ivu2;
        this.b = fgu2;
        this.c = ffk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void g() {
        synchronized (this) {
            Object object = dzx.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            Object object2 = ((hwp)object).b;
            Object object3 = (dzx)object2;
            ((dzx)object3).b |= 1;
            ((dzx)object3).c = 4;
            if (!((hwv)object2).B()) {
                ((hwp)object).u();
            }
            object2 = (dzx)((hwp)object).b;
            ((dzx)object2).b |= 2;
            ((dzx)object2).d = 3;
            object2 = eip.a.l();
            object3 = eji.a;
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            hwv hwv2 = (eip)((hwp)object2).b;
            object3.getClass();
            hwv2.c = object3;
            hwv2.b = 20;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object3 = (dzx)((hwp)object).b;
            object2 = (eip)((hwp)object2).o();
            object2.getClass();
            ((dzx)object3).f = object2;
            ((dzx)object3).b |= 8;
            hwv2 = (dzx)((hwp)object).o();
            object3 = (heg)((heg)efh.a.f().h(hfo.a, "ALT.AFClient")).j("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusClientImpl", "acquireAudioFocus", 24, "AudioFocusClientImpl.java");
            object = object2 = ((dzx)hwv2).f;
            if (object2 == null) {
                object = eip.a;
            }
            object2 = this.m;
            object3.u("#audio# acquire audio focus for client(%s)", eio.a(((eip)object).b).name());
            this.n = object = ((efh)object2).b.a((dzx)hwv2);
            object = ((efj)object).a();
            object2 = new cur(6);
            fxf.al((hpn)object, (hpb)object2, this.j);
            return;
        }
    }

    public final int a() {
        int n2;
        if (this.b.m.isPresent() && (n2 = ((fev)this.b.m.get()).d) != 1) {
            if (n2 == 2) {
                return 12;
            }
            throw new IllegalStateException("Unsupported audio channel count!");
        }
        return 16;
    }

    public final int b() {
        if (this.b.m.isPresent()) {
            return ((fev)this.b.m.get()).c;
        }
        return 16000;
    }

    public final eae c() {
        hwp hwp2 = eae.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        long l2 = true != this.b.o ? 300000L : 86400000L;
        eae eae2 = (eae)hwp2.b;
        eae2.b |= 0x80;
        eae2.i = l2;
        int n2 = this.a();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        eae2 = (eae)hwp2.b;
        eae2.b |= 4;
        eae2.e = n2;
        n2 = this.b();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        eae2 = (eae)hwp2.b;
        eae2.b |= 2;
        eae2.d = n2;
        return (eae)hwp2.o();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final InputStream d() {
        synchronized (this) {
            hpn hpn2 = this.f;
            ((heg)((heg)egv.a.c()).j("com/google/android/libraries/search/audio/audiostream/AudioInputStreamProducer", "getRawInputStream", 43, "AudioInputStreamProducer.java")).r("#audio# getRawInputStream");
            return new egu(hpn2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        synchronized (this) {
            if (this.e.compareAndSet(false, true)) {
                Object object;
                Object object2;
                if (this.g != null) {
                    this.c.m();
                    object2 = this.g.a().a();
                    object = new cmr(this, 11);
                    fxf.al((hpn)object2, (hpb)object, this.j);
                }
                if ((object = this.n) != null) {
                    ((heg)((heg)efj.a.f().h(hfo.a, "ALT.AFCSession")).j("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionImpl", "releaseAudioFocus", 87, "AudioFocusSessionImpl.java")).s("#audio# release audio focus session(token(%d))", ((efj)object).b.c);
                    object2 = ((efj)object).b;
                    object = hhk.L(((efj)object).e.b((efn)object2, dzw.b));
                    object2 = new cur(5);
                    fxf.al((hpn)object, (hpb)object2, this.j);
                    return;
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        synchronized (this) {
            if (this.e.get()) {
                ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", 157, "AudioLibraryAudioController.java")).r("#closeMicIfNeeded called before #initializeAsync");
                fds fds2 = new fds();
                this.f = hhk.J(fds2);
                return;
            }
            ((heg)((heg)a.c()).j("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", 163, "AudioLibraryAudioController.java")).u("#initializeAsync %s", this.b);
            Object object = eao.a.l();
            Object object2 = this.b;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            boolean bl2 = ((fgu)object2).n;
            object2 = (eao)((hwp)object).b;
            ((eao)object2).b |= 4;
            ((eao)object2).i = bl2;
            object2 = this.c();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            Object object3 = (eao)((hwp)object).b;
            object2.getClass();
            ((eao)object3).g = object2;
            ((eao)object3).b |= 1;
            if (this.b.m.isPresent() && ((fev)this.b.m.get()).a.isPresent()) {
                object2 = edg.a.l();
                object3 = ((Uri)((fev)this.b.m.get()).a.get()).toString();
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                Object object4 = (edg)((hwp)object2).b;
                object3.getClass();
                ((edg)object4).b |= 1;
                ((edg)object4).c = object3;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = (eao)((hwp)object).b;
                object2 = (edg)((hwp)object2).o();
                object2.getClass();
                ((eao)object3).d = object2;
                ((eao)object3).c = 13;
                object4 = this.o;
                object3 = (eao)((hwp)object).o();
                jse.e(object3, "params");
                ((heg)emg.a.f().h(hfo.a, "ALT.ExtSessionProvider").j("com/google/android/libraries/search/audio/extensions/externallisteningsession/impl/ExternalListeningSessionProviderImpl", "createUriAudioRequestListeningSession", 79, "ExternalListeningSessionProviderImpl.kt")).r("#audio# create external(URI) session");
                object2 = ((eao)object3).c == 13 ? (edg)((eao)object3).d : edg.a;
                if ((1 & ((edg)object2).b) == 0) {
                    object2 = new IllegalArgumentException("AudioRequestMicInputParams must have Uri string");
                    throw object2;
                }
                object = ((emg)object4).c;
                object2 = ((eao)object3).c == 13 ? (edg)((eao)object3).d : edg.a;
                object = ((cxv)object).f(((edg)object2).c);
                object2 = object3 = ((eao)object3).g;
                if (object3 == null) {
                    object2 = eae.a;
                }
                jse.d(object2, "getAudioLibInputParams(...)");
                object3 = (hwp)((hwv)object2).C(5);
                ((hwp)object3).x((hwv)object2);
                object2 = dpf.k((hwp)object3);
                ((dlm)object2).l(false);
                this.g = emg.b((emg)object4, (efo)object, ((dlm)object2).i());
            } else if (this.b.m.isPresent() && ((fev)this.b.m.get()).b.isPresent()) {
                object3 = this.o;
                Object object5 = ((fev)this.b.m.get()).b.get();
                object = this.c();
                jse.e(object, "params");
                ((heg)emg.a.f().h(hfo.a, "ALT.ExtSessionProvider").j("com/google/android/libraries/search/audio/extensions/externallisteningsession/impl/ExternalListeningSessionProviderImpl", "createPfdAudioRequestListeningSession", 93, "ExternalListeningSessionProviderImpl.kt")).r("#audio# create external(PFD) session");
                object2 = new egd((ParcelFileDescriptor)object5);
                object5 = (hwp)((hwv)object).C(5);
                ((hwp)object5).x((hwv)object);
                object = dpf.k((hwp)object5);
                ((dlm)object).l(false);
                this.g = emg.b((emg)object3, (efo)object2, ((dlm)object).i());
            } else {
                Object object6 = String.format(Locale.US, "TNT_%s", this.b.f.name());
                object2 = (hwr)eam.a.l();
                object3 = eip.a.l();
                hyg hyg2 = eji.a.l();
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                Object object7 = (eji)((hwp)hyg2).b;
                object6.getClass();
                ((eji)object7).b |= 1;
                ((eji)object7).c = object6;
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object7 = (eip)((hwp)object3).b;
                hyg2 = (eji)((hwp)hyg2).o();
                hyg2.getClass();
                ((eip)object7).c = hyg2;
                ((eip)object7).b = 20;
                if (!((hwp)object2).b.B()) {
                    ((hwp)object2).u();
                }
                hyg2 = (eam)((hwr)object2).b;
                object3 = (eip)((hwp)object3).o();
                object3.getClass();
                ((eam)hyg2).c = object3;
                ((eam)hyg2).b = 1 | ((eam)hyg2).b;
                hyg2 = (eam)((hwp)object2).o();
                this.g();
                if (tt.b() && (object2 = this.b.u) != null && ((Optional)object2).isPresent()) {
                    this.h = object3 = this.i.k(ut$$ExternalSyntheticApiModelOutline0.m(this.b.u.get()));
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object2 = (eao)((hwp)object).b;
                    object3.getClass();
                    ((eao)object2).f = object3;
                    ((eao)object2).e = 12;
                }
                object7 = this.l.b();
                object6 = (heg)((heg)ekc.a.f().h(hfo.a, "ALT.ARCProvider")).j("com/google/android/libraries/search/audio/clients/impl/AudioRequestClientProviderImpl", "activateAudioRequestClient", 32, "AudioRequestClientProviderImpl.java");
                object2 = object3 = ((eam)hyg2).c;
                if (object3 == null) {
                    object2 = eip.a;
                }
                object6.u("#audio# activating audio request client(%s)", eio.a(((eip)object2).b).name());
                object2 = ((ekc)object7).b.C((eam)hyg2).b;
                object3 = (eao)((hwp)object).o();
                ((heg)((heg)eka.a.f().h(hfo.a, "ALT.ARClient")).j("com/google/android/libraries/search/audio/clients/impl/AudioRequestClientImpl", "startListening", 44, "AudioRequestClientImpl.java")).s("#audio# starting listening for audio request client(token(%s))", ((eka)object2).b);
                this.g = ((eka)object2).d.E((int)((eka)object2).b, (eao)object3).a;
                object3 = new ffd(this, 6);
                ((eka)object2).c.c((Runnable)object3, (Executor)hom.a);
            }
            object2 = grf.g(this.g.c());
            object3 = new ezz(this, 15);
            object2 = ((grf)object2).i((hny)object3, this.j);
            object3 = new ezz(this, 16);
            this.f = ((grf)object2).f(Exception.class, (hny)object3, this.j);
            object2 = new fgm(this, 2);
            fxf.ah((Callable)object2, this.k);
            object2 = new fgv(this);
            object3 = fxf.ah((Callable)object2, this.k);
            object2 = new cmr(this, 10);
            fxf.al((hpn)object3, (hpb)object2, this.j);
            return;
        }
    }
}

