/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class bd
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ky(1);
    final Bundle a;

    public bd(Parcel parcel, ClassLoader classLoader) {
        parcel = parcel.readBundle();
        this.a = parcel;
        if (classLoader != null && parcel != null) {
            parcel.setClassLoader(classLoader);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeBundle(this.a);
    }
}

