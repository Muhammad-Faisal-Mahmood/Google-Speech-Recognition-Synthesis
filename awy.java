/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DatabaseErrorHandler
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteOpenHelper
 *  android.util.Log
 */
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.Closeable;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

public final class awy
extends SQLiteOpenHelper {
    private final Context a;
    private final awm b;
    private final boolean c;
    private boolean d;
    private final axd e;
    private boolean f;
    private final ilo g;

    public awy(Context context, String string, ilo object, awm awm2, boolean bl2) {
        jse.e(context, "context");
        super(context, string, null, 23, (DatabaseErrorHandler)new awv((ilo)object));
        this.a = context;
        this.g = object;
        this.b = awm2;
        this.c = bl2;
        object = string;
        if (string == null) {
            object = UUID.randomUUID().toString();
            jse.d(object, "randomUUID().toString()");
        }
        this.e = new axd((String)object, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase sQLiteDatabase = super.getWritableDatabase();
        jse.d(sQLiteDatabase, "{\n                super.\u2026eDatabase()\n            }");
        return sQLiteDatabase;
    }

    public final awu a(SQLiteDatabase sQLiteDatabase) {
        jse.e(sQLiteDatabase, "sqLiteDatabase");
        return yj.r(this.g, sQLiteDatabase);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final awl b() {
        block16: {
            var3_1 = this.e;
            var2_8 = this.f == false && this.getDatabaseName() != null;
            var3_1.a(var2_8);
            this.d = false;
            var5_9 = this.getDatabaseName();
            var2_8 = this.f;
            if (var5_9 == null || var2_8 || (var3_1 = this.a.getDatabasePath(var5_9).getParentFile()) == null) break block16;
            var3_1.mkdirs();
            if (var3_1.isDirectory()) break block16;
            Objects.toString(var3_1);
            Log.w((String)"SupportSQLite", (String)"Invalid database parent file, not a directory: ".concat(var3_1.toString()));
        }
        try {
            var3_1 = this.c();
            ** GOTO lbl48
        }
        catch (Throwable var3_2) {
            try {
                Thread.sleep(500L);
            }
            catch (InterruptedException var3_6) {
                ** continue;
            }
lbl23:
            // 2 sources

            while (true) {
                try {
                    var3_1 = this.c();
                    ** GOTO lbl48
                }
                catch (Throwable var3_3) {
                    var4_10 = var3_3;
                    try {
                        if (var3_3 instanceof aww) {
                            var3_1 = (aww)var3_3;
                            var4_10 = var3_1.b;
                            var1_11 = var3_1.a.ordinal();
                            if (var1_11 == 0) throw var4_10;
                            if (var1_11 == 1) throw var4_10;
                            if (var1_11 == 2) throw var4_10;
                            if (var1_11 == 3) throw var4_10;
                            if (var4_10 instanceof SQLiteException == false) throw var4_10;
                        }
                        if (var4_10 instanceof SQLiteException == false) throw var4_10;
                        if (var5_9 == null) throw var4_10;
                        if (this.c == false) throw var4_10;
                        this.a.deleteDatabase(var5_9);
                        try {
                            var3_1 = this.c();
                        }
                        catch (aww var3_4) {
                            throw var3_4.b;
                        }
lbl48:
                        // 3 sources

                        if (this.d) {
                            this.close();
                            var3_1 = this.b();
                            return var3_1;
                        }
                        var3_1 = this.a((SQLiteDatabase)var3_1);
                        return var3_1;
                    }
                    catch (Throwable var3_5) {
                        throw var3_5;
                    }
                    finally {
                        this.e.b();
                    }
                }
                break;
            }
        }
    }

    public final void close() {
        try {
            axd axd2 = this.e;
            Map map = axd.a;
            boolean bl2 = axd2.b;
            axd2.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
            return;
        }
        finally {
            this.e.b();
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        jse.e(sQLiteDatabase, "db");
        if (!this.d) {
            int n2 = this.b.a;
            if (sQLiteDatabase.getVersion() != 23) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
        }
        try {
            this.a(sQLiteDatabase);
            return;
        }
        catch (Throwable throwable) {
            throw new aww(awx.a, throwable);
        }
    }

    /*
     * Exception decompiling
     */
    public final void onCreate(SQLiteDatabase var1_1) {
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

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        jse.e(sQLiteDatabase, "db");
        this.d = true;
        try {
            this.b.b(this.a(sQLiteDatabase), n2, n3);
            return;
        }
        catch (Throwable throwable) {
            throw new aww(awx.d, throwable);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOpen(SQLiteDatabase var1_1) {
        block24: {
            jse.e(var1_1, "db");
            if (this.d) break block24;
            var4_6 = this.b;
            var5_9 = this.a((SQLiteDatabase)var1_1);
            var1_1 = var5_9.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            var2_11 = var1_1.moveToFirst() != false && (var2_11 = var1_1.getInt(0)) != 0 ? 1 : 0;
            jsd.f((Closeable)var1_1, null);
            if (var2_11 == 0) ** GOTO lbl36
            var1_1 = new awk("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            var6_12 = var5_9.a((awr)var1_1);
            var1_1 = var6_12.moveToFirst() != false ? var6_12.getString(0) : null;
            jsd.f((Closeable)var6_12, null);
            if (!jse.i(var4_6.e, var1_1) && !jse.i(var4_6.f, var1_1)) {
                var5_9 = new StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                var5_9.append(var4_6.e);
                var5_9.append(", found: ");
                var5_9.append((String)var1_1);
                var6_12 = new IllegalStateException(var5_9.toString());
                throw var6_12;
            }
            ** GOTO lbl39
            catch (Throwable var4_7) {
                try {
                    throw var4_7;
                }
                catch (Throwable var1_2) {
                    block25: {
                        jsd.f((Closeable)var6_12, var4_7);
                        throw var1_2;
lbl36:
                        // 1 sources

                        var1_1 = var4_6.d.b((awl)var5_9);
                        if (!var1_1.a) ** GOTO lbl80
                        awm.c((awl)var5_9);
lbl39:
                        // 2 sources

                        var1_1 = var4_6.d;
                        ((bdl)var1_1).a.a = var5_9;
                        var5_9.g("PRAGMA foreign_keys = ON");
                        var1_1 = ((bdl)var1_1).a;
                        var7_13 = new bzb(var5_9, null);
                        var1_1 = var1_1.b();
                        var8_14 = var1_1.c;
                        var6_12 = var7_13.L("PRAGMA query_only");
                        var6_12.h();
                        var3_15 = var6_12.j();
                        var6_12.e();
                        if (var3_15) ** GOTO lbl68
                        yi.k((bzb)var7_13, "PRAGMA temp_store = MEMORY");
                        yi.k((bzb)var7_13, "PRAGMA recursive_triggers = 1");
                        yi.k((bzb)var7_13, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        var7_13 = var8_14.e;
                        var6_12 = var7_13.d;
                        ((ReentrantLock)var6_12).lock();
                        var7_13.a = true;
                        {
                            catch (Throwable var1_3) {
                                ((ReentrantLock)var6_12).unlock();
                                throw var1_3;
                            }
                        }
                        ((ReentrantLock)var6_12).unlock();
lbl68:
                        // 2 sources

                        var6_12 = var1_1.i;
                        synchronized (var6_12) {
                            var7_13 = var1_1.j;
                            var1_1 = var1_1.h;
                        }
                        var1_1 = var4_6.c.iterator();
                        while (var1_1.hasNext()) {
                            ((we)var1_1.next()).l((awl)var5_9);
                        }
                        break block25;
                        catch (Throwable var1_4) {
                            var6_12.e();
                            throw var1_4;
                        }
lbl80:
                        // 1 sources

                        var4_6 = "Pre-packaged database has an invalid schema: ".concat(String.valueOf(var1_1.b));
                        var1_1 = new IllegalStateException((String)var4_6);
                        throw var1_1;
                    }
                    var4_6.b = null;
                    catch (Throwable var5_10) {
                        try {
                            throw var5_10;
                        }
                        catch (Throwable var4_8) {
                            try {
                                jsd.f((Closeable)var1_1, var5_10);
                                throw var4_8;
                            }
                            catch (Throwable var1_5) {
                                throw new aww(awx.e, var1_5);
                            }
                        }
                    }
                }
            }
        }
        this.f = true;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        jse.e(sQLiteDatabase, "sqLiteDatabase");
        this.d = true;
        try {
            this.b.b(this.a(sQLiteDatabase), n2, n3);
            return;
        }
        catch (Throwable throwable) {
            throw new aww(awx.c, throwable);
        }
    }
}

