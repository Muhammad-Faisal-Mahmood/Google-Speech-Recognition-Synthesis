/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;

public final class czk
implements hnx {
    public final Context a;
    public final String b;
    public final ctf c;
    public final cth d;
    public final bmu e;

    public /* synthetic */ czk(Context context, String string, bmu bmu2, ctf ctf2, cth cth2) {
        this.a = context;
        this.b = string;
        this.e = bmu2;
        this.c = ctf2;
        this.d = cth2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a() {
        boolean bl2;
        int n2;
        String string;
        block6: {
            string = "";
            Context context = this.a;
            String string2 = this.b;
            bmu bmu2 = this.e;
            ctf ctf2 = this.c;
            cth cth2 = this.d;
            n2 = 0;
            try {
                bl2 = bmu2.B(crh.e(context, string2));
                break block6;
            }
            catch (IOException iOException) {
                cyr.i("%s: Failed to check existence in the shared storage for file %s, file group %s", "AndroidSharingUtil", ctf2.c, cth2.d);
                string = String.format("Error while checking if file %s, group %s, exists in the shared blob storage.", ctf2.c, cth2.d);
                n2 = 19;
            }
            catch (fpz fpz2) {
                cyr.i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", ctf2.c, cth2.d);
                string = String.format("Malformed blob Uri for file %s, group %s", ctf2.c, cth2.d);
                n2 = 17;
            }
            catch (fqb fqb2) {
                if (!TextUtils.isEmpty((CharSequence)fqb2.getMessage())) {
                    string = fqb2.getMessage();
                }
                cyr.l("%s: Failed to share for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", ctf2.c, cth2.d, string);
                string = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(string));
                n2 = 24;
            }
            bl2 = false;
        }
        if (n2 == 0) {
            return hhk.K(bl2);
        }
        throw new czl(n2, string);
    }
}

