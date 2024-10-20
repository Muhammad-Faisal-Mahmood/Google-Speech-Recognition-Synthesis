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
import java.util.List;

public final class clf
extends cgk {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    static {
        new clf(null, false, false);
        CREATOR = new cho(14);
    }

    public clf(List arrayList, boolean bl2, boolean bl3) {
        arrayList = arrayList == null ? new ArrayList(0) : new ArrayList(arrayList);
        this.c = arrayList;
        this.a = bl2;
        this.b = bl3;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof clf)) {
            return false;
        }
        object = (clf)object;
        return a.k(this.c, ((clf)object).c) && a.k(this.a, ((clf)object).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a});
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = kl.u(parcel);
        kl.O(parcel, 1, new ArrayList(this.c));
        kl.x(parcel, 2, this.a);
        kl.x(parcel, 3, this.b);
        kl.w(parcel, n2);
    }
}

