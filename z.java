/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

final class z
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aa(1);
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;

    public z(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        boolean bl2 = parcel.readInt() != 0;
        this.n = bl2;
    }

    public z(y y2) {
        int n2 = y2.d.size();
        this.a = new int[n2 * 6];
        if (y2.j) {
            this.b = new ArrayList(n2);
            this.c = new int[n2];
            this.d = new int[n2];
            int n3 = 0;
            int n4 = 0;
            while (true) {
                int n5 = n4;
                if (n3 >= n2) break;
                cd cd2 = (cd)y2.d.get(n3);
                this.a[n5] = cd2.a;
                ArrayList arrayList = this.b;
                Object object = cd2.b;
                object = object != null ? ((be)object).k : null;
                arrayList.add(object);
                object = this.a;
                object[n5 + 1] = cd2.c;
                object[n5 + 2] = cd2.d;
                object[n5 + 3] = cd2.e;
                object[n5 + 4] = cd2.f;
                n4 = n5 + 6;
                object[n5 + 5] = cd2.g;
                this.c[n3] = cd2.h.ordinal();
                this.d[n3] = cd2.i.ordinal();
                ++n3;
            }
            this.e = y2.i;
            this.f = y2.l;
            this.g = y2.c;
            this.h = y2.m;
            this.i = y2.n;
            this.j = y2.o;
            this.k = y2.p;
            this.l = y2.q;
            this.m = y2.r;
            this.n = y2.s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList((List)this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel((CharSequence)this.i, (Parcel)parcel, (int)0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel((CharSequence)this.k, (Parcel)parcel, (int)0);
        parcel.writeStringList((List)this.l);
        parcel.writeStringList((List)this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }
}

