/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 */
package org.chromium.base;

import android.os.StrictMode;
import java.util.TimeZone;

class TimezoneUtils {
    private TimezoneUtils() {
    }

    private static String getDefaultTimeZoneId() {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        String string = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        return string;
    }
}

