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

public final class fye
extends yq {
    public static final Parcelable.Creator CREATOR = new fui(4);
    public final pa a;

    public fye(Parcel parcel, ClassLoader stringArray) {
        super(parcel, (ClassLoader)stringArray);
        int n2 = parcel.readInt();
        stringArray = new String[n2];
        parcel.readStringArray(stringArray);
        Object[] objectArray = new Bundle[n2];
        parcel.readTypedArray(objectArray, Bundle.CREATOR);
        this.a = new pa(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a.put(stringArray[i2], objectArray[i2]);
        }
    }

    public fye(Parcelable parcelable) {
        super(parcelable);
        this.a = new pa();
    }

    public final String toString() {
        String string = Integer.toHexString(System.identityHashCode(this));
        String string2 = ((Object)this.a).toString();
        StringBuilder stringBuilder = new StringBuilder("ExtendableSavedState{");
        stringBuilder.append(string);
        stringBuilder.append(" states=");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        int n3 = this.a.f;
        parcel.writeInt(n3);
        String[] stringArray = new String[n3];
        Bundle[] bundleArray = new Bundle[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            stringArray[n2] = (String)this.a.d(n2);
            bundleArray[n2] = (Bundle)this.a.g(n2);
        }
        parcel.writeStringArray(stringArray);
        parcel.writeTypedArray((Parcelable[])bundleArray, 0);
    }
}

