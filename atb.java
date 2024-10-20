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

public final class atb
extends asm {
    public static final Parcelable.Creator CREATOR = new aqo(13);
    public final int a;

    public atb(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public atb(Parcelable parcelable, int n2) {
        super(parcelable);
        this.a = n2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeInt(this.a);
    }
}

