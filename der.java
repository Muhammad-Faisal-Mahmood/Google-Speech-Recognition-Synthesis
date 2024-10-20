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

public abstract class der
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new chy(5);

    public static deq g() {
        deq deq2 = new deq();
        deq2.g(0);
        deq2.d(0);
        deq2.c(0);
        deq2.e(0);
        deq2.b(0);
        return deq2;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public final int describeContents() {
        return 0;
    }

    public abstract int e();

    public abstract den f();

    public final String h(boolean bl2, boolean bl3) {
        Object object;
        int n2;
        String string;
        Object object2;
        block7: {
            int n3;
            int n4;
            int n5;
            block4: {
                int n6;
                int n7;
                block5: {
                    block6: {
                        object2 = this.f().o();
                        object2 = bl2 ? ((ddn)object2).f(bl3) : (bl3 ? ((ddn)object2).toString() : ((dco)object2).b);
                        n7 = this.c();
                        int n8 = this.b();
                        n6 = this.d();
                        n5 = this.a();
                        string = null;
                        n2 = n8;
                        n4 = n6;
                        n3 = n7;
                        if (n7 != 0) break block4;
                        n7 = 0;
                        n2 = n8;
                        n4 = n6;
                        n3 = n7;
                        if (n8 != 0) break block4;
                        if (n6 != 0) break block5;
                        if (n5 == 0) break block6;
                        n2 = 0;
                        n4 = 0;
                        n3 = n7;
                        break block4;
                    }
                    object = null;
                    break block7;
                }
                n2 = 0;
                n3 = n7;
                n4 = n6;
            }
            object = dec.a(n3, n2, n4, n5);
        }
        n2 = this.e();
        if (n2 != 0) {
            string = dec.i(n2);
        }
        if (object == null && string == null) {
            return object2;
        }
        String string2 = "{".concat(String.valueOf(object2));
        object2 = string2;
        if (object != null) {
            object2 = a.ao((String)object, string2, ", ");
        }
        object = object2;
        if (string != null) {
            object = a.ao(string, (String)object2, ", ");
        }
        return ((String)object).concat("}");
    }

    public String toString() {
        return this.h(false, true);
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelable((Parcelable)this.f(), n2);
        parcel.writeInt(this.c());
        parcel.writeInt(this.b());
        parcel.writeInt(this.d());
        parcel.writeInt(this.a());
        parcel.writeInt(this.e());
    }
}

