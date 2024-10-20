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
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class fuj
extends yq {
    public static final Parcelable.Creator CREATOR = new fui(0);
    public final int a;
    public final int b;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public fuj(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        int n2 = parcel.readInt();
        boolean bl2 = false;
        boolean bl3 = n2 == 1;
        this.e = bl3;
        bl3 = parcel.readInt() == 1;
        this.f = bl3;
        bl3 = bl2;
        if (parcel.readInt() == 1) {
            bl3 = true;
        }
        this.g = bl3;
    }

    public fuj(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.a = bottomSheetBehavior.w;
        this.b = bottomSheetBehavior.c;
        this.e = bottomSheetBehavior.a;
        this.f = bottomSheetBehavior.t;
        this.g = bottomSheetBehavior.u;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}

