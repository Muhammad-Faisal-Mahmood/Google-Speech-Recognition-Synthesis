/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.os.StrictMode$ThreadPolicy
 */
import android.content.Context;
import android.os.Looper;
import android.os.StrictMode;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class btu
implements imb {
    private final int a;
    private final Object b;

    public btu(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final /* synthetic */ Object b() {
        switch (this.a) {
            default: {
                return ((cwp)this.b).a();
            }
            case 19: {
                dad dad2 = ((cxx)this.b).a;
                idi.m(dad2);
                return dad2;
            }
            case 18: {
                return ((cxx)this.b).d;
            }
            case 17: {
                cqq cqq2 = ((cxx)this.b).j;
                idi.m(cqq2);
                return cqq2;
            }
            case 16: {
                return ((cwn)this.b).a();
            }
            case 15: {
                cyu cyu2 = ((cxx)this.b).i;
                idi.m(cyu2);
                return cyu2;
            }
            case 14: {
                gto gto2 = ((cxx)this.b).b;
                idi.m(gto2);
                return gto2;
            }
            case 13: {
                return ((cxv)this.b).a;
            }
            case 12: {
                Object object = ((cxv)this.b).b;
                idi.m(object);
                return object;
            }
            case 11: {
                Object object = ((cxu)this.b).b;
                idi.m(object);
                return object;
            }
            case 10: {
                Object object = ((cxu)this.b).a;
                idi.m(object);
                return object;
            }
            case 9: {
                Object object = ((imj)this.b).a();
                bav bav2 = new bav();
                object = object.iterator();
                while (object.hasNext()) {
                    bbz bbz2 = (bbz)object.next();
                    jse.e(bbz2, "workerFactory");
                    bav2.a.add(bbz2);
                }
                return bav2;
            }
            case 8: {
                Executor executor = (Executor)this.b.b();
                return new cxt(null);
            }
            case 7: {
                return new gkb(((bqw)this.b).a(), 1);
            }
            case 6: {
                bzq bzq2 = ((cox)this.b).a();
                ScheduledExecutorService scheduledExecutorService = new cog(cgw.l("Scheduler", new coe(0)));
                scheduledExecutorService.setRemoveOnCancelPolicy(true);
                scheduledExecutorService = bzq2.c(hhk.F(scheduledExecutorService));
                idi.m(scheduledExecutorService);
                return scheduledExecutorService;
            }
            case 5: {
                ThreadFactory threadFactory = (ThreadFactory)this.b.b();
                hqa hqa2 = new hqa();
                StrictMode.ThreadPolicy threadPolicy = cgw.i();
                new coc(cgw.l("Lite", new cod(threadFactory, 2)), threadPolicy).newThread(new cof(hqa2)).start();
                try {
                    threadPolicy = (Looper)a.h(hqa2);
                }
                catch (ExecutionException executionException) {
                    throw new RuntimeException(executionException);
                }
                idi.m(threadPolicy);
                return threadPolicy;
            }
            case 4: {
                return new bxf((Context)this.b.b());
            }
            case 3: {
                return new bwp((Context)this.b.b());
            }
            case 2: {
                Context context = ag$$ExternalSyntheticApiModelOutline1.m(((ilt)this.b).a());
                idi.m(context);
                return context;
            }
            case 1: {
                gzx gzx2 = gzx.o(((imj)this.b).a());
                idi.m(gzx2);
                return gzx2;
            }
            case 0: 
        }
        return new bxt(((btv)this.b).a());
    }
}

