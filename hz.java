/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View$BaseSavedState
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class hz
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new aa(5);
    boolean a;

    public hz(Parcel parcel) {
        super(parcel);
        boolean bl2 = parcel.readByte() != 0;
        this.a = bl2;
    }

    public hz(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeByte((byte)(this.a ? 1 : 0));
    }
}

