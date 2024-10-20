/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

public final class efa
implements eeq {
    private static final hei b = hei.m("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor");
    public final jur a;
    private final eae c;
    private final AtomicBoolean d;
    private final eez e;

    public efa(eae eae2) {
        this.c = eae2;
        ((heg)b.f().j("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor", "<init>", 33, "FirstByteReadProcessor.kt")).u("#audio# loading processor(%s)", crh.K(this));
        this.d = new AtomicBoolean(false);
        this.a = new jur();
        this.e = new efc(this, 1);
    }

    @Override
    public final /* synthetic */ eep a() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        synchronized (this) {
            if (!this.d.getAndSet(true)) {
                hei hei2 = b;
                ((heg)hei2.f().h(hfo.a, "ALT.ProcFirstByteTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor", "close", 72, "FirstByteReadProcessor.kt")).u("#audio# close processor (%s)", crh.K(this));
                if (!this.a.bH()) {
                    ((heg)hei2.f().h(hfo.a, "ALT.ProcFirstByteTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor", "close", 74, "FirstByteReadProcessor.kt")).r("#audio# mark first byte read result as non-determined");
                    this.a.O(dox.j(eag.a.l()).r());
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
    @Override
    public final int c(byte[] object, int n2) {
        synchronized (this) {
            if (!this.d.get() && !this.a.bH() && n2 > 0) {
                long l2 = ewj.c(this.c);
                jur jur2 = this.a;
                l2 = (long)n2 * 1000L / l2;
                object = dox.j(eag.a.l());
                ((bzo)object).s(SystemClock.elapsedRealtime() - l2);
                jur2.O(((bzo)object).r());
                ((heg)b.f().h(hfo.a, "ALT.ProcFirstByteTime").j("com/google/android/libraries/search/audio/audiobuffer/processing/FirstByteReadProcessor", "process", 64, "FirstByteReadProcessor.kt")).t("#audio# mark first byte read result as non-empty, actual(%dms ago)", l2);
                return 1;
            }
            return 2;
        }
    }
}

