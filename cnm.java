/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.libraries.assistant.soda.data.SodaDataProviderJni;

public final class cnm
implements hpb {
    final long a;
    final long b;
    final SodaDataProviderJni c;

    public cnm(SodaDataProviderJni sodaDataProviderJni, long l2, long l3) {
        this.a = l2;
        this.b = l3;
        this.c = sodaDataProviderJni;
    }

    @Override
    public final void a(Throwable throwable) {
        hyg hyg2 = ifi.a.l();
        Object object = ifg.a.l();
        Object object2 = throwable.getMessage();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        ifg ifg2 = (ifg)((hwp)object).b;
        object2.getClass();
        ifg2.b |= 1;
        ifg2.c = object2;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        object2 = (ifi)((hwp)hyg2).b;
        object = (ifg)((hwp)object).o();
        object.getClass();
        ((ifi)object2).c = object;
        ((ifi)object2).b = 1;
        hyg2 = (ifi)((hwp)hyg2).o();
        this.c.b.readLock().lock();
        try {
            object = this.c;
            if (!((SodaDataProviderJni)object).c) {
                ((SodaDataProviderJni)object).nativeHandleDataResponse(this.a, this.b, ((hvd)hyg2).g());
            } else {
                ((heg)((heg)SodaDataProviderJni.a.h()).j("com/google/android/libraries/assistant/soda/data/SodaDataProviderJni$1", "onFailure", 62, "SodaDataProviderJni.java")).u("Ignoring failed DataResponse because SODA has shut down. Failure reason: %s", throwable.getMessage());
            }
            return;
        }
        finally {
            this.c.b.readLock().unlock();
        }
    }
}

