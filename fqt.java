/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Process
 */
import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public final class fqt
implements fpp {
    public hcc[] a;
    private final hyf b;

    public fqt(hyf hyf2) {
        this.b = hyf2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final /* synthetic */ Object a(fpo var1_1) {
        block15: {
            var2_3 = Process.myPid();
            var5_4 = Thread.currentThread().getId();
            var7_5 = System.currentTimeMillis();
            var3_6 = fqs.a.getAndIncrement();
            var9_7 /* !! */  = new StringBuilder(".mobstore_tmp-");
            var9_7 /* !! */ .append(var2_3);
            var9_7 /* !! */ .append("-");
            var9_7 /* !! */ .append(var5_4);
            var9_7 /* !! */ .append("-");
            var9_7 /* !! */ .append(var7_5);
            var9_7 /* !! */ .append("-");
            var9_7 /* !! */ .append(var3_6);
            var9_7 /* !! */  = var9_7 /* !! */ .toString();
            var10_8 = (Uri)var1_1.e;
            var9_7 /* !! */  = var10_8.buildUpon().path(String.valueOf(var10_8.getPath()).concat((String)var9_7 /* !! */ )).build();
            var10_8 = var1_1.a(var1_1.a.r((Uri)var9_7 /* !! */ ));
            var11_11 = this.a;
            if (var11_11 != null) {
                var11_11[0].c((List)var10_8);
            }
            var11_11 = (OutputStream)var10_8.get(0);
            try {
                this.b.f((OutputStream)var11_11);
                var10_8 = this.a;
                if (var10_8 == null) break block15;
            }
            catch (Throwable var10_9) {
                if (var11_11 == null) ** GOTO lbl41
                try {
                    var11_11.close();
                    ** GOTO lbl41
                }
                catch (Throwable var11_12) {
                    try {
                        var10_9.addSuppressed(var11_12);
lbl41:
                        // 3 sources

                        throw var10_9;
                    }
                    catch (Exception var10_10) {
                        try {
                            var1_1.a.k((Uri)var9_7 /* !! */ );
                        }
                        catch (FileNotFoundException var1_2) {
                            ** continue;
                        }
lbl47:
                        // 2 sources

                        while (true) {
                            if (var10_10 instanceof IOException) {
                                throw (IOException)var10_10;
                            }
                            throw new IOException(var10_10);
                        }
                    }
                }
            }
            var10_8[0].d();
        }
        if (var11_11 != null) {
            var11_11.close();
        }
        var1_1.a.l((Uri)var9_7 /* !! */ , (Uri)var1_1.e);
        return null;
    }
}

