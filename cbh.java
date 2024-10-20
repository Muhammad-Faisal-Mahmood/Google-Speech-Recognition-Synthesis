/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class cbh
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(4);
    public final boolean a;

    public cbh(boolean bl2) {
        this.a = bl2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof cbh) {
            object = (cbh)object;
            if (this.a == ((cbh)object).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogVerifierResultParcelable[");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.x(parcel, 1, this.a);
        kl.w(parcel, n2);
    }
}

