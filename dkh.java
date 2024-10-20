/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;

public final class dkh {
    public static void a(Context context) {
        try {
            Intent intent = new Intent("com.google.android.primes.action.DEBUG_PRIMES_EVENTS");
            intent.setPackage(context.getPackageName());
            intent.addFlags(0x10000000);
            context.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            ((heg)((heg)dkc.a.h()).j("com/google/android/libraries/performance/primes/debug/Intents", "startPrimesEventDebugActivity", 35, "Intents.java")).r("PrimesEventActivity not found: primes/debug is not included in the app.");
            return;
        }
    }
}

