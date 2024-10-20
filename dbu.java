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

public abstract class dbu
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final dbu d;

    static {
        dbt dbt2 = dbu.e();
        dbt2.c(true);
        dbt2.a = null;
        d = dbt2.a();
        CREATOR = new cho(18);
    }

    public static dbt e() {
        dbt dbt2 = new dbt();
        dbt2.c(true);
        return dbt2;
    }

    public abstract gzx a();

    public abstract boolean b();

    public abstract byte[] c();

    public gzx d() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public String toString() {
        gtn gtn2 = new gtn("");
        gtn2.b("slices", this.a());
        gtn2.g("last batch", this.b());
        boolean bl2 = this.c() != null;
        gtn2.g("sync metadata", bl2);
        return gtn2.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelableArray((Parcelable[])((der[])this.a().toArray(new der[0])), n2);
        parcel.writeInt(this.b() ? 1 : 0);
        parcel.writeByteArray(this.c());
    }
}

