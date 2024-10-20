/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class BitmapTeleporter
extends cgk
implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new caw(13);
    final int a;
    ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int n2, ParcelFileDescriptor parcelFileDescriptor, int n3) {
        this.a = n2;
        this.b = parcelFileDescriptor;
        this.c = n3;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        if (this.b != null) {
            int n3 = kl.u(parcel);
            kl.A(parcel, 1, this.a);
            kl.J(parcel, 2, (Parcelable)this.b, n2 | 1);
            kl.A(parcel, 3, this.c);
            kl.w(parcel, n3);
            this.b = null;
            return;
        }
        kl.at(null);
        throw null;
    }
}

