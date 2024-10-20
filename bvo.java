/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class bvo {
    public static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer");
    public ExecutorService b;
    public final Object c = new Object();
    public Future d;
    public volatile boolean e = false;
    public bvs f;
    private final Context g;
    private final bxt h;

    public bvo(Context context, bxt bxt2) {
        this.g = context;
        this.h = bxt2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final hti b(bvt object, bsj bsj2, int n2, bws bws2) {
        if (n2 > 0) {
            bws2.a(a.af(n2, "Retry"));
        }
        Object object2 = this.c;
        synchronized (object2) {
            if (this.e) {
                this.e = false;
                return new hti(-2, (Object)null);
            }
            try {
                ExecutorService executorService = this.b;
                bvn bvn2 = new bvn((bvt)object, this.h);
                this.d = executorService.submit(gqk.j(bvn2));
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                ((heg)((heg)a.g()).j("com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "synthesizeText", 307, "NetworkSynthesizer.java")).r("The Future rejected our NetworkFetchTask");
                bws2.a("FutureRejectedNetworkFetchTask");
                return new hti(-4, (Object)null);
            }
        }
        int n3 = ((bvt)object).e;
        ++n2;
        try {
            object2 = (gto)this.d.get(((bvt)object).d, TimeUnit.MILLISECONDS);
        }
        catch (CancellationException cancellationException) {
            Object object3 = this.c;
            synchronized (object3) {
                this.e = false;
            }
            bws2.a("CancellationException");
            return new hti(-2, (Object)null);
        }
        catch (TimeoutException timeoutException) {
            this.d.cancel(false);
            if (n2 <= n3) {
                return this.b((bvt)object, bsj2, n2, bws2);
            }
            ((heg)((heg)a.g()).j("com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "synthesizeText", 339, "NetworkSynthesizer.java")).r("We timed out and used all of our retries, failing synthesis request");
            bws2.a("TimeOutLastRequest");
            return new hti(-7, (Object)null);
        }
        catch (ExecutionException executionException) {
            a.as(a.g(), "ExecutionException during NetworkFetchTask", "com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "synthesizeText", '\u0143', "NetworkSynthesizer.java", executionException);
            if (executionException.getCause() instanceof IOException && n2 <= n3) {
                bws2.a("IOException");
                return this.b((bvt)object, bsj2, n2, bws2);
            }
            bws2.a("ExcecutionException");
            if (!(executionException.getCause() instanceof IOException)) return new hti(-4, (Object)null);
            return new hti(-6, (Object)null);
        }
        catch (InterruptedException interruptedException) {
            a.as(a.g(), "The Future was interrupted during our NetworkFetchTask", "com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "synthesizeText", '\u013f', "NetworkSynthesizer.java", interruptedException);
            bws2.a("FutureWasInterrupted");
            return new hti(-4, (Object)null);
        }
        if (((gto)object2).g()) {
            return new hti(0, (dvy)((gto)object2).c());
        }
        bws2.a("HolderNull");
        return new hti(-4, (Object)null);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int a(brv object, bso object2, bsj object3, bws object4) {
        int n2;
        Object object522;
        Object object6;
        Object object7;
        String string;
        Object object8;
        int n3;
        Object object9;
        block60: {
            block61: {
                block58: {
                    block59: {
                        object9 = this.c;
                        // MONITORENTER : object9
                        this.e = false;
                        // MONITOREXIT : object9
                        object9 = brz.k((String)((bso)object2).j().get(0));
                        n3 = ((String[])object9).length;
                        object8 = n3 > 0 ? object9[0] : "";
                        string = n3 > 1 ? object9[1] : "";
                        try {
                            if (((brv)object).h != null) {
                                object9 = null;
                            } else {
                                object9 = bry.b(((brv)object).d());
                                if (!((gto)object9).g()) break block58;
                                object7 = ((gto)object9).c();
                                object9 = ((bso)object2).i();
                                object6 = ((brv)object).c();
                                object9 = bzy.a((brv)object, (bry)object7, (List)object9, null, false, (String)object6);
                            }
                            fxf.K(((bso)object2).o());
                            object6 = ((brv)object).h;
                            if (object6 != null) {
                                if ((((ikd)object6).b & 1) == 0) {
                                    ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "buildLucidMarkupInputText", 247, "NetworkSynthesizer.java")).r("Cannot use non-Lucid Text proto.");
                                    object = new IllegalArgumentException("InvalidProtoInput");
                                    throw object;
                                }
                                object6 = (hwr)ikd.a.m((hwv)object6);
                            } else {
                                if (object9 == null) {
                                    object6 = null;
                                    break block59;
                                }
                                object522 = (hwr)iiu.a.l();
                                Iterator iterator = object9.iterator();
                                while (iterator.hasNext()) {
                                    object6 = object7 = ((ikd)((hwr)((bxt)iterator.next()).a).b).c;
                                    if (object7 == null) {
                                        object6 = iiu.a;
                                    }
                                    object7 = ((iiu)object6).c;
                                    if (!((hwp)object522).b.B()) {
                                        ((hwp)object522).u();
                                    }
                                    object6 = (iiu)((hwr)object522).b;
                                    ((iiu)object6).G();
                                    hvc.g((Iterable)object7, ((iiu)object6).c);
                                }
                                object6 = (hwr)ikd.a.l();
                                object7 = (iiu)((hwp)object522).o();
                                if (!((hwp)object6).b.B()) {
                                    ((hwp)object6).u();
                                }
                                object522 = (ikd)((hwr)object6).b;
                                object7.getClass();
                                ((ikd)object522).c = object7;
                                ((ikd)object522).b |= 1;
                            }
                            if (((brv)object).e()) {
                                ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "buildLucidMarkupInputText", 263, "NetworkSynthesizer.java")).r("Network request with language detection");
                                object7 = iii.a.l();
                                if (!((hwp)object7).b.B()) {
                                    ((hwp)object7).u();
                                }
                                object522 = (iii)((hwp)object7).b;
                                ((iii)object522).b |= 1;
                                ((iii)object522).c = "x-detect";
                                object7 = (iii)((hwp)object7).o();
                                ((hwr)object6).aH(iii.d, object7);
                            }
                            object6 = (ikd)((hwp)object6).o();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            String string2 = illegalArgumentException.getMessage();
                            if (string2 == null) return -4;
                            ((bws)object4).a(string2);
                            return -4;
                        }
                    }
                    object7 = new bzs();
                    object522 = this.g;
                    n3 = ((brv)object).f;
                    object522 = ((bzs)object7).a(object522.getPackageManager(), n3);
                    n2 = kh.j((Context)this.g).versionCode;
                    object7 = new bvt();
                    try {
                        if (brv.o("networkTimeoutMs", ((brv)object).g)) {
                            n3 = brv.n("networkTimeoutMs", ((brv)object).g);
                            break block60;
                        }
                        if (!brv.o("com.google.android.tts:NetworkTimeout", ((brv)object).g)) break block61;
                        n3 = brv.n("com.google.android.tts:NetworkTimeout", ((brv)object).g);
                        break block60;
                    }
                    catch (NumberFormatException numberFormatException) {}
                }
                ((heg)((heg)a.f()).j("com/google/android/apps/speech/tts/googletts/network/NetworkSynthesizer", "buildMappedSentencesFromPlainText", 213, "NetworkSynthesizer.java")).C("Cannot create locale from request %s-%s from request", object8, string);
                object = new IllegalArgumentException("ISO3LocaleConversionFailure");
                throw object;
            }
            n3 = -1;
        }
        int n4 = n3;
        if (n3 < 0) {
            n4 = ((brv)object).l() ? 10000 : 2000;
        }
        if (brv.o("networkRetriesCount", ((brv)object).g)) {
            try {
                n3 = brv.n("networkRetriesCount", ((brv)object).g);
            }
            catch (NumberFormatException numberFormatException) {}
        }
        n3 = -1;
        if (n3 < 0) {
            n3 = 0;
        }
        ((bvt)object7).a = ((brv)object).a.toString();
        ((bvt)object7).d = n4;
        ((bvt)object7).f = new brx((String)object8, string);
        ((bvt)object7).e = n3;
        ((bvt)object7).i = ((brv)object).a();
        ((bvt)object7).h = (float)((brv)object).d / 100.0f;
        ((bvt)object7).c = object522;
        ((bvt)object7).j = String.valueOf(n2);
        ((bvt)object7).g = gto.h(((bso)object2).o());
        if (object6 != null) {
            block62: {
                object = object2 = ((ikd)object6).c;
                if (object2 == null) {
                    object = iiu.a;
                }
                for (Object object522 : ((iiu)object).c) {
                    object2 = ((iit)object522).b == 2 ? (iix)((iit)object522).c : iix.a;
                    object2 = object8 = ((iix)object2).d;
                    if (object8 == null) {
                        object2 = iis.a;
                    }
                    object2 = object8 = ((iis)object2).g;
                    if (object8 == null) {
                        object2 = ikb.a;
                    }
                    if (((ikb)object2).b.isEmpty()) continue;
                    object = ((iit)object522).b == 2 ? (iix)((iit)object522).c : iix.a;
                    object = object2 = ((iix)object).d;
                    if (object2 == null) {
                        object = iis.a;
                    }
                    object = object2 = ((iis)object).g;
                    if (object2 == null) {
                        object = ikb.a;
                    }
                    object = gto.i(((ikb)object).b);
                    break block62;
                }
                object2 = object8 = ((iiu)object).d;
                if (object8 == null) {
                    object2 = iis.a;
                }
                object2 = object8 = ((iis)object2).g;
                if (object8 == null) {
                    object2 = ikb.a;
                }
                if (!((ikb)object2).b.isEmpty()) {
                    object = object2 = ((iiu)object).d;
                    if (object2 == null) {
                        object = iis.a;
                    }
                    object = object2 = ((iis)object).g;
                    if (object2 == null) {
                        object = ikb.a;
                    }
                    object = gto.i(((ikb)object).b);
                } else {
                    object = gsl.a;
                }
            }
            if (((gto)object).g()) {
                ((bvt)object7).g = object;
            }
            object2 = ica.a.l();
            if (!((hwp)object2).b.B()) {
                ((hwp)object2).u();
            }
            object = (ica)((hwp)object2).b;
            ((ica)object).c = object6;
            ((ica)object).b = 4;
            object2 = (ica)((hwp)object2).o();
            object = (hwr)iij.a.l();
            ((hwr)object).aH(icb.a, object2);
            ((bvt)object7).b = (iij)((hwp)object).o();
        }
        ((bws)object4).p = new bwt();
        object = this.b((bvt)object7, (bsj)object3, 0, (bws)object4);
        boolean bl2 = ((hti)object).a == 0;
        a.s(((bws)object4).p, "Call startNetworkRequest() before endNetworkRequest()");
        if (bl2) {
            ((bws)object4).p.b(new djt("Network.fetch"));
        } else {
            ((bws)object4).p.b(new djt("Network.fetchFailure"));
        }
        ((bws)object4).m = bl2;
        object2 = ((hti)object).b;
        if (object2 == null) return ((hti)object).a;
        object = this.c;
        // MONITORENTER : object
        if (this.e) {
            this.e = false;
            // MONITOREXIT : object
            return -2;
        }
        // MONITOREXIT : object
        object6 = new ai(object2, object9, object3, 10);
        object9 = this.c;
        // MONITORENTER : object9
        this.f = object = new bvs(this.g, (bsj)object3, (bws)object4, (Runnable)object6);
        // MONITOREXIT : object9
        object3 = new bvp(new agm((byte[])((dvy)object2).b), 0);
        object4 = new AmbientMode$AmbientController(new bvq(0), null);
        object2 = new wb(null);
        object2 = wb.f(aef.a(bvs.b), (agq)object3, (AmbientMode$AmbientController)object4, (wb)object2);
        ((bvs)object).i.post((Runnable)new aks(object, object2, 18, null));
        object3 = ((bvs)object).i;
        object2 = ((bvs)object).h;
        Objects.requireNonNull(object2);
        object3.post((Runnable)new bpv(object2, 14));
        long l2 = System.currentTimeMillis();
        object2 = ((bvs)object).d;
        // MONITORENTER : object2
        while (true) {
            if (System.currentTimeMillis() < l2 + 180000L && !(bl2 = ((bvs)object).f)) {
                ((bvs)object).d.wait(180000L);
            }
            if (!((bvs)object).e && ((bvs)object).g != -5) {
                ((heg)((heg)bvs.a.f()).j("com/google/android/apps/speech/tts/googletts/network/OggPlayer", "decode", 134, "OggPlayer.java")).u("Forcing start call, synthesisDone=%s", ((bvs)object).f);
                ((bvs)object).j.start(16000, 2, 1);
                ((bvs)object).c.run();
            }
            ((bvs)object).i.post((Runnable)new bpv(object, 15));
            return ((bvs)object).g;
            catch (InterruptedException interruptedException) {
            }
        }
    }
}

