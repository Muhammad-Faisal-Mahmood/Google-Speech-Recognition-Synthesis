/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class nk
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(9);
    public final int a;
    public final Intent b;

    public nk(int n2, Intent intent) {
        this.a = n2;
        this.b = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ActivityResult{resultCode=");
        int n2 = this.a;
        String string = n2 != -1 ? (n2 != 0 ? String.valueOf(n2) : "RESULT_CANCELED") : "RESULT_OK";
        stringBuilder.append(string);
        stringBuilder.append(", data=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        jse.e(parcel, "dest");
        parcel.writeInt(this.a);
        int n3 = this.b == null ? 0 : 1;
        parcel.writeInt(n3);
        Intent intent = this.b;
        if (intent != null) {
            intent.writeToParcel(parcel, n2);
        }
    }
}

