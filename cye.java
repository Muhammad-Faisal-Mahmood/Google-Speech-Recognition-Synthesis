/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class cye {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] byArray) {
        int n2 = byArray.length;
        char[] cArray = new char[n2 + n2];
        int n3 = 0;
        for (n2 = 0; n2 < byArray.length; ++n2) {
            byte by2 = byArray[n2];
            char[] cArray2 = a;
            cArray[n3] = cArray2[(by2 & 0xFF) >>> 4];
            cArray[n3 + 1] = cArray2[by2 & 0xF];
            n3 += 2;
        }
        return new String(cArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static MessageDigest b() {
        block3: {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                if (messageDigest == null) break block3;
                return messageDigest;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                return null;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static void c(bmu var0, ctf var1_3, Uri var2_4, String var3_5) {
        block7: {
            block6: {
                try {
                    if (!var0.B(var2_4)) ** GOTO lbl27
                    var4_6 = a.w(var1_3.f);
                    if (var4_6 != 0 && var4_6 == 2) break block6;
                }
                catch (IOException var0_2) {
                    cyr.j(var0_2, "%s: Failed to validate download file %s", new Object[]{"FileValidator", cqq.Z((ctf)var1_3)});
                    var1_3 = css.a();
                    var1_3.b = csr.z;
                    var1_3.d = var0_2;
                    throw var1_3.a();
                }
                var5_7 = cye.d((bmu)var0, var2_4, var3_5);
                if (!var5_7) break block7;
            }
            return;
        }
        try {
            var6_8 = var0.u(var2_4);
        }
        catch (IOException var0_1) {
            var6_8 = -1L;
        }
        cyr.i("%s: Downloaded file at uri = %s, checksum = %s, size = %s verification failed", new Object[]{"FileValidator", var2_4, var3_5, var6_8});
        var0 = css.a();
        var0.b = csr.B;
        throw var0.a();
lbl27:
        // 1 sources

        cyr.i("%s: Downloaded file %s is not present at %s", new Object[]{"FileValidator", cqq.Z((ctf)var1_3), var2_4});
        var0 = css.a();
        var0.b = csr.A;
        throw var0.a();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean d(bmu object, Uri uri, String string) {
        String string2 = "";
        Object object2 = new fqq();
        object2 = (InputStream)((bmu)object).w(uri, (fpp)object2);
        object = cye.b();
        if (object == null) {
            object = "";
        } else {
            byte[] byArray = new byte[8192];
            int n2 = ((InputStream)object2).read(byArray);
            while (n2 != -1) {
                ((MessageDigest)object).update(byArray, 0, n2);
                n2 = ((InputStream)object2).read(byArray);
            }
            object = cye.a(((MessageDigest)object).digest());
        }
        if (object2 == null) return ((String)object).equals(string);
        ((InputStream)object2).close();
        return ((String)object).equals(string);
        catch (Throwable throwable) {
            if (object2 == null) throw throwable;
            try {
                ((InputStream)object2).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (IOException iOException) {
                    cyr.h("%s: Failed to open file, uri = %s", "FileValidator", uri);
                    object = string2;
                }
            }
        }
        return ((String)object).equals(string);
    }
}

