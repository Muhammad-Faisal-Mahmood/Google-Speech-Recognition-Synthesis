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
import java.util.List;

public final class lq
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(8);
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public List g;
    public boolean h;
    public boolean i;
    public boolean j;

    public lq() {
    }

    public lq(Parcel parcel) {
        int[] nArray;
        int n2;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = n2 = parcel.readInt();
        if (n2 > 0) {
            nArray = new int[n2];
            this.d = nArray;
            parcel.readIntArray(nArray);
        }
        this.e = n2 = parcel.readInt();
        if (n2 > 0) {
            nArray = new int[n2];
            this.f = nArray;
            parcel.readIntArray(nArray);
        }
        n2 = parcel.readInt();
        boolean bl2 = false;
        boolean bl3 = n2 == 1;
        this.h = bl3;
        bl3 = parcel.readInt() == 1;
        this.i = bl3;
        bl3 = bl2;
        if (parcel.readInt() == 1) {
            bl3 = true;
        }
        this.j = bl3;
        this.g = parcel.readArrayList(lp.class.getClassLoader());
    }

    public lq(lq lq2) {
        this.c = lq2.c;
        this.a = lq2.a;
        this.b = lq2.b;
        this.d = lq2.d;
        this.e = lq2.e;
        this.f = lq2.f;
        this.h = lq2.h;
        this.i = lq2.i;
        this.j = lq2.j;
        this.g = lq2.g;
    }

    public final void a() {
        this.d = null;
        this.c = 0;
        this.a = -1;
        this.b = -1;
    }

    public final void b() {
        this.d = null;
        this.c = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeList(this.g);
    }
}

