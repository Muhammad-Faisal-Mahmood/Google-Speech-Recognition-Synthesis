/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cjs
extends cgk
implements Comparable {
    public static final Parcelable.Creator CREATOR = new cho(8);
    public final int a;
    public final int b;

    public cjs(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public final int a(cjs cjs2) {
        int n2 = this.a;
        int n3 = cjs2.a;
        if (n2 < n3) {
            return -1;
        }
        if (n2 > n3) {
            return 1;
        }
        n3 = this.b;
        n2 = cjs2.b;
        if (n3 < n2) {
            return -1;
        }
        if (n3 > n2) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object object) {
        return object instanceof cjs && this.a((cjs)object) == 0;
    }

    public final int hashCode() {
        return this.a * 31 + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GenericDimension(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.A(parcel, 1, this.a);
        kl.A(parcel, 2, this.b);
        kl.w(parcel, n2);
    }
}

