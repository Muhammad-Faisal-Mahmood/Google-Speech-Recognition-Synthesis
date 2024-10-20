/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class dlh
extends dlc {
    public final List b = new CopyOnWriteArrayList();

    @Override
    public final void i(djt djt2) {
        ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitBackgroundSignal", 148, "ForegroundTracker.java")).r("App transition to background");
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((dle)iterator.next()).i(djt2);
        }
    }

    @Override
    public final void j(djt djt2) {
        ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/foreground/ForegroundTracker$ForegroundSignalMultiplexer", "emitForegroundSignal", 140, "ForegroundTracker.java")).r("App transition to foreground");
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((dle)iterator.next()).j(djt2);
        }
    }
}

