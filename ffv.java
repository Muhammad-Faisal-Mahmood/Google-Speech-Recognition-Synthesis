/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

public final class ffv {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/RecognitionClient");
    public final hpr b;
    public final fgu c;
    public final ffk d;
    public final fgr e;
    public final fgw f;
    public final hth g;
    private final fgq h;

    public ffv(hth object, hpr object2, bmu object3, gcv object4, fgu fgu2, ffk object5, fgr object6) {
        this.g = object;
        this.b = object2;
        this.c = fgu2;
        this.d = object5;
        this.e = object6;
        object = new ffu(this);
        object6 = ((gcv)object4).b.b();
        object2 = ((emh)((gcv)object4).d).a();
        Object object7 = ((gcv)object4).g.b();
        hpr hpr2 = (hpr)((gcv)object4).a.b();
        hpr2.getClass();
        object5 = (hpr)((gcv)object4).e.b();
        object5.getClass();
        ivu ivu2 = (ivu)((gcv)object4).c.b();
        ivu2.getClass();
        object4 = ((gcv)object4).f;
        object7 = (fkj)object7;
        this.f = new fgw((efh)object6, (jnu)object4, (emg)object2, (fkj)object7, hpr2, (hpr)object5, ivu2, fgu2, (ffk)object);
        int n2 = fgu2.M;
        int n3 = n2 - 1;
        if (n2 != 0) {
            if (n3 != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            object = ((bmu)((bmu)object3).c).E(fgu2, (fgr)object, (ffk)object);
                        } else {
                            object3 = (gpm)((bmu)object3).b;
                            object2 = (Executor)((gpm)object3).d.b();
                            object2.getClass();
                            object = new ffr(fgu2, (fgr)object, (ffk)object, (Executor)object2, ((fak)((gpm)object3).b).a(), ((fgp)((gpm)object3).a).a(), ((ffh)((gpm)object3).c).a());
                        }
                    } else {
                        object = ((bmu)((bmu)object3).c).E(fgu2, (fgr)object, (ffk)object);
                    }
                } else {
                    object = ((gfw)((bmu)object3).a).a(fgu2, (fgr)object, (ffk)object);
                }
            } else {
                object = fgu2.i ? ((gfw)((bmu)object3).a).a(fgu2, (fgr)object, (ffk)object) : ((bmu)((bmu)object3).c).E(fgu2, (fgr)object, (ffk)object);
            }
            this.h = object;
            return;
        }
        throw null;
    }

    public static boolean d(fex fex2) {
        return fex2.c.size() == 0 || ((String)fex2.c.get(0)).isEmpty();
        {
        }
    }

    public final void a() {
        ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient", "cancel", 90, "RecognitionClient.java")).r("#cancel");
        this.f.e();
        this.h.a();
    }

    public final void b() {
        ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient", "startListening", 76, "RecognitionClient.java")).r("#startListening");
        this.f.f();
        Object object = this.f;
        Objects.requireNonNull(object);
        object = new hsb(object, 1);
        fgw fgw2 = this.f;
        int n2 = fgw2.b();
        int n3 = Integer.bitCount(fgw2.a());
        this.h.c((Supplier)object, n2, n3);
    }

    public final void c() {
        ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/RecognitionClient", "stopListening", 85, "RecognitionClient.java")).r("#stopListening");
        this.f.e();
    }

    public final boolean e() {
        return this.c.m.isEmpty() && !this.c.t;
    }
}

