/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.os.ParcelFileDescriptor
 *  android.os.PowerManager
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import j$.util.Map$_EL;
import j$.util.Optional;
import java.io.IOException;
import java.util.Map;

public final class fje {
    public static final int a = 0;
    private static final hac b;
    private static final hei c;
    private final Context d;
    private final feh e;

    static {
        gzy gzy2 = new gzy();
        gzy2.d("com.fitbit.FitbitMobile", idy.D);
        gzy2.d("com.google.android.apps.search.transcription.testing.intentstarter.binary", idy.p);
        gzy2.d("com.google.android.dialer", idy.B);
        gzy2.d("com.google.android.googlequicksearchbox/smartdictation", idy.C);
        gzy2.d("com.google.android.inputmethod.latin", idy.i);
        gzy2.d("test.app", idy.p);
        b = gzy2.a();
        c = hei.m("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter");
    }

    public fje(Context context, feh feh2) {
        this.d = context;
        this.e = feh2;
    }

    private final void b(fgt fgt2, fig hyg2) {
        block16: {
            block17: {
                hwv hwv2;
                int n2;
                block20: {
                    block19: {
                        Object object;
                        block18: {
                            int n3;
                            n2 = n3 = a.v(((fig)hyg2).f);
                            if (n3 == 0) {
                                n2 = 1;
                            }
                            if (!fje.d(n2)) break block16;
                            object = ((fig)hyg2).g;
                            hwv2 = object;
                            if (object == null) {
                                hwv2 = fhm.a;
                            }
                            object = hwv2.o;
                            hwv2 = object;
                            if (object == null) {
                                hwv2 = fhe.a;
                            }
                            n2 = n3 = fhq.g(((fhe)hwv2).b);
                            if (n3 == 0) {
                                n2 = 1;
                            }
                            n3 = 2;
                            if (n2 == 2) {
                                n2 = n3;
                            } else if (n2 == 100) {
                                object = ((fig)hyg2).b;
                                hwv2 = object;
                                if (object == null) {
                                    hwv2 = fhi.a;
                                }
                                if (this.c(((fhi)hwv2).b, ffb.d)) {
                                    n2 = 100;
                                } else {
                                    object = (heg)((heg)c.h().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setAsrEnhancementConfig", 526, "RecognitionDataConverter.java");
                                    hwv2 = ((fig)hyg2).b;
                                    hyg2 = hwv2;
                                    if (hwv2 == null) {
                                        hyg2 = fhi.a;
                                    }
                                    object.u("Client %s is not allowed to use FALLBACK_ALWAYS. Using FALLBACK_ON_LOW_CONFIDENCE instead.", ((fhi)hyg2).b);
                                    n2 = n3;
                                }
                            } else {
                                n2 = 1;
                            }
                            if (n2 == 1) break block17;
                            object = this.d;
                            hyg2 = (ActivityManager)object.getSystemService("activity");
                            hwv2 = new ActivityManager.MemoryInfo();
                            if (hyg2 == null) break block18;
                            hyg2.getMemoryInfo((ActivityManager.MemoryInfo)hwv2);
                            if (!((ActivityManager.MemoryInfo)hwv2).lowMemory) break block18;
                            ((heg)((heg)c.f().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "canEnableAsrEnhancement", 549, "RecognitionDataConverter.java")).r("Memory is running low, skip asr enhancement.");
                            break block19;
                        }
                        if ((hyg2 = (PowerManager)object.getSystemService("power")) == null || !hyg2.isPowerSaveMode()) break block20;
                        ((heg)((heg)c.f().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "canEnableAsrEnhancement", 556, "RecognitionDataConverter.java")).r("Device is in power save mode, skip asr enhancement.");
                    }
                    ((heg)((heg)c.h().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setAsrEnhancementConfig", 536, "RecognitionDataConverter.java")).r("aicore config disabled.");
                    return;
                }
                hyg2 = iel.a.l();
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                hwv2 = (iel)((hwp)hyg2).b;
                ((iel)hwv2).c = n2 - 1;
                ((iel)hwv2).b = 1 | ((iel)hwv2).b;
                fgt2.c(Optional.of((iel)((hwp)hyg2).o()));
            }
            return;
        }
        ((heg)((heg)c.h().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setAsrEnhancementConfig", 509, "RecognitionDataConverter.java")).r("AsrEnhancementConfig is an on-device exclusive feature.");
    }

    private final boolean c(String string, ffb ffb2) {
        fey fey2 = fey.b;
        return new hxd(((fey)Map$_EL.getOrDefault((Map)this.e.l, (Object)string, (Object)fey2)).c, fey.a).contains(ffb2);
    }

    private static boolean d(int n2) {
        return n2 == 2 || n2 == 4;
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final fgu a(fig fig2, Optional object) {
        fgt fgt2;
        block155: {
            Object object2;
            block158: {
                block157: {
                    block156: {
                        int n2;
                        int n3;
                        block154: {
                            Object object3;
                            boolean bl2;
                            Object object4;
                            block152: {
                                fgt2 = fgu.a();
                                object2 = object4 = fig2.g;
                                if (object4 == null) {
                                    object2 = fhm.a;
                                }
                                fgt2.u(Math.max(1, ((fhm)object2).c));
                                object2 = this.e;
                                fgt2.t(ffi.i(fig2.d, ((feh)object2).m));
                                object2 = object4 = fig2.b;
                                if (object4 == null) {
                                    object2 = fhi.a;
                                }
                                fgt2.K(((fhi)object2).b);
                                object2 = object4 = fig2.b;
                                if (object4 == null) {
                                    object2 = fhi.a;
                                }
                                fgt2.B(((fhi)object2).b);
                                object2 = object4 = fig2.b;
                                if (object4 == null) {
                                    object2 = fhi.a;
                                }
                                object2 = ((fhi)object2).b;
                                fgt2.r(Optional.ofNullable((idy)b.get(object2)));
                                fgt2.o(fgs.e);
                                object2 = object4 = idq.b(fig2.c);
                                if (object4 == null) {
                                    object2 = idq.a;
                                }
                                fgt2.d((idq)object2);
                                int n4 = fig2.f;
                                n2 = n3 = a.v(n4);
                                if (n3 == 0) {
                                    n2 = 1;
                                }
                                fgt2.d = n2;
                                n2 = a.v(n4);
                                bl2 = n2 != 0 && n2 == 2;
                                fgt2.D(bl2);
                                fgt2.J(5000);
                                object2 = object4 = fig2.g;
                                if (object4 == null) {
                                    object2 = fhm.a;
                                }
                                fgt2.m(((fhm)object2).d);
                                object2 = object4 = fig2.g;
                                if (object4 == null) {
                                    object2 = fhm.a;
                                }
                                fgt2.E(((fhm)object2).f);
                                object2 = object4 = fig2.g;
                                if (object4 == null) {
                                    object2 = fhm.a;
                                }
                                fgt2.y(((fhm)object2).e);
                                n2 = gzx.d;
                                fgt2.h(hct.a);
                                fgt2.j(false);
                                object2 = object4 = fig2.g;
                                if (object4 == null) {
                                    object2 = fhm.a;
                                }
                                object2 = object4 = ((fhm)object2).k;
                                if (object4 == null) {
                                    object2 = fiv.a;
                                }
                                fgt2.H(((fiv)object2).b);
                                object2 = object4 = fig2.g;
                                if (object4 == null) {
                                    object2 = fhm.a;
                                }
                                object2 = object4 = ((fhm)object2).k;
                                if (object4 == null) {
                                    object2 = fiv.a;
                                }
                                fgt2.G(((fiv)object2).c);
                                fgt2.p(hct.a);
                                object2 = object4 = fig2.g;
                                if (object4 == null) {
                                    object2 = fhm.a;
                                }
                                object2 = object4 = ((fhm)object2).h;
                                if (object4 == null) {
                                    object2 = fho.a;
                                }
                                if (((fho)object2).b) {
                                    object2 = object4 = fig2.g;
                                    if (object4 == null) {
                                        object2 = fhm.a;
                                    }
                                    object2 = object4 = ((fhm)object2).h;
                                    if (object4 == null) {
                                        object2 = fho.a;
                                    }
                                    n2 = n3 = a.w(((fho)object2).c);
                                    if (n3 == 0) {
                                        n2 = 1;
                                    }
                                    if (n2 - 1 != 0) {
                                        fgt2.k(Optional.of(iex.b));
                                    } else {
                                        fgt2.k(Optional.of(iex.a));
                                    }
                                    object2 = object4 = fig2.g;
                                    if (object4 == null) {
                                        object2 = fhm.a;
                                    }
                                    object2 = object4 = ((fhm)object2).h;
                                    if (object4 == null) {
                                        object2 = fho.a;
                                    }
                                    fgt2.q(((fho)object2).d);
                                }
                                if (!((Optional)object).isEmpty()) {
                                    block150: {
                                        block151: {
                                            object4 = fev.a();
                                            try {
                                                ((feu)object4).e(Optional.of(((ParcelFileDescriptor)((Optional)object).get()).dup()));
                                                object = object2 = fig2.g;
                                                if (object2 == null) {
                                                    object = fhm.a;
                                                }
                                                object = object2 = ((fhm)object).m;
                                                if (object2 == null) {
                                                    object = fhf.a;
                                                }
                                                n2 = n3 = ((fhf)object).c;
                                                if (n3 == 0) {
                                                    n2 = 1;
                                                }
                                                if (n2 <= 0 || n2 > 2) break block150;
                                                ((feu)object4).c(n2);
                                                object = object2 = fig2.g;
                                                if (object2 == null) {
                                                    object = fhm.a;
                                                }
                                                object = object2 = ((fhm)object).m;
                                                if (object2 == null) {
                                                    object = fhf.a;
                                                }
                                                n2 = n3 = ((fhf)object).b;
                                                if (n3 == 0) {
                                                    n2 = 16000;
                                                }
                                                if (n2 > 0) break block151;
                                            }
                                            catch (IOException iOException) {
                                                a.as(c.g().h(hfo.a, "RecognitionDataConv"), "Failed to dup the ParcelFileDescriptor.", "com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setExternalAudioSource", '\u013f', "RecognitionDataConverter.java", iOException);
                                            }
                                            ((heg)((heg)c.g().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setExternalAudioSource", 339, "RecognitionDataConverter.java")).r("Invalid value passed to AudioSourceConfig.sampling_rate; ignoring audio source");
                                            break block152;
                                        }
                                        ((feu)object4).g(n2);
                                        object = object2 = fig2.g;
                                        if (object2 == null) {
                                            object = fhm.a;
                                        }
                                        object = object2 = ((fhm)object).m;
                                        if (object2 == null) {
                                            object = fhf.a;
                                        }
                                        if ((n2 = ((fhf)object).d) <= 0) {
                                            ((heg)((heg)c.g().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setExternalAudioSource", 347, "RecognitionDataConverter.java")).r("Invalid value passed to AudioSourceConfig.encoding. Value must come from AudioFormat, ignoring audio source.");
                                            break block152;
                                        } else {
                                            ((feu)object4).d(n2);
                                            object = object2 = fig2.g;
                                            if (object2 == null) {
                                                object = fhm.a;
                                            }
                                            object = object2 = ((fhm)object).m;
                                            if (object2 == null) {
                                                object = fhf.a;
                                            }
                                            ((feu)object4).f(((fhf)object).e);
                                            fgt2.g(Optional.of(((feu)object4).a()));
                                        }
                                        break block152;
                                    }
                                    ((heg)((heg)c.g().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setExternalAudioSource", 328, "RecognitionDataConverter.java")).s("AudioSourceConfig.channel_count must be 1 or 2; passed value is %d", n2);
                                }
                            }
                            object = fig2.g;
                            object2 = object == null ? fhm.a : object;
                            if ((((fhm)object2).b & 0x10) != 0) {
                                object2 = object;
                                if (object == null) {
                                    object2 = fhm.a;
                                }
                                object = object2 = ((fhm)object2).g;
                                if (object2 == null) {
                                    object = fic.a;
                                }
                                if (((fic)object).b == 2 && (Integer)((fic)object).c > 0) {
                                    n2 = ((fic)object).b == 2 ? (Integer)((fic)object).c : 0;
                                    fgt2.v(n2);
                                    fgt2.J(0);
                                    fgt2.w(true);
                                } else if (((fic)object).b == 3 && (Integer)((fic)object).c > 0) {
                                    n2 = ((fic)object).b == 3 ? (Integer)((fic)object).c : 0;
                                    fgt2.J(n2);
                                    fgt2.w(true);
                                } else if (((fic)object).b == 1 && ((Boolean)((fic)object).c).booleanValue()) {
                                    fgt2.J(0);
                                    fgt2.w(true);
                                }
                            }
                            object = object2 = fig2.g;
                            if (object2 == null) {
                                object = fhm.a;
                            }
                            object = object2 = ((fhm)object).l;
                            if (object2 == null) {
                                object = fhl.a;
                            }
                            if (((fhl)object).b) {
                                object = object2 = fig2.b;
                                if (object2 == null) {
                                    object = fhi.a;
                                }
                                bl2 = this.c(((fhi)object).b, ffb.b);
                                n2 = a.v(fig2.f);
                                if (n2 != 0 && n2 == 3 && !bl2) {
                                    object4 = (heg)((heg)c.h().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setDiarization", 396, "RecognitionDataConverter.java");
                                    object = object2 = fig2.b;
                                    if (object2 == null) {
                                        object = fhi.a;
                                    }
                                    object4.u("Diarization is not supported for client: %s.", ((fhi)object).b);
                                } else {
                                    object4 = (hwr)iep.a.l();
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).l;
                                    if (object2 == null) {
                                        object = fhl.a;
                                    }
                                    n2 = n3 = a.w(((fhl)object).c);
                                    if (n3 == 0) {
                                        n2 = 1;
                                    }
                                    if (n2 - 1 != 0) {
                                        if (!((hwp)object4).b.B()) {
                                            ((hwp)object4).u();
                                        }
                                        object = (iep)((hwr)object4).b;
                                        ((iep)object).c = 2;
                                        ((iep)object).b |= 1;
                                    } else {
                                        if (!((hwp)object4).b.B()) {
                                            ((hwp)object4).u();
                                        }
                                        object = (iep)((hwr)object4).b;
                                        ((iep)object).c = 1;
                                        ((iep)object).b |= 1;
                                    }
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).l;
                                    if (object2 == null) {
                                        object = fhl.a;
                                    }
                                    n2 = ((fhl)object).d;
                                    if (!((hwp)object4).b.B()) {
                                        ((hwp)object4).u();
                                    }
                                    object = (iep)((hwr)object4).b;
                                    ((iep)object).b |= 4;
                                    ((iep)object).d = n2;
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).l;
                                    if (object2 == null) {
                                        object = fhl.a;
                                    }
                                    n2 = ((fhl)object).e;
                                    if (!((hwp)object4).b.B()) {
                                        ((hwp)object4).u();
                                    }
                                    object = (iep)((hwr)object4).b;
                                    ((iep)object).b |= 8;
                                    ((iep)object).e = n2;
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).l;
                                    if (object2 == null) {
                                        object = fhl.a;
                                    }
                                    n2 = n3 = a.w(((fhl)object).f);
                                    if (n3 == 0) {
                                        n2 = 1;
                                    }
                                    if (n2 - 1 != 0) {
                                        if (!((hwp)object4).b.B()) {
                                            ((hwp)object4).u();
                                        }
                                        object = (iep)((hwr)object4).b;
                                        ((iep)object).f = 2;
                                        ((iep)object).b |= 0x10;
                                    } else {
                                        if (!((hwp)object4).b.B()) {
                                            ((hwp)object4).u();
                                        }
                                        object = (iep)((hwr)object4).b;
                                        ((iep)object).f = 1;
                                        ((iep)object).b |= 0x10;
                                    }
                                    fgt2.i(Optional.of((iep)((hwp)object4).o()));
                                }
                            }
                            object = object2 = fig2.g;
                            if (object2 == null) {
                                object = fhm.a;
                            }
                            object = object2 = ((fhm)object).i;
                            if (object2 == null) {
                                object = fhu.a;
                            }
                            if (((fhu)object).b) {
                                n2 = n3 = a.v(fig2.f);
                                if (n3 == 0) {
                                    n2 = 1;
                                }
                                if (!fje.d(n2)) {
                                    ((heg)((heg)c.h().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setLangId", 433, "RecognitionDataConverter.java")).r("LangId is an on-device exclusive feature.");
                                } else {
                                    object4 = ies.a.l();
                                    if (!((hwp)object4).b.B()) {
                                        ((hwp)object4).u();
                                    }
                                    ies.c((ies)((hwp)object4).b);
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).i;
                                    if (object2 == null) {
                                        object = fhu.a;
                                    }
                                    ((hwp)object4).Q(((fhu)object).c);
                                    fgt2.s(Optional.of((ies)((hwp)object4).o()));
                                }
                            }
                            object = object2 = fig2.g;
                            if (object2 == null) {
                                object = fhm.a;
                            }
                            object = object2 = ((fhm)object).j;
                            if (object2 == null) {
                                object = fhg.a;
                            }
                            if (((fhg)object).b) {
                                n2 = n3 = a.v(fig2.f);
                                if (n3 == 0) {
                                    n2 = 1;
                                }
                                if (!fje.d(n2)) {
                                    ((heg)((heg)c.h().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setMultilang", 454, "RecognitionDataConverter.java")).r("Multilang is an on-device exclusive feature.");
                                } else {
                                    object4 = ffl.a.l();
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).j;
                                    if (object2 == null) {
                                        object = fhg.a;
                                    }
                                    n2 = n3 = a.t(((fhg)object).c);
                                    if (n3 == 0) {
                                        n2 = 1;
                                    }
                                    if (--n2 != 0) {
                                        if (n2 != 1) {
                                            if (!((hwp)object4).b.B()) {
                                                ((hwp)object4).u();
                                            }
                                            object = (ffl)((hwp)object4).b;
                                            ((ffl)object).c = 2;
                                            ((ffl)object).b |= 1;
                                        } else {
                                            if (!((hwp)object4).b.B()) {
                                                ((hwp)object4).u();
                                            }
                                            object = (ffl)((hwp)object4).b;
                                            ((ffl)object).c = 1;
                                            ((ffl)object).b |= 1;
                                        }
                                    } else {
                                        if (!((hwp)object4).b.B()) {
                                            ((hwp)object4).u();
                                        }
                                        object = (ffl)((hwp)object4).b;
                                        ((ffl)object).c = 0;
                                        ((ffl)object).b |= 1;
                                    }
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).j;
                                    if (object2 == null) {
                                        object = fhg.a;
                                    }
                                    object = object2 = ((fhg)object).e;
                                    if (object2 == null) {
                                        object = fiu.a;
                                    }
                                    n2 = n3 = a.w(((fiu)object).d);
                                    if (n3 == 0) {
                                        n2 = 1;
                                    }
                                    if (n2 - 1 != 0) {
                                        if (!((hwp)object4).b.B()) {
                                            ((hwp)object4).u();
                                        }
                                        object = (ffl)((hwp)object4).b;
                                        ((ffl)object).g = 1;
                                        ((ffl)object).b |= 8;
                                    } else {
                                        if (!((hwp)object4).b.B()) {
                                            ((hwp)object4).u();
                                        }
                                        object = (ffl)((hwp)object4).b;
                                        ((ffl)object).g = 0;
                                        ((ffl)object).b |= 8;
                                    }
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).j;
                                    if (object2 == null) {
                                        object = fhg.a;
                                    }
                                    ((hwp)object4).K(((fhg)object).d);
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).j;
                                    if (object2 == null) {
                                        object = fhg.a;
                                    }
                                    object = object2 = ((fhg)object).e;
                                    if (object2 == null) {
                                        object = fiu.a;
                                    }
                                    n2 = ((fiu)object).b;
                                    if (!((hwp)object4).b.B()) {
                                        ((hwp)object4).u();
                                    }
                                    object3 = ((hwp)object4).b;
                                    object = (ffl)object3;
                                    ((ffl)object).b |= 2;
                                    ((ffl)object).e = n2;
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).j;
                                    if (object2 == null) {
                                        object = fhg.a;
                                    }
                                    object = object2 = ((fhg)object).e;
                                    if (object2 == null) {
                                        object = fiu.a;
                                    }
                                    n2 = ((fiu)object).c;
                                    if (!((hwv)object3).B()) {
                                        ((hwp)object4).u();
                                    }
                                    object3 = ((hwp)object4).b;
                                    object = (ffl)object3;
                                    ((ffl)object).b |= 4;
                                    ((ffl)object).f = n2;
                                    object = object2 = fig2.g;
                                    if (object2 == null) {
                                        object = fhm.a;
                                    }
                                    object = object2 = ((fhm)object).j;
                                    if (object2 == null) {
                                        object = fhg.a;
                                    }
                                    bl2 = ((fhg)object).f;
                                    if (!((hwv)object3).B()) {
                                        ((hwp)object4).u();
                                    }
                                    object = (ffl)((hwp)object4).b;
                                    ((ffl)object).b |= 0x10;
                                    ((ffl)object).h = bl2;
                                    fgt2.x(Optional.of((ffl)((hwp)object4).o()));
                                }
                            }
                            object = object2 = fig2.g;
                            if (object2 == null) {
                                object = fhm.a;
                            }
                            object2 = fhj.d;
                            ((hws)object).h((gpm)object2);
                            if (((hws)object).r.o((hwu)((gpm)object2).a)) {
                                object = object2 = fig2.g;
                                if (object2 == null) {
                                    object = fhm.a;
                                }
                                object2 = fhj.d;
                                ((hws)object).h((gpm)object2);
                                object = ((hws)object).r.l((hwu)((gpm)object2).a);
                                object = object == null ? ((gpm)object2).d : ((gpm)object2).k(object);
                                object3 = (fhj)object;
                                if (((fhj)object3).b) {
                                    object = idd.a.l();
                                    bl2 = ((fhj)object3).b;
                                    if (!((hwp)object).b.B()) {
                                        ((hwp)object).u();
                                    }
                                    object4 = ((hwp)object).b;
                                    object2 = (idd)object4;
                                    ((idd)object2).b |= 1;
                                    ((idd)object2).c = bl2;
                                    long l2 = ((fhj)object3).c;
                                    if (!((hwv)object4).B()) {
                                        ((hwp)object).u();
                                    }
                                    object2 = (idd)((hwp)object).b;
                                    ((idd)object2).b |= 0x200;
                                    ((idd)object2).d = l2;
                                    fgt2.I(Optional.of((idd)((hwp)object).o()));
                                }
                            }
                            this.b(fgt2, fig2);
                            object = object2 = fig2.g;
                            if (object2 == null) {
                                object = fhm.a;
                            }
                            object = object2 = ((fhm)object).p;
                            if (object2 == null) {
                                object = fhh.a;
                            }
                            fgt2.h(gzx.o(((fhh)object).d));
                            object = fig2.g;
                            object2 = object == null ? fhm.a : object;
                            object2 = object4 = ((fhm)object2).p;
                            if (object4 == null) {
                                object2 = fhh.a;
                            }
                            if ((((fhh)object2).b & 1) != 0) {
                                object2 = object;
                                if (object == null) {
                                    object2 = fhm.a;
                                }
                                object = object2 = ((fhm)object2).p;
                                if (object2 == null) {
                                    object = fhh.a;
                                }
                                object = object2 = ((fhh)object).c;
                                if (object2 == null) {
                                    object = ihi.a;
                                }
                                fgt2.A(Optional.of(object));
                            }
                            object = object2 = fig2.g;
                            if (object2 == null) {
                                object = fhm.a;
                            }
                            object = object2 = ((fhm)object).p;
                            if (object2 == null) {
                                object = fhh.a;
                            }
                            object = object2 = ((fhh)object).e;
                            if (object2 == null) {
                                object = fid.a;
                            }
                            if ((((fid)object).b & 1) != 0 || ((fid)object).e.size() != 0 || (((fid)object).b & 2) != 0) {
                                object2 = bqt.a.l();
                                String string = ((fid)object).c;
                                if (!((hwp)object2).b.B()) {
                                    ((hwp)object2).u();
                                }
                                object4 = ((hwp)object2).b;
                                object3 = (bqt)object4;
                                string.getClass();
                                ((bqt)object3).b |= 1;
                                ((bqt)object3).c = string;
                                object3 = ((fid)object).d;
                                if (!((hwv)object4).B()) {
                                    ((hwp)object2).u();
                                }
                                object4 = (bqt)((hwp)object2).b;
                                object3.getClass();
                                ((bqt)object4).b = 2 | ((bqt)object4).b;
                                ((bqt)object4).d = object3;
                                fgt2.C(Optional.of((bqt)((hwp)object2).o()));
                                fgt2.p(gzx.o(((fid)object).e));
                            }
                            object2 = (object = fig2.g) == null ? fhm.a : object;
                            if ((((fhm)object2).b & 0x20000) != 0) break block154;
                            object2 = object == null ? fhm.a : object;
                            if (!((fhm)object2).n) break block155;
                        }
                        n2 = n3 = a.v(fig2.f);
                        if (n3 == 0) {
                            n2 = 1;
                        }
                        if (fje.d(n2)) break block156;
                        ((heg)((heg)c.h().h(hfo.a, "RecognitionDataConv")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/RecognitionDataConverter", "setSodaManagementConfig", 585, "RecognitionDataConverter.java")).r("SodaManagementConfig is an on-device exclusive feature.");
                        break block155;
                    }
                    if (object == null) {
                        object = fhm.a;
                        object2 = null;
                    } else {
                        object2 = object;
                    }
                    if (((fhm)object).n) break block157;
                    object = object2;
                    if (object2 == null) {
                        object = fhm.a;
                    }
                    object = object2 = ((fhm)object).q;
                    if (object2 == null) {
                        object = fit.a;
                    }
                    if (!((fit)object).b) break block158;
                }
                fgt2.F(true);
            }
            object = object2 = fig2.g;
            if (object2 == null) {
                object = fhm.a;
            }
            object = object2 = ((fhm)object).q;
            if (object2 == null) {
                object = fit.a;
            }
            if (((fit)object).c) {
                fgt2.n(true);
            }
        }
        fgt2.b(gzx.o(fig2.e));
        return fgt2.a();
    }
}

