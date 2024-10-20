/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public final class Status
extends cgk
implements ReflectedParcelable,
cda {
    public static final Parcelable.Creator CREATOR;
    public static final Status a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public final int e;
    public final String f;
    public final PendingIntent g;
    public final cbk h;

    static {
        a = new Status(0);
        b = new Status(14);
        c = new Status(8);
        d = new Status(15);
        CREATOR = new caw(12);
    }

    public Status(int n2) {
        this(n2, null);
    }

    public Status(int n2, String string) {
        this(n2, string, null);
    }

    public Status(int n2, String string, PendingIntent pendingIntent, cbk cbk2) {
        this.e = n2;
        this.f = string;
        this.g = pendingIntent;
        this.h = cbk2;
    }

    public Status(int n2, String string, byte[] byArray) {
        this(n2, string, null, null);
    }

    public final boolean a() {
        return this.e <= 0;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof Status)) {
            return false;
        }
        object = (Status)object;
        return this.e == ((Status)object).e && a.k(this.f, ((Status)object).f) && a.k(this.g, ((Status)object).g) && a.k(this.h, ((Status)object).h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String string = this.f;
        if (string == null) {
            int n2 = this.e;
            switch (n2) {
                default: {
                    string = a.af(n2, "unknown status code: ");
                    break;
                }
                case 22: {
                    string = "RECONNECTION_TIMED_OUT";
                    break;
                }
                case 21: {
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                }
                case 20: {
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                }
                case 19: {
                    string = "REMOTE_EXCEPTION";
                    break;
                }
                case 18: {
                    string = "DEAD_CLIENT";
                    break;
                }
                case 17: {
                    string = "API_NOT_CONNECTED";
                    break;
                }
                case 16: {
                    string = "CANCELED";
                    break;
                }
                case 15: {
                    string = "TIMEOUT";
                    break;
                }
                case 14: {
                    string = "INTERRUPTED";
                    break;
                }
                case 13: {
                    string = "ERROR";
                    break;
                }
                case 10: {
                    string = "DEVELOPER_ERROR";
                    break;
                }
                case 8: {
                    string = "INTERNAL_ERROR";
                    break;
                }
                case 7: {
                    string = "NETWORK_ERROR";
                    break;
                }
                case 6: {
                    string = "RESOLUTION_REQUIRED";
                    break;
                }
                case 5: {
                    string = "INVALID_ACCOUNT";
                    break;
                }
                case 4: {
                    string = "SIGN_IN_REQUIRED";
                    break;
                }
                case 3: {
                    string = "SERVICE_DISABLED";
                    break;
                }
                case 2: {
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                }
                case 0: {
                    string = "SUCCESS";
                    break;
                }
                case -1: {
                    string = "SUCCESS_CACHE";
                }
            }
        }
        kl.aw("statusCode", string, arrayList);
        kl.aw("resolution", this.g, arrayList);
        return kl.av(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = this.e;
        int n4 = kl.u(parcel);
        kl.A(parcel, 1, n3);
        kl.K(parcel, 2, this.f);
        kl.J(parcel, 3, (Parcelable)this.g, n2);
        kl.J(parcel, 4, this.h, n2);
        kl.w(parcel, n4);
    }
}

