/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executor;

public final class dqr
extends kpm {
    public dqr(Executor executor) {
        super(executor);
    }

    @Override
    public final void a(kpo object) {
        if (djv.a().a.e()) {
            int n2;
            Object object2;
            Object object3 = ((kpo)object).d;
            if (object3 == null) {
                ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 72, "RequestFinishedListener.java")).r("un-expected null metrics from cronet's RequestFinishedListener, skipping current request");
                return;
            }
            if (((kpo)object).a() != null) {
                object2 = ((kpo)object).a().iterator();
                while (object2.hasNext()) {
                    if (!(object2.next() instanceof crz)) continue;
                    ((heg)((heg)dkc.a.e()).j("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 81, "RequestFinishedListener.java")).r("onRequestFinished is skipped due to PrimesCronetMonitorIgnoreAnnotation");
                    return;
                }
            }
            long l2 = (object2 = ((kpn)(object3 = (kpn)object3)).b()) == null ? cgw.p().toEpochMilli() : ((Date)object2).getTime();
            object2 = new dql(null, (String)((kpo)object).b, false, l2);
            Object object4 = ((kpo)object).e;
            if (object4 != null && (object4 = ((kpv)object4).c()) != null && (object4 = (List)object4.get("Content-Type")) != null && !object4.isEmpty()) {
                ((dql)object2).k = (String)object4.get(0);
            }
            ((dql)object2).d = ((kpn)object3).d.intValue();
            ((dql)object2).e = ((kpn)object3).c.intValue();
            object4 = ((kpn)object3).a;
            if (object4 != null) {
                ((dql)object2).b = (Long)object4;
            }
            if ((object3 = ((kpn)object3).b) != null) {
                ((dql)object2).c = (Long)object3;
            }
            if ((object3 = ((kpo)object).e) != null) {
                object3 = (kpv)object3;
                n2 = ((kpv)object3).a;
                if (n2 >= 0) {
                    ((dql)object2).j = n2;
                }
                if ((object3 = ((kpv)object3).d) != null && !((String)object3).isEmpty()) {
                    ((dql)object2).i = object3;
                }
            }
            n2 = ((kpo)object).a;
            int n3 = 4;
            n2 = n2 != 0 ? (n2 != 1 ? 4 : 3) : 2;
            ((dql)object2).w = n2;
            object = ((kpo)object).f;
            if (object != null) {
                if (object instanceof kpc) {
                    n2 = n3;
                    switch (((kpc)object).a()) {
                        default: {
                            n2 = 1;
                            break;
                        }
                        case 11: {
                            n2 = 13;
                            break;
                        }
                        case 10: {
                            n2 = 12;
                            break;
                        }
                        case 9: {
                            n2 = 11;
                            break;
                        }
                        case 8: {
                            n2 = 10;
                            break;
                        }
                        case 7: {
                            n2 = 9;
                            break;
                        }
                        case 6: {
                            n2 = 8;
                            break;
                        }
                        case 5: {
                            n2 = 7;
                            break;
                        }
                        case 4: {
                            n2 = 6;
                            break;
                        }
                        case 3: {
                            n2 = 5;
                            break;
                        }
                        case 1: {
                            n2 = 3;
                        }
                        case 2: 
                    }
                    ((dql)object2).o = n2 - 1;
                } else {
                    ((dql)object2).o = object instanceof koa ? 1 : 0;
                }
                if (object instanceof kpi) {
                    ((dql)object2).p = ((kpi)object).b();
                }
            }
            ((dql)object2).m = 1;
            djv.a().d((dql)object2);
            return;
        }
        ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 61, "RequestFinishedListener.java")).r("onRequestFinished is skipped as primes preconditions failed.");
    }
}

