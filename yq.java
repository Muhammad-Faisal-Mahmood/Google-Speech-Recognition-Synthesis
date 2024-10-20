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

public class yq
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final yq c;
    public final Parcelable d;

    static {
        c = new yp();
        CREATOR = new ky(4);
    }

    public yq() {
        this.d = null;
    }

    protected yq(Parcel object, ClassLoader classLoader) {
        classLoader = object.readParcelable(classLoader);
        object = classLoader;
        if (classLoader == null) {
            object = c;
        }
        this.d = object;
    }

    protected yq(Parcelable parcelable) {
        if (parcelable != null) {
            Parcelable parcelable2 = parcelable;
            if (parcelable == c) {
                parcelable2 = null;
            }
            this.d = parcelable2;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelable(this.d, n2);
    }
}

