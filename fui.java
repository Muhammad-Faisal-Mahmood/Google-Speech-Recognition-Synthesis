/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$ClassLoaderCreator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class fui
implements Parcelable.ClassLoaderCreator {
    private final int a;

    public fui(int n2) {
        this.a = n2;
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return new fye(parcel, null);
                    }
                    return new fwc(parcel, null);
                }
                return new fuo(parcel, null);
            }
            return new fto(parcel, null);
        }
        return new fuj(parcel, null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return new fye(parcel, classLoader);
                    }
                    return new fwc(parcel, classLoader);
                }
                return new fuo(parcel, classLoader);
            }
            return new fto(parcel, classLoader);
        }
        return new fuj(parcel, classLoader);
    }

    public final /* synthetic */ Object[] newArray(int n2) {
        int n3 = this.a;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        return new fye[n2];
                    }
                    return new fwc[n2];
                }
                return new fuo[n2];
            }
            return new fto[n2];
        }
        return new fuj[n2];
    }
}

