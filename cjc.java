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

public final class cjc
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(14);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;

    public cjc(String string, int n2, int n3, String string2, String string3, int n4, long l2) {
        this.b = n2;
        this.a = string;
        this.c = n3;
        this.d = string2;
        this.e = string3;
        this.f = n4;
        this.g = l2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cjc)) {
            return false;
        }
        object = (cjc)object;
        return this.b == ((cjc)object).b && this.c == ((cjc)object).c && a.k(this.d, ((cjc)object).d) && a.k(this.a, ((cjc)object).a) && a.k(this.e, ((cjc)object).e) && this.f == ((cjc)object).f && this.g == ((cjc)object).g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 1, string);
        kl.A(parcel, 2, this.b);
        kl.A(parcel, 3, this.c);
        kl.K(parcel, 4, this.d);
        kl.K(parcel, 5, this.e);
        kl.A(parcel, 6, this.f);
        kl.B(parcel, 7, this.g);
        kl.w(parcel, n2);
    }
}

