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

public final class mb
extends yq {
    public static final Parcelable.Creator CREATOR = new ky(2);
    public int a;
    public boolean b;

    public mb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        boolean bl2 = parcel.readInt() != 0;
        this.b = bl2;
    }

    public mb(Parcelable parcelable) {
        super(parcelable);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}

