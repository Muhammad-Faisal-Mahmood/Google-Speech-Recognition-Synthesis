/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class evv
implements evq {
    public final ecm a;
    public final long b;
    public hvu c;
    public final jtz d;
    final evw e;

    public evv(evw evw2, ecm ecm2, long l2) {
        jse.e(ecm2, "audioMetadata");
        this.e = evw2;
        this.a = ecm2;
        this.b = l2;
        this.c = hvu.b;
        this.d = new jtz(false, jud.a);
    }

    @Override
    public final hpn a() {
        if (this.d.b()) {
            return hhk.I();
        }
        evw evw2 = this.e;
        eht eht2 = new eht(this, evw2, null, 5);
        return evw2.f.j(eht2);
    }

    @Override
    public final /* synthetic */ hpn b(dzn dzn2) {
        return crh.T(this, dzn2);
    }

    @Override
    public final hpn c(hvu serializable) {
        jse.e(serializable, "bytes");
        if (this.d()) {
            return hhk.I();
        }
        evw evw2 = this.e;
        serializable = new eht(this, (hvu)serializable, null, 6);
        return evw2.f.j((jro)((Object)serializable));
    }

    public final boolean d() {
        if (!this.d.b()) {
            return false;
        }
        ((heg)((heg)evw.a.h().h(hfo.a, "ALT.SingleRecordStore")).g(1, TimeUnit.SECONDS).j("com/google/android/libraries/search/audio/store/memory/SingleAudioRecordStore$Writer", "maybeSkipWriteIfClosed", 79, "SingleAudioRecordStore.kt")).t("#audio# write called after close, skipping... AudioRecordId: %d", this.b);
        return true;
    }
}

