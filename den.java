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
import java.util.Date;
import java.util.List;

public abstract class den
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final gzx o;
    public static final Date p;
    public static final dly q;

    static {
        dly dly2;
        q = dly2 = new dly(null);
        o = gzx.q(dly2);
        p = new Date(Long.MAX_VALUE);
        CREATOR = new chy(4);
    }

    public static dem p() {
        dem dem2 = new dem();
        dem2.m(0L);
        dem2.g(0L);
        dem2.j(0);
        dem2.h(0);
        dem2.n(true);
        dem2.i(p);
        return dem2;
    }

    public static String q(String object) {
        object = guf.c("_").g((CharSequence)object);
        String string = (String)object.get(0);
        object = object.size() > 1 ? (String)object.get(1) : null;
        string = (String)guf.c("-").g(string).get(0);
        if (object != null) {
            return a.ao((String)object, string, "_");
        }
        return string;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    public final int describeContents() {
        return 0;
    }

    public abstract ded e();

    public final boolean equals(Object object) {
        block7: {
            boolean bl2;
            block6: {
                block5: {
                    if (this == object) {
                        return true;
                    }
                    boolean bl3 = object instanceof den;
                    bl2 = false;
                    if (!bl3) {
                        return false;
                    }
                    object = (den)object;
                    if (this.o() == null) break block5;
                    bl2 = this.o().equals(((den)object).o());
                    break block6;
                }
                if (((den)object).o() == null) break block7;
            }
            return bl2;
        }
        return true;
    }

    public abstract dem f();

    public abstract gzx g();

    public abstract gzx h();

    public final int hashCode() {
        if (this.o() != null) {
            return this.o().hashCode();
        }
        return 0;
    }

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract Date l();

    public abstract boolean m();

    public ddm n() {
        throw null;
    }

    public ddn o() {
        throw null;
    }

    public final String toString() {
        return this.i();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelable((Parcelable)this.e(), n2);
        parcel.writeString(this.j());
        parcel.writeString(this.i());
        parcel.writeLong(this.d());
        parcel.writeLong(this.c());
        parcel.writeInt(this.b());
        parcel.writeInt(this.a());
        parcel.writeStringList((List)this.g());
        parcel.writeStringList((List)this.h());
        parcel.writeString(this.k());
        parcel.writeLong(this.l().getTime());
        parcel.writeString(this.n().d("label"));
    }
}

