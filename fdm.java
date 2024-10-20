/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 *  android.os.Build$VERSION
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Iterator;

public final class fdm {
    private static final hei a = hei.m("com/google/android/libraries/speech/transcription/TranscriptionUtils");

    static {
        new hjw(500L, 1.2, 15);
        new hjw(5000L, 1.5, 13);
    }

    public static ComponentName a(Context context) {
        Iterator iterator = context.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).iterator();
        context = null;
        while (iterator.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo)iterator.next();
            if (resolveInfo.activityInfo.packageName.equals("com.google.android.tts") && Build.VERSION.SDK_INT >= 31) {
                return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            }
            if (!resolveInfo.activityInfo.packageName.equals("com.google.android.googlequicksearchbox")) continue;
            context = new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (context != null) {
            return context;
        }
        ((heg)((heg)a.h()).j("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getIntentApiComponent", 147, "TranscriptionUtils.java")).r("No Intent API provided by Google.");
        return null;
    }
}

