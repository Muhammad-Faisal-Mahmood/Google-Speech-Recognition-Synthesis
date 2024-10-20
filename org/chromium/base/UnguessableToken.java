/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import org.chromium.base.TokenBase;

public final class UnguessableToken
extends TokenBase
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new chy(13);

    public UnguessableToken(long l2, long l3) {
        super(l2, l3);
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel parcel = Parcel.obtain();
        this.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken)CREATOR.createFromParcel(parcel);
        parcel.recycle();
        return unguessableToken;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}

