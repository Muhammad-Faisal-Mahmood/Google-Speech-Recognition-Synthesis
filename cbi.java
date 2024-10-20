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

public final class cbi
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(5);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public cbi(String string, int n2, int n3, String string2, boolean bl2, String string3, boolean bl3, int n4, Integer n5, boolean bl4, int n6) {
        this.a = string;
        this.b = n2;
        this.c = n3;
        this.d = string2;
        this.e = bl2;
        this.f = string3;
        this.g = bl3;
        this.h = n4;
        this.i = n5;
        this.j = bl4;
        this.k = n6;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof cbi) {
            object = (cbi)object;
            if (a.k(this.a, ((cbi)object).a) && this.b == ((cbi)object).b && this.c == ((cbi)object).c && a.k(this.f, ((cbi)object).f) && a.k(this.d, ((cbi)object).d) && this.e == ((cbi)object).e && this.g == ((cbi)object).g && this.h == ((cbi)object).h && a.k(this.i, ((cbi)object).i) && this.j == ((cbi)object).j && this.k == ((cbi)object).k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.f, this.d, this.e, this.g, this.h, this.i, this.j, this.k});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayLoggerContext[package=");
        stringBuilder.append(this.a);
        stringBuilder.append(",packageVersionCode=");
        stringBuilder.append(this.b);
        stringBuilder.append(",logSource=");
        stringBuilder.append(this.c);
        stringBuilder.append(",logSourceName=");
        stringBuilder.append(this.f);
        stringBuilder.append(",uploadAccount=");
        stringBuilder.append(this.d);
        stringBuilder.append(",logAndroidId=");
        stringBuilder.append(this.e);
        stringBuilder.append(",isAnonymous=");
        stringBuilder.append(this.g);
        stringBuilder.append(",qosTier=");
        stringBuilder.append(this.h);
        stringBuilder.append(",appMobilespecId=");
        stringBuilder.append(this.i);
        stringBuilder.append(",scrubMccMnc=");
        stringBuilder.append(this.j);
        stringBuilder.append("piiLevelset=");
        stringBuilder.append(this.k);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.K(parcel, 2, this.a);
        kl.A(parcel, 3, this.b);
        kl.A(parcel, 4, this.c);
        kl.K(parcel, 5, this.d);
        kl.x(parcel, 7, this.e);
        kl.K(parcel, 8, this.f);
        kl.x(parcel, 9, this.g);
        kl.A(parcel, 10, this.h);
        kl.H(parcel, 11, this.i);
        kl.x(parcel, 12, this.j);
        kl.A(parcel, 13, this.k);
        kl.w(parcel, n2);
    }
}

