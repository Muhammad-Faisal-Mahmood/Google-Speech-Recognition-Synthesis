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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class asj
extends asm {
    public static final Parcelable.Creator CREATOR = new aqo(11);
    public Set a;

    public asj(Parcel parcel) {
        super(parcel);
        int n2 = parcel.readInt();
        this.a = new HashSet();
        String[] stringArray = new String[n2];
        parcel.readStringArray(stringArray);
        Collections.addAll(this.a, stringArray);
    }

    public asj(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        super.writeToParcel(parcel, n2);
        parcel.writeInt(this.a.size());
        Set set = this.a;
        parcel.writeStringArray(set.toArray(new String[set.size()]));
    }
}

