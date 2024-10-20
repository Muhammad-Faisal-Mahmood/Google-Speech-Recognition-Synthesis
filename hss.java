/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class hss
implements hnx {
    public final hrk a;
    public final AmbientModeSupport$AmbientController b;

    public /* synthetic */ hss(AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, hrk hrk2) {
        this.b = ambientModeSupport$AmbientController;
        this.a = hrk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        gol gol2 = fxf.aq("FrameworkChannel#getTransportChannel");
        Object object = this.a;
        Object object2 = this.b;
        try {
            Object object3;
            object2 = ((AmbientModeSupport$AmbientController)object2).a;
            fpk.b();
            Object object4 = (koc)object2.b();
            object2 = ((hrk)object).c.getHost();
            int n2 = ((hrk)object).c.getPort();
            a.s(object4, "cronetEngine");
            Object object5 = new jav((String)object2, n2, (koc)object4);
            object2 = object4 = ((hrk)object).g;
            if (object4 == null) {
                object2 = new kob(((hrk)object).b);
                object2 = ((kob)object2).b.b();
            }
            object4 = ((jav)object5).c;
            ((jfy)object4).m = object2;
            object2 = ((hrk)object).e;
            if (object2 != null) {
                object3 = new jjn(object2, 1);
                ((jfy)object4).g = object3;
            } else {
                ((jfy)object4).g = jfy.d;
            }
            object2 = ((hrk)object).d;
            if (object2 != null) {
                object3 = new jjn(object2, 1);
                ((jfy)object4).h = object3;
            } else {
                ((jfy)object4).h = jfy.d;
            }
            long l2 = ((hrk)object).l;
            object2 = TimeUnit.MILLISECONDS;
            ((jav)object5).c.l(l2, (TimeUnit)((Object)object2));
            n2 = ((hrk)object).m;
            boolean bl2 = n2 >= 0;
            fxf.r(bl2, "maxMessageSize must be >= 0");
            ((jav)object5).d = n2;
            object2 = ((hrk)object).f;
            if (object2 != null) {
                ((jav)object5).a = object2;
            }
            if ((object2 = ((hrk)object).i) != null) {
                object4 = ((hrc)object2).a().k();
                while (object4.hasNext()) {
                    if (((hrb)object4.next()).a() == null) continue;
                    ((jav)object5).c.q = true;
                    object4 = new gzs();
                    object3 = ((hrc)object2).a().k();
                    while (object3.hasNext()) {
                        Object object6 = (hrb)object3.next();
                        gzy gzy2 = new gzy();
                        Object object7 = new gzy();
                        ((gzy)object7).d("service", ((hrb)object6).c());
                        if (((hrb)object6).b() != null) {
                            object2 = ((hrb)object6).b().b;
                            n2 = ((String)object2).lastIndexOf(47);
                            object2 = n2 == -1 ? null : ((String)object2).substring(n2 + 1);
                            ((gzy)object7).d("method", object2);
                        }
                        gzy2.d("name", gzx.q(((gzy)object7).b()));
                        object7 = ((hrb)object6).a();
                        if (object7 != null && ((hra)object7).f()) {
                            object2 = new gzy();
                            ((gzy)object2).d("maxAttempts", ((hra)object7).d());
                            float f2 = ((hra)object7).b();
                            object6 = new StringBuilder();
                            ((StringBuilder)object6).append(f2);
                            ((StringBuilder)object6).append("s");
                            ((gzy)object2).d("initialBackoff", ((StringBuilder)object6).toString());
                            f2 = ((hra)object7).c();
                            object6 = new StringBuilder();
                            ((StringBuilder)object6).append(f2);
                            ((StringBuilder)object6).append("s");
                            ((gzy)object2).d("maxBackoff", ((StringBuilder)object6).toString());
                            ((gzy)object2).d("backoffMultiplier", ((hra)object7).a());
                            object7 = ((hra)object7).e();
                            object6 = new fiz(19);
                            ((gzy)object2).d("retryableStatusCodes", fvd.y((List)object7, (gte)object6));
                            gzy2.g(hac.j("retryPolicy", ((gzy)object2).b()));
                        }
                        ((gzs)object4).h(gzy2.b());
                    }
                    object2 = hac.j("methodConfig", ((gzs)object4).g());
                    ((jav)object5).c.s = jfy.k((Map)object2);
                    break;
                }
            }
            if ((object2 = ((hrk)object).j) != null) {
                n2 = (Integer)object2;
                ((jav)object5).g = true;
                ((jav)object5).h = n2;
            }
            if ((object2 = ((hrk)object).k) != null) {
                n2 = (Integer)object2;
                ((jav)object5).e = true;
                ((jav)object5).f = n2;
            }
            object2 = ((iuy)object5).i();
            object5 = ((hrk)object).h;
            object4 = new hsq(object5, 1);
            object = new csa((hsq)object4);
            object2 = hhk.K(fvc.T((itx)object2, new iua[]{object}));
            return object2;
        }
        finally {
            gol2.close();
        }
    }
}

