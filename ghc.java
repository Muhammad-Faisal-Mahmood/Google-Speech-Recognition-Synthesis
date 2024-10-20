/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.util.Log
 */
import android.content.pm.PackageInfo;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;

public final class ghc
implements hnx {
    public final ghe a;
    public final boolean b;

    public /* synthetic */ ghc(ghe ghe2, boolean bl2) {
        this.a = ghe2;
        this.b = bl2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        var5_1 = this.a;
        try {
            var4_2 = var5_1.f.b();
            jse.d(var4_2, "get(...)");
            var4_2 = (PackageInfo)var4_2;
            var1_5 = var4_2.versionCode;
            var4_2 = var4_2.applicationInfo;
            if (var4_2 == null || (var6_6 = var4_2.dataDir) == null) ** GOTO lbl53
            var4_2 = new File((String)var6_6, "files");
            var7_7 = new File((File)var4_2, "tiktok");
            var7_7.mkdirs();
            var4_2 = var5_1.i.b() != false ? fvd.j(null) : fvd.j(dww.a(var5_1.a));
            var6_6 = new File((File)var7_7, (String)var4_2);
            var3_8 = var6_6.createNewFile();
            if (!var6_6.exists() || !var6_6.isFile()) ** GOTO lbl51
            var7_7 = new RandomAccessFile((File)var6_6, "rw");
            if (!var3_8) {
            }
            ** GOTO lbl-1000
        }
        catch (IOException var4_4) {
            if (this.b) {
                if (!crt.e(var5_1.a)) {
                    Log.w((String)"StartupAfterPkgReplaced", (String)"StartupAfterPackageReplaced failed, device was locked. Will reschedule.", (Throwable)var4_4);
                }
                crt.b(var5_1.a, new ffd(var5_1, 19));
                return hpj.a;
            } else {
                Log.e((String)"StartupAfterPkgReplaced", (String)"StartupAfterPackageReplaced failed, will try again next startup: ", (Throwable)var4_4);
            }
            return hpj.a;
        }
        var2_9 = ghe.b((RandomAccessFile)var7_7);
        if (var1_5 == var2_9) ** GOTO lbl-1000
        ** GOTO lbl-1000
        {
            block12: {
                catch (Throwable var4_3) {
                    var7_7.close();
                    throw var4_3;
                }
lbl-1000:
                // 1 sources

                {
                    var7_7.close();
                    var4_2 = null;
                    break block12;
                }
lbl-1000:
                // 2 sources

                {
                    fvd.k((RandomAccessFile)var7_7, -1);
                    var4_2 = new ghd((RandomAccessFile)var7_7, var5_1, var1_5);
                }
            }
            if (var4_2 == null) {
                return hhk.K(null);
            }
            var6_6 = (gax)var5_1.d.b();
            var4_2 = fxf.ah((Callable)var4_2, var5_1.c);
            var6_6.d((hpn)var4_2);
            return var4_2;
lbl51:
            // 1 sources

            var4_2 = new IOException("Something went wrong creating file to store package version. Will not run package replaced listeners. Will try again on next startup.");
            throw var4_2;
lbl53:
            // 1 sources

            var4_2 = new IllegalStateException("PackageInfo was invalid.");
            throw var4_2;
        }
    }
}

