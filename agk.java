/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.net.Uri
 */
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class agk
extends agl {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public agk(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int a(byte[] var1_1, int var2_3, int var3_4) {
        block5: {
            block4: {
                if (var3_4 == 0) {
                    return 0;
                }
                var7_5 = this.d;
                if (var7_5 == 0L) break block5;
                var4_6 = var3_4;
                if (var7_5 == -1L) ** GOTO lbl10
                var5_7 = var3_4;
                try {
                    var4_6 = (int)Math.min(var7_5, var5_7);
lbl10:
                    // 2 sources

                    var9_8 = this.c;
                    var3_4 = agf.a;
                    if ((var2_3 = var9_8.read(var1_1, var2_3, var4_6)) == -1) {
                        return -1;
                    }
                    var5_7 = this.d;
                    if (var5_7 == -1L) break block4;
                }
                catch (IOException var1_2) {
                    throw new agj(var1_2, 2000);
                }
                this.d = var5_7 - (long)var2_3;
            }
            this.g(var2_3);
            return var2_3;
        }
        return -1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long b(agt object) {
        try {
            Object object2 = ((agt)object).a;
            this.b = object2;
            String string = object2.getPath();
            abr.i(string);
            if (string.startsWith("/android_asset/")) {
                object2 = string.substring(15);
            } else {
                object2 = string;
                if (string.startsWith("/")) {
                    object2 = string.substring(1);
                }
            }
            this.j();
            object2 = this.a.open((String)object2, 1);
            this.c = object2;
            if (((InputStream)object2).skip(((agt)object).e) >= ((agt)object).e) {
                long l2 = ((agt)object).f;
                this.d = l2 = (long)this.c.available();
                if (l2 == Integer.MAX_VALUE) {
                    this.d = -1L;
                }
                this.e = true;
                this.i((agt)object);
                return this.d;
            }
        }
        catch (IOException iOException) {
            int n2;
            if (!(iOException instanceof FileNotFoundException)) {
                n2 = 2000;
                throw new agj(iOException, n2);
            }
            n2 = 2005;
            throw new agj(iOException, n2);
        }
        catch (agj agj2) {
            throw agj2;
        }
        {
            object = new agj(null, 2008);
            throw object;
        }
    }

    @Override
    public final Uri c() {
        return this.b;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d() {
        Throwable throwable2222222;
        this.b = null;
        InputStream inputStream = this.c;
        if (inputStream != null) {
            inputStream.close();
        }
        this.c = null;
        if (!this.e) return;
        this.e = false;
        this.h();
        return;
        {
            catch (Throwable throwable2222222) {
            }
            catch (IOException iOException) {}
            {
                agj agj2 = new agj(iOException, 2000);
                throw agj2;
            }
        }
        this.c = null;
        if (!this.e) {
            throw throwable2222222;
        }
        this.e = false;
        this.h();
        throw throwable2222222;
    }
}

