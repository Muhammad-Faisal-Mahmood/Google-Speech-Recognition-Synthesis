/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class ky
implements Parcelable.ClassLoaderCreator {
    private final int a;

    public ky(int n2) {
        this.a = n2;
    }

    public static final yq a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return yq.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return new azz(parcel, null);
                        }
                        return ky.a(parcel, null);
                    }
                    return new sb(parcel, null);
                }
                return new mb(parcel, null);
            }
            return new bd(parcel, null);
        }
        return new kz(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return new azz(parcel, classLoader);
                        }
                        return ky.a(parcel, classLoader);
                    }
                    return new sb(parcel, classLoader);
                }
                return new mb(parcel, classLoader);
            }
            return new bd(parcel, classLoader);
        }
        return new kz(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        int n3 = this.a;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 4) {
                            return new azz[n2];
                        }
                        return new yq[n2];
                    }
                    return new sb[n2];
                }
                return new mb[n2];
            }
            return new bd[n2];
        }
        return new kz[n2];
    }
}

