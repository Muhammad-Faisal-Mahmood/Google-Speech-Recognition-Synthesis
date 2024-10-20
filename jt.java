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

public final class jt
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(6);
    public int a;
    public int b;
    public boolean c;

    public jt() {
    }

    public jt(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        int n2 = parcel.readInt();
        boolean bl2 = true;
        if (n2 != 1) {
            bl2 = false;
        }
        this.c = bl2;
    }

    public jt(jt jt2) {
        this.a = jt2.a;
        this.b = jt2.b;
        this.c = jt2.c;
    }

    public final void a() {
        this.a = -1;
    }

    public final boolean b() {
        return this.a >= 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}

