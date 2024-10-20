/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new azr();
    private final azt a;

    public ParcelImpl(Parcel parcel) {
        this.a = new azs(parcel).c();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        new azs(parcel).k(this.a);
    }
}

