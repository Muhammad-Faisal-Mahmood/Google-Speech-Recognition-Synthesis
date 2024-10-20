/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.database.sqlite.SQLiteDatabase
 */
import android.content.ComponentCallbacks;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public final class fmi
implements gte {
    public final Object a;
    private final int b;

    public /* synthetic */ fmi(int n2) {
        this.b = n2;
        this.a = "accountmanager";
    }

    public /* synthetic */ fmi(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object apply(Object var1_1) {
        var2_7 = this.b;
        var3_8 = false;
        switch (var2_7) {
            default: {
                return this.a.a(var1_1);
            }
            case 19: {
                var1_1 = (Void)var1_1;
                return this.a;
            }
            case 18: {
                var1_1 = (geq)var1_1;
                var1_1 = this.a;
                jse.e(var1_1, "$snapshot");
                return var1_1;
            }
            case 17: {
                this.a.a(var1_1);
                return null;
            }
            case 16: {
                return this.a.a(var1_1);
            }
            case 15: {
                jse.e((List)var1_1, "it");
                return (gfb)hhk.S((Future)this.a);
            }
            case 14: {
                return this.a.a(var1_1);
            }
            case 13: {
                this.a.a(var1_1);
                return null;
            }
            case 12: {
                var2_7 = gdj.b;
                return this.a.a(var1_1);
            }
            case 11: {
                var2_7 = gdj.b;
                return this.a.a(var1_1);
            }
            case 10: {
                var2_7 = gdj.b;
                return this.a.a(var1_1);
            }
            case 9: {
                var1_1 = (Void)var1_1;
                return ((bmu)this.a).c;
            }
            case 8: {
                var1_1 = (Void)var1_1;
                return ((bmu)this.a).c;
            }
            case 7: {
                var1_1 = (Void)var1_1;
                return ((bmu)this.a).c;
            }
            case 6: {
                var1_1 = (Void)var1_1;
                return ((bmu)this.a).c;
            }
            case 5: {
                var4_9 = (gao)var1_1;
                var1_1 = (hwp)var4_9.C(5);
                var1_1.x(var4_9);
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var4_9 = (gao)var1_1.b;
                var5_14 = gao.a;
                var5_14 = var4_9.b;
                if (!var5_14.b) {
                    var4_9.b = var5_14.a();
                }
                var5_14 = this.a;
                var4_9.b.put(var5_14, true);
                return (gao)var1_1.o();
            }
            case 4: {
                var4_10 = ((gao)var1_1).b;
                var1_1 = this.a;
                if (var4_10.containsKey(var1_1) == false) return var3_8 ^ true;
                var3_8 = (Boolean)var4_10.get(var1_1);
                return var3_8 ^ true;
            }
            case 3: {
                var1_1 = (Void)var1_1;
                return ((AtomicReference)this.a).get();
            }
            case 2: {
                var1_1 = (String)var1_1;
                var5_15 = this.a;
                var6_19 = (fsi)var5_15;
                var4_11 = var6_19.b.getDatabasePath((String)var1_1);
                if (var6_19.l) ** GOTO lbl91
                var7_23 = var6_19.p;
                var1_1 = var4_11.getPath();
                if (var7_23.a.add(var1_1) == false) throw new IllegalStateException(a.aj(var1_1, "DB ", " opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?"));
                var6_19.l = true;
                var6_19.m = var3_8 = fsi.f(var6_19.b, var6_19.n);
                if (!var3_8) ** GOTO lbl91
                try {
                    var1_1 = ((fsi)var5_15).b.getCacheDir();
                    if (var1_1 == null) ** GOTO lbl91
                    ((fsi)var5_15).m = var3_8 = var4_11.getCanonicalPath().startsWith(var1_1.getCanonicalPath());
                }
                catch (IOException var1_6) {}
lbl91:
                // 4 sources

                while (true) {
                    var1_1 = var6_19.g;
                    if (!var1_1.isEmpty()) {
                        var1_1 = var1_1.iterator();
                        while (var1_1.hasNext()) {
                            var7_23 = (SQLiteDatabase)((WeakReference)var1_1.next()).get();
                            if (var7_23 != null) {
                                if (!var7_23.isOpen()) continue;
                                var1_1 = var7_23.getPath();
                                var4_11 = new StringBuilder("Open database reference to ");
                                var4_11.append((String)var1_1);
                                var4_11.append(" already exists. Follow instructions in source to file a bug against TikTok.");
                                throw new IllegalStateException(var4_11.toString());
                            }
                            var1_1.remove();
                        }
                    }
                    try {
                        var1_1 = fsi.e(((fsi)var5_15).b, (File)var4_11, ((fsi)var5_15).n, ((fsi)var5_15).d, ((fsi)var5_15).e, ((fsi)var5_15).f);
                    }
                    catch (fse | fsg | fsh var1_2) {
                        try {
                            var1_1 = fsi.e(((fsi)var5_15).b, (File)var4_11, ((fsi)var5_15).n, ((fsi)var5_15).d, ((fsi)var5_15).e, ((fsi)var5_15).f);
                        }
                        catch (fsg var6_20) {
                            a.as(fsi.a.g(), "Fatal Exception when trying to upgrade database. Proceeding to delete.", "com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper", "innerOpenDatabase", '\u01bf', "AsyncSQLiteOpenHelper.java", var6_20);
                            var1_3 /* !! */  = new File(String.valueOf(var4_11.getPath()).concat("-wal"));
                            var5_15 = new File(String.valueOf(var4_11.getPath()).concat("-journal"));
                            var7_23 = new File(String.valueOf(var4_11.getPath()).concat("-shm"));
                            {
                                catch (Throwable var1_4) {
                                    throw new fse("Recovery by deletion failed.", var1_4);
                                }
                                try {
                                    if (!(var1_3 /* !! */ .exists() && !var1_3 /* !! */ .delete() || var5_15.exists() && !var5_15.delete() || var7_23.exists() && !var7_23.delete())) {
                                        if (var4_11.delete() != false) throw new fse("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", var6_20);
                                    }
                                    var1_3 /* !! */  = new fsf(String.format("Unable to clean up database %s", new Object[]{var4_11.getAbsolutePath()}));
                                    throw var1_3 /* !! */ ;
                                }
                                catch (Throwable var5_16) {}
                                {
                                    var1_3 /* !! */  = new fsf(String.format("Unable to clean up database %s", new Object[]{var4_11.getAbsolutePath()}), var5_16);
                                    throw var1_3 /* !! */ ;
                                }
                            }
                        }
                        catch (fsh var1_5) {
                            throw new fse("Probably-recoverable database upgrade failure.", var1_5);
                        }
                    }
                    var6_19.g.add(new WeakReference<Object>(var1_1));
                    var6_19.b.registerComponentCallbacks((ComponentCallbacks)var5_15);
                    return var1_1;
                }
                ** continue;
            }
            case 1: {
                var1_1 = (fmg)var1_1;
                var6_21 = var1_1.d;
                var5_17 = this.a;
                var4_12 = (String)var5_17;
                if (var4_12.equals(var6_21)) {
                    return var1_1;
                }
                var6_21 = new ArrayList<E>(var1_1.e);
                var6_21.remove(var5_17);
                var6_21.add(var1_1.d);
                var1_1 = fmg.a.l();
                var1_1.L((Iterable)var6_21);
                if (!var1_1.b.B()) {
                    var1_1.u();
                }
                var6_21 = (fmg)var1_1.b;
                var5_17.getClass();
                var6_21.b |= 2;
                var6_21.d = var4_12;
                return (fmg)var1_1.o();
            }
            case 0: 
        }
        var5_18 = (fmg)var1_1;
        var1_1 = var5_18.d;
        var4_13 = this.a;
        var6_22 = (hav)var4_13;
        if (var6_22.isEmpty()) {
            var1_1 = "";
        } else if (!var6_22.contains(var5_18.d)) {
            var1_1 = (String)var6_22.k().next();
        }
        var5_18 = fmg.a.l();
        var5_18.L(hhk.o((Set)var4_13, new hdq(var1_1)));
        if (!var5_18.b.B()) {
            var5_18.u();
        }
        var4_13 = (fmg)var5_18.b;
        var1_1.getClass();
        var4_13.b |= 2;
        var4_13.d = var1_1;
        return (fmg)var5_18.o();
    }
}

