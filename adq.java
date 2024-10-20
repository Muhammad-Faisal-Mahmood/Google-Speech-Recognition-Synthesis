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
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;

public final class adq
implements Comparator,
Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(12);
    public final String a;
    public final int b;
    private final adp[] c;
    private int d;

    public adq(Parcel adpArray) {
        this.a = adpArray.readString();
        adpArray = (adp[])adpArray.createTypedArray(adp.CREATOR);
        int n2 = agf.a;
        this.c = adpArray;
        this.b = adpArray.length;
    }

    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (adq)object;
            if (Objects.equals(this.a, ((adq)object).a) && Arrays.equals(this.c, ((adq)object).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.d;
        if (n2 == 0) {
            String string = this.a;
            n3 = string == null ? 0 : string.hashCode();
            this.d = n3 = n3 * 31 + Arrays.hashCode(this.c);
        }
        return n3;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeTypedArray((Parcelable[])this.c, 0);
    }
}

