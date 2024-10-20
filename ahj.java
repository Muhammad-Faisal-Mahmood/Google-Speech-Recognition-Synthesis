/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 *  android.text.TextUtils
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import j$.nio.channels.DesugarChannels;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ahj
extends agl {
    private final Context a;
    private agt b;
    private AssetFileDescriptor c;
    private InputStream d;
    private long e;
    private boolean f;

    public ahj(Context context) {
        super(false);
        this.a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int n2) {
        return Uri.parse((String)a.af(n2, "rawresource:///"));
    }

    private static int k(String string) {
        try {
            int n2 = Integer.parseInt(string);
            return n2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new ahi("Resource identifier must be an integer.", null, 1004);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static AssetFileDescriptor l(Context object, agt object2) {
        int n2;
        Uri uri = ((agt)object2).a.normalizeScheme();
        if (TextUtils.equals((CharSequence)"rawresource", (CharSequence)uri.getScheme())) {
            object = object.getResources();
            object2 = uri.getPathSegments();
            if (object2.size() != 1) {
                int n3 = object2.size();
                object = new StringBuilder("rawresource:// URI must have exactly one path element, found ");
                ((StringBuilder)object).append(n3);
                throw new ahi(((StringBuilder)object).toString());
            }
            n2 = ahj.k((String)object2.get(0));
        } else {
            if (!TextUtils.equals((CharSequence)"android.resource", (CharSequence)uri.getScheme())) {
                object = uri.getScheme();
                object2 = new StringBuilder("Unsupported URI scheme (");
                ((StringBuilder)object2).append((String)object);
                ((StringBuilder)object2).append("). Only android.resource is supported.");
                throw new ahi(((StringBuilder)object2).toString(), null, 1004);
            }
            String string = uri.getPath();
            abr.i(string);
            object2 = string;
            if (string.startsWith("/")) {
                object2 = string.substring(1);
            }
            if ((string = TextUtils.isEmpty((CharSequence)uri.getHost()) ? object.getPackageName() : uri.getHost()).equals(object.getPackageName())) {
                object = object.getResources();
            } else {
                try {
                    object = object.getPackageManager().getResourcesForApplication(string);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    throw new ahi("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", nameNotFoundException, 2005);
                }
            }
            if (((String)object2).matches("\\d+")) {
                n2 = ahj.k((String)object2);
            } else {
                n2 = object.getIdentifier(a.ao((String)object2, string, ":"), "raw", null);
                if (n2 == 0) {
                    throw new ahi("Resource not found.", null, 2005);
                }
            }
        }
        try {
            object = object.openRawResourceFd(n2);
            if (object != null) {
                return object;
            }
            throw new ahi("Resource is compressed: ".concat(String.valueOf(String.valueOf(uri))), null, 2000);
        }
        catch (Resources.NotFoundException notFoundException) {
            throw new ahi(null, notFoundException, 2005);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final int a(byte[] var1_1, int var2_3, int var3_4) {
        block6: {
            block4: {
                block5: {
                    if (var3_4 == 0) {
                        return 0;
                    }
                    var7_5 = this.e;
                    if (var7_5 == 0L) break block6;
                    var4_6 = var3_4;
                    if (var7_5 == -1L) ** GOTO lbl10
                    var5_7 = var3_4;
                    try {
                        var4_6 = (int)Math.min(var7_5, var5_7);
lbl10:
                        // 2 sources

                        var9_8 = this.d;
                        var3_4 = agf.a;
                        if ((var2_3 = var9_8.read(var1_1, var2_3, var4_6)) != -1) break block4;
                        if (this.e != -1L) break block5;
                        return -1;
                    }
                    catch (IOException var1_2) {
                        throw new ahi(null, var1_2, 2000);
                    }
                }
                throw new ahi("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            var5_7 = this.e;
            if (var5_7 != -1L) {
                this.e = var5_7 - (long)var2_3;
            }
            this.g(var2_3);
            return var2_3;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final long b(agt var1_1) {
        block11: {
            block10: {
                block9: {
                    this.b = var1_1;
                    this.j();
                    var7_4 = ahj.l(this.a, (agt)var1_1);
                    this.c = var7_4;
                    var3_5 = var7_4.getLength();
                    var7_4 = new FileInputStream(this.c.getFileDescriptor());
                    this.d = var7_4;
                    cfr_temp_0 = var3_5 - -1L;
                    var2_6 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var2_6 == false) ** GOTO lbl15
                    if (var1_1.e > var3_5) {
                        var1_1 = new ahi(null, null, 2008);
                        throw var1_1;
                    }
lbl15:
                    // 3 sources

                    var5_7 = this.c.getStartOffset();
                    if ((var5_7 = var7_4.skip(var1_1.e + var5_7) - var5_7) != var1_1.e) ** GOTO lbl43
                    if (var2_6 != false) break block9;
                    var7_4 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(var7_4.getChannel());
                    if (var7_4.size() == 0L) {
                        this.e = -1L;
                        break block10;
                    }
                    this.e = var3_5 = var7_4.size() - var7_4.position();
                    if (var3_5 >= 0L) break block10;
                    var1_1 = new ahi(null, null, 2008);
                    throw var1_1;
                }
                var3_5 -= var5_7;
                this.e = var3_5;
                if (var3_5 < 0L) break block11;
            }
            var3_5 = var1_1.f;
            this.f = true;
            this.i((agt)var1_1);
            var3_5 = var1_1.f;
            return this.e;
        }
        try {
            var1_1 = new ags(2008);
            throw var1_1;
lbl43:
            // 1 sources

            var1_1 = new ahi(null, null, 2008);
            throw var1_1;
        }
        catch (IOException var1_2) {
            throw new ahi(null, var1_2, 2000);
        }
        catch (ahi var1_3) {
            throw var1_3;
        }
    }

    @Override
    public final Uri c() {
        agt agt2 = this.b;
        if (agt2 != null) {
            return agt2.a;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void d() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [8 : 63->78)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

