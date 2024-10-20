/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FetchBackUpDeviceContactInfoResponseEntity
extends cgk
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cgi(19);
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    public final List a() {
        Object object2;
        if (this.b == null && (object2 = this.a) != null) {
            this.b = new ArrayList(object2.size());
            for (Object object2 : this.a) {
                this.b.add(object2);
            }
        }
        return this.b;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof FetchBackUpDeviceContactInfoResponseEntity)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (FetchBackUpDeviceContactInfoResponseEntity)object;
        return a.k(this.a(), ((FetchBackUpDeviceContactInfoResponseEntity)object).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a()});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.O(parcel, 2, this.a());
        kl.w(parcel, n2);
    }
}

