/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 *  android.webkit.MimeTypeMap
 */
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.HashMap;

public class ss
extends ContentProvider {
    private static final String[] a = new String[]{"_display_name", "_size"};
    private static final File b = new File("/");
    private static final HashMap c = new HashMap();
    private final Object d = new Object();
    private String e;
    private awg f;

    public static String a(String string) {
        String string2 = string;
        if (string.length() > 0) {
            string2 = string;
            if (string.charAt(string.length() - 1) == '/') {
                string2 = string.substring(0, string.length() - 1);
            }
        }
        return string2;
    }

    /*
     * Exception decompiling
     */
    public static awg b(Context var0, String var1_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 22[TRYBLOCK] [74 : 530->533)] java.lang.Throwable
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final awg c() {
        Object object = this.d;
        synchronized (object) {
            a.r(this.e, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.f != null) return this.f;
            this.f = ss.b(this.getContext(), this.e);
            return this.f;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void attachInfo(Context object, ProviderInfo object2) {
        super.attachInfo((Context)object, object2);
        if (object2.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (object2.grantUriPermissions) {
            object2 = object2.authority.split(";")[0];
            object = this.d;
            synchronized (object) {
                this.e = object2;
            }
            object = c;
            synchronized (object) {
                ((HashMap)object).remove(object2);
                return;
            }
        }
        throw new SecurityException("Provider must grant uri permissions");
    }

    public final int delete(Uri uri, String string, String[] stringArray) {
        if (this.c().f(uri).delete()) {
            return 1;
        }
        return 0;
    }

    public final String getType(Uri object) {
        object = this.c().f((Uri)object);
        int n2 = ((File)object).getName().lastIndexOf(46);
        if (n2 >= 0) {
            object = ((File)object).getName().substring(n2 + 1);
            object = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String)object);
            if (object != null) {
                return object;
            }
        }
        return "application/octet-stream";
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final boolean onCreate() {
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final ParcelFileDescriptor openFile(Uri object, String string) {
        int n2;
        void var2_3;
        File file = this.c().f((Uri)object);
        if ("r".equals(var2_3)) {
            n2 = 0x10000000;
            return ParcelFileDescriptor.open((File)file, (int)n2);
        } else if (!"w".equals(var2_3) && !"wt".equals(var2_3)) {
            if ("wa".equals(var2_3)) {
                n2 = 0x2A000000;
                return ParcelFileDescriptor.open((File)file, (int)n2);
            } else if ("rw".equals(var2_3)) {
                n2 = 0x38000000;
                return ParcelFileDescriptor.open((File)file, (int)n2);
            } else {
                if (!"rwt".equals(var2_3)) throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(var2_3)));
                n2 = 0x3C000000;
            }
            return ParcelFileDescriptor.open((File)file, (int)n2);
        } else {
            n2 = 0x2C000000;
        }
        return ParcelFileDescriptor.open((File)file, (int)n2);
    }

    public final Cursor query(Uri matrixCursor, String[] object, String string, String[] object2, String objectArray) {
        object2 = this.c().f((Uri)matrixCursor);
        string = matrixCursor.getQueryParameter("displayName");
        matrixCursor = object;
        if (object == null) {
            matrixCursor = a;
        }
        int n2 = ((String[])matrixCursor).length;
        String[] stringArray = new String[n2];
        objectArray = new Object[n2];
        n2 = 0;
        for (int i2 = 0; i2 < ((String[])matrixCursor).length; ++i2) {
            int n3;
            block7: {
                block6: {
                    block5: {
                        object = matrixCursor[i2];
                        if (!"_display_name".equals(object)) break block5;
                        n3 = n2 + 1;
                        stringArray[n2] = "_display_name";
                        object = string == null ? ((File)object2).getName() : string;
                        objectArray[n2] = object;
                        n2 = n3;
                        break block6;
                    }
                    n3 = n2;
                    if (!"_size".equals(object)) break block7;
                    n3 = n2 + 1;
                    stringArray[n2] = "_size";
                    objectArray[n2] = ((File)object2).length();
                    n2 = n3;
                }
                n3 = n2;
            }
            n2 = n3;
        }
        matrixCursor = new String[n2];
        System.arraycopy(stringArray, 0, matrixCursor, 0, n2);
        object = new Object[n2];
        System.arraycopy(objectArray, 0, object, 0, n2);
        matrixCursor = new MatrixCursor((String[])matrixCursor, 1);
        matrixCursor.addRow((Object[])object);
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        throw new UnsupportedOperationException("No external updates");
    }
}

