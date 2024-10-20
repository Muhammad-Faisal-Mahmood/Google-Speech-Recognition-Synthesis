/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.database.ContentObserver
 *  android.os.RemoteException
 */
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cmg {
    public final AtomicBoolean a = new AtomicBoolean();
    public final HashMap b = new HashMap(16, 1.0f);
    public final HashMap c = new HashMap(16, 1.0f);
    public final HashMap d = new HashMap(16, 1.0f);
    public Object e = null;
    private HashMap f = null;
    private final HashMap g = new HashMap(16, 1.0f);
    private boolean h = false;
    private final String[] i = new String[0];

    public static final void c(ContentResolver contentResolver) {
        if (contentResolver != null) {
            return;
        }
        throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
    }

    public static final Object e(Map map, String string, Object object) {
        if (map.containsKey(string)) {
            if ((map = map.get(string)) != null) {
                return map;
            }
            return object;
        }
        return null;
    }

    public final void a(ContentResolver contentResolver) {
        if (this.f == null) {
            this.a.set(false);
            this.f = new HashMap(16, 1.0f);
            this.e = new Object();
            contentResolver.registerContentObserver(cmc.a, true, (ContentObserver)new cme(this));
            return;
        }
        if (this.a.getAndSet(false)) {
            this.f.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.g.clear();
            this.e = new Object();
            this.h = false;
        }
    }

    public final void b(Object object, Map map, String string, Object object2) {
        if (object == this.e) {
            map.put(string, object2);
            this.f.remove(string);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String d(ContentResolver var1_1, String var2_5) {
        block30: {
            block27: {
                block29: {
                    block28: {
                        cmg.c((ContentResolver)var1_1);
                        // MONITORENTER : this
                        this.a((ContentResolver)var1_1);
                        var5_8 = this.e;
                        var3_9 = this.f.containsKey(var2_5);
                        var4_10 /* !! */  = null;
                        if (var3_9) {
                            var1_1 = (String)this.f.get(var2_5);
                            if (var1_1 == null) {
                                var1_1 = var4_10 /* !! */ ;
                            }
                            // MONITOREXIT : this
                            return var1_1;
                        }
                        // MONITOREXIT : this
                        try {
                            var4_10 /* !! */  = var1_1.acquireUnstableContentProviderClient(cmc.a);
                            if (var4_10 /* !! */  == null) ** GOTO lbl75
                        }
                        catch (cmf var1_4) {
                            return null;
                        }
                        var6_11 = var4_10 /* !! */ .query(cmc.a, null, null, new String[]{var2_5}, null);
                        if (var6_11 == null) break block27;
                        if (!var6_11.moveToFirst()) break block28;
                        var1_1 = var6_11.getString(1);
                        var6_11.close();
                        var4_10 /* !! */ .release();
                        break block29;
                    }
                    var6_11.close();
                    var4_10 /* !! */ .release();
                    var1_1 = null;
                }
                var4_10 /* !! */  = var1_1;
                if (var1_1 != null) {
                    var4_10 /* !! */  = var1_1;
                    if (var1_1.equals(null)) {
                        var4_10 /* !! */  = null;
                    }
                }
                // MONITORENTER : this
                if (var5_8 == this.e) {
                    this.f.put(var2_5, var4_10 /* !! */ );
                }
                // MONITOREXIT : this
                if (var4_10 /* !! */  == null) return null;
                return var4_10 /* !! */ ;
            }
            try {
                var1_1 = new cmf("ContentProvider query returned null cursor");
                throw var1_1;
            }
            catch (Throwable var1_2) {}
            if (var6_11 == null) throw var1_2;
            try {
                var6_11.close();
                throw var1_2;
            }
            catch (Throwable var2_6) {
                try {
                    var1_2.addSuppressed(var2_6);
                    throw var1_2;
                }
                catch (Throwable var1_3) {
                    break block30;
                }
                catch (RemoteException var2_7) {
                    var1_1 = new cmf(var2_7);
                    throw var1_1;
                }
            }
        }
        var4_10 /* !! */ .release();
        throw var1_3;
lbl75:
        // 1 sources

        var1_1 = new cmf("Unable to acquire ContentProviderClient");
        throw var1_1;
    }
}

