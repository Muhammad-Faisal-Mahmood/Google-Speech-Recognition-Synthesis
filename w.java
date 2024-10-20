/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.util.Log
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class w
implements Closeable {
    private final File a;
    private final long b;
    private final File c;
    private final RandomAccessFile d;
    private final FileChannel e;
    private final FileLock f;

    /*
     * Loose catch block
     * WARNING - void declaration
     */
    public w(File file, File object) {
        void iOException;
        StringBuilder stringBuilder = new StringBuilder("MultiDexExtractor(");
        stringBuilder.append(file.getPath());
        stringBuilder.append(", ");
        stringBuilder.append(((File)object).getPath());
        stringBuilder.append(")");
        Log.i((String)"MultiDex", (String)stringBuilder.toString());
        this.a = file;
        this.c = object;
        this.b = w.c(file);
        file = new File((File)object, "MultiDex.lock");
        this.d = object = new RandomAccessFile(file, "rw");
        this.e = object = ((RandomAccessFile)object).getChannel();
        stringBuilder = new StringBuilder("Blocking on lock ");
        stringBuilder.append(file.getPath());
        Log.i((String)"MultiDex", (String)stringBuilder.toString());
        this.f = ((FileChannel)object).lock();
        object = new StringBuilder();
        ((StringBuilder)object).append(file.getPath());
        ((StringBuilder)object).append(" locked");
        Log.i((String)"MultiDex", (String)((StringBuilder)object).toString());
        return;
        catch (Error error2) {
        }
        catch (RuntimeException runtimeException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        try {
            w.f(this.e);
            throw file;
        }
        catch (Error error) {
        }
        catch (RuntimeException runtimeException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        w.f(this.d);
        throw iOException;
    }

    private static long b(File file) {
        long l2;
        long l3 = l2 = file.lastModified();
        if (l2 == -1L) {
            l3 = -2L;
        }
        return l3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static long c(File object) {
        long l2;
        block13: {
            byte[] byArray;
            CRC32 cRC32;
            int n2;
            block12: {
                object = new RandomAccessFile((File)object, "r");
                l2 = ((RandomAccessFile)object).length();
                long l3 = -22L + l2;
                if (l3 >= 0L) {
                    long l4;
                    l2 = l4 = l2 - 65558L;
                    if (l4 < 0L) {
                        l2 = 0L;
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("File too short to be a zip file: ");
                    stringBuilder.append(((RandomAccessFile)object).length());
                    ZipException zipException = new ZipException(stringBuilder.toString());
                    throw zipException;
                }
                n2 = Integer.reverseBytes(101010256);
                do {
                    ((RandomAccessFile)object).seek(l3);
                    if (((RandomAccessFile)object).readInt() != n2) continue;
                    ((RandomAccessFile)object).skipBytes(2);
                    ((RandomAccessFile)object).skipBytes(2);
                    ((RandomAccessFile)object).skipBytes(2);
                    ((RandomAccessFile)object).skipBytes(2);
                    l2 = Integer.reverseBytes(((RandomAccessFile)object).readInt());
                    l3 = Integer.reverseBytes(((RandomAccessFile)object).readInt());
                    cRC32 = new CRC32();
                    ((RandomAccessFile)object).seek(l3 & 0xFFFFFFFFL);
                    n2 = (int)Math.min(16384L, l2 &= 0xFFFFFFFFL);
                    byArray = new byte[16384];
                    n2 = ((RandomAccessFile)object).read(byArray, 0, n2);
                    break block12;
                } while (--l3 >= l2);
                ZipException zipException = new ZipException("End Of Central Directory signature not found");
                throw zipException;
            }
            while (n2 != -1) {
                cRC32.update(byArray, 0, n2);
                if ((l2 -= (long)n2) == 0L) break;
                n2 = ((RandomAccessFile)object).read(byArray, 0, (int)Math.min(16384L, l2));
            }
            l2 = cRC32.getValue();
            if (l2 != -1L) break block13;
            return -2L;
        }
        return l2;
        finally {
            ((RandomAccessFile)object).close();
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /*
     * Exception decompiling
     */
    private final List e() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [28[WHILELOOP]], but top level block is 5[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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

    private static void f(Closeable closeable) {
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            Log.w((String)"MultiDex", (String)"Failed to close resource", (Throwable)iOException);
            return;
        }
    }

    private static void g(Context context, long l2, long l3, List object) {
        context = w.d(context).edit();
        context.putLong("timestamp", l2);
        context.putLong("crc", l3);
        context.putInt("dex.number", object.size() + 1);
        object = object.iterator();
        int n2 = 2;
        while (object.hasNext()) {
            v v2 = (v)object.next();
            context.putLong(a.af(n2, "dex.crc."), v2.a);
            context.putLong(a.af(n2, "dex.time."), v2.lastModified());
            ++n2;
        }
        context.commit();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final List a(Context object, boolean bl2) {
        Object object2;
        block9: {
            Object object3;
            long l2;
            block10: {
                block7: {
                    block8: {
                        object2 = new StringBuilder("MultiDexExtractor.load(");
                        ((StringBuilder)object2).append(this.a.getPath());
                        ((StringBuilder)object2).append(", ");
                        ((StringBuilder)object2).append(bl2);
                        ((StringBuilder)object2).append(", )");
                        Log.i((String)"MultiDex", (String)((StringBuilder)object2).toString());
                        if (!this.f.isValid()) {
                            throw new IllegalStateException("MultiDexExtractor was closed");
                        }
                        if (bl2) break block7;
                        object2 = this.a;
                        l2 = this.b;
                        object3 = w.d((Context)object);
                        if (object3.getLong("timestamp", -1L) != w.b((File)object2) || object3.getLong("crc", -1L) != l2) break block8;
                        try {
                            Log.i((String)"MultiDex", (String)"loading existing secondary dex files");
                            object2 = String.valueOf(this.a.getName()).concat(".classes");
                            SharedPreferences sharedPreferences = w.d((Context)object);
                            int n2 = sharedPreferences.getInt("dex.number", 1);
                            object3 = new ArrayList(n2 - 1);
                            for (int i2 = 2; i2 <= n2; ++i2) {
                                Comparable<StringBuilder> comparable = new Comparable<StringBuilder>();
                                ((StringBuilder)comparable).append((String)object2);
                                ((StringBuilder)comparable).append(i2);
                                ((StringBuilder)comparable).append(".zip");
                                CharSequence charSequence = ((StringBuilder)comparable).toString();
                                comparable = new Comparable<StringBuilder>(this.c, (String)charSequence);
                                if (((File)comparable).isFile()) {
                                    ((v)comparable).a = w.c(comparable);
                                    charSequence = new StringBuilder();
                                    ((StringBuilder)charSequence).append("");
                                    ((StringBuilder)charSequence).append("dex.crc.");
                                    ((StringBuilder)charSequence).append(i2);
                                    long l3 = sharedPreferences.getLong(((StringBuilder)charSequence).toString(), -1L);
                                    charSequence = new StringBuilder();
                                    ((StringBuilder)charSequence).append("");
                                    ((StringBuilder)charSequence).append("dex.time.");
                                    ((StringBuilder)charSequence).append(i2);
                                    l2 = sharedPreferences.getLong(((StringBuilder)charSequence).toString(), -1L);
                                    long l4 = ((File)comparable).lastModified();
                                    if (l2 == l4 && l3 == ((v)comparable).a) {
                                        object3.add(comparable);
                                        continue;
                                    }
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append("Invalid extracted dex: ");
                                    ((StringBuilder)object2).append(comparable);
                                    ((StringBuilder)object2).append(" (key \"");
                                    ((StringBuilder)object2).append("");
                                    ((StringBuilder)object2).append("\"), expected modification time: ");
                                    ((StringBuilder)object2).append(l2);
                                    ((StringBuilder)object2).append(", modification time: ");
                                    ((StringBuilder)object2).append(l4);
                                    ((StringBuilder)object2).append(", expected crc: ");
                                    ((StringBuilder)object2).append(l3);
                                    ((StringBuilder)object2).append(", file crc: ");
                                    ((StringBuilder)object2).append(((v)comparable).a);
                                    object3 = new IOException(((StringBuilder)object2).toString());
                                    throw object3;
                                }
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append("Missing extracted secondary dex file '");
                                ((StringBuilder)object3).append(((File)comparable).getPath());
                                ((StringBuilder)object3).append("'");
                                object2 = new IOException(((StringBuilder)object3).toString());
                                throw object2;
                            }
                            object = object3;
                        }
                        catch (IOException iOException) {
                            Log.w((String)"MultiDex", (String)"Failed to reload existing extracted secondary dex files, falling back to fresh extraction", (Throwable)iOException);
                            object2 = this.e();
                            object3 = this.a;
                            l2 = this.b;
                            w.g((Context)object, w.b((File)object3), l2, (List)object2);
                            object = object2;
                        }
                        break block9;
                    }
                    Log.i((String)"MultiDex", (String)"Detected that extraction must be performed.");
                    break block10;
                }
                Log.i((String)"MultiDex", (String)"Forced extraction must be performed.");
            }
            object2 = this.e();
            object3 = this.a;
            l2 = this.b;
            w.g((Context)object, w.b((File)object3), l2, (List)object2);
            object = object2;
        }
        object2 = new StringBuilder("load found ");
        ((StringBuilder)object2).append(object.size());
        ((StringBuilder)object2).append(" secondary dex files");
        Log.i((String)"MultiDex", (String)((StringBuilder)object2).toString());
        return object;
    }

    @Override
    public final void close() {
        this.f.release();
        this.e.close();
        this.d.close();
    }
}

