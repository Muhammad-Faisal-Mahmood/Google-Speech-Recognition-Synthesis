/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;

public final class efd
implements eeq {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiobuffer/processing/TalkBackMuterProcessor");
    private final jny b;
    private final AtomicBoolean c;
    private final AtomicBoolean d;

    public efd(eao eao2, dml dml2) {
        ((heg)a.f().j("com/google/android/libraries/search/audio/audiobuffer/processing/TalkBackMuterProcessor", "<init>", 25, "TalkBackMuterProcessor.kt")).u("#audio# loading processor(%s)", crh.K(this));
        this.b = new jog(new bfb(dml2, eao2, 5));
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
    }

    private final enn d() {
        return (enn)this.b.a();
    }

    @Override
    public final eep a() {
        int n2 = eep.a;
        return eeo.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        synchronized (this) {
            boolean bl2 = this.c.getAndSet(true);
            if (bl2) {
                return;
            }
            ((heg)a.f().h(hfo.a, "ALT.ProcTalkBackMuter").j("com/google/android/libraries/search/audio/audiobuffer/processing/TalkBackMuterProcessor", "close", 57, "TalkBackMuterProcessor.kt")).u("#audio# close processor (%s)", crh.K(this));
            this.d().a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final int c(byte[] byArray, int n2) {
        // MONITORENTER : this
        boolean bl2 = this.c.get();
        if (bl2) {
            // MONITOREXIT : this
            return 2;
        }
        if (n2 <= 0) {
            // MONITOREXIT : this
            return 2;
        }
        if (!this.d.getAndSet(true)) {
            this.d().b();
        }
        bl2 = this.d().a.get();
        // MONITOREXIT : this
        if (!bl2) return 1;
        return 3;
    }
}

