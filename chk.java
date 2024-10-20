/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.os.SystemClock
 *  android.util.Log
 *  dalvik.system.DelegateLastClassLoader
 */
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.InvocationTargetException;

public final class chk {
    public static final cgw b;
    private static Boolean c;
    private static String d;
    private static boolean e = false;
    private static int f = -1;
    private static Boolean g;
    private static final ThreadLocal h;
    private static final ThreadLocal i;
    private static final chi j;
    private static chl k;
    private static chm l;
    public final Context a;

    static {
        h = new ThreadLocal();
        i = new che();
        j = new chf();
        b = new cgw();
    }

    private chk(Context context) {
        this.a = context;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int a(Context var0, String var1_1, boolean var2_5) {
        block58: {
            block59: {
                block55: {
                    try {
                        synchronized (chk.class) {
                            var12_6 /* !! */  = chk.c;
                            var10_7 = null;
                            var9_8 /* !! */  = null;
                            var11_11 = null;
                            var3_12 = false;
                            var8_13 /* !! */  = var12_6 /* !! */ ;
                            if (var12_6 /* !! */  != null) break block55;
                        }
                    }
                    catch (Throwable var1_4) {
                        cgw.c(var0);
                        throw var1_4;
                    }
                    {
                        block61: {
                            try {
                                var13_21 = var0.getApplicationContext().getClassLoader().loadClass(DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                                var12_6 /* !! */  = var13_21.getDeclaringClass();
                                ** synchronized (var12_6 /* !! */ )
                            }
                            catch (NoSuchFieldException var8_15) {
                            }
                            catch (IllegalAccessException var8_16) {
                            }
                            catch (ClassNotFoundException var8_17) {
                                // empty catch block
                            }
lbl-1000:
                            // 1 sources

                            {
                                block60: {
                                    var8_13 /* !! */  = (ClassLoader)var13_21.get(null);
                                    if (var8_13 /* !! */  != ClassLoader.getSystemClassLoader()) break block60;
                                    var8_13 /* !! */  = Boolean.FALSE;
                                    break block61;
                                }
                                if (var8_13 /* !! */  != null) {
                                    chk.f((ClassLoader)var8_13 /* !! */ );
                                    break block56;
                                }
                                if (!chk.h(var0)) {
                                    return 0;
                                }
                                if (!chk.e && !(var5_22 = Boolean.TRUE.equals(null))) {
                                    block57: {
                                        try {
                                            var4_23 = chk.d(var0, (String)var1_1, var2_5, true);
                                            var8_13 /* !! */  = chk.d;
                                            if (var8_13 /* !! */  == null) return var4_23;
                                            if (var8_13 /* !! */ .isEmpty()) break block57;
                                            var8_13 /* !! */  = chc.a();
                                            if (var8_13 /* !! */  == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    var8_13 /* !! */  = chk.d;
                                                    kl.at(var8_13 /* !! */ );
                                                    var8_13 /* !! */  = new DelegateLastClassLoader((String)var8_13 /* !! */ , ClassLoader.getSystemClassLoader());
                                                } else {
                                                    var8_13 /* !! */  = chk.d;
                                                    kl.at(var8_13 /* !! */ );
                                                    var8_13 /* !! */  = new chd((String)var8_13 /* !! */ , ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            chk.f((ClassLoader)var8_13 /* !! */ );
                                            var13_21.set(null, var8_13 /* !! */ );
                                            chk.c = Boolean.TRUE;
                                        }
                                        catch (chh var8_14) {
                                            var13_21.set(null, ClassLoader.getSystemClassLoader());
                                            var8_13 /* !! */  = Boolean.FALSE;
                                        }
                                        return var4_23;
                                    }
                                    return var4_23;
                                    break block61;
                                } else {
                                    var13_21.set(null, ClassLoader.getSystemClassLoader());
                                    var8_13 /* !! */  = Boolean.FALSE;
                                }
                                break block61;
                            }
                            var12_6 /* !! */  = var8_13 /* !! */ .toString();
                            var8_13 /* !! */  = new StringBuilder();
                            var8_13 /* !! */ .append("Failed to load module via V2: ");
                            var8_13 /* !! */ .append((String)var12_6 /* !! */ );
                            Log.w((String)"DynamiteModule", (String)var8_13 /* !! */ .toString());
                            var8_13 /* !! */  = Boolean.FALSE;
                            break block61;
                            {
                                block56: {
                                    catch (chh var8_20) {}
                                }
                                var8_13 /* !! */  = Boolean.TRUE;
                            }
                        }
                        chk.c = var8_13 /* !! */ ;
                    }
                }
                var5_22 = var8_13 /* !! */ .booleanValue();
                if (var5_22) {
                    try {
                        return chk.d(var0, (String)var1_1, var2_5, false);
                    }
                    catch (chh var1_2) {
                        var1_3 = var1_2.getMessage();
                        var8_13 /* !! */  = new StringBuilder();
                        var8_13 /* !! */ .append("Failed to retrieve remote module version: ");
                        var8_13 /* !! */ .append(var1_3);
                        Log.w((String)"DynamiteModule", (String)var8_13 /* !! */ .toString());
                        return 0;
                    }
                }
                var12_6 /* !! */  = chk.i(var0);
                if (var12_6 /* !! */  == null) {
                    return (int)var3_12;
                }
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var4_24 = var12_6 /* !! */ .e();
                if (var4_24 < 3) break block58;
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var13_21 = (ilo)chk.h.get();
                if (var13_21 != null) {
                    var8_13 /* !! */  = var9_8 /* !! */ ;
                    var13_21 = var13_21.a;
                    if (var13_21 != null) {
                        var8_13 /* !! */  = var9_8 /* !! */ ;
                        return var13_21.getInt(0);
                    }
                }
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var13_21 = new cgz(var0);
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var6_25 = (Long)chk.i.get();
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var14_26 = var12_6 /* !! */ .a();
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var4_24 = box.a;
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var14_26.writeStrongBinder((IBinder)var13_21);
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var14_26.writeString((String)var1_1);
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var14_26.writeInt((int)var2_5);
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var14_26.writeLong(var6_25);
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var12_6 /* !! */  = var12_6 /* !! */ .b(7, var14_26);
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var13_21 = var12_6 /* !! */ .readStrongBinder();
                if (var13_21 == null) {
                    var1_1 = null;
                } else {
                    var8_13 /* !! */  = var9_8 /* !! */ ;
                    var1_1 = var13_21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    var8_13 /* !! */  = var9_8 /* !! */ ;
                    if (var1_1 instanceof cha) {
                        var8_13 /* !! */  = var9_8 /* !! */ ;
                        var1_1 = (cha)var1_1;
                    } else {
                        var8_13 /* !! */  = var9_8 /* !! */ ;
                        var1_1 = new cgy((IBinder)var13_21);
                    }
                }
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var12_6 /* !! */ .recycle();
                var8_13 /* !! */  = var9_8 /* !! */ ;
                var1_1 = (Cursor)cgz.b((cha)var1_1);
                if (var1_1 == null) break block59;
                if (!var1_1.moveToFirst()) break block59;
                var4_24 = var1_1.getInt(0);
                if (var4_24 > 0 && (var5_22 = chk.g((Cursor)var1_1))) {
                    var1_1 = var11_11;
                }
                var2_5 = var4_24;
                if (var1_1 == null) return (int)var2_5;
                var1_1.close();
                return var4_24;
            }
            Log.w((String)"DynamiteModule", (String)"Failed to retrieve remote module version.");
            var2_5 = var3_12;
            if (var1_1 == null) return (int)var2_5;
            var1_1.close();
            return (int)var3_12;
            catch (Throwable var8_18) {
                ** GOTO lbl245
            }
            catch (RemoteException var8_19) {
                var9_8 /* !! */  = var8_19;
                ** GOTO lbl223
            }
        }
        if (var4_24 != 2) ** GOTO lbl198
        var8_13 /* !! */  = var9_8 /* !! */ ;
        try {
            Log.w((String)"DynamiteModule", (String)"IDynamite loader version = 2, no high precision latency measurement.");
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var11_11 = new cgz(var0);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var13_21 = var12_6 /* !! */ .a();
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var4_24 = box.a;
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var13_21.writeStrongBinder((IBinder)var11_11);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var13_21.writeString((String)var1_1);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var13_21.writeInt((int)var2_5);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var1_1 = var12_6 /* !! */ .b(5, (Parcel)var13_21);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var2_5 = var1_1.readInt();
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var1_1.recycle();
            return (int)var2_5;
lbl198:
            // 1 sources

            var8_13 /* !! */  = var9_8 /* !! */ ;
            Log.w((String)"DynamiteModule", (String)"IDynamite loader version < 2, falling back to getModuleVersion2");
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var11_11 = new cgz(var0);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var13_21 = var12_6 /* !! */ .a();
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var4_24 = box.a;
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var13_21.writeStrongBinder((IBinder)var11_11);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var13_21.writeString((String)var1_1);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var13_21.writeInt((int)var2_5);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var1_1 = var12_6 /* !! */ .b(3, (Parcel)var13_21);
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var2_5 = var1_1.readInt();
            var8_13 /* !! */  = var9_8 /* !! */ ;
            var1_1.recycle();
            return (int)var2_5;
        }
        catch (RemoteException var9_10) {
            var1_1 = var10_7;
        }
lbl223:
        // 2 sources

        var8_13 /* !! */  = var1_1;
        var10_7 = var9_8 /* !! */ .getMessage();
        var8_13 /* !! */  = var1_1;
        var8_13 /* !! */  = var1_1;
        var9_8 /* !! */  = new StringBuilder();
        var8_13 /* !! */  = var1_1;
        var9_8 /* !! */ .append("Failed to retrieve remote module version: ");
        var8_13 /* !! */  = var1_1;
        var9_8 /* !! */ .append(var10_7);
        var8_13 /* !! */  = var1_1;
        Log.w((String)"DynamiteModule", (String)var9_8 /* !! */ .toString());
        var2_5 = var3_12;
        if (var1_1 == null) return (int)var2_5;
        var1_1.close();
        return (int)var3_12;
        catch (Throwable var9_9) {}
        var1_1 = var8_13 /* !! */ ;
        var8_13 /* !! */  = var9_9;
lbl245:
        // 2 sources

        if (var1_1 == null) throw var8_13 /* !! */ ;
        var1_1.close();
        throw var8_13 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static chk c(Context var0, String var1_7) {
        block50: {
            block52: {
                var11_8 = var0 /* !! */ .getApplicationContext();
                if (var11_8 == null) throw new chh("null application Context");
                var13_9 = chk.h;
                var7_11 = (ilo)var13_9.get();
                var10_12 = new ilo();
                var13_9.set(var10_12);
                var8_13 = chk.i;
                var9_17 = (Long)var8_13.get();
                var5_18 = var9_17;
                var8_13.set(SystemClock.uptimeMillis());
                var12_19 = cgw.g(var0 /* !! */ , (String)var1_7, chk.j);
                var3_20 = var12_19.a;
                var2_21 = var12_19.b;
                var8_13 = new StringBuilder("Considering local module ");
                var8_13.append((String)var1_7);
                var8_13.append(":");
                var8_13.append(var3_20);
                var8_13.append(" and remote module ");
                var8_13.append((String)var1_7);
                var8_13.append(":");
                var8_13.append(var2_21);
                Log.i((String)"DynamiteModule", (String)var8_13.toString());
                var2_21 = var12_19.c;
                if (var2_21 == 0) ** GOTO lbl230
                if (var2_21 != -1) ** GOTO lbl39
                if (var12_19.a == 0) ** GOTO lbl230
lbl39:
                // 2 sources

                if (var2_21 == 1 && var12_19.b == 0) ** GOTO lbl230
                if (var2_21 != -1) break block52;
                var0 /* !! */  = chk.e(var11_8, (String)var1_7);
                ** GOTO lbl215
            }
            if (var2_21 != 1) ** GOTO lbl228
            var2_21 = var12_19.b;
            {
                catch (Throwable var0_1) {}
            }
            if (!chk.h(var0 /* !! */ )) {
                var8_13 = new chh("Remote loading disabled");
                throw var8_13;
            }
            var8_13 = chk.c;
            // MONITOREXIT : chk.class
            if (var8_13 == null) ** GOTO lbl186
            if (!var8_13.booleanValue()) ** GOTO lbl-1000
            var8_13 = new StringBuilder("Selected remote version of ");
            var8_13.append((String)var1_7);
            var8_13.append(", version >= ");
            var8_13.append(var2_21);
            Log.i((String)"DynamiteModule", (String)var8_13.toString());
            // MONITORENTER : chk.class
            var8_13 = chk.l;
            // MONITOREXIT : chk.class
            if (var8_13 == null) ** GOTO lbl118
            var13_9 = (ilo)var13_9.get();
            if (var13_9 == null || var13_9.a == null) ** GOTO lbl-1000
            var15_22 /* !! */  = var0 /* !! */ .getApplicationContext();
            var13_9 = var13_9.a;
            new cgz((Object)null);
            // MONITORENTER : chk.class
            var4_24 = chk.f >= 2;
            // MONITOREXIT : chk.class
            try {
                Boolean.valueOf(var4_24).getClass();
                if (var4_24) {
                    var14_25 = new cgz(var15_22 /* !! */ );
                    var15_22 /* !! */  = new cgz(var13_9);
                    var13_9 = var8_13.a();
                    var3_20 = box.a;
                    var13_9.writeStrongBinder((IBinder)var14_25);
                    var13_9.writeString((String)var1_7);
                    var13_9.writeInt(var2_21);
                    var13_9.writeStrongBinder((IBinder)var15_22 /* !! */ );
                    var13_9 = var8_13.b(3, (Parcel)var13_9);
                    var14_25 = var13_9.readStrongBinder();
                    var8_13 = var14_25 == null ? null : ((var8_13 = var14_25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper")) instanceof cha != false ? (cha)var8_13 : new cgy((IBinder)var14_25));
                    var13_9.recycle();
                } else {
                    Log.w((String)"DynamiteModule", (String)"Dynamite loader version < 2, falling back to loadModule2");
                    var14_26 = new cgz(var15_22 /* !! */ );
                    var15_22 /* !! */  = new cgz(var13_9);
                    var13_9 = var8_13.a();
                    var3_20 = box.a;
                    var13_9.writeStrongBinder((IBinder)var14_26);
                    var13_9.writeString((String)var1_7);
                    var13_9.writeInt(var2_21);
                    var13_9.writeStrongBinder((IBinder)var15_22 /* !! */ );
                    var13_9 = var8_13.b(2, (Parcel)var13_9);
                    var14_26 = var13_9.readStrongBinder();
                    var8_13 = var14_26 == null ? null : ((var8_13 = var14_26.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper")) instanceof cha != false ? (cha)var8_13 : new cgy((IBinder)var14_26));
                    var13_9.recycle();
                }
                var13_9 = (Context)cgz.b((cha)var8_13);
                if (var13_9 == null) {
                    var8_13 = new chh("Failed to get module context");
                    throw var8_13;
                }
                var8_13 = new chk((Context)var13_9);
                var0 /* !! */  = var8_13;
                ** GOTO lbl215
            }
            catch (Throwable var8_14) {
                try {
                    cgw.c(var0 /* !! */ );
                    var13_9 = new chh("Failed to load remote module.", var8_14);
                    throw var13_9;
                }
                catch (chh var8_16) {
                    block51: {
                        try {
                            var14_30 = var8_16.getMessage();
                            var13_9 = new StringBuilder();
                            var13_9.append("Failed to load remote module: ");
                            var13_9.append(var14_30);
                            Log.w((String)"DynamiteModule", (String)var13_9.toString());
                            var2_21 = var12_19.a;
                            if (var2_21 == 0) break block51;
                            var12_19 = new chg(var2_21);
                            if (cgw.g((Context)var0 /* !! */ , (String)var1_7, (chi)var12_19).c != -1) break block51;
                            var0 /* !! */  = chk.e(var11_8, (String)var1_7);
                        }
                        catch (Throwable var0_3) {}
lbl215:
                        // 4 sources

                        if (var5_18 == 0L) {
                            chk.i.remove();
                        } else {
                            chk.i.set(var9_17);
                        }
                        var1_7 = var10_12.a;
                        if (var1_7 != null) {
                            var1_7.close();
                        }
                        chk.h.set(var7_11);
                        return var0 /* !! */ ;
                    }
                    try {
                        var0 /* !! */  = new chh("Remote load failed. No local fallback found.", var8_16);
                        throw var0 /* !! */ ;
lbl228:
                        // 1 sources

                        var0 /* !! */  = new chh(a.af(0, "VersionPolicy returned invalid code:"));
                        throw var0 /* !! */ ;
lbl230:
                        // 3 sources

                        var3_20 = var12_19.a;
                        var2_21 = var12_19.b;
                        var8_13 = new StringBuilder("No acceptable module ");
                        var8_13.append((String)var1_7);
                        var8_13.append(" found. Local version is ");
                        var8_13.append(var3_20);
                        var8_13.append(" and remote version is ");
                        var8_13.append(var2_21);
                        var8_13.append(".");
                        var0 /* !! */  = new chh(var8_13.toString());
                        throw var0 /* !! */ ;
                    }
                    catch (Throwable var0_2) {
                        break block50;
                    }
                }
                break block50;
                catch (chh var8_15) {
                    throw var8_15;
                }
                catch (RemoteException var13_10) {
                    var8_13 = new chh("Failed to load remote module.", var13_10);
                    throw var8_13;
                }
            }
lbl-1000:
            // 1 sources

            {
                var8_13 = new chh("No result cursor");
                throw var8_13;
lbl118:
                // 1 sources

                var8_13 = new chh("DynamiteLoaderV2 was not cached.");
                throw var8_13;
            }
lbl-1000:
            // 1 sources

            {
                var8_13 = new StringBuilder("Selected remote version of ");
                var8_13.append((String)var1_7);
                var8_13.append(", version >= ");
                var8_13.append(var2_21);
                Log.i((String)"DynamiteModule", (String)var8_13.toString());
                var8_13 = chk.i(var0 /* !! */ );
                if (var8_13 == null) {
                    var8_13 = new chh("Failed to create IDynamiteLoader.");
                    throw var8_13;
                }
                var3_20 = var8_13.e();
                if (var3_20 >= 3) {
                    var14_27 = (ilo)var13_9.get();
                    if (var14_27 == null) {
                        var8_13 = new chh("No cached result cursor holder");
                        throw var8_13;
                    }
                    var13_9 = new cgz(var0 /* !! */ );
                    var15_23 = var14_27.a;
                    var14_27 = new cgz(var15_23);
                    var15_23 = var8_13.a();
                    var3_20 = box.a;
                    var15_23.writeStrongBinder((IBinder)var13_9);
                    var15_23.writeString((String)var1_7);
                    var15_23.writeInt(var2_21);
                    var15_23.writeStrongBinder((IBinder)var14_27);
                    var13_9 = var8_13.b(8, (Parcel)var15_23);
                    var8_13 = var13_9.readStrongBinder();
                    var8_13 = var8_13 == null ? null : ((var14_27 = var8_13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper")) instanceof cha != false ? (cha)var14_27 : new cgy((IBinder)var8_13));
                    var13_9.recycle();
                } else if (var3_20 == 2) {
                    Log.w((String)"DynamiteModule", (String)"IDynamite loader version = 2");
                    var14_28 = new cgz(var0 /* !! */ );
                    var13_9 = var8_13.a();
                    var3_20 = box.a;
                    var13_9.writeStrongBinder((IBinder)var14_28);
                    var13_9.writeString((String)var1_7);
                    var13_9.writeInt(var2_21);
                    var13_9 = var8_13.b(4, (Parcel)var13_9);
                    var8_13 = var13_9.readStrongBinder();
                    var8_13 = var8_13 == null ? null : ((var14_28 = var8_13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper")) instanceof cha != false ? (cha)var14_28 : new cgy((IBinder)var8_13));
                    var13_9.recycle();
                } else {
                    Log.w((String)"DynamiteModule", (String)"Dynamite loader version < 2, falling back to createModuleContext");
                    var14_29 = new cgz(var0 /* !! */ );
                    var13_9 = var8_13.a();
                    var3_20 = box.a;
                    var13_9.writeStrongBinder((IBinder)var14_29);
                    var13_9.writeString((String)var1_7);
                    var13_9.writeInt(var2_21);
                    var13_9 = var8_13.b(2, (Parcel)var13_9);
                    var8_13 = var13_9.readStrongBinder();
                    var8_13 = var8_13 == null ? null : ((var14_29 = var8_13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper")) instanceof cha != false ? (cha)var14_29 : new cgy((IBinder)var8_13));
                    var13_9.recycle();
                }
                var8_13 = cgz.b((cha)var8_13);
                if (var8_13 == null) {
                    var8_13 = new chh("Failed to load remote module.");
                    throw var8_13;
                }
                var8_13 = new chk((Context)var8_13);
                var0 /* !! */  = var8_13;
                ** GOTO lbl215
lbl186:
                // 1 sources

                var8_13 = new chh("Failed to determine which loading route to use.");
                throw var8_13;
            }
            break block50;
            catch (Throwable var0_4) {
                break block50;
            }
            catch (Throwable var0_5) {
                // empty catch block
            }
        }
        if (var5_18 == 0L) {
            chk.i.remove();
        } else {
            chk.i.set(var9_17);
        }
        var1_7 = var10_12.a;
        if (var1_7 != null) {
            var1_7.close();
        }
        chk.h.set(var7_11);
        throw var0_6;
    }

    /*
     * Exception decompiling
     */
    private static int d(Context var0, String var1_6, boolean var2_9, boolean var3_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 26[TRYBLOCK] [49 : 623->626)] java.lang.Throwable
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

    private static chk e(Context context, String string) {
        Log.i((String)"DynamiteModule", (String)"Selected local version of ".concat(string));
        return new chk(context);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void f(ClassLoader object) {
        void var0_6;
        try {
            IBinder iBinder = ((ClassLoader)object).loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2");
            object = null;
            iBinder = (IBinder)iBinder.getConstructor(null).newInstance(null);
            if (iBinder != null) {
                object = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                object = object instanceof chm ? (chm)object : new chm(iBinder);
            }
            l = object;
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new chh("Failed to instantiate dynamite loader", (Throwable)var0_6);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new chh("Failed to instantiate dynamite loader", (Throwable)var0_6);
        }
        catch (InstantiationException instantiationException) {
            throw new chh("Failed to instantiate dynamite loader", (Throwable)var0_6);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new chh("Failed to instantiate dynamite loader", (Throwable)var0_6);
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        throw new chh("Failed to instantiate dynamite loader", (Throwable)var0_6);
    }

    private static boolean g(Cursor cursor) {
        ilo ilo2 = (ilo)h.get();
        if (ilo2 != null && ilo2.a == null) {
            ilo2.a = cursor;
            return true;
        }
        return false;
    }

    private static boolean h(Context object) {
        if (Boolean.TRUE.equals(null)) {
            return true;
        }
        if (Boolean.TRUE.equals(g)) {
            return true;
        }
        Boolean bl2 = g;
        boolean bl3 = false;
        boolean bl4 = false;
        if (bl2 == null) {
            bl2 = object.getPackageManager();
            int n2 = Build.VERSION.SDK_INT < 29 ? 0 : 0x10000000;
            bl2 = bl2.resolveContentProvider("com.google.android.gms.chimera", n2);
            boolean bl5 = bl4;
            if (cbp.d.f((Context)object, 10000000) == 0) {
                bl5 = bl4;
                if (bl2 != null) {
                    bl5 = bl4;
                    if ("com.google.android.gms".equals(((ProviderInfo)bl2).packageName)) {
                        bl5 = true;
                    }
                }
            }
            object = bl5;
            g = object;
            object.getClass();
            bl3 = bl5;
            if (bl5) {
                bl3 = bl5;
                if (((ProviderInfo)bl2).applicationInfo != null) {
                    bl3 = bl5;
                    if ((((ProviderInfo)bl2).applicationInfo.flags & 0x81) == 0) {
                        Log.i((String)"DynamiteModule", (String)"Non-system-image GmsCore APK, forcing V1");
                        e = true;
                        bl3 = bl5;
                    }
                }
            }
        }
        if (!bl3) {
            Log.e((String)"DynamiteModule", (String)"Invalid GmsCore APK, remote loading disabled.");
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static chl i(Context object) {
        synchronized (chk.class) {
            block6: {
                Object object2 = k;
                if (object2 != null) {
                    return object2;
                }
                try {
                    object = (IBinder)object.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (object == null) {
                        return null;
                    }
                    object2 = object.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    object = object2 instanceof chl ? (chl)object2 : new chl((IBinder)object);
                    if (object == null) return null;
                    k = object;
                }
                catch (Exception exception) {
                    object2 = exception.getMessage();
                    StringBuilder stringBuilder = new StringBuilder("Failed to load IDynamiteLoader from GmsCore: ");
                    stringBuilder.append((String)object2);
                    Log.e((String)"DynamiteModule", (String)stringBuilder.toString());
                    break block6;
                }
                return object;
            }
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final IBinder b() {
        void var1_5;
        try {
            IBinder iBinder = (IBinder)this.a.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
            return iBinder;
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        throw new chh("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", (Throwable)var1_5);
    }
}

