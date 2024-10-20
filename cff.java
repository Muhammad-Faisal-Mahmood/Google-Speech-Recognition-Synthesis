/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class cff {
    private static final pa a = new pa();
    private static Locale b;

    public static String a(Context object) {
        String string = object.getPackageName();
        try {
            Object object2 = cgx.b(object);
            object2 = ((Context)((bzq)object2).a).getPackageManager().getApplicationLabel(((Context)((bzq)object2).a).getPackageManager().getApplicationInfo(string, 0)).toString();
            return object2;
        }
        catch (PackageManager.NameNotFoundException | NullPointerException throwable) {
            object = object.getApplicationInfo().name;
            if (TextUtils.isEmpty((CharSequence)object)) {
                return string;
            }
            return object;
        }
    }

    public static String b(Context context, int n2) {
        Resources resources = context.getResources();
        String string = cff.a(context);
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 5) {
                        if (n2 != 7) {
                            if (n2 != 9) {
                                if (n2 != 20) {
                                    switch (n2) {
                                        default: {
                                            return resources.getString(2132017249, new Object[]{string});
                                        }
                                        case 18: {
                                            return resources.getString(2132017254, new Object[]{string});
                                        }
                                        case 17: {
                                            return cff.d(context, "common_google_play_services_sign_in_failed_text", string);
                                        }
                                        case 16: 
                                    }
                                    return cff.d(context, "common_google_play_services_api_unavailable_text", string);
                                }
                                return cff.d(context, "common_google_play_services_restricted_profile_text", string);
                            }
                            return resources.getString(2132017250, new Object[]{string});
                        }
                        return cff.d(context, "common_google_play_services_network_error_text", string);
                    }
                    return cff.d(context, "common_google_play_services_invalid_account_text", string);
                }
                return resources.getString(2132017242, new Object[]{string});
            }
            if (cgt.c(context)) {
                return resources.getString(2132017255);
            }
            return resources.getString(2132017252, new Object[]{string});
        }
        return resources.getString(2132017245, new Object[]{string});
    }

    public static String c(Context context, int n2) {
        Resources resources = context.getResources();
        switch (n2) {
            default: {
                Log.e((String)"GoogleApiAvailability", (String)a.af(n2, "Unexpected error code "));
                return null;
            }
            case 20: {
                Log.e((String)"GoogleApiAvailability", (String)"The current user profile is restricted and could not use authenticated features.");
                return cff.e(context, "common_google_play_services_restricted_profile_title");
            }
            case 17: {
                Log.e((String)"GoogleApiAvailability", (String)"The specified account could not be signed in.");
                return cff.e(context, "common_google_play_services_sign_in_failed_title");
            }
            case 16: {
                Log.e((String)"GoogleApiAvailability", (String)"One of the API components you attempted to connect to is not available.");
                return null;
            }
            case 11: {
                Log.e((String)"GoogleApiAvailability", (String)"The application is not licensed to the user.");
                return null;
            }
            case 10: {
                Log.e((String)"GoogleApiAvailability", (String)"Developer error occurred. Please see logs for detailed information");
                return null;
            }
            case 9: {
                Log.e((String)"GoogleApiAvailability", (String)"Google Play services is invalid. Cannot recover.");
                return null;
            }
            case 8: {
                Log.e((String)"GoogleApiAvailability", (String)"Internal error occurred. Please see logs for detailed information");
                return null;
            }
            case 7: {
                Log.e((String)"GoogleApiAvailability", (String)"Network error occurred. Please retry request later.");
                return cff.e(context, "common_google_play_services_network_error_title");
            }
            case 5: {
                Log.e((String)"GoogleApiAvailability", (String)"An invalid account was specified when connecting. Please provide a valid account.");
                return cff.e(context, "common_google_play_services_invalid_account_title");
            }
            case 4: 
            case 6: 
            case 18: {
                return null;
            }
            case 3: {
                return resources.getString(2132017243);
            }
            case 2: {
                return resources.getString(2132017253);
            }
            case 1: 
        }
        return resources.getString(2132017246);
    }

    public static String d(Context object, String string, String string2) {
        Resources resources = object.getResources();
        string = cff.e(object, string);
        object = string;
        if (string == null) {
            object = resources.getString(2132017249);
        }
        return String.format(resources.getConfiguration().locale, (String)object, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e(Context object, String string) {
        pa pa2 = a;
        synchronized (pa2) {
            Object object2 = tw.d(ag$$ExternalSyntheticApiModelOutline1.m(object.getResources().getConfiguration())).f(0);
            if (!((Locale)object2).equals(b)) {
                pa2.clear();
                b = object2;
            }
            if ((object2 = (String)pa2.get(string)) != null) {
                return object2;
            }
            object2 = ccg.c;
            try {
                object = object.getPackageManager().getResourcesForApplication("com.google.android.gms");
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
            if (object == null) {
                return null;
            }
            int n2 = object.getIdentifier(string, "string", "com.google.android.gms");
            if (n2 == 0) {
                Log.w((String)"GoogleApiAvailability", (String)a.ai(string, "Missing resource: "));
                return null;
            }
            if (TextUtils.isEmpty((CharSequence)(object = object.getString(n2)))) {
                Log.w((String)"GoogleApiAvailability", (String)a.ai(string, "Got empty resource: "));
                return null;
            }
            a.put(string, object);
            return object;
        }
    }
}

