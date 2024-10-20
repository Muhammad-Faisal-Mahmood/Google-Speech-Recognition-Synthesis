/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class gky {
    public static final hei a = hei.m("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    public final Context c;
    public final hpq d;
    public final AtomicBoolean e;
    public long f;
    private final boolean g;
    private final dtu h;

    public gky(Context context, hpq hpq2, gto gto2, gto gto3, dtu dtu2) {
        boolean bl2 = false;
        this.e = new AtomicBoolean(false);
        this.f = -1L;
        Boolean bl3 = false;
        if (((Boolean)gto3.e(bl3)).booleanValue() || ((Boolean)gto2.e(bl3)).booleanValue()) {
            bl2 = true;
        }
        this.g = bl2;
        this.h = dtu2;
        this.c = context;
        this.d = hpq2;
    }

    static File e(Context context) {
        return new File(context.getFilesDir().getPath(), "103795117");
    }

    public static File f(Context context) {
        String string = String.valueOf(dww.a(context).replaceAll("[^A-Za-z0-9\\-_:]", "_"));
        return new File(context.getFilesDir(), "103795117_".concat(string));
    }

    private final File i() {
        File file = this.g ? gky.f(this.c) : gky.e(this.c);
        return file;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final gmk a() {
        block29: {
            block30: {
                block28: {
                    var7_1 = this.i();
                    this.b.readLock().lock();
                    if (!var7_1.exists() && this.h.b()) {
                        if (!this.g) {
                            var3_2 = new gjf(this, 3);
                            gax.c(fxf.ag((Runnable)var3_2, this.d), "Process database cleanup future failed", new Object[0]);
                        } else {
                            try {
                                var3_2 = gky.e(this.c);
                                if (!var3_2.exists()) break block28;
                                var2_11 = gky.f(this.c).exists();
                                if (!var2_11) {
                                    if (var3_2.renameTo(gky.f(this.c))) break block28;
                                    ((heg)((heg)gky.a.h()).j("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 214, "SyncManagerDataStore.java")).r("Failed to rename old sync database file.");
                                }
                                if (!var3_2.delete()) {
                                    ((heg)((heg)gky.a.g()).j("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 220, "SyncManagerDataStore.java")).r("Unable to delete old Sync database file.");
                                }
                            }
                            catch (RuntimeException var3_3) {
                                a.as(gky.a.g(), "Error while migrating Sync datastore file.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", '\u00e1', "SyncManagerDataStore.java", var3_3);
                            }
                        }
                    }
                }
                var2_11 = var7_1.exists();
                var6_12 = null;
                var3_2 = null;
                var4_13 = null;
                if (!var2_11) break block29;
                try {
                    var5_18 = new FileInputStream((File)var7_1);
                }
                catch (Throwable var4_16) {
                    var3_2 = var6_12;
                    ** GOTO lbl-1000
                }
                var3_2 = gmk.a;
                var6_12 = hwj.a;
                var6_12 = hyo.a;
                var6_12 = hwj.a;
                var1_19 = var5_18.read();
                if (var1_19 != -1) break block30;
                var3_2 = var4_13;
                ** GOTO lbl84
            }
            var1_19 = hvy.I(var1_19, var5_18);
            var4_13 = new hvb(var5_18, var1_19);
            ** GOTO lbl60
            {
                catch (Throwable var4_15) {
                    var3_2 = var5_18;
                    ** GOTO lbl-1000
                }
                {
                    catch (IOException var3_8) {
                        var4_13 = new hxn(var3_8);
                        throw var4_13;
                    }
                    catch (hxn var3_9) {
                        if (var3_9.a == false) throw var3_9;
                        var4_13 = new hxn(var3_9);
                        throw var4_13;
                    }
lbl60:
                    // 1 sources

                    var4_13 = hvy.K((InputStream)var4_13);
                    var3_2 = var3_2.n();
                    try {
                        var7_1 = hyo.a.b(var3_2);
                        var7_1.l(var3_2, hvz.p((hvy)var4_13), (hwj)var6_12);
                        var7_1.g(var3_2);
                    }
                    catch (RuntimeException var3_5) {
                        if (var3_5.getCause() instanceof hxn == false) throw var3_5;
                        throw (hxn)var3_5.getCause();
                    }
                    catch (IOException var4_14) {
                        if (var4_14.getCause() instanceof hxn) {
                            throw (hxn)var4_14.getCause();
                        }
                        var3_2 = new hxn(var4_14);
                        throw var3_2;
                    }
                    catch (hzc var3_6) {
                        throw var3_6.a();
                    }
                    catch (hxn var3_7) {
                        var4_13 = var3_7;
                        if (var3_7.a == false) throw var4_13;
                        var4_13 = new hxn(var3_7);
                        throw var4_13;
                    }
                    var4_13.z(0);
lbl84:
                    // 2 sources

                    hwv.D((hwv)var3_2);
                    var3_2 = (gmk)var3_2;
                    ** try [egrp 7[TRYBLOCK] [27 : 361->369)] { 
lbl87:
                    // 1 sources

                    fhq.e(var5_18);
                    break block29;
                    catch (hxn var3_4) {}
                    throw var3_4;
                }
            }
lbl-1000:
            // 2 sources

            {
                fhq.e((Closeable)var3_2);
                throw var4_17;
            }
        }
        if (var3_2 != null) return var3_2;
        return gmk.a;
lbl96:
        // 1 sources

        finally {
            this.b.readLock().unlock();
        }
    }

    public final hpn b() {
        return hno.f(this.c(), gqk.b(new ggk(this, 5)), this.d);
    }

    final hpn c() {
        if (this.e.get()) {
            return hhk.K(this.f);
        }
        return this.d.bf(gqk.j(new gkv(this, 2)));
    }

    final hpn d(gli object, long l2, boolean bl2) {
        object = new gkw(this, (gli)object, l2, bl2);
        return this.d.bf((Callable)object);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(gmk object) {
        void var1_4;
        FileOutputStream fileOutputStream;
        block10: {
            hwa hwa2 = null;
            try {
                fileOutputStream = new FileOutputStream(this.i());
            }
            catch (Throwable throwable) {
                fileOutputStream = hwa2;
                break block10;
            }
            try {
                int n2;
                boolean bl2 = ((hwv)object).B();
                if (bl2) {
                    n2 = ((hwv)object).j(null);
                    if (n2 < 0) {
                        object = new IllegalStateException(a.af(n2, "serialized size must be non-negative, was "));
                        throw object;
                    }
                } else {
                    n2 = ((hwv)object).memoizedSerializedSize & Integer.MAX_VALUE;
                    if (n2 == Integer.MAX_VALUE) {
                        n2 = ((hwv)object).j(null);
                        if (n2 < 0) {
                            object = new IllegalStateException(a.af(n2, "serialized size must be non-negative, was "));
                            throw object;
                        }
                        ((hwv)object).memoizedSerializedSize = ((hwv)object).memoizedSerializedSize & Integer.MIN_VALUE | n2;
                    }
                }
                int n3 = hwd.S(hwd.ab(n2) + n2);
                hwa2 = new hwa(fileOutputStream, n3);
                ((hwd)hwa2).C(n2);
                object.aZ(hwa2);
                ((hwd)hwa2).i();
            }
            catch (Throwable throwable) {
                break block10;
            }
            fileOutputStream.close();
            return;
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        throw var1_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h(Throwable object) {
        a.as(a.h(), "Could not read sync datastore. There was probably a write error. Wiping store.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", '\u0267', "SyncManagerDataStore.java", (Throwable)object);
        this.b.writeLock().lock();
        object = this.e;
        boolean bl2 = false;
        ((AtomicBoolean)object).set(false);
        long l2 = this.f;
        if (l2 <= 0L) {
            l2 = cgw.p().toEpochMilli();
        }
        object = gmk.a.l();
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        gmk gmk2 = (gmk)((hwp)object).b;
        gmk2.b |= 1;
        gmk2.c = l2;
        object = (gmk)((hwp)object).o();
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        this.g((gmk)object);
        this.e.set(true);
        return true;
        {
            Throwable throwable222222;
            block12: {
                catch (Throwable throwable222222) {
                    break block12;
                }
                catch (IOException iOException) {}
                {
                    a.as(a.g(), "Could not write to datastore to clear store.", "com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", '\u027b', "SyncManagerDataStore.java", iOException);
                }
                this.e.set(false);
                return bl2;
            }
            try {
                this.e.set(true);
                throw throwable222222;
            }
            finally {
                this.b.writeLock().unlock();
            }
        }
    }
}

