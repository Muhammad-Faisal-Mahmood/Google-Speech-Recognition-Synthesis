/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.people.contactssync;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;

public final class DeviceContactsSync {
    private DeviceContactsSync() {
    }

    public static DeviceContactsSyncClient getClient(Activity activity) {
        return new civ(activity);
    }

    public static DeviceContactsSyncClient getClient(Context context) {
        return new civ(context);
    }
}

