/*
 * Decompiled with CFR 0.152.
 */
public final class eus
implements hpb {
    final int a;
    final Object b;
    private final int c;

    public eus(enw enw2, int n2, int n3) {
        this.c = n3;
        this.a = n2;
        this.b = enw2;
    }

    public eus(jnf jnf2, int n2, int n3) {
        this.c = n3;
        this.b = jnf2;
        this.a = n2;
    }

    @Override
    public final void a(Throwable throwable) {
        if (this.c != 0) {
            return;
        }
        ((heg)((heg)euu.a.h().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl$2", "onFailure", 297, "AudioServiceImpl.java")).s("#audio# Failed to get HotwordStopListeningStatus. sessionToken: %d", this.a);
        ecy ecy2 = elb.g(ebp.l, ebv.b);
        this.b.c(ecy2);
        this.b.b(throwable);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        if (this.c != 0) {
            object = (ebq)object;
            if (((ebq)object).b == 1) {
                Object object2;
                Object object3 = this.b;
                hwp hwp2 = edd.a.l();
                if (((ebq)object).b == 1) {
                    object = object2 = ebr.b((Integer)((ebq)object).c);
                    if (object2 == null) {
                        object = ebr.a;
                    }
                } else {
                    object = ebr.a;
                }
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object2 = (edd)hwp2.b;
                ((edd)object2).d = ((ebr)object).d;
                ((edd)object2).c = 3;
                int n2 = this.a;
                if (!hwp2.b.B()) {
                    hwp2.u();
                }
                object = (edd)hwp2.b;
                object2 = ((enw)object3).c;
                ((edd)object).e = n2 - 1;
                ((edd)object).b |= 1;
                object = (edd)hwp2.o();
                ((emj)object2).b();
            }
            return;
        }
        object = (ecy)object;
        this.b.c(object);
        this.b.a();
    }
}

