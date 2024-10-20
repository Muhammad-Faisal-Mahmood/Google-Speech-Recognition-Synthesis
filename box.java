/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.BadParcelableException
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

public final class box {
    public static final int a = 0;
    private static final ClassLoader b = box.class.getClassLoader();

    private box() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int n2 = parcel.dataAvail();
        if (n2 <= 0) {
            return;
        }
        throw new BadParcelableException(a.af(n2, "Parcel data not fully consumed, unread size: "));
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static boolean d(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void e(Parcel parcel) {
        parcel.readArrayList(b);
    }
}

