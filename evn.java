/*
 * Decompiled with CFR 0.152.
 */
public final class evn
implements hpb {
    final long a;
    final eip b;
    final evo c;
    private final int d;

    public evn(evo evo2, long l2, eip eip2, int n2) {
        this.d = n2;
        this.a = l2;
        this.b = eip2;
        this.c = evo2;
    }

    @Override
    public final void a(Throwable object) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                object = ecf.a.l();
                hyg hyg2 = ecj.a.l();
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                hwv hwv2 = (ecj)((hwp)hyg2).b;
                ((ecj)hwv2).c = 2;
                ((ecj)hwv2).b |= 1;
                hwv2 = (ecj)((hwp)hyg2).o();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                hyg2 = ((hwp)object).b;
                ecf ecf2 = (ecf)hyg2;
                hwv2.getClass();
                ecf2.d = hwv2;
                ecf2.c = 2;
                hwv2 = this.b;
                if (eio.a(((eip)hwv2).b) != eio.J) {
                    if (!((hwv)hyg2).B()) {
                        ((hwp)object).u();
                    }
                    hyg2 = (ecf)((hwp)object).b;
                    hwv2.getClass();
                    ((ecf)hyg2).e = hwv2;
                    ((ecf)hyg2).b |= 1;
                }
                this.c.e((ecf)((hwp)object).o());
                return;
            }
            ((heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$3", "onFailure", 297, "AudioEventsHolderImpl.java")).t("#audio# cannot retrieve hotword client session(token(%d)) stop listening status", this.a);
            object = ecy.a.l();
            hyg hyg3 = ebq.a.l();
            Object object2 = ebp.I;
            if (!hyg3.b.B()) {
                hyg3.u();
            }
            hwv hwv3 = (ebq)hyg3.b;
            ((ebq)hwv3).c = ((ebp)object2).M;
            ((ebq)hwv3).b = 2;
            hwv3 = (ebq)hyg3.o();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object2 = (ecy)((hwp)object).b;
            hwv3.getClass();
            ((ecy)object2).c = hwv3;
            ((ecy)object2).b |= 1;
            object2 = (ecy)((hwp)object).o();
            object = ecg.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hwv3 = ((hwp)object).b;
            hyg3 = (ecg)hwv3;
            object2.getClass();
            ((ecg)hyg3).d = object2;
            ((ecg)hyg3).c = 101;
            long l2 = this.a;
            if (!hwv3.B()) {
                ((hwp)object).u();
            }
            object2 = ((hwp)object).b;
            hwv3 = (ecg)object2;
            ((ecg)hwv3).b = 1 | ((ecg)hwv3).b;
            ((ecg)hwv3).e = l2;
            hwv3 = this.b;
            if (eio.a(((eip)hwv3).b) != eio.J) {
                if (!((hwv)object2).B()) {
                    ((hwp)object).u();
                }
                object2 = (ecg)((hwp)object).b;
                hwv3.getClass();
                ((ecg)object2).g = hwv3;
                ((ecg)object2).b |= 4;
            }
            this.c.f((ecg)((hwp)object).o());
            return;
        }
        ((heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$4", "onFailure", 352, "AudioEventsHolderImpl.java")).t("#audio# cannot retrieve hotword client session(token(%d)) start listening status", this.a);
        object = ecx.a.l();
        hyg hyg4 = ebt.a.l();
        Object object3 = ebs.ad;
        if (!((hwp)hyg4).b.B()) {
            ((hwp)hyg4).u();
        }
        hwv hwv4 = (ebt)((hwp)hyg4).b;
        hwv4.c = ((ebs)object3).ai;
        hwv4.b = 2;
        object3 = (ebt)((hwp)hyg4).o();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hyg4 = (ecx)((hwp)object).b;
        object3.getClass();
        ((ecx)hyg4).c = object3;
        ((ecx)hyg4).b |= 1;
        hyg4 = (ecx)((hwp)object).o();
        object = ecg.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object3 = ((hwp)object).b;
        hwv4 = (ecg)object3;
        hyg4.getClass();
        ((ecg)hwv4).d = hyg4;
        ((ecg)hwv4).c = 100;
        long l3 = this.a;
        if (!((hwv)object3).B()) {
            ((hwp)object).u();
        }
        object3 = ((hwp)object).b;
        hyg4 = (ecg)object3;
        ((ecg)hyg4).b = 1 | ((ecg)hyg4).b;
        ((ecg)hyg4).e = l3;
        hyg4 = this.b;
        if (eio.a(((eip)hyg4).b) != eio.J) {
            if (!((hwv)object3).B()) {
                ((hwp)object).u();
            }
            object3 = (ecg)((hwp)object).b;
            hyg4.getClass();
            ((ecg)object3).g = hyg4;
            ((ecg)object3).b |= 4;
        }
        this.c.f((ecg)((hwp)object).o());
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        Object object2;
        int n2 = this.d;
        if (n2 != 0) {
            Object object3;
            if (n2 != 1) {
                object = (eag)object;
                object = ecf.a.l();
                hyg hyg2 = ecj.a.l();
                if (!((hwp)hyg2).b.B()) {
                    ((hwp)hyg2).u();
                }
                hwv hwv2 = (ecj)((hwp)hyg2).b;
                ((ecj)hwv2).c = 1;
                ((ecj)hwv2).b |= 1;
                ecj ecj2 = (ecj)((hwp)hyg2).o();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                hwv2 = ((hwp)object).b;
                hyg2 = (ecf)hwv2;
                ecj2.getClass();
                ((ecf)hyg2).d = ecj2;
                ((ecf)hyg2).c = 2;
                long l2 = this.a;
                if (!hwv2.B()) {
                    ((hwp)object).u();
                }
                hyg2 = ((hwp)object).b;
                hwv2 = (ecf)hyg2;
                ((ecf)hwv2).b = 2 | ((ecf)hwv2).b;
                ((ecf)hwv2).f = l2;
                hwv2 = this.b;
                if (eio.a(((eip)hwv2).b) != eio.J) {
                    if (!((hwv)hyg2).B()) {
                        ((hwp)object).u();
                    }
                    hyg2 = (ecf)((hwp)object).b;
                    hwv2.getClass();
                    ((ecf)hyg2).e = hwv2;
                    ((ecf)hyg2).b |= 1;
                }
                this.c.e((ecf)((hwp)object).o());
                return;
            }
            hwv hwv3 = (ecy)object;
            object = object3 = ((ecy)hwv3).c;
            if (object3 == null) {
                object = ebq.a;
            }
            if (((ebq)object).b == 2) {
                object = object3 = ((ecy)hwv3).c;
                if (object3 == null) {
                    object = ebq.a;
                }
                if (((ebq)object).b == 2) {
                    object = object3 = ebp.b((Integer)((ebq)object).c);
                    if (object3 == null) {
                        object = ebp.a;
                    }
                } else {
                    object = ebp.a;
                }
                object = ((Enum)object).name();
            } else {
                object = object3 = ((ecy)hwv3).c;
                if (object3 == null) {
                    object = ebq.a;
                }
                if (((ebq)object).b == 1) {
                    object = object3 = ebr.b((Integer)((ebq)object).c);
                    if (object3 == null) {
                        object = ebr.a;
                    }
                } else {
                    object = ebr.a;
                }
                object = ((Enum)object).name();
            }
            ((heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$3", "onSuccess", 282, "AudioEventsHolderImpl.java")).z("#audio# hotword client session(token(%d)) stop listening status(%s)", this.a, object);
            object = ecg.a.l();
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            hwv hwv4 = ((hwp)object).b;
            object3 = (ecg)hwv4;
            hwv3.getClass();
            ((ecg)object3).d = hwv3;
            ((ecg)object3).c = 101;
            long l3 = this.a;
            if (!hwv4.B()) {
                ((hwp)object).u();
            }
            hwv3 = ((hwp)object).b;
            object3 = (ecg)hwv3;
            ((ecg)object3).b |= 1;
            ((ecg)object3).e = l3;
            object3 = this.b;
            if (eio.a(((eip)object3).b) != eio.J) {
                if (!hwv3.B()) {
                    ((hwp)object).u();
                }
                hwv3 = (ecg)((hwp)object).b;
                object3.getClass();
                ((ecg)hwv3).g = object3;
                ((ecg)hwv3).b |= 4;
            }
            this.c.f((ecg)((hwp)object).o());
            return;
        }
        ecs ecs2 = (ecs)object;
        Object object4 = ecs2.f();
        hwv hwv5 = (ecx)object4;
        object = object2 = hwv5.c;
        if (object2 == null) {
            object = ebt.a;
        }
        if (((ebt)object).b == 2) {
            object = object2 = hwv5.c;
            if (object2 == null) {
                object = ebt.a;
            }
            if (((ebt)object).b == 2) {
                object = object2 = ebs.b((Integer)((ebt)object).c);
                if (object2 == null) {
                    object = ebs.a;
                }
            } else {
                object = ebs.a;
            }
            object = ((Enum)object).name();
        } else {
            object = object2 = hwv5.c;
            if (object2 == null) {
                object = ebt.a;
            }
            if (((ebt)object).b == 1) {
                object = object2 = ebu.b((Integer)((ebt)object).c);
                if (object2 == null) {
                    object = ebu.a;
                }
            } else {
                object = ebu.a;
            }
            object = ((Enum)object).name();
        }
        ((heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$4", "onSuccess", 336, "AudioEventsHolderImpl.java")).z("#audio# hotword client session(token(%d)) start listening status(%s)", this.a, object);
        object = ecg.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        object2 = ((hwp)object).b;
        hwv5 = (ecg)object2;
        object4.getClass();
        ((ecg)hwv5).d = object4;
        ((ecg)hwv5).c = 100;
        long l4 = this.a;
        if (!((hwv)object2).B()) {
            ((hwp)object).u();
        }
        object2 = ((hwp)object).b;
        object4 = (ecg)object2;
        ((ecg)object4).b = 1 | ((ecg)object4).b;
        ((ecg)object4).e = l4;
        object4 = this.b;
        if (eio.a(((eip)object4).b) != eio.J) {
            if (!((hwv)object2).B()) {
                ((hwp)object).u();
            }
            object2 = (ecg)((hwp)object).b;
            object4.getClass();
            ((ecg)object2).g = object4;
            ((ecg)object2).b |= 4;
        }
        this.c.f((ecg)((hwp)object).o());
        object = this.c;
        l4 = this.a;
        object2 = this.b;
        if (!ecs2.c().g()) {
            return;
        }
        hhk.T((hpn)ecs2.c().c(), gqk.g(new evn((evo)object, l4, (eip)object2, 2)), ((evo)object).b);
    }
}

