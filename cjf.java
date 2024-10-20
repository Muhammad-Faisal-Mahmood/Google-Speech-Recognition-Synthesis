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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cjf
extends cgk
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cgi(17);
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final cjg f;
    private final List g;
    private List h;

    public cjf(String string, Long l2, List list, String string2, Long l3, Long l4, cjg cjg2) {
        this.a = string;
        this.b = l2;
        this.g = list;
        this.c = string2;
        this.d = l3;
        this.e = l4;
        this.f = cjg2;
    }

    public final List a() {
        Object object;
        if (this.h == null && (object = this.g) != null) {
            this.h = new ArrayList(object.size());
            for (cjh cjh2 : this.g) {
                this.h.add(cjh2);
            }
        }
        return this.h;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof cjf)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (cjf)object;
        return a.k(this.a, ((cjf)object).a) && a.k(this.b, ((cjf)object).b) && a.k(this.a(), ((cjf)object).a()) && a.k(this.c, ((cjf)object).c) && a.k(this.d, ((cjf)object).d) && a.k(this.e, ((cjf)object).e) && a.k(this.f, ((cjf)object).f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.a(), this.c, this.d, this.e, this.f});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        int n3 = kl.u(parcel);
        kl.K(parcel, 2, string);
        kl.O(parcel, 3, this.a());
        kl.K(parcel, 4, this.c);
        kl.I(parcel, 5, this.d);
        kl.I(parcel, 6, this.e);
        kl.I(parcel, 7, this.b);
        kl.J(parcel, 8, this.f, n2);
        kl.w(parcel, n3);
    }
}

