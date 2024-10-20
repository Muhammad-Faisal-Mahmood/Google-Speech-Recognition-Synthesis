/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eev
implements eeq {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor");
    public static final Duration b;
    public static final Duration c;
    public static final Duration d;
    public static final eeu e;
    public final eae f;
    public final String g;
    public final AtomicBoolean h;
    public int i;
    public long j;
    public long k;
    public final jur l;
    private final Executor m;
    private final eeu n;
    private final cxt o;

    static {
        Duration duration = Duration.ofSeconds(5L);
        jse.d(duration, "ofSeconds(...)");
        b = duration;
        duration = Duration.ofMillis(500L);
        jse.d(duration, "ofMillis(...)");
        c = duration;
        duration = Duration.ofMillis(10L);
        jse.d(duration, "ofMillis(...)");
        d = duration;
        e = new eet();
    }

    public eev(eae object, Executor executor) {
        this.f = object;
        this.m = executor;
        this.g = object = crh.K(this);
        ((heg)a.f().j("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "<init>", 49, "AudioStartTimeProcessor.kt")).u("#audio# loading processor(%s)", object);
        this.o = new cxt(null, null);
        this.h = new AtomicBoolean(false);
        this.l = new jur();
        this.n = new ees(this);
        this.j = Long.MIN_VALUE;
        this.k = Long.MIN_VALUE;
    }

    public static final boolean f(long l2) {
        return l2 == Long.MIN_VALUE;
    }

    @Override
    public final /* synthetic */ eep a() {
        return this.n;
    }

    @Override
    public final void b() {
        bdr bdr2 = new bdr(this, 11);
        Executor executor = this.m;
        jse.d(this.o.E(bdr2, executor), "submit(...)");
    }

    @Override
    public final int c(byte[] byArray, int n2) {
        if (n2 <= byArray.length) {
            if (!this.h.get() && !this.l.bH()) {
                jse.d(this.o.E(new eer(this, cgw.o(), n2), this.m), "submit(...)");
                return 1;
            }
            return 2;
        }
        throw new IllegalStateException("Incorrect processing range");
    }

    public final void d(ews object) {
        if (this.l.bH()) {
            return;
        }
        Object object2 = a;
        ((heg)((hdz)object2).f().h(hfo.a, "ALT.ProcStartTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "completeAudioStartTimeResult", 184, "AudioStartTimeProcessor.kt")).C("#audio# processor(%s) is being completed(%s)", this.g, ((Enum)object).name());
        long l2 = !eev.f(this.j) ? cgw.o() - this.j : 0L;
        if (eev.f(this.k)) {
            ((heg)((hdz)object2).h().h(hfo.a, "ALT.ProcStartTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "completeAudioStartTimeResult", 193, "AudioStartTimeProcessor.kt")).u("#audio# processor(%s) mark audio start time empty", this.g);
            object2 = doc.m((hwr)eaf.a.l()).n();
        } else {
            long l3 = ekn.c(this.i, this.f);
            long l4 = this.k - l3;
            ((heg)((hdz)object2).f().h(hfo.a, "ALT.ProcStartTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/AudioStartTimeProcessor", "completeAudioStartTimeResult", 200, "AudioStartTimeProcessor.kt")).H("#audio# processor(%s) done, processed(%dns), spent(%dns), deviation(%dns)", this.g, l3, l2, l4 - this.j);
            object2 = doc.m((hwr)eaf.a.l());
            ((bzb)object2).o(l4);
            object2 = ((bzb)object2).n();
        }
        Object object3 = (hwp)((hwv)object2).C(5);
        ((hwp)object3).x((hwv)object2);
        object2 = doc.m((hwr)object3);
        object3 = ewt.a;
        jse.d(object3, "metrics");
        hwp hwp2 = ewr.a.l();
        jse.e(hwp2, "builder");
        jse.e(object, "value");
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        ewr ewr2 = (ewr)hwv2;
        ewr2.c = ((ews)object).g;
        ewr2.b |= 1;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object = (ewr)hwp2.b;
        ((ewr)object).b |= 2;
        ((ewr)object).d = l2;
        object = hwp2.o();
        jse.d(object, "build(...)");
        object = (ewr)object;
        jse.e(object3, "extension");
        jse.e(object, "value");
        ((hwr)((bzb)object2).a).aH((gpm)object3, object);
        object = ((bzb)object2).n();
        this.l.O(object);
    }

    public final void e(long l2, int n2) {
        if (n2 <= 0) {
            return;
        }
        this.k = l2;
        this.i += n2;
    }
}

