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

public final class fto
extends yq {
    public static final Parcelable.Creator CREATOR = new fui(1);
    public boolean a;
    public boolean b;
    public int e;
    public float f;
    public boolean g;

    public fto(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        byte by2 = parcel.readByte();
        boolean bl2 = true;
        boolean bl3 = by2 != 0;
        this.a = bl3;
        bl3 = parcel.readByte() != 0;
        this.b = bl3;
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        bl3 = parcel.readByte() != 0 ? bl2 : false;
        this.g = bl3;
    }

    public fto(Parcelable parcelable) {
        super(parcelable);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeByte((byte)(this.a ? 1 : 0));
        parcel.writeByte((byte)(this.b ? 1 : 0));
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeByte((byte)(this.g ? 1 : 0));
    }
}

