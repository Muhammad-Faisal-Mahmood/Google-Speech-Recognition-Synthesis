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

public abstract class ddr
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new chy(2);

    public static ddq j() {
        ddq ddq2 = new ddq();
        ddq2.b = null;
        ddq2.d(0);
        ddq2.c(0);
        ddq2.f(0);
        ddq2.b(0);
        ddq2.g(0);
        ddq2.e(ddm.a);
        return ddq2;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public final int describeContents() {
        return 0;
    }

    public abstract int e();

    public abstract ddm f();

    public abstract gzx g();

    public abstract String h();

    public abstract String i();

    public String toString() {
        gtn gtn2 = new gtn("");
        gtn2.d();
        gtn2.b("url", this.i());
        gtn2.b("const", dec.a(this.c(), this.b(), this.d(), this.a()));
        gtn2.b("flags", dec.i(this.e()));
        gtn2.b("scheme", this.h());
        gtn2.b("val", this.g());
        gtn2.e("extras", this.f().b().size());
        return gtn2.toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.i());
        parcel.writeString(this.h());
        parcel.writeInt(this.c());
        parcel.writeInt(this.b());
        parcel.writeInt(this.d());
        parcel.writeInt(this.a());
        parcel.writeInt(this.e());
        parcel.writeStringList((List)this.g());
    }
}

