/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.people.contactssync;

import android.content.Context;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient$SyncSettingUpdatedListener;

public interface DeviceContactsSyncClient {
    public ckz getDeviceContactsSyncSetting();

    public ckz launchDeviceContactsSyncSettingActivity(Context var1);

    public ckz registerSyncSettingUpdatedListener(SyncSettingUpdatedListener var1);

    public ckz unregisterSyncSettingUpdatedListener(SyncSettingUpdatedListener var1);
}

