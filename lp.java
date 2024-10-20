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
import java.util.Arrays;

public final class lp
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(7);
    public int a;
    int b;
    int[] c;
    boolean d;

    lp() {
    }

    public lp(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        int n2 = parcel.readInt();
        boolean bl2 = true;
        if (n2 != 1) {
            bl2 = false;
        }
        this.d = bl2;
        n2 = parcel.readInt();
        if (n2 > 0) {
            int[] nArray = new int[n2];
            this.c = nArray;
            parcel.readIntArray(nArray);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FullSpanItem{mPosition=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mGapDir=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mHasUnwantedGapAfter=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mGapPerSpan=");
        stringBuilder.append(Arrays.toString(this.c));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] nArray = this.c;
        if (nArray != null) {
            parcel.writeInt(nArray.length);
            parcel.writeIntArray(this.c);
            return;
        }
        parcel.writeInt(0);
    }
}

