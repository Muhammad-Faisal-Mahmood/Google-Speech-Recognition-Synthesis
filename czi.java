/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.OutputStream;

public final class czi
implements hnx {
    public final Context a;
    public final String b;
    public final long c;
    public final ctf d;
    public final cth e;
    public final bmu f;

    public /* synthetic */ czi(Context context, String string, long l2, bmu bmu2, ctf ctf2, cth cth2) {
        this.a = context;
        this.b = string;
        this.c = l2;
        this.f = bmu2;
        this.d = ctf2;
        this.e = cth2;
    }

    @Override
    public final hpn a() {
        int n2;
        Object object;
        block8: {
            String string = "";
            Context context = this.a;
            Object object2 = this.b;
            long l2 = this.c;
            object = this.f;
            ctf ctf2 = this.d;
            cth cth2 = this.e;
            int n3 = 0;
            Object object3 = fpu.a;
            object3 = context.getPackageName();
            object2 = fvc.K(String.valueOf(object2).concat(".lease"), (String)object3, l2);
            object3 = new fqu();
            object2 = (OutputStream)((bmu)object).w((Uri)object2, (fpp)object3);
            object = string;
            n2 = n3;
            if (object2 == null) break block8;
            try {
                ((OutputStream)object2).close();
                object = string;
                n2 = n3;
            }
            catch (IOException iOException) {
                cyr.i("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", ctf2.c, cth2.d);
                object = String.format("Error while acquiring lease for file %s, group %s", ctf2.c, cth2.d);
                n2 = 20;
            }
            catch (fpy fpy2) {
                cyr.i("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", ctf2.c, cth2.d);
                object = String.format("System limit exceeded for file %s, group %s", ctf2.c, cth2.d);
                n2 = 25;
            }
            catch (fpz fpz2) {
                cyr.i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", ctf2.c, cth2.d);
                object = String.format("Malformed lease Uri for file %s, group %s", ctf2.c, cth2.d);
                n2 = 18;
            }
            catch (fqb fqb2) {
                if (!TextUtils.isEmpty((CharSequence)fqb2.getMessage())) {
                    string = fqb2.getMessage();
                }
                cyr.l("%s: Failed to share file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", ctf2.c, cth2.d, string);
                object = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(string));
                n2 = 24;
            }
        }
        if (n2 == 0) {
            return hpj.a;
        }
        throw new czl(n2, (String)object);
    }
}

