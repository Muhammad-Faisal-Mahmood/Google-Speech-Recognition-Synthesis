/*
 * Decompiled with CFR 0.152.
 */
public final class enw
implements hpb {
    final int a;
    final Object b;
    public final Object c;
    private final int d;

    public enw(Object object, int n2, Object object2, int n3) {
        this.d = n3;
        this.a = n2;
        this.b = object2;
        this.c = object;
    }

    @Override
    public final void a(Throwable object) {
        if (this.d != 0) {
            return;
        }
        a.as(enx.a.h().h(hfo.a, "ALT.AudioOpChecker"), "#audio# Failed getting StopListeningStatus future", "com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker$1$1", "onFailure", '\u0095', "RecordAudioOpChecker.java", (Throwable)object);
        object = this.b;
        ((enx)((eut)this.c).d).b((String)object);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        if (this.d != 0) {
            object = (ebt)object;
            if (((ebt)object).b == 1) {
                Object object2;
                Object object3 = this.c;
                hwp hwp2 = edd.a.l();
                if (((ebt)object).b == 1) {
                    object = object2 = ebu.b((Integer)((ebt)object).c);
                    if (object2 == null) {
                        object = ebu.a;
                    }
                } else {
                    object = ebu.a;
                }
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (edd)hwp2.b;
                ((edd)object2).d = ((ebu)object).e;
                ((edd)object2).c = 2;
                int n2 = this.a;
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (edd)hwp2.b;
                ((edd)object).e = n2 - 1;
                ((edd)object).b |= 1;
                object = (edd)hwp2.o();
                ((emj)object3).b();
                hhk.T((hpn)this.b, gqk.g(new eus(this, this.a, 1)), ((emj)this.c).a);
            }
            return;
        }
        object = (eas)object;
        heg heg2 = (heg)((heg)enx.a.c().h(hfo.a, "ALT.AudioOpChecker")).j("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker$1$1", "onSuccess", 141, "RecordAudioOpChecker.java");
        object = this.b;
        heg2.x("#audio# finishOp, session=%d, tag=%s", this.a, object);
        object = this.b;
        ((enx)((eut)this.c).d).b((String)object);
    }
}

