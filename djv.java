/*
 * Decompiled with CFR 0.152.
 */
public final class djv {
    public static final int b = 0;
    private static final djv c;
    private static volatile boolean d;
    private static volatile djv e;
    public final djw a;

    static {
        djv djv2;
        c = djv2 = new djv(new dju());
        d = true;
        e = djv2;
    }

    public djv(djw djw2) {
        this.a = djw2;
    }

    public static djv a() {
        if (e == c && d) {
            d = false;
            heg heg2 = (heg)dkc.a.h();
            hfj hfj2 = Math.random() < 0.01 ? hfj.d : hfj.e;
            ((heg)((heg)heg2.k(hfj2)).j("com/google/android/libraries/performance/primes/Primes", "get", 186, "Primes.java")).r("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void c(djv djv2) {
        synchronized (djv.class) {
            if (e != c) {
                ((heg)((heg)dkc.a.c()).j("com/google/android/libraries/performance/primes/Primes", "cache", 146, "Primes.java")).r("Primes cached more than once. This call will be ignored.");
                return;
            }
            e = djv2;
            return;
        }
    }

    public final drn b() {
        return this.a.a();
    }

    public final void d(dql dql2) {
        this.a.c(dql2);
    }

    public final void e(drn drn2, djt djt2) {
        this.a.h(drn2, djt2);
    }
}

