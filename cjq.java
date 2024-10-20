/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;

public final class cjq
extends cgk {
    public static final Parcelable.Creator CREATOR = new cho(6);
    public final String a;
    public final String b;
    public final cjp c;
    public final boolean d;

    public cjq(String string, String string2, cjp cjp2, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.c = cjp2;
        this.d = bl2;
    }

    final void a(StringBuilder stringBuilder) {
        stringBuilder.append("FlagOverride(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        this.c.a(stringBuilder);
        stringBuilder.append(", ");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof cjq)) {
            return false;
        }
        object = (cjq)object;
        return a.k(this.a, ((cjq)object).a) && a.k(this.b, ((cjq)object).b) && a.k(this.c, ((cjq)object).c) && this.d == ((cjq)object).d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = kl.u(parcel);
        kl.K(parcel, 2, this.a);
        kl.K(parcel, 3, this.b);
        kl.J(parcel, 4, this.c, n2);
        kl.x(parcel, 5, this.d);
        kl.w(parcel, n3);
    }
}

