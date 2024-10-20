/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.os.Trace
 *  androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$-CC
 *  gqv
 */
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.apps.speech.tts.googletts.GoogleTTSRoot_Application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class bdn
extends bbx {
    public static final Object a;
    private static bdn m;
    private static bdn n;
    public Context b;
    public bam c;
    public WorkDatabase d;
    public List e;
    public bcn f;
    public boolean g = false;
    public BroadcastReceiver.PendingResult h;
    public volatile bje i;
    public final cya j;
    public czh k;
    public bzb l;
    private final jvb o;

    static {
        bbi.b("WorkManagerImpl");
        m = null;
        n = null;
        a = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public bdn(Context object, bam object2, czh czh2, WorkDatabase object3, List object4, bcn object5, cya stringArray) {
        Object object62 = object.getApplicationContext();
        if (ag$$ExternalSyntheticApiModelOutline1.m(object62)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        Object object7 = new bbi(((bam)object2).j);
        object = bbi.a;
        synchronized (object) {
            if (bbi.b == null) {
                bbi.b = object7;
            }
        }
        this.b = object62;
        this.k = czh2;
        this.d = object3;
        this.f = object5;
        this.j = stringArray;
        this.c = object2;
        this.e = object4;
        jse.e(czh2, "taskExecutor");
        object = czh2.d;
        jse.d(object, "taskExecutor.taskCoroutineDispatcher");
        object = jvf.g((jqf)object);
        this.o = object;
        object5 = this.d;
        this.l = new bzb(object5, null);
        this.f.a(new bcq((Executor)czh2.a, (List)object4, (bam)object2, (WorkDatabase)object5));
        this.k.a(new bic((Context)object62, this));
        czh2 = this.b;
        jse.e(czh2, "appContext");
        jse.e(object2, "configuration");
        jse.e(object3, "db");
        if (bif.a((Context)czh2, (bam)object2)) {
            Map map;
            object2 = ((WorkDatabase)object3).z();
            object3 = auo.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            object4 = (bhw)object2;
            object2 = ((bhw)object4).a;
            object3 = new mz(new bho((bhw)object4, (auo)object3), 4);
            object4 = ((aum)object2).b();
            object5 = Arrays.copyOf(new String[]{"workspec"}, 1);
            jse.e(object5, "tables");
            object4 = ((aue)object4).c;
            jse.e(object5, "tables");
            jse.e(object5, "names");
            stringArray = new jpu();
            for (Object object62 : object5) {
                map = ((avc)object4).b;
                object7 = object62.toLowerCase(Locale.ROOT);
                jse.d(object7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                object7 = (Set)map.get(object7);
                if (object7 != null) {
                    stringArray.addAll(object7);
                    continue;
                }
                stringArray.add(object62);
            }
            object5 = jjj.C((Set)stringArray).toArray(new String[0]);
            int n2 = ((String[])object5).length;
            object62 = new int[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                stringArray = object5[i2];
                map = ((avc)object4).c;
                object7 = stringArray.toLowerCase(Locale.ROOT);
                jse.d(object7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                object7 = (Integer)map.get(object7);
                if (object7 == null) {
                    throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(stringArray)));
                }
                object62[i2] = (Context)((Integer)object7);
            }
            object5 = new joc(object5, object62);
            stringArray = (String[])object5.a;
            jse.ah((jvb)object, null, null, new esz(new jzg(jzb.a(jsd.r(new jzg(new avg(jsd.r(new jyn(new auv((avc)object4, (int[])object5.b, stringArray, null))), (aum)object2, (jrk)object3), new bcw(null), 0))), new bcx((Context)czh2, null), 2), null, 7), 3);
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
    public static bdn i(Context var0) {
        block90: {
            var8_4 = bdn.a;
            // MONITORENTER : var8_4
            // MONITORENTER : var8_4
            var6_5 = bdn.m;
            if (var6_5 != null) {
                // MONITOREXIT : var8_4
            } else {
                var6_5 = bdn.n;
                // MONITOREXIT : var8_4
            }
            var7_7 = var6_5;
            if (var6_5 != null) {
                // MONITOREXIT : var8_4
                return var7_7;
            }
            var9_8 = var0 /* !! */ .getApplicationContext();
            if (!(var9_8 instanceof GoogleTTSRoot_Application)) {
                var0 /* !! */  = new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                throw var0 /* !! */ ;
            }
            var6_5 = (GoogleTTSRoot_Application)var9_8;
            var0 /* !! */  = ((gcd)idi.e((Object)var6_5, gcd.class)).R().a;
            var0 /* !! */  = fxf.aw(gqv.a) == false ? ((gpm)var0 /* !! */ ).d("getWorkManagerConfiguration") : new gnh(5);
            var10_9 = ((gcd)idi.e(var6_5, gcd.class)).h();
            var0 /* !! */  = bdn.m;
            if (var0 /* !! */  == null || bdn.n == null) break block90;
            var0 /* !! */  = new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            throw var0 /* !! */ ;
        }
        if (var0 /* !! */  != null) ** GOTO lbl343
        var11_10 = var9_8.getApplicationContext();
        if (bdn.n != null) ** GOTO lbl342
        jse.e(var11_10, "context");
        jse.e(var10_9, "configuration");
        var12_11 = new czh(var10_9.c);
        var0 /* !! */  = var11_10.getApplicationContext();
        jse.d(var0 /* !! */ , "context.applicationContext");
        var7_7 = var12_11.a;
        jse.d(var7_7, "workTaskExecutor.serialTaskExecutor");
        var6_5 = var10_9.p;
        var5_12 = var11_10.getResources().getBoolean(2131034162);
        jse.e(var0 /* !! */ , "context");
        jse.e(var7_7, "queryExecutor");
        if (var5_12) {
            jse.e(var0 /* !! */ , "context");
            var6_5 = new auk(var0 /* !! */ , WorkDatabase.class, null);
            var6_5.i = true;
        } else {
            jse.e(var0 /* !! */ , "context");
            if (jse.C("androidx.work.workdb")) {
                var0 /* !! */  = new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                throw var0 /* !! */ ;
            }
            if (jse.i("androidx.work.workdb", ":memory:")) {
                var0 /* !! */  = new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                throw var0 /* !! */ ;
            }
            var6_5 = new auk(var0 /* !! */ , WorkDatabase.class, "androidx.work.workdb");
            var13_13 = new bda(var0 /* !! */ );
            var6_5.h = var13_13;
        }
        jse.e(var7_7, "executor");
        var6_5.f = var7_7;
        var7_7 = new bcb();
        var6_5.d.add(var7_7);
        var6_5.a(new avp[]{bch.c});
        var7_7 = new bco(var0 /* !! */ , 2, 3);
        var6_5.a(new avp[]{var7_7});
        var6_5.a(new avp[]{bci.c});
        var6_5.a(new avp[]{bcj.c});
        var7_7 = new bco(var0 /* !! */ , 5, 6);
        var6_5.a(new avp[]{var7_7});
        var6_5.a(new avp[]{bck.c});
        var6_5.a(new avp[]{bcl.c});
        var6_5.a(new avp[]{bcm.c});
        var7_7 = new bdo(var0 /* !! */ );
        var6_5.a(new avp[]{var7_7});
        var7_7 = new bco(var0 /* !! */ , 10, 11);
        var6_5.a(new avp[]{var7_7});
        var6_5.a(new avp[]{bcd.c});
        var6_5.a(new avp[]{bce.c});
        var6_5.a(new avp[]{bcf.c});
        var6_5.a(new avp[]{bcg.c});
        var7_7 = new bco(var0 /* !! */ , 21, 22);
        var6_5.a(new avp[]{var7_7});
        var6_5.n = false;
        var6_5.o = true;
        var0 /* !! */  = var6_5.f;
        if (var0 /* !! */  == null && var6_5.g == null) {
            var6_5.f = var6_5.g = nz.a;
        } else if (var0 /* !! */  != null && var6_5.g == null) {
            var6_5.g = var0 /* !! */ ;
        } else if (var0 /* !! */  == null) {
            var6_5.f = var6_5.g;
        }
        var7_7 = var6_5.l;
        var0 /* !! */  = var6_5.k;
        if (!var7_7.isEmpty()) {
            var7_7 = var7_7.iterator();
            while (var7_7.hasNext()) {
                var1_14 = ((Number)var7_7.next()).intValue();
                if (!var0 /* !! */ .contains(var1_14)) continue;
                var6_5 = a.af(var1_14, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ");
                var0 /* !! */  = new IllegalArgumentException((String)var6_5);
                throw var0 /* !! */ ;
            }
        }
        var0 /* !! */  = var6_5.h;
        var7_7 = var0 /* !! */ ;
        if (var0 /* !! */  == null) {
            var7_7 = new axa();
        }
        var14_15 = var6_5.b;
        var17_16 = var6_5.c;
        var16_17 = var6_5.p;
        var15_18 = var6_5.d;
        var5_12 = var6_5.i;
        var0 /* !! */  = var6_5.j;
        jse.e(var14_15, "context");
        if (var0 /* !! */  == aul.a) {
            var0 /* !! */  = var14_15.getSystemService("activity");
            var0 /* !! */  = var0 /* !! */  instanceof ActivityManager != false ? (ActivityManager)var0 /* !! */  : null;
            var0 /* !! */  = var0 /* !! */  != null && var0 /* !! */ .isLowRamDevice() == false ? aul.c : aul.b;
        }
        if ((var19_19 = var6_5.f) == null) {
            var0 /* !! */  = new IllegalArgumentException("Required value was null.");
            throw var0 /* !! */ ;
        }
        var18_20 = var6_5.g;
        if (var18_20 == null) {
            var0 /* !! */  = new IllegalArgumentException("Required value was null.");
            throw var0 /* !! */ ;
        }
        var13_13 = new att((Context)var14_15, (String)var17_16, (awo)var7_7, (bzb)var16_17, (List)var15_18, var5_12, (aul)var0 /* !! */ , var19_19, var18_20, var6_5.n, var6_5.o, var6_5.k, var6_5.e, var6_5.m);
        var7_7 = (aum)wf.f(jsd.c(var6_5.a));
        try {
            var0 /* !! */  = new job(null);
            throw var0 /* !! */ ;
        }
        catch (job var0_1) {
            block93: {
                block91: {
                    block92: {
                        var0_2 = new mz(var7_7, 6);
                        var7_7.i = var6_5 = new AmbientDelegate((att)var13_13, (jrk)var0_2);
                        var7_7.e = var7_7.a();
                        if (var7_7 == null) {
                            jse.g("<this>");
                        }
                        var0_2 = new LinkedHashMap();
                        var14_15 = var7_7.g();
                        var6_5 = new ArrayList(jns.B((Iterable)var14_15));
                        var14_15 = var14_15.iterator();
                        while (var14_15.hasNext()) {
                            var6_5.add(jsd.e((Class)var14_15.next()));
                        }
                        var14_15 = jns.x(var6_5);
                        var4_21 = var14_15.size();
                        var6_5 = new boolean[var4_21];
                        var15_18 = var14_15.iterator();
lbl148:
                        // 2 sources

                        while (true) {
                            var5_12 = var15_18.hasNext();
                            var2_22 = -1;
                            if (var5_12) {
                                var14_15 = (jta)var15_18.next();
                                var3_23 = var13_13.m.size() - 1;
                                var1_14 = var2_22;
                                if (var3_23 < 0) break block91;
                                break block92;
                            }
                            var1_14 = var2_22 = var13_13.m.size() - 1;
                            if (var2_22 < 0) ** GOTO lbl163
                            while (true) {
                                block95: {
                                    var2_22 = var1_14 - 1;
                                    if (var1_14 >= var4_21 || var6_5[var1_14] == false) break;
                                    if (var2_22 >= 0) break block95;
lbl163:
                                    // 2 sources

                                    var6_5 = new LinkedHashMap(jjj.E(var0_2.size()));
                                    for (Object var14_15 : var0_2.entrySet()) {
                                        var6_5.put(jsd.c((jta)var14_15.getKey()), var14_15.getValue());
                                    }
                                    for (Object var15_18 : var7_7.r()) {
                                        var0_2 = var13_13.n;
                                        var1_14 = var15_18.a;
                                        var2_22 = var15_18.b;
                                        var6_5 = var0_2.a;
                                        var0_2 = var1_14;
                                        if (var6_5.containsKey(var0_2)) {
                                            var0_2 = var6_5 = (Map)var6_5.get(var0_2);
                                            if (var6_5 == null) {
                                                var0_2 = jjj.H();
                                            }
                                            if (var0_2.containsKey(var2_22)) continue;
                                        }
                                        var13_13.n.M((avp)var15_18);
                                    }
                                    if (var7_7 == null) {
                                        jse.g("<this>");
                                    }
                                    var6_5 = var7_7.f().entrySet();
                                    var1_14 = jse.k(jjj.E(jns.B(var6_5)), 16);
                                    var0_2 = new LinkedHashMap(var1_14);
                                    var6_5 = var6_5.iterator();
                                    break block93;
                                }
                                var1_14 = var2_22;
                            }
                            var0_2 = new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            throw var0_2;
                        }
                        finally {
                            var0 /* !! */ .close();
                        }
                    }
                    var1_14 = var3_23;
                    while (true) {
                        var3_23 = var1_14 - 1;
                        if (var14_15.d(var13_13.m.get(var1_14))) {
                            var6_5[var1_14] = (LinkedHashMap<K, V>)true;
                            break;
                        }
                        if (var3_23 < 0) {
                            var1_14 = var2_22;
                            break;
                        }
                        var1_14 = var3_23;
                    }
                }
                if (var1_14 < 0) {
                    var0_2 = new StringBuilder();
                    var0_2.append("A required auto migration spec (");
                    var0_2.append(var14_15.b());
                    var0_2.append(") is missing in the database configuration.");
                    var6_5 = var0_2.toString();
                    var0_2 = new IllegalArgumentException((String)var6_5);
                    throw var0_2;
                }
                var0_2.put(var14_15, var13_13.m.get(var1_14));
                ** continue;
            }
            while (var6_5.hasNext()) {
                var15_18 = (Map.Entry)var6_5.next();
                var14_15 = (Class)var15_18.getKey();
                var16_17 = (List)var15_18.getValue();
                var15_18 = jsd.e((Class)var14_15);
                var14_15 = new ArrayList(jns.B((Iterable)var16_17));
                var16_17 = var16_17.iterator();
                while (var16_17.hasNext()) {
                    var14_15.add(jsd.e((Class)var16_17.next()));
                }
                var16_17 = new joc(var15_18, var14_15);
                var0_2.put(var16_17.a, var16_17.b);
            }
            var6_5 = new boolean[var0_2.size()];
            var14_15 = var0_2.entrySet().iterator();
            block36: while (true) {
                block96: {
                    if (var14_15.hasNext()) break block96;
                    var1_14 = var2_22 = var13_13.l.size() - 1;
                    if (var2_22 >= 0) {
                        while (true) {
                            var2_22 = var1_14 - 1;
                            if (var6_5[var1_14] == false) {
                                var0_2 = var13_13.l.get(var1_14);
                                var7_7 = new StringBuilder();
                                var7_7.append("Unexpected type converter ");
                                var7_7.append(var0_2);
                                var7_7.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                var6_5 = new IllegalArgumentException(var7_7.toString());
                                throw var6_5;
                            }
                            if (var2_22 < 0) break;
                            var1_14 = var2_22;
                        }
                    }
                    var7_7.c = var13_13.g;
                    var7_7.d = var0_2 = new big(var13_13.h, 1, null);
                    var0_2 = var6_5 = var7_7.c;
                    if (var6_5 == null) {
                        jse.h("internalQueryExecutor");
                        var0_2 = null;
                    }
                    var6_5 = jvf.k((Executor)var0_2);
                    var0_2 = new jxa();
                    var7_7.b = jvf.g(var6_5.plus((jqf)var0_2));
                    var0_2 = var6_5 = var7_7.b;
                    if (var6_5 == null) {
                        jse.h("coroutineScope");
                        var0_2 = null;
                    }
                    var14_15 = ((kav)var0_2).a;
                    var0_2 = var6_5 = var7_7.d;
                    if (var6_5 == null) {
                        jse.h("internalTransactionExecutor");
                        var0_2 = null;
                    }
                    var14_15.plus(jvf.k((Executor)var0_2));
                    var7_7.f = var13_13.e;
                    var0_2 = var6_5 = var7_7.i;
                    if (var6_5 == null) {
                        jse.h("connectionManager");
                        var0_2 = null;
                    }
                    if ((var0_2 = var0_2.B()) != null) {
                        while (true) {
                            var6_5 = var0_2;
                            if (!(var0_2 instanceof avr)) {
                                if (!(var0_2 instanceof atu)) break;
                                var0_2 = ((atu)var0_2).a();
                                continue;
                            }
                            break;
                        }
                    } else {
                        var6_5 = null;
                    }
                    if ((avr)var6_5 != null) throw null;
                    var0_2 = var6_5 = var7_7.i;
                    if (var6_5 == null) {
                        jse.h("connectionManager");
                        var0_2 = null;
                    }
                    if ((var0_2 = var0_2.B()) != null) {
                        while (true) {
                            var6_5 = var0_2;
                            if (!(var0_2 instanceof avq)) {
                                if (!(var0_2 instanceof atu)) break;
                                var0_2 = ((atu)var0_2).a();
                                continue;
                            }
                            break;
                        }
                    } else {
                        var6_5 = null;
                    }
                    if ((avq)var6_5 != null) throw null;
                    var6_5 = (WorkDatabase)var7_7;
                    var7_7 = var11_10.getApplicationContext();
                    jse.d(var7_7, "context.applicationContext");
                    var14_15 = var7_7.getApplicationContext();
                    jse.d(var14_15, "context.applicationContext");
                    var13_13 = new bfl((Context)var14_15, var12_11);
                    var15_18 = var7_7.getApplicationContext();
                    jse.d(var15_18, "context.applicationContext");
                    var14_15 = new bfn((Context)var15_18, var12_11);
                    var16_17 = var7_7.getApplicationContext();
                    jse.d(var16_17, "context.applicationContext");
                    jse.e(var16_17, "context");
                    var15_18 = new bfv((Context)var16_17, var12_11);
                    var17_16 = var7_7.getApplicationContext();
                    jse.d(var17_16, "context.applicationContext");
                    var16_17 = new bfx((Context)var17_16, var12_11);
                    var0_2 = new cya((Context)var7_7, (bfs)var13_13, (bfn)var14_15, (bfs)var15_18, (bfs)var16_17);
                    var7_7 = new bcn(var11_10.getApplicationContext(), var10_9, var12_11, (WorkDatabase)var6_5);
                    jse.e(var11_10, "context");
                    jse.e(var10_9, "configuration");
                    jse.e(var6_5, "workDatabase");
                    jse.e(var11_10, "p0");
                    jse.e(var10_9, "p1");
                    jse.e(var6_5, "p3");
                    var1_14 = bcr.a;
                    var14_15 = new bep(var11_10, (WorkDatabase)var6_5, var10_9);
                    bie.a(var11_10, SystemJobService.class, true);
                    bbi.a();
                    var13_13 = new bxt((bcn)var7_7, var12_11);
                    var15_18 = new beb(var11_10, var10_9, (cya)var0_2, (bcn)var7_7, (bxt)var13_13, var12_11);
                    var14_15 = jns.f(new bcp[]{var14_15, var15_18});
                    bdn.n = var13_13 = new bdn(var11_10.getApplicationContext(), var10_9, var12_11, (WorkDatabase)var6_5, (List)var14_15, (bcn)var7_7, (cya)var0_2);
lbl342:
                    // 2 sources

                    bdn.m = bdn.n;
lbl343:
                    // 2 sources

                    // MONITOREXIT : var8_4
                    return bdn.i(var9_8);
                }
                var15_18 = (Map.Entry)var14_15.next();
                var0_2 = (jta)var15_18.getKey();
                var17_16 = ((List)var15_18.getValue()).iterator();
                while (true) {
                    block94: {
                        if (!var17_16.hasNext()) continue block36;
                        var15_18 = (jta)var17_16.next();
                        var1_14 = var13_13.l.size() - 1;
                        if (var1_14 >= 0) {
                            while (true) {
                                var2_22 = var1_14 - 1;
                                if (var15_18.d(var13_13.l.get(var1_14))) {
                                    var6_5[var1_14] = true;
                                    break block94;
                                }
                                if (var2_22 < 0) break;
                                var1_14 = var2_22;
                            }
                        }
                        var1_14 = -1;
                    }
                    if (var1_14 < 0) {
                        var6_5 = new StringBuilder();
                        var6_5.append("A required type converter (");
                        var6_5.append(var15_18.b());
                        var6_5.append(") for ");
                        var6_5.append(var0_2.b());
                        var6_5.append(" is missing in the database configuration.");
                        var6_5 = var6_5.toString();
                        var0_2 = new IllegalArgumentException((String)var6_5);
                        throw var0_2;
                    }
                    var16_17 = var13_13.l.get(var1_14);
                    jse.e(var15_18, "kclass");
                    jse.e(var16_17, "converter");
                    var7_7.g.put(var15_18, var16_17);
                }
                break;
            }
        }
    }

    @Override
    public final bbp a(String string) {
        AmbientLifecycleObserver$AmbientLifecycleCallback.-CC -CC2 = this.c.o;
        Object object = this.k.a;
        jse.d(object, "workManagerImpl.workTask\u2026ecutor.serialTaskExecutor");
        bfb bfb2 = new bfb(string, this, 3);
        return AmbientMode$AmbientCallback.e(-CC2, "CancelWorkByName_".concat(string), (Executor)object, bfb2);
    }

    @Override
    public final bbp b(UUID uUID) {
        return AmbientMode$AmbientCallback.k(uUID, this);
    }

    @Override
    public final bbp c(List list) {
        if (!list.isEmpty()) {
            return new bcz(this, null, 2, list, null).v();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override
    public final bbp e(String string, int n2, List list) {
        return new bcz(this, string, n2, list).v();
    }

    @Override
    public final bbp g(String string, int n2, bmu object) {
        if (n2 != 3) {
            object = Collections.singletonList(object);
            int n3 = 2;
            n2 = n2 == 2 ? n3 : 1;
            return new bcz(this, string, n2, (List)object).v();
        }
        AmbientLifecycleObserver$AmbientLifecycleCallback.-CC -CC2 = this.c.o;
        Object object2 = this.k.a;
        jse.d(object2, "workTaskExecutor.serialTaskExecutor");
        object = new al((Object)this, (Object)string, object, 3, null);
        return AmbientMode$AmbientCallback.e(-CC2, "enqueueUniquePeriodic_".concat(string), (Executor)object2, (jqz)object);
    }

    @Override
    public final hpn h(bzb object) {
        WorkDatabase workDatabase = this.d;
        Object object2 = this.k;
        jse.e(workDatabase, "<this>");
        jse.e(object2, "executor");
        object = new bih((bzb)object);
        object2 = ((czh)object2).a;
        jse.d(object2, "executor.serialTaskExecutor");
        return AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.a((Executor)object2, "loadStatusFuture", new bii((jrk)object, workDatabase));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        Object object = a;
        synchronized (object) {
            this.g = true;
            BroadcastReceiver.PendingResult pendingResult = this.h;
            if (pendingResult != null) {
                pendingResult.finish();
                this.h = null;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void k() {
        block3: {
            var2_1 = this.c.o;
            var2_1 = new bdm(this, 0);
            var1_3 = yj.o();
            if (!var1_3) ** GOTO lbl7
            try {
                yj.m("ReschedulingWork");
lbl7:
                // 2 sources

                var2_1.a();
                if (!var1_3) break block3;
            }
            catch (Throwable var2_2) {
                if (var1_3) {
                    Trace.endSection();
                }
                throw var2_2;
            }
            Trace.endSection();
        }
    }

    public final void l(bgs bgs2, int n2) {
        this.k.a(new bij(this.f, new bzb(bgs2), true, n2));
    }
}

