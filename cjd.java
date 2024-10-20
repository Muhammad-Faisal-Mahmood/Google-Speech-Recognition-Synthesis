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

public final class cjd
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(15);
    public final int a;
    public final cje b;
    public final cjc c;

    public cjd(int n2, cje cje2, cjc cjc2) {
        this.a = n2;
        this.b = cje2;
        this.c = cjc2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (cjd)object;
            if (this.a == ((cjd)object).a && a.k(this.b, ((cjd)object).b) && a.k(this.c, ((cjd)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = this.a;
        int n4 = kl.u(parcel);
        kl.A(parcel, 1, n3);
        kl.J(parcel, 2, this.b, n2);
        kl.J(parcel, 3, this.c, n2);
        kl.w(parcel, n4);
    }
}

