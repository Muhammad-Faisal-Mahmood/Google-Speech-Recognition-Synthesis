/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;

public class DeviceContactsSyncSetting
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(10);
    public static final int NOT_APPLICABLE = 1;
    public static final int OFF = 2;
    public static final int ON = 3;
    public static final int UNKNOWN_SYNC_SETTING = 0;
    private final int a;

    public DeviceContactsSyncSetting(int n2) {
        this.a = n2;
    }

    public static DeviceContactsSyncSetting create(int n2) {
        return new DeviceContactsSyncSetting(n2);
    }

    public int getSyncSetting() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.A(parcel, 1, this.getSyncSetting());
        kl.w(parcel, n2);
    }
}

