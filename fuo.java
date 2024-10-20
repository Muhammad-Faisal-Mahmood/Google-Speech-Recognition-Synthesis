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

public final class fuo
extends yq {
    public static final Parcelable.Creator CREATOR = new fui(2);
    boolean a;

    public fuo(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            this.getClass().getClassLoader();
        }
        int n2 = parcel.readInt();
        boolean bl2 = true;
        if (n2 != 1) {
            bl2 = false;
        }
        this.a = bl2;
    }

    public fuo(Parcelable parcelable) {
        super(parcelable);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeInt(this.a ? 1 : 0);
    }
}

