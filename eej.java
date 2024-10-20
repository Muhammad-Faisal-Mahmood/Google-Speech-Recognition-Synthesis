/*
 * Decompiled with CFR 0.152.
 */
import j$.time.Duration;
import java.util.ArrayList;

public final class eej
implements eee {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithTimestamps");
    public static final eaf b = doc.m((hwr)eaf.a.l()).n();
    public final Duration c;
    public final hpn d;
    public jvi e;
    private final eae f;
    private final eee g;
    private final jvb h;
    private final ArrayList i;

    public eej(hpn hpn2, eae eae2, eee eee2, Duration duration, jvb jvb2) {
        this.f = eae2;
        this.g = eee2;
        this.c = duration;
        this.h = jvb2;
        if (!duration.isNegative()) {
            this.i = new ArrayList();
            hpn2 = hhk.L(hpn2);
            jse.d(hpn2, "nonCancellationPropagating(...)");
            this.d = hpn2;
            return;
        }
        throw new IllegalArgumentException("Timestamp await timeout cannot be negative");
    }

    private final dzn c(dzn dzn2) {
        Object object = this.e;
        object = object != null ? (eaf)object.bE() : null;
        if (object != null) {
            Object object2 = dzn2;
            if ((((eaf)object).b & 1) != 0) {
                int n2 = dzn2.b;
                object2 = dzn2;
                if ((n2 & 4) != 0) {
                    if ((n2 & 2) != 0) {
                        object2 = dzn2;
                    } else {
                        object2 = dzn2;
                        if (dzn2.c != 2) {
                            object2 = (hwp)dzn2.C(5);
                            ((hwp)object2).x(dzn2);
                            object2 = dox.g((hwp)object2);
                            ((cxt)object2).h(((eaf)object).c + ekn.c(dzn2.g, this.f));
                            object2 = ((cxt)object2).e();
                        }
                    }
                }
            }
            return object2;
        }
        throw new IllegalStateException("Start time must be determined before delegating");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            boolean bl2 = this.i.isEmpty();
            if (bl2) {
                return;
            }
            Object object = this.i.iterator();
            jse.d(object, "iterator(...)");
            while (true) {
                if (!object.hasNext()) {
                    object = this.i;
                    ((ArrayList)object).clear();
                    ((ArrayList)object).trimToSize();
                    return;
                }
                Object object2 = object.next();
                jse.d(object2, "next(...)");
                object2 = (dzn)object2;
                this.g.b(this.c((dzn)object2));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(dzn object) {
        synchronized (this) {
            jse.e(object, "audioData");
            Object object2 = this.e;
            if (object2 != null && object2.bH()) {
                this.a();
                this.g.b(this.c((dzn)object));
                return;
            }
            this.i.add(object);
            if (this.e == null) {
                if (this.d.isDone()) {
                    object = jsl.o(hhk.S(this.d));
                } else if (this.c.isZero()) {
                    object = jsl.o(b);
                } else if ((((dzn)object).b & 2) != 0) {
                    ((heg)a.f().h(hfo.a, "ALT.ReceiverTimestamp").j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithTimestamps", "computeDeferredStartTime", 98, "AudioBytesReceiverWithTimestamps.kt")).r("#audio# using already provided timestamps");
                    object = jsl.o(b);
                } else {
                    ((heg)a.f().h(hfo.a, "ALT.ReceiverTimestamp").j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverWithTimestamps", "computeDeferredStartTime", 101, "AudioBytesReceiverWithTimestamps.kt")).u("#audio# waiting(%s) for audio start time", this.c);
                    object = this.h;
                    object2 = new aus(this, null, 8, null);
                    object = jse.ag((jvb)object, (jro)object2);
                }
                this.e = object;
                if (object != null) {
                    object2 = new mz(this, 7);
                    object.w((jrk)object2);
                    return;
                }
            }
            return;
        }
    }
}

