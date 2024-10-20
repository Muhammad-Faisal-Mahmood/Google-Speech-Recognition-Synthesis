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
import java.util.Collection;

public abstract class dbx
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cho(19);

    public static dbw f() {
        dbw dbw2 = new dbw();
        dbw2.e(0);
        int n2 = gzx.d;
        dbw2.c(hct.a);
        return dbw2;
    }

    public abstract int a();

    public abstract hac b();

    public abstract String c();

    public ddm d() {
        throw null;
    }

    public final int describeContents() {
        return 0;
    }

    public ded e() {
        throw null;
    }

    public final boolean equals(Object object) {
        block7: {
            boolean bl2;
            block6: {
                block5: {
                    if (this == object) {
                        return true;
                    }
                    boolean bl3 = object instanceof dbx;
                    bl2 = false;
                    if (!bl3) {
                        return false;
                    }
                    object = (dbx)object;
                    ded ded2 = this.e();
                    if (ded2 == null) break block5;
                    bl2 = ded2.equals(((dbx)object).e());
                    break block6;
                }
                if (((dbx)object).e() == null) break block7;
            }
            return bl2;
        }
        return true;
    }

    public final den g(String string) {
        Object object = (den)this.b().get(string);
        if (object != null) {
            return object;
        }
        object = (den)this.b().get(den.q(string));
        if (object != null) {
            object = ((den)object).f();
            ((dem)object).k(string);
            return ((dem)object).a();
        }
        String string2 = ((Object)this).toString();
        object = new StringBuilder("Pack ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" is not part of manifest ");
        ((StringBuilder)object).append(string2);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public final Collection h() {
        return this.b().g();
    }

    public final int hashCode() {
        ded ded2 = this.e();
        if (ded2 != null) {
            return ded2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.e().toString();
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.c());
        parcel.writeInt(this.a());
        parcel.writeParcelableArray((Parcelable[])this.h().toArray(new den[0]), n2);
    }
}

