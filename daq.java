/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

public final class daq
implements hpb {
    final long a;
    final int b;
    final Object c;
    final Object d;
    private final int e;

    public daq(cxv cxv2, String string, long l2, int n2, int n3) {
        this.e = n3;
        this.c = string;
        this.a = l2;
        this.b = n2;
        this.d = cxv2;
    }

    public daq(cyu cyu2, int n2, hwp hwp2, long l2, int n3) {
        this.e = n3;
        this.b = n2;
        this.c = hwp2;
        this.a = l2;
        this.d = cyu2;
    }

    public daq(evo evo2, int n2, long l2, eip eip2, int n3) {
        this.e = n3;
        this.b = n2;
        this.a = l2;
        this.d = eip2;
        this.c = evo2;
    }

    public daq(evo evo2, long l2, int n2, eip eip2, int n3) {
        this.e = n3;
        this.a = l2;
        this.b = n2;
        this.d = eip2;
        this.c = evo2;
    }

    @Override
    public final void a(Throwable object) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        object = ecf.a.l();
                        Object object2 = ebz.a.l();
                        if (!((hwp)object2).b.B()) {
                            ((hwp)object2).u();
                        }
                        hwv hwv2 = (ebz)((hwp)object2).b;
                        ((ebz)hwv2).c = 2;
                        ((ebz)hwv2).b |= 1;
                        hwv2 = (ebz)((hwp)object2).o();
                        if (!((hwp)object).b.B()) {
                            ((hwp)object).u();
                        }
                        object2 = ((hwp)object).b;
                        hwv hwv3 = (ecf)object2;
                        hwv2.getClass();
                        ((ecf)hwv3).d = hwv2;
                        ((ecf)hwv3).c = 1;
                        long l2 = this.a;
                        if (!((hwv)object2).B()) {
                            ((hwp)object).u();
                        }
                        hwv2 = ((hwp)object).b;
                        object2 = (ecf)hwv2;
                        ((ecf)object2).b |= 2;
                        ((ecf)object2).f = l2;
                        n2 = this.b;
                        if (!hwv2.B()) {
                            ((hwp)object).u();
                        }
                        hwv3 = ((hwp)object).b;
                        object2 = hwv3;
                        ((ecf)object2).b |= 4;
                        ((ecf)object2).g = n2;
                        object2 = this.d;
                        hwv2 = (eip)object2;
                        if (eio.a(((eip)hwv2).b) != eio.J) {
                            if (!hwv3.B()) {
                                ((hwp)object).u();
                            }
                            hwv3 = (ecf)((hwp)object).b;
                            object2.getClass();
                            ((ecf)hwv3).e = hwv2;
                            ((ecf)hwv3).b = 1 | ((ecf)hwv3).b;
                        }
                        object2 = this.c;
                        object = (ecf)((hwp)object).o();
                        ((evo)object2).e((ecf)object);
                        return;
                    }
                    object = (heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$2", "onFailure", 236, "AudioEventsHolderImpl.java");
                    long l3 = this.a;
                    object.w("#audio# cannot retrieve audio request client(token(%d)) session(token(%d)) start listening status", this.b, l3);
                    object = ear.a.l();
                    hyg hyg2 = ebt.a.l();
                    Object object3 = ebs.ad;
                    if (!((hwp)hyg2).b.B()) {
                        ((hwp)hyg2).u();
                    }
                    Object object4 = (ebt)((hwp)hyg2).b;
                    ((ebt)object4).c = ((ebs)object3).ai;
                    ((ebt)object4).b = 2;
                    hyg2 = (ebt)((hwp)hyg2).o();
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object4 = (ear)((hwp)object).b;
                    hyg2.getClass();
                    ((ear)object4).c = hyg2;
                    ((ear)object4).b |= 1;
                    object4 = (ear)((hwp)object).o();
                    object = ecg.a.l();
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object3 = ((hwp)object).b;
                    hyg2 = (ecg)object3;
                    object4.getClass();
                    ((ecg)hyg2).d = object4;
                    ((ecg)hyg2).c = 1;
                    l3 = this.a;
                    if (!((hwv)object3).B()) {
                        ((hwp)object).u();
                    }
                    object4 = ((hwp)object).b;
                    hyg2 = (ecg)object4;
                    ((ecg)hyg2).b = 1 | ((ecg)hyg2).b;
                    ((ecg)hyg2).e = l3;
                    n2 = this.b;
                    if (!((hwv)object4).B()) {
                        ((hwp)object).u();
                    }
                    l3 = n2;
                    object3 = ((hwp)object).b;
                    object4 = (ecg)object3;
                    ((ecg)object4).b |= 8;
                    ((ecg)object4).h = l3;
                    object4 = this.d;
                    hyg2 = (eip)object4;
                    if (eio.a(((eip)hyg2).b) != eio.J) {
                        if (!((hwv)object3).B()) {
                            ((hwp)object).u();
                        }
                        object3 = (ecg)((hwp)object).b;
                        object4.getClass();
                        ((ecg)object3).g = hyg2;
                        ((ecg)object3).b |= 4;
                    }
                    object4 = this.c;
                    object = (ecg)((hwp)object).o();
                    ((evo)object4).f((ecg)object);
                    return;
                }
                object = (heg)((heg)evo.a.h().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$1", "onFailure", 175, "AudioEventsHolderImpl.java");
                long l4 = this.a;
                object.w("#audio# cannot retrieve audio request client(token(%d)) session(token(%d)) stop listening status", this.b, l4);
                object = eas.a.l();
                Object object5 = ebq.a.l();
                Object object6 = ebp.I;
                if (!((hwp)object5).b.B()) {
                    ((hwp)object5).u();
                }
                Object object7 = (ebq)((hwp)object5).b;
                ((ebq)object7).c = ((ebp)object6).M;
                ((ebq)object7).b = 2;
                object7 = (ebq)((hwp)object5).o();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object5 = (eas)((hwp)object).b;
                object7.getClass();
                ((eas)object5).c = object7;
                ((eas)object5).b |= 1;
                object7 = (eas)((hwp)object).o();
                object = ecg.a.l();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object6 = ((hwp)object).b;
                object5 = (ecg)object6;
                object7.getClass();
                ((ecg)object5).d = object7;
                ((ecg)object5).c = 2;
                l4 = this.a;
                if (!((hwv)object6).B()) {
                    ((hwp)object).u();
                }
                object7 = ((hwp)object).b;
                object5 = (ecg)object7;
                ((ecg)object5).b = 1 | ((ecg)object5).b;
                ((ecg)object5).e = l4;
                n2 = this.b;
                if (!((hwv)object7).B()) {
                    ((hwp)object).u();
                }
                l4 = n2;
                object6 = ((hwp)object).b;
                object5 = (ecg)object6;
                ((ecg)object5).b |= 8;
                ((ecg)object5).h = l4;
                object7 = this.d;
                object5 = (eip)object7;
                if (eio.a(((eip)object5).b) != eio.J) {
                    if (!((hwv)object6).B()) {
                        ((hwp)object).u();
                    }
                    object6 = (ecg)((hwp)object).b;
                    object7.getClass();
                    ((ecg)object6).g = object5;
                    ((ecg)object6).b |= 4;
                }
                object5 = this.c;
                object = (ecg)((hwp)object).o();
                ((evo)object5).f((ecg)object);
                return;
            }
            cyr.j((Throwable)object, "%s: failure when sampling log!", "MddEventLogger");
            return;
        }
        object = new StringBuilder("Failed to update periodic tasks for MDD lib ");
        ((StringBuilder)object).append((String)this.c);
        ((StringBuilder)object).append(" ");
        ((StringBuilder)object).append(this.a);
        Log.e((String)"MDDTikTokTaskScheduler", (String)((StringBuilder)object).toString());
        object = this.d;
        Object object8 = this.c;
        long l5 = this.a;
        n2 = this.b;
        object8 = (String)object8;
        ((cxv)object).e((String)object8, l5, n2, false);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object2;
                if (n2 != 2) {
                    Object object3;
                    if (n2 != 3) {
                        object = (eag)object;
                        object = ecf.a.l();
                        Object object4 = ebz.a.l();
                        if (!((hwp)object4).b.B()) {
                            ((hwp)object4).u();
                        }
                        Object object5 = (ebz)((hwp)object4).b;
                        ((ebz)object5).c = 1;
                        ((ebz)object5).b |= 1;
                        object4 = (ebz)((hwp)object4).o();
                        if (!((hwp)object).b.B()) {
                            ((hwp)object).u();
                        }
                        hwv hwv2 = ((hwp)object).b;
                        object5 = (ecf)hwv2;
                        object4.getClass();
                        ((ecf)object5).d = object4;
                        ((ecf)object5).c = 1;
                        long l2 = this.a;
                        if (!hwv2.B()) {
                            ((hwp)object).u();
                        }
                        object4 = ((hwp)object).b;
                        object5 = (ecf)object4;
                        ((ecf)object5).b = 2 | ((ecf)object5).b;
                        ((ecf)object5).f = l2;
                        n2 = this.b;
                        if (!((hwv)object4).B()) {
                            ((hwp)object).u();
                        }
                        hwv2 = ((hwp)object).b;
                        object4 = (ecf)hwv2;
                        ((ecf)object4).b |= 4;
                        ((ecf)object4).g = n2;
                        object5 = this.d;
                        object4 = (eip)object5;
                        if (eio.a(((eip)object4).b) != eio.J) {
                            if (!hwv2.B()) {
                                ((hwp)object).u();
                            }
                            hwv2 = (ecf)((hwp)object).b;
                            object5.getClass();
                            ((ecf)hwv2).e = object4;
                            ((ecf)hwv2).b = 1 | ((ecf)hwv2).b;
                        }
                        object4 = this.c;
                        object = (ecf)((hwp)object).o();
                        ((evo)object4).e((ecf)object);
                        return;
                    }
                    Object object6 = (eah)object;
                    Object object7 = object6.f();
                    Object object8 = (ear)object7;
                    object = object3 = ((ear)object8).c;
                    if (object3 == null) {
                        object = ebt.a;
                    }
                    if (((ebt)object).b == 2) {
                        object = object3 = ((ear)object8).c;
                        if (object3 == null) {
                            object = ebt.a;
                        }
                        if (((ebt)object).b == 2) {
                            object = object3 = ebs.b((Integer)((ebt)object).c);
                            if (object3 == null) {
                                object = ebs.a;
                            }
                        } else {
                            object = ebs.a;
                        }
                        object = ((Enum)object).name();
                    } else {
                        object = object3 = ((ear)object8).c;
                        if (object3 == null) {
                            object = ebt.a;
                        }
                        if (((ebt)object).b == 1) {
                            object = object3 = ebu.b((Integer)((ebt)object).c);
                            if (object3 == null) {
                                object = ebu.a;
                            }
                        } else {
                            object = ebu.a;
                        }
                        object = ((Enum)object).name();
                    }
                    ((heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$2", "onSuccess", 218, "AudioEventsHolderImpl.java")).G("#audio# audio request client(token(%d)) session(token(%d)) start listening status(%s)", this.b, this.a, object);
                    object = ecg.a.l();
                    if (!((hwp)object).b.B()) {
                        ((hwp)object).u();
                    }
                    object8 = ((hwp)object).b;
                    object3 = (ecg)object8;
                    object7.getClass();
                    ((ecg)object3).d = object7;
                    ((ecg)object3).c = 1;
                    long l3 = this.a;
                    if (!((hwv)object8).B()) {
                        ((hwp)object).u();
                    }
                    object3 = ((hwp)object).b;
                    object7 = (ecg)object3;
                    ((ecg)object7).b = 1 | ((ecg)object7).b;
                    ((ecg)object7).e = l3;
                    n2 = this.b;
                    if (!((hwv)object3).B()) {
                        ((hwp)object).u();
                    }
                    l3 = n2;
                    object7 = ((hwp)object).b;
                    object3 = (ecg)object7;
                    ((ecg)object3).b |= 8;
                    ((ecg)object3).h = l3;
                    object8 = this.d;
                    object3 = (eip)object8;
                    if (eio.a(((eip)object3).b) != eio.J) {
                        if (!((hwv)object7).B()) {
                            ((hwp)object).u();
                        }
                        object7 = (ecg)((hwp)object).b;
                        object8.getClass();
                        ((ecg)object7).g = object3;
                        ((ecg)object7).b |= 4;
                    }
                    object3 = this.c;
                    object = (ecg)((hwp)object).o();
                    ((evo)object3).f((ecg)object);
                    object = this.c;
                    n2 = this.b;
                    l3 = this.a;
                    object7 = this.d;
                    if (!object6.c().g()) {
                        return;
                    }
                    object3 = (hpn)object6.c().c();
                    object6 = (eip)object7;
                    object = (evo)object;
                    hhk.T((hpn)object3, gqk.g(new daq((evo)object, l3, n2, (eip)object6, 4)), ((evo)object).b);
                    return;
                }
                hwv hwv3 = (eas)object;
                object = object2 = ((eas)hwv3).c;
                if (object2 == null) {
                    object = ebq.a;
                }
                if (((ebq)object).b == 2) {
                    object = object2 = ((eas)hwv3).c;
                    if (object2 == null) {
                        object = ebq.a;
                    }
                    if (((ebq)object).b == 2) {
                        object = object2 = ebp.b((Integer)((ebq)object).c);
                        if (object2 == null) {
                            object = ebp.a;
                        }
                    } else {
                        object = ebp.a;
                    }
                    object = ((Enum)object).name();
                } else {
                    object = object2 = ((eas)hwv3).c;
                    if (object2 == null) {
                        object = ebq.a;
                    }
                    if (((ebq)object).b == 1) {
                        object = object2 = ebr.b((Integer)((ebq)object).c);
                        if (object2 == null) {
                            object = ebr.a;
                        }
                    } else {
                        object = ebr.a;
                    }
                    object = ((Enum)object).name();
                }
                ((heg)((heg)evo.a.f().h(hfo.a, "ALT.AudioEventsHolder")).j("com/google/android/libraries/search/audio/state/events/impl/AudioEventsHolderImpl$1", "onSuccess", 158, "AudioEventsHolderImpl.java")).G("#audio# audio request client(token(%d)) session(token(%d)) stop listening status(%s)", this.b, this.a, object);
                object = ecg.a.l();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                hwv hwv4 = ((hwp)object).b;
                object2 = (ecg)hwv4;
                hwv3.getClass();
                ((ecg)object2).d = hwv3;
                ((ecg)object2).c = 2;
                long l4 = this.a;
                if (!hwv4.B()) {
                    ((hwp)object).u();
                }
                hwv3 = ((hwp)object).b;
                object2 = (ecg)hwv3;
                ((ecg)object2).b = 1 | ((ecg)object2).b;
                ((ecg)object2).e = l4;
                n2 = this.b;
                if (!hwv3.B()) {
                    ((hwp)object).u();
                }
                l4 = n2;
                hwv4 = ((hwp)object).b;
                object2 = (ecg)hwv4;
                ((ecg)object2).b |= 8;
                ((ecg)object2).h = l4;
                object2 = this.d;
                hwv3 = (eip)object2;
                if (eio.a(((eip)hwv3).b) != eio.J) {
                    if (!hwv4.B()) {
                        ((hwp)object).u();
                    }
                    hwv4 = (ecg)((hwp)object).b;
                    object2.getClass();
                    ((ecg)hwv4).g = hwv3;
                    ((ecg)hwv4).b |= 4;
                }
                object2 = this.c;
                object = (ecg)((hwp)object).o();
                ((evo)object2).f((ecg)object);
                return;
            }
            Object object9 = (gto)object;
            if (((gto)object9).g()) {
                object = this.d;
                n2 = this.b;
                Object object10 = this.c;
                long l5 = this.a;
                object9 = (hmg)((gto)object9).c();
                object10 = (hwp)object10;
                ((cyu)object).h(n2, (hwp)object10, l5, (hmg)object9);
            }
            return;
        }
        object = (Void)object;
    }
}

