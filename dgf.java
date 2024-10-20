/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  hjj
 */
import android.content.res.AssetManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

public final class dgf
implements ddz {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ dgf(bsy bsy2, den den2, File file, int n2) {
        this.d = n2;
        this.b = bsy2;
        this.a = den2;
        this.c = file;
    }

    public /* synthetic */ dgf(den den2, String string, File file, int n2) {
        this.d = n2;
        this.b = den2;
        this.c = string;
        this.a = file;
    }

    public /* synthetic */ dgf(dgg dgg2, den den2, File file, int n2) {
        this.d = n2;
        this.a = dgg2;
        this.b = den2;
        this.c = file;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(dcx object) {
        String string;
        block27: {
            Object object2;
            block26: {
                int n2 = this.d;
                if (n2 != 0) {
                    if (n2 != 1) {
                        Object object3 = this.c;
                        Object object4 = (String)object3;
                        Object object5 = ((String)object4).concat("_checksum");
                        Object object6 = this.b;
                        den den2 = (den)object6;
                        String string2 = den2.n().d((String)object5);
                        if (string2 != null) {
                            object5 = dly.F((String)object4);
                            if (object5 != null) {
                                block25: {
                                    object4 = this.a;
                                    object3 = new FileInputStream((File)object4);
                                    object = object5.a((InputStream)object3, (dcx)object);
                                    ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/packs/Checksummers", "calculate", 64, "Checksummers.java")).G("Calculated checksum of file %s using %s: %s", dec.e((File)object4), object5, object);
                                    if (!dec.j((String)object).equalsIgnoreCase(dec.j(string2))) break block25;
                                    return null;
                                }
                                object = String.format(Locale.US, "Pack %s checksum validation failed, expected: %s, actual: %s", object6, string2, object);
                                den2.o();
                                throw new dek((String)object);
                                finally {
                                    ((FileInputStream)object3).close();
                                }
                            }
                            throw new IllegalStateException(String.format(Locale.US, "Unsupported validation scheme %s for pack %s", object3, object6));
                        }
                        throw new ddc(String.format(Locale.US, "Manifest for pack %s is missing expected extra '%s'", object6, object5));
                    }
                    ((dcx)object).a();
                    object = ((bsy)this.b).b;
                    Object object7 = this.a;
                    Object object8 = new File((File)object, ((den)object7).j());
                    object = this.c;
                    if (((File)object).exists()) {
                        ((File)object).delete();
                    }
                    object7 = ((den)object7).i();
                    Object object9 = new StringBuilder();
                    ((StringBuilder)object9).append((String)object7);
                    ((StringBuilder)object9).append(".zvoice");
                    Object object10 = new File((File)object8, ((StringBuilder)object9).toString());
                    ((heg)((heg)bsy.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/SystemDirFetcher", "fetch", 54, "SystemDirFetcher.java")).C("Copying %s to %s", object10, object);
                    fxf.y(true ^ ((File)object10).equals(object), "Source %s and destination %s must be different", object10, object);
                    fxf.K(object10);
                    object7 = hav.o(new hjj[0]);
                    object8 = new hji();
                    object10 = hjk.a((File)object10);
                    ((hji)object8).c((Closeable)object10);
                    boolean bl2 = ((gzm)object7).contains(hjj.a);
                    object9 = new FileOutputStream((File)object, bl2);
                    ((hji)object8).c((Closeable)object9);
                    hjg.a((InputStream)object10, (OutputStream)object9);
                    ((hji)object8).close();
                    object = new dei("systemDir://system_packs");
                    catch (Throwable throwable) {
                        try {
                            throw ((hji)object8).a(throwable);
                        }
                        catch (Throwable throwable2) {
                            try {
                                ((hji)object8).close();
                                throw throwable2;
                            }
                            catch (IOException iOException) {
                                a.as(bsy.a.f(), "Copy failed.", "com/google/android/apps/speech/tts/googletts/local/voicepack/SystemDirFetcher", "fetch", '9', "SystemDirFetcher.java", iOException);
                                object = new dei(null);
                            }
                        }
                    }
                    return object;
                }
                ((dcx)object).a();
                object2 = (dgg)this.a;
                object = ((dgg)object2).a;
                string = ((dgg)object2).e((den)this.b);
                String[] stringArray = object.list(string);
                object2 = this.c;
                if (stringArray == null) break block26;
                n2 = stringArray.length;
                if (n2 == 0) break block26;
                ((File)object2).mkdirs();
                for (int i2 = 0; i2 < n2; ++i2) {
                    String string3 = stringArray[i2];
                    String string4 = a.ao(string3, string, "/");
                    File file = new File((File)object2, string3);
                    crh.s((AssetManager)object, string4, file);
                    continue;
                }
                break block27;
            }
            try {
                File file = ((File)object2).getParentFile();
                if (file != null) {
                    file.mkdirs();
                }
                crh.s((AssetManager)object, string, (File)object2);
            }
            catch (SecurityException securityException) {
                throw new IOException(securityException);
            }
        }
        return new dei("assets://".concat(string));
    }
}

