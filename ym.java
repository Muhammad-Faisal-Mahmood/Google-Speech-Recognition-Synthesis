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

public final class ym
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new aa(11);
    public int a;

    public ym(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public ym(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HorizontalScrollView.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode((Object)this)));
        stringBuilder.append(" scrollPosition=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeInt(this.a);
    }
}

