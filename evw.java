/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;

public final class evw {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/store/memory/SingleAudioRecordStore");
    public static final Duration b;
    public final hpr c;
    public final juc d;
    public final dtu e;
    public final dtu f;
    private final jvb g;

    static {
        Duration duration = Duration.ofMinutes(5L);
        jse.d(duration, "ofMinutes(...)");
        b = duration;
    }

    public evw(dtu dtu2, jvb jvb2, hpr hpr2) {
        jse.e(dtu2, "tokenGenerator");
        jse.e(jvb2, "lightweightScope");
        jse.e(hpr2, "audioTimeoutExecutorService");
        this.e = dtu2;
        this.g = jvb2;
        this.c = hpr2;
        this.d = new juc(null, jud.a);
        this.f = cqq.av(jvb2);
    }
}

