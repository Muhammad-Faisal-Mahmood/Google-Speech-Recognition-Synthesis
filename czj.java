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
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Executor;

public final class czj
implements hnx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    private final int g;

    public /* synthetic */ czj(Context context, String string, bmu bmu2, Uri uri, ctf ctf2, cth cth2, int n2) {
        this.g = n2;
        this.a = context;
        this.b = string;
        this.c = bmu2;
        this.d = uri;
        this.e = ctf2;
        this.f = cth2;
    }

    public /* synthetic */ czj(btj btj2, String string, buc buc2, String string2, bua bua2, btz btz2, int n2) {
        this.g = n2;
        this.a = btj2;
        this.c = string;
        this.f = buc2;
        this.b = string2;
        this.e = bua2;
        this.d = btz2;
    }

    public /* synthetic */ czj(dhn dhn2, dfu dfu2, hpq hpq2, dfi dfi2, AmbientMode$AmbientController ambientMode$AmbientController, kpo kpo2, int n2) {
        this.g = n2;
        this.c = dhn2;
        this.d = dfu2;
        this.b = hpq2;
        this.a = dfi2;
        this.f = ambientMode$AmbientController;
        this.e = kpo2;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final hpn a() {
        Object object;
        int n2;
        block25: {
            OutputStream outputStream;
            Object object2;
            Object object3;
            Object object4;
            int n3;
            Object object5;
            block24: {
                object5 = "";
                int n4 = this.g;
                n3 = 0;
                n2 = 0;
                if (n4 != 0) {
                    if (n4 != 1) {
                        Object object6;
                        dhn dhn2 = (dhn)this.c;
                        if (dhn2.d) {
                            return hpj.a;
                        }
                        HashSet<ddn> hashSet = new HashSet<ddn>();
                        Object object7 = ((gzx)dhn2.b).v();
                        n3 = n2;
                        block17: while (true) {
                            object5 = this.d;
                            if (!object7.hasNext()) break;
                            object6 = ((Collection)object7.next()).iterator();
                            n2 = n3;
                            while (true) {
                                n3 = n2;
                                if (!object6.hasNext()) continue block17;
                                ddn ddn2 = ((der)object6.next()).f().o();
                                hashSet.add(ddn2);
                                String string = ((dco)ddn2).a;
                                n2 |= ((dfu)object5).n(string);
                            }
                            break;
                        }
                        if (n3 != 0) {
                            if (hashSet.size() > 1) throw new IllegalArgumentException("Only one file can be requested for a detached namespace.");
                        }
                        Object object8 = this.e;
                        Object object9 = this.f;
                        object7 = this.a;
                        Object object10 = this.b;
                        object6 = dhn2.f.b(dhn2.a, hashSet, dhn2.c);
                        object9 = (AmbientMode$AmbientController)object9;
                        object8 = (kpo)object8;
                        return hno.g((hpn)object6, new dgy(dhn2, hashSet, (n3 ^ 1) != 0, (dfu)object5, (hpq)object10, (dfi)object7, (AmbientMode$AmbientController)object9, (kpo)object8, 2), (Executor)object10);
                    }
                    gtk gtk2 = gtk.c(File.separatorChar);
                    Context context = ((btj)this.a).c;
                    Object object11 = this.d;
                    object5 = this.e;
                    Object object12 = this.b;
                    Object object13 = this.f;
                    String string = btj.f(context);
                    object5 = btj.e((buc)object13, (String)object12, (bua)object5, (btz)object11);
                    return hhk.K(gtk2.e(string, this.c, object5));
                }
                object4 = this.f;
                object3 = this.e;
                object2 = this.d;
                object = this.c;
                Object object14 = this.b;
                Object object15 = this.a;
                Uri uri = crh.e((Context)object15, (String)object14);
                object15 = new fqq();
                object2 = (InputStream)((bmu)object).w((Uri)object2, (fpp)object15);
                object15 = new fqu();
                outputStream = (OutputStream)((bmu)object).w(uri, (fpp)object15);
                hjg.a((InputStream)object2, outputStream);
                if (outputStream == null) break block24;
                outputStream.close();
            }
            object = object5;
            n2 = n3;
            if (object2 == null) break block25;
            ((InputStream)object2).close();
            object = object5;
            n2 = n3;
            catch (Throwable throwable) {
                if (outputStream == null) throw throwable;
                try {
                    outputStream.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    try {
                        throwable.addSuppressed(throwable2);
                        throw throwable;
                    }
                    catch (Throwable throwable3) {
                        if (object2 == null) throw throwable3;
                        try {
                            ((InputStream)object2).close();
                            throw throwable3;
                        }
                        catch (Throwable throwable4) {
                            try {
                                throwable3.addSuppressed(throwable4);
                                throw throwable3;
                            }
                            catch (IOException iOException) {
                                object = (ctf)object3;
                                object5 = ((ctf)object).c;
                                object4 = (cth)object4;
                                cyr.i("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", object5, ((cth)object4).d);
                                object = String.format("Error while copying file %s, group %s, to the shared blob storage", ((ctf)object).c, ((cth)object4).d);
                                n2 = 22;
                            }
                            catch (fpz fpz2) {
                                object5 = (ctf)object3;
                                object = ((ctf)object5).c;
                                object4 = (cth)object4;
                                cyr.i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", object, ((cth)object4).d);
                                object = String.format("Malformed blob Uri for file %s, group %s", ((ctf)object5).c, ((cth)object4).d);
                                n2 = 17;
                            }
                            catch (fpy fpy2) {
                                object5 = (ctf)object3;
                                object = ((ctf)object5).c;
                                object4 = (cth)object4;
                                cyr.i("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", object, ((cth)object4).d);
                                object = String.format("System limit exceeded for file %s, group %s", ((ctf)object5).c, ((cth)object4).d);
                                n2 = 25;
                            }
                            catch (fqb fqb2) {
                                if (!TextUtils.isEmpty((CharSequence)fqb2.getMessage())) {
                                    object5 = fqb2.getMessage();
                                }
                                cyr.l("%s: Failed to share after download for file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", ((ctf)object3).c, ((cth)object4).d, object5);
                                object = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(object5));
                                n2 = 24;
                            }
                        }
                    }
                }
            }
        }
        if (n2 != 0) throw new czl(n2, (String)object);
        return hpj.a;
    }
}

