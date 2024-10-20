/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.res.AssetFileDescriptor
 *  android.database.Cursor
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Log
 *  android.webkit.MimeTypeMap
 */
package org.chromium.base;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public abstract class ContentUriUtils {
    private static final Object a = new Object();

    private ContentUriUtils() {
    }

    private static AssetFileDescriptor a(String string) {
        Object object;
        block9: {
            block8: {
                ContentResolver contentResolver;
                block6: {
                    block7: {
                        String[] stringArray;
                        contentResolver = jjj.c.getContentResolver();
                        object = Uri.parse((String)string);
                        try {
                            if (!ContentUriUtils.c(object)) break block6;
                            stringArray = contentResolver.getStreamTypes(object, "*/*");
                            if (stringArray == null) break block7;
                        }
                        catch (Exception exception) {
                            Log.w((String)"cr_ContentUriUtils", (String)String.format(Locale.US, "Cannot open content uri: %s", string), (Throwable)exception);
                            return null;
                        }
                        if (stringArray.length <= 0) break block7;
                        object = contentResolver.openTypedAssetFileDescriptor(object, stringArray[0], null);
                        break block8;
                    }
                    object = null;
                    break block8;
                }
                object = contentResolver.openAssetFileDescriptor(object, "r");
            }
            if (object != null) {
                if (object.getStartOffset() == 0L) break block9;
                jjj.ac((Closeable)object);
                object = new SecurityException("Cannot open files with non-zero offset type.");
                throw object;
            }
        }
        return object;
    }

    private static boolean b(Cursor cursor) {
        int n2 = cursor.getColumnIndex("flags");
        return n2 >= 0 && (cursor.getLong(n2) & 0x200L) != 0L;
    }

    /*
     * Exception decompiling
     */
    private static boolean c(Uri var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean contentUriExists(String string) {
        boolean bl2 = (string = ContentUriUtils.a(string)) != null;
        if (string == null) return bl2;
        try {
            string.close();
            return bl2;
        }
        catch (IOException iOException) {
            return bl2;
        }
    }

    public static boolean delete(String string) {
        string = Uri.parse((String)string);
        return jjj.c.getContentResolver().delete((Uri)string, null, null) > 0;
    }

    public static long getContentUriFileSize(String string) {
        long l2 = (string = ContentUriUtils.a(string)) != null ? string.getLength() : -1L;
        jjj.ac((Closeable)((Object)string));
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static String getContentUriFromFilePath(String string) {
        try {
            new File(string);
            Object object = a;
            // MONITORENTER : object
            // MONITOREXIT : object
            return null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Log.e((String)"cr_ContentUriUtils", (String)String.format(Locale.US, "Cannot retrieve content uri from file: %s", string), (Throwable)illegalArgumentException);
        }
        return null;
    }

    public static String getMimeType(String stringArray) {
        ContentResolver contentResolver = jjj.c.getContentResolver();
        if (ContentUriUtils.c((Uri)(stringArray = Uri.parse((String)stringArray)))) {
            if ((stringArray = contentResolver.getStreamTypes((Uri)stringArray, "*/*")) != null && stringArray.length > 0) {
                return stringArray[0];
            }
            return null;
        }
        return contentResolver.getType((Uri)stringArray);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String maybeGetDisplayName(String var0) {
        block16: {
            block17: {
                var7_1 /* !! */  = Uri.parse((String)var0);
                var3_2 /* !! */  = jjj.c;
                var4_6 = "";
                if (var7_1 /* !! */  != null) break block17;
                var3_2 /* !! */  = var4_6;
                ** GOTO lbl49
            }
            var8_7 = var3_2 /* !! */ .getContentResolver();
            var6_8 = var8_7.query((Uri)var7_1 /* !! */ , null, null, null, null);
            if (var6_8 == null) ** GOTO lbl44
            if (var6_8.getCount() <= 0) ** GOTO lbl44
            var6_8.moveToFirst();
            var1_9 = var6_8.getColumnIndex("_display_name");
            if (var1_9 == -1) ** GOTO lbl47
            var5_10 = var6_8.getString(var1_9);
            var3_2 /* !! */  = var5_10;
            if (!ContentUriUtils.b(var6_8)) break block16;
            var7_1 /* !! */  = var8_7.getStreamTypes((Uri)var7_1 /* !! */ , "*/*");
            var3_2 /* !! */  = var5_10;
            if (var7_1 /* !! */  == null) break block16;
            var3_2 /* !! */  = var5_10;
            if (var7_1 /* !! */ .length <= 0) break block16;
            var7_1 /* !! */  = MimeTypeMap.getSingleton().getExtensionFromMimeType(var7_1 /* !! */ [0]);
            var3_2 /* !! */  = var5_10;
            if (var7_1 /* !! */  == null) break block16;
            var3_2 /* !! */  = a.ao((String)var7_1 /* !! */ , var5_10, ".");
        }
        var6_8.close();
        ** GOTO lbl49
        catch (Throwable var3_3) {
            try {
                var6_8.close();
                throw var3_3;
            }
            catch (Throwable var5_11) {
                try {
                    block18: {
                        var3_3.addSuppressed(var5_11);
                        throw var3_3;
lbl44:
                        // 2 sources

                        var3_2 /* !! */  = var4_6;
                        if (var6_8 == null) break block18;
lbl47:
                        // 3 sources

                        var6_8.close();
                        var3_2 /* !! */  = var4_6;
                    }
lbl50:
                    // 2 sources

                    while (true) {
                        var2_12 = TextUtils.isEmpty((CharSequence)var3_2 /* !! */ );
                        if (var2_12 == false) return var3_2 /* !! */ ;
                        return null;
                    }
                }
                catch (Exception var3_4) {}
                ** GOTO lbl-1000
                catch (NullPointerException var3_5) {
                    var3_2 /* !! */  = var4_6;
                    ** continue;
                }
lbl-1000:
                // 1 sources

                {
                    Log.w((String)"cr_ContentUriUtils", (String)String.format(Locale.US, "Cannot open content uri: %s", new Object[]{var0}), (Throwable)var3_4);
                    return null;
                }
            }
        }
    }

    public static int openContentUriForRead(String string) {
        if ((string = ContentUriUtils.a(string)) != null) {
            return string.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }
}

