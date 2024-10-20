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
import java.util.Arrays;

public final class cjh
extends cgk
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cgi(20);
    public final String a;
    public final Integer b;
    public final Integer c;

    public cjh(String string, Integer n2, Integer n3) {
        this.a = string;
        this.b = n2;
        this.c = n3;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof cjh)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (cjh)object;
        return a.k(this.a, ((cjh)object).a) && a.k(this.b, ((cjh)object).b) && a.k(this.c, ((cjh)object).c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 2, string);
        kl.H(parcel, 3, this.b);
        kl.H(parcel, 4, this.c);
        kl.w(parcel, n2);
    }
}

