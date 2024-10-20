/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;

public class cbp {
    public static final int c;
    public static final cbp d;

    static {
        AtomicBoolean atomicBoolean = ccg.c;
        c = 244030000;
        d = new cbp();
    }

    public final int e(Context context) {
        return this.f(context, c);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int f(Context var1_1, int var2_2) {
        block27: {
            block28: {
                block32: {
                    block31: {
                        block26: {
                            block29: {
                                block25: {
                                    var7_3 = ccg.c;
                                    try {
                                        var1_1.getResources().getString(2132017249);
                                    }
                                    catch (Throwable var7_4) {
                                        Log.e((String)"GooglePlayServicesUtil", (String)"The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
                                    }
                                    var6_8 = "com.google.android.gms".equals(var1_1.getPackageName());
                                    var4_9 = 1;
                                    if (var6_8 || ccg.c.get()) break block29;
                                    var7_3 = cfz.a;
                                    synchronized (var7_3) {
                                        block30: {
                                            if (!cfz.b) break block30;
                                            break block25;
                                        }
                                        cfz.b = true;
                                        var9_10 = var1_1.getPackageName();
                                        var8_11 = cgx.b(var1_1);
                                        try {
                                            var8_11 = var8_11.a((String)var9_10, (int)128).metaData;
                                            if (var8_11 == null) {
                                            }
                                        }
                                        catch (PackageManager.NameNotFoundException var8_12) {
                                            Log.wtf((String)"MetadataValueReader", (String)"This should never happen.", (Throwable)var8_12);
                                            break block25;
                                        }
                                        {
                                            var8_11.getString("com.google.app.id");
                                            cfz.c = var8_11.getInt("com.google.android.gms.version");
                                        }
                                    }
                                }
                                var3_13 = cfz.c;
                                if (var3_13 == 0) throw new GooglePlayServicesMissingManifestValueException();
                                if (var3_13 != 244030000) throw new GooglePlayServicesIncorrectManifestValueException(var3_13);
                            }
                            var6_8 = cgt.c(var1_1);
                            var5_14 = 0;
                            if (var6_8) ** GOTO lbl-1000
                            if (cgt.a == null) {
                                var6_8 = var1_1.getPackageManager().hasSystemFeature("android.hardware.type.iot") || var1_1.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
                                cgt.a = var6_8;
                            }
                            if (!cgt.a.booleanValue()) {
                                var3_13 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_13 = 0;
                            }
                            kl.an(true);
                            var9_10 = var1_1.getPackageName();
                            var10_15 = var1_1.getPackageManager();
                            if (var3_13 != 0) {
                                try {
                                    var7_3 = var10_15.getPackageInfo("com.android.vending", 8256);
                                    break block26;
                                }
                                catch (PackageManager.NameNotFoundException var7_5) {
                                    Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(var9_10).concat(" requires the Google Play Store, but it is missing."));
lbl58:
                                    // 4 sources

                                    while (true) {
                                        var2_2 = 9;
                                        break block27;
                                        break;
                                    }
                                }
                            }
                            var7_3 = null;
                        }
                        try {
                            var8_11 = var10_15.getPackageInfo("com.google.android.gms", 64);
                        }
                        catch (PackageManager.NameNotFoundException var7_7) {
                            Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(var9_10).concat(" requires Google Play services, but they are missing."));
                            break block28;
                        }
                        cch.b(var1_1);
                        if (cch.d((PackageInfo)var8_11, true)) break block31;
                        Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(var9_10).concat(" requires Google Play services, but their signature is invalid."));
                        ** GOTO lbl58
                    }
                    if (var3_13 == 0) break block32;
                    kl.at(var7_3);
                    if (cch.d((PackageInfo)var7_3, true)) break block32;
                    Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(var9_10).concat(" requires Google Play Store, but its signature is invalid."));
                    ** GOTO lbl58
                }
                if (var3_13 != 0 && var7_3 != null && !var7_3.signatures[0].equals((Object)var8_11.signatures[0])) {
                    Log.w((String)"GooglePlayServicesUtil", (String)String.valueOf(var9_10).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    ** continue;
                }
                if (cgw.b(var8_11.versionCode) < cgw.b(var2_2)) {
                    var3_13 = var8_11.versionCode;
                    var7_3 = new StringBuilder("Google Play services out of date for ");
                    var7_3.append(var9_10);
                    var7_3.append(".  Requires ");
                    var7_3.append(var2_2);
                    var7_3.append(" but found ");
                    var7_3.append(var3_13);
                    Log.w((String)"GooglePlayServicesUtil", (String)var7_3.toString());
                    var2_2 = 2;
                } else {
                    var8_11 = var8_11.applicationInfo;
                    var7_3 = var8_11;
                    if (var8_11 == null) {
                        try {
                            var7_3 = var10_15.getApplicationInfo("com.google.android.gms", 0);
                        }
                        catch (PackageManager.NameNotFoundException var7_6) {
                            Log.wtf((String)"GooglePlayServicesUtil", (String)String.valueOf(var9_10).concat(" requires Google Play services, but they're missing when getting application info."), (Throwable)var7_6);
                            break block28;
                        }
                    }
                    var2_2 = var5_14;
                    if (!var7_3.enabled) {
                        var2_2 = 3;
                    }
                }
                break block27;
            }
            var2_2 = 1;
        }
        if (var2_2 != 1) return var2_2;
        if (ccg.b(var1_1) != false) return 18;
        return var4_9;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Intent g(Context object, int n2, String string) {
        Uri uri;
        void var2_7;
        if (var2_7 != true && var2_7 != 2) {
            if (var2_7 != 3) {
                return null;
            }
            uri = Uri.fromParts((String)"package", (String)"com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uri);
            return intent;
        }
        if (object != null && cgt.c(object)) {
            Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent.setPackage("com.google.android.wearable.app");
            return intent;
        }
        StringBuilder stringBuilder = new StringBuilder("gcore_");
        stringBuilder.append(c);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty((CharSequence)uri)) {
            stringBuilder.append((String)uri);
        }
        stringBuilder.append("-");
        if (object != null) {
            stringBuilder.append(object.getPackageName());
        }
        stringBuilder.append("-");
        if (object != null) {
            try {
                stringBuilder.append(cgx.b((Context)object).b((String)object.getPackageName(), (int)0).versionCode);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        }
        String string2 = stringBuilder.toString();
        uri = new Intent("android.intent.action.VIEW");
        stringBuilder = Uri.parse((String)"market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            stringBuilder.appendQueryParameter("pcampaignid", string2);
        }
        uri.setData(stringBuilder.build());
        uri.setPackage("com.android.vending");
        uri.addFlags(524288);
        return uri;
    }

    public final PendingIntent h(Context context, int n2, String string) {
        if ((string = this.g(context, n2, string)) == null) {
            return null;
        }
        return PendingIntent.getActivity((Context)context, (int)0, (Intent)string, (int)0xC000000);
    }
}

