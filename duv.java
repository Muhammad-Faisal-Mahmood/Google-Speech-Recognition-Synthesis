/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  hom
 */
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class duv
implements dus {
    public final cka a;

    public duv(cka cka2) {
        this.a = cka2;
    }

    public static hpn h(ckz ckz2) {
        return hmv.g(crh.a(ckz2), ccq.class, new buf(16), (Executor)hom.a);
    }

    @Override
    public final hpn a(String string) {
        fxf.K(string);
        return duv.h(this.a.i(string));
    }

    @Override
    public final hpn b(dup dup2) {
        fxf.K(dup2);
        Object object = new cer();
        ((cer)object).a = new cgn(dup2, 5);
        ((cer)object).b = new cbm[]{cjo.a};
        ((cer)object).b();
        object = ((cer)object).a();
        cka cka2 = this.a;
        return duv.h(cka2.d((ces)object).a(new cjy(cka2, dup2, 0)));
    }

    @Override
    public final hpn c(String object, String object2) {
        fxf.K(object2);
        cer cer2 = new cer();
        cer2.a = new cjv((String)object, object2, 1);
        object = cer2.a();
        ckz ckz2 = this.a.d((ces)object);
        cer2 = hom.a;
        object = new duu();
        object2 = new cld();
        ckz2 = (cld)ckz2;
        ((cld)ckz2).e.c(new cku((Executor)((Object)cer2), (ckq)object, (cld)object2, 1));
        ((cld)ckz2).j();
        return duv.h((ckz)object2);
    }

    @Override
    public final hpn d() {
        Object object = new cer();
        ((cer)object).a = new cip(2);
        ((cer)object).b = new cbm[]{cjo.i};
        ((cer)object).b();
        object = ((cer)object).a();
        return duv.h(this.a.d((ces)object));
    }

    @Override
    public final hpn e(String string, int n2, String[] stringArray, byte[] byArray) {
        fxf.K(stringArray);
        return duv.h(this.a.j(string, n2, stringArray, byArray));
    }

    @Override
    public final hpn f(int[] object, String string, String string2) {
        fxf.K(string2);
        cer cer2 = new cer();
        cer2.a = new cli(string, string2, object, 1);
        object = cer2.a();
        return duv.h(this.a.d((ces)object));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final hpn g(dvw var1_1) {
        block18: {
            block20: {
                block17: {
                    block19: {
                        var4_4 = ckd.class.getSimpleName();
                        var6_9 = this.a;
                        var7_10 = var6_9.b(var1_1, (String)var4_4);
                        var1_1 = cgv.a;
                        var5_11 = null;
                        if (var1_1 != null) break block18;
                        if (Build.VERSION.SDK_INT < 28) break block19;
                        cgv.a = fs$$ExternalSyntheticApiModelOutline0.m();
                        break block18;
                    }
                    var2_13 = var3_12 = cgv.b;
                    if (var3_12 == 0) {
                        cgv.b = var2_13 = Process.myPid();
                    }
                    if (var2_13 <= 0) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var1_1 = null;
                            ** GOTO lbl49
                            break;
                        }
                    } else {
                        var8_14 = a.ah(var2_13, "/proc/", "/cmdline");
                        var4_4 = StrictMode.allowThreadDiskReads();
                        var9_15 = new FileReader(var8_14);
                        var1_1 = new BufferedReader(var9_15);
                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var4_4);
                        var4_4 = var1_1.readLine();
                        kl.at(var4_4);
                        var4_4 = var4_4.trim();
                        bni.a((Closeable)var1_1);
                        var1_1 = var4_4;
                    }
                    break block20;
                    catch (Throwable var4_5) {
                        break block17;
                    }
                    catch (Throwable var1_2) {
                        try {
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var4_4);
                            throw var1_2;
                        }
                        catch (Throwable var4_6) {
                            var1_1 = var5_11;
                        }
                    }
                }
                bni.a((Closeable)var1_1);
                throw var4_7;
                {
                    catch (IOException var1_3) {
                        var1_1 = null;
lbl46:
                        // 2 sources

                        while (true) {
                            bni.a((Closeable)var1_1);
                            ** continue;
                            break;
                        }
                    }
                }
            }
            cgv.a = var1_1;
        }
        if ((var1_1 = cgv.a) == null) {
            var1_1 = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            var2_13 = System.identityHashCode(ckd.class);
            var4_4 = new StringBuilder();
            var4_4.append((String)var1_1);
            var4_4.append("|");
            var4_4.append(var2_13);
            var1_1 = var4_4.toString();
        }
        var1_1 = new cjv((String)var1_1, var7_10, 2, null);
        var4_4 = new cip(3);
        var5_11 = new cen();
        var5_11.c = var7_10;
        var5_11.a = var1_1;
        var5_11.b = var4_4;
        var5_11.d = new cbm[]{cjo.d};
        var5_11.e = false;
        return duv.h(var6_9.h(var5_11.a()));
        catch (IOException var4_8) {
            ** continue;
        }
    }
}

