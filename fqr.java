/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.system.Os
 *  android.system.OsConstants
 */
import android.net.Uri;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.IOException;
import java.util.List;

public final class fqr
implements fpp {
    public boolean a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b(bmu var1_1, Uri var2_3, List var3_4) {
        var7_5 = new fqo();
        var7_5.b();
        try {
            if (!var1_1.C(var2_3)) ** GOTO lbl25
            var6_7 = this.a;
            if (var6_7) {
            }
            ** GOTO lbl-1000
        }
        catch (IOException var1_2) {
            var3_4.add(var1_2);
            return;
        }
        var7_5 = (File)var1_1.w(var2_3, (fpp)var7_5);
        if (var7_5 != null && var7_5.exists() && ((var4_8 = Os.lstat((String)var7_5.getAbsolutePath()).st_mode) & (var5_9 = OsConstants.S_IFLNK)) != 0) ** GOTO lbl21
lbl-1000:
        // 3 sources

        {
            while (true) {
                var7_5 = var1_1.v(var2_3).iterator();
                while (var7_5.hasNext()) {
                    this.b(var1_1, (Uri)var7_5.next(), var3_4);
                }
lbl21:
                // 2 sources

                var1_1.y(var2_3);
                return;
            }
            catch (Exception var7_6) {
                ** continue;
            }
lbl25:
            // 1 sources

            var1_1.z(var2_3);
            return;
        }
    }
}

