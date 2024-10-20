/*
 * Decompiled with CFR 0.152.
 */
public abstract class dlc {
    public int a = 1;

    public abstract void i(djt var1);

    public abstract void j(djt var1);

    public final void k(djt djt2) {
        if (this.a == 3) {
            ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeBackgroundSignal", 42, "AbstractForegroundSignalAdapter.java")).r("Already in the background, not transitioning");
            return;
        }
        this.a = 3;
        this.i(djt2);
    }

    public final void l(djt djt2) {
        if (this.a == 2) {
            ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/foreground/AbstractForegroundSignalAdapter", "observeForegroundSignal", 31, "AbstractForegroundSignalAdapter.java")).r("Already in the foreground, not transitioning");
            return;
        }
        this.a = 2;
        this.j(djt2);
    }
}

