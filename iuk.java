/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

public final class iuk
implements Runnable {
    final Object a;
    private final int b;

    public iuk(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public /* synthetic */ iuk(Object object, int n2, byte[] byArray) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                Object object = (jeu)this.a;
                ((jeu)object).s = null;
                ((jeu)object).d.a(2, "CONNECTING after backoff");
                object = this.a;
                iui iui2 = iui.a;
                ((jeu)object).d(iui2);
                ((jeu)this.a).i();
                return;
            }
            case 19: {
                ((dml)((AmbientModeSupport$AmbientController)this.a).a).a.p(iyh.k.e("Keepalive failed. The connection is likely gone"));
                return;
            }
            case 18: {
                ((jdh)this.a).a.e();
                return;
            }
            case 17: {
                ((jdi)this.a).e.e();
                return;
            }
            case 16: {
                ((jdi)this.a).e.d();
                return;
            }
            case 15: {
                ((jdi)this.a).r();
                return;
            }
            case 14: {
                ((jdi)this.a).e.f();
                return;
            }
            case 13: {
                fxf.B(((jfh)((jdf)this.a).f).a.A.get(), "Channel must have been shut down");
                return;
            }
            case 12: {
                jfh jfh2 = (jfh)this.a;
                fxf.B(jfh2.a.A.get(), "Channel must have been shut down");
                jfs jfs2 = jfh2.a;
                jfs2.B = true;
                jfs2.j(false);
                jfh2.a.h();
                return;
            }
            case 11: {
                this.a.a(false);
                return;
            }
            case 10: {
                this.a.a(true);
                return;
            }
            case 9: {
                ((jdc)this.a).c.Y();
                return;
            }
            case 8: {
                ((jdd)this.a).b.d();
                return;
            }
            case 7: {
                jbu jbu2 = (jbu)this.a;
                ksb ksb2 = jbu2.b;
                if (ksb2 != null && ksb2.k()) {
                    ksb2.j();
                }
                jbu2.a = null;
                return;
            }
            case 6: {
                jbc jbc2 = (jbc)this.a;
                jge jge2 = jbc2.b;
                its its2 = jbc2.h;
                jge2.e();
                jbc2.h = its2;
                ((jbc)this.a).b.b();
                return;
            }
            case 5: {
                ((izg)this.a).l();
                return;
            }
            case 4: {
                Object object = this.a;
                synchronized (object) {
                    if (((izi)object).z(1)) {
                        ((izi)object).y(2);
                        ((izg)object).b.a();
                        ScheduledExecutorService scheduledExecutorService = ((izi)object).i;
                        Object object2 = new iuk(object, 5, null);
                        ((izg)object).d = object2 = scheduledExecutorService.schedule((Runnable)object2, ((izg)object).c, TimeUnit.MILLISECONDS);
                    }
                    return;
                }
            }
            case 3: {
                Object object = this.a;
                synchronized (object) {
                    if (((izi)object).z(4)) {
                        iyh iyh2 = ((izi)object).l;
                        ((izi)object).t(iyh2, true);
                    }
                    return;
                }
            }
            case 2: {
                ((izf)this.a).b();
                return;
            }
            case 1: {
                ((fvc)this.a).Y();
                return;
            }
            case 0: 
        }
        try {
            Object object = this.a;
            TimeoutException timeoutException = new TimeoutException("context timed out");
            ((iul)object).j(timeoutException);
            return;
        }
        catch (Throwable throwable) {
            ius.c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", throwable);
            return;
        }
    }
}

