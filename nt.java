/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

public final class nt
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(10);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public nt(IntentSender intentSender, Intent intent, int n2, int n3) {
        jse.e(intentSender, "intentSender");
        this.a = intentSender;
        this.b = intent;
        this.c = n2;
        this.d = n3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        jse.e(parcel, "dest");
        parcel.writeParcelable((Parcelable)this.a, n2);
        parcel.writeParcelable((Parcelable)this.b, n2);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}

