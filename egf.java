/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.media.AudioRecord
 *  android.media.audiofx.AcousticEchoCanceler
 *  android.media.audiofx.NoiseSuppressor
 */
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class egf
implements efo {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource");
    private static final List b = jns.f(ebs.q, ebs.C, ebs.D);
    private final efx c;
    private final gto d;
    private final emm e;
    private final Context f;
    private final gto g;
    private final gto h;
    private final gto i;
    private final gto j;
    private final gto k;
    private final edh l;
    private final egi m;
    private final eae n;
    private final String o;
    private AudioRecord p;
    private gto q;
    private gto r;
    private final efu s;
    private final egl t;
    private final dpq u;
    private final czh v;
    private final cxt w;
    private final dml x;

    public egf(efx object, gto object2, emm emm2, Context context, dpq dpq2, dml dml2, cxt cxt2, efu efu2, gto gto2, gto gto3, gto gto4, gto gto5, gto gto6, edh edh2, egi egi2, czh czh2) {
        this.c = object;
        this.d = object2;
        this.e = emm2;
        this.f = context;
        this.u = dpq2;
        this.x = dml2;
        this.w = cxt2;
        this.s = efu2;
        this.g = gto2;
        this.h = gto3;
        this.i = gto4;
        this.j = gto5;
        this.k = gto6;
        this.l = edh2;
        this.m = egi2;
        this.v = czh2;
        object = object2 = ((efx)object).e;
        if (object2 == null) {
            object = eae.a;
        }
        jse.d(object, "getAudioLibInputParams(...)");
        this.n = object;
        this.o = crh.K(this);
        this.q = object = gsl.a;
        this.r = object;
        this.t = new egl();
    }

    private final elx d(Throwable object) {
        if (object instanceof elx) {
            return (elx)object;
        }
        object = this.f.getSystemService("audio");
        jse.c(object, "null cannot be cast to non-null type android.media.AudioManager");
        int n2 = ((AudioManager)object).getMode();
        object = n2 != 2 && n2 != 3 ? new elx("#createAudioRecord failed: audio record startRecording error.", elb.e(ebs.s)) : new elx("#createAudioRecord failed: microphone in call mode.", elb.e(ebs.r));
        return object;
    }

    private static final efx e(efx object, edi object2) {
        if (object2 != null) {
            int n2 = ((edi)object2).a;
            int n3 = Integer.bitCount(n2);
            eae eae2 = ((efx)object).e;
            object2 = eae2;
            if (eae2 == null) {
                object2 = eae.a;
            }
            if (n3 == Integer.bitCount(((eae)object2).e)) {
                object2 = (hwp)((hwv)object).C(5);
                ((hwp)object2).x((hwv)object);
                object = dww.m((hwp)object2);
                ((cxt)object).p(n2);
                return ((cxt)object).n();
            }
            throw new elx("#createAudioRecord failed: # of ch mismatch (wrong use of AEC checker?).", elb.e(ebs.T));
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final ebq a() {
        synchronized (this) {
            this.t.d();
            Object object = this.p;
            if (object == null) {
                ((heg)a.h().h(hfo.a, "ALT.AudioRecordSource").j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "closeAudioSource", 217, "AudioRecordAudioSource.kt")).u("#audio# close audio source(%s) failed: no audio record", this.o);
                object = elb.c(ebp.g);
                jse.d(object, "createAudioSourceClosingStatus(...)");
                return object;
            }
            int n2 = object.getAudioSessionId();
            ((heg)a.f().h(hfo.a, "ALT.AudioRecordSource").j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "closeAudioSource", 221, "AudioRecordAudioSource.kt")).A("#audio# close audio source(identity(%s), recordId(%d))", this.o, n2);
            try {
                object.stop();
                this.w.q(n2, efw.c);
            }
            catch (Throwable throwable) {
                ((heg)((heg)a.h().h(hfo.a, "ALT.AudioRecordSource")).i(throwable).j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "closeAudioSource", 229, "AudioRecordAudioSource.kt")).u("#audio# close audio source(%s) failed: audio record error", this.o);
                this.w.q(n2, efw.e);
                ebq ebq2 = elb.c(ebp.y);
                jse.d(ebq2, "createAudioSourceClosingStatus(...)");
                return ebq2;
            }
            NoiseSuppressor noiseSuppressor = (NoiseSuppressor)this.q.f();
            if (noiseSuppressor != null) {
                noiseSuppressor.release();
            }
            if ((noiseSuppressor = (AcousticEchoCanceler)this.r.f()) != null) {
                noiseSuppressor.release();
            }
            object.release();
            object = elb.d(ebr.b);
            jse.d(object, "createAudioSourceClosingStatus(...)");
            return object;
        }
    }

    @Override
    public final efq b() {
        return this.t;
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final gto c() {
        synchronized (this) {
            int n2;
            Object object6;
            Object object2;
            block63: {
                block62: {
                    Object object3;
                    block61: {
                        Object object42;
                        block60: {
                            block59: {
                                block58: {
                                    block57: {
                                        block55: {
                                            ((heg)a.f().h(hfo.a, "ALT.AudioRecordSource").j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "openAudioSource", 124, "AudioRecordAudioSource.kt")).u("#audio# open audio source(%s)", this.o);
                                            object2 = this.l.a(this.n);
                                            try {
                                                object6 = this.c;
                                                n2 = object6.b;
                                                if ((n2 & 2) != 0) {
                                                    object6 = this.i;
                                                    if (!object6.g()) {
                                                        object6 = new elx("#createAudioRecord failed: missing DSP mic impl (system module missing?).", elb.e(ebs.M));
                                                        throw object6;
                                                    }
                                                    object6 = ((efu)object6.c()).a(this.c);
                                                    this.t.e(efs.e);
                                                    break block55;
                                                }
                                                boolean bl2 = object6.g;
                                                if (bl2) {
                                                    try {
                                                        object6 = this.g;
                                                        if (!object6.g()) {
                                                            object6 = new elx("#createAudioRecord failed: missing zero latency mic impl (system module missing?).", elb.e(ebs.G));
                                                            throw object6;
                                                        }
                                                        object6 = ((efu)object6.c()).a(this.c);
                                                        this.t.e(efs.c);
                                                        this.v.z(this.e, null);
                                                    }
                                                    catch (elx elx2) {
                                                        czh czh2 = this.v;
                                                        Object object5 = this.e;
                                                        object6 = elx2.a;
                                                        if (object6.b == 2) {
                                                            object3 = ebs.b((Integer)object6.c);
                                                            object6 = object3;
                                                            if (object3 == null) {
                                                                object6 = ebs.a;
                                                            }
                                                        } else {
                                                            object6 = ebs.a;
                                                        }
                                                        czh2.z((emm)object5, (ebs)object6);
                                                        object5 = b;
                                                        object6 = elx2.a;
                                                        if (object6.b == 2) {
                                                            object3 = ebs.b((Integer)object6.c);
                                                            object6 = object3;
                                                            if (object3 == null) {
                                                                object6 = ebs.a;
                                                            }
                                                        } else {
                                                            object6 = ebs.a;
                                                        }
                                                        if (!object5.contains(object6)) {
                                                            throw elx2;
                                                        }
                                                        ((heg)((heg)a.h().h(hfo.a, "ALT.AudioRecordSource")).i(elx2).j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "createZlmAudioRecordOrMaybeFallback", 200, "AudioRecordAudioSource.kt")).r("#audio# Failed to open zlmAudioRecord. Fallback to non-zlm AudioRecord");
                                                        object6 = this.s.a(this.c);
                                                        this.t.e(efs.b);
                                                    }
                                                    break block55;
                                                }
                                                if (object6.h) {
                                                    object6 = this.g;
                                                    if (!object6.g()) {
                                                        object6 = new elx("#createAudioRecord failed: missing Voice Dsp Hotword impl (system module missing?).", elb.e(ebs.R));
                                                        throw object6;
                                                    }
                                                    object6 = ((efu)object6.c()).a(this.c);
                                                    this.t.e(efs.k);
                                                    break block55;
                                                }
                                                if ((n2 & 0x10) != 0) {
                                                    object6 = this.h;
                                                    if (!object6.g()) {
                                                        object6 = new elx("#createAudioRecord failed: missing media sync mic impl (system module missing?).", elb.e(ebs.H));
                                                        throw object6;
                                                    }
                                                    object6 = ((efu)object6.c()).a(this.c);
                                                    this.t.e(efs.d);
                                                    break block55;
                                                }
                                                object3 = object6.e;
                                                object6 = object3;
                                                if (object3 == null) {
                                                    object6 = eae.a;
                                                }
                                                if (object6.c == 1999) {
                                                    object6 = this.j;
                                                    if (!object6.g()) {
                                                        object6 = new elx("#createAudioRecord failed: missing Hotword mic impl (system module missing?).", elb.e(ebs.U));
                                                        throw object6;
                                                    }
                                                    object3 = ((efu)object6.c()).a(egf.e(this.c, (edi)object2));
                                                    if (object2 != null) {
                                                        object6 = ((edi)object2).d;
                                                    } else {
                                                        object2 = null;
                                                        object6 = null;
                                                    }
                                                    egi.a((AudioRecord)object3, object6, ebs.T);
                                                    this.t.e(efs.m);
                                                    object6 = object3;
                                                    break block55;
                                                }
                                                object42 = this.c;
                                                object3 = ((efx)object42).e;
                                                object6 = object3;
                                                if (object3 == null) {
                                                    object6 = eae.a;
                                                }
                                                if (object6.c == 1997) {
                                                    object6 = this.k;
                                                    if (!object6.g()) {
                                                        object6 = new elx("#createAudioRecord failed: missing echo reference impl (system module missing?).", elb.e(ebs.W));
                                                        throw object6;
                                                    }
                                                    object6 = ((efu)object6.c()).a(this.c);
                                                    this.t.e(efs.n);
                                                    break block55;
                                                }
                                                object3 = this.s.a(egf.e((efx)object42, (edi)object2));
                                                if (object2 != null) {
                                                    object6 = ((edi)object2).d;
                                                } else {
                                                    object2 = null;
                                                    object6 = null;
                                                }
                                                egi.a((AudioRecord)object3, object6, ebs.T);
                                                object6 = this.m;
                                                int n3 = this.c.k;
                                                jse.e(object3, "audioRecord");
                                                if (n3 > 0) {
                                                    ArrayList<Object> arrayList;
                                                    block56: {
                                                        object6 = object6.b.getDevices(1);
                                                        arrayList = (heg)egi.a.f().h(hfo.a, "ALT.PreferredDevice").j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordPreferredDevice", "maybeOverwritePreferredDevice", 58, "AudioRecordPreferredDevice.kt");
                                                        jse.b(object6);
                                                        int n4 = ((AudioDeviceInfo[])object6).length;
                                                        object42 = new ArrayList(n4);
                                                        for (n2 = 0; n2 < n4; ++n2) {
                                                            object42.add(object6[n2].getType());
                                                        }
                                                        arrayList.x("#audio# using device type %d, found: %s", n3, object42);
                                                        arrayList = new ArrayList<Object>();
                                                        for (Object object42 : object6) {
                                                            if (object42.getType() != n3) continue;
                                                            arrayList.add(object42);
                                                        }
                                                        for (Object object6 : arrayList) {
                                                            AudioDeviceInfo audioDeviceInfo = object6;
                                                            if (n3 != 15 || !jse.i(fs$$ExternalSyntheticApiModelOutline0.m(audioDeviceInfo), "bottom")) continue;
                                                            break block56;
                                                        }
                                                        object6 = null;
                                                    }
                                                    object42 = object6;
                                                    object6 = object42;
                                                    if (object42 == null) {
                                                        object6 = (AudioDeviceInfo)jns.l(arrayList);
                                                    }
                                                    if (object6 == null) {
                                                        ((heg)egi.a.f().h(hfo.a, "ALT.PreferredDevice").j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordPreferredDevice", "maybeOverwritePreferredDevice", 67, "AudioRecordPreferredDevice.kt")).r("#audio# did not find preferred device, skipping...");
                                                    } else {
                                                        object3.setPreferredDevice(object6);
                                                    }
                                                }
                                                this.t.e(efs.b);
                                                object6 = object3;
                                            }
                                            catch (Throwable throwable) {
                                                this.t.d();
                                                throw this.d(throwable);
                                            }
                                        }
                                        this.p = object6;
                                        object3 = this.n;
                                        if ((((eae)object3).b & 0x20) == 0) break block57;
                                        object3 = object42 = ((eae)object3).h;
                                        if (object42 == null) {
                                            object3 = eac.a;
                                        }
                                        if (((eac)object3).c) break block58;
                                    }
                                    if (object2 == null) break block59;
                                    object3 = object2;
                                    if (!((edi)object2).c) break block60;
                                }
                                object3 = new bpf(15);
                                this.q = ega.a((AudioRecord)object6, (Function)object3);
                                object3 = object2;
                                break block60;
                            }
                            object3 = null;
                        }
                        object2 = this.n;
                        if ((((eae)object2).b & 0x20) == 0) break block61;
                        object2 = object42 = ((eae)object2).h;
                        if (object42 == null) {
                            object2 = eac.a;
                        }
                        if (((eac)object2).d) break block62;
                    }
                    if (object3 == null || !((edi)object3).b) break block63;
                }
                object2 = new bpf(16);
                this.r = ega.a((AudioRecord)object6, (Function)object2);
            }
            this.t.c(object6.getAudioSessionId());
            n2 = object6.getAudioSessionId();
            if (this.n.c != 1999) {
                this.x.n(n2);
            }
            n2 = object6.getAudioSessionId();
            object2 = a;
            ((heg)((hdz)object2).f().h(hfo.a, "ALT.AudioRecordSource").j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "openAudioSourceInternal", 243, "AudioRecordAudioSource.kt")).A("#audio# create stream of audio record source(identity(%s), recordId(%d))", this.o, n2);
            try {
                object6.startRecording();
                this.w.q(n2, efw.b);
            }
            catch (Throwable throwable) {
                ((heg)((heg)a.h().h(hfo.a, "ALT.AudioRecordSource")).i(throwable).j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "openAudioSourceInternal", 251, "AudioRecordAudioSource.kt")).r("#audio# open audio source failed: audio record startRecording error.");
                this.w.q(n2, efw.d);
                throw this.d(throwable);
            }
            if (object6.getRecordingState() == 3) {
                return gto.h(this.u.c((AudioRecord)object6, this.c, this.d, (efs)hhk.S(this.t.a)));
            }
            object6 = this.d(null);
            ((heg)((heg)((hdz)object2).h().h(hfo.a, "ALT.AudioRecordSource")).i((Throwable)object6).j("com/google/android/libraries/search/audio/audiosource/impl/AudioRecordAudioSource", "openAudioSourceInternal", 261, "AudioRecordAudioSource.kt")).r("#audio# open audio source failed: audio record recordingState error.");
            throw object6;
        }
    }
}

