/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build$VERSION
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 *  android.util.Log
 */
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

public final class dvr {
    public static final dlm g = new dlm();
    public final dua a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final dwm f;
    public final dml h;
    private final Object i = new Object();
    private final Set j;
    private volatile czh k;

    public dvr(dua dua2, String string, boolean bl2, Set set) {
        this.a = dua2;
        this.b = string;
        this.c = "";
        this.d = false;
        this.e = false;
        this.j = set;
        this.k = null;
        this.h = new dml(null);
        this.f = new dwm(dua2, string, "", bl2);
    }

    public final hpn a() {
        Object object;
        Object object2 = this.d();
        Object object3 = ((czh)object2).b();
        Object object4 = this.a.e.a();
        if (((dvh)object4).l) {
            if (fxf.P((String)object3) && !((dvh)object4).m) {
                return hpj.a;
            }
            object = dup.a.l();
            Object object5 = ((czh)object2).d;
            if (!((hwp)object).b.B()) {
                ((hwp)object).u();
            }
            object2 = (dup)((hwp)object).b;
            object5.getClass();
            ((dup)object2).d = (duo)object5;
            ((dup)object2).b |= 2;
            if (!fxf.P((String)object3)) {
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object2 = (dup)((hwp)object).b;
                object3.getClass();
                ((dup)object2).b |= 1;
                ((dup)object2).c = object3;
            }
            if (((dvh)object4).m) {
                object4 = this.b;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = (dup)((hwp)object).b;
                ((dup)object3).b |= 4;
                ((dup)object3).e = object4;
            }
            object = this.a.b().b((dup)((hwp)object).o());
        } else {
            if (fxf.P((String)object3)) {
                return hpj.a;
            }
            object = this.a.b().a((String)object3);
        }
        return hmv.g((hpn)object, dut.class, new cyc(this, 11), this.a.d());
    }

