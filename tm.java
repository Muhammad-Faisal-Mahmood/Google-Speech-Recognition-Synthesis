/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.Typeface$CustomFallbackBuilder
 *  android.graphics.fonts.Font
 *  android.graphics.fonts.Font$Builder
 *  android.graphics.fonts.FontFamily
 *  android.graphics.fonts.FontFamily$Builder
 *  android.graphics.fonts.FontStyle
 *  android.util.Log
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class tm
extends tp {
    private static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        int n2 = Math.abs(dp$$ExternalSyntheticApiModelOutline0.m(fontStyle) - dp$$ExternalSyntheticApiModelOutline0.m(fontStyle2)) / 100;
        int n3 = dp$$ExternalSyntheticApiModelOutline0.m$1(fontStyle) == dp$$ExternalSyntheticApiModelOutline0.m$1(fontStyle2) ? 0 : 2;
        return n2 + n3;
    }

    private static final Font h(FontFamily fontFamily, int n2) {
        int n3 = 1 != (n2 & 1) ? 400 : 700;
        n2 = (n2 & 2) != 0 ? 1 : 0;
        FontStyle fontStyle = new FontStyle(n3, n2);
        Font font = dp$$ExternalSyntheticApiModelOutline0.m(fontFamily, 0);
        n2 = tm.g(fontStyle, dp$$ExternalSyntheticApiModelOutline0.m(font));
        for (int i2 = 1; i2 < dp$$ExternalSyntheticApiModelOutline0.m(fontFamily); ++i2) {
            Font font2 = dp$$ExternalSyntheticApiModelOutline0.m(fontFamily, i2);
            int n4 = tm.g(fontStyle, dp$$ExternalSyntheticApiModelOutline0.m(font2));
            n3 = n4 < n2 ? n4 : n2;
            if (n4 < n2) {
                font = font2;
            }
            n2 = n3;
        }
        return font;
    }

    /*
     * Exception decompiling
     */
    private static FontFamily i(uh[] var0, ContentResolver var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 157->164)] java.io.IOException
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

    @Override
    public final Typeface a(Context context, uh[] fontFamily, int n2) {
        block3: {
            context = context.getContentResolver();
            try {
                fontFamily = tm.i((uh[])fontFamily, (ContentResolver)context);
                if (fontFamily != null) break block3;
                return null;
            }
            catch (Exception exception) {
                Log.w((String)"TypefaceCompatApi29Impl", (String)"Font load failed", (Throwable)exception);
                return null;
            }
        }
        context = new Typeface.CustomFallbackBuilder(fontFamily);
        context = dp$$ExternalSyntheticApiModelOutline0.m(dp$$ExternalSyntheticApiModelOutline0.m((Typeface.CustomFallbackBuilder)context, dp$$ExternalSyntheticApiModelOutline0.m(tm.h(fontFamily, n2))));
        return context;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Typeface b(Context var1_1, bzb var2_3, Resources var3_5, int var4_6) {
        var7_7 = var2_3.a;
        var6_8 = ((sy[])var7_7).length;
        var1_1 /* !! */  = null;
        block8: for (var5_9 = 0; var5_9 < var6_8; ++var5_9) {
            block12: {
                block11: {
                    var8_10 = ((sy[])var7_7)[var5_9];
                    var2_3 = new Font.Builder(var3_5, var8_10.f);
                    var8_10 = dp$$ExternalSyntheticApiModelOutline0.m(dp$$ExternalSyntheticApiModelOutline0.m(dp$$ExternalSyntheticApiModelOutline0.m$2(dp$$ExternalSyntheticApiModelOutline0.m$1(dp$$ExternalSyntheticApiModelOutline0.m((Font.Builder)var2_3, var8_10.b), (int)var8_10.c), var8_10.e), var8_10.d));
                    if (var1_1 /* !! */  != null) break block11;
                    var2_3 = new FontFamily.Builder((Font)var8_10);
                    var1_1 /* !! */  = var2_3;
                    break block12;
                }
                dp$$ExternalSyntheticApiModelOutline0.m((FontFamily.Builder)var1_1 /* !! */ , (Font)var8_10);
            }
lbl21:
            // 2 sources

        }
        if (var1_1 /* !! */  == null) {
            return null;
        }
        try {
            var1_1 /* !! */  = dp$$ExternalSyntheticApiModelOutline0.m((FontFamily.Builder)var1_1 /* !! */ );
            var2_3 = new Typeface.CustomFallbackBuilder((FontFamily)var1_1 /* !! */ );
            var1_1 /* !! */  = dp$$ExternalSyntheticApiModelOutline0.m(dp$$ExternalSyntheticApiModelOutline0.m((Typeface.CustomFallbackBuilder)var2_3, dp$$ExternalSyntheticApiModelOutline0.m(tm.h((FontFamily)var1_1 /* !! */ , var4_6))));
            return var1_1 /* !! */ ;
        }
        catch (Exception var1_2) {
            Log.w((String)"TypefaceCompatApi29Impl", (String)"Font load failed", (Throwable)var1_2);
            return null;
        }
        {
            catch (IOException var2_4) {
                ** continue;
            }
        }
    }

    @Override
    public final Typeface d(Context context, Resources resources, int n2, String string, int n3) {
        try {
            context = new Font.Builder(resources, n2);
            context = dp$$ExternalSyntheticApiModelOutline0.m((Font.Builder)context);
            resources = new FontFamily.Builder((Font)context);
            resources = dp$$ExternalSyntheticApiModelOutline0.m((FontFamily.Builder)resources);
            string = new Typeface.CustomFallbackBuilder((FontFamily)resources);
            context = dp$$ExternalSyntheticApiModelOutline0.m(dp$$ExternalSyntheticApiModelOutline0.m((Typeface.CustomFallbackBuilder)string, dp$$ExternalSyntheticApiModelOutline0.m((Font)context)));
            return context;
        }
        catch (Exception exception) {
            Log.w((String)"TypefaceCompatApi29Impl", (String)"Font load failed", (Throwable)exception);
            return null;
        }
    }

    @Override
    public final Typeface f(Context context, List list, int n2) {
        ContentResolver contentResolver;
        block7: {
            contentResolver = context.getContentResolver();
            context = tm.i((uh[])list.get(0), contentResolver);
            if (context != null) break block7;
            return null;
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder((FontFamily)context);
        int n3 = 1;
        while (true) {
            block8: {
                if (n3 >= list.size()) break;
                FontFamily fontFamily = tm.i((uh[])list.get(n3), contentResolver);
                if (fontFamily == null) break block8;
                dp$$ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamily);
            }
            ++n3;
        }
        try {
            context = dp$$ExternalSyntheticApiModelOutline0.m(dp$$ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, dp$$ExternalSyntheticApiModelOutline0.m(tm.h((FontFamily)context, n2))));
            return context;
        }
        catch (Exception exception) {
            Log.w((String)"TypefaceCompatApi29Impl", (String)"Font load failed", (Throwable)exception);
            return null;
        }
    }

    @Override
    protected final Typeface l(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override
    protected final uh m(uh[] uhArray, int n2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

