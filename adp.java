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
import java.util.UUID;

public final class adp
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(13);
    public final UUID a;
    public final String b;
    public final String c;
    public final byte[] d;
    private int e;

    public adp(Parcel parcel) {
        this.a = new UUID(parcel.readLong(), parcel.readLong());
        this.b = parcel.readString();
        String string = parcel.readString();
        int n2 = agf.a;
        this.c = string;
        this.d = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof adp)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        object = (adp)object;
        return Objects.equals(this.b, ((adp)object).b) && Objects.equals(this.c, ((adp)object).c) && Objects.equals(this.a, ((adp)object).a) && Arrays.equals(this.d, ((adp)object).d);
    }

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.e;
        if (n2 == 0) {
            n2 = this.a.hashCode();
            String string = this.b;
            n3 = string == null ? 0 : string.hashCode();
            this.e = n3 = ((n2 * 31 + n3) * 31 + this.c.hashCode()) * 31 + Arrays.hashCode(this.d);
        }
        return n3;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeLong(this.a.getMostSignificantBits());
        parcel.writeLong(this.a.getLeastSignificantBits());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }
}

