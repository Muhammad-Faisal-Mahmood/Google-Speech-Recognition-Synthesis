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

public final class fuw
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new chy(7);
    int a;

    public fuw(Parcel parcel) {
        super(parcel);
        this.a = (Integer)parcel.readValue(((Object)((Object)this)).getClass().getClassLoader());
    }

    public fuw(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        String string = Integer.toHexString(System.identityHashCode((Object)this));
        int n2 = this.a;
        String string2 = n2 != 1 ? (n2 != 2 ? "unchecked" : "indeterminate") : "checked";
        return a.aq(string2, string, "MaterialCheckBox.SavedState{", " CheckedState=", "}");
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeValue((Object)this.a);
    }
}

