/*
 * Decompiled with CFR 0.152.
 */
public final class enk
implements enh {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider");
    public final eip b;
    private final eae c;
    private final gto d;
    private final Object e;
    private final dtu f;

    public enk(eip eip2, eae eae2, dtu dtu2, gto gto2) {
        jse.e(eae2, "audioParams");
        jse.e(gto2, "playbackServiceStubOptional");
        this.b = eip2;
        this.c = eae2;
        this.f = dtu2;
        this.d = gto2;
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
            Object object2 = this.c;
            if (!((eae)object2).k) {
                return null;
            }
            if (!((eae)object2).m) {
                ((heg)a.g().h(hfo.a, "ALT.PlaybackLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListening", 44, "PlaybackLoopbackAudioProvider.kt")).r("#audio# Only push mechanism is supported for loopback audio.");
                return null;
            }
            if ((esd)this.d.f() == null) {
                ((heg)a.g().h(hfo.a, "ALT.PlaybackLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListening", 51, "PlaybackLoopbackAudioProvider.kt")).r("#audio# no playback service found, check modules setup");
                return null;
            }
            object2 = a;
            ((heg)((hdz)object2).f().h(hfo.a, "ALT.PlaybackLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListening", 59, "PlaybackLoopbackAudioProvider.kt")).u("#audio# Starting listening to the loopback audio for %s.", crh.O(this.b));
            dtu.f(this.f, this.c, jpa.a, 2);
            hwp hwp2 = esc.a.l();
            jse.e(hwp2, "builder");
            eip eip2 = this.b;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv hwv2 = (esc)hwp2.b;
            ((esc)hwv2).c = eip2;
            ((esc)hwv2).b |= 1;
            hwv2 = this.c;
            jse.e(hwv2, "value");
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            esc esc2 = (esc)hwp2.b;
            hwv2.getClass();
            esc2.d = hwv2;
            esc2.b |= 2;
            hwv hwv3 = hwp2.o();
            jse.d(hwv3, "build(...)");
            esc esc3 = (esc)hwv3;
            ((heg)((hdz)object2).f().h(hfo.a, "ALT.PlaybackLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "startListening", 71, "PlaybackLoopbackAudioProvider.kt")).u("#audio# Started listening to the loopback audio for %s.", crh.O(this.b));
            throw null;
        }
    }

    @Override
    public final void b() {
        Object object = this.e;
        synchronized (object) {
            ((heg)a.f().h(hfo.a, "ALT.PlaybackLpbkPrvdr").j("com/google/android/libraries/search/audio/loopback/impl/PlaybackLoopbackAudioProvider", "stopListening", 104, "PlaybackLoopbackAudioProvider.kt")).u("#audio# Stop called for %s.", crh.O(this.b));
            return;
        }
    }
}

