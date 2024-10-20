/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

public final class dqp
extends dqn
implements dle,
dmw {
    public final Context a;
    public final iku b;
    public final Object c = new Object();
    public final iku d;
    public final jnu e;
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();
    public final cxu h;
    private final dmt i;
    private final hpr j;

    public dqp(dmu dmu2, Context context, dli dli2, hpr hpr2, iku iku2, iku iku3, jnu jnu2, Executor executor, cxu cxu2) {
        this.h = cxu2;
        this.i = dmu2.a(executor, iku2, jnu2);
        this.a = context;
        this.j = hpr2;
        this.b = iku2;
        this.d = iku3;
        this.e = jnu2;
        dli2.a(this);
    }

    @Override
    public final /* synthetic */ void L() {
    }

    @Override
    public final void a(dql object) {
        CharSequence charSequence;
        Object object2;
        int n2;
        if (((dql)object).b <= 0L && ((dql)object).c <= 0L && ((dql)object).d <= 0 && ((dql)object).e <= 0 && ((dql)object).q <= 0 && (n2 = ((dql)object).w) != 3 && n2 != 4 && ((dql)object).s <= 0) {
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).r("skip logging NetworkEvent due to empty bandwidth/latency data");
            object = hpj.a;
            return;
        }
        dmt dmt2 = this.i;
        Object object3 = ((dql)object).g;
        if (object3 != null && ((dql)object).h) {
            object2 = ((dql)object).f;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append((String)object2);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = ((dql)object).f;
        }
        object3 = ((dql)object).k;
        if (fxf.P((String)charSequence)) {
            object2 = "";
        } else {
            object2 = dqm.a.matcher(charSequence);
            if (((Matcher)object2).find()) {
                object2 = ((Matcher)object2).group(1);
            } else {
                object2 = dqm.c.matcher(charSequence);
                if (((Matcher)object2).find()) {
                    object2 = ((Matcher)object2).group(1);
                } else {
                    Matcher matcher = dqm.b.matcher(charSequence);
                    object2 = charSequence;
                    if (matcher.find()) {
                        object2 = charSequence;
                        if (object3 != null) {
                            object2 = charSequence;
                            if (!((String)object3).startsWith("application/")) {
                                object2 = matcher.group(1);
                            }
                        }
                    }
                }
            }
        }
        n2 = ((dql)object).u;
        if (n2 == 0) {
            charSequence = null;
        } else {
            switch (n2) {
                default: {
                    charSequence = "VPN";
                    break;
                }
                case 18: {
                    charSequence = "PROXY";
                    break;
                }
                case 17: {
                    charSequence = "MOBILE_EMERGENCY";
                    break;
                }
                case 16: {
                    charSequence = "MOBILE_IA";
                    break;
                }
                case 15: {
                    charSequence = "WIFI_P2P";
                    break;
                }
                case 14: {
                    charSequence = "MOBILE_CBS";
                    break;
                }
                case 13: {
                    charSequence = "MOBILE_IMS";
                    break;
                }
                case 12: {
                    charSequence = "MOBILE_FOTA";
                    break;
                }
                case 11: {
                    charSequence = "ETHERNET";
                    break;
                }
                case 10: {
                    charSequence = "DUMMY";
                    break;
                }
                case 9: {
                    charSequence = "BLUETOOTH";
                    break;
                }
                case 8: {
                    charSequence = "WIMAX";
                    break;
                }
                case 7: {
                    charSequence = "MOBILE_HIPRI";
                    break;
                }
                case 6: {
                    charSequence = "MOBILE_DUN";
                    break;
                }
                case 5: {
                    charSequence = "MOBILE_SUPL";
                    break;
                }
                case 4: {
                    charSequence = "MOBILE_MMS";
                    break;
                }
                case 3: {
                    charSequence = "WIFI";
                    break;
                }
                case 2: {
                    charSequence = "MOBILE";
                    break;
                }
                case 1: {
                    charSequence = "NONE";
                }
            }
        }
        object3 = new gtk(":");
        long l2 = dmt2.a(new gth((gtk)object3, (gtk)object3).e(object2, ((dql)object).k, charSequence, ((dql)object).i));
        if (l2 == -1L) {
            object = hpj.a;
            return;
        }
        this.g.incrementAndGet();
        hhk.P(new dqo(this, (dql)object, l2, 0), this.j);
    }

    public final hpn b(kfl kfl2) {
        Object object;
        Object object2;
        try {
            object2 = ((dqk)this.b.b()).b;
            object = new dox();
            ((gto)object2).e(object);
        }
        catch (Exception exception) {
            a.as(dkc.a.h(), "Exception while getting network metric extension!", "com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", '\u00bf', "NetworkMetricServiceImpl.java", exception);
        }
        object = this.i;
        object2 = dmq.a();
        ((fhc)object2).i(kfl2);
        ((fhc)object2).d = null;
        return ((dmt)object).b(((fhc)object2).e());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn c() {
        if (this.g.get() > 0) {
            cqg cqg2 = new cqg(this, 13);
            hpr hpr2 = this.j;
            return hhk.M(cqg2, 1L, TimeUnit.SECONDS, hpr2);
        }
        Object object = this.c;
        synchronized (object) {
            ArrayList arrayList;
            if (this.f.isEmpty()) {
                return hpj.a;
            }
            ArrayList arrayList2 = this.f;
            this.f = arrayList = new ArrayList(0);
            return hhk.P(new ctz(this, arrayList2, 12, null), this.j);
        }
    }

    @Override
    public final void i(djt djt2) {
        this.c();
    }

    @Override
    public final /* synthetic */ void j(djt djt2) {
    }
}

