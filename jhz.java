/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.util.Log
 */
import J.N;
import android.os.Process;
import android.util.Log;
import j$.time.Duration;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;
import org.chromium.base.TraceEvent;
import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

public final class jhz
implements Runnable {
    final Object a;
    private final int b;

    public jhz(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public /* synthetic */ jhz(Object object, int n2, byte[] byArray) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var1_1 = this.b;
        var2_2 = 0;
        switch (var1_1) {
            default: {
                ((CronetUrlRequest)this.a).f();
                var17_3 = ((CronetUrlRequest)this.a).c;
                synchronized (var17_3) {
                    break;
                }
            }
            case 19: {
                ((VersionSafeCallbacks$UrlRequestStatusListener)this.a).ah(-1);
                return;
            }
            case 18: {
                var17_4 = ((CronetUrlRequest)this.a).f;
                var18_30 = var17_4.h;
                synchronized (var18_30) {
                    var17_4.j = 2;
                }
                try {
                    var17_4.c.f();
                    var17_4.d = var7_45 = var17_4.b.a();
                    var17_4.e = var7_45;
                }
                catch (Throwable var18_31) {
                    var17_4.e(var18_31);
                }
                var18_30 = var17_4.h;
                synchronized (var18_30) {
                    var17_4.j = 3;
                }
                var17_4 = ((CronetUrlRequest)this.a).c;
                synchronized (var17_4) {
                    var19_49 = this.a;
                    if (((CronetUrlRequest)var19_49).m()) {
                        return;
                    }
                    var18_30 = ((CronetUrlRequest)var19_49).f;
                    var7_45 = ((CronetUrlRequest)var19_49).a;
                    var19_49 = var18_30.h;
                    synchronized (var19_49) {
                        var18_30.i = N.MA4X1aZa(var18_30, var7_45, var18_30.d);
                    }
                    ((CronetUrlRequest)this.a).l();
                    return;
                }
            }
            case 17: {
                ((CronetUrlRequest)this.a).d.k();
                return;
            }
            case 16: {
                try {
                    ((CronetUploadDataStream)this.a).d();
                    return;
                }
                catch (Exception var17_5) {
                    Log.e((String)"cr_".concat(String.valueOf(CronetUploadDataStream.a)), (String)"Exception thrown when closing", (Throwable)var17_5);
                    return;
                }
            }
            case 15: {
                var17_6 = ((CronetUploadDataStream)this.a).h;
                synchronized (var17_6) {
                    var18_32 = this.a;
                    if (((CronetUploadDataStream)var18_32).i == 0L) {
                        return;
                    }
                    CronetUploadDataStream.g((CronetUploadDataStream)var18_32);
                    ((CronetUploadDataStream)this.a).j = 1;
                }
                try {
                    ((CronetUploadDataStream)this.a).d();
                    var17_6 = this.a;
                    ((CronetUploadDataStream)var17_6).b.c((kpr)var17_6);
                    return;
                }
                catch (Exception var17_7) {
                    ((CronetUploadDataStream)this.a).e(var17_7);
                    return;
                }
            }
            case 14: {
                var17_8 = ((CronetUploadDataStream)this.a).h;
                synchronized (var17_8) {
                    var18_33 = this.a;
                    if (((CronetUploadDataStream)var18_33).i == 0L) {
                        return;
                    }
                    CronetUploadDataStream.g((CronetUploadDataStream)var18_33);
                    var18_33 = this.a;
                    if (((CronetUploadDataStream)var18_33).g == null) {
                        var18_33 = new IllegalStateException("Unexpected readData call. Buffer is null");
                        throw var18_33;
                    }
                    ((CronetUploadDataStream)var18_33).j = 0;
                }
                try {
                    ((CronetUploadDataStream)this.a).d();
                    var18_33 = this.a;
                    var17_8 = ((CronetUploadDataStream)var18_33).b;
                    var19_50 = ((CronetUploadDataStream)var18_33).g;
                    var17_8.b((kpr)var18_33, var19_50);
                    ((CronetUploadDataStream)this.a).f.incrementAndGet();
                    return;
                }
                catch (Exception var17_9) {
                    ((CronetUploadDataStream)this.a).e(var17_9);
                    return;
                }
            }
            case 13: {
                try {
                    var17_10 = this.a;
                    var19_51 = ((CronetBidirectionalStream)var17_10).b;
                    var18_34 = ((CronetBidirectionalStream)var17_10).D;
                    var19_51.a((knz)var17_10, var18_34);
                }
                catch (Exception var17_11) {
                    ((CronetBidirectionalStream)this.a).g("onCanceled", var17_11);
                }
                ((CronetBidirectionalStream)this.a).n.a();
                return;
            }
            case 12: {
                var17_12 = ((CronetBidirectionalStream)this.a).s;
                synchronized (var17_12) {
                    var18_35 = this.a;
                    if (((CronetBidirectionalStream)var18_35).k()) {
                        return;
                    }
                    ((CronetBidirectionalStream)var18_35).B = 2;
                }
                try {
                    var18_35 = this.a;
                    var17_12 = ((CronetBidirectionalStream)var18_35).b;
                    var19_52 = ((CronetBidirectionalStream)var18_35).D;
                    var17_12.d((knz)var18_35, var19_52);
                    return;
                }
                catch (Exception var17_13) {
                    ((CronetBidirectionalStream)this.a).h(var17_13);
                    return;
                }
            }
            case 11: {
                var20_57 = (CronetBidirectionalStream)this.a;
                var3_60 = var20_57.c();
                var6_61 = var20_57.y;
                var5_62 = var20_57.z;
                var17_14 = var20_57.D;
                if (var17_14 != null) {
                    var18_36 = var17_14.c();
                    var19_53 /* !! */  = var20_57.D;
                    var17_14 = var19_53 /* !! */ .d;
                    var1_1 = var19_53 /* !! */ .a;
                    var4_63 = var19_53 /* !! */ .c;
                } else {
                    var18_36 = Collections.emptyMap();
                    var17_14 = "";
                    var1_1 = 0;
                    var4_63 = false;
                }
                var11_64 = var20_57.x.c;
                if (var4_63 && var11_64 == 0L) {
                    var7_46 = 0L;
                    var9_65 = 0L;
                } else {
                    var19_53 /* !! */  = var20_57.f;
                    var7_46 = 0L;
                    while (var2_2 < var19_53 /* !! */ .length) {
                        var21_67 = var19_53 /* !! */ [var2_2];
                        var9_65 = var7_46;
                        if (var21_67 != null) {
                            var9_65 = var7_46 + (long)var21_67.length();
                        }
                        ++var2_2;
                        var7_46 = var9_65;
                    }
                    var9_65 = Math.max(0L, var11_64 - var7_46);
                }
                var13_68 = 0L;
                var15_69 = var20_57.x.d;
                if (var4_63 && var15_69 == 0L) {
                    var11_64 = 0L;
                } else {
                    var11_64 = jjj.W((Map)var18_36);
                    var13_68 = Math.max(0L, var15_69 - var11_64);
                }
                var18_36 = var20_57.x.b() != null && var20_57.x.c() != null ? Duration.ofMillis(var20_57.x.c().getTime() - var20_57.x.b().getTime()) : Duration.ofSeconds(0L);
                var19_53 /* !! */  = var20_57.x.b() != null && var20_57.x.a() != null ? Duration.ofMillis(var20_57.x.a().getTime() - var20_57.x.b().getTime()) : Duration.ofSeconds(0L);
                var22_70 = var20_57.a;
                var21_67 = var20_57.m;
                var17_14 = new kqv(var7_46, var9_65, var11_64, var13_68, var1_1, (Duration)var18_36, (Duration)var19_53 /* !! */ , (String)var17_14, var6_61, var5_62, jjj.X(var3_60), var20_57.o, var20_57.p, var20_57.q, true, var20_57.r);
                var21_67.d(var22_70.e, (kqv)var17_14);
                var20_57.a.k();
                return;
            }
            case 10: {
                var17_15 = (kpb)this.a;
                if (var17_15.i) {
                    var17_15.i = false;
                    return;
                }
                var17_15.c();
                return;
            }
            case 9: {
                var19_54 = this.a;
                var17_16 = TraceEvent.a(((knt)var19_54).c);
                var18_37 = ((knt)var19_54).f;
                synchronized (var18_37) {
                    var20_58 = ((knt)var19_54).g;
                    if (var20_58 == null) {
                    }
                    ** GOTO lbl185
                }
                {
                    return;
lbl185:
                    // 1 sources

                    var20_58 = (Runnable)var20_58.poll();
                }
                ** try [egrp 23[TRYBLOCK] [31 : 1436->1503)] { 
lbl187:
                // 1 sources

                var1_1 = ((knt)var19_54).b;
                if (var1_1 == 0 || var1_1 == 1) ** GOTO lbl195
                if (var1_1 != 2 && var1_1 != 3) {
                    if (var1_1 == 4 || var1_1 == 5) {
                        Process.setThreadPriority((int)-1);
                    }
                } else {
                    Process.setThreadPriority((int)0);
                }
                ** GOTO lbl196
lbl195:
                // 1 sources

                Process.setThreadPriority((int)10);
lbl196:
                // 3 sources

                var20_58.run();
                return;
lbl198:
                // 1 sources

                finally {
                    if (var17_16 != null) {
                        var17_16.close();
                    }
                }
            }
            case 8: {
                var18_39 = (jks)this.a;
                var17_18 = var18_39.n;
                var18_39.l.execute((Runnable)var17_18);
                var17_18 = ((jks)this.a).j;
                synchronized (var17_18) {
                    var18_39 = this.a;
                    ((jks)var18_39).u = 0x7FFFFFFF;
                    ((jks)var18_39).q();
                    return;
                }
            }
            case 7: {
                var18_40 = (jbm)this.a;
                var17_19 = var18_40.b.c;
                var7_47 = var18_40.a;
                var9_66 = Math.max(var7_47 + var7_47, var7_47);
                if (var17_19.compareAndSet(var7_47, var9_66) == false) return;
                jbn.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{var18_40.b.b, var9_66});
                return;
            }
            case 6: {
                try {
                    var18_41 = this.a;
                    var17_20 = ((jkb)var18_41).f;
                    if (var17_20 != null) {
                        var18_41 = ((jkb)var18_41).b;
                        var7_48 = var18_41.b;
                        if (var7_48 > 0L) {
                            var17_20.bK((klm)var18_41, var7_48);
                        }
                    }
                }
                catch (IOException var17_21) {
                    ((jkb)this.a).c.a(var17_21);
                }
                try {
                    var17_20 = ((jkb)this.a).f;
                    if (var17_20 != null) {
                        var17_20.close();
                    }
                }
                catch (IOException var17_22) {
                    ((jkb)this.a).c.a(var17_22);
                }
                try {
                    var17_20 = ((jkb)this.a).g;
                    if (var17_20 == null) return;
                    var17_20.close();
                    return;
                }
                catch (IOException var17_23) {
                    ((jkb)this.a).c.a(var17_23);
                    return;
                }
            }
            case 5: {
                var17_24 = iyh.c.e("Handshake timeout exceeded");
                ((jiz)this.a).c.k(var17_24);
                return;
            }
            case 4: {
                var18_42 = ((jig)this.a).a;
                var17_25 = new jhz(var18_42, 3);
                var18_42.c.b(var17_25);
                return;
            }
            case 3: {
                ((ixi)this.a).b();
                return;
            }
            case 2: {
                var17_26 = ((jia)this.a).b;
                if (var17_26.z != false) return;
                var17_26.v.e();
                return;
            }
            case 1: {
                var17_27 = (jid)this.a;
                if (var17_27.z != false) return;
                var17_27.v.e();
                return;
            }
            case 0: {
                jid.x(((jia)this.a).b);
                var18_43 = ((jia)this.a).b;
                var17_28 = var18_43.v;
                var19_55 = var18_43.F;
                var18_43 = var19_55.c;
                var20_59 /* !! */  = var19_55.b;
                var19_55 = (iwx)var19_55.a;
                var20_59 /* !! */  = (jck)var20_59 /* !! */ ;
                var17_28.a((iyh)var18_43, (jck)var20_59 /* !! */ , (iwx)var19_55);
                return;
            }
        }
        {
            var18_44 = this.a;
            if (((CronetUrlRequest)var18_44).m()) {
                return;
            }
            CronetUrlRequest.n((CronetUrlRequest)var18_44);
        }
        try {
            var19_56 = this.a;
            var18_44 = ((CronetUrlRequest)var19_56).e;
            var17_3 = ((CronetUrlRequest)var19_56).h;
            var18_44.d((kpt)var19_56, (kpv)var17_3);
            return;
        }
        catch (Exception var17_29) {
            ((CronetUrlRequest)this.a).j(var17_29);
            return;
        }
    }
}

