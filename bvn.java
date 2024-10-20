/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class bvn
implements Callable {
    private static final hei a = hei.m("com/google/android/apps/speech/tts/googletts/network/NetworkFetchTask");
    private final bvt b;
    private final bxt c;

    public bvn(bvt bvt2, bxt bxt2) {
        this.b = bvt2;
        this.c = bxt2;
    }

    private final String a(iba object) {
        Object object2;
        int n2 = ((iba)object).c;
        String string = ((iba)object).d;
        if ((((iba)object).b & 8) != 0) {
            object = object2 = ((iba)object).e;
            if (object2 == null) {
                object = iba.a;
            }
            object = ", ".concat(this.a((iba)object));
        } else {
            object = "";
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(n2);
        ((StringBuilder)object2).append(" ");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append((String)object);
        return ((StringBuilder)object2).toString();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final /* synthetic */ Object call() {
        block35: {
            block36: {
                cry.a();
                var8_1 = this.c;
                var7_2 = new iwx();
                var10_7 = iwx.b;
                var9_8 = new iwm("X-Goog-Api-Key", (iwn)var10_7);
                var7_2.g((iws)var9_8, var8_1.a);
                var10_7 = iwx.b;
                var9_8 = new iwm("X-Android-Package", (iwn)var10_7);
                var7_2.g((iws)var9_8, var8_1.b);
                var8_1 = new jkk(jeb.d("speechs3proto2-pa.googleapis.com", 443));
                var9_8 = new hsq(var7_2, 2);
                var7_2 = var8_1.c;
                var9_8 = Arrays.asList(new iua[]{var9_8});
                var7_2.i.addAll(var9_8);
                var8_1 = var8_1.i();
                var7_2 = itw.a.f(jmw.b, (Object)jmt.a);
                var9_8 = new jml((itx)var8_1, (itw)var7_2);
                var5_9 = this.b.d;
                var10_7 = TimeUnit.MILLISECONDS;
                var7_2 = var9_8.a;
                var9_8 = var9_8.b.b(iut.c(var5_9, (TimeUnit)var10_7));
                var10_7 = new jml((itx)var7_2, (itw)var9_8);
                var7_2 = iif.a.l();
                var12_10 = this.b.f.toString();
                if (!var7_2.b.B()) {
                    var7_2.u();
                }
                var9_8 = var7_2.b;
                var11_11 = (iif)var9_8;
                var12_10.getClass();
                var11_11.b |= 8192;
                var11_11.j = var12_10;
                if (!var9_8.B()) {
                    var7_2.u();
                }
                var9_8 = (iif)var7_2.b;
                var9_8.i = 7;
                var9_8.b |= 256;
                var1_12 = Math.max(0.0f, Math.min(1.0f, (float)(Math.log(this.b.h) * 0.30000001192092896 / Math.log(2.0) + 0.5)));
                if (!var7_2.b.B()) {
                    var7_2.u();
                }
                var9_8 = (iif)var7_2.b;
                var9_8.e = 8;
                var9_8.f = var1_12;
                var1_12 = this.b.i;
                if (!var7_2.b.B()) {
                    var7_2.u();
                }
                var9_8 = (iif)var7_2.b;
                var9_8.c = 27;
                var9_8.d = var1_12;
                if (!var7_2.b.B()) {
                    var7_2.u();
                }
                var11_11 = var7_2.b;
                var9_8 = var11_11;
                var9_8.b |= 32768;
                var9_8.l = 24000;
                if (!var11_11.B()) {
                    var7_2.u();
                }
                var9_8 = var7_2.b;
                var11_11 = (iif)var9_8;
                var11_11.b |= 0x100000;
                var11_11.m = true;
                var12_10 = this.b;
                var11_11 = var12_10.b;
                if (var11_11 == null) {
                    var11_11 = var12_10.a;
                    if (!var9_8.B()) {
                        var7_2.u();
                    }
                    var9_8 = (iif)var7_2.b;
                    var11_11.getClass();
                    var9_8.b |= 1;
                    var9_8.g = var11_11;
                } else {
                    if (!var9_8.B()) {
                        var7_2.u();
                    }
                    var9_8 = (iif)var7_2.b;
                    var9_8.h = var11_11;
                    var9_8.b |= 8;
                }
                if (this.b.g.g()) {
                    var11_11 = (String)this.b.g.c();
                    if (!var7_2.b.B()) {
                        var7_2.u();
                    }
                    var9_8 = (iif)var7_2.b;
                    var9_8.b |= 16384;
                    var9_8.k = var11_11;
                }
                var9_8 = icx.a.l();
                if (!var9_8.b.B()) {
                    var9_8.u();
                }
                icx.c((icx)var9_8.b);
                var12_10 = String.valueOf(Build.VERSION.SDK_INT);
                if (!var9_8.b.B()) {
                    var9_8.u();
                }
                var13_13 = var9_8.b;
                var11_11 = (icx)var13_13;
                var12_10.getClass();
                var11_11.b = 8 | var11_11.b;
                var11_11.c = var12_10;
                if (!var13_13.B()) {
                    var9_8.u();
                }
                var11_11 = var9_8.b;
                var12_10 = (icx)var11_11;
                var12_10.b |= 16;
                var12_10.d = "googletts";
                var12_10 = this.b.j;
                if (!var11_11.B()) {
                    var9_8.u();
                }
                var11_11 = var9_8.b;
                var13_13 = (icx)var11_11;
                var12_10.getClass();
                var13_13.b |= 32;
                var13_13.e = var12_10;
                var12_10 = "android-tts/".concat(String.valueOf(this.b.c));
                if (!var11_11.B()) {
                    var9_8.u();
                }
                var11_11 = (icx)var9_8.b;
                var11_11.b |= 2048;
                var11_11.g = var12_10;
                var11_11 = (icx)var9_8.o();
                var9_8 = (hwr)idj.a.l();
                var13_13 = (hwr)ida.a.l();
                if (!var13_13.b.B()) {
                    var13_13.u();
                }
                var12_10 = (ida)var13_13.b;
                var12_10.b |= 1;
                var12_10.c = "synthesizer";
                var13_13.aH(icx.h, var11_11);
                var9_8.aE((hwr)var13_13);
                var11_11 = (hwr)ida.a.l();
                var11_11.aH(iif.n, (iif)var7_2.o());
                var9_8.aE((hwr)var11_11);
                var7_2 = (hwr)ida.a.l();
                if (!var7_2.b.B()) {
                    var7_2.u();
                }
                ida.G((ida)var7_2.b);
                var9_8.aE((hwr)var7_2);
                var11_11 = (idj)var9_8.o();
                var12_10 = var10_7.a;
                var7_2 = var9_8 = idi.a;
                if (var9_8 != null) ** GOTO lbl166
                // MONITORENTER : idi.class
                {
                    catch (Throwable var7_4) {}
                }
                try {
                    var7_2 = var9_8 = idi.a;
                    if (var9_8 == null) {
                        var7_2 = ixb.a();
                        var7_2.c = ixa.a;
                        var7_2.d = ixb.c("speech.s3.S3StubbyClientConnectorService", "RunBlocking");
                        var7_2.b();
                        var9_8 = idj.a;
                        var13_13 = jmj.a;
                        var7_2.a = var13_13 = new jmi((hyf)var9_8);
                        var9_8 = idk.a;
                        var7_2.b = var13_13 = new jmi((hyf)var9_8);
                        idi.a = var7_2 = var7_2.a();
                    }
                    // MONITOREXIT : idi.class
                    ** GOTO lbl166
                }
                catch (Throwable var7_3) {
                    // MONITOREXIT : idi.class
                    throw var7_3;
lbl166:
                    // 2 sources

                    var7_2 = (idk)jmw.b((itx)var12_10, (ixb)var7_2, var10_7.b, var11_11);
                    var8_1.d();
                    var9_8 = new ArrayList<E>();
                    var10_7 = new ArrayList<E>();
                    var11_11 = var7_2.b.iterator();
                    var3_14 = -1;
                    break block35;
                }
                break block36;
                catch (Throwable var7_5) {
                    var8_1 = null;
                }
            }
            if (var8_1 == null) throw var7_6;
            var8_1.d();
            throw var7_6;
        }
        while (var11_11.hasNext()) {
            var7_2 = (idb)var11_11.next();
            if ((var7_2.b & 1) != 0 && (var4_15 = a.v(var7_2.c)) != 0 && var4_15 == 3) {
                var12_10 = (heg)((heg)bvn.a.g()).j("com/google/android/apps/speech/tts/googletts/network/NetworkFetchTask", "call", 121, "NetworkFetchTask.java");
                var7_2 = var8_1 = var7_2.f;
                if (var8_1 == null) {
                    var7_2 = iba.a;
                }
                var12_10.u("Got error from S3: %s", this.a((iba)var7_2));
                continue;
            }
            var8_1 = iie.f;
            var7_2.h((gpm)var8_1);
            if (!var7_2.r.o((hwu)var8_1.a)) continue;
            var8_1 = iie.f;
            var7_2.h((gpm)var8_1);
            var7_2 = var7_2.r.l((hwu)var8_1.a);
            var7_2 = var7_2 == null ? var8_1.d : var8_1.k(var7_2);
            var12_10 = (iie)var7_2;
            var4_15 = var3_14;
            if ((var12_10.b & 4) != 0) {
                var7_2 = var8_1 = var12_10.d;
                if (var8_1 == null) {
                    var7_2 = iid.a;
                }
                var4_15 = var7_2.b;
            }
            if ((var12_10.b & 1) != 0 && var12_10.c.d() > 0) {
                var9_8.add(var12_10.c);
            }
            var3_14 = var4_15;
            if ((var12_10.b & 16) == 0) continue;
            var7_2 = var8_1 = var12_10.e;
            if (var8_1 == null) {
                var7_2 = iih.a;
            }
            var10_7.add(var7_2);
            var3_14 = var4_15;
        }
        if (var9_8.isEmpty() == false) return gto.i(new dvy(var3_14, (List)var9_8, (List)var10_7));
        return gsl.a;
    }
}

