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
import java.util.Comparator;
import java.util.List;

public abstract class dcm
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cho(20);
    public static final Comparator a = new dfs(1);

    public static gzx h(Parcelable[] parcelableArray) {
        if (parcelableArray == null) {
            int n2 = gzx.d;
            return hct.a;
        }
        gzs gzs2 = new gzs();
        for (int i2 = 0; i2 < parcelableArray.length; ++i2) {
            gzs2.h((den)parcelableArray[i2]);
        }
        return gzs2.g();
    }

    public static final String i(List list) {
        return dec.f(list, new cxc(11));
    }

    public abstract gzx a();

    public abstract gzx b();

    public abstract gzx c();

    public abstract gzx d();

    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract byte[] g();

    public String toString() {
        gtn gtn2 = new gtn("");
        gtn2.b("old", this.c());
        gtn2.b("new", this.b());
        boolean bl2 = this.g() != null;
        gtn2.g("metadata", bl2);
        gtn2.g("last batch", this.f());
        return gtn2.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelableArray((Parcelable[])((den[])this.c().toArray(new den[0])), n2);
        parcel.writeParcelableArray((Parcelable[])((den[])this.b().toArray(new den[0])), n2);
        parcel.writeParcelableArray((Parcelable[])((den[])this.a().toArray(new den[0])), n2);
        parcel.writeParcelableArray((Parcelable[])((den[])this.d().toArray(new den[0])), n2);
        parcel.writeInt(this.e() ? 1 : 0);
        parcel.writeInt(this.f() ? 1 : 0);
        parcel.writeByteArray(this.g());
    }
}

