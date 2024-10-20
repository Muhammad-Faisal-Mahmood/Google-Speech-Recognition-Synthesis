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

public final class asd
extends asm {
    public static final Parcelable.Creator CREATOR = new aqo(9);
    public String a;

    public asd(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
    }

    public asd(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeString(this.a);
    }
}

