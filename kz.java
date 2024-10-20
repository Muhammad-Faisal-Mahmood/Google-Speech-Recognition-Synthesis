/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class kz
extends yq {
    public static final Parcelable.Creator CREATOR = new ky(0);
    public Parcelable a;

    public kz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = ko.class.getClassLoader();
        }
        this.a = parcel.readParcelable(classLoader2);
    }

    public kz(Parcelable parcelable) {
        super(parcelable);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeParcelable(this.a, 0);
    }
}

