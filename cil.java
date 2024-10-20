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

public final class cil
extends cgk {
    public static final Parcelable.Creator CREATOR = new cgi(6);
    public final String a;
    public final String b;
    private final cij c;
    private final cik d;

    public cil(String object, String object2, int n2, int n3) {
        this.a = object;
        this.b = object2;
        Object var5_5 = null;
        switch (n2) {
            default: {
                object = null;
                break;
            }
            case 9: {
                object = cij.j;
                break;
            }
            case 8: {
                object = cij.i;
                break;
            }
            case 7: {
                object = cij.h;
                break;
            }
            case 6: {
                object = cij.g;
                break;
            }
            case 5: {
                object = cij.f;
                break;
            }
            case 4: {
                object = cij.e;
                break;
            }
            case 3: {
                object = cij.d;
                break;
            }
            case 2: {
                object = cij.c;
                break;
            }
            case 1: {
                object = cij.b;
                break;
            }
            case 0: {
                object = cij.a;
            }
        }
        object2 = object;
        if (object == null) {
            object2 = cij.a;
        }
        this.c = object2;
        object = n3 != 0 ? (n3 != 1 ? (n3 != 2 ? (n3 != 3 ? (n3 != 4 ? (n3 != 5 ? var5_5 : cik.f) : cik.e) : cik.d) : cik.c) : cik.b) : cik.a;
        object2 = object;
        if (object == null) {
            object2 = cik.a;
        }
        this.d = object2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (cil)object;
            if (a.k(this.a, ((cil)object).a) && a.k(this.b, ((cil)object).b) && this.c == ((cil)object).c && this.d == ((cil)object).d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("accountType", this.a);
        gtn2.b("dataSet", this.b);
        gtn2.b("category", this.c);
        gtn2.b("matchTag", this.d);
        return gtn2.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 1, string);
        kl.K(parcel, 2, this.b);
        kl.A(parcel, 3, this.c.k);
        kl.A(parcel, 4, this.d.g);
        kl.w(parcel, n2);
    }
}

