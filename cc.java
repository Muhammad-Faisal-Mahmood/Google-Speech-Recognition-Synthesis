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

public final class cc
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(4);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final String m;
    public final int n;
    public final boolean o;

    public cc(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int n2 = parcel.readInt();
        boolean bl2 = true;
        boolean bl3 = n2 != 0;
        this.c = bl3;
        bl3 = parcel.readInt() != 0;
        this.d = bl3;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        bl3 = parcel.readInt() != 0;
        this.h = bl3;
        bl3 = parcel.readInt() != 0;
        this.i = bl3;
        bl3 = parcel.readInt() != 0;
        this.j = bl3;
        bl3 = parcel.readInt() != 0;
        this.k = bl3;
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        bl3 = parcel.readInt() != 0 ? bl2 : false;
        this.o = bl3;
    }

    public cc(be be2) {
        this.a = be2.getClass().getName();
        this.b = be2.k;
        this.c = be2.u;
        this.d = be2.w;
        this.e = be2.E;
        this.f = be2.F;
        this.g = be2.G;
        this.h = be2.J;
        this.i = be2.r;
        this.j = be2.I;
        this.k = be2.H;
        this.l = be2.Y.ordinal();
        this.m = be2.n;
        this.n = be2.o;
        this.o = be2.R;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentState{");
        stringBuilder.append(this.a);
        stringBuilder.append(" (");
        stringBuilder.append(this.b);
        stringBuilder.append(")}:");
        if (this.c) {
            stringBuilder.append(" fromLayout");
        }
        if (this.d) {
            stringBuilder.append(" dynamicContainer");
        }
        if (this.f != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f));
        }
        if ((string = this.g) != null && !string.isEmpty()) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.g);
        }
        if (this.h) {
            stringBuilder.append(" retainInstance");
        }
        if (this.i) {
            stringBuilder.append(" removing");
        }
        if (this.j) {
            stringBuilder.append(" detached");
        }
        if (this.k) {
            stringBuilder.append(" hidden");
        }
        if (this.m != null) {
            stringBuilder.append(" targetWho=");
            stringBuilder.append(this.m);
            stringBuilder.append(" targetRequestCode=");
            stringBuilder.append(this.n);
        }
        if (this.o) {
            stringBuilder.append(" userVisibleHint");
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}

