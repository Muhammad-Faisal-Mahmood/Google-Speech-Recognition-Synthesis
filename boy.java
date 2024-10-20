/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

public final class boy
extends cgk {
    public static final Parcelable.Creator CREATOR = new aqo(16);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public boy(String string, String string2, int n2, int n3, int n4, int n5) {
        this.a = string;
        this.b = string2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof boy)) {
            return false;
        }
        object = (boy)object;
        return this.c == ((boy)object).c && this.d == ((boy)object).d && Objects.equals(this.a, ((boy)object).a) && this.e == ((boy)object).e && this.f == ((boy)object).f;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.d, this.e, this.f);
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("name", this.a);
        gtn2.b("modelName", this.b);
        gtn2.e("type", this.c);
        gtn2.e("variant", this.d);
        gtn2.e("id", this.e);
        gtn2.e("version", this.f);
        return gtn2.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 1, string);
        kl.K(parcel, 2, this.b);
        kl.A(parcel, 3, this.c);
        kl.A(parcel, 4, this.d);
        kl.A(parcel, 5, this.e);
        kl.A(parcel, 6, this.f);
        kl.w(parcel, n2);
    }
}

