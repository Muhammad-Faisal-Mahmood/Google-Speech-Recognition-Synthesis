/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class flr {
    public static final Duration a = Duration.ofDays(90L);
    public static final hei b = hei.m("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService");
    public final hpr c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final AtomicLong e = new AtomicLong(0L);
    public final feh f;
    public final frr g;
    public final fxf h;
    public final fhq i;
    public final gpm j;
    public final cgw k;
    public final cya l;
    public final cxt m;
    private final bmu n;

    public flr(cya cya2, feh feh2, fxf fxf2, bmu bmu2, gpm gpm2, fhq fhq2, hpr hpr2, frr frr2, cxt cxt2, cgw cgw2) {
        this.l = cya2;
        this.f = feh2;
        this.h = fxf2;
        this.n = bmu2;
        this.j = gpm2;
        this.i = fhq2;
        this.c = hpr2;
        this.g = frr2;
        this.m = cxt2;
        this.k = cgw2;
    }

    public final void a(fdl object) {
        if (object != null) {
            ((heg)((heg)b.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService", "cancelRecognition", 344, "VoiceInputMethodDataService.java")).r("#cancelRecognition");
            object = (hth)this.d.get(((fdl)object).c);
            if (object != null) {
                ((ffv)((hth)object).a).a();
            }
        }
    }

    public final void b(fdl fdl2) {
        if (fdl2 == null) {
            return;
        }
        ((heg)((heg)b.f()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService", "finishRecognition", 355, "VoiceInputMethodDataService.java")).r("#finishRecognition");
        this.a(fdl2);
        this.d.remove(fdl2.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(String string, gte object) {
        // MONITORENTER : this
        Object object2 = (hth)this.d.get(string);
        if (object2 == null) {
            // MONITOREXIT : this
            return;
        }
        Object object3 = ((hth)object2).b;
        object = (fhd)object.apply(object3);
        ConcurrentHashMap concurrentHashMap = this.d;
        hth hth2 = new hth(object, ((hth)object2).a);
        concurrentHashMap.put(string, hth2);
        // MONITOREXIT : this
        if (object.equals(object3)) return;
        object2 = this.n;
        string = String.valueOf(string);
        ((bmu)object2).P(hhk.K(null), "VoiceIME:transcriptionState:".concat(string));
        ((heg)((heg)b.c()).j("com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService", "updateTranscriptionState", 325, "VoiceInputMethodDataService.java")).u("updated TranscriptionState: %s", object);
    }
}

