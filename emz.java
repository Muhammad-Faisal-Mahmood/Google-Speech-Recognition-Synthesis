/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public final class emz
implements hpb {
    final Object a;
    final Object b;
    final Object c;
    final Object d;
    private final int e;

    public emz(cuq cuq2, csu csu2, String string, cvg cvg2, int n2) {
        this.e = n2;
        this.c = csu2;
        this.a = string;
        this.d = cvg2;
        this.b = cuq2;
    }

    public emz(enc enc2, Predicate predicate, eip eip2, Enum enum_, int n2) {
        this.e = n2;
        this.a = predicate;
        this.b = eip2;
        this.c = enum_;
        this.d = enc2;
    }

    public emz(ixx ixx2, jam jam2, iwx iwx2, ixy ixy2, int n2) {
        this.e = n2;
        this.b = ixx2;
        this.a = jam2;
        this.c = iwx2;
        this.d = ixy2;
    }

    @Override
    public final void a(Throwable object) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            object = iyh.j.d((Throwable)object).e("Authorization future failed");
                            iwx iwx2 = new iwx();
                            ((ixx)this.b).a((iyh)object, iwx2);
                            return;
                        }
                        ((hfk)((hfk)((hfk)enc.a.h()).i((Throwable)object)).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$4", "onFailure", 353, "MonitoringLoggerImpl.java")).r("#audio# HotwordListeningSession stop listening failed");
                        ((eng)((enc)this.d).b.b()).e(((ebp)this.c).name(), ebv.a.name(), (String)((enc)this.d).d.a(), eio.a(((eip)this.b).b).name());
                        return;
                    }
                    ((hfk)((hfk)((hfk)enc.a.h()).i((Throwable)object)).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$3", "onFailure", 306, "MonitoringLoggerImpl.java")).r("#audio# HotwordListeningSession start listening failed");
                    object = (eng)((enc)this.d).b.b();
                    gui gui2 = ((enc)this.d).d;
                    ((eng)object).f(((ebs)this.c).name(), (String)gui2.a(), false, eio.a(((eip)this.b).b).name());
                    return;
                }
                ((hfk)((hfk)((hfk)enc.a.h()).i((Throwable)object)).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$2", "onFailure", 212, "MonitoringLoggerImpl.java")).r("#audio# AudioRequestListeningSession stop listening failed");
                ((eng)((enc)this.d).b.b()).c(((ebp)this.c).name(), ebv.a.name(), (String)((enc)this.d).d.a(), eio.a(((eip)this.b).b).name());
                return;
            }
            if (((csu)this.c).g.g()) {
                ((csv)((csu)this.c).g.c()).b((Throwable)object);
                if (((cuq)this.b).e.g()) {
                    ((daa)((cuq)this.b).e.c()).i((String)this.a);
                }
            }
            object = this.b;
            Object object2 = this.d;
            ((cuq)object).j.i(((cvg)object2).a);
            return;
        }
        ((hfk)((hfk)((hfk)enc.a.h()).i((Throwable)object)).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$1", "onFailure", 165, "MonitoringLoggerImpl.java")).r("#audio# AudioRequestListeningSession start listening failed");
        object = (eng)((enc)this.d).b.b();
        gui gui3 = ((enc)this.d).d;
        ((eng)object).d(((ebs)this.c).name(), (String)gui3.a(), eio.a(((eip)this.b).b).name(), false);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        Object object2;
        int n2 = this.e;
        boolean bl2 = false;
        boolean bl3 = false;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object3;
                if (n2 != 2) {
                    if (n2 != 3) {
                        Object object4;
                        if (n2 != 4) {
                            Object object5 = (iyh)object;
                            if (!((iyh)object5).g()) {
                                Object object6 = this.b;
                                object = new iwx();
                                ((ixx)object6).a((iyh)object5, (iwx)object);
                                return;
                            }
                            object5 = this.a;
                            object = this.b;
                            Object object7 = this.c;
                            Object object8 = this.d;
                            try {
                                object7 = (iwx)object7;
                                object8 = object8.a((ixx)object, (iwx)object7);
                            }
                            catch (RuntimeException runtimeException) {
                                iyh iyh2 = iyh.j.d(runtimeException).e("Failed to start server call after authorization check");
                                object8 = new iwx();
                                ((ixx)object).a(iyh2, (iwx)object8);
                                return;
                            }
                            object = (jam)object5;
                            ((jam)object).a.set(object8);
                            ((jam)object).j();
                            return;
                        }
                        Object object9 = (ecy)object;
                        object = object4 = ((ecy)object9).c;
                        if (object4 == null) {
                            object = ebq.a;
                        }
                        if (!ag$$ExternalSyntheticApiModelOutline1.m((Predicate)this.a, object)) {
                            return;
                        }
                        n2 = ((ebq)object).b;
                        if (n2 == 2) {
                            object = object4 = ebp.b((Integer)((ebq)object).c);
                            if (object4 == null) {
                                object = ebp.a;
                            }
                            object = ((Enum)object).name();
                        } else {
                            if (n2 == 1) {
                                object = object4 = ebr.b((Integer)((ebq)object).c);
                                if (object4 == null) {
                                    object = ebr.a;
                                }
                            } else {
                                object = ebr.a;
                            }
                            object = ((Enum)object).name();
                        }
                        ((hfk)((hfk)enc.a.f()).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$4", "onSuccess", 340, "MonitoringLoggerImpl.java")).u("#audio# HotwordListeningSession stop listening status: %s", object);
                        eng eng2 = (eng)((enc)this.d).b.b();
                        object4 = object9 = ebv.b(((ecy)object9).d);
                        if (object9 == null) {
                            object4 = ebv.a;
                        }
                        object9 = ((enc)this.d).d;
                        eng2.e((String)object, ((Enum)object4).name(), (String)object9.a(), eio.a(((eip)this.b).b).name());
                        return;
                    }
                    Object object10 = object = ((ecx)((ecs)object).f()).c;
                    if (object == null) {
                        object10 = ebt.a;
                    }
                    if (!ag$$ExternalSyntheticApiModelOutline1.m((Predicate)this.a, object10)) {
                        return;
                    }
                    n2 = ((ebt)object10).b;
                    if (n2 == 2) {
                        ebs ebs2 = ebs.b((Integer)((ebt)object10).c);
                        object = ebs2;
                        if (ebs2 == null) {
                            object = ebs.a;
                        }
                        object = ((Enum)object).name();
                    } else {
                        if (n2 == 1) {
                            ebu ebu2 = ebu.b((Integer)((ebt)object10).c);
                            object = ebu2;
                            if (ebu2 == null) {
                                object = ebu.a;
                            }
                        } else {
                            object = ebu.a;
                        }
                        object = ((Enum)object).name();
                    }
                    if (((ebt)object10).b == 1) {
                        bl3 = true;
                    }
                    ((hfk)((hfk)enc.a.f()).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$3", "onSuccess", 296, "MonitoringLoggerImpl.java")).u("#audio# HotwordListeningSession start listening status: %s", object);
                    ((eng)((enc)this.d).b.b()).f((String)object, (String)((enc)this.d).d.a(), bl3, eio.a(((eip)this.b).b).name());
                    return;
                }
                Object object11 = (eas)object;
                object = object3 = ((eas)object11).c;
                if (object3 == null) {
                    object = ebq.a;
                }
                if (!ag$$ExternalSyntheticApiModelOutline1.m((Predicate)this.a, object)) {
                    return;
                }
                n2 = ((ebq)object).b;
                if (n2 == 2) {
                    object = object3 = ebp.b((Integer)((ebq)object).c);
                    if (object3 == null) {
                        object = ebp.a;
                    }
                    object = ((Enum)object).name();
                } else {
                    if (n2 == 1) {
                        object = object3 = ebr.b((Integer)((ebq)object).c);
                        if (object3 == null) {
                            object = ebr.a;
                        }
                    } else {
                        object = ebr.a;
                    }
                    object = ((Enum)object).name();
                }
                ((hfk)((hfk)enc.a.f()).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$2", "onSuccess", 199, "MonitoringLoggerImpl.java")).u("#audio# AudioRequestListeningSession stop listening status: %s", object);
                eng eng3 = (eng)((enc)this.d).b.b();
                object3 = object11 = ebv.b(((eas)object11).d);
                if (object11 == null) {
                    object3 = ebv.a;
                }
                object11 = ((enc)this.d).d;
                eng3.c((String)object, ((Enum)object3).name(), (String)object11.a(), eio.a(((eip)this.b).b).name());
                return;
            }
            object = (csg)object;
            return;
        }
        Object object12 = object = ((ear)((eah)object).f()).c;
        if (object == null) {
            object12 = ebt.a;
        }
        if (!ag$$ExternalSyntheticApiModelOutline1.m((Predicate)this.a, object12)) {
            return;
        }
        n2 = ((ebt)object12).b;
        if (n2 == 2) {
            object = object2 = ebs.b((Integer)((ebt)object12).c);
            if (object2 == null) {
                object = ebs.a;
            }
            object = ((Enum)object).name();
        } else {
            if (n2 == 1) {
                object = object2 = ebu.b((Integer)((ebt)object12).c);
                if (object2 == null) {
                    object = ebu.a;
                }
            } else {
                object = ebu.a;
            }
            object = ((Enum)object).name();
        }
        ((hfk)((hfk)enc.a.f()).j("com/google/android/libraries/search/audio/logging/impl/MonitoringLoggerImpl$1", "onSuccess", 152, "MonitoringLoggerImpl.java")).u("#audio# AudioRequestListeningSession start listening status: %s", object);
        eng eng4 = (eng)((enc)this.d).b.b();
        String string = (String)((enc)this.d).d.a();
        object2 = eio.a(((eip)this.b).b).name();
        bl3 = bl2;
        if (((ebt)object12).b == 1) {
            bl3 = true;
        }
        eng4.d((String)object, string, (String)object2, bl3);
    }
}

