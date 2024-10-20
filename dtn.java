/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.util.Log
 */
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;

public final class dtn
implements dtr {
    public final dtp a;

    public /* synthetic */ dtn(dtp dtp2) {
        this.a = dtp2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a() {
        block18: {
            block15: {
                block17: {
                    block16: {
                        var2_1 = this.a;
                        var3_5 = var2_1.b.acquireUnstableContentProviderClient(var2_1.c);
                        if (var3_5 == null) {
                            Log.w((String)"ConfigurationContentLdr", (String)"Unable to acquire ContentProviderClient, using default values");
                            return Collections.emptyMap();
                        }
                        var4_6 = var3_5.query(var2_1.c, dtp.a, null, null, null);
                        if (var4_6 != null) ** GOTO lbl15
                        Log.w((String)"ConfigurationContentLdr", (String)"ContentProvider query returned null cursor, using default values");
                        var2_1 = Collections.emptyMap();
                        break block15;
lbl15:
                        // 1 sources

                        var1_8 = var4_6.getCount();
                        if (var1_8 == 0) {
                            var2_1 = Collections.emptyMap();
                            break block16;
                        }
                        var2_1 = var1_8 <= 256 ? new ot(var1_8) : new HashMap<K, V>(var1_8, 1.0f);
                        while (var4_6.moveToNext()) {
                            var2_1.put(var4_6.getString(0), var4_6.getString(1));
                        }
                        if (var4_6.isAfterLast()) break block17;
                        Log.w((String)"ConfigurationContentLdr", (String)"Cursor read incomplete (ContentProvider dead?), using default values");
                        var2_1 = Collections.emptyMap();
                    }
                    var4_6.close();
                    var3_5.release();
                    return var2_1;
                }
                var4_6.close();
                var3_5.release();
                return var2_1;
                catch (Throwable var2_2) {
                    if (var4_6 == null) throw var2_2;
                    try {
                        var4_6.close();
                        throw var2_2;
                    }
                    catch (Throwable var4_7) {
                        try {
                            var2_2.addSuppressed(var4_7);
                            throw var2_2;
                        }
                        catch (Throwable var2_3) {
                            break block18;
                        }
                        catch (RemoteException var2_4) {
                            Log.w((String)"ConfigurationContentLdr", (String)"ContentProvider query failed, using default values", (Throwable)var2_4);
                            var2_1 = Collections.emptyMap();
                        }
                    }
                }
            }
            var3_5.release();
            return var2_1;
        }
        var3_5.release();
        throw var2_3;
    }
}

