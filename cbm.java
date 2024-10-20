/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

public final class cbm
extends cgk {
    public static final Parcelable.Creator CREATOR = new caw(7);
    public final String a;
    @Deprecated
    public final int b;
    private final long c;

    public cbm(String string, int n2, long l2) {
        this.a = string;
        this.b = n2;
        this.c = l2;
    }

    public cbm(String string, long l2) {
        this.a = string;
        this.c = l2;
        this.b = -1;
    }

    public final long a() {
        long l2;
        long l3 = l2 = this.c;
        if (l2 == -1L) {
            l3 = this.b;
        }
        return l3;
    }

    public final boolean equals(Object object) {
        if (object instanceof cbm) {
            cbm cbm2 = (cbm)object;
            object = this.a;
            if ((object != null && ((String)object).equals(cbm2.a) || this.a == null && cbm2.a == null) && this.a() == cbm2.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.a()});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kl.aw("name", this.a, arrayList);
        kl.aw("version", this.a(), arrayList);
        return kl.av(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        String string = this.a;
        n2 = kl.u(parcel);
        kl.K(parcel, 1, string);
        kl.A(parcel, 2, this.b);
        kl.B(parcel, 3, this.a());
        kl.w(parcel, n2);
    }
}

