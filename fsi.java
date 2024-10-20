/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.ComponentCallbacks2
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteDiskIOException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteFullException
 *  android.database.sqlite.SQLiteOutOfMemoryException
 *  android.database.sqlite.SQLiteTableLockedException
 *  hom
 */
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.io.Closeable;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Deprecated
public final class fsi
implements ComponentCallbacks2 {
    public static final hei a = hei.m("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final Context b;
    public final ScheduledExecutorService c;
    public final gto d;
    public final List e;
    public final List f;
    public final Set g = new HashSet();
    public final Object h = new Object();
    public final Executor i;
    public hpn j;
    public int k = 0;
    public boolean l = false;
    public boolean m;
    public final hti n;
    public final AmbientModeSupport$AmbientController o = new AmbientModeSupport$AmbientController(this);
    public final bzq p;
    private final hnx q;
    private final hpb r = new cmr(this, 12);
    private boolean s = false;
    private ScheduledFuture t;

    @Deprecated
    public fsi(Context context, ScheduledExecutorService scheduledExecutorService, bzq bzq2, hnx hnx2, gpm gpm2) {
        this.q = hnx2;
        this.c = scheduledExecutorService;
        this.p = bzq2;
        this.i = new hpz(scheduledExecutorService);
        this.b = context;
        this.d = (gto)gpm2.d;
        this.e = gpm2.a;
        this.f = gpm2.c;
        this.n = (hti)gpm2.b;
    }

    public static hog a(hpn hpn2, Closeable ... object) {
        fxf.K(hpn2);
        Object object2 = new AmbientModeSupport$AmbientController(object, null);
        hom hom2 = hom.a;
        object = new hod();
        object2 = new hqh(new gqh(object2, object, 2));
        hom2.execute((Runnable)object2);
        return new hog((hpn)object2, (hod)object).b(new frw(hpn2, 4), (Executor)hom.a);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static SQLiteDatabase e(Context object, File file, hti hti2, gto gto2, List list, List list2) {
        void var0_5;
        SQLiteDatabase sQLiteDatabase = fsi.h((Context)object, hti2, file);
        boolean bl2 = fsi.i(sQLiteDatabase, hti2, list, list2);
        gto2 = sQLiteDatabase;
        if (!bl2) return gto2;
        sQLiteDatabase.close();
        gto2 = fsi.h((Context)object, hti2, file);
        object = fxf.aq("Configuring reopened database.");
        fxf.B(fsi.i((SQLiteDatabase)gto2, hti2, list, list2) ^ true, "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
        ((gol)object).close();
        return gto2;
        catch (Throwable throwable) {
            try {
                ((gol)object).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    gto2.close();
                    throw throwable3;
                }
                catch (SQLiteException sQLiteException) {
                }
                catch (IllegalStateException illegalStateException) {
                    // empty catch block
                }
            }
        }
        gto2.close();
        throw new fse("Failed to open database.", (Throwable)var0_5);
        catch (Throwable throwable) {
            sQLiteDatabase.close();
            throw throwable;
        }
        catch (SQLiteException sQLiteException) {
            sQLiteDatabase.close();
            throw new fse("Failed to open database.", sQLiteException);
        }
    }

    public static boolean f(Context context, hti hti2) {
        int n2 = hti2.a;
        return !((ActivityManager)context.getSystemService("activity")).isLowRamDevice();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean g(SQLiteDatabase var0, List var1_1, List var2_10) {
        var3_14 = var0.getVersion();
        ((heg)((heg)fsi.a.c()).j("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "upgradeDatabase", 747, "AsyncSQLiteOpenHelper.java")).s("Database version is %d", var3_14);
        var4_15 = ((hct)var1_1).c;
        var5_16 = var3_14 <= var4_15;
        fxf.F(var5_16, "Can't downgrade from version %s to version %s", var3_14, var4_15);
        var7_17 = new hth(var0);
        var0.beginTransaction();
        if (var3_14 == ((hct)var1_1).c) ** GOTO lbl29
        var6_18 = fxf.aq("Applying upgrade steps");
        var4_15 = ((hct)var1_1).c;
        var8_19 = ((gzx)var1_1).c(var3_14, var4_15).iterator();
        while (var8_19.hasNext()) {
            var7_17.t((hth)((bzq)var8_19.next()).a);
        }
        var6_18.close();
        var0.setVersion(((hct)var1_1).c);
        ** GOTO lbl29
        catch (Throwable var1_2) {
            try {
                var6_18.close();
                throw var1_2;
            }
            catch (Throwable var2_12) {
                block18: {
                    var1_2.addSuppressed(var2_12);
                    throw var1_2;
lbl29:
                    // 2 sources

                    if ((var1_1 = ((gzx)var2_11 /* !! */ ).v()).hasNext()) break block18;
                    var0.setTransactionSuccessful();
                    var0.endTransaction();
                    if (var3_14 == var0.getVersion()) return false;
                    return true;
                }
                try {
                    var1_1 = (fvc)var1_1.next();
                    throw null;
                }
                catch (Throwable var1_3) {
                    try {
                        block19: {
                            var2_11 /* !! */  = new fsg(var1_3);
                            throw var2_11 /* !! */ ;
                            catch (SQLiteTableLockedException var1_4) {
                                break block19;
                            }
                            catch (SQLiteOutOfMemoryException var1_5) {
                                break block19;
                            }
                            catch (SQLiteFullException var1_6) {
                                break block19;
                            }
                            catch (SQLiteDiskIOException var1_7) {
                                break block19;
                            }
                            catch (SQLiteDatabaseLockedException var1_8) {
                                // empty catch block
                            }
                        }
                        var2_11 /* !! */  = new fsh("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", (Throwable)var1_9);
                        throw var2_11 /* !! */ ;
                        catch (InterruptedException var2_13) {
                            var1_1 = new fsh("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", var2_13);
                            throw var1_1;
                        }
                    }
                    catch (Throwable var1_10) {
                        var0.endTransaction();
                        throw var1_10;
                    }
                }
            }
        }
    }

    private static SQLiteDatabase h(Context context, hti hti2, File file) {
        block2: {
            boolean bl2 = fsi.f(context, hti2);
            int n2 = bl2 ? 0x30000000 : 0x10000000;
            file.getParentFile().mkdirs();
            try {
                context = SQLiteDatabase.openDatabase((String)file.getPath(), null, (int)n2, null);
                if (!bl2) break block2;
            }
            catch (Throwable throwable) {
                throw new fse("Failed to open database.", throwable);
            }
            context.enableWriteAheadLogging();
        }
        return context;
    }

    private static boolean i(SQLiteDatabase sQLiteDatabase, hti object, List list, List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        object = ((hti)object).b.iterator();
        while (object.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(String.valueOf((String)object.next())));
        }
        return fsi.g(sQLiteDatabase, list, list2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hog b() {
        Throwable throwable322222;
        fxf.av();
        gol gol2 = null;
        Object object = null;
        Object object2 = null;
        Object object3 = object;
        try {
            Object object4 = this.h;
            object3 = object;
            synchronized (object4) {
                object3 = object2;
            }
        }
        catch (Throwable throwable222) {}
        {
            int n2 = this.k + 1;
            object3 = object2;
            this.k = n2;
            object3 = object2;
            if (this.j == null) {
                boolean bl2 = n2 == 1;
                object3 = object2;
                fxf.B(bl2, "DB was null with nonzero refcount");
                object3 = object2;
                gol2 = fxf.aq("Opening database");
                object3 = gol2;
                try {
                    object = hhk.P(this.q, this.i);
                    object3 = gol2;
                    hhk.T((hpn)object, this.r, this.c);
                    object3 = gol2;
                    object3 = gol2;
                    object2 = new fmi(this, 2);
                    object3 = gol2;
                    object2 = hno.f((hpn)object, gqk.b((gte)object2), this.i);
                }
                catch (Exception exception) {
                    object3 = gol2;
                    object2 = hhk.J(exception);
                }
                object3 = gol2;
                this.j = object2;
            }
            object3 = gol2;
            object2 = this.j;
            object3 = gol2;
            object = this.t;
            if (object != null) {
                object3 = gol2;
                object.cancel(true);
            }
            object3 = gol2;
            // MONITOREXIT @DISABLED, blocks:[1, 6] lbl47 : MonitorExitStatement: MONITOREXIT : var7_8
            object3 = gol2;
        }
        object2 = hhk.L((hpn)object2);
        if (gol2 != null) {
            object3 = gol2;
            gol2.a((hpn)object2);
        }
        object3 = gol2;
        object3 = gol2;
        object = new fsd(this, 0);
        object3 = gol2;
        object = fsi.a((hpn)object2, new Closeable[]{object});
        object3 = gol2;
        object3 = gol2;
        object2 = new frw(this, 3);
        object3 = gol2;
        object2 = ((hog)object).b(gqk.e((hoc)object2), (Executor)hom.a);
        if (gol2 != null) {
            gol2.close();
        }
        return object2;
        {
            catch (Throwable throwable322222) {}
        }
        throw throwable322222;
        if (object3 != null) {
            ((gol)object3).close();
        }
        throw throwable222;
    }

    public final void c() {
        if (this.k == 0 && this.j != null) {
            if (this.s) {
                this.d();
                return;
            }
            this.t = this.c.schedule(new ffd(this, 8), 60L, TimeUnit.SECONDS);
            if (!this.m) {
                hhk.T(this.j, new cmr(this, 13), this.i);
            }
        }
    }

    public final void d() {
        ffd ffd2 = new ffd(this, 9);
        this.i.execute(ffd2);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        this.onTrimMemory(80);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onTrimMemory(int n2) {
        Object object = this.h;
        synchronized (object) {
            boolean bl2 = n2 >= 40;
            this.s = bl2;
            this.c();
            return;
        }
    }
}