    public final void b() {
        dwm dwm2 = this.f;
        hpn hpn2 = dwm2.a(this.c);
        Objects.requireNonNull(dwm2);
        hno.g(hpn2, new cyc(dwm2, 10), this.a.d()).c(new dpw(this, hpn2, 7, null), this.a.d());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void c(hpn object) {
        void var1_4;
        Object object2;
        block12: {
            block10: {
                object2 = czh.j((dwn)hhk.S((Future)object));
                object = this.i;
                // MONITORENTER : object
                if (this.k == null) break block10;
                boolean bl2 = fvd.s((Map)this.k.a, ((czh)object2).a);
                // MONITOREXIT : object
                if (bl2) break block12;
                object = (dvy)((gto)this.a.d.a()).f();
                if (object == null) return;
                ((dvy)object).a();
                return;
            }
            this.k = object2;
            // MONITOREXIT : object
        }
        try {
            ((AtomicInteger)this.h.a).incrementAndGet();
            return;
        }
        catch (CancellationException cancellationException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        if (var1_4.getCause() instanceof SecurityException) return;
        object2 = this.b;
        StringBuilder stringBuilder = new StringBuilder("Unable to update local snapshot for ");
        stringBuilder.append((String)object2);
        stringBuilder.append(", may result in stale flags.");
        Log.w((String)"MobStoreFlagStore", (String)stringBuilder.toString(), (Throwable)var1_4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final czh d() {
        var5_2 = var6_1 = this.k;
        if (var6_1 != null) return var5_2;
        var12_17 = this.i;
        synchronized (var12_17) {
            block98: {
                block105: {
                    block104: {
                        block103: {
                            block102: {
                                block101: {
                                    block100: {
                                        block99: {
                                            var5_2 = var6_1 = this.k;
                                            if (var6_1 != null) return var5_2;
                                            var13_18 = StrictMode.allowThreadDiskWrites();
                                            var14_19 = this.f;
                                            var5_2 = hvu.b;
                                            var1_20 = gzx.d;
                                            var5_2 = hct.a;
                                            var15_21 = ((dua)var14_19.b).e;
                                            var3_22 = var14_19.a;
                                            var5_2 = "";
                                            if (!var3_22) break block99;
                                            var16_23 = var15_21.b();
                                            var9_24 = var16_23.d;
                                            var8_25 = var16_23.f;
                                            var10_26 = gzx.o(var16_23.g);
                                            var7_27 = gzx.o(var16_23.h);
                                            if ((var16_23.c & 8) != 0) {
                                                var6_1 = var11_29 = var16_23.j;
                                                if (var11_29 == null) {
                                                    var6_1 = dvj.a;
                                                }
                                                if (var6_1.d == (long)Build.VERSION.SDK_INT) {
                                                    var5_2 = var6_1 = var16_23.j;
                                                    if (var6_1 == null) {
                                                        var5_2 = dvj.a;
                                                    }
                                                    var5_2 = var5_2.c;
                                                }
                                            }
                                            var3_22 = var15_21.d();
                                            var6_1 = var9_24;
                                            var9_24 = var5_2;
                                            break block100;
                                        }
                                        var11_29 = var15_21.a();
                                        var9_24 = var11_29.d;
                                        var8_25 = var11_29.f;
                                        var10_26 = gzx.o(var11_29.h);
                                        var7_27 = gzx.o(var11_29.i);
                                        if ((var11_29.c & 16) == 0) ** GOTO lbl-1000
                                        var5_2 = var6_1 = var11_29.k;
                                        if (var6_1 == null) {
                                            var5_2 = dvj.a;
                                        }
                                        if (var5_2.d == (long)Build.VERSION.SDK_INT) {
                                            var5_2 = var6_1 = var11_29.k;
                                            if (var6_1 == null) {
                                                var5_2 = dvj.a;
                                            }
                                            var5_2 = var5_2.c;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var5_2 = "";
                                        }
                                        var3_22 = var15_21.e();
                                        var6_1 = var5_2;
                                        var5_2 = var9_24;
                                        var9_24 = var6_1;
                                        var6_1 = var5_2;
                                    }
                                    var4_30 = var14_19.c();
                                    var11_29 = new dwk(var4_30, (hvu)var6_1, (String)var8_25, (String)var9_24, (gzx)var10_26, (gzx)var7_27, var3_22);
                                    if (var11_29.g) break block101;
                                    var6_1 = duo.a.l();
                                    if (!var6_1.b.B()) {
                                        var6_1.u();
                                    }
                                    var5_2 = (duo)var6_1.b;
                                    var5_2.d = dpg.a(14);
                                    var5_2.b |= 2;
                                    var6_1 = (duo)var6_1.o();
                                    var5_2 = new dwl(null, (duo)var6_1);
                                    ** GOTO lbl233
                                }
                                if (var11_29.a) break block102;
                                var6_1 = duo.a.l();
                                if (!var6_1.b.B()) {
                                    var6_1.u();
                                }
                                var5_2 = (duo)var6_1.b;
                                var5_2.d = dpg.a(3);
                                var5_2.b |= 2;
                                var5_2 = new dwl(null, (duo)var6_1.o());
                                ** GOTO lbl233
                            }
                            if (!var11_29.b.x()) break block103;
                            var5_2 = duo.a.l();
                            if (!var5_2.b.B()) {
                                var5_2.u();
                            }
                            var6_1 = (duo)var5_2.b;
                            var6_1.d = dpg.a(4);
                            var6_1.b |= 2;
                            var5_2 = new dwl(null, (duo)var5_2.o());
                            ** GOTO lbl233
                        }
                        var5_2 = dtx.b((String)var14_19.d);
                        if (var11_29.e.isEmpty() || var11_29.e.contains(var5_2)) break block104;
                        var6_1 = duo.a.l();
                        if (!var6_1.b.B()) {
                            var6_1.u();
                        }
                        var5_2 = (duo)var6_1.b;
                        var5_2.d = dpg.a(5);
                        var5_2.b |= 2;
                        var5_2 = new dwl(null, (duo)var6_1.o());
                        ** GOTO lbl233
                    }
                    if (!var11_29.f.contains(var5_2)) break block105;
                    var5_2 = duo.a.l();
                    if (!var5_2.b.B()) {
                        var5_2.u();
                    }
                    var6_1 = (duo)var5_2.b;
                    var6_1.d = dpg.a(6);
                    var6_1.b |= 2;
                    var5_2 = new dwl(null, (duo)var5_2.o());
                    ** GOTO lbl233
                }
                var5_2 = var11_29.d;
                var3_22 = var5_2.isEmpty();
                if (!var3_22) ** GOTO lbl-1000
                ** GOTO lbl122
                {
                    catch (Throwable var5_16) {
                        throw var5_16;
                    }
                }
                {
                    block97: {
                        block96: {
                            catch (Exception var5_14) {
                                // empty catch block
                                break block96;
                            }
lbl122:
                            // 1 sources

                            try {
                                var5_2 = (gto)((dua)var14_19.b).f.a();
                                if (var5_2.g()) ** GOTO lbl147
                                dpf.d(Level.WARNING, ((dua)var14_19.b).d(), "Unable to get GMS application info, using defaults.", new Object[0]);
                                var6_1 = dvf.a;
                                var5_2 = duo.a.l();
                                var3_22 = var5_2.b.B();
                                if (!var3_22) {
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Exception var5_4) {
                                break block96;
                            }
                            {
                                var5_2.u();
                            }
lbl-1000:
                            // 2 sources

                            {
                                var8_25 = var5_2.b;
                                var7_27 = (duo)var8_25;
                                var7_27.c = a.A(3);
                                var7_27.b |= 1;
                                var3_22 = var8_25.B();
                                if (var3_22) ** GOTO lbl-1000
                            }
                            {
                                var5_2.u();
                            }
lbl-1000:
                            // 2 sources

                            {
                                var7_27 = (duo)var5_2.b;
                            }
                            {
                                block106: {
                                    var7_27.d = dpg.a(7);
                                    var7_27.b |= 2;
                                    var5_2 = new dwl((dvf)var6_1, (duo)var5_2.o());
                                    break block97;
lbl147:
                                    // 1 sources

                                    if (!var14_19.a) break block106;
                                    var1_20 = crt.a;
                                    var5_2 = ag$$ExternalSyntheticApiModelOutline1.m((ApplicationInfo)var5_2.c());
                                    ** GOTO lbl-1000
                                }
                                var5_2 = ((ApplicationInfo)var5_2.c()).dataDir;
                            }
lbl-1000:
                            // 3 sources

                            {
                                var8_25 = File.separator;
                                var7_27 = var11_29.c;
                                var6_1 = new StringBuilder();
                                var6_1.append((String)var5_2);
                                var6_1.append((String)var8_25);
                                var6_1.append((String)var7_27);
                                var5_2 = var6_1.toString();
                                var7_27 = var11_29.b;
                                var9_24 = var14_19.d;
                                var8_25 = (String)var14_19.e;
                                var6_1 = new bmu((hvu)var7_27, (String)var9_24, (String)var8_25);
                                var7_27 = new Uri.Builder();
                                var8_25 = var7_27.scheme("file");
                                var9_24 = File.separator;
                                var7_27 = File.separator;
                                var11_29 = var6_1.b;
                                var11_29 = (String)var11_29.a();
                                var15_21 = (String)var6_1.c.a();
                                var6_1 = new StringBuilder();
                                var6_1.append((String)var11_29);
                                var6_1.append("/");
                                var6_1.append((String)var15_21);
                                var6_1.append(".pb");
                                var10_26 = new File(var6_1.toString());
                                var10_26 = var10_26.toString();
                                var6_1 = new StringBuilder();
                                var6_1.append((String)var9_24);
                                var6_1.append((String)var5_2);
                                var6_1.append((String)var7_27);
                                var6_1.append((String)var10_26);
                                var5_2 = var8_25.appendEncodedPath(var6_1.toString()).build();
                                var6_1 = StrictMode.getThreadPolicy();
                                var7_27 = new StrictMode.ThreadPolicy.Builder((StrictMode.ThreadPolicy)var6_1);
                                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var7_27.permitDiskReads().build());
                            }
                            {
                                var8_25 = ((dua)var14_19.b).g();
                                var7_27 = new fqk(1);
                                var7_27 = (dvf)var8_25.w((Uri)var5_2, (fpp)var7_27);
                                var5_2 = duo.a.l();
                                if (!var5_2.b.B()) {
                                    var5_2.u();
                                }
                                var9_24 = var5_2.b;
                                var8_25 = (duo)var9_24;
                                var8_25.c = a.A(5);
                                var8_25.b |= 1;
                                if (!var9_24.B()) {
                                    var5_2.u();
                                }
                                var8_25 = (duo)var5_2.b;
                                var8_25.d = dpg.a(2);
                                var8_25.b |= 2;
                                var8_25 = (duo)var5_2.o();
                                var5_2 = new dwl((dvf)var7_27, (duo)var8_25);
                            }
                            {
                                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var6_1);
                                break block97;
                            }
                        }
                        dpf.c(Level.WARNING, ((dua)var14_19.b).d(), (Throwable)var5_2, "Failed to read shared file for %s", new Object[]{var14_19.d});
                        var6_1 = dvf.a;
                        var5_2 = duo.a.l();
                        if (!var5_2.b.B()) {
                            var5_2.u();
                        }
                        var7_27 = var5_2.b;
                        var8_25 = (duo)var7_27;
                        var8_25.c = a.A(3);
                        var8_25.b |= 1;
                        if (!var7_27.B()) {
                            var5_2.u();
                        }
                        var7_27 = (duo)var5_2.b;
                        var7_27.d = dpg.a(10);
                        var7_27.b |= 2;
                        var5_2 = new dwl((dvf)var6_1, (duo)var5_2.o());
                    }
                    if (var5_2.a != null) {
                        var1_20 = dwi.a;
                        dwi.a(new int[]{14903855});
                        var6_1 = var5_2.a;
                        fxf.K(var6_1);
                        var7_27 = var5_2.b;
                        var5_2 = new czh(null, (dvf)var6_1, (duo)var7_27);
                        break block98;
                    }
                    var1_20 = dwi.a;
                    dwi.a(new int[]{14903854});
                    var1_20 = var5_2.b.d;
                }
                switch (var1_20) {
                    default: {
                        var1_20 = 0;
                        break;
                    }
                    case 13: {
                        var1_20 = 15;
                        break;
                    }
                    case 12: {
                        var1_20 = 14;
                        break;
                    }
                    case 11: {
                        var1_20 = 13;
                        break;
                    }
                    case 10: {
                        var1_20 = 12;
                        break;
                    }
                    case 9: {
                        var1_20 = 11;
                        break;
                    }
                    case 8: {
                        var1_20 = 10;
                        break;
                    }
                    case 7: {
                        var1_20 = 9;
                        break;
                    }
                    case 6: {
                        var1_20 = 8;
                        break;
                    }
                    case 5: {
                        var1_20 = 7;
                        break;
                    }
                    case 4: {
                        var1_20 = 6;
                        break;
                    }
                    case 3: {
                        var1_20 = 5;
                        break;
                    }
                    case 2: {
                        var1_20 = 4;
                        break;
                    }
                    case 1: {
                        var1_20 = 3;
                        break;
                    }
                    case 0: {
                        var1_20 = 2;
                    }
                }
                var2_31 = var1_20;
                if (var1_20 == 0) {
                    var2_31 = 1;
                }
                ** try [egrp 23[TRYBLOCK] [78 : 2314->2653)] { 
lbl294:
                // 1 sources

                try {
                    var6_1 = ((dua)var14_19.b).g();
                    var5_2 = var14_19.c;
                    var7_27 = fqp.b(dwn.a);
                    var6_1 = (dwn)var6_1.w((Uri)var5_2, (fpp)var7_27);
                    var5_2 = duo.a.l();
                    if (!var5_2.b.B()) {
                        var5_2.u();
                    }
                    var8_25 = var5_2.b;
                    var7_27 = (duo)var8_25;
                    var7_27.c = a.A(4);
                    var7_27.b |= 1;
                    if (!var8_25.B()) {
                        var5_2.u();
                    }
                    var7_27 = (duo)var5_2.b;
                    var7_27.d = dpg.a(var2_31);
                    var7_27.b |= 2;
                    var7_27 = (duo)var5_2.o();
                    var5_2 = new czh((dwn)var6_1, null, (duo)var7_27);
                }
                catch (IOException | RuntimeException var5_15) {
                    dpf.d(Level.INFO, ((dua)var14_19.b).d(), "Unable to retrieve flag snapshot for %s, using defaults.", new Object[]{var14_19.d});
                    var6_1 = dwn.a;
                    var5_2 = duo.a.l();
                    if (!var5_2.b.B()) {
                        var5_2.u();
                    }
                    var8_25 = var5_2.b;
                    var7_27 = (duo)var8_25;
                    var7_27.c = a.A(3);
                    var7_27.b |= 1;
                    if (!var8_25.B()) {
                        var5_2.u();
                    }
                    var7_27 = (duo)var5_2.b;
                    var7_27.d = dpg.a(11);
                    var7_27.b |= 2;
                    var5_2 = new czh((dwn)var6_1, null, (duo)var5_2.o());
                }
            }
            var6_1 = this.a.e;
            if (!crt.d(var6_1.c) && var6_1.a().g + TimeUnit.HOURS.toMillis(24L) < System.currentTimeMillis()) {
                var6_1.c(true);
            } else {
                var6_1 = hpj.a;
            }
            if (!this.f.c() && var5_2.b().isEmpty()) {
                var6_1 = this.a.d();
                var5_2 = new dqv(this, 4);
                var6_1.execute((Runnable)var5_2);
                var6_1 = czh.j(dwn.a);
            } else {
                var6_1 = this.a.d();
                var7_27 = new dqv(this, 5);
                var6_1.execute((Runnable)var7_27);
                var7_27 = this.a.h;
                var6_1 = var5_2.b;
                if (var6_1 != null) {
                    var6_1 = ((dwn)var6_1).d;
                } else {
                    var6_1 = var5_2.c;
                    fxf.K(var6_1);
                    var6_1 = ((dvf)var6_1).c.c;
                }
                var7_27.d((hvu)var6_1, this.j, this.b, false);
                var7_27 = this.a.d();
                var6_1 = new dqv(this, 6);
                var7_27.execute((Runnable)var6_1);
                var6_1 = var5_2;
                if (this.f.c()) {
                    var7_27 = this.a.g;
                    var8_25 = hqn.d;
                    var9_24 = new dpg();
                    var6_1 = (dvy)((gto)var7_27.a.a()).f();
                    if (var6_1 == null) {
                        var6_1 = hpj.a;
                        var6_1 = var5_2;
                    } else {
                        var7_27.c.putIfAbsent(var8_25, var9_24);
                        if (var7_27.e == null) {
                            var8_25 = var7_27.d;
                            synchronized (var8_25) {
                                if (var7_27.e == null) {
                                    var9_24 = (dus)var7_27.b.a();
                                    var10_26 = new dvw((dvx)var7_27, (dvy)var6_1);
                                    var7_27.e = var9_24.g((dvw)var10_26);
                                }
                            }
                        }
                        var6_1 = var7_27.e;
                        var6_1 = var5_2;
                    }
                }
            }
            this.k = var6_1;
            return var6_1;
lbl381:
            // 1 sources

            finally {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var13_18);
            }
        }
    }
}

