/*
 * Decompiled with CFR 0.152.
 */
import java.util.Queue;
import java.util.concurrent.Executor;

public final class evo {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl");
    public final Executor b;
    private final Queue c = new hdu(new gza(128));

    public evo(Executor executor) {
        this.b = executor;
    }

    public static ecg a(eav hwv2, gto object, eaz hwv3) {
        hwp hwp2 = ecg.a.l();
        if (((gto)object).g()) {
            hwp hwp3 = eby.a.l();
            if (!hwp3.b.B()) {
                hwp3.u();
            }
            hwv hwv4 = hwp3.b;
            eby eby2 = (eby)hwv4;
            hwv2.getClass();
            eby2.d = hwv2;
            eby2.c = 2;
            if (!hwv4.B()) {
                hwp3.u();
            }
            hwv2 = (eby)hwp3.b;
            hwv3.getClass();
            ((eby)hwv2).e = hwv3;
            ((eby)hwv2).b |= 1;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (ecg)hwp2.b;
            hwv3 = (eby)hwp3.o();
            hwv3.getClass();
            ((ecg)hwv2).d = hwv3;
            ((ecg)hwv2).c = 8;
            long l2 = ((Integer)((gto)object).c()).intValue();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (ecg)hwp2.b;
            ((ecg)hwv2).b = 8 | ((ecg)hwv2).b;
            ((ecg)hwv2).h = l2;
        } else {
            object = eci.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hwv hwv5 = ((hwp)object).b;
            eci eci2 = (eci)hwv5;
            hwv2.getClass();
            eci2.d = hwv2;
            eci2.c = 2;
            if (!hwv5.B()) {
                ((hwp)object).u();
            }
            hwv2 = (eci)((hwp)object).b;
            hwv3.getClass();
            ((eci)hwv2).e = hwv3;
            ((eci)hwv2).b |= 1;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (ecg)hwp2.b;
            object = (eci)((hwp)object).o();
            object.getClass();
            ((ecg)hwv2).d = object;
            ((ecg)hwv2).c = 102;
        }
        return (ecg)hwp2.o();
    }

    public static ecg b(eax hwv2, gto object, eaz hwv3) {
        hwp hwp2 = ecg.a.l();
        if (((gto)object).g()) {
            hwp hwp3 = eby.a.l();
            if (!hwp3.b.B()) {
                hwp3.u();
            }
            hwv hwv4 = hwp3.b;
            eby eby2 = (eby)hwv4;
            hwv2.getClass();
            eby2.d = hwv2;
            eby2.c = 1;
            if (!hwv4.B()) {
                hwp3.u();
            }
            hwv2 = (eby)hwp3.b;
            hwv3.getClass();
            ((eby)hwv2).e = hwv3;
            ((eby)hwv2).b |= 1;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (ecg)hwp2.b;
            hwv3 = (eby)hwp3.o();
            hwv3.getClass();
            ((ecg)hwv2).d = hwv3;
            ((ecg)hwv2).c = 8;
            long l2 = ((Integer)((gto)object).c()).intValue();
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (ecg)hwp2.b;
            ((ecg)hwv2).b = 8 | ((ecg)hwv2).b;
            ((ecg)hwv2).h = l2;
        } else {
            object = eci.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hwv hwv5 = ((hwp)object).b;
            eci eci2 = (eci)hwv5;
            hwv2.getClass();
            eci2.d = hwv2;
            eci2.c = 1;
            if (!hwv5.B()) {
                ((hwp)object).u();
            }
            hwv2 = (eci)((hwp)object).b;
            hwv3.getClass();
            ((eci)hwv2).e = hwv3;
            ((eci)hwv2).b |= 1;
            if (!hwp2.b.B()) {
                hwp2.u();
            }
            hwv2 = (ecg)hwp2.b;
            object = (eci)((hwp)object).o();
            object.getClass();
            ((ecg)hwv2).d = object;
            ((ecg)hwv2).c = 102;
        }
        return (ecg)hwp2.o();
    }

    public final void c(hpn hpn2, hpn hpn3, gto gto2, eaz eaz2) {
        hhk.T(hpn2, gqk.g(new enb((Object)this, gto2, eaz2, 5)), this.b);
        hhk.T(hpn3, gqk.g(new enb((Object)this, gto2, eaz2, 2)), this.b);
    }

    public final void d(ece hwv2) {
        hwp hwp2 = ebx.a.l();
        long l2 = cgw.p().toEpochMilli();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv3 = hwp2.b;
        ebx ebx2 = (ebx)hwv3;
        ebx2.b |= 1;
        ebx2.e = l2;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv3 = (ebx)hwp2.b;
        hwv2.getClass();
        ((ebx)hwv3).d = hwv2;
        ((ebx)hwv3).c = 2;
        hwv2 = (ebx)hwp2.o();
        ((heg)((heg)a.c().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl", "logClientEvent", 100, "AudioEventsHolderImpl.java")).u("#audio# %s", new ern(hwv2, 4));
        this.c.add(hwv2);
    }

    public final void e(ecf hwv2) {
        hwp hwp2 = ebx.a.l();
        long l2 = cgw.p().toEpochMilli();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv3 = hwp2.b;
        ebx ebx2 = (ebx)hwv3;
        ebx2.b |= 1;
        ebx2.e = l2;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv3 = (ebx)hwp2.b;
        hwv2.getClass();
        ((ebx)hwv3).d = hwv2;
        ((ebx)hwv3).c = 4;
        hwv2 = (ebx)hwp2.o();
        ((heg)((heg)a.c().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl", "logClientEventOutcome", 122, "AudioEventsHolderImpl.java")).u("#audio# %s", new ern(hwv2, 3));
        this.c.add(hwv2);
    }

    public final void f(ecg hwv2) {
        hwp hwp2 = ebx.a.l();
        long l2 = cgw.p().toEpochMilli();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv3 = hwp2.b;
        ebx ebx2 = (ebx)hwv3;
        ebx2.b |= 1;
        ebx2.e = l2;
        if (!hwv3.B()) {
            hwp2.u();
        }
        hwv3 = (ebx)hwp2.b;
        hwv2.getClass();
        ((ebx)hwv3).d = hwv2;
        ((ebx)hwv3).c = 3;
        hwv2 = (ebx)hwp2.o();
        ((heg)((heg)a.c().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl", "logClientEventStatus", 111, "AudioEventsHolderImpl.java")).u("#audio# %s", new ern(hwv2, 5));
        this.c.add(hwv2);
    }
}

