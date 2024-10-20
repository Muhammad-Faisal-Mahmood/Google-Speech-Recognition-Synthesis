/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class ago
extends agl {
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public ago(Context context) {
        super(false);
        this.a = context.getContentResolver();
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
                var5_5 = this.e;
                if (var5_5 == 0L) break block5;
                var4_6 = var3_4;
                if (var5_5 == -1L) ** GOTO lbl10
                var7_7 = var3_4;
                try {
                    var4_6 = (int)Math.min(var5_5, var7_7);
lbl10:
                    // 2 sources

                    var9_8 = this.d;
                    var3_4 = agf.a;
                    if ((var2_3 = var9_8.read(var1_1, var2_3, var4_6)) == -1) {
                        return -1;
                    }
                    var5_5 = this.e;
                    if (var5_5 == -1L) break block4;
                }
                catch (IOException var1_2) {
                    throw new agn(var1_2, 2000);
                }
                this.e = var5_5 - (long)var2_3;
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
        block20: {
            block19: {
                block18: {
                    block17: {
                        var8_6 = var1_1.a.normalizeScheme();
                        this.b = var8_6;
                        this.j();
                        if ("content".equals(var8_6.getScheme())) {
                            var7_7 = new Bundle();
                            var7_7.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                            var7_7 = this.a.openTypedAssetFileDescriptor((Uri)var8_6, "*/*", (Bundle)var7_7);
                        } else {
                            var7_7 = this.a.openAssetFileDescriptor((Uri)var8_6, "r");
                        }
                        this.c = var7_7;
                        if (var7_7 == null) ** GOTO lbl57
                        var3_8 = var7_7.getLength();
                        var8_6 = new FileInputStream(var7_7.getFileDescriptor());
                        this.d = var8_6;
                        cfr_temp_0 = var3_8 - -1L;
                        var2_9 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                        if (var2_9 == 0) ** GOTO lbl24
                        if (var1_1.e > var3_8) {
                            var1_1 = new agn(null, 2008);
                            throw var1_1;
                        }
lbl24:
                        // 3 sources

                        var5_10 = var7_7.getStartOffset();
                        if ((var5_10 = var8_6.skip(var1_1.e + var5_10) - var5_10) != var1_1.e) ** GOTO lbl55
                        if (var2_9 != 0) break block17;
                        var7_7 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(var8_6.getChannel());
                        var3_8 = var7_7.size();
                        if (var3_8 != 0L) ** GOTO lbl34
                        this.e = -1L;
                        break block18;
lbl34:
                        // 1 sources

                        this.e = var3_8 -= var7_7.position();
                        if (var3_8 >= 0L) break block18;
                        var1_1 = new agn(null, 2008);
                        throw var1_1;
                    }
                    var3_8 -= var5_10;
                    this.e = var3_8;
                    if (var3_8 < 0L) break block19;
                }
                var3_8 = var1_1.f;
                this.f = true;
                this.i((agt)var1_1);
                var3_8 = var1_1.f;
                return this.e;
            }
            var1_1 = new agn(null, 2008);
            throw var1_1;
lbl55:
            // 1 sources

            var1_1 = new agn(null, 2008);
            throw var1_1;
lbl57:
            // 1 sources

            var9_11 = String.valueOf(var8_6);
            var8_6 = new StringBuilder("Could not open file descriptor for: ");
            var8_6.append(var9_11);
            var1_1 = new IOException(var8_6.toString());
            try {
                var7_7 = new agn((IOException)var1_1, 2000);
                throw var7_7;
            }
            catch (IOException var1_2) {}
            break block20;
            catch (IOException var1_3) {
                // empty catch block
            }
        }
        var2_9 = 2000;
        if (var1_4 instanceof FileNotFoundException) {
            var2_9 = 2005;
        }
        throw new agn((IOException)var1_4, var2_9);
    }

    @Override
    public final Uri c() {
        return this.b;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void d() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [8 : 63->77)] java.lang.Throwable
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

