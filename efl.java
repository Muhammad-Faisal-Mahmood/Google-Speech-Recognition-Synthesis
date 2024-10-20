/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes$Builder
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Handler
 *  android.os.Looper
 */
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class efl {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager");
    private final efi b;
    private efj c;
    private final cxv d;
    private final cxv e;
    private final czh f;
    private final cxt g;

    public efl(efi efi2, cxt cxt2, cxv cxv2, cxv cxv3, czh czh2) {
        this.b = efi2;
        this.g = cxt2;
        this.e = cxv2;
        this.d = cxv3;
        this.f = czh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void d(efn efn2) {
        synchronized (this) {
            efj efj2 = this.c;
            if (efj2 != null && efn2.equals(efj2.b)) {
                this.c = null;
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final efj a(dzx object) {
        synchronized (this) {
            Object object2 = efn.a.l();
            int n2 = ((AtomicInteger)this.g.a).incrementAndGet();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            Object object3 = (efn)((hwp)object2).b;
            ((efn)object3).b |= 1;
            ((efn)object3).c = n2;
            Object object4 = (efn)((hwp)object2).o();
            Object object5 = (heg)((heg)a.f().h(hfo.a, "ALT.AFCSessionMgr")).j("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager", "acquireAudioFocus", 65, "AudioFocusSessionManager.java");
            object3 = object2 = ((dzx)object).f;
            if (object2 == null) {
                object3 = eip.a;
            }
            object5.A("#audio# acquire audio focus for client(%s) session(token(%d))", eio.a(((eip)object3).b).name(), ((efn)object4).c);
            object5 = this.f;
            jse.e(object4, "audioFocusToken");
            jse.e(object, "params");
            object3 = object2 = ((dzx)object).f;
            if (object2 == null) {
                object3 = eip.a;
            }
            object2 = ((czh)object5).a;
            jse.d(object3, "getClientInfo(...)");
            object2.h((eip)object3, ((efn)object4).c, (dzx)object);
            object3 = ((czh)object5).d;
            object2 = dox.o(ece.a.l());
            ((bzo)object2).B(ech.f);
            jse.e(object, "value");
            Object object6 = ((bzo)object2).a;
            if (!((hwp)object6).b.B()) {
                ((hwp)object6).u();
            }
            object6 = (ece)((hwp)object6).b;
            object.getClass();
            ((ece)object6).d = object;
            ((ece)object6).c = 203;
            ((bzo)object2).z((efn)object4);
            object2 = ((bzo)object2).y();
            ((evo)object3).d((ece)object2);
            object5 = ((czh)object5).b;
            object3 = object2 = ((dzx)object).f;
            if (object2 == null) {
                object3 = eip.a;
            }
            ((enc)object5).e((eip)object3, "AUDIO_FOCUS");
            object2 = this.e;
            object.getClass();
            object4.getClass();
            object3 = (efl)((cxv)object2).b.b();
            object3.getClass();
            object2 = (Executor)((cxv)object2).a.b();
            object2.getClass();
            object5 = new eff((dzx)object, (efn)object4, (efl)object3, (Executor)object2);
            n2 = AudioAttributesCompat.b;
            object6 = new bzb(null, null, null);
            if ((((dzx)object).b & 0x10) != 0) {
                xm.j(((dzx)object).g, (bzb)object6);
                object3 = object2 = ((dzx)object).f;
                if (object2 == null) {
                    object3 = eip.a;
                }
                if (eio.a(((eip)object3).b) == eio.G) {
                    ((AudioAttributes.Builder)((bzb)object6).a).setContentType(1);
                }
            } else {
                n2 = ((dzx)object).d;
                ((AudioAttributes.Builder)((bzb)object6).a).setLegacyStreamType(n2);
            }
            n2 = ((dzx)object).c;
            int n3 = adf.b;
            if (n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4) {
                object = new IllegalArgumentException(a.af(n2, "Illegal audio focus gain type "));
                throw object;
            }
            object3 = new Handler(Looper.getMainLooper());
            object2 = xm.i((bzb)object6);
            object6 = new adf(n2, (AudioManager.OnAudioFocusChangeListener)object5, (Handler)object3, (AudioAttributesCompat)object2);
            object3 = this.b;
            ((heg)((heg)efi.a.c().h(hfo.a, "ALT.AFMgr")).j("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusManager", "acquireAudioFocus", 51, "AudioFocusManager.java")).r("#audio# acquireAudioFocus");
            object2 = new czm(object3, object6, 6, null);
            object2 = gqk.j((Callable)object2);
            Object object7 = ((efi)object3).d.a((Callable)object2, ((efi)object3).b);
            Object object8 = this.d;
            object3 = object2 = ((dzx)object).f;
            if (object2 == null) {
                object3 = eip.a;
            }
            object4.getClass();
            object3.getClass();
            object7.getClass();
            object2 = (efl)((cxv)object8).b.b();
            object2.getClass();
            object8 = (Executor)((cxv)object8).a.b();
            object8.getClass();
            object5 = new efj((efn)object4, (adf)object6, (eip)object3, (hpn)object7, (efl)object2, (Executor)object8);
            object6 = this.f;
            jse.e(object4, "audioFocusToken");
            jse.e(object, "params");
            object3 = object2 = ((dzx)object).f;
            if (object2 == null) {
                object3 = eip.a;
            }
            object2 = ((czh)object6).a;
            jse.d(object3, "getClientInfo(...)");
            object2.w((eip)object3, ((efn)object4).c, (efj)object5);
            object7 = ((czh)object6).d;
            object3 = object2 = ((dzx)object).f;
            if (object2 == null) {
                object3 = eip.a;
            }
            object8 = ((efj)object5).a();
            object2 = new enb((evo)object7, (efn)object4, (eip)object3, 4);
            hhk.T((hpn)object8, gqk.g((hpb)object2), ((evo)object7).b);
            object2 = ((efj)object5).b();
            object8 = new enb((evo)object7, (efn)object4, (eip)object3, 3);
            hhk.T((hpn)object2, gqk.g((hpb)object8), ((evo)object7).b);
            object2 = ((czh)object6).b;
            object = object3 = ((dzx)object).f;
            if (object3 == null) {
                object = eip.a;
            }
            object4 = ((efj)object5).a();
            object3 = new ena(object2, object, 3);
            hhk.T((hpn)object4, gqk.g((hpb)object3), ((enc)object2).c);
            object3 = ((efj)object5).b();
            object4 = new ena(object2, object, 4);
            hhk.T((hpn)object3, gqk.g((hpb)object4), ((enc)object2).c);
            this.c(dzw.d);
            this.c = object5;
            return object5;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn b(efn object, dzw object2) {
        synchronized (this) {
            efj efj2 = this.c;
            if (efj2 != null && ((hwv)object).equals(efj2.b)) {
                efj2 = this.c;
                Object object3 = efj2.c;
                Object object4 = this.f;
                Object object5 = efj2.d;
                jse.e(object2, "reason");
                int n2 = ((efn)object).c;
                ((czh)object4).a.i((eip)object5, n2, (dzw)object2);
                object5 = dox.o(ece.a.l());
                ((bzo)object5).B(ech.g);
                ((bzo)object5).z((efn)object);
                object5 = ((bzo)object5).y();
                ((evo)((czh)object4).d).d((ece)object5);
                object4 = this.b;
                ((heg)((heg)efi.a.c().h(hfo.a, "ALT.AFMgr")).j("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusManager", "releaseAudioFocus", 74, "AudioFocusManager.java")).u("#audio# releaseAudioFocus for reason: %s", ((Enum)object2).name());
                object5 = new cmq((efi)object4, (adf)object3, (dzw)object2, 5);
                object2 = gqk.j((Callable)object5);
                object3 = ((efi)object4).d.a((Callable)object2, ((efi)object4).b);
                object2 = new cmr(efj2, 4);
                hhk.T((hpn)object3, gqk.g((hpb)object2), efj2.f);
                this.d((efn)object);
                return object3;
            }
            ((heg)((heg)a.h().h(hfo.a, "ALT.AFCSessionMgr")).j("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager", "releaseAudioFocus", 96, "AudioFocusSessionManager.java")).s("#audio# release audio focus session(token(%d)) failed: session is inactive", ((efn)object).c);
            return hhk.K(elb.n(5, (dzw)object2));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(dzw dzw2) {
        synchronized (this) {
            efj efj2 = this.c;
            if (efj2 != null) {
                ((heg)((heg)a.f().h(hfo.a, "ALT.AFCSessionMgr")).j("com/google/android/libraries/search/audio/audiofocus/impl/AudioFocusSessionManager", "deactivate", 119, "AudioFocusSessionManager.java")).s("#audio# deactivate audio focus client session(token(%d))", efj2.b.c);
                gax.c(this.b(efj2.b, dzw2), "Failed to release audio focus.", new Object[0]);
                return;
            }
            return;
        }
    }
}

