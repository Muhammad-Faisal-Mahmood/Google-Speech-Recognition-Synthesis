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

public final class aqn
extends aqs {
    public static final Parcelable.Creator CREATOR = new aqo(1);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final aqs[] e;

    public aqn(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int n2 = agf.a;
        this.a = string;
        int n3 = parcel.readByte();
        boolean bl2 = true;
        boolean bl3 = n3 != 0;
        this.b = bl3;
        bl3 = parcel.readByte() != 0 ? bl2 : false;
        this.c = bl3;
        this.d = parcel.createStringArray();
        n3 = parcel.readInt();
        this.e = new aqs[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.e[n2] = (aqs)parcel.readParcelable(aqs.class.getClassLoader());
        }
    }

    public aqn(String string, boolean bl2, boolean bl3, String[] stringArray, aqs[] aqsArray) {
        super("CTOC");
        this.a = string;
        this.b = bl2;
        this.c = bl3;
        this.d = stringArray;
        this.e = aqsArray;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (aqn)object;
            if (this.b == ((aqn)object).b && this.c == ((aqn)object).c && Objects.equals(this.a, ((aqn)object).a) && Arrays.equals(this.d, ((aqn)object).d) && Arrays.equals(this.e, ((aqn)object).e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String string = this.a;
        int n2 = string != null ? string.hashCode() : 0;
        return ((this.b + 527) * 31 + this.c) * 31 + n2;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeByte((byte)(this.b ? 1 : 0));
        parcel.writeByte((byte)(this.c ? 1 : 0));
        parcel.writeStringArray(this.d);
        parcel.writeInt(this.e.length);
        aqs[] aqsArray = this.e;
        int n3 = aqsArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            parcel.writeParcelable((Parcelable)aqsArray[n2], 0);
        }
    }
}

