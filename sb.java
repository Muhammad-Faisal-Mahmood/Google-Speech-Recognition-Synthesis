/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.SparseArray
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public final class sb
extends yq {
    public static final Parcelable.Creator CREATOR = new ky(3);
    public SparseArray a;

    public sb(Parcel parcelableArray, ClassLoader classLoader) {
        super((Parcel)parcelableArray, classLoader);
        int n2 = parcelableArray.readInt();
        int[] nArray = new int[n2];
        parcelableArray.readIntArray(nArray);
        parcelableArray = parcelableArray.readParcelableArray(classLoader);
        this.a = new SparseArray(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a.append(nArray[i2], (Object)parcelableArray[i2]);
        }
    }

    public sb(Parcelable parcelable) {
        super(parcelable);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        Object object = this.a;
        int n3 = object != null ? object.size() : 0;
        parcel.writeInt(n3);
        object = new int[n3];
        Parcelable[] parcelableArray = new Parcelable[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            object[i2] = (SparseArray)this.a.keyAt(i2);
            parcelableArray[i2] = (Parcelable)this.a.valueAt(i2);
        }
        parcel.writeIntArray((int[])object);
        parcel.writeParcelableArray(parcelableArray, n2);
    }
}

